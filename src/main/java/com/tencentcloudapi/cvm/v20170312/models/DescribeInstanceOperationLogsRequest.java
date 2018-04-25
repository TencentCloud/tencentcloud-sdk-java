package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeInstanceOperationLogsRequest  extends AbstractModel{


    /**
    * 每次请求的`Filters`的上限为1，`Filter.Values`的上限为1。
Filters.1.Name目前支持“instance-id”，即根据实例 ID 过滤。实例 ID 形如：ins-1w2x3y4z。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;
    

    /**
     * 获取每次请求的`Filters`的上限为1，`Filter.Values`的上限为1。
Filters.1.Name目前支持“instance-id”，即根据实例 ID 过滤。实例 ID 形如：ins-1w2x3y4z。
     * @return Filters 每次请求的`Filters`的上限为1，`Filter.Values`的上限为1。
Filters.1.Name目前支持“instance-id”，即根据实例 ID 过滤。实例 ID 形如：ins-1w2x3y4z。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置每次请求的`Filters`的上限为1，`Filter.Values`的上限为1。
Filters.1.Name目前支持“instance-id”，即根据实例 ID 过滤。实例 ID 形如：ins-1w2x3y4z。
     * @param Filters 每次请求的`Filters`的上限为1，`Filter.Values`的上限为1。
Filters.1.Name目前支持“instance-id”，即根据实例 ID 过滤。实例 ID 形如：ins-1w2x3y4z。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

