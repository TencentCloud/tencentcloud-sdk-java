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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiSchedulePlanInfo extends AbstractModel {

    /**
    * 触发器 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * 预计触发时间，Unix 毫秒时间戳。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FireTime")
    @Expose
    private Long FireTime;

    /**
    * 触发器类型。取值：1（Cron 表达式）、2（固定时间）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
     * Get 触发器 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerId 触发器 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set 触发器 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerId 触发器 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get 预计触发时间，Unix 毫秒时间戳。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FireTime 预计触发时间，Unix 毫秒时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFireTime() {
        return this.FireTime;
    }

    /**
     * Set 预计触发时间，Unix 毫秒时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FireTime 预计触发时间，Unix 毫秒时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFireTime(Long FireTime) {
        this.FireTime = FireTime;
    }

    /**
     * Get 触发器类型。取值：1（Cron 表达式）、2（固定时间）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType 触发器类型。取值：1（Cron 表达式）、2（固定时间）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 触发器类型。取值：1（Cron 表达式）、2（固定时间）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType 触发器类型。取值：1（Cron 表达式）、2（固定时间）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    public AiSchedulePlanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiSchedulePlanInfo(AiSchedulePlanInfo source) {
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.FireTime != null) {
            this.FireTime = new Long(source.FireTime);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "FireTime", this.FireTime);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);

    }
}

