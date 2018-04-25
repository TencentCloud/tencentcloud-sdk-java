package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeServiceTemplatesRequest  extends AbstractModel{


    /**
    * 过滤条件。
<li>service-template-name - String - （过滤条件）协议端口模板名称。</li>
<li>service-template-id - String - （过滤条件）协议端口模板实例ID，例如：ppm-e6dy460g。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;
    

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;
    

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;
    

    /**
     * 获取过滤条件。
<li>service-template-name - String - （过滤条件）协议端口模板名称。</li>
<li>service-template-id - String - （过滤条件）协议端口模板实例ID，例如：ppm-e6dy460g。</li>
     * @return Filters 过滤条件。
<li>service-template-name - String - （过滤条件）协议端口模板名称。</li>
<li>service-template-id - String - （过滤条件）协议端口模板实例ID，例如：ppm-e6dy460g。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件。
<li>service-template-name - String - （过滤条件）协议端口模板名称。</li>
<li>service-template-id - String - （过滤条件）协议端口模板实例ID，例如：ppm-e6dy460g。</li>
     * @param Filters 过滤条件。
<li>service-template-name - String - （过滤条件）协议端口模板名称。</li>
<li>service-template-id - String - （过滤条件）协议端口模板实例ID，例如：ppm-e6dy460g。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取偏移量，默认为0。
     * @return Offset 偏移量，默认为0。
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量，默认为20，最大值为100。
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

