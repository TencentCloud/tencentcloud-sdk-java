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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCommonDBInstancesRequest extends AbstractModel{

    /**
    * 实例Vip信息列表
    */
    @SerializedName("VpcIds")
    @Expose
    private Long [] VpcIds;

    /**
    * 子网id信息列表
    */
    @SerializedName("SubnetIds")
    @Expose
    private Long [] SubnetIds;

    /**
    * 计费类型过滤列表；0表示包年包月，1表示按量计费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例id过滤信息列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例名称过滤信息列表
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * 实例状态信息过滤列表
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 排序字段
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 实例vip信息列表
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * vpc网络统一Id列表
    */
    @SerializedName("UniqVpcIds")
    @Expose
    private String [] UniqVpcIds;

    /**
    * 子网统一id列表
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * 数量限制，默认推荐100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例Vip信息列表 
     * @return VpcIds 实例Vip信息列表
     */
    public Long [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set 实例Vip信息列表
     * @param VpcIds 实例Vip信息列表
     */
    public void setVpcIds(Long [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get 子网id信息列表 
     * @return SubnetIds 子网id信息列表
     */
    public Long [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网id信息列表
     * @param SubnetIds 子网id信息列表
     */
    public void setSubnetIds(Long [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 计费类型过滤列表；0表示包年包月，1表示按量计费 
     * @return PayMode 计费类型过滤列表；0表示包年包月，1表示按量计费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费类型过滤列表；0表示包年包月，1表示按量计费
     * @param PayMode 计费类型过滤列表；0表示包年包月，1表示按量计费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例id过滤信息列表 
     * @return InstanceIds 实例id过滤信息列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例id过滤信息列表
     * @param InstanceIds 实例id过滤信息列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 实例名称过滤信息列表 
     * @return InstanceNames 实例名称过滤信息列表
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set 实例名称过滤信息列表
     * @param InstanceNames 实例名称过滤信息列表
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get 实例状态信息过滤列表 
     * @return Status 实例状态信息过滤列表
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态信息过滤列表
     * @param Status 实例状态信息过滤列表
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 排序字段 
     * @return OrderBy 排序字段
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段
     * @param OrderBy 排序字段
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式 
     * @return OrderByType 排序方式
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式
     * @param OrderByType 排序方式
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 实例vip信息列表 
     * @return Vips 实例vip信息列表
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set 实例vip信息列表
     * @param Vips 实例vip信息列表
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get vpc网络统一Id列表 
     * @return UniqVpcIds vpc网络统一Id列表
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * Set vpc网络统一Id列表
     * @param UniqVpcIds vpc网络统一Id列表
     */
    public void setUniqVpcIds(String [] UniqVpcIds) {
        this.UniqVpcIds = UniqVpcIds;
    }

    /**
     * Get 子网统一id列表 
     * @return UniqSubnetIds 子网统一id列表
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set 子网统一id列表
     * @param UniqSubnetIds 子网统一id列表
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get 数量限制，默认推荐100 
     * @return Limit 数量限制，默认推荐100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量限制，默认推荐100
     * @param Limit 数量限制，默认推荐100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认0 
     * @return Offset 偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0
     * @param Offset 偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);
        this.setParamArraySimple(map, prefix + "UniqVpcIds.", this.UniqVpcIds);
        this.setParamArraySimple(map, prefix + "UniqSubnetIds.", this.UniqSubnetIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

