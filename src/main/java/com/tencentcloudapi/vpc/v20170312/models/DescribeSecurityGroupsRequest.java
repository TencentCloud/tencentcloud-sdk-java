package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeSecurityGroupsRequest  extends AbstractModel{


    /**
    * 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。每次请求的实例的上限为100。参数不支持同时指定SecurityGroupIds和Filters。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;
    

    /**
    * 过滤条件，参数不支持同时指定SecurityGroupIds和Filters。
<li>project-id - Integer - （过滤条件）项目id。</li>
<li>security-group-name - String - （过滤条件）安全组名称。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;
    

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;
    

    /**
    * 返回数量。
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;
    

    /**
     * 获取安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。每次请求的实例的上限为100。参数不支持同时指定SecurityGroupIds和Filters。
     * @return SecurityGroupIds 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。每次请求的实例的上限为100。参数不支持同时指定SecurityGroupIds和Filters。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * 设置安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。每次请求的实例的上限为100。参数不支持同时指定SecurityGroupIds和Filters。
     * @param SecurityGroupIds 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。每次请求的实例的上限为100。参数不支持同时指定SecurityGroupIds和Filters。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * 获取过滤条件，参数不支持同时指定SecurityGroupIds和Filters。
<li>project-id - Integer - （过滤条件）项目id。</li>
<li>security-group-name - String - （过滤条件）安全组名称。</li>
     * @return Filters 过滤条件，参数不支持同时指定SecurityGroupIds和Filters。
<li>project-id - Integer - （过滤条件）项目id。</li>
<li>security-group-name - String - （过滤条件）安全组名称。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件，参数不支持同时指定SecurityGroupIds和Filters。
<li>project-id - Integer - （过滤条件）项目id。</li>
<li>security-group-name - String - （过滤条件）安全组名称。</li>
     * @param Filters 过滤条件，参数不支持同时指定SecurityGroupIds和Filters。
<li>project-id - Integer - （过滤条件）项目id。</li>
<li>security-group-name - String - （过滤条件）安全组名称。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取偏移量。
     * @return Offset 偏移量。
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量。
     * @param Offset 偏移量。
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量。
     * @return Limit 返回数量。
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量。
     * @param Limit 返回数量。
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

