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

public class VLPlanResultInfo extends AbstractModel {

    /**
    * <p>分析结果 ID</p>
    */
    @SerializedName("VLPlanResultId")
    @Expose
    private String VLPlanResultId;

    /**
    * <p>所属分析计划 ID</p>
    */
    @SerializedName("VLPlanId")
    @Expose
    private String VLPlanId;

    /**
    * <p>计划名称</p>
    */
    @SerializedName("VLPlanName")
    @Expose
    private String VLPlanName;

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
    * <p>分析模式：image=图片模式，video=视频模式（预留）</p>
    */
    @SerializedName("AnalysisMode")
    @Expose
    private String AnalysisMode;

    /**
    * <p>分析时间戳（秒）</p>
    */
    @SerializedName("VLResultTimestamp")
    @Expose
    private Long VLResultTimestamp;

    /**
    * <p>截图时间戳</p>
    */
    @SerializedName("SnapshotTimestamp")
    @Expose
    private Long SnapshotTimestamp;

    /**
    * <p>视频开始时间戳</p>
    */
    @SerializedName("VideoStartTimestamp")
    @Expose
    private Long VideoStartTimestamp;

    /**
    * <p>视频结束时间戳</p>
    */
    @SerializedName("VideoEndTimestamp")
    @Expose
    private Long VideoEndTimestamp;

    /**
    * <p>视频模式计费帧数</p>
    */
    @SerializedName("BilledFrameCount")
    @Expose
    private Long BilledFrameCount;

    /**
    * <p>AI 分析结果内容（JSON 字符串）</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>创建时间，格式 2006-01-02 15:04:05</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>更新时间，格式 2006-01-02 15:04:05</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get <p>分析结果 ID</p> 
     * @return VLPlanResultId <p>分析结果 ID</p>
     */
    public String getVLPlanResultId() {
        return this.VLPlanResultId;
    }

    /**
     * Set <p>分析结果 ID</p>
     * @param VLPlanResultId <p>分析结果 ID</p>
     */
    public void setVLPlanResultId(String VLPlanResultId) {
        this.VLPlanResultId = VLPlanResultId;
    }

    /**
     * Get <p>所属分析计划 ID</p> 
     * @return VLPlanId <p>所属分析计划 ID</p>
     */
    public String getVLPlanId() {
        return this.VLPlanId;
    }

    /**
     * Set <p>所属分析计划 ID</p>
     * @param VLPlanId <p>所属分析计划 ID</p>
     */
    public void setVLPlanId(String VLPlanId) {
        this.VLPlanId = VLPlanId;
    }

    /**
     * Get <p>计划名称</p> 
     * @return VLPlanName <p>计划名称</p>
     */
    public String getVLPlanName() {
        return this.VLPlanName;
    }

