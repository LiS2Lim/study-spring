package com.li521lim.board.user;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class SiteUserController {

	private final SiteUserService siteUserService;
	
	@GetMapping("/signup")
	public String signup(SiteUserCreateForm SiteUserCreateForm) {
		return "signup_form";
	}
	
	@PostMapping("/signup")
    public String signup(@Valid SiteUserCreateForm siteUserCreateForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "signup_form";
        }

        if (!siteUserCreateForm.getPassword1().equals(siteUserCreateForm.getPassword2())) {
            bindingResult.rejectValue("password2", "passwordInCorrect", 
                    "Passwordが一致しません");
            return "signup_form";
        }

        try {
			siteUserService.create(siteUserCreateForm.getUsername(), 
					siteUserCreateForm.getEmail(), siteUserCreateForm.getPassword1());
        } catch(DataIntegrityViolationException e) {
        	e.printStackTrace();
        	bindingResult.reject("signupFailed", "IDまたはEmailがすでに登録されています");
        } catch(Exception e) {
        	e.printStackTrace();
        	bindingResult.reject("signupFailed", e.getMessage());
        	return "signup_form";
        }

        return "redirect:/";
    }
	
	@GetMapping("/login")
	public String login() {
		return "login_form";
	}

}
