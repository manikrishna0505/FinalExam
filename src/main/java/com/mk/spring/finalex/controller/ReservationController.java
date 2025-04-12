package com.mk.spring.finalex.controller;

import com.mk.spring.finalex.model.Reservation;
import com.mk.spring.finalex.model.Customer;
import com.mk.spring.finalex.model.Payment;
import com.mk.spring.finalex.repository.ReservationRepository;
import com.mk.spring.finalex.repository.CustomerRepository;
import com.mk.spring.finalex.repository.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepo;

    @Autowired
    private CustomerRepository customerRepo;

    @Autowired
    private PaymentRepository paymentRepo;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation_form";
    }

    @PostMapping("/submitReservation")
    public String submitForm(@ModelAttribute Reservation reservation, Model model) {
        // Save reservation
        Reservation savedReservation = reservationRepo.save(reservation);

        // Create and save customer
        String fullName = reservation.getFirstName() + " " + reservation.getLastName();
        Customer customer = new Customer(fullName, savedReservation.getId());
        customerRepo.save(customer);

        // Create and save dummy payment
        Payment payment = new Payment(100.0, reservation.getDate());
        paymentRepo.save(payment);

        // Pass to success view
        model.addAttribute("reservation", reservation);
        model.addAttribute("customerName", fullName);
        model.addAttribute("paymentAmount", payment.getAmount());

        return "success";
    }
}
