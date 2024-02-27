package lk.ijse.dto;

import lombok.*;

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
    private Date year;
    private double price;
    private String spec;
    private String supid;
    private Date date;
    private int qty;
    private String type;

}
