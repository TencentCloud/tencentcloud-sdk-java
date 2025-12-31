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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSOutputFile extends AbstractModel {

    /**
    * 文件类型。用于标识 MPS 视频处理任务执行结果中的特定返回文件。
取值：<li>AiAnalysis.DeLogo.Video: 智能擦除任务中产生的擦除后视频文件，默认以原文件类型存储；</li><li>AiAnalysis.DeLogo.OriginSubtitle: 智能擦除任务中基于画面提取的字幕文件；</li><li>AiAnalysis.DeLogo.TranslateSubtitle: 智能擦除任务中基于画面提取的字幕翻译文件。</li><li>MediaProcess.Transcode.Video: 音视频增强任务中增强后的音视频文件，默认以转码文件类型存储。</li>
<li>AiAnalysis.HorizontalToVerticalTask.Video: 横转竖任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>AiAnalysis.VideoRemakeTaskk.Video: 智能去重任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>AiAnalysis.SegmentTask.Video: 智能拆条任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>SmartErase.Video: 智能擦除任务中生成的视频文件，默认以智能媒体文件类型存储。</li>

    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 存储形式。用于表示该结果文件的存储形式，取值有：<li> Permanent：永久存储；</li><li> Temporary：临时存储。</li>
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * 媒体文件 ID。当 Type 为 Permanent 时有效，表示该结果文件以视频媒资形式存储在点播平台中，字段值为视频媒资的 FileId。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 结果文件的可下载 Url。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 转码规格 ID。当 FileType 等于 MediaProcess.Transcode.Video时有效，取值为0表示原始文件。 
    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
    * 过期时间。当 StorageMode 为 Temporary 时有效，表示 Url 的过期时间，单位为秒。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
     * Get 文件类型。用于标识 MPS 视频处理任务执行结果中的特定返回文件。
取值：<li>AiAnalysis.DeLogo.Video: 智能擦除任务中产生的擦除后视频文件，默认以原文件类型存储；</li><li>AiAnalysis.DeLogo.OriginSubtitle: 智能擦除任务中基于画面提取的字幕文件；</li><li>AiAnalysis.DeLogo.TranslateSubtitle: 智能擦除任务中基于画面提取的字幕翻译文件。</li><li>MediaProcess.Transcode.Video: 音视频增强任务中增强后的音视频文件，默认以转码文件类型存储。</li>
<li>AiAnalysis.HorizontalToVerticalTask.Video: 横转竖任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>AiAnalysis.VideoRemakeTaskk.Video: 智能去重任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>AiAnalysis.SegmentTask.Video: 智能拆条任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>SmartErase.Video: 智能擦除任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
 
     * @return FileType 文件类型。用于标识 MPS 视频处理任务执行结果中的特定返回文件。
取值：<li>AiAnalysis.DeLogo.Video: 智能擦除任务中产生的擦除后视频文件，默认以原文件类型存储；</li><li>AiAnalysis.DeLogo.OriginSubtitle: 智能擦除任务中基于画面提取的字幕文件；</li><li>AiAnalysis.DeLogo.TranslateSubtitle: 智能擦除任务中基于画面提取的字幕翻译文件。</li><li>MediaProcess.Transcode.Video: 音视频增强任务中增强后的音视频文件，默认以转码文件类型存储。</li>
<li>AiAnalysis.HorizontalToVerticalTask.Video: 横转竖任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>AiAnalysis.VideoRemakeTaskk.Video: 智能去重任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>AiAnalysis.SegmentTask.Video: 智能拆条任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>SmartErase.Video: 智能擦除任务中生成的视频文件，默认以智能媒体文件类型存储。</li>

     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型。用于标识 MPS 视频处理任务执行结果中的特定返回文件。
取值：<li>AiAnalysis.DeLogo.Video: 智能擦除任务中产生的擦除后视频文件，默认以原文件类型存储；</li><li>AiAnalysis.DeLogo.OriginSubtitle: 智能擦除任务中基于画面提取的字幕文件；</li><li>AiAnalysis.DeLogo.TranslateSubtitle: 智能擦除任务中基于画面提取的字幕翻译文件。</li><li>MediaProcess.Transcode.Video: 音视频增强任务中增强后的音视频文件，默认以转码文件类型存储。</li>
<li>AiAnalysis.HorizontalToVerticalTask.Video: 横转竖任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>AiAnalysis.VideoRemakeTaskk.Video: 智能去重任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>AiAnalysis.SegmentTask.Video: 智能拆条任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>SmartErase.Video: 智能擦除任务中生成的视频文件，默认以智能媒体文件类型存储。</li>

     * @param FileType 文件类型。用于标识 MPS 视频处理任务执行结果中的特定返回文件。
取值：<li>AiAnalysis.DeLogo.Video: 智能擦除任务中产生的擦除后视频文件，默认以原文件类型存储；</li><li>AiAnalysis.DeLogo.OriginSubtitle: 智能擦除任务中基于画面提取的字幕文件；</li><li>AiAnalysis.DeLogo.TranslateSubtitle: 智能擦除任务中基于画面提取的字幕翻译文件。</li><li>MediaProcess.Transcode.Video: 音视频增强任务中增强后的音视频文件，默认以转码文件类型存储。</li>
<li>AiAnalysis.HorizontalToVerticalTask.Video: 横转竖任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>AiAnalysis.VideoRemakeTaskk.Video: 智能去重任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>AiAnalysis.SegmentTask.Video: 智能拆条任务中生成的视频文件，默认以智能媒体文件类型存储。</li>
<li>SmartErase.Video: 智能擦除任务中生成的视频文件，默认以智能媒体文件类型存储。</li>

     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 存储形式。用于表示该结果文件的存储形式，取值有：<li> Permanent：永久存储；</li><li> Temporary：临时存储。</li> 
     * @return StorageMode 存储形式。用于表示该结果文件的存储形式，取值有：<li> Permanent：永久存储；</li><li> Temporary：临时存储。</li>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set 存储形式。用于表示该结果文件的存储形式，取值有：<li> Permanent：永久存储；</li><li> Temporary：临时存储。</li>
     * @param StorageMode 存储形式。用于表示该结果文件的存储形式，取值有：<li> Permanent：永久存储；</li><li> Temporary：临时存储。</li>
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get 媒体文件 ID。当 Type 为 Permanent 时有效，表示该结果文件以视频媒资形式存储在点播平台中，字段值为视频媒资的 FileId。 
     * @return FileId 媒体文件 ID。当 Type 为 Permanent 时有效，表示该结果文件以视频媒资形式存储在点播平台中，字段值为视频媒资的 FileId。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 媒体文件 ID。当 Type 为 Permanent 时有效，表示该结果文件以视频媒资形式存储在点播平台中，字段值为视频媒资的 FileId。
     * @param FileId 媒体文件 ID。当 Type 为 Permanent 时有效，表示该结果文件以视频媒资形式存储在点播平台中，字段值为视频媒资的 FileId。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 结果文件的可下载 Url。 
     * @return Url 结果文件的可下载 Url。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 结果文件的可下载 Url。
     * @param Url 结果文件的可下载 Url。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 转码规格 ID。当 FileType 等于 MediaProcess.Transcode.Video时有效，取值为0表示原始文件。  
     * @return Definition 转码规格 ID。当 FileType 等于 MediaProcess.Transcode.Video时有效，取值为0表示原始文件。 
     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set 转码规格 ID。当 FileType 等于 MediaProcess.Transcode.Video时有效，取值为0表示原始文件。 
     * @param Definition 转码规格 ID。当 FileType 等于 MediaProcess.Transcode.Video时有效，取值为0表示原始文件。 
     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 过期时间。当 StorageMode 为 Temporary 时有效，表示 Url 的过期时间，单位为秒。 
     * @return ExpiredTime 过期时间。当 StorageMode 为 Temporary 时有效，表示 Url 的过期时间，单位为秒。
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 过期时间。当 StorageMode 为 Temporary 时有效，表示 Url 的过期时间，单位为秒。
     * @param ExpiredTime 过期时间。当 StorageMode 为 Temporary 时有效，表示 Url 的过期时间，单位为秒。
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public MPSOutputFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSOutputFile(MPSOutputFile source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Definition != null) {
            this.Definition = new String(source.Definition);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

