package pro.sky.HW11Spring.BasketController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HW11Spring.BasketService.BasketService;
import pro.sky.HW11Spring.Items.Items;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    final private BasketService basketService;
    public BasketController (BasketService basketService) {
        this.basketService = basketService;
    }
    @GetMapping("/add")
    public List<Items> add(@RequestParam("itemId") List<Integer> itemIds) {
        return basketService.add(itemIds);
    }
    @GetMapping("/get")
    public List<Items> get(){
        return basketService.get();
    }
}
