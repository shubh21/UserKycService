package com.hexagonal.kyc.domain.model;


import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@EqualsAndHashCode
public class User {
    private String userId;
    private String fname;
    private String sname;
    private String email;
    private String contactNumber;
    private Address address;
}
