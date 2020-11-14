package com.bjpowernode.controller;

import com.bjpowernode.bean.Train;
import com.bjpowernode.service.TrainService;
import com.bjpowernode.util.PageHelpUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TrainController {
    @Autowired
    private TrainService trainService ;
    private int pageSize= 4;
    @RequestMapping({"trainList","/"})
    public String trainList(Model model, HttpServletRequest request, @RequestParam(defaultValue = "1") int page,
                            Train train){
        PageHelper .startPage(page,pageSize);

        List<Train> listTrain  = trainService.queryAll(train);
        PageInfo<Train> trainPageInfo = new PageInfo<>(listTrain);

        String pages = PageHelpUtil.bootStrapPage("/train/trainList",trainPageInfo, null);
        model.addAttribute("pages",pages);

        model.addAttribute("train",train);
        model.addAttribute("listTrain",listTrain);
        HttpSession session =request.getSession();
        Object user = session.getAttribute("user");
        if(user != null){
            return "train";
        }

return null;
    }

    @RequestMapping("frequencyTrain")
    @ResponseBody
    public  List<Train> frequencyTrain(){

       List<Train> trainList =  trainService.selectTnumber();
        return trainList;

    }
}
