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

public class TargetInfo extends AbstractModel {

    /**
    * <p>视频唯一ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>产品ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>视频起始时间（毫秒级Unix时间戳）</p>
    */
    @SerializedName("StartTimeMs")
    @Expose
    private Long StartTimeMs;

    /**
    * <p>视频结束时间（毫秒级Unix时间戳）</p>
    */
    @SerializedName("EndTimeMs")
    @Expose
    private Long EndTimeMs;

    /**
    * <p>用户自定义事件ID，后续扩展使用</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * <p>视频内容摘要</p>
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * <p>通道ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * <p>缩略图路径</p>
    */
    @SerializedName("Thumbnail")
    @Expose
    private String Thumbnail;

    /**
     * Get <p>视频唯一ID</p> 
     * @return Id <p>视频唯一ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>视频唯一ID</p>
     * @param Id <p>视频唯一ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>产品ID</p> 
     * @return ProductId <p>产品ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品ID</p>
     * @param ProductId <p>产品ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名称</p> 
     * @return DeviceName <p>设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceName <p>设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>视频起始时间（毫秒级Unix时间戳）</p> 
     * @return StartTimeMs <p>视频起始时间（毫秒级Unix时间戳）</p>
     */
    public Long getStartTimeMs() {
        return this.StartTimeMs;
    }

    /**
     * Set <p>视频起始时间（毫秒级Unix时间戳）</p>
     * @param StartTimeMs <p>视频起始时间（毫秒级Unix时间戳）</p>
     */
    public void setStartTimeMs(Long StartTimeMs) {
        this.StartTimeMs = StartTimeMs;
    }

    /**
     * Get <p>视频结束时间（毫秒级Unix时间戳）</p> 
     * @return EndTimeMs <p>视频结束时间（毫秒级Unix时间戳）</p>
     */
    public Long getEndTimeMs() {
        return this.EndTimeMs;
    }

    /**
     * Set <p>视频结束时间（毫秒级Unix时间戳）</p>
     * @param EndTimeMs <p>视频结束时间（毫秒级Unix时间戳）</p>
     */
    public void setEndTimeMs(Long EndTimeMs) {
        this.EndTimeMs = EndTimeMs;
    }

    /**
     * Get <p>用户自定义事件ID，后续扩展使用</p> 
     * @return EventId <p>用户自定义事件ID，后续扩展使用</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>用户自定义事件ID，后续扩展使用</p>
     * @param EventId <p>用户自定义事件ID，后续扩展使用</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>视频内容摘要</p> 
     * @return Summary <p>视频内容摘要</p>
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>视频内容摘要</p>
     * @param Summary <p>视频内容摘要</p>
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>通道ID</p> 
     * @return ChannelId <p>通道ID</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道ID</p>
     * @param ChannelId <p>通道ID</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>缩略图路径</p> 
     * @return Thumbnail <p>缩略图路径</p>
     */
    public String getThumbnail() {
        return this.Thumbnail;
    }

    /**
     * Set <p>缩略图路径</p>
     * @param Thumbnail <p>缩略图路径</p>
     */
    public void setThumbnail(String Thumbnail) {
        this.Thumbnail = Thumbnail;
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
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.Thumbnail != null) {
            this.Thumbnail = new String(source.Thumbnail);
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
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Thumbnail", this.Thumbnail);

    }
}

