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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductDevicesPositionItem extends AbstractModel{

    /**
    * 设备位置列表
    */
    @SerializedName("Items")
    @Expose
    private DevicePositionItem [] Items;

    /**
    * 产品标识
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备位置数量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 设备位置列表 
     * @return Items 设备位置列表
     */
    public DevicePositionItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 设备位置列表
     * @param Items 设备位置列表
     */
    public void setItems(DevicePositionItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 产品标识 
     * @return ProductId 产品标识
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品标识
     * @param ProductId 产品标识
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备位置数量 
     * @return Total 设备位置数量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 设备位置数量
     * @param Total 设备位置数量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public ProductDevicesPositionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductDevicesPositionItem(ProductDevicesPositionItem source) {
        if (source.Items != null) {
            this.Items = new DevicePositionItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DevicePositionItem(source.Items[i]);
            }
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

