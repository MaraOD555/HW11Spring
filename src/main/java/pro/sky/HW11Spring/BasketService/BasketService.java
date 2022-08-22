package pro.sky.HW11Spring.BasketService;

import org.springframework.stereotype.Service;
import pro.sky.HW11Spring.Component.Basket;
import pro.sky.HW11Spring.Items.Items;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BasketService {

    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public List<Items> add(List<Integer> itemIds) {
       return basket.add(
               itemIds.stream()
               .map(Items::new)
               .collect(Collectors.toList())
       );
    }
    public List<Items> get(){
        return basket.get();
    }

}
