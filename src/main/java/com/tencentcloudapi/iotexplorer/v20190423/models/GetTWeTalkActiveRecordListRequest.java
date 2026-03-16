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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTWeTalkActiveRecordListRequest extends AbstractModel {

    /**
    * 最早的时间。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询的最晚时间。
跟StartTime形成时间段，用于查询时间段中的记录。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页的大小。
默认为10，最大不超过500。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * TWeTalk类型：1-基础版；2-高级版；3-多模态；
    */
    @SerializedName("ServiceType")
    @Expose
    private Long [] ServiceType;

    /**
     * Get 最早的时间。 
     * @return StartTime 最早的时间。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 最早的时间。
     * @param StartTime 最早的时间。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询的最晚时间。
跟StartTime形成时间段，用于查询时间段中的记录。 
     * @return EndTime 查询的最晚时间。
跟StartTime形成时间段，用于查询时间段中的记录。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询的最晚时间。
跟StartTime形成时间段，用于查询时间段中的记录。
     * @param EndTime 查询的最晚时间。
跟StartTime形成时间段，用于查询时间段中的记录。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页的大小。
默认为10，最大不超过500。 
     * @return Limit 分页的大小。
默认为10，最大不超过500。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的大小。
默认为10，最大不超过500。
     * @param Limit 分页的大小。
默认为10，最大不超过500。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get TWeTalk类型：1-基础版；2-高级版；3-多模态； 
     * @return ServiceType TWeTalk类型：1-基础版；2-高级版；3-多模态；
     */
    public Long [] getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set TWeTalk类型：1-基础版；2-高级版；3-多模态；
     * @param ServiceType TWeTalk类型：1-基础版；2-高级版；3-多模态；
     */
    public void setServiceType(Long [] ServiceType) {
        this.ServiceType = ServiceType;
    }

    public GetTWeTalkActiveRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTWeTalkActiveRecordListRequest(GetTWeTalkActiveRecordListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new Long[source.ServiceType.length];
            for (int i = 0; i < source.ServiceType.length; i++) {
                this.ServiceType[i] = new Long(source.ServiceType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamArraySimple(map, prefix + "ServiceType.", this.ServiceType);

    }
}

