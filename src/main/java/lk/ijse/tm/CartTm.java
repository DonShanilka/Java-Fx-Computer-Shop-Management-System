package lk.ijse.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class CartTm {

    private String item_id;
    private String item_name;
    private String item_price;
    private String item_qty;
    private String total_price;
    private String discount;
    private String new_price;

    public CartTm(String item_id, String item_name, String item_price, String item_qty, String total_price, String discount, String new_price) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_price = item_price;
        this.item_qty = item_qty;
        this.total_price = total_price;
        this.discount = discount;
        this.new_price = new_price;
    }
}
