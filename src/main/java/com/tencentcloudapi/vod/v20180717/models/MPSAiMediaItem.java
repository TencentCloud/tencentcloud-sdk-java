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

public class MPSAiMediaItem extends AbstractModel {

    /**
    * MPS智能处理任务类型，可取值：
<li>AiAnalysis.ClassificationTask：智能分类任务。</li>
<li>AiAnalysis.CoverTask：智能封面任务。</li>
<li>AiAnalysis.TagTask：智能标签任务。</li>
<li>AiAnalysis.FrameTagTask：智能按帧标签任务。</li>
<li>AiAnalysis.HighlightTask：智能高光任务。</li>
<li>AiAnalysis.SegmentTask：智能拆条任务。</li>
<li>AiAnalysis.HeadTailTask：智能片头片尾任务。</li>
<li>AiAnalysis.DescriptionTask：智能摘要任务。</li>
<li>AiAnalysis.HorizontalToVerticalTask：智能横转竖任务。</li>
<li>AiAnalysis.DubbingTask：智能译制任务。</li>
<li>AiAnalysis.VideoRemakeTask：智能去重任务。</li>
<li>AiAnalysis.VideoComprehensionTask：视频理解任务。</li>
<li>SmartSubtitle.AsrFullTextTask：智能语音全文识别任务。</li>
<li>SmartSubtitle.TransTextTask：	翻译结果。</li>
<li>SmartSubtitle.PureSubtitleTransTask：返回纯字幕文件翻译结果。</li>
<li>SmartSubtitle.OcrFullTextTask：智能文字提取字幕任务。</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * MPS 智能处理任务结果集合
    */
    @SerializedName("AiMediaTasks")
    @Expose
    private MPSAiMediaTask [] AiMediaTasks;

