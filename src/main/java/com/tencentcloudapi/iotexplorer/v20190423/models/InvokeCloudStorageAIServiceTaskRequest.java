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

public class InvokeCloudStorageAIServiceTaskRequest extends AbstractModel {

    /**
    * 产品 ID
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
    * 云存 AI 服务类型。可选值：
- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
- `VideoToText`：视频语义理解
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 待分析云存的起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 待分析云存的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 通道 ID
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 视频分析配置参数
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 视频分析识别区域
    */
    @SerializedName("ROI")
    @Expose
    private String ROI;

    /**
    * 分析外部传入的视频 URL 列表，支持 HLS 点播（m3u8）及常见视频格式（mp4 等）
    */
    @SerializedName("VideoURLs")
    @Expose
    private String [] VideoURLs;

    /**
    * 自定义任务 ID
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
     * Get 产品 ID 
     * @return ProductId 产品 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID
     * @param ProductId 产品 ID
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
     * Get 云存 AI 服务类型。可选值：
- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
- `VideoToText`：视频语义理解 
     * @return ServiceType 云存 AI 服务类型。可选值：
- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
- `VideoToText`：视频语义理解
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 云存 AI 服务类型。可选值：
- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
- `VideoToText`：视频语义理解
     * @param ServiceType 云存 AI 服务类型。可选值：
- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
- `VideoToText`：视频语义理解
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 待分析云存的起始时间 
     * @return StartTime 待分析云存的起始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 待分析云存的起始时间
     * @param StartTime 待分析云存的起始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 待分析云存的结束时间 
     * @return EndTime 待分析云存的结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 待分析云存的结束时间
     * @param EndTime 待分析云存的结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 通道 ID 
     * @return ChannelId 通道 ID
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID
     * @param ChannelId 通道 ID
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 视频分析配置参数 
     * @return Config 视频分析配置参数
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 视频分析配置参数
     * @param Config 视频分析配置参数
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 视频分析识别区域 
     * @return ROI 视频分析识别区域
     */
    public String getROI() {
        return this.ROI;
    }

    /**
     * Set 视频分析识别区域
     * @param ROI 视频分析识别区域
     */
    public void setROI(String ROI) {
        this.ROI = ROI;
    }

    /**
     * Get 分析外部传入的视频 URL 列表，支持 HLS 点播（m3u8）及常见视频格式（mp4 等） 
     * @return VideoURLs 分析外部传入的视频 URL 列表，支持 HLS 点播（m3u8）及常见视频格式（mp4 等）
     */
    public String [] getVideoURLs() {
        return this.VideoURLs;
    }

    /**
     * Set 分析外部传入的视频 URL 列表，支持 HLS 点播（m3u8）及常见视频格式（mp4 等）
     * @param VideoURLs 分析外部传入的视频 URL 列表，支持 HLS 点播（m3u8）及常见视频格式（mp4 等）
     */
    public void setVideoURLs(String [] VideoURLs) {
        this.VideoURLs = VideoURLs;
    }

    /**
     * Get 自定义任务 ID 
     * @return CustomId 自定义任务 ID
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set 自定义任务 ID
     * @param CustomId 自定义任务 ID
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    public InvokeCloudStorageAIServiceTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeCloudStorageAIServiceTaskRequest(InvokeCloudStorageAIServiceTaskRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.ROI != null) {
            this.ROI = new String(source.ROI);
        }
        if (source.VideoURLs != null) {
            this.VideoURLs = new String[source.VideoURLs.length];
            for (int i = 0; i < source.VideoURLs.length; i++) {
                this.VideoURLs[i] = new String(source.VideoURLs[i]);
            }
        }
        if (source.CustomId != null) {
            this.CustomId = new String(source.CustomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "ROI", this.ROI);
        this.setParamArraySimple(map, prefix + "VideoURLs.", this.VideoURLs);
        this.setParamSimple(map, prefix + "CustomId", this.CustomId);

    }
}

