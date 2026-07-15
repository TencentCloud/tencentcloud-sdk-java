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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductEventListOverView extends AbstractModel {

    /**
    * <p>状态变更的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusChangeAmount")
    @Expose
    private Long StatusChangeAmount;

    /**
    * <p>告警状态未配置的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnConfigAlarmAmount")
    @Expose
    private Long UnConfigAlarmAmount;

    /**
    * <p>异常事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnNormalEventAmount")
    @Expose
    private Long UnNormalEventAmount;

    /**
    * <p>未恢复的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnRecoverAmount")
    @Expose
    private Long UnRecoverAmount;

    /**
     * Get <p>状态变更的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusChangeAmount <p>状态变更的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatusChangeAmount() {
        return this.StatusChangeAmount;
    }

    /**
     * Set <p>状态变更的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusChangeAmount <p>状态变更的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusChangeAmount(Long StatusChangeAmount) {
        this.StatusChangeAmount = StatusChangeAmount;
    }

    /**
     * Get <p>告警状态未配置的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnConfigAlarmAmount <p>告警状态未配置的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnConfigAlarmAmount() {
        return this.UnConfigAlarmAmount;
    }

    /**
     * Set <p>告警状态未配置的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnConfigAlarmAmount <p>告警状态未配置的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnConfigAlarmAmount(Long UnConfigAlarmAmount) {
        this.UnConfigAlarmAmount = UnConfigAlarmAmount;
    }

    /**
     * Get <p>异常事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnNormalEventAmount <p>异常事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnNormalEventAmount() {
        return this.UnNormalEventAmount;
    }

    /**
     * Set <p>异常事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnNormalEventAmount <p>异常事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnNormalEventAmount(Long UnNormalEventAmount) {
        this.UnNormalEventAmount = UnNormalEventAmount;
    }

    /**
     * Get <p>未恢复的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnRecoverAmount <p>未恢复的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnRecoverAmount() {
        return this.UnRecoverAmount;
    }

    /**
     * Set <p>未恢复的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnRecoverAmount <p>未恢复的事件数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnRecoverAmount(Long UnRecoverAmount) {
        this.UnRecoverAmount = UnRecoverAmount;
    }

    public DescribeProductEventListOverView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductEventListOverView(DescribeProductEventListOverView source) {
        if (source.StatusChangeAmount != null) {
            this.StatusChangeAmount = new Long(source.StatusChangeAmount);
        }
        if (source.UnConfigAlarmAmount != null) {
            this.UnConfigAlarmAmount = new Long(source.UnConfigAlarmAmount);
        }
        if (source.UnNormalEventAmount != null) {
            this.UnNormalEventAmount = new Long(source.UnNormalEventAmount);
        }
        if (source.UnRecoverAmount != null) {
            this.UnRecoverAmount = new Long(source.UnRecoverAmount);
        }
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

