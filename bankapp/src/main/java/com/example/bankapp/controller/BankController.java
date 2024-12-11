package com.example.bankapp.controller;

import com.example.bankapp.model.Branch;
import com.example.bankapp.model.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class BankController {

    private final String bankName = "XYZ Bank";

    // Endpoint to show branches
    @GetMapping("/branches")
    public String showBranches(Model model) {
        List<Branch> branches = Arrays.asList(
                new Branch("MG Road Branch", "MG Road, Bangalore"),
                new Branch("Koramangala Branch", "Koramangala, Bangalore"),
                new Branch("Whitefield Branch", "Whitefield, Bangalore"),
                new Branch("Indiranagar Branch", "Indiranagar, Bangalore"),
                new Branch("Jayanagar Branch", "Jayanagar, Bangalore"),
                new Branch("Banashankari Branch", "Banashankari, Bangalore"),
                new Branch("RT Nagar Branch", "RT Nagar, Bangalore"),
                new Branch("Hebbal Branch", "Hebbal, Bangalore"),
                new Branch("Ulsoor Branch", "Ulsoor, Bangalore"),
                new Branch("Brigade Road Branch", "Brigade Road, Bangalore")
        );

        model.addAttribute("bankName", bankName);
        model.addAttribute("branches", branches);
        return "branches";
    }

    // Endpoint to show services
    @GetMapping("/services")
    public String showServices(Model model) {
        List<Service> services = Arrays.asList(
                new Service("ATM Service", "Access to ATM services 24/7"),
                new Service("Internet Banking", "Banking services online"),
                new Service("Home Loan", "Loans for purchasing homes"),
                new Service("Personal Loan", "Loans for personal needs"),
                new Service("Business Loan", "Loans for small and medium businesses"),
                new Service("Credit Cards", "Various credit card options"),
                new Service("Debit Cards", "Debit card for easy transactions"),
                new Service("Investment Services", "Investment advice and options"),
                new Service("Insurance", "Life and health insurance"),
                new Service("Mutual Funds", "Mutual fund investment opportunities")
        );

        model.addAttribute("bankName", bankName);
        model.addAttribute("services", services);
        return "services";
    }
}

