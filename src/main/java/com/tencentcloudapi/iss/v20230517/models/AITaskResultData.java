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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AITaskResultData extends AbstractModel{

    /**
    * AI 任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 在 BeginTime 和 EndTime 时间之内，有识别结果的 AI 调用次数（分页依据此数值）
    */
    @SerializedName("AIResultCount")
    @Expose
    private Long AIResultCount;

    /**
    * AI 任务执行结果详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AIResults")
    @Expose
    private AITaskResultInfo AIResults;

    /**
     * Get AI 任务 ID 
     * @return TaskId AI 任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set AI 任务 ID
     * @param TaskId AI 任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 在 BeginTime 和 EndTime 时间之内，有识别结果的 AI 调用次数（分页依据此数值） 
     * @return AIResultCount 在 BeginTime 和 EndTime 时间之内，有识别结果的 AI 调用次数（分页依据此数值）
     */
    public Long getAIResultCount() {
        return this.AIResultCount;
    }

    /**
     * Set 在 BeginTime 和 EndTime 时间之内，有识别结果的 AI 调用次数（分页依据此数值）
     * @param AIResultCount 在 BeginTime 和 EndTime 时间之内，有识别结果的 AI 调用次数（分页依据此数值）
     */
    public void setAIResultCount(Long AIResultCount) {
        this.AIResultCount = AIResultCount;
    }

    /**
     * Get AI 任务执行结果详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AIResults AI 任务执行结果详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AITaskResultInfo getAIResults() {
        return this.AIResults;
    }

    /**
     * Set AI 任务执行结果详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param AIResults AI 任务执行结果详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAIResults(AITaskResultInfo AIResults) {
        this.AIResults = AIResults;
    }

    public AITaskResultData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AITaskResultData(AITaskResultData source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.AIResultCount != null) {
            this.AIResultCount = new Long(source.AIResultCount);
        }
        if (source.AIResults != null) {
            this.AIResults = new AITaskResultInfo(source.AIResults);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "AIResultCount", this.AIResultCount);
        this.setParamObj(map, prefix + "AIResults.", this.AIResults);

    }
}

