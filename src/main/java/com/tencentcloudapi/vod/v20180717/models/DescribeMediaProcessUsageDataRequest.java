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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMediaProcessUsageDataRequest extends AbstractModel{

    /**
    * 起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束日期，需大于等于起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 查询视频处理任务类型，目前支持的任务类型包括：
<li> Transcoding: 普通转码</li>
<li> Transcoding-TESHD: 极速高清转码</li>
<li> Editing: 视频编辑</li>
<li> Editing-TESHD: 极速高清视频编辑</li>
<li> AdaptiveBitrateStreaming: 自适应码流</li>
<li> ContentAudit: 内容审核</li>
<li> ContentRecognition: 内容识别</li>
<li> RemoveWatermark: 去除水印</li>
<li> ExtractTraceWatermark: 提取水印</li>
<li> AddTraceWatermark: 添加水印</li>
<li> RebuildMedia: 音画质重生</li>
<li> QualityInspect: 音画质检测</li>
<li> VideoHighlight: 视频智能集锦</li>
<li> VideoTag: 视频智能标签</li>
<li> VideoClassification:  视频智能分类</li>
<li> VideoCover: 视频智能封面</li>
<li> VideoSegment: 视频智能拆条</li>
<li>Transcode: 转码，包含普通转码、极速高清和视频编辑（不推荐使用）</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。 
     * @return StartTime 起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
     * @param StartTime 起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束日期，需大于等于起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。 
     * @return EndTime 结束日期，需大于等于起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束日期，需大于等于起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
     * @param EndTime 结束日期，需大于等于起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b> 
     * @return SubAppId <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     * @param SubAppId <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 查询视频处理任务类型，目前支持的任务类型包括：
<li> Transcoding: 普通转码</li>
<li> Transcoding-TESHD: 极速高清转码</li>
<li> Editing: 视频编辑</li>
<li> Editing-TESHD: 极速高清视频编辑</li>
<li> AdaptiveBitrateStreaming: 自适应码流</li>
<li> ContentAudit: 内容审核</li>
<li> ContentRecognition: 内容识别</li>
<li> RemoveWatermark: 去除水印</li>
<li> ExtractTraceWatermark: 提取水印</li>
<li> AddTraceWatermark: 添加水印</li>
<li> RebuildMedia: 音画质重生</li>
<li> QualityInspect: 音画质检测</li>
<li> VideoHighlight: 视频智能集锦</li>
<li> VideoTag: 视频智能标签</li>
<li> VideoClassification:  视频智能分类</li>
<li> VideoCover: 视频智能封面</li>
<li> VideoSegment: 视频智能拆条</li>
<li>Transcode: 转码，包含普通转码、极速高清和视频编辑（不推荐使用）</li> 
     * @return Type 查询视频处理任务类型，目前支持的任务类型包括：
<li> Transcoding: 普通转码</li>
<li> Transcoding-TESHD: 极速高清转码</li>
<li> Editing: 视频编辑</li>
<li> Editing-TESHD: 极速高清视频编辑</li>
<li> AdaptiveBitrateStreaming: 自适应码流</li>
<li> ContentAudit: 内容审核</li>
<li> ContentRecognition: 内容识别</li>
<li> RemoveWatermark: 去除水印</li>
<li> ExtractTraceWatermark: 提取水印</li>
<li> AddTraceWatermark: 添加水印</li>
<li> RebuildMedia: 音画质重生</li>
<li> QualityInspect: 音画质检测</li>
<li> VideoHighlight: 视频智能集锦</li>
<li> VideoTag: 视频智能标签</li>
<li> VideoClassification:  视频智能分类</li>
<li> VideoCover: 视频智能封面</li>
<li> VideoSegment: 视频智能拆条</li>
<li>Transcode: 转码，包含普通转码、极速高清和视频编辑（不推荐使用）</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 查询视频处理任务类型，目前支持的任务类型包括：
<li> Transcoding: 普通转码</li>
<li> Transcoding-TESHD: 极速高清转码</li>
<li> Editing: 视频编辑</li>
<li> Editing-TESHD: 极速高清视频编辑</li>
<li> AdaptiveBitrateStreaming: 自适应码流</li>
<li> ContentAudit: 内容审核</li>
<li> ContentRecognition: 内容识别</li>
<li> RemoveWatermark: 去除水印</li>
<li> ExtractTraceWatermark: 提取水印</li>
<li> AddTraceWatermark: 添加水印</li>
<li> RebuildMedia: 音画质重生</li>
<li> QualityInspect: 音画质检测</li>
<li> VideoHighlight: 视频智能集锦</li>
<li> VideoTag: 视频智能标签</li>
<li> VideoClassification:  视频智能分类</li>
<li> VideoCover: 视频智能封面</li>
<li> VideoSegment: 视频智能拆条</li>
<li>Transcode: 转码，包含普通转码、极速高清和视频编辑（不推荐使用）</li>
     * @param Type 查询视频处理任务类型，目前支持的任务类型包括：
<li> Transcoding: 普通转码</li>
<li> Transcoding-TESHD: 极速高清转码</li>
<li> Editing: 视频编辑</li>
<li> Editing-TESHD: 极速高清视频编辑</li>
<li> AdaptiveBitrateStreaming: 自适应码流</li>
<li> ContentAudit: 内容审核</li>
<li> ContentRecognition: 内容识别</li>
<li> RemoveWatermark: 去除水印</li>
<li> ExtractTraceWatermark: 提取水印</li>
<li> AddTraceWatermark: 添加水印</li>
<li> RebuildMedia: 音画质重生</li>
<li> QualityInspect: 音画质检测</li>
<li> VideoHighlight: 视频智能集锦</li>
<li> VideoTag: 视频智能标签</li>
<li> VideoClassification:  视频智能分类</li>
<li> VideoCover: 视频智能封面</li>
<li> VideoSegment: 视频智能拆条</li>
<li>Transcode: 转码，包含普通转码、极速高清和视频编辑（不推荐使用）</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeMediaProcessUsageDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMediaProcessUsageDataRequest(DescribeMediaProcessUsageDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

