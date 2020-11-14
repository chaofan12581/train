package com.bjpowernode.service;

import com.bjpowernode.bean.Train;

import java.util.List;

public interface TrainService {
    List<Train> queryAll(Train train);

    List<Train> selectTnumber();
}
