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

public class DescribeProductEventListOverView extends AbstractModel{

    /**
    * 状态变更的事件数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusChangeAmount")
    @Expose
    private Long StatusChangeAmount;

    /**
    * 告警状态未配置的事件数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnConfigAlarmAmount")
    @Expose
    private Long UnConfigAlarmAmount;

    /**
    * 异常事件数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnNormalEventAmount")
    @Expose
    private Long UnNormalEventAmount;

    /**
    * 未恢复的事件数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnRecoverAmount")
    @Expose
    private Long UnRecoverAmount;

    /**
     * Get 状态变更的事件数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusChangeAmount 状态变更的事件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatusChangeAmount() {
        return this.StatusChangeAmount;
    }

    /**
     * Set 状态变更的事件数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusChangeAmount 状态变更的事件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusChangeAmount(Long StatusChangeAmount) {
        this.StatusChangeAmount = StatusChangeAmount;
    }

    /**
     * Get 告警状态未配置的事件数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnConfigAlarmAmount 告警状态未配置的事件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnConfigAlarmAmount() {
        return this.UnConfigAlarmAmount;
    }

    /**
     * Set 告警状态未配置的事件数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnConfigAlarmAmount 告警状态未配置的事件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnConfigAlarmAmount(Long UnConfigAlarmAmount) {
        this.UnConfigAlarmAmount = UnConfigAlarmAmount;
    }

    /**
     * Get 异常事件数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnNormalEventAmount 异常事件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnNormalEventAmount() {
        return this.UnNormalEventAmount;
    }

    /**
     * Set 异常事件数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnNormalEventAmount 异常事件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnNormalEventAmount(Long UnNormalEventAmount) {
        this.UnNormalEventAmount = UnNormalEventAmount;
    }

    /**
     * Get 未恢复的事件数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnRecoverAmount 未恢复的事件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnRecoverAmount() {
        return this.UnRecoverAmount;
    }

    /**
     * Set 未恢复的事件数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnRecoverAmount 未恢复的事件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnRecoverAmount(Long UnRecoverAmount) {
        this.UnRecoverAmount = UnRecoverAmount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusChangeAmount", this.StatusChangeAmount);
        this.setParamSimple(map, prefix + "UnConfigAlarmAmount", this.UnConfigAlarmAmount);
        this.setParamSimple(map, prefix + "UnNormalEventAmount", this.UnNormalEventAmount);
        this.setParamSimple(map, prefix + "UnRecoverAmount", this.UnRecoverAmount);

    }
}

