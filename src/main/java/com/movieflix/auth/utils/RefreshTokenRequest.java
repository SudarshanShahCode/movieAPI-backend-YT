package com.movieflix.auth.utils;

import lombok.Data;

@Data
public class RefreshTokenRequest {

    private String refreshToken;
}
