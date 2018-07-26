package com.tencentcloudapi.msp.v20180319.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ListMigrationProjectResponse  extends AbstractModel{


    /**
    * 项目列表
    */
    @SerializedName("Projects")
    @Expose
    private Project [] Projects;

    /**
    * 项目总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取项目列表
     * @return Projects 项目列表
     */
    public Project [] getProjects() {
        return this.Projects;
    }

    /**
     * 设置项目列表
     * @param Projects 项目列表
     */
    public void setProjects(Project [] Projects) {
        this.Projects = Projects;
    }

    /**
     * 获取项目总数
     * @return TotalCount 项目总数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置项目总数
     * @param TotalCount 项目总数
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
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
        this.setParamArrayObj(map, prefix + "Projects.", this.Projects);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

