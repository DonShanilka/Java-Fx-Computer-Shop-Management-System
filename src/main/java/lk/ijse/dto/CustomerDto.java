package lk.ijse.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CustomerDto {

    private String nic;
    private String name;
    private String address;
    private String mobile;
    private String date;
    private String paymentMethod;
    private String paymentType;
    private String amount;
    private String item_cat;
    private String product_name;

}
