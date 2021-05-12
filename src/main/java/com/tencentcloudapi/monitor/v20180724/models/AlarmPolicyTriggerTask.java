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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmPolicyTriggerTask extends AbstractModel{

    /**
    * 触发任务类型 AS=弹性伸缩
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 用 json 表示配置信息 {"Key1":"Value1","Key2":"Value2"}
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskConfig")
    @Expose
    private String TaskConfig;

    /**
     * Get 触发任务类型 AS=弹性伸缩
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 触发任务类型 AS=弹性伸缩
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 触发任务类型 AS=弹性伸缩
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 触发任务类型 AS=弹性伸缩
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 用 json 表示配置信息 {"Key1":"Value1","Key2":"Value2"}
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskConfig 用 json 表示配置信息 {"Key1":"Value1","Key2":"Value2"}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskConfig() {
        return this.TaskConfig;
    }

    /**
     * Set 用 json 表示配置信息 {"Key1":"Value1","Key2":"Value2"}
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskConfig 用 json 表示配置信息 {"Key1":"Value1","Key2":"Value2"}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskConfig(String TaskConfig) {
        this.TaskConfig = TaskConfig;
    }

    public AlarmPolicyTriggerTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmPolicyTriggerTask(AlarmPolicyTriggerTask source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TaskConfig != null) {
            this.TaskConfig = new String(source.TaskConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TaskConfig", this.TaskConfig);

    }
}

