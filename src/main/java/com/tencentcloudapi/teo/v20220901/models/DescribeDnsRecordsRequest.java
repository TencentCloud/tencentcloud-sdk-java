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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDnsRecordsRequest extends AbstractModel{

    /**
    * DNS记录所属站点ID。不填写该参数默认返回所有站点下的记录。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>record-id<br>   按照【<strong>DNS记录id</strong>】进行过滤。DNS记录ID形如：record-1a8df68z。<br>   类型：String<br>   必选：否
<li>record-name<br>   按照【<strong>DNS记录名称</strong>】进行过滤。<br>   类型：String<br>   必选：否
<li>record-type<br>   按照【<strong>DNS记录类型</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   A：将域名指向一个外网 IPv4 地址，如 8.8.8.8<br>   AAAA：将域名指向一个外网 IPv6 地址<br>   CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址<br>   TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）<br>   NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录<br>   CAA：指定可为本站点颁发证书的 CA<br>   SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理<br>   MX：指定收件人邮件服务器。
<li>mode<br>   按照【<strong>代理模式</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   dns_only：仅DNS解析<br>   proxied：代理加速
<li>ttl<br>   按照【<strong>解析生效时间</strong>】进行过滤。<br>   类型：string<br>   必选：否
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * 列表排序方式，取值有：
<li>asc：升序排列；</li>
<li>desc：降序排列。</li>默认值为asc。
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 匹配方式，取值有：
<li>all：返回匹配所有查询条件的记录；</li>
<li>any：返回匹配任意一个查询条件的记录。</li>默认值为all。
    */
    @SerializedName("Match")
    @Expose
    private String Match;

    /**
    * 分页查询限制数目，默认值：20，上限：1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页查询偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序依据，取值有：
<li>content：DNS记录内容；</li>
<li>created_on：DNS记录创建时间；</li>
<li>mode：代理模式；</li>
<li>record-name：DNS记录名称；</li>
<li>ttl：解析记录生效时间；</li>
<li>record-type：DNS记录类型。</li>默认根据record-type, recrod-name属性组合排序。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get DNS记录所属站点ID。不填写该参数默认返回所有站点下的记录。 
     * @return ZoneId DNS记录所属站点ID。不填写该参数默认返回所有站点下的记录。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set DNS记录所属站点ID。不填写该参数默认返回所有站点下的记录。
     * @param ZoneId DNS记录所属站点ID。不填写该参数默认返回所有站点下的记录。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>record-id<br>   按照【<strong>DNS记录id</strong>】进行过滤。DNS记录ID形如：record-1a8df68z。<br>   类型：String<br>   必选：否
<li>record-name<br>   按照【<strong>DNS记录名称</strong>】进行过滤。<br>   类型：String<br>   必选：否
<li>record-type<br>   按照【<strong>DNS记录类型</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   A：将域名指向一个外网 IPv4 地址，如 8.8.8.8<br>   AAAA：将域名指向一个外网 IPv6 地址<br>   CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址<br>   TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）<br>   NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录<br>   CAA：指定可为本站点颁发证书的 CA<br>   SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理<br>   MX：指定收件人邮件服务器。
<li>mode<br>   按照【<strong>代理模式</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   dns_only：仅DNS解析<br>   proxied：代理加速
<li>ttl<br>   按照【<strong>解析生效时间</strong>】进行过滤。<br>   类型：string<br>   必选：否 
     * @return Filters 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>record-id<br>   按照【<strong>DNS记录id</strong>】进行过滤。DNS记录ID形如：record-1a8df68z。<br>   类型：String<br>   必选：否
<li>record-name<br>   按照【<strong>DNS记录名称</strong>】进行过滤。<br>   类型：String<br>   必选：否
<li>record-type<br>   按照【<strong>DNS记录类型</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   A：将域名指向一个外网 IPv4 地址，如 8.8.8.8<br>   AAAA：将域名指向一个外网 IPv6 地址<br>   CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址<br>   TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）<br>   NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录<br>   CAA：指定可为本站点颁发证书的 CA<br>   SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理<br>   MX：指定收件人邮件服务器。
<li>mode<br>   按照【<strong>代理模式</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   dns_only：仅DNS解析<br>   proxied：代理加速
<li>ttl<br>   按照【<strong>解析生效时间</strong>】进行过滤。<br>   类型：string<br>   必选：否
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>record-id<br>   按照【<strong>DNS记录id</strong>】进行过滤。DNS记录ID形如：record-1a8df68z。<br>   类型：String<br>   必选：否
<li>record-name<br>   按照【<strong>DNS记录名称</strong>】进行过滤。<br>   类型：String<br>   必选：否
<li>record-type<br>   按照【<strong>DNS记录类型</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   A：将域名指向一个外网 IPv4 地址，如 8.8.8.8<br>   AAAA：将域名指向一个外网 IPv6 地址<br>   CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址<br>   TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）<br>   NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录<br>   CAA：指定可为本站点颁发证书的 CA<br>   SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理<br>   MX：指定收件人邮件服务器。
<li>mode<br>   按照【<strong>代理模式</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   dns_only：仅DNS解析<br>   proxied：代理加速
<li>ttl<br>   按照【<strong>解析生效时间</strong>】进行过滤。<br>   类型：string<br>   必选：否
     * @param Filters 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>record-id<br>   按照【<strong>DNS记录id</strong>】进行过滤。DNS记录ID形如：record-1a8df68z。<br>   类型：String<br>   必选：否
<li>record-name<br>   按照【<strong>DNS记录名称</strong>】进行过滤。<br>   类型：String<br>   必选：否
<li>record-type<br>   按照【<strong>DNS记录类型</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   A：将域名指向一个外网 IPv4 地址，如 8.8.8.8<br>   AAAA：将域名指向一个外网 IPv6 地址<br>   CNAME：将域名指向另一个域名，再由该域名解析出最终 IP 地址<br>   TXT：对域名进行标识和说明，常用于域名验证和 SPF 记录（反垃圾邮件）<br>   NS：如果需要将子域名交给其他 DNS 服务商解析，则需要添加 NS 记录。根域名无法添加 NS 记录<br>   CAA：指定可为本站点颁发证书的 CA<br>   SRV：标识某台服务器使用了某个服务，常见于微软系统的目录管理<br>   MX：指定收件人邮件服务器。
<li>mode<br>   按照【<strong>代理模式</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   dns_only：仅DNS解析<br>   proxied：代理加速
<li>ttl<br>   按照【<strong>解析生效时间</strong>】进行过滤。<br>   类型：string<br>   必选：否
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 列表排序方式，取值有：
<li>asc：升序排列；</li>
<li>desc：降序排列。</li>默认值为asc。 
     * @return Direction 列表排序方式，取值有：
<li>asc：升序排列；</li>
<li>desc：降序排列。</li>默认值为asc。
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 列表排序方式，取值有：
<li>asc：升序排列；</li>
<li>desc：降序排列。</li>默认值为asc。
     * @param Direction 列表排序方式，取值有：
<li>asc：升序排列；</li>
<li>desc：降序排列。</li>默认值为asc。
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 匹配方式，取值有：
<li>all：返回匹配所有查询条件的记录；</li>
<li>any：返回匹配任意一个查询条件的记录。</li>默认值为all。 
     * @return Match 匹配方式，取值有：
<li>all：返回匹配所有查询条件的记录；</li>
<li>any：返回匹配任意一个查询条件的记录。</li>默认值为all。
     */
    public String getMatch() {
        return this.Match;
    }

    /**
     * Set 匹配方式，取值有：
<li>all：返回匹配所有查询条件的记录；</li>
<li>any：返回匹配任意一个查询条件的记录。</li>默认值为all。
     * @param Match 匹配方式，取值有：
<li>all：返回匹配所有查询条件的记录；</li>
<li>any：返回匹配任意一个查询条件的记录。</li>默认值为all。
     */
    public void setMatch(String Match) {
        this.Match = Match;
    }

    /**
     * Get 分页查询限制数目，默认值：20，上限：1000。 
     * @return Limit 分页查询限制数目，默认值：20，上限：1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目，默认值：20，上限：1000。
     * @param Limit 分页查询限制数目，默认值：20，上限：1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页查询偏移量，默认为 0。 
     * @return Offset 分页查询偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，默认为 0。
     * @param Offset 分页查询偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序依据，取值有：
<li>content：DNS记录内容；</li>
<li>created_on：DNS记录创建时间；</li>
<li>mode：代理模式；</li>
<li>record-name：DNS记录名称；</li>
<li>ttl：解析记录生效时间；</li>
<li>record-type：DNS记录类型。</li>默认根据record-type, recrod-name属性组合排序。 
     * @return Order 排序依据，取值有：
<li>content：DNS记录内容；</li>
<li>created_on：DNS记录创建时间；</li>
<li>mode：代理模式；</li>
<li>record-name：DNS记录名称；</li>
<li>ttl：解析记录生效时间；</li>
<li>record-type：DNS记录类型。</li>默认根据record-type, recrod-name属性组合排序。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序依据，取值有：
<li>content：DNS记录内容；</li>
<li>created_on：DNS记录创建时间；</li>
<li>mode：代理模式；</li>
<li>record-name：DNS记录名称；</li>
<li>ttl：解析记录生效时间；</li>
<li>record-type：DNS记录类型。</li>默认根据record-type, recrod-name属性组合排序。
     * @param Order 排序依据，取值有：
<li>content：DNS记录内容；</li>
<li>created_on：DNS记录创建时间；</li>
<li>mode：代理模式；</li>
<li>record-name：DNS记录名称；</li>
<li>ttl：解析记录生效时间；</li>
<li>record-type：DNS记录类型。</li>默认根据record-type, recrod-name属性组合排序。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeDnsRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDnsRecordsRequest(DescribeDnsRecordsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Match != null) {
            this.Match = new String(source.Match);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Match", this.Match);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

