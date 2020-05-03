package com.ecut.wang.handler;

import com.ecut.wang.pojo.Parking;
import com.ecut.wang.service.IParkingService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://wyj.yezijun.top",maxAge = 3600)
@RequestMapping("/api")
public class ParkingHandler {
    @Autowired
    IParkingService parkingService;

    @RequestMapping(value = "likeSearchParking",method = RequestMethod.GET)
    public Result<Parking> likeSearchParking(Parking parking){
        return parkingService.likeSearchParking(parking);
    }
    @RequestMapping(value = "insertNewParking",method = RequestMethod.GET)
    public Result insertNewParking(Parking parking){
        return parkingService.insertNewParking(parking);
    }
    @RequestMapping(value = "updateParking",method = RequestMethod.GET)
    public Result updateParking(Parking parking){
        return parkingService.updateParking(parking);
    }
    @RequestMapping(value = "getParkingById",method = RequestMethod.GET)
    public Result<Parking> getParkingById(String ID){
        return parkingService.getParkingById(ID);
    }
}
