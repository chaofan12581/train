package com.bjpowernode.mapper;

import com.bjpowernode.bean.Train;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TrainMapper extends Mapper<Train> {
    List<Train> queryAll(Train train);
}
