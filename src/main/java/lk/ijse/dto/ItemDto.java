package lk.ijse.dto;

import lombok.*;

import java.time.LocalDate;

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
    private LocalDate date;
    private int qty;
    private String type;

    public ItemDto(String id) {
        this.id = id;
    }
}
