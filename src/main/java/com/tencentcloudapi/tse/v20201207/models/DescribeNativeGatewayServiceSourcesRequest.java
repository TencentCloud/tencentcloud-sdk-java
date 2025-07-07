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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNativeGatewayServiceSourcesRequest extends AbstractModel {

    /**
    * 网关实例ID
    */
    @SerializedName("GatewayID")
    @Expose
    private String GatewayID;

    /**
    * 单页条数，最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 服务来源实例名称，模糊搜索
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 微服务引擎类型：TSE-Nacos｜TSE-Consul｜TSE-PolarisMesh｜Customer-Nacos｜Customer-Consul｜Customer-PolarisMesh
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

    /**
    * 排序字段类型，当前仅支持SourceName
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序类型，AES/DESC
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get 网关实例ID 
     * @return GatewayID 网关实例ID
     */
    public String getGatewayID() {
        return this.GatewayID;
    }

    /**
     * Set 网关实例ID
     * @param GatewayID 网关实例ID
     */
    public void setGatewayID(String GatewayID) {
        this.GatewayID = GatewayID;
    }

    /**
     * Get 单页条数，最大100 
     * @return Limit 单页条数，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页条数，最大100
     * @param Limit 单页条数，最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 服务来源实例名称，模糊搜索 
     * @return SourceName 服务来源实例名称，模糊搜索
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 服务来源实例名称，模糊搜索
     * @param SourceName 服务来源实例名称，模糊搜索
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 微服务引擎类型：TSE-Nacos｜TSE-Consul｜TSE-PolarisMesh｜Customer-Nacos｜Customer-Consul｜Customer-PolarisMesh 
     * @return SourceTypes 微服务引擎类型：TSE-Nacos｜TSE-Consul｜TSE-PolarisMesh｜Customer-Nacos｜Customer-Consul｜Customer-PolarisMesh
     */
    public String [] getSourceTypes() {
        return this.SourceTypes;
    }

    /**
     * Set 微服务引擎类型：TSE-Nacos｜TSE-Consul｜TSE-PolarisMesh｜Customer-Nacos｜Customer-Consul｜Customer-PolarisMesh
     * @param SourceTypes 微服务引擎类型：TSE-Nacos｜TSE-Consul｜TSE-PolarisMesh｜Customer-Nacos｜Customer-Consul｜Customer-PolarisMesh
     */
    public void setSourceTypes(String [] SourceTypes) {
        this.SourceTypes = SourceTypes;
    }

    /**
     * Get 排序字段类型，当前仅支持SourceName 
     * @return OrderField 排序字段类型，当前仅支持SourceName
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段类型，当前仅支持SourceName
     * @param OrderField 排序字段类型，当前仅支持SourceName
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序类型，AES/DESC 
     * @return OrderType 排序类型，AES/DESC
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序类型，AES/DESC
     * @param OrderType 排序类型，AES/DESC
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public DescribeNativeGatewayServiceSourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNativeGatewayServiceSourcesRequest(DescribeNativeGatewayServiceSourcesRequest source) {
        if (source.GatewayID != null) {
            this.GatewayID = new String(source.GatewayID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.SourceTypes != null) {
            this.SourceTypes = new String[source.SourceTypes.length];
            for (int i = 0; i < source.SourceTypes.length; i++) {
                this.SourceTypes[i] = new String(source.SourceTypes[i]);
            }
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayID", this.GatewayID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamArraySimple(map, prefix + "SourceTypes.", this.SourceTypes);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

