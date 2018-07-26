package com.tencentcloudapi.msp.v20180319.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ListMigrationTaskRequest  extends AbstractModel{


    /**
    * 记录起始数，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 记录条数，默认值为10
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 项目ID，默认值为空
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
     * 获取记录起始数，默认值为0
     * @return Offset 记录起始数，默认值为0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置记录起始数，默认值为0
     * @param Offset 记录起始数，默认值为0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取记录条数，默认值为10
     * @return Limit 记录条数，默认值为10
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置记录条数，默认值为10
     * @param Limit 记录条数，默认值为10
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取项目ID，默认值为空
     * @return ProjectId 项目ID，默认值为空
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID，默认值为空
     * @param ProjectId 项目ID，默认值为空
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

