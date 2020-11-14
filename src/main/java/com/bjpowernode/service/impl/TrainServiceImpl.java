package com.bjpowernode.service.impl;

import com.bjpowernode.bean.Train;
import com.bjpowernode.mapper.TrainMapper;
import com.bjpowernode.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("trainService")
public class TrainServiceImpl implements TrainService {
    @Autowired
    private TrainMapper trainMapper;

    @Override
    public List<Train> queryAll(Train train) {
        return trainMapper.queryAll(train);
    }

    @Override
    public List<Train> selectTnumber() {
        return trainMapper.selectAll();
    }
}
