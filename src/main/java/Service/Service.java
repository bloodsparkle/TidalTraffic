package Service;

import Topology.SimpleEdge;
import Topology.Vertex;
import org.jgrapht.GraphPath;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuqia_000 on 2017/6/15.
 */
public class Service {
    public String serviceId;
    public Vertex srcNode;                             //源节点
    public Vertex desNode;                             //宿节点
    double unitbandwidth = 6.25;
    double bandwidth;                           //带宽
    double wavelenth;                           //占用的波长
    public int numberOfWavelenthes;
    public int serviceTime;                            //请求服务时间
    public long startTime;                             //开始时刻
    public int remainTime;                             //剩余时间
    public GraphPath<Vertex, SimpleEdge> graphPath;    //算出来的路
    public List<Integer> wavelengthesNumber;           //占用的波长号
    boolean isComputed;                         //是否已算路
    boolean isAllocated;                        //是否分配资源
    boolean isBlocked;                          //是否已阻塞
    boolean isOutOfTime;                        //是否已离去
    public boolean reconfiged;                         //是否已重构


    public Service(Vertex srcNode, Vertex desNode, int numberOfWavelenthes, int serviceTime) {
        this.srcNode = srcNode;
        this.desNode = desNode;
        this.bandwidth = unitbandwidth * numberOfWavelenthes;
        this.numberOfWavelenthes = numberOfWavelenthes;
        this.serviceTime = serviceTime;
        this.startTime = System.currentTimeMillis();            //记录起始时间
        this.wavelengthesNumber = new ArrayList<Integer>();
        this.isComputed = false;
        this.isAllocated = false;
        this.isBlocked = false;
        this.isOutOfTime = false;
        this.reconfiged = false;
    }

    public boolean isPathComputed(){
        return isComputed;
    }

    public boolean isResourceAllocated() {
        return isAllocated;
    }

    public boolean isServiceBlocked() {
        return isBlocked;
    }

    public boolean isReconfiged() {
        return reconfiged;
    }

    public void setServiceId(String s) {
        serviceId = s;
    }

    public void setGraphPath(GraphPath<Vertex, SimpleEdge> graphPath) {
        this.graphPath = graphPath;
    }

    @Override
    public int hashCode() {
        int x = srcNode.hashCode();
        int y = desNode.hashCode();
        return (x * y + x + y) * (int)bandwidth;
    }

    @Override
    public boolean equals(Object obj) {
        Service x = (Service)obj;
        if(x.hashCode() == this.hashCode()) {
            return true;
        }else {
            return false;
        }
    }
}
