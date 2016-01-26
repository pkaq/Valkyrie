package hcs.web.homepage.ctrl;

import hcs.core.rest.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class HomeCtrl {
    @RequestMapping("/guess")
    public Response guessUlike(){
        List list = new ArrayList<Map>();

        Map kfc = new HashMap<String,String>();
        kfc.put("title","假日美食，尽在肯德基");
        kfc.put("desc","手机结账立享8折优惠");

        list.add(kfc);

        Map bsk = new HashMap<String,String>();
        bsk.put("title","必胜客披萨");
        bsk.put("desc","买披萨 送果饮");

        list.add(bsk);

        Map dq = new HashMap<String,String>();
        dq.put("title","冰雪皇后");
        dq.put("desc","冬日心动，感受冰雪");

        list.add(dq);

        return new Response().success(list);
    }
}
