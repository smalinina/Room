package talks.room.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import talks.room.entity.Room;

@Controller
@RequestMapping("/room")
public class RoomController {

    @RequestMapping(value = "/add",  method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public Room addRoom(@RequestBody Room room){

    }
}
