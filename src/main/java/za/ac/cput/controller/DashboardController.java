package za.ac.cput.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import za.ac.cput.entity.GymSession;
import za.ac.cput.repository.GymSessionRepository;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DashboardController {
    @GetMapping("/dashboard")
    public String dashboard(
            HttpServletRequest request,
            Model model
    )
    {
        GymSession session = GymSessionRepository.getRepository().read(request.getRequestedSessionId());
        if(session != null)
            model.addAttribute("username", session.getUsername());
        return "dashboard";
    }
}