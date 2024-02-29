package lk.ijse.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ItemDto {

    private String id;
    private String brand;
    private String modelno;
    private String year;
    private double price;
    private String spec;
    private String supid;
    private Date date;
    private int qty;
    private String type;


    public ItemDto(String nic) {
        this.id = nic;
    }
}
