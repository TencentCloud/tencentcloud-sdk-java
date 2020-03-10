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

public class DescribeEipAclsRequest extends AbstractModel{

    /**
    * ACL 名称，支持模糊查找
    */
    @SerializedName("AclName")
    @Expose
    private String AclName;

    /**
    * ACL 实例 ID 列表，数组下标从 0 开始
    */
    @SerializedName("AclIds")
    @Expose
    private String [] AclIds;

    /**
    * 分页参数。偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数。每一页的 EIPACL 列表数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * EIP实例ID列表
    */
    @SerializedName("EipIds")
    @Expose
    private String [] EipIds;

    /**
    * EIP IP地址列表
    */
    @SerializedName("EipIps")
    @Expose
    private String [] EipIps;

    /**
    * EIP名称列表
    */
    @SerializedName("EipNames")
    @Expose
    private String [] EipNames;

    /**
    * 排序字段
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式，取值：0:增序(默认)，1:降序
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * ACL名称列表，支持模糊查找
    */
    @SerializedName("AclNames")
    @Expose
    private String [] AclNames;

    /**
     * Get ACL 名称，支持模糊查找 
     * @return AclName ACL 名称，支持模糊查找
     */
    public String getAclName() {
        return this.AclName;
    }

    /**
     * Set ACL 名称，支持模糊查找
     * @param AclName ACL 名称，支持模糊查找
     */
    public void setAclName(String AclName) {
        this.AclName = AclName;
    }

    /**
     * Get ACL 实例 ID 列表，数组下标从 0 开始 
     * @return AclIds ACL 实例 ID 列表，数组下标从 0 开始
     */
    public String [] getAclIds() {
        return this.AclIds;
    }

    /**
     * Set ACL 实例 ID 列表，数组下标从 0 开始
     * @param AclIds ACL 实例 ID 列表，数组下标从 0 开始
     */
    public void setAclIds(String [] AclIds) {
        this.AclIds = AclIds;
    }

    /**
     * Get 分页参数。偏移量，默认为 0 
     * @return Offset 分页参数。偏移量，默认为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数。偏移量，默认为 0
     * @param Offset 分页参数。偏移量，默认为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数。每一页的 EIPACL 列表数目 
     * @return Limit 分页参数。每一页的 EIPACL 列表数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数。每一页的 EIPACL 列表数目
     * @param Limit 分页参数。每一页的 EIPACL 列表数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

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
     * Get EIP IP地址列表 
     * @return EipIps EIP IP地址列表
     */
    public String [] getEipIps() {
        return this.EipIps;
    }

    /**
     * Set EIP IP地址列表
     * @param EipIps EIP IP地址列表
     */
    public void setEipIps(String [] EipIps) {
        this.EipIps = EipIps;
    }

    /**
     * Get EIP名称列表 
     * @return EipNames EIP名称列表
     */
    public String [] getEipNames() {
        return this.EipNames;
    }

    /**
     * Set EIP名称列表
     * @param EipNames EIP名称列表
     */
    public void setEipNames(String [] EipNames) {
        this.EipNames = EipNames;
    }

    /**
     * Get 排序字段 
     * @return OrderField 排序字段
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段
     * @param OrderField 排序字段
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方式，取值：0:增序(默认)，1:降序 
     * @return Order 排序方式，取值：0:增序(默认)，1:降序
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，取值：0:增序(默认)，1:降序
     * @param Order 排序方式，取值：0:增序(默认)，1:降序
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get ACL名称列表，支持模糊查找 
     * @return AclNames ACL名称列表，支持模糊查找
     */
    public String [] getAclNames() {
        return this.AclNames;
    }

    /**
     * Set ACL名称列表，支持模糊查找
     * @param AclNames ACL名称列表，支持模糊查找
     */
    public void setAclNames(String [] AclNames) {
        this.AclNames = AclNames;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AclName", this.AclName);
        this.setParamArraySimple(map, prefix + "AclIds.", this.AclIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "EipIds.", this.EipIds);
        this.setParamArraySimple(map, prefix + "EipIps.", this.EipIps);
        this.setParamArraySimple(map, prefix + "EipNames.", this.EipNames);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArraySimple(map, prefix + "AclNames.", this.AclNames);

    }
}

