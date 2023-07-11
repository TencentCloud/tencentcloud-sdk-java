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
package com.tencentcloudapi.tchd.v20230306.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventDetail extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 地域ID，非区域性地域返回non-regional
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 地域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 事件开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 事件结束时间，当事件正在发生还未结束时，结束时间返回空
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 事件当前状态：提示、异常、正常
    */
    @SerializedName("CurrentStatus")
    @Expose
    private String CurrentStatus;

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
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 地域ID，非区域性地域返回non-regional 
     * @return RegionId 地域ID，非区域性地域返回non-regional
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID，非区域性地域返回non-regional
     * @param RegionId 地域ID，非区域性地域返回non-regional
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域名称 
     * @return RegionName 地域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称
     * @param RegionName 地域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 事件开始时间 
     * @return StartTime 事件开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 事件开始时间
     * @param StartTime 事件开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 事件结束时间，当事件正在发生还未结束时，结束时间返回空 
     * @return EndTime 事件结束时间，当事件正在发生还未结束时，结束时间返回空
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 事件结束时间，当事件正在发生还未结束时，结束时间返回空
     * @param EndTime 事件结束时间，当事件正在发生还未结束时，结束时间返回空
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 事件当前状态：提示、异常、正常 
     * @return CurrentStatus 事件当前状态：提示、异常、正常
     */
    public String getCurrentStatus() {
        return this.CurrentStatus;
    }

    /**
     * Set 事件当前状态：提示、异常、正常
     * @param CurrentStatus 事件当前状态：提示、异常、正常
     */
    public void setCurrentStatus(String CurrentStatus) {
        this.CurrentStatus = CurrentStatus;
    }

    public EventDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventDetail(EventDetail source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CurrentStatus != null) {
            this.CurrentStatus = new String(source.CurrentStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CurrentStatus", this.CurrentStatus);

    }
}

