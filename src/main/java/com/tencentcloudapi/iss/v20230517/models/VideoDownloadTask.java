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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoDownloadTask extends AbstractModel {

    /**
    * <p>下载任务 ID</p>
    */
    @SerializedName("DownloadTaskId")
    @Expose
    private String DownloadTaskId;

    /**
    * <p>通道 ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>通道名称</p>
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * <p>通道编码</p>
    */
    @SerializedName("ChannelCode")
    @Expose
    private String ChannelCode;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>设备编码</p>
    */
    @SerializedName("DeviceCode")
    @Expose
    private String DeviceCode;

    /**
    * <p>任务状态（0：未执行；1：执行中；2 任务完成；<br>3：任务失败）</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>下载录像时间段</p>
    */
    @SerializedName("VideoTimeSection")
    @Expose
    private String VideoTimeSection;

    /**
    * <p>倍速</p>
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * <p>下载时长</p><p>单位：秒</p>
    */
    @SerializedName("DownloadTime")
    @Expose
    private Long DownloadTime;

    /**
    * <p>录像大小</p><p>单位：字节（Byte）</p>
    */
    @SerializedName("VideoSize")
    @Expose
    private Long VideoSize;

    /**
    * <p>任务开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>任务结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>文件下载地址</p>
    */
    @SerializedName("FileDownloadUrl")
    @Expose
    private String FileDownloadUrl;

    /**
    * <p>失败原因</p>
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * <p>生命周期规则，热存天数</p>
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
    * <p>mp4预览地址</p>
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
     * Get <p>下载任务 ID</p> 
     * @return DownloadTaskId <p>下载任务 ID</p>
     */
    public String getDownloadTaskId() {
        return this.DownloadTaskId;
    }

    /**
     * Set <p>下载任务 ID</p>
     * @param DownloadTaskId <p>下载任务 ID</p>
     */
    public void setDownloadTaskId(String DownloadTaskId) {
        this.DownloadTaskId = DownloadTaskId;
    }

    /**
     * Get <p>通道 ID</p> 
     * @return ChannelId <p>通道 ID</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道 ID</p>
     * @param ChannelId <p>通道 ID</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>通道名称</p> 
     * @return ChannelName <p>通道名称</p>
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set <p>通道名称</p>
     * @param ChannelName <p>通道名称</p>
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get <p>通道编码</p> 
     * @return ChannelCode <p>通道编码</p>
     */
    public String getChannelCode() {
        return this.ChannelCode;
    }

    /**
     * Set <p>通道编码</p>
     * @param ChannelCode <p>通道编码</p>
     */
    public void setChannelCode(String ChannelCode) {
        this.ChannelCode = ChannelCode;
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
     * Get <p>设备编码</p> 
     * @return DeviceCode <p>设备编码</p>
     */
    public String getDeviceCode() {
        return this.DeviceCode;
    }

    /**
     * Set <p>设备编码</p>
     * @param DeviceCode <p>设备编码</p>
     */
    public void setDeviceCode(String DeviceCode) {
        this.DeviceCode = DeviceCode;
    }

    /**
     * Get <p>任务状态（0：未执行；1：执行中；2 任务完成；<br>3：任务失败）</p> 
     * @return Status <p>任务状态（0：未执行；1：执行中；2 任务完成；<br>3：任务失败）</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态（0：未执行；1：执行中；2 任务完成；<br>3：任务失败）</p>
     * @param Status <p>任务状态（0：未执行；1：执行中；2 任务完成；<br>3：任务失败）</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>下载录像时间段</p> 
     * @return VideoTimeSection <p>下载录像时间段</p>
     */
    public String getVideoTimeSection() {
        return this.VideoTimeSection;
    }

    /**
     * Set <p>下载录像时间段</p>
     * @param VideoTimeSection <p>下载录像时间段</p>
     */
    public void setVideoTimeSection(String VideoTimeSection) {
        this.VideoTimeSection = VideoTimeSection;
    }

    /**
     * Get <p>倍速</p> 
     * @return Scale <p>倍速</p>
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set <p>倍速</p>
     * @param Scale <p>倍速</p>
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get <p>下载时长</p><p>单位：秒</p> 
     * @return DownloadTime <p>下载时长</p><p>单位：秒</p>
     */
    public Long getDownloadTime() {
        return this.DownloadTime;
    }

    /**
     * Set <p>下载时长</p><p>单位：秒</p>
     * @param DownloadTime <p>下载时长</p><p>单位：秒</p>
     */
    public void setDownloadTime(Long DownloadTime) {
        this.DownloadTime = DownloadTime;
    }

    /**
     * Get <p>录像大小</p><p>单位：字节（Byte）</p> 
     * @return VideoSize <p>录像大小</p><p>单位：字节（Byte）</p>
     */
    public Long getVideoSize() {
        return this.VideoSize;
    }

    /**
     * Set <p>录像大小</p><p>单位：字节（Byte）</p>
     * @param VideoSize <p>录像大小</p><p>单位：字节（Byte）</p>
     */
    public void setVideoSize(Long VideoSize) {
        this.VideoSize = VideoSize;
    }

    /**
     * Get <p>任务开始时间</p> 
     * @return StartTime <p>任务开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>任务开始时间</p>
     * @param StartTime <p>任务开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>任务结束时间</p> 
     * @return EndTime <p>任务结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>任务结束时间</p>
     * @param EndTime <p>任务结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>文件下载地址</p> 
     * @return FileDownloadUrl <p>文件下载地址</p>
     */
    public String getFileDownloadUrl() {
        return this.FileDownloadUrl;
    }

    /**
     * Set <p>文件下载地址</p>
     * @param FileDownloadUrl <p>文件下载地址</p>
     */
    public void setFileDownloadUrl(String FileDownloadUrl) {
        this.FileDownloadUrl = FileDownloadUrl;
    }

    /**
     * Get <p>失败原因</p> 
     * @return FailedReason <p>失败原因</p>
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set <p>失败原因</p>
     * @param FailedReason <p>失败原因</p>
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get <p>生命周期规则，热存天数</p> 
     * @return Expire <p>生命周期规则，热存天数</p>
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set <p>生命周期规则，热存天数</p>
     * @param Expire <p>生命周期规则，热存天数</p>
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    /**
     * Get <p>mp4预览地址</p> 
     * @return PreviewUrl <p>mp4预览地址</p>
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set <p>mp4预览地址</p>
     * @param PreviewUrl <p>mp4预览地址</p>
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    public VideoDownloadTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoDownloadTask(VideoDownloadTask source) {
        if (source.DownloadTaskId != null) {
            this.DownloadTaskId = new String(source.DownloadTaskId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ChannelCode != null) {
            this.ChannelCode = new String(source.ChannelCode);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceCode != null) {
            this.DeviceCode = new String(source.DeviceCode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VideoTimeSection != null) {
            this.VideoTimeSection = new String(source.VideoTimeSection);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.DownloadTime != null) {
            this.DownloadTime = new Long(source.DownloadTime);
        }
        if (source.VideoSize != null) {
            this.VideoSize = new Long(source.VideoSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FileDownloadUrl != null) {
            this.FileDownloadUrl = new String(source.FileDownloadUrl);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownloadTaskId", this.DownloadTaskId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ChannelCode", this.ChannelCode);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceCode", this.DeviceCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VideoTimeSection", this.VideoTimeSection);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "DownloadTime", this.DownloadTime);
        this.setParamSimple(map, prefix + "VideoSize", this.VideoSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FileDownloadUrl", this.FileDownloadUrl);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);

    }
}

