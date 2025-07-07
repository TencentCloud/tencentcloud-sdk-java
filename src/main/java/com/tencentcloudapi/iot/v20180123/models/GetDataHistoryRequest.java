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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDataHistoryRequest extends AbstractModel {

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称列表，允许最多一次100台
    */
    @SerializedName("DeviceNames")
    @Expose
    private String [] DeviceNames;

    /**
    * 查询开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询数据量
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 时间排序（desc/asc）
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 查询游标
    */
    @SerializedName("ScrollId")
    @Expose
    private String ScrollId;

    /**
     * Get 产品Id 
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称列表，允许最多一次100台 
     * @return DeviceNames 设备名称列表，允许最多一次100台
     */
    public String [] getDeviceNames() {
        return this.DeviceNames;
    }

    /**
     * Set 设备名称列表，允许最多一次100台
     * @param DeviceNames 设备名称列表，允许最多一次100台
     */
    public void setDeviceNames(String [] DeviceNames) {
        this.DeviceNames = DeviceNames;
    }

    /**
     * Get 查询开始时间 
     * @return StartTime 查询开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间
     * @param StartTime 查询开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间 
     * @return EndTime 查询结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间
     * @param EndTime 查询结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询数据量 
     * @return Size 查询数据量
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 查询数据量
     * @param Size 查询数据量
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 时间排序（desc/asc） 
     * @return Order 时间排序（desc/asc）
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 时间排序（desc/asc）
     * @param Order 时间排序（desc/asc）
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 查询游标 
     * @return ScrollId 查询游标
     */
    public String getScrollId() {
        return this.ScrollId;
    }

    /**
     * Set 查询游标
     * @param ScrollId 查询游标
     */
    public void setScrollId(String ScrollId) {
        this.ScrollId = ScrollId;
    }

    public GetDataHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDataHistoryRequest(GetDataHistoryRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceNames != null) {
            this.DeviceNames = new String[source.DeviceNames.length];
            for (int i = 0; i < source.DeviceNames.length; i++) {
                this.DeviceNames[i] = new String(source.DeviceNames[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.ScrollId != null) {
            this.ScrollId = new String(source.ScrollId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArraySimple(map, prefix + "DeviceNames.", this.DeviceNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "ScrollId", this.ScrollId);

    }
}

