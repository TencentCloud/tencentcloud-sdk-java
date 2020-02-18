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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEipsRequest extends AbstractModel{

    /**
    * EIP实例ID列表
    */
    @SerializedName("EipIds")
    @Expose
    private String [] EipIds;

    /**
    * EIP IP 列表
    */
    @SerializedName("Eips")
    @Expose
    private String [] Eips;

    /**
    * 主机实例ID 列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * EIP名称,模糊匹配
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 状态列表, 默认所有
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回EIP数量，默认 20, 最大值 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段，支持： EipId,Eip,Status, InstanceId,CreatedAt
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式 0:递增 1:递减(默认)
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 计费模式,流量：flow，带宽：bandwidth
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * EIP归属VpcId，例如vpc-k7j1t2x1
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 绑定类型，-1：未绑定，0：物理机，1：nat网关，2：虚拟IP, 3:托管机器
    */
    @SerializedName("BindTypes")
    @Expose
    private Long [] BindTypes;

    /**
    * 独占标志，0：共享，1：独占
    */
    @SerializedName("ExclusiveTag")
    @Expose
    private Long ExclusiveTag;

    /**
    * EIP ACL实例ID
    */
    @SerializedName("AclId")
    @Expose
    private String AclId;

    /**
    * 搜索条件，是否绑定了EIP ACL， 0：未绑定，1：绑定
    */
    @SerializedName("BindAcl")
    @Expose
    private Long BindAcl;

    /**
     * Get EIP实例ID列表 
     * @return EipIds EIP实例ID列表
     */
    public String [] getEipIds() {
        return this.EipIds;
    }

    /**
     * Set EIP实例ID列表
     * @param EipIds EIP实例ID列表
     */
    public void setEipIds(String [] EipIds) {
        this.EipIds = EipIds;
    }

    /**
     * Get EIP IP 列表 
     * @return Eips EIP IP 列表
     */
    public String [] getEips() {
        return this.Eips;
    }

    /**
     * Set EIP IP 列表
     * @param Eips EIP IP 列表
     */
    public void setEips(String [] Eips) {
        this.Eips = Eips;
    }

    /**
     * Get 主机实例ID 列表 
     * @return InstanceIds 主机实例ID 列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 主机实例ID 列表
     * @param InstanceIds 主机实例ID 列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get EIP名称,模糊匹配 
     * @return SearchKey EIP名称,模糊匹配
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set EIP名称,模糊匹配
     * @param SearchKey EIP名称,模糊匹配
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 状态列表, 默认所有 
     * @return Status 状态列表, 默认所有
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 状态列表, 默认所有
     * @param Status 状态列表, 默认所有
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回EIP数量，默认 20, 最大值 100 
     * @return Limit 返回EIP数量，默认 20, 最大值 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回EIP数量，默认 20, 最大值 100
     * @param Limit 返回EIP数量，默认 20, 最大值 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段，支持： EipId,Eip,Status, InstanceId,CreatedAt 
     * @return OrderField 排序字段，支持： EipId,Eip,Status, InstanceId,CreatedAt
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段，支持： EipId,Eip,Status, InstanceId,CreatedAt
     * @param OrderField 排序字段，支持： EipId,Eip,Status, InstanceId,CreatedAt
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方式 0:递增 1:递减(默认) 
     * @return Order 排序方式 0:递增 1:递减(默认)
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式 0:递增 1:递减(默认)
     * @param Order 排序方式 0:递增 1:递减(默认)
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 计费模式,流量：flow，带宽：bandwidth 
     * @return PayMode 计费模式,流量：flow，带宽：bandwidth
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式,流量：flow，带宽：bandwidth
     * @param PayMode 计费模式,流量：flow，带宽：bandwidth
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get EIP归属VpcId，例如vpc-k7j1t2x1 
     * @return VpcId EIP归属VpcId，例如vpc-k7j1t2x1
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set EIP归属VpcId，例如vpc-k7j1t2x1
     * @param VpcId EIP归属VpcId，例如vpc-k7j1t2x1
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 绑定类型，-1：未绑定，0：物理机，1：nat网关，2：虚拟IP, 3:托管机器 
     * @return BindTypes 绑定类型，-1：未绑定，0：物理机，1：nat网关，2：虚拟IP, 3:托管机器
     */
    public Long [] getBindTypes() {
        return this.BindTypes;
    }

    /**
     * Set 绑定类型，-1：未绑定，0：物理机，1：nat网关，2：虚拟IP, 3:托管机器
     * @param BindTypes 绑定类型，-1：未绑定，0：物理机，1：nat网关，2：虚拟IP, 3:托管机器
     */
    public void setBindTypes(Long [] BindTypes) {
        this.BindTypes = BindTypes;
    }

    /**
     * Get 独占标志，0：共享，1：独占 
     * @return ExclusiveTag 独占标志，0：共享，1：独占
     */
    public Long getExclusiveTag() {
        return this.ExclusiveTag;
    }

    /**
     * Set 独占标志，0：共享，1：独占
     * @param ExclusiveTag 独占标志，0：共享，1：独占
     */
    public void setExclusiveTag(Long ExclusiveTag) {
        this.ExclusiveTag = ExclusiveTag;
    }

    /**
     * Get EIP ACL实例ID 
     * @return AclId EIP ACL实例ID
     */
    public String getAclId() {
        return this.AclId;
    }

    /**
     * Set EIP ACL实例ID
     * @param AclId EIP ACL实例ID
     */
    public void setAclId(String AclId) {
        this.AclId = AclId;
    }

    /**
     * Get 搜索条件，是否绑定了EIP ACL， 0：未绑定，1：绑定 
     * @return BindAcl 搜索条件，是否绑定了EIP ACL， 0：未绑定，1：绑定
     */
    public Long getBindAcl() {
        return this.BindAcl;
    }

    /**
     * Set 搜索条件，是否绑定了EIP ACL， 0：未绑定，1：绑定
     * @param BindAcl 搜索条件，是否绑定了EIP ACL， 0：未绑定，1：绑定
     */
    public void setBindAcl(Long BindAcl) {
        this.BindAcl = BindAcl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EipIds.", this.EipIds);
        this.setParamArraySimple(map, prefix + "Eips.", this.Eips);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "BindTypes.", this.BindTypes);
        this.setParamSimple(map, prefix + "ExclusiveTag", this.ExclusiveTag);
        this.setParamSimple(map, prefix + "AclId", this.AclId);
        this.setParamSimple(map, prefix + "BindAcl", this.BindAcl);

    }
}

