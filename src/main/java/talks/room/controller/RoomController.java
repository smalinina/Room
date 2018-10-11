package talks.room.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import talks.room.entity.Reservation;
import talks.room.entity.Room;
import talks.room.service.RoomService;

import java.util.List;

@Controller
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/add",  method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    @ResponseBody
    public Room addRoom(@RequestBody Room room){
        return roomService.addRoom(room);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    @ResponseBody
    public Room getRoomById(@PathVariable(value = "id") String id) {
        return roomService.getRoomById(Long.parseLong(id));
    }

    @RequestMapping(value = "/get/all", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<Room> getAllRoom() {
        return roomService.getAllRoom();
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json;charset=utf-8")
    @ResponseBody
    public Room updateRoom(@RequestBody Room room) {
        return roomService.updateRoom(room);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = "application/json;charset=utf-8")
    @ResponseBody
    public Room deleteRoomById(@PathVariable(value = "id") String id) {
        return roomService.deleteRoomById(Long.parseLong(id));
    }

    @RequestMapping(value = "/get/{count}", method = RequestMethod.GET)
    @ResponseBody
    public List<Room> getRoomByCount() {
        return roomService.getRoomByCount();
    }

    List<Room> washFacilityList = pskvorWashFacilityDaoService.getWashFacilitiesOnNet(idNet);
        if (washFacilityList == null)
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        else
                return washFacilityList;
}
