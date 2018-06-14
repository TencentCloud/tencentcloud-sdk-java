package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBInstancesRequest  extends AbstractModel{


    /**
    * 每页显示数量，默认返回10条。
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
    * 分页序号，从1开始。
    */
    @SerializedName("PageNumber")
    @Expose
    private Integer PageNumber;

    /**
    * 过滤条件，目前支持：db-instance-id、db-instance-name两种。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * 获取每页显示数量，默认返回10条。
     * @return PageSize 每页显示数量，默认返回10条。
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * 设置每页显示数量，默认返回10条。
     * @param PageSize 每页显示数量，默认返回10条。
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * 获取分页序号，从1开始。
     * @return PageNumber 分页序号，从1开始。
     */
    public Integer getPageNumber() {
        return this.PageNumber;
    }

    /**
     * 设置分页序号，从1开始。
     * @param PageNumber 分页序号，从1开始。
     */
    public void setPageNumber(Integer PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * 获取过滤条件，目前支持：db-instance-id、db-instance-name两种。
     * @return Filters 过滤条件，目前支持：db-instance-id、db-instance-name两种。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件，目前支持：db-instance-id、db-instance-name两种。
     * @param Filters 过滤条件，目前支持：db-instance-id、db-instance-name两种。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

