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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFlowInfo extends AbstractModel {

    /**
    * 任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFlowId")
    @Expose
    private String TaskFlowId;

    /**
    * 任务流程名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFlowName")
    @Expose
    private String TaskFlowName;

    /**
    * Query 重写结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryRewrite")
    @Expose
    private String QueryRewrite;

    /**
    * 命中意图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HitIntent")
    @Expose
    private String HitIntent;

    /**
    * 任务流程回复类型
0: 任务流回复
1: 任务流静默
2: 任务流拉回话术
3: 任务流自定义回复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 任务流程ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFlowId 任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskFlowId() {
        return this.TaskFlowId;
    }

    /**
     * Set 任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFlowId 任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFlowId(String TaskFlowId) {
        this.TaskFlowId = TaskFlowId;
    }

    /**
     * Get 任务流程名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFlowName 任务流程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskFlowName() {
        return this.TaskFlowName;
    }

    /**
     * Set 任务流程名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFlowName 任务流程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFlowName(String TaskFlowName) {
        this.TaskFlowName = TaskFlowName;
    }

    /**
     * Get Query 重写结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryRewrite Query 重写结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueryRewrite() {
        return this.QueryRewrite;
    }

    /**
     * Set Query 重写结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryRewrite Query 重写结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryRewrite(String QueryRewrite) {
        this.QueryRewrite = QueryRewrite;
    }

    /**
     * Get 命中意图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HitIntent 命中意图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHitIntent() {
        return this.HitIntent;
    }

    /**
     * Set 命中意图
注意：此字段可能返回 null，表示取不到有效值。
     * @param HitIntent 命中意图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHitIntent(String HitIntent) {
        this.HitIntent = HitIntent;
    }

    /**
     * Get 任务流程回复类型
0: 任务流回复
1: 任务流静默
2: 任务流拉回话术
3: 任务流自定义回复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 任务流程回复类型
0: 任务流回复
1: 任务流静默
2: 任务流拉回话术
3: 任务流自定义回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 任务流程回复类型
0: 任务流回复
1: 任务流静默
2: 任务流拉回话术
3: 任务流自定义回复
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 任务流程回复类型
0: 任务流回复
1: 任务流静默
2: 任务流拉回话术
3: 任务流自定义回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public TaskFlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFlowInfo(TaskFlowInfo source) {
        if (source.TaskFlowId != null) {
            this.TaskFlowId = new String(source.TaskFlowId);
        }
        if (source.TaskFlowName != null) {
            this.TaskFlowName = new String(source.TaskFlowName);
        }
        if (source.QueryRewrite != null) {
            this.QueryRewrite = new String(source.QueryRewrite);
        }
        if (source.HitIntent != null) {
            this.HitIntent = new String(source.HitIntent);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskFlowId", this.TaskFlowId);
        this.setParamSimple(map, prefix + "TaskFlowName", this.TaskFlowName);
        this.setParamSimple(map, prefix + "QueryRewrite", this.QueryRewrite);
        this.setParamSimple(map, prefix + "HitIntent", this.HitIntent);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

