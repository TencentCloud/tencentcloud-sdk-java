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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlowLogsRequest extends AbstractModel {

    /**
    * 私用网络唯一ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 流日志唯一ID。可通过[CreateFlowLog](https://cloud.tencent.com/document/product/215/35015)接口创建。
    */
    @SerializedName("FlowLogId")
    @Expose
    private String FlowLogId;

    /**
    * 流日志实例名字。
    */
    @SerializedName("FlowLogName")
    @Expose
    private String FlowLogName;

    /**
    * 流日志所属资源类型：VPC(私有网络)，SUBNET（子网），NETWORKINTERFACE（网卡），CCN（云联网），NAT（网络地址转化），DCG（专线网关）。

    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源唯一ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 流日志采集类型，ACCEPT（允许），REJECT（拒绝），ALL（全部）。
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * 流日志存储ID。
    */
    @SerializedName("CloudLogId")
    @Expose
    private String CloudLogId;

    /**
    * 流日志存储ID状态。SUCCESS（成功），DELETED（删除）
    */
    @SerializedName("CloudLogState")
    @Expose
    private String CloudLogState;

    /**
    * 按某个字段排序,支持字段：flowLogName,createTime，默认按createTime。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 升序（ASC）还是降序（DESC）,默认：DESC。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页行数，默认为10。范围1-100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，参数不支持同时指定FlowLogId和Filters。
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
    * 流日志存储ID对应的地域信息。
    */
    @SerializedName("CloudLogRegion")
    @Expose
    private String CloudLogRegion;

    /**
     * Get 私用网络唯一ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。 
     * @return VpcId 私用网络唯一ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私用网络唯一ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
     * @param VpcId 私用网络唯一ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 流日志唯一ID。可通过[CreateFlowLog](https://cloud.tencent.com/document/product/215/35015)接口创建。 
     * @return FlowLogId 流日志唯一ID。可通过[CreateFlowLog](https://cloud.tencent.com/document/product/215/35015)接口创建。
     */
    public String getFlowLogId() {
        return this.FlowLogId;
    }

    /**
     * Set 流日志唯一ID。可通过[CreateFlowLog](https://cloud.tencent.com/document/product/215/35015)接口创建。
     * @param FlowLogId 流日志唯一ID。可通过[CreateFlowLog](https://cloud.tencent.com/document/product/215/35015)接口创建。
     */
    public void setFlowLogId(String FlowLogId) {
        this.FlowLogId = FlowLogId;
    }

    /**
     * Get 流日志实例名字。 
     * @return FlowLogName 流日志实例名字。
     */
    public String getFlowLogName() {
        return this.FlowLogName;
    }

    /**
     * Set 流日志实例名字。
     * @param FlowLogName 流日志实例名字。
     */
    public void setFlowLogName(String FlowLogName) {
        this.FlowLogName = FlowLogName;
    }

    /**
     * Get 流日志所属资源类型：VPC(私有网络)，SUBNET（子网），NETWORKINTERFACE（网卡），CCN（云联网），NAT（网络地址转化），DCG（专线网关）。
 
     * @return ResourceType 流日志所属资源类型：VPC(私有网络)，SUBNET（子网），NETWORKINTERFACE（网卡），CCN（云联网），NAT（网络地址转化），DCG（专线网关）。

     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 流日志所属资源类型：VPC(私有网络)，SUBNET（子网），NETWORKINTERFACE（网卡），CCN（云联网），NAT（网络地址转化），DCG（专线网关）。

     * @param ResourceType 流日志所属资源类型：VPC(私有网络)，SUBNET（子网），NETWORKINTERFACE（网卡），CCN（云联网），NAT（网络地址转化），DCG（专线网关）。

     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源唯一ID。 
     * @return ResourceId 资源唯一ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源唯一ID。
     * @param ResourceId 资源唯一ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 流日志采集类型，ACCEPT（允许），REJECT（拒绝），ALL（全部）。 
     * @return TrafficType 流日志采集类型，ACCEPT（允许），REJECT（拒绝），ALL（全部）。
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set 流日志采集类型，ACCEPT（允许），REJECT（拒绝），ALL（全部）。
     * @param TrafficType 流日志采集类型，ACCEPT（允许），REJECT（拒绝），ALL（全部）。
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get 流日志存储ID。 
     * @return CloudLogId 流日志存储ID。
     */
    public String getCloudLogId() {
        return this.CloudLogId;
    }

    /**
     * Set 流日志存储ID。
     * @param CloudLogId 流日志存储ID。
     */
    public void setCloudLogId(String CloudLogId) {
        this.CloudLogId = CloudLogId;
    }

    /**
     * Get 流日志存储ID状态。SUCCESS（成功），DELETED（删除） 
     * @return CloudLogState 流日志存储ID状态。SUCCESS（成功），DELETED（删除）
     */
    public String getCloudLogState() {
        return this.CloudLogState;
    }

    /**
     * Set 流日志存储ID状态。SUCCESS（成功），DELETED（删除）
     * @param CloudLogState 流日志存储ID状态。SUCCESS（成功），DELETED（删除）
     */
    public void setCloudLogState(String CloudLogState) {
        this.CloudLogState = CloudLogState;
    }

    /**
     * Get 按某个字段排序,支持字段：flowLogName,createTime，默认按createTime。 
     * @return OrderField 按某个字段排序,支持字段：flowLogName,createTime，默认按createTime。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 按某个字段排序,支持字段：flowLogName,createTime，默认按createTime。
     * @param OrderField 按某个字段排序,支持字段：flowLogName,createTime，默认按createTime。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 升序（ASC）还是降序（DESC）,默认：DESC。 
     * @return OrderDirection 升序（ASC）还是降序（DESC）,默认：DESC。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 升序（ASC）还是降序（DESC）,默认：DESC。
     * @param OrderDirection 升序（ASC）还是降序（DESC）,默认：DESC。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
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
     * Get 每页行数，默认为10。范围1-100。 
     * @return Limit 每页行数，默认为10。范围1-100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页行数，默认为10。范围1-100。
     * @param Limit 每页行数，默认为10。范围1-100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，参数不支持同时指定FlowLogId和Filters。
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。</li> 
     * @return Filters 过滤条件，参数不支持同时指定FlowLogId和Filters。
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。</li>
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定FlowLogId和Filters。
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。</li>
     * @param Filters 过滤条件，参数不支持同时指定FlowLogId和Filters。
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。</li>
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 流日志存储ID对应的地域信息。 
     * @return CloudLogRegion 流日志存储ID对应的地域信息。
     */
    public String getCloudLogRegion() {
        return this.CloudLogRegion;
    }

    /**
     * Set 流日志存储ID对应的地域信息。
     * @param CloudLogRegion 流日志存储ID对应的地域信息。
     */
    public void setCloudLogRegion(String CloudLogRegion) {
        this.CloudLogRegion = CloudLogRegion;
    }

    public DescribeFlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowLogsRequest(DescribeFlowLogsRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.FlowLogId != null) {
            this.FlowLogId = new String(source.FlowLogId);
        }
        if (source.FlowLogName != null) {
            this.FlowLogName = new String(source.FlowLogName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TrafficType != null) {
            this.TrafficType = new String(source.TrafficType);
        }
        if (source.CloudLogId != null) {
            this.CloudLogId = new String(source.CloudLogId);
        }
        if (source.CloudLogState != null) {
            this.CloudLogState = new String(source.CloudLogState);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter(source.Filters);
        }
        if (source.CloudLogRegion != null) {
            this.CloudLogRegion = new String(source.CloudLogRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "FlowLogId", this.FlowLogId);
        this.setParamSimple(map, prefix + "FlowLogName", this.FlowLogName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "CloudLogId", this.CloudLogId);
        this.setParamSimple(map, prefix + "CloudLogState", this.CloudLogState);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "CloudLogRegion", this.CloudLogRegion);

    }
}

