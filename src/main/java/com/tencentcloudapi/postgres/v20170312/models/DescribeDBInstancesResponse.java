package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBInstancesResponse  extends AbstractModel{


    /**
    * 查询到的实例数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;
    

    /**
    * 实例详细信息集合。
    */
    @SerializedName("DBInstanceSet")
    @Expose
    private DBInstance [] DBInstanceSet;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取查询到的实例数量。
     * @return TotalCount 查询到的实例数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置查询到的实例数量。
     * @param TotalCount 查询到的实例数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取实例详细信息集合。
     * @return DBInstanceSet 实例详细信息集合。
     */
    public DBInstance [] getDBInstanceSet() {
        return this.DBInstanceSet;
    }

    /**
     * 设置实例详细信息集合。
     * @param DBInstanceSet 实例详细信息集合。
     */
    public void setDBInstanceSet(DBInstance [] DBInstanceSet) {
        this.DBInstanceSet = DBInstanceSet;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DBInstanceSet.", this.DBInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

