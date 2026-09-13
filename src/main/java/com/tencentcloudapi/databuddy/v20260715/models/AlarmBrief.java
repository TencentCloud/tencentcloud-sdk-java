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

public class AlarmBrief extends AbstractModel {

    /**
    * 告警 ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * 告警的监控对象类型，如工作流、任务等，当前支持 1. WORKFLOW 2. TASK
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmMonitorType")
    @Expose
    private String AlarmMonitorType;

    /**
    * 告警组，最多 50 个
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmGroups")
    @Expose
    private AlarmGroup [] AlarmGroups;

    /**
    * 被跳过时免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DoNotDisturbWhenSkipped")
    @Expose
    private Boolean DoNotDisturbWhenSkipped;

    /**
    * 被手动终止时免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DoNotDisturbWhenManuallyTerminated")
    @Expose
    private Boolean DoNotDisturbWhenManuallyTerminated;

    /**
    * 最后一次重试前免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DoNotDisturbUntilTheLastRetry")
    @Expose
    private Boolean DoNotDisturbUntilTheLastRetry;

    /**
     * Get 告警 ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmId 告警 ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警 ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmId 告警 ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 告警的监控对象类型，如工作流、任务等，当前支持 1. WORKFLOW 2. TASK
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmMonitorType 告警的监控对象类型，如工作流、任务等，当前支持 1. WORKFLOW 2. TASK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmMonitorType() {
        return this.AlarmMonitorType;
    }

    /**
     * Set 告警的监控对象类型，如工作流、任务等，当前支持 1. WORKFLOW 2. TASK
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmMonitorType 告警的监控对象类型，如工作流、任务等，当前支持 1. WORKFLOW 2. TASK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmMonitorType(String AlarmMonitorType) {
        this.AlarmMonitorType = AlarmMonitorType;
    }

    /**
     * Get 告警组，最多 50 个
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmGroups 告警组，最多 50 个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmGroup [] getAlarmGroups() {
        return this.AlarmGroups;
    }

    /**
     * Set 告警组，最多 50 个
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmGroups 告警组，最多 50 个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmGroups(AlarmGroup [] AlarmGroups) {
        this.AlarmGroups = AlarmGroups;
    }

    /**
     * Get 被跳过时免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DoNotDisturbWhenSkipped 被跳过时免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDoNotDisturbWhenSkipped() {
        return this.DoNotDisturbWhenSkipped;
    }

    /**
     * Set 被跳过时免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。
     * @param DoNotDisturbWhenSkipped 被跳过时免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDoNotDisturbWhenSkipped(Boolean DoNotDisturbWhenSkipped) {
        this.DoNotDisturbWhenSkipped = DoNotDisturbWhenSkipped;
    }

    /**
     * Get 被手动终止时免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DoNotDisturbWhenManuallyTerminated 被手动终止时免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDoNotDisturbWhenManuallyTerminated() {
        return this.DoNotDisturbWhenManuallyTerminated;
    }

    /**
     * Set 被手动终止时免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。
     * @param DoNotDisturbWhenManuallyTerminated 被手动终止时免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDoNotDisturbWhenManuallyTerminated(Boolean DoNotDisturbWhenManuallyTerminated) {
        this.DoNotDisturbWhenManuallyTerminated = DoNotDisturbWhenManuallyTerminated;
    }

    /**
     * Get 最后一次重试前免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DoNotDisturbUntilTheLastRetry 最后一次重试前免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDoNotDisturbUntilTheLastRetry() {
        return this.DoNotDisturbUntilTheLastRetry;
    }

    /**
     * Set 最后一次重试前免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。
     * @param DoNotDisturbUntilTheLastRetry 最后一次重试前免打扰，默认值 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDoNotDisturbUntilTheLastRetry(Boolean DoNotDisturbUntilTheLastRetry) {
        this.DoNotDisturbUntilTheLastRetry = DoNotDisturbUntilTheLastRetry;
    }

    public AlarmBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmBrief(AlarmBrief source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.AlarmMonitorType != null) {
            this.AlarmMonitorType = new String(source.AlarmMonitorType);
        }
        if (source.AlarmGroups != null) {
            this.AlarmGroups = new AlarmGroup[source.AlarmGroups.length];
            for (int i = 0; i < source.AlarmGroups.length; i++) {
                this.AlarmGroups[i] = new AlarmGroup(source.AlarmGroups[i]);
            }
        }
        if (source.DoNotDisturbWhenSkipped != null) {
            this.DoNotDisturbWhenSkipped = new Boolean(source.DoNotDisturbWhenSkipped);
        }
        if (source.DoNotDisturbWhenManuallyTerminated != null) {
            this.DoNotDisturbWhenManuallyTerminated = new Boolean(source.DoNotDisturbWhenManuallyTerminated);
        }
        if (source.DoNotDisturbUntilTheLastRetry != null) {
            this.DoNotDisturbUntilTheLastRetry = new Boolean(source.DoNotDisturbUntilTheLastRetry);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "AlarmMonitorType", this.AlarmMonitorType);
        this.setParamArrayObj(map, prefix + "AlarmGroups.", this.AlarmGroups);
        this.setParamSimple(map, prefix + "DoNotDisturbWhenSkipped", this.DoNotDisturbWhenSkipped);
        this.setParamSimple(map, prefix + "DoNotDisturbWhenManuallyTerminated", this.DoNotDisturbWhenManuallyTerminated);
        this.setParamSimple(map, prefix + "DoNotDisturbUntilTheLastRetry", this.DoNotDisturbUntilTheLastRetry);

    }
}

