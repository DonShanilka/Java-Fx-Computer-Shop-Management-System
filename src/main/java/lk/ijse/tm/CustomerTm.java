package lk.ijse.tm;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CustomerTm {

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
