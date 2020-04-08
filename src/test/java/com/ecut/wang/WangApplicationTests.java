package com.ecut.wang;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@MapperScan("com.ecut.wang.dao")
class WangApplicationTests {

//    @Test
//    void testGetWorkList() throws Exception{
//        WorkerServiceImp workerServiceImp=new WorkerServiceImp();
//        List<Worker> workerList = workerServiceImp.getAllWorker();
//        System.out.println(workerList.toString());
//    }

}
