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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatGatewaysRequest extends AbstractModel{

    /**
    * NAT网关ID，例如：nat-kdm476mp
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * NAT名称
    */
    @SerializedName("NatName")
    @Expose
    private String NatName;

    /**
    * 搜索字段
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 私有网络ID，例如：vpc-kd7d06of
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 起始值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 偏移值，默认值为 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * NAT所在可用区，形如：ap-guangzhou-2。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 排序字段, 支持"CreateTime"排序
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方向, “asc”、“desc”
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get NAT网关ID，例如：nat-kdm476mp 
     * @return NatId NAT网关ID，例如：nat-kdm476mp
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set NAT网关ID，例如：nat-kdm476mp
     * @param NatId NAT网关ID，例如：nat-kdm476mp
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get NAT名称 
     * @return NatName NAT名称
     */
    public String getNatName() {
        return this.NatName;
    }

    /**
     * Set NAT名称
     * @param NatName NAT名称
     */
    public void setNatName(String NatName) {
        this.NatName = NatName;
    }

    /**
     * Get 搜索字段 
     * @return SearchKey 搜索字段
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索字段
     * @param SearchKey 搜索字段
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 私有网络ID，例如：vpc-kd7d06of 
     * @return VpcId 私有网络ID，例如：vpc-kd7d06of
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，例如：vpc-kd7d06of
     * @param VpcId 私有网络ID，例如：vpc-kd7d06of
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 起始值 
     * @return Offset 起始值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始值
     * @param Offset 起始值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 偏移值，默认值为 20 
     * @return Limit 偏移值，默认值为 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 偏移值，默认值为 20
     * @param Limit 偏移值，默认值为 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get NAT所在可用区，形如：ap-guangzhou-2。 
     * @return Zone NAT所在可用区，形如：ap-guangzhou-2。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set NAT所在可用区，形如：ap-guangzhou-2。
     * @param Zone NAT所在可用区，形如：ap-guangzhou-2。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 排序字段, 支持"CreateTime"排序 
     * @return OrderField 排序字段, 支持"CreateTime"排序
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段, 支持"CreateTime"排序
     * @param OrderField 排序字段, 支持"CreateTime"排序
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方向, “asc”、“desc” 
     * @return OrderDirection 排序方向, “asc”、“desc”
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方向, “asc”、“desc”
     * @param OrderDirection 排序方向, “asc”、“desc”
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamSimple(map, prefix + "NatName", this.NatName);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

