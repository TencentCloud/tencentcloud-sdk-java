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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceResourcesRequest extends AbstractModel{

    /**
    * 偏移量，Offset从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页的大小，数值范围 10-250
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 需要过滤的设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 资源搜索开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 资源搜索结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 偏移量，Offset从0开始 
     * @return Offset 偏移量，Offset从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，Offset从0开始
     * @param Offset 偏移量，Offset从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页的大小，数值范围 10-250 
     * @return Limit 分页的大小，数值范围 10-250
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的大小，数值范围 10-250
     * @param Limit 分页的大小，数值范围 10-250
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 需要过滤的设备名称 
     * @return DeviceName 需要过滤的设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 需要过滤的设备名称
     * @param DeviceName 需要过滤的设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 资源搜索开始时间 
     * @return StartTime 资源搜索开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 资源搜索开始时间
     * @param StartTime 资源搜索开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 资源搜索结束时间 
     * @return EndTime 资源搜索结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 资源搜索结束时间
     * @param EndTime 资源搜索结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeDeviceResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceResourcesRequest(DescribeDeviceResourcesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

