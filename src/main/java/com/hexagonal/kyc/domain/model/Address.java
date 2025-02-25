package com.hexagonal.kyc.domain.model;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@EqualsAndHashCode
public class Address {

    private String address1;
    private String address2;
    private String county;
    private String city;
    private String postCode;
    private String country;
}
