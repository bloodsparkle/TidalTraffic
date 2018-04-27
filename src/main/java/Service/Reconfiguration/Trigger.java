package Service.Reconfiguration;

import TrafficDescription.NowIntervalTraffic;
import TrafficDescription.PredictedIntervalTraffic;

import java.util.List;

/**
 * Created by yuqia_000 on 2018/4/27.
 */

/**
 * 重构触发器相关，目前没想好这个与资源分配在代码上怎么结合
 * Q1写一些静态方法？
 */
public class Trigger extends Thread{

    public List<Double> nowIntervalTraffic;

    public void flushTraffic() {

    }

    /**
     * 将1h的流量信息传入机器学习引擎进行判断
     * @param nowIntervalTraffic
     * @return
     */
    public PredictedIntervalTraffic getPredictedTraffic(NowIntervalTraffic nowIntervalTraffic) {
        //TODO:将数据通过thrift传给tensorflow；运算并得返回潮汐标识与预测流量
        //TODO:格式转换 将NowIntervalTraffic转换成client要发送的数据结构
        //包括client连接server
        //TODO:格式转换 server返回的数据结构转PredictedIntervalTraffic
        PredictedIntervalTraffic predictedIntervalTraffic = new PredictedIntervalTraffic();
        return  predictedIntervalTraffic;
    }

    /**
     * 判断是否应进行重构
     * @param predictedIntervalTraffic
     * @return
     */
    public boolean isReconfigurationNeeded(PredictedIntervalTraffic predictedIntervalTraffic) {
        return predictedIntervalTraffic.migration;
    }

    @Override
    public void run() {
        //1.要先拿到流量信息，而且是被动拿到的

        //2.包装成nowIntervalTraffic

        //3.传入tensorflow判断

    }
}
