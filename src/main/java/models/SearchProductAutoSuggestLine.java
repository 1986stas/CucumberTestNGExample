package models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchProductAutoSuggestLine {
    private String imgLink;
    private String productName;
    private String oldPrice;
    private String price;
}
