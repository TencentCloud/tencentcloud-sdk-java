package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeRouteTablesRequest  extends AbstractModel{


    /**
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableIds")
    @Expose
    private String [] RouteTableIds;
    

    /**
    * 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>route-table-id - String - （过滤条件）路由表实例ID。</li>
<li>route-table-name - String - （过滤条件）路由表名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>association.main - Boolean - （过滤条件）是否主路由表。</li>
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
    * 请求对象个数。
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;
    

    /**
     * 获取路由表实例ID，例如：rtb-azd4dt1c。
     * @return RouteTableIds 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public String [] getRouteTableIds() {
        return this.RouteTableIds;
    }

    /**
     * 设置路由表实例ID，例如：rtb-azd4dt1c。
     * @param RouteTableIds 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public void setRouteTableIds(String [] RouteTableIds) {
        this.RouteTableIds = RouteTableIds;
    }

    /**
     * 获取过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>route-table-id - String - （过滤条件）路由表实例ID。</li>
<li>route-table-name - String - （过滤条件）路由表名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>association.main - Boolean - （过滤条件）是否主路由表。</li>
     * @return Filters 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>route-table-id - String - （过滤条件）路由表实例ID。</li>
<li>route-table-name - String - （过滤条件）路由表名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>association.main - Boolean - （过滤条件）是否主路由表。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>route-table-id - String - （过滤条件）路由表实例ID。</li>
<li>route-table-name - String - （过滤条件）路由表名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>association.main - Boolean - （过滤条件）是否主路由表。</li>
     * @param Filters 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>route-table-id - String - （过滤条件）路由表实例ID。</li>
<li>route-table-name - String - （过滤条件）路由表名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>association.main - Boolean - （过滤条件）是否主路由表。</li>
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
     * 获取请求对象个数。
     * @return Limit 请求对象个数。
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * 设置请求对象个数。
     * @param Limit 请求对象个数。
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RouteTableIds.", this.RouteTableIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

