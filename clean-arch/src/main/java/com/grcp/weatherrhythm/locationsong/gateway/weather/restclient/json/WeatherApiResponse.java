package com.grcp.weatherrhythm.locationsong.gateway.weather.restclient.json;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WeatherApiResponse {

    private WeatherMainResponse main;
    private WeatherErrorDetail errorDetail;
}
