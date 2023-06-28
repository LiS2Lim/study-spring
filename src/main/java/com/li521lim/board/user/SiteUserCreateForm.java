package com.li521lim.board.user;

import jakarta.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SiteUserCreateForm {

	@Size(min = 3, max = 25)
    @NotEmpty(message = "IDは必須です")
    private String username;

    @NotEmpty(message = "Passwordは必須です")
    private String password1;

    @NotEmpty(message = "Password確認は必須です")
    private String password2;

    @NotEmpty(message = "Emailは必須です")
    @Email
    private String email;

}
