package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBInstanceAttributeResponse  extends AbstractModel{


    /**
    * 实例详细信息。
    */
    @SerializedName("DBInstance")
    @Expose
    private DBInstance DBInstance;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取实例详细信息。
     * @return DBInstance 实例详细信息。
     */
    public DBInstance getDBInstance() {
        return this.DBInstance;
    }

    /**
     * 设置实例详细信息。
     * @param DBInstance 实例详细信息。
     */
    public void setDBInstance(DBInstance DBInstance) {
        this.DBInstance = DBInstance;
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
        this.setParamObj(map, prefix + "DBInstance.", this.DBInstance);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

