package com.abc.app.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* DTO for Delivery partner during delivery time , information available over product*/

// that package may contains multiple DTO 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDeliveryDTO {

	private String customerName;
	private long phone;
	private String address;
}
