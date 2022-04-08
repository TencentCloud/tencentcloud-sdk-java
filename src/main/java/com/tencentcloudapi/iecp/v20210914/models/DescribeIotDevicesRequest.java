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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIotDevicesRequest extends AbstractModel{

    /**
    * 页偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 产品id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称模糊查找
    */
    @SerializedName("NamePattern")
    @Expose
    private String NamePattern;

    /**
    * 版本列表
    */
    @SerializedName("Versions")
    @Expose
    private String [] Versions;

    /**
    * ASC 或 DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 页偏移 
     * @return Offset 页偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页偏移
     * @param Offset 页偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量 
     * @return Limit 每页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量
     * @param Limit 每页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 产品id 
     * @return ProductId 产品id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品id
     * @param ProductId 产品id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称模糊查找 
     * @return NamePattern 设备名称模糊查找
     */
    public String getNamePattern() {
        return this.NamePattern;
    }

    /**
     * Set 设备名称模糊查找
     * @param NamePattern 设备名称模糊查找
     */
    public void setNamePattern(String NamePattern) {
        this.NamePattern = NamePattern;
    }

    /**
     * Get 版本列表 
     * @return Versions 版本列表
     */
    public String [] getVersions() {
        return this.Versions;
    }

    /**
     * Set 版本列表
     * @param Versions 版本列表
     */
    public void setVersions(String [] Versions) {
        this.Versions = Versions;
    }

    /**
     * Get ASC 或 DESC 
     * @return Order ASC 或 DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set ASC 或 DESC
     * @param Order ASC 或 DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeIotDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIotDevicesRequest(DescribeIotDevicesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.NamePattern != null) {
            this.NamePattern = new String(source.NamePattern);
        }
        if (source.Versions != null) {
            this.Versions = new String[source.Versions.length];
            for (int i = 0; i < source.Versions.length; i++) {
                this.Versions[i] = new String(source.Versions[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "NamePattern", this.NamePattern);
        this.setParamArraySimple(map, prefix + "Versions.", this.Versions);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

