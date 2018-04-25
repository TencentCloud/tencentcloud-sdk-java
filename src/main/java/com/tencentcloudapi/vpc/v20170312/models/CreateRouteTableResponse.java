package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateRouteTableResponse  extends AbstractModel{


    /**
    * 路由表对象。
    */
    @SerializedName("RouteTable")
    @Expose
    private RouteTable RouteTable;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取路由表对象。
     * @return RouteTable 路由表对象。
     */
    public RouteTable getRouteTable() {
        return this.RouteTable;
    }

    /**
     * 设置路由表对象。
     * @param RouteTable 路由表对象。
     */
    public void setRouteTable(RouteTable RouteTable) {
        this.RouteTable = RouteTable;
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
        this.setParamObj(map, prefix + "RouteTable.", this.RouteTable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

