package lk.ijse.dto;

import lombok.*;

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
    private String price;
    private String spec;
    private String supid;
    private String date;
    private String qty;
    private String type;

}
