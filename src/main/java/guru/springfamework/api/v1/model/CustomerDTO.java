package guru.springfamework.api.v1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
     private long id;
     private String firstname;
     private String lastname;

     private String customerUrl;
}