    /**
     * Get MPS智能处理任务类型，可取值：
<li>AiAnalysis.ClassificationTask：智能分类任务。</li>
<li>AiAnalysis.CoverTask：智能封面任务。</li>
<li>AiAnalysis.TagTask：智能标签任务。</li>
<li>AiAnalysis.FrameTagTask：智能按帧标签任务。</li>
<li>AiAnalysis.HighlightTask：智能高光任务。</li>
<li>AiAnalysis.SegmentTask：智能拆条任务。</li>
<li>AiAnalysis.HeadTailTask：智能片头片尾任务。</li>
<li>AiAnalysis.DescriptionTask：智能摘要任务。</li>
<li>AiAnalysis.HorizontalToVerticalTask：智能横转竖任务。</li>
<li>AiAnalysis.DubbingTask：智能译制任务。</li>
<li>AiAnalysis.VideoRemakeTask：智能去重任务。</li>
<li>AiAnalysis.VideoComprehensionTask：视频理解任务。</li>
<li>SmartSubtitle.AsrFullTextTask：智能语音全文识别任务。</li>
<li>SmartSubtitle.TransTextTask：	翻译结果。</li>
<li>SmartSubtitle.PureSubtitleTransTask：返回纯字幕文件翻译结果。</li>
<li>SmartSubtitle.OcrFullTextTask：智能文字提取字幕任务。</li> 
     * @return TaskType MPS智能处理任务类型，可取值：
<li>AiAnalysis.ClassificationTask：智能分类任务。</li>
<li>AiAnalysis.CoverTask：智能封面任务。</li>
<li>AiAnalysis.TagTask：智能标签任务。</li>
<li>AiAnalysis.FrameTagTask：智能按帧标签任务。</li>
<li>AiAnalysis.HighlightTask：智能高光任务。</li>
<li>AiAnalysis.SegmentTask：智能拆条任务。</li>
<li>AiAnalysis.HeadTailTask：智能片头片尾任务。</li>
<li>AiAnalysis.DescriptionTask：智能摘要任务。</li>
<li>AiAnalysis.HorizontalToVerticalTask：智能横转竖任务。</li>
<li>AiAnalysis.DubbingTask：智能译制任务。</li>
<li>AiAnalysis.VideoRemakeTask：智能去重任务。</li>
<li>AiAnalysis.VideoComprehensionTask：视频理解任务。</li>
<li>SmartSubtitle.AsrFullTextTask：智能语音全文识别任务。</li>
<li>SmartSubtitle.TransTextTask：	翻译结果。</li>
<li>SmartSubtitle.PureSubtitleTransTask：返回纯字幕文件翻译结果。</li>
<li>SmartSubtitle.OcrFullTextTask：智能文字提取字幕任务。</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set MPS智能处理任务类型，可取值：
<li>AiAnalysis.ClassificationTask：智能分类任务。</li>
<li>AiAnalysis.CoverTask：智能封面任务。</li>
<li>AiAnalysis.TagTask：智能标签任务。</li>
<li>AiAnalysis.FrameTagTask：智能按帧标签任务。</li>
<li>AiAnalysis.HighlightTask：智能高光任务。</li>
<li>AiAnalysis.SegmentTask：智能拆条任务。</li>
<li>AiAnalysis.HeadTailTask：智能片头片尾任务。</li>
<li>AiAnalysis.DescriptionTask：智能摘要任务。</li>
<li>AiAnalysis.HorizontalToVerticalTask：智能横转竖任务。</li>
<li>AiAnalysis.DubbingTask：智能译制任务。</li>
<li>AiAnalysis.VideoRemakeTask：智能去重任务。</li>
<li>AiAnalysis.VideoComprehensionTask：视频理解任务。</li>
<li>SmartSubtitle.AsrFullTextTask：智能语音全文识别任务。</li>
<li>SmartSubtitle.TransTextTask：	翻译结果。</li>
<li>SmartSubtitle.PureSubtitleTransTask：返回纯字幕文件翻译结果。</li>
<li>SmartSubtitle.OcrFullTextTask：智能文字提取字幕任务。</li>
     * @param TaskType MPS智能处理任务类型，可取值：
<li>AiAnalysis.ClassificationTask：智能分类任务。</li>
<li>AiAnalysis.CoverTask：智能封面任务。</li>
<li>AiAnalysis.TagTask：智能标签任务。</li>
<li>AiAnalysis.FrameTagTask：智能按帧标签任务。</li>
<li>AiAnalysis.HighlightTask：智能高光任务。</li>
<li>AiAnalysis.SegmentTask：智能拆条任务。</li>
<li>AiAnalysis.HeadTailTask：智能片头片尾任务。</li>
<li>AiAnalysis.DescriptionTask：智能摘要任务。</li>
<li>AiAnalysis.HorizontalToVerticalTask：智能横转竖任务。</li>
<li>AiAnalysis.DubbingTask：智能译制任务。</li>
<li>AiAnalysis.VideoRemakeTask：智能去重任务。</li>
<li>AiAnalysis.VideoComprehensionTask：视频理解任务。</li>
<li>SmartSubtitle.AsrFullTextTask：智能语音全文识别任务。</li>
<li>SmartSubtitle.TransTextTask：	翻译结果。</li>
<li>SmartSubtitle.PureSubtitleTransTask：返回纯字幕文件翻译结果。</li>
<li>SmartSubtitle.OcrFullTextTask：智能文字提取字幕任务。</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get MPS 智能处理任务结果集合 
     * @return AiMediaTasks MPS 智能处理任务结果集合
     */
    public MPSAiMediaTask [] getAiMediaTasks() {
        return this.AiMediaTasks;
    }

    /**
     * Set MPS 智能处理任务结果集合
     * @param AiMediaTasks MPS 智能处理任务结果集合
     */
    public void setAiMediaTasks(MPSAiMediaTask [] AiMediaTasks) {
        this.AiMediaTasks = AiMediaTasks;
    }

    public MPSAiMediaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSAiMediaItem(MPSAiMediaItem source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.AiMediaTasks != null) {
            this.AiMediaTasks = new MPSAiMediaTask[source.AiMediaTasks.length];
            for (int i = 0; i < source.AiMediaTasks.length; i++) {
                this.AiMediaTasks[i] = new MPSAiMediaTask(source.AiMediaTasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "AiMediaTasks.", this.AiMediaTasks);

    }
}

