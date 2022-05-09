package domain;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FluctuationLate implements Serializable,Comparable<FluctuationLate> {
    private String sidoName;
    private String sigunguName;
    private String dongName;
    private float fluctuationLateData;
    private int population;
    private int price;
    @Override
    public int compareTo(FluctuationLate o) {
        if(this.fluctuationLateData>o.fluctuationLateData){
            return -1;
        }
        if(this.fluctuationLateData==o.fluctuationLateData){
            if(price>o.price){
                return -1;
            }
            else if(price==o.price){
                return 0;
            }
            else{
                return 1;
            }
        }
        return 1;
    }
}
