package lk.ijse.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SuppliyerDto {
    private String nic;
    private String name;
    private String address;
    private String email;
    private String mobile;
    private String cName;
    private String pName;
    private String date;
    private int qty;

    public SuppliyerDto(String nic) {
        this.nic = nic;
    }
}
