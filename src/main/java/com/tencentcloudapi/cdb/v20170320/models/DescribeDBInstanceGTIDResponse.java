package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBInstanceGTIDResponse  extends AbstractModel{


    /**
    * GTID是否开通的标记：0-未开通，1-已开通。
    */
    @SerializedName("IsGTIDOpen")
    @Expose
    private Integer IsGTIDOpen;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取GTID是否开通的标记：0-未开通，1-已开通。
     * @return IsGTIDOpen GTID是否开通的标记：0-未开通，1-已开通。
     */
    public Integer getIsGTIDOpen() {
        return this.IsGTIDOpen;
    }

    /**
     * 设置GTID是否开通的标记：0-未开通，1-已开通。
     * @param IsGTIDOpen GTID是否开通的标记：0-未开通，1-已开通。
     */
    public void setIsGTIDOpen(Integer IsGTIDOpen) {
        this.IsGTIDOpen = IsGTIDOpen;
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
        this.setParamSimple(map, prefix + "IsGTIDOpen", this.IsGTIDOpen);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

