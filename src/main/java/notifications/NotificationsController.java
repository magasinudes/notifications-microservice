package notifications;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NotificationsController {

    @RequestMapping("/")
    public String index() {
        return "<h1>Notifications index!<h1>";
    }

    @RequestMapping("/health")
    public String health() {
        return "ok";
    }

}
