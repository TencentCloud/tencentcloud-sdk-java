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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetInfo extends AbstractModel {

    /**
    * 视频唯一ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

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
    * 视频起始时间（毫秒级Unix时间戳）
    */
    @SerializedName("StartTimeMs")
    @Expose
    private Long StartTimeMs;

    /**
    * 视频结束时间（毫秒级Unix时间戳）
    */
    @SerializedName("EndTimeMs")
    @Expose
    private Long EndTimeMs;

    /**
    * 用户自定义事件ID，后续扩展使用
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 视频内容摘要
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
     * Get 视频唯一ID 
     * @return Id 视频唯一ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 视频唯一ID
     * @param Id 视频唯一ID
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get 视频起始时间（毫秒级Unix时间戳） 
     * @return StartTimeMs 视频起始时间（毫秒级Unix时间戳）
     */
    public Long getStartTimeMs() {
        return this.StartTimeMs;
    }

    /**
     * Set 视频起始时间（毫秒级Unix时间戳）
     * @param StartTimeMs 视频起始时间（毫秒级Unix时间戳）
     */
    public void setStartTimeMs(Long StartTimeMs) {
        this.StartTimeMs = StartTimeMs;
    }

    /**
     * Get 视频结束时间（毫秒级Unix时间戳） 
     * @return EndTimeMs 视频结束时间（毫秒级Unix时间戳）
     */
    public Long getEndTimeMs() {
        return this.EndTimeMs;
    }

    /**
     * Set 视频结束时间（毫秒级Unix时间戳）
     * @param EndTimeMs 视频结束时间（毫秒级Unix时间戳）
     */
    public void setEndTimeMs(Long EndTimeMs) {
        this.EndTimeMs = EndTimeMs;
    }

    /**
     * Get 用户自定义事件ID，后续扩展使用 
     * @return EventId 用户自定义事件ID，后续扩展使用
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 用户自定义事件ID，后续扩展使用
     * @param EventId 用户自定义事件ID，后续扩展使用
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 视频内容摘要 
     * @return Summary 视频内容摘要
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 视频内容摘要
     * @param Summary 视频内容摘要
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    public TargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetInfo(TargetInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.StartTimeMs != null) {
            this.StartTimeMs = new Long(source.StartTimeMs);
        }
        if (source.EndTimeMs != null) {
            this.EndTimeMs = new Long(source.EndTimeMs);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "StartTimeMs", this.StartTimeMs);
        this.setParamSimple(map, prefix + "EndTimeMs", this.EndTimeMs);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Summary", this.Summary);

    }
}

