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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusInstancesRequest extends AbstractModel{

    /**
    * 按照一个或者多个实例ID查询。实例ID形如：prom-xxxxxxxx。请求的实例的上限为100。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 按照【实例状态】进行过滤。
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重建中</li>
<li>5：销毁中</li>
<li>6：已停服</li>
<li>8：欠费停服中</li>
<li>9：欠费已停服</li>
</ul>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long [] InstanceStatus;

    /**
    * 按照【实例名称】进行过滤。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 按照【可用区】进行过滤。可用区形如：ap-guangzhou-1。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 按照【标签键值对】进行过滤。tag-key使用具体的标签键进行替换。
    */
    @SerializedName("TagFilters")
    @Expose
    private PrometheusTag [] TagFilters;

    /**
    * 按照【实例的IPv4地址】进行过滤。
    */
    @SerializedName("IPv4Address")
    @Expose
    private String [] IPv4Address;

    /**
    * 返回数量，默认为20，最大值为100。
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
    * 按照【计费类型】进行过滤。
<li>2：包年包月</li>
<li>3：按量</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
     * Get 按照一个或者多个实例ID查询。实例ID形如：prom-xxxxxxxx。请求的实例的上限为100。 
     * @return InstanceIds 按照一个或者多个实例ID查询。实例ID形如：prom-xxxxxxxx。请求的实例的上限为100。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 按照一个或者多个实例ID查询。实例ID形如：prom-xxxxxxxx。请求的实例的上限为100。
     * @param InstanceIds 按照一个或者多个实例ID查询。实例ID形如：prom-xxxxxxxx。请求的实例的上限为100。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 按照【实例状态】进行过滤。
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重建中</li>
<li>5：销毁中</li>
<li>6：已停服</li>
<li>8：欠费停服中</li>
<li>9：欠费已停服</li>
</ul> 
     * @return InstanceStatus 按照【实例状态】进行过滤。
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重建中</li>
<li>5：销毁中</li>
<li>6：已停服</li>
<li>8：欠费停服中</li>
<li>9：欠费已停服</li>
</ul>
     */
    public Long [] getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 按照【实例状态】进行过滤。
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重建中</li>
<li>5：销毁中</li>
<li>6：已停服</li>
<li>8：欠费停服中</li>
<li>9：欠费已停服</li>
</ul>
     * @param InstanceStatus 按照【实例状态】进行过滤。
<ul>
<li>1：正在创建</li>
<li>2：运行中</li>
<li>3：异常</li>
<li>4：重建中</li>
<li>5：销毁中</li>
<li>6：已停服</li>
<li>8：欠费停服中</li>
<li>9：欠费已停服</li>
</ul>
     */
    public void setInstanceStatus(Long [] InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 按照【实例名称】进行过滤。 
     * @return InstanceName 按照【实例名称】进行过滤。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 按照【实例名称】进行过滤。
     * @param InstanceName 按照【实例名称】进行过滤。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 按照【可用区】进行过滤。可用区形如：ap-guangzhou-1。 
     * @return Zones 按照【可用区】进行过滤。可用区形如：ap-guangzhou-1。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 按照【可用区】进行过滤。可用区形如：ap-guangzhou-1。
     * @param Zones 按照【可用区】进行过滤。可用区形如：ap-guangzhou-1。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 按照【标签键值对】进行过滤。tag-key使用具体的标签键进行替换。 
     * @return TagFilters 按照【标签键值对】进行过滤。tag-key使用具体的标签键进行替换。
     */
    public PrometheusTag [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 按照【标签键值对】进行过滤。tag-key使用具体的标签键进行替换。
     * @param TagFilters 按照【标签键值对】进行过滤。tag-key使用具体的标签键进行替换。
     */
    public void setTagFilters(PrometheusTag [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get 按照【实例的IPv4地址】进行过滤。 
     * @return IPv4Address 按照【实例的IPv4地址】进行过滤。
     */
    public String [] getIPv4Address() {
        return this.IPv4Address;
    }

    /**
     * Set 按照【实例的IPv4地址】进行过滤。
     * @param IPv4Address 按照【实例的IPv4地址】进行过滤。
     */
    public void setIPv4Address(String [] IPv4Address) {
        this.IPv4Address = IPv4Address;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
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
     * Get 按照【计费类型】进行过滤。
<li>2：包年包月</li>
<li>3：按量</li> 
     * @return InstanceChargeType 按照【计费类型】进行过滤。
<li>2：包年包月</li>
<li>3：按量</li>
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 按照【计费类型】进行过滤。
<li>2：包年包月</li>
<li>3：按量</li>
     * @param InstanceChargeType 按照【计费类型】进行过滤。
<li>2：包年包月</li>
<li>3：按量</li>
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    public DescribePrometheusInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusInstancesRequest(DescribePrometheusInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long[source.InstanceStatus.length];
            for (int i = 0; i < source.InstanceStatus.length; i++) {
                this.InstanceStatus[i] = new Long(source.InstanceStatus[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new PrometheusTag[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new PrometheusTag(source.TagFilters[i]);
            }
        }
        if (source.IPv4Address != null) {
            this.IPv4Address = new String[source.IPv4Address.length];
            for (int i = 0; i < source.IPv4Address.length; i++) {
                this.IPv4Address[i] = new String(source.IPv4Address[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceStatus.", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamArraySimple(map, prefix + "IPv4Address.", this.IPv4Address);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);

    }
}

