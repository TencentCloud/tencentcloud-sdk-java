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

public class KnowledgeAnalysisResult extends AbstractModel {

    /**
    * <p>处理任务类型</p><p>枚举值：</p><ul><li>AiAnalysis.DescriptionTask： 智能摘要任务</li><li>AiAnalysis.VideoComprehensionTask： 视频理解任务</li><li>SmartSubtitle.AsrFullTextTask： 智能语音全文识别任务</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>任务输出文件集合</p>
    */
    @SerializedName("File")
    @Expose
    private MPSOutputFileInfo File;

    /**
     * Get <p>处理任务类型</p><p>枚举值：</p><ul><li>AiAnalysis.DescriptionTask： 智能摘要任务</li><li>AiAnalysis.VideoComprehensionTask： 视频理解任务</li><li>SmartSubtitle.AsrFullTextTask： 智能语音全文识别任务</li></ul> 
     * @return TaskType <p>处理任务类型</p><p>枚举值：</p><ul><li>AiAnalysis.DescriptionTask： 智能摘要任务</li><li>AiAnalysis.VideoComprehensionTask： 视频理解任务</li><li>SmartSubtitle.AsrFullTextTask： 智能语音全文识别任务</li></ul>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>处理任务类型</p><p>枚举值：</p><ul><li>AiAnalysis.DescriptionTask： 智能摘要任务</li><li>AiAnalysis.VideoComprehensionTask： 视频理解任务</li><li>SmartSubtitle.AsrFullTextTask： 智能语音全文识别任务</li></ul>
     * @param TaskType <p>处理任务类型</p><p>枚举值：</p><ul><li>AiAnalysis.DescriptionTask： 智能摘要任务</li><li>AiAnalysis.VideoComprehensionTask： 视频理解任务</li><li>SmartSubtitle.AsrFullTextTask： 智能语音全文识别任务</li></ul>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>任务输出文件集合</p> 
     * @return File <p>任务输出文件集合</p>
     */
    public MPSOutputFileInfo getFile() {
        return this.File;
    }

    /**
     * Set <p>任务输出文件集合</p>
     * @param File <p>任务输出文件集合</p>
     */
    public void setFile(MPSOutputFileInfo File) {
        this.File = File;
    }

    public KnowledgeAnalysisResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeAnalysisResult(KnowledgeAnalysisResult source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.File != null) {
            this.File = new MPSOutputFileInfo(source.File);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamObj(map, prefix + "File.", this.File);

    }
}

