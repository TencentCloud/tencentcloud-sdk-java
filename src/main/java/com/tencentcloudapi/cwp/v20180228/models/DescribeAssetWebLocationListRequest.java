/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetWebLocationListRequest extends AbstractModel{

    /**
    * 需要返回的数量，默认为10，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Name - String - 是否必填：否 - 域名</li>
<li>User - String - 是否必填：否 - 运行用户</li>
<li>Port - uint64 - 是否必填：否 - 站点端口</li>
<li>Proto - uint64 - 是否必填：否 - 站点协议：1:HTTP,2:HTTPS</li>
<li>ServiceType - uint64 - 是否必填：否 - 服务类型：
1:Tomcat
2：Apache
3:Nginx
4:WebLogic
5:Websphere
6:JBoss
7:WildFly
8:Jetty
9:IHS
10:Tengine</li>
<li>OsType - String - 是否必填：否 - windows/linux</li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序方式，asc升序 或 desc降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 可选排序：PathCount
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 查询指定Quuid主机的信息
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get 需要返回的数量，默认为10，最大值为100 
     * @return Limit 需要返回的数量，默认为10，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，默认为10，最大值为100
     * @param Limit 需要返回的数量，默认为10，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Name - String - 是否必填：否 - 域名</li>
<li>User - String - 是否必填：否 - 运行用户</li>
<li>Port - uint64 - 是否必填：否 - 站点端口</li>
<li>Proto - uint64 - 是否必填：否 - 站点协议：1:HTTP,2:HTTPS</li>
<li>ServiceType - uint64 - 是否必填：否 - 服务类型：
1:Tomcat
2：Apache
3:Nginx
4:WebLogic
5:Websphere
6:JBoss
7:WildFly
8:Jetty
9:IHS
10:Tengine</li>
<li>OsType - String - 是否必填：否 - windows/linux</li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )</li> 
     * @return Filters 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Name - String - 是否必填：否 - 域名</li>
<li>User - String - 是否必填：否 - 运行用户</li>
<li>Port - uint64 - 是否必填：否 - 站点端口</li>
<li>Proto - uint64 - 是否必填：否 - 站点协议：1:HTTP,2:HTTPS</li>
<li>ServiceType - uint64 - 是否必填：否 - 服务类型：
1:Tomcat
2：Apache
3:Nginx
4:WebLogic
5:Websphere
6:JBoss
7:WildFly
8:Jetty
9:IHS
10:Tengine</li>
<li>OsType - String - 是否必填：否 - windows/linux</li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Name - String - 是否必填：否 - 域名</li>
<li>User - String - 是否必填：否 - 运行用户</li>
<li>Port - uint64 - 是否必填：否 - 站点端口</li>
<li>Proto - uint64 - 是否必填：否 - 站点协议：1:HTTP,2:HTTPS</li>
<li>ServiceType - uint64 - 是否必填：否 - 服务类型：
1:Tomcat
2：Apache
3:Nginx
4:WebLogic
5:Websphere
6:JBoss
7:WildFly
8:Jetty
9:IHS
10:Tengine</li>
<li>OsType - String - 是否必填：否 - windows/linux</li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )</li>
     * @param Filters 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Name - String - 是否必填：否 - 域名</li>
<li>User - String - 是否必填：否 - 运行用户</li>
<li>Port - uint64 - 是否必填：否 - 站点端口</li>
<li>Proto - uint64 - 是否必填：否 - 站点协议：1:HTTP,2:HTTPS</li>
<li>ServiceType - uint64 - 是否必填：否 - 服务类型：
1:Tomcat
2：Apache
3:Nginx
4:WebLogic
5:Websphere
6:JBoss
7:WildFly
8:Jetty
9:IHS
10:Tengine</li>
<li>OsType - String - 是否必填：否 - windows/linux</li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式，asc升序 或 desc降序 
     * @return Order 排序方式，asc升序 或 desc降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，asc升序 或 desc降序
     * @param Order 排序方式，asc升序 或 desc降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 可选排序：PathCount 
     * @return By 可选排序：PathCount
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 可选排序：PathCount
     * @param By 可选排序：PathCount
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 查询指定Quuid主机的信息 
     * @return Quuid 查询指定Quuid主机的信息
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 查询指定Quuid主机的信息
     * @param Quuid 查询指定Quuid主机的信息
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    public DescribeAssetWebLocationListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetWebLocationListRequest(DescribeAssetWebLocationListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

