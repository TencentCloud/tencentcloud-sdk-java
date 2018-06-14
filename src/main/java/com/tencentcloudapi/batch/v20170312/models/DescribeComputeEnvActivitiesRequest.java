package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeComputeEnvActivitiesRequest  extends AbstractModel{


    /**
    * u8ba1u7b97u73afu5883ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
     * 获取u8ba1u7b97u73afu5883ID
     * @return EnvId u8ba1u7b97u73afu5883ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * 设置u8ba1u7b97u73afu5883ID
     * @param EnvId u8ba1u7b97u73afu5883ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量
     * @return Limit 返回数量
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量
     * @param Limit 返回数量
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取过滤条件
     * @return Filters 过滤条件
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "Filters.", this.Filters);

    }
}

