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

public class AigcVideoTaskOutput extends AbstractModel {

    /**
    * <p>AIGC 生视频任务的输出文件信息。</p>
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcVideoTaskOutputFileInfo [] FileInfos;

    /**
    * <p>任务类型为 Procedure 的任务 ID。若发起<a href="https://cloud.tencent.com/document/product/266/126239">创建 AIGC 生视频任务</a>时指定了任务流模板(Procedure)，当该任务流模板指定了 MediaProcessTask、AiAnalysisTask、AiRecognitionTask 中的一个或多个时发起该任务。</p>
    */
    @SerializedName("ProcedureTaskIds")
    @Expose
    private String [] ProcedureTaskIds;

    /**
     * Get <p>AIGC 生视频任务的输出文件信息。</p> 
     * @return FileInfos <p>AIGC 生视频任务的输出文件信息。</p>
     */
    public AigcVideoTaskOutputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>AIGC 生视频任务的输出文件信息。</p>
     * @param FileInfos <p>AIGC 生视频任务的输出文件信息。</p>
     */
    public void setFileInfos(AigcVideoTaskOutputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get <p>任务类型为 Procedure 的任务 ID。若发起<a href="https://cloud.tencent.com/document/product/266/126239">创建 AIGC 生视频任务</a>时指定了任务流模板(Procedure)，当该任务流模板指定了 MediaProcessTask、AiAnalysisTask、AiRecognitionTask 中的一个或多个时发起该任务。</p> 
     * @return ProcedureTaskIds <p>任务类型为 Procedure 的任务 ID。若发起<a href="https://cloud.tencent.com/document/product/266/126239">创建 AIGC 生视频任务</a>时指定了任务流模板(Procedure)，当该任务流模板指定了 MediaProcessTask、AiAnalysisTask、AiRecognitionTask 中的一个或多个时发起该任务。</p>
     */
    public String [] getProcedureTaskIds() {
        return this.ProcedureTaskIds;
    }

    /**
     * Set <p>任务类型为 Procedure 的任务 ID。若发起<a href="https://cloud.tencent.com/document/product/266/126239">创建 AIGC 生视频任务</a>时指定了任务流模板(Procedure)，当该任务流模板指定了 MediaProcessTask、AiAnalysisTask、AiRecognitionTask 中的一个或多个时发起该任务。</p>
     * @param ProcedureTaskIds <p>任务类型为 Procedure 的任务 ID。若发起<a href="https://cloud.tencent.com/document/product/266/126239">创建 AIGC 生视频任务</a>时指定了任务流模板(Procedure)，当该任务流模板指定了 MediaProcessTask、AiAnalysisTask、AiRecognitionTask 中的一个或多个时发起该任务。</p>
     */
    public void setProcedureTaskIds(String [] ProcedureTaskIds) {
        this.ProcedureTaskIds = ProcedureTaskIds;
    }

    public AigcVideoTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskOutput(AigcVideoTaskOutput source) {
        if (source.FileInfos != null) {
            this.FileInfos = new AigcVideoTaskOutputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcVideoTaskOutputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.ProcedureTaskIds != null) {
            this.ProcedureTaskIds = new String[source.ProcedureTaskIds.length];
            for (int i = 0; i < source.ProcedureTaskIds.length; i++) {
                this.ProcedureTaskIds[i] = new String(source.ProcedureTaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArraySimple(map, prefix + "ProcedureTaskIds.", this.ProcedureTaskIds);

    }
}

