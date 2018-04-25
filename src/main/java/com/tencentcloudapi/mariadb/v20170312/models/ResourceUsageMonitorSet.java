package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ResourceUsageMonitorSet  extends AbstractModel{


    /**
    * binlog日志磁盘可用空间,单位GB
    */
    @SerializedName("BinlogDiskAvailable")
    @Expose
    private MonitorData BinlogDiskAvailable;
    

    /**
    * CPU利用率
    */
    @SerializedName("CpuUsageRate")
    @Expose
    private MonitorData CpuUsageRate;
    

    /**
    * 内存可用空间,单位GB
    */
    @SerializedName("MemAvailable")
    @Expose
    private MonitorData MemAvailable;
    

    /**
    * 磁盘可用空间,单位GB
    */
    @SerializedName("DataDiskAvailable")
    @Expose
    private MonitorIntData DataDiskAvailable;
    

    /**
     * 获取binlog日志磁盘可用空间,单位GB
     * @return BinlogDiskAvailable binlog日志磁盘可用空间,单位GB
     */
    public MonitorData getBinlogDiskAvailable() {
        return this.BinlogDiskAvailable;
    }

    /**
     * 设置binlog日志磁盘可用空间,单位GB
     * @param BinlogDiskAvailable binlog日志磁盘可用空间,单位GB
     */
    public void setBinlogDiskAvailable(MonitorData BinlogDiskAvailable) {
        this.BinlogDiskAvailable = BinlogDiskAvailable;
    }

    /**
     * 获取CPU利用率
     * @return CpuUsageRate CPU利用率
     */
    public MonitorData getCpuUsageRate() {
        return this.CpuUsageRate;
    }

    /**
     * 设置CPU利用率
     * @param CpuUsageRate CPU利用率
     */
    public void setCpuUsageRate(MonitorData CpuUsageRate) {
        this.CpuUsageRate = CpuUsageRate;
    }

    /**
     * 获取内存可用空间,单位GB
     * @return MemAvailable 内存可用空间,单位GB
     */
    public MonitorData getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * 设置内存可用空间,单位GB
     * @param MemAvailable 内存可用空间,单位GB
     */
    public void setMemAvailable(MonitorData MemAvailable) {
        this.MemAvailable = MemAvailable;
    }

    /**
     * 获取磁盘可用空间,单位GB
     * @return DataDiskAvailable 磁盘可用空间,单位GB
     */
    public MonitorIntData getDataDiskAvailable() {
        return this.DataDiskAvailable;
    }

    /**
     * 设置磁盘可用空间,单位GB
     * @param DataDiskAvailable 磁盘可用空间,单位GB
     */
    public void setDataDiskAvailable(MonitorIntData DataDiskAvailable) {
        this.DataDiskAvailable = DataDiskAvailable;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BinlogDiskAvailable.", this.BinlogDiskAvailable);
        this.setParamObj(map, prefix + "CpuUsageRate.", this.CpuUsageRate);
        this.setParamObj(map, prefix + "MemAvailable.", this.MemAvailable);
        this.setParamObj(map, prefix + "DataDiskAvailable.", this.DataDiskAvailable);

    }
}

