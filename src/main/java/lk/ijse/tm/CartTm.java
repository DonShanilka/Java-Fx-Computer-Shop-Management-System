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

    public CartTm(String iCode, String des, double unitPrice, int qty, double discount, double total) {

        this.item_id = iCode;
        this.item_name = des;
        this.item_price = String.valueOf(unitPrice);
        this.item_qty = String.valueOf(qty);
        this.total_price = String.valueOf(total);
        this.discount = String.valueOf(discount);
        this.new_price = String.valueOf(total - discount);
    }
}
