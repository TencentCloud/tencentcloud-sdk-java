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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiCondition extends AbstractModel {

    /**
    * 触发条件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 告警级别。0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。

- 不填则默认为0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
     * Get 触发条件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Condition 触发条件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 触发条件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Condition 触发条件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 告警级别。0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。

- 不填则默认为0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmLevel 告警级别。0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。

- 不填则默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警级别。0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。

- 不填则默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmLevel 告警级别。0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。

- 不填则默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    public MultiCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiCondition(MultiCondition source) {
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);

    }
}

