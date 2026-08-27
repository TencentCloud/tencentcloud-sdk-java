/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHaVipsRequest extends AbstractModel {

    /**
    * <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p>
    */
    @SerializedName("HaVipIds")
    @Expose
    private String [] HaVipIds;

    /**
    * <p>过滤条件，参数不支持同时指定<code>HaVipIds</code>和<code>Filters</code>。Filter 数量限制为10个，以及单Filter 的value值限制为5个。<li>havip-id - String - <code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</li><li>havip-name - String - <code>HAVIP</code>名称。</li><li>vpc-id - String - <code>HAVIP</code>所在私有网络<code>ID</code>。</li><li>subnet-id - String - <code>HAVIP</code>所在子网<code>ID</code>。</li><li>vip - String - <code>HAVIP</code>的地址<code>VIP</code>。</li><li>address-ip - String - <code>HAVIP</code>绑定的弹性公网<code>IP</code>。</li><li>havip-association.instance-id - String - <code>HAVIP</code>绑定的子机或网卡。</li><li>havip-association.instance-type - String - <code>HAVIP</code>绑定的类型，取值:CVM, ENI。</li><li>check-associate - Bool - 是否开启HaVip飘移时校验绑定的子机或网卡。</li><li>cdc-id - String - CDC实例ID。</li></p><li>type - String - HAVIP类型。取值: NORMAL(普通); GWLB(网关负载均衡); OPTIMIZATION(优化模式)。</li><li>termination-protection - String - 删除保护。取值: true; false。</li><li>traffic-protection - String - 流量保护。取值: true; false。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p> 
     * @return HaVipIds <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p>
     */
    public String [] getHaVipIds() {
        return this.HaVipIds;
    }

    /**
     * Set <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p>
     * @param HaVipIds <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p>
     */
    public void setHaVipIds(String [] HaVipIds) {
        this.HaVipIds = HaVipIds;
    }

    /**
     * Get <p>过滤条件，参数不支持同时指定<code>HaVipIds</code>和<code>Filters</code>。Filter 数量限制为10个，以及单Filter 的value值限制为5个。<li>havip-id - String - <code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</li><li>havip-name - String - <code>HAVIP</code>名称。</li><li>vpc-id - String - <code>HAVIP</code>所在私有网络<code>ID</code>。</li><li>subnet-id - String - <code>HAVIP</code>所在子网<code>ID</code>。</li><li>vip - String - <code>HAVIP</code>的地址<code>VIP</code>。</li><li>address-ip - String - <code>HAVIP</code>绑定的弹性公网<code>IP</code>。</li><li>havip-association.instance-id - String - <code>HAVIP</code>绑定的子机或网卡。</li><li>havip-association.instance-type - String - <code>HAVIP</code>绑定的类型，取值:CVM, ENI。</li><li>check-associate - Bool - 是否开启HaVip飘移时校验绑定的子机或网卡。</li><li>cdc-id - String - CDC实例ID。</li></p><li>type - String - HAVIP类型。取值: NORMAL(普通); GWLB(网关负载均衡); OPTIMIZATION(优化模式)。</li><li>termination-protection - String - 删除保护。取值: true; false。</li><li>traffic-protection - String - 流量保护。取值: true; false。</li> 
     * @return Filters <p>过滤条件，参数不支持同时指定<code>HaVipIds</code>和<code>Filters</code>。Filter 数量限制为10个，以及单Filter 的value值限制为5个。<li>havip-id - String - <code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</li><li>havip-name - String - <code>HAVIP</code>名称。</li><li>vpc-id - String - <code>HAVIP</code>所在私有网络<code>ID</code>。</li><li>subnet-id - String - <code>HAVIP</code>所在子网<code>ID</code>。</li><li>vip - String - <code>HAVIP</code>的地址<code>VIP</code>。</li><li>address-ip - String - <code>HAVIP</code>绑定的弹性公网<code>IP</code>。</li><li>havip-association.instance-id - String - <code>HAVIP</code>绑定的子机或网卡。</li><li>havip-association.instance-type - String - <code>HAVIP</code>绑定的类型，取值:CVM, ENI。</li><li>check-associate - Bool - 是否开启HaVip飘移时校验绑定的子机或网卡。</li><li>cdc-id - String - CDC实例ID。</li></p><li>type - String - HAVIP类型。取值: NORMAL(普通); GWLB(网关负载均衡); OPTIMIZATION(优化模式)。</li><li>termination-protection - String - 删除保护。取值: true; false。</li><li>traffic-protection - String - 流量保护。取值: true; false。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，参数不支持同时指定<code>HaVipIds</code>和<code>Filters</code>。Filter 数量限制为10个，以及单Filter 的value值限制为5个。<li>havip-id - String - <code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</li><li>havip-name - String - <code>HAVIP</code>名称。</li><li>vpc-id - String - <code>HAVIP</code>所在私有网络<code>ID</code>。</li><li>subnet-id - String - <code>HAVIP</code>所在子网<code>ID</code>。</li><li>vip - String - <code>HAVIP</code>的地址<code>VIP</code>。</li><li>address-ip - String - <code>HAVIP</code>绑定的弹性公网<code>IP</code>。</li><li>havip-association.instance-id - String - <code>HAVIP</code>绑定的子机或网卡。</li><li>havip-association.instance-type - String - <code>HAVIP</code>绑定的类型，取值:CVM, ENI。</li><li>check-associate - Bool - 是否开启HaVip飘移时校验绑定的子机或网卡。</li><li>cdc-id - String - CDC实例ID。</li></p><li>type - String - HAVIP类型。取值: NORMAL(普通); GWLB(网关负载均衡); OPTIMIZATION(优化模式)。</li><li>termination-protection - String - 删除保护。取值: true; false。</li><li>traffic-protection - String - 流量保护。取值: true; false。</li>
     * @param Filters <p>过滤条件，参数不支持同时指定<code>HaVipIds</code>和<code>Filters</code>。Filter 数量限制为10个，以及单Filter 的value值限制为5个。<li>havip-id - String - <code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</li><li>havip-name - String - <code>HAVIP</code>名称。</li><li>vpc-id - String - <code>HAVIP</code>所在私有网络<code>ID</code>。</li><li>subnet-id - String - <code>HAVIP</code>所在子网<code>ID</code>。</li><li>vip - String - <code>HAVIP</code>的地址<code>VIP</code>。</li><li>address-ip - String - <code>HAVIP</code>绑定的弹性公网<code>IP</code>。</li><li>havip-association.instance-id - String - <code>HAVIP</code>绑定的子机或网卡。</li><li>havip-association.instance-type - String - <code>HAVIP</code>绑定的类型，取值:CVM, ENI。</li><li>check-associate - Bool - 是否开启HaVip飘移时校验绑定的子机或网卡。</li><li>cdc-id - String - CDC实例ID。</li></p><li>type - String - HAVIP类型。取值: NORMAL(普通); GWLB(网关负载均衡); OPTIMIZATION(优化模式)。</li><li>termination-protection - String - 删除保护。取值: true; false。</li><li>traffic-protection - String - 流量保护。取值: true; false。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100。</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100。</p>
     * @param Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeHaVipsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHaVipsRequest(DescribeHaVipsRequest source) {
        if (source.HaVipIds != null) {
            this.HaVipIds = new String[source.HaVipIds.length];
            for (int i = 0; i < source.HaVipIds.length; i++) {
                this.HaVipIds[i] = new String(source.HaVipIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HaVipIds.", this.HaVipIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

