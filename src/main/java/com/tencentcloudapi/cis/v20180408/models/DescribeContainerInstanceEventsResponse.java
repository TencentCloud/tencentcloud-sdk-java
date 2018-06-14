package com.tencentcloudapi.cis.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeContainerInstanceEventsResponse  extends AbstractModel{


    /**
    * 容器实例事件列表
    */
    @SerializedName("EventList")
    @Expose
    private Event [] EventList;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取容器实例事件列表
     * @return EventList 容器实例事件列表
     */
    public Event [] getEventList() {
        return this.EventList;
    }

    /**
     * 设置容器实例事件列表
     * @param EventList 容器实例事件列表
     */
    public void setEventList(Event [] EventList) {
        this.EventList = EventList;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EventList.", this.EventList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

