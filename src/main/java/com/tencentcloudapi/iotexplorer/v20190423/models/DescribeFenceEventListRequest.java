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

public class DescribeFenceEventListRequest extends AbstractModel{

    /**
    * 围栏告警信息的查询起始时间，Unix时间，单位为毫秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 围栏告警信息的查询结束时间，Unix时间，单位为毫秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 围栏Id
    */
    @SerializedName("FenceId")
    @Expose
    private Long FenceId;

    /**
    * 翻页偏移量，0起始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大返回结果数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 告警对应的产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 告警对应的设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
     * Get 围栏告警信息的查询起始时间，Unix时间，单位为毫秒 
     * @return StartTime 围栏告警信息的查询起始时间，Unix时间，单位为毫秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 围栏告警信息的查询起始时间，Unix时间，单位为毫秒
     * @param StartTime 围栏告警信息的查询起始时间，Unix时间，单位为毫秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 围栏告警信息的查询结束时间，Unix时间，单位为毫秒 
     * @return EndTime 围栏告警信息的查询结束时间，Unix时间，单位为毫秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 围栏告警信息的查询结束时间，Unix时间，单位为毫秒
     * @param EndTime 围栏告警信息的查询结束时间，Unix时间，单位为毫秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 围栏Id 
     * @return FenceId 围栏Id
     */
    public Long getFenceId() {
        return this.FenceId;
    }

    /**
     * Set 围栏Id
     * @param FenceId 围栏Id
     */
    public void setFenceId(Long FenceId) {
        this.FenceId = FenceId;
    }

    /**
     * Get 翻页偏移量，0起始 
     * @return Offset 翻页偏移量，0起始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页偏移量，0起始
     * @param Offset 翻页偏移量，0起始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 最大返回结果数 
     * @return Limit 最大返回结果数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大返回结果数
     * @param Limit 最大返回结果数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 告警对应的产品Id 
     * @return ProductId 告警对应的产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 告警对应的产品Id
     * @param ProductId 告警对应的产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 告警对应的设备名称 
     * @return DeviceName 告警对应的设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 告警对应的设备名称
     * @param DeviceName 告警对应的设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    public DescribeFenceEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFenceEventListRequest(DescribeFenceEventListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.FenceId != null) {
            this.FenceId = new Long(source.FenceId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FenceId", this.FenceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);

    }
}

