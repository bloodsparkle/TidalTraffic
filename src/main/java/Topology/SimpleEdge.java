package Topology;

import SimulationImpl.Tools;
import TrafficDescription.EdgeTraffic.NowIntervalEdgeTraffic;
import TrafficDescription.EdgeTraffic.PredictedEdgeTraffic;
import org.jgrapht.graph.DefaultWeightedEdge;

/**
 * Created by yuqia on 2017/6/15.
 */
public class SimpleEdge extends DefaultWeightedEdge {
    public Vertex srcVertex;
    public Vertex desVertex;
    public double capacity;
    public double unitWavelength = 6.25;  //每个波长的固定带宽
    public double metric;
    public int numberOfWavelenth;
    public boolean[] wavelenthOccupation;
    public String[] serviceOnWavelength;
    public int numberOfOccupatedWavelength;
    //public static int DEFAULTNUMBEROFWAVELENTHES = 30;

    /**重构用到的属性*/
    public NowIntervalEdgeTraffic nowIntervalEdgeTraffic;
    public PredictedEdgeTraffic predictedEdgeTraffic;
    public double futureLoad;

    public SimpleEdge() {

    }

    public SimpleEdge(Vertex srcVertex, Vertex desVertex) {
        this(srcVertex, desVertex, 100, Tools.DEFAULTNUMBEROFWAVELENTHES);//默认链路带宽容量和波长数
    }

    public SimpleEdge(Vertex srcVertex, Vertex desVertex, double capacity, int numberOfWavelenth) {
        this.srcVertex = srcVertex;
        this.desVertex = desVertex;
        this.capacity = capacity;
        this.numberOfWavelenth = numberOfWavelenth;
        this.wavelenthOccupation = new boolean[numberOfWavelenth];
        this.serviceOnWavelength = new String[numberOfWavelenth];
        this.numberOfOccupatedWavelength = 0;
        for(int i = 0; i < numberOfWavelenth; i++) {
            wavelenthOccupation[i] = false;
        }
        this.nowIntervalEdgeTraffic = new NowIntervalEdgeTraffic(this.toString());
        this.predictedEdgeTraffic = new PredictedEdgeTraffic();
        this.futureLoad = 0;
    }

    /*
    @Override
    public int hashCode() {
        int x = srcVertex.hashCode();
        int y = desVertex.hashCode();
        return (x * y + x + y);
    }*/

    @Override
    public boolean equals(Object obj) {
        SimpleEdge x = (SimpleEdge)obj;
        if(x.srcVertex.nodeId.equals(this.srcVertex.nodeId) &&
                x.desVertex.nodeId.equals(this.desVertex.nodeId)) {
            return true;
            //}else if(x.srcVertex.nodeId.equals(this.desVertex.nodeId) || x.desVertex.nodeId.equals(this.srcVertex.nodeId)) {
        }else if(x.srcVertex.nodeId.equals(this.desVertex.nodeId) &&
                x.desVertex.nodeId.equals(this.srcVertex.nodeId)) {
            return true;
        }else {
            return false;
        }

    }

    @Override
    public String toString() {
        String srcNodeId = this.srcVertex.getNodeId();
        String desNodeId = this.desVertex.getNodeId();
        String edgeId = (Integer.valueOf(srcNodeId) < Integer.valueOf(desNodeId)) ?
                "edge" + srcNodeId + desNodeId : "edge" + desNodeId + srcNodeId;
        return edgeId;
    }

}
