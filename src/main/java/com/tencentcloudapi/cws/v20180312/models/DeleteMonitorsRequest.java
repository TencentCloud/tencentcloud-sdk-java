package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteMonitorsRequest  extends AbstractModel{


    /**
    * 监控任务ID列表
    */
    @SerializedName("MonitorIds")
    @Expose
    private Integer [] MonitorIds;
    

    /**
     * 获取监控任务ID列表
     * @return MonitorIds 监控任务ID列表
     */
    public Integer [] getMonitorIds() {
        return this.MonitorIds;
    }

    /**
     * 设置监控任务ID列表
     * @param MonitorIds 监控任务ID列表
     */
    public void setMonitorIds(Integer [] MonitorIds) {
        this.MonitorIds = MonitorIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MonitorIds.", this.MonitorIds);

    }
}

