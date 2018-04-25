package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeInstanceTypeConfigsRequest  extends AbstractModel{


    /**
    * 过滤条件。
<li> zone - String - 是否必填：否 -（过滤条件）按照[可用区](document/api/213/9452#zone)过滤。</li>
<li> instance-family - String - 是否必填：否 -（过滤条件）按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。</li>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为1。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;
    

    /**
     * 获取过滤条件。
<li> zone - String - 是否必填：否 -（过滤条件）按照[可用区](document/api/213/9452#zone)过滤。</li>
<li> instance-family - String - 是否必填：否 -（过滤条件）按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。</li>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为1。
     * @return Filters 过滤条件。
<li> zone - String - 是否必填：否 -（过滤条件）按照[可用区](document/api/213/9452#zone)过滤。</li>
<li> instance-family - String - 是否必填：否 -（过滤条件）按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。</li>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为1。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件。
<li> zone - String - 是否必填：否 -（过滤条件）按照[可用区](document/api/213/9452#zone)过滤。</li>
<li> instance-family - String - 是否必填：否 -（过滤条件）按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。</li>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为1。
     * @param Filters 过滤条件。
<li> zone - String - 是否必填：否 -（过滤条件）按照[可用区](document/api/213/9452#zone)过滤。</li>
<li> instance-family - String - 是否必填：否 -（过滤条件）按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。</li>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为1。
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

