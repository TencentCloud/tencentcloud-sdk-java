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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CronHorizontalAutoscalerSchedule extends AbstractModel{

    /**
    * 触发事件，小时分钟，用:分割
例如
00:00（零点零分触发）
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * 目标实例数（不大于50）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetReplicas")
    @Expose
    private Long TargetReplicas;

    /**
     * Get 触发事件，小时分钟，用:分割
例如
00:00（零点零分触发） 
     * @return StartAt 触发事件，小时分钟，用:分割
例如
00:00（零点零分触发）
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set 触发事件，小时分钟，用:分割
例如
00:00（零点零分触发）
     * @param StartAt 触发事件，小时分钟，用:分割
例如
00:00（零点零分触发）
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get 目标实例数（不大于50）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetReplicas 目标实例数（不大于50）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetReplicas() {
        return this.TargetReplicas;
    }

    /**
     * Set 目标实例数（不大于50）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetReplicas 目标实例数（不大于50）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetReplicas(Long TargetReplicas) {
        this.TargetReplicas = TargetReplicas;
    }

    public CronHorizontalAutoscalerSchedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CronHorizontalAutoscalerSchedule(CronHorizontalAutoscalerSchedule source) {
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.TargetReplicas != null) {
            this.TargetReplicas = new Long(source.TargetReplicas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "TargetReplicas", this.TargetReplicas);

    }
}

