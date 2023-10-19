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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatSwitchListRequest extends AbstractModel {

    /**
    * 偏移量，分页用
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 条数，分页用
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索值
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * 开关，1打开，0关闭
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 筛选NAT防火墙子网开关所属VPC
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 筛选NAT防火墙子网开关所属NAT网关
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * 筛选NAT防火墙子网开关所属NAT防火墙实例
    */
    @SerializedName("NatInsId")
    @Expose
    private String NatInsId;

    /**
    * 筛选NAT防火墙子网开关所属地域
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 偏移量，分页用 
     * @return Offset 偏移量，分页用
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，分页用
     * @param Offset 偏移量，分页用
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 条数，分页用 
     * @return Limit 条数，分页用
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 条数，分页用
     * @param Limit 条数，分页用
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索值 
     * @return SearchValue 搜索值
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 搜索值
     * @param SearchValue 搜索值
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get 开关，1打开，0关闭 
     * @return Status 开关，1打开，0关闭
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关，1打开，0关闭
     * @param Status 开关，1打开，0关闭
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 筛选NAT防火墙子网开关所属VPC 
     * @return VpcId 筛选NAT防火墙子网开关所属VPC
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 筛选NAT防火墙子网开关所属VPC
     * @param VpcId 筛选NAT防火墙子网开关所属VPC
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 筛选NAT防火墙子网开关所属NAT网关 
     * @return NatId 筛选NAT防火墙子网开关所属NAT网关
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set 筛选NAT防火墙子网开关所属NAT网关
     * @param NatId 筛选NAT防火墙子网开关所属NAT网关
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get 筛选NAT防火墙子网开关所属NAT防火墙实例 
     * @return NatInsId 筛选NAT防火墙子网开关所属NAT防火墙实例
     */
    public String getNatInsId() {
        return this.NatInsId;
    }

    /**
     * Set 筛选NAT防火墙子网开关所属NAT防火墙实例
     * @param NatInsId 筛选NAT防火墙子网开关所属NAT防火墙实例
     */
    public void setNatInsId(String NatInsId) {
        this.NatInsId = NatInsId;
    }

    /**
     * Get 筛选NAT防火墙子网开关所属地域 
     * @return Area 筛选NAT防火墙子网开关所属地域
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 筛选NAT防火墙子网开关所属地域
     * @param Area 筛选NAT防火墙子网开关所属地域
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeNatSwitchListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatSwitchListRequest(DescribeNatSwitchListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NatId != null) {
            this.NatId = new String(source.NatId);
        }
        if (source.NatInsId != null) {
            this.NatInsId = new String(source.NatInsId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamSimple(map, prefix + "NatInsId", this.NatInsId);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

