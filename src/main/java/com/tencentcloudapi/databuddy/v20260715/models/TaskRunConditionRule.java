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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskRunConditionRule extends AbstractModel {

    /**
    * <p>上游任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamTaskId")
    @Expose
    private String UpstreamTaskId;

    /**
    * <p>上游任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamTaskName")
    @Expose
    private String UpstreamTaskName;

    /**
    * <p>任务可运行条件<br>支持的状态值： - SUCCESS: 成功 - FAILED: 失败 - UPSTREAM_FAILED: 上游失败 - EXCLUDED: 排除运行</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowedStates")
    @Expose
    private String [] AllowedStates;

    /**
     * Get <p>上游任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamTaskId <p>上游任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpstreamTaskId() {
        return this.UpstreamTaskId;
    }

    /**
     * Set <p>上游任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamTaskId <p>上游任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamTaskId(String UpstreamTaskId) {
        this.UpstreamTaskId = UpstreamTaskId;
    }

    /**
     * Get <p>上游任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamTaskName <p>上游任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpstreamTaskName() {
        return this.UpstreamTaskName;
    }

    /**
     * Set <p>上游任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamTaskName <p>上游任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamTaskName(String UpstreamTaskName) {
        this.UpstreamTaskName = UpstreamTaskName;
    }

    /**
     * Get <p>任务可运行条件<br>支持的状态值： - SUCCESS: 成功 - FAILED: 失败 - UPSTREAM_FAILED: 上游失败 - EXCLUDED: 排除运行</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowedStates <p>任务可运行条件<br>支持的状态值： - SUCCESS: 成功 - FAILED: 失败 - UPSTREAM_FAILED: 上游失败 - EXCLUDED: 排除运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAllowedStates() {
        return this.AllowedStates;
    }

    /**
     * Set <p>任务可运行条件<br>支持的状态值： - SUCCESS: 成功 - FAILED: 失败 - UPSTREAM_FAILED: 上游失败 - EXCLUDED: 排除运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowedStates <p>任务可运行条件<br>支持的状态值： - SUCCESS: 成功 - FAILED: 失败 - UPSTREAM_FAILED: 上游失败 - EXCLUDED: 排除运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowedStates(String [] AllowedStates) {
        this.AllowedStates = AllowedStates;
    }

    public TaskRunConditionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskRunConditionRule(TaskRunConditionRule source) {
        if (source.UpstreamTaskId != null) {
            this.UpstreamTaskId = new String(source.UpstreamTaskId);
        }
        if (source.UpstreamTaskName != null) {
            this.UpstreamTaskName = new String(source.UpstreamTaskName);
        }
        if (source.AllowedStates != null) {
            this.AllowedStates = new String[source.AllowedStates.length];
            for (int i = 0; i < source.AllowedStates.length; i++) {
                this.AllowedStates[i] = new String(source.AllowedStates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UpstreamTaskId", this.UpstreamTaskId);
        this.setParamSimple(map, prefix + "UpstreamTaskName", this.UpstreamTaskName);
        this.setParamArraySimple(map, prefix + "AllowedStates.", this.AllowedStates);

    }
}