    /**
     * Set <p>计划名称</p>
     * @param VLPlanName <p>计划名称</p>
     */
    public void setVLPlanName(String VLPlanName) {
        this.VLPlanName = VLPlanName;
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
     * Get <p>分析模式：image=图片模式，video=视频模式（预留）</p> 
     * @return AnalysisMode <p>分析模式：image=图片模式，video=视频模式（预留）</p>
     */
    public String getAnalysisMode() {
        return this.AnalysisMode;
    }

    /**
     * Set <p>分析模式：image=图片模式，video=视频模式（预留）</p>
     * @param AnalysisMode <p>分析模式：image=图片模式，video=视频模式（预留）</p>
     */
    public void setAnalysisMode(String AnalysisMode) {
        this.AnalysisMode = AnalysisMode;
    }

    /**
     * Get <p>分析时间戳（秒）</p> 
     * @return VLResultTimestamp <p>分析时间戳（秒）</p>
     */
    public Long getVLResultTimestamp() {
        return this.VLResultTimestamp;
    }

    /**
     * Set <p>分析时间戳（秒）</p>
     * @param VLResultTimestamp <p>分析时间戳（秒）</p>
     */
    public void setVLResultTimestamp(Long VLResultTimestamp) {
        this.VLResultTimestamp = VLResultTimestamp;
    }

    /**
     * Get <p>截图时间戳</p> 
     * @return SnapshotTimestamp <p>截图时间戳</p>
     */
    public Long getSnapshotTimestamp() {
        return this.SnapshotTimestamp;
    }

    /**
     * Set <p>截图时间戳</p>
     * @param SnapshotTimestamp <p>截图时间戳</p>
     */
    public void setSnapshotTimestamp(Long SnapshotTimestamp) {
        this.SnapshotTimestamp = SnapshotTimestamp;
    }

    /**
     * Get <p>视频开始时间戳</p> 
     * @return VideoStartTimestamp <p>视频开始时间戳</p>
     */
    public Long getVideoStartTimestamp() {
        return this.VideoStartTimestamp;
    }

    /**
     * Set <p>视频开始时间戳</p>
     * @param VideoStartTimestamp <p>视频开始时间戳</p>
     */
    public void setVideoStartTimestamp(Long VideoStartTimestamp) {
        this.VideoStartTimestamp = VideoStartTimestamp;
    }

    /**
     * Get <p>视频结束时间戳</p> 
     * @return VideoEndTimestamp <p>视频结束时间戳</p>
     */
    public Long getVideoEndTimestamp() {
        return this.VideoEndTimestamp;
    }

    /**
     * Set <p>视频结束时间戳</p>
     * @param VideoEndTimestamp <p>视频结束时间戳</p>
     */
    public void setVideoEndTimestamp(Long VideoEndTimestamp) {
        this.VideoEndTimestamp = VideoEndTimestamp;
    }

    /**
     * Get <p>视频模式计费帧数</p> 
     * @return BilledFrameCount <p>视频模式计费帧数</p>
     */
    public Long getBilledFrameCount() {
        return this.BilledFrameCount;
    }

    /**
     * Set <p>视频模式计费帧数</p>
     * @param BilledFrameCount <p>视频模式计费帧数</p>
     */
    public void setBilledFrameCount(Long BilledFrameCount) {
        this.BilledFrameCount = BilledFrameCount;
    }

    /**
     * Get <p>AI 分析结果内容（JSON 字符串）</p> 
     * @return Content <p>AI 分析结果内容（JSON 字符串）</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>AI 分析结果内容（JSON 字符串）</p>
     * @param Content <p>AI 分析结果内容（JSON 字符串）</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>创建时间，格式 2006-01-02 15:04:05</p> 
     * @return CreatedAt <p>创建时间，格式 2006-01-02 15:04:05</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间，格式 2006-01-02 15:04:05</p>
     * @param CreatedAt <p>创建时间，格式 2006-01-02 15:04:05</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>更新时间，格式 2006-01-02 15:04:05</p> 
     * @return UpdatedAt <p>更新时间，格式 2006-01-02 15:04:05</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>更新时间，格式 2006-01-02 15:04:05</p>
     * @param UpdatedAt <p>更新时间，格式 2006-01-02 15:04:05</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public VLPlanResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VLPlanResultInfo(VLPlanResultInfo source) {
        if (source.VLPlanResultId != null) {
            this.VLPlanResultId = new String(source.VLPlanResultId);
        }
        if (source.VLPlanId != null) {
            this.VLPlanId = new String(source.VLPlanId);
        }
        if (source.VLPlanName != null) {
            this.VLPlanName = new String(source.VLPlanName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.AnalysisMode != null) {
            this.AnalysisMode = new String(source.AnalysisMode);
        }
        if (source.VLResultTimestamp != null) {
            this.VLResultTimestamp = new Long(source.VLResultTimestamp);
        }
        if (source.SnapshotTimestamp != null) {
            this.SnapshotTimestamp = new Long(source.SnapshotTimestamp);
        }
        if (source.VideoStartTimestamp != null) {
            this.VideoStartTimestamp = new Long(source.VideoStartTimestamp);
        }
        if (source.VideoEndTimestamp != null) {
            this.VideoEndTimestamp = new Long(source.VideoEndTimestamp);
        }
        if (source.BilledFrameCount != null) {
            this.BilledFrameCount = new Long(source.BilledFrameCount);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VLPlanResultId", this.VLPlanResultId);
        this.setParamSimple(map, prefix + "VLPlanId", this.VLPlanId);
        this.setParamSimple(map, prefix + "VLPlanName", this.VLPlanName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "AnalysisMode", this.AnalysisMode);
        this.setParamSimple(map, prefix + "VLResultTimestamp", this.VLResultTimestamp);
        this.setParamSimple(map, prefix + "SnapshotTimestamp", this.SnapshotTimestamp);
        this.setParamSimple(map, prefix + "VideoStartTimestamp", this.VideoStartTimestamp);
        this.setParamSimple(map, prefix + "VideoEndTimestamp", this.VideoEndTimestamp);
        this.setParamSimple(map, prefix + "BilledFrameCount", this.BilledFrameCount);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

