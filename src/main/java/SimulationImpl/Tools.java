package SimulationImpl;

/**
 * Created by yuqia on 2017/7/1.
 */
public class Tools {
    /**拓扑相关*/
    //用于设定每个area的负载门限
    public static double DEFAULTTHRESHOLD = 0.7;
    //用于设定每条边的波长数
    public static int DEFAULTNUMBEROFWAVELENTHES = 40;

    /**业务发生相关*/
    //用于设置生成业务个数
    public static int DEFAULTSERVICENUMBER = 5000;
    //平均业务到达率
    public static int DEFAULTLAMBDA = 2;
    //生成业务时，不同时间段产生的业务源宿点概率不同，用来区分时间
    public static int DEFAULTWORKINGTIME = 5000;
    //业务平均持续时间
    public static int DEFAULTAVERAGESERVICETIME = 20;
    //单个业务占用最大带宽数
    public static int DEFAULTMAXNUMBEROFWAVELENGTH = 4;
    //为节约运算时间，调整下方参数可
    public static int TIMESCALE = 20;
}