package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeSecurityGroupAssociationStatisticsResponse  extends AbstractModel{


    /**
    * 安全组关联实例统计。
    */
    @SerializedName("SecurityGroupAssociationStatisticsSet")
    @Expose
    private SecurityGroupAssociationStatistics [] SecurityGroupAssociationStatisticsSet;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取安全组关联实例统计。
     * @return SecurityGroupAssociationStatisticsSet 安全组关联实例统计。
     */
    public SecurityGroupAssociationStatistics [] getSecurityGroupAssociationStatisticsSet() {
        return this.SecurityGroupAssociationStatisticsSet;
    }

    /**
     * 设置安全组关联实例统计。
     * @param SecurityGroupAssociationStatisticsSet 安全组关联实例统计。
     */
    public void setSecurityGroupAssociationStatisticsSet(SecurityGroupAssociationStatistics [] SecurityGroupAssociationStatisticsSet) {
        this.SecurityGroupAssociationStatisticsSet = SecurityGroupAssociationStatisticsSet;
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
        this.setParamArrayObj(map, prefix + "SecurityGroupAssociationStatisticsSet.", this.SecurityGroupAssociationStatisticsSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

