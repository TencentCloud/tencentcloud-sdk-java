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

public class ProcessMediaByMPSRequest extends AbstractModel {

    /**
    * <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>可选参数，该参数用于透传至媒体处理服务（MPS），以便从云点播侧发起 MPS 视频处理任务。不同类型的视频处理参数详情请参考 <a href="https://cloud.tencent.com/document/product/266/131209">使用MPS 媒体 AI 能力</a>，可通过<a href="https://cloud.tencent.com/document/product/266/122580">CreateMPSTemplate</a> 接口创建自定义模板。</p>
    */
    @SerializedName("MPSProcessMediaParams")
    @Expose
    private String MPSProcessMediaParams;

    /**
    * <p>视频内容分析类型任务参数，MPSProcessMediaParams为空时有效。</p>
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private MPSAiAnalysisTaskInput AiAnalysisTask;

    /**
    * <p>智能字幕类型任务参数，MPSProcessMediaParams为空时有效。</p>
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private MPSSmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * <p>智能擦除类型任务参数，MPSProcessMediaParams为空时有效。</p>
    */
    @SerializedName("SmartEraseTask")
    @Expose
    private MPSSmartEraseTaskInput SmartEraseTask;

    /**
    * <p>保留字段，特殊用途时使用。</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。</p> 
     * @return FileId <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。</p>
     * @param FileId <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>可选参数，该参数用于透传至媒体处理服务（MPS），以便从云点播侧发起 MPS 视频处理任务。不同类型的视频处理参数详情请参考 <a href="https://cloud.tencent.com/document/product/266/131209">使用MPS 媒体 AI 能力</a>，可通过<a href="https://cloud.tencent.com/document/product/266/122580">CreateMPSTemplate</a> 接口创建自定义模板。</p> 
     * @return MPSProcessMediaParams <p>可选参数，该参数用于透传至媒体处理服务（MPS），以便从云点播侧发起 MPS 视频处理任务。不同类型的视频处理参数详情请参考 <a href="https://cloud.tencent.com/document/product/266/131209">使用MPS 媒体 AI 能力</a>，可通过<a href="https://cloud.tencent.com/document/product/266/122580">CreateMPSTemplate</a> 接口创建自定义模板。</p>
     */
    public String getMPSProcessMediaParams() {
        return this.MPSProcessMediaParams;
    }

    /**
     * Set <p>可选参数，该参数用于透传至媒体处理服务（MPS），以便从云点播侧发起 MPS 视频处理任务。不同类型的视频处理参数详情请参考 <a href="https://cloud.tencent.com/document/product/266/131209">使用MPS 媒体 AI 能力</a>，可通过<a href="https://cloud.tencent.com/document/product/266/122580">CreateMPSTemplate</a> 接口创建自定义模板。</p>
     * @param MPSProcessMediaParams <p>可选参数，该参数用于透传至媒体处理服务（MPS），以便从云点播侧发起 MPS 视频处理任务。不同类型的视频处理参数详情请参考 <a href="https://cloud.tencent.com/document/product/266/131209">使用MPS 媒体 AI 能力</a>，可通过<a href="https://cloud.tencent.com/document/product/266/122580">CreateMPSTemplate</a> 接口创建自定义模板。</p>
     */
    public void setMPSProcessMediaParams(String MPSProcessMediaParams) {
        this.MPSProcessMediaParams = MPSProcessMediaParams;
    }

    /**
     * Get <p>视频内容分析类型任务参数，MPSProcessMediaParams为空时有效。</p> 
     * @return AiAnalysisTask <p>视频内容分析类型任务参数，MPSProcessMediaParams为空时有效。</p>
     */
    public MPSAiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set <p>视频内容分析类型任务参数，MPSProcessMediaParams为空时有效。</p>
     * @param AiAnalysisTask <p>视频内容分析类型任务参数，MPSProcessMediaParams为空时有效。</p>
     */
    public void setAiAnalysisTask(MPSAiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get <p>智能字幕类型任务参数，MPSProcessMediaParams为空时有效。</p> 
     * @return SmartSubtitlesTask <p>智能字幕类型任务参数，MPSProcessMediaParams为空时有效。</p>
     */
    public MPSSmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set <p>智能字幕类型任务参数，MPSProcessMediaParams为空时有效。</p>
     * @param SmartSubtitlesTask <p>智能字幕类型任务参数，MPSProcessMediaParams为空时有效。</p>
     */
    public void setSmartSubtitlesTask(MPSSmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get <p>智能擦除类型任务参数，MPSProcessMediaParams为空时有效。</p> 
     * @return SmartEraseTask <p>智能擦除类型任务参数，MPSProcessMediaParams为空时有效。</p>
     */
    public MPSSmartEraseTaskInput getSmartEraseTask() {
        return this.SmartEraseTask;
    }

    /**
     * Set <p>智能擦除类型任务参数，MPSProcessMediaParams为空时有效。</p>
     * @param SmartEraseTask <p>智能擦除类型任务参数，MPSProcessMediaParams为空时有效。</p>
     */
    public void setSmartEraseTask(MPSSmartEraseTaskInput SmartEraseTask) {
        this.SmartEraseTask = SmartEraseTask;
    }

    /**
     * Get <p>保留字段，特殊用途时使用。</p> 
     * @return ExtInfo <p>保留字段，特殊用途时使用。</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>保留字段，特殊用途时使用。</p>
     * @param ExtInfo <p>保留字段，特殊用途时使用。</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public ProcessMediaByMPSRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessMediaByMPSRequest(ProcessMediaByMPSRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.MPSProcessMediaParams != null) {
            this.MPSProcessMediaParams = new String(source.MPSProcessMediaParams);
        }
        if (source.AiAnalysisTask != null) {
            this.AiAnalysisTask = new MPSAiAnalysisTaskInput(source.AiAnalysisTask);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new MPSSmartSubtitlesTaskInput(source.SmartSubtitlesTask);
        }
        if (source.SmartEraseTask != null) {
            this.SmartEraseTask = new MPSSmartEraseTaskInput(source.SmartEraseTask);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "MPSProcessMediaParams", this.MPSProcessMediaParams);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);
        this.setParamObj(map, prefix + "SmartEraseTask.", this.SmartEraseTask);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

