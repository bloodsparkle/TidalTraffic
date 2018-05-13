package TrafficDescription.EdgeTraffic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuqia_000 on 2018/5/10.
 */
public class NowIntervalEdgeTraffic {
    public String edgeId;
    public double timeOfHour;
    public List<Double> nowIntervalTraffic;

    public NowIntervalEdgeTraffic(String edgeId) {
        this.edgeId = edgeId;
        this.timeOfHour = 0.0;
        this.nowIntervalTraffic = new ArrayList<Double>();
    }

    public NowIntervalEdgeTraffic(String edgeId, double timeOfHour, List<Double> nowIntervalTraffic) {
        this.edgeId = edgeId;
        this.timeOfHour = timeOfHour;
        this.nowIntervalTraffic = nowIntervalTraffic;
    }

    public double getTimeOfHour() {
        return timeOfHour;
    }

    public void setTimeOfHour(double timeOfHour) {
        this.timeOfHour = timeOfHour;
    }

    public List<Double> getNowIntervalTraffic() {
        return nowIntervalTraffic;
    }

    public void setNowIntervalTraffic(List<Double> nowIntervalTraffic) {
        this.nowIntervalTraffic = nowIntervalTraffic;
    }

    public void removeOneHourTrafficData() {
        if(this.nowIntervalTraffic.size() > 15) {
            for(int i = 0; i < 15; i++) {
                this.nowIntervalTraffic.remove(0);
            }

        }
    }
}
