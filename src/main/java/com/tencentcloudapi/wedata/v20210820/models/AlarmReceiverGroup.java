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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmReceiverGroup extends AbstractModel {

    /**
    * 告警接收人类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmRecipientType")
    @Expose
    private Long AlarmRecipientType;

    /**
    * 告警接收人ID，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmRecipientId")
    @Expose
    private String AlarmRecipientId;

    /**
    * 告警接收人名称，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmRecipientName")
    @Expose
    private String AlarmRecipientName;

    /**
    * 告警方式，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmWay")
    @Expose
    private String AlarmWay;

    /**
    * 免打扰时间段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuietPeriods")
    @Expose
    private QuietPeriod [] QuietPeriods;

    /**
    * 告警渠道规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmMessageRule")
    @Expose
    private String AlarmMessageRule;

    /**
     * Get 告警接收人类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmRecipientType 告警接收人类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmRecipientType() {
        return this.AlarmRecipientType;
    }

    /**
     * Set 告警接收人类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmRecipientType 告警接收人类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmRecipientType(Long AlarmRecipientType) {
        this.AlarmRecipientType = AlarmRecipientType;
    }

    /**
     * Get 告警接收人ID，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmRecipientId 告警接收人ID，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmRecipientId() {
        return this.AlarmRecipientId;
    }

    /**
     * Set 告警接收人ID，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmRecipientId 告警接收人ID，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmRecipientId(String AlarmRecipientId) {
        this.AlarmRecipientId = AlarmRecipientId;
    }

    /**
     * Get 告警接收人名称，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmRecipientName 告警接收人名称，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmRecipientName() {
        return this.AlarmRecipientName;
    }

    /**
     * Set 告警接收人名称，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmRecipientName 告警接收人名称，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmRecipientName(String AlarmRecipientName) {
        this.AlarmRecipientName = AlarmRecipientName;
    }

    /**
     * Get 告警方式，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmWay 告警方式，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmWay() {
        return this.AlarmWay;
    }

    /**
     * Set 告警方式，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmWay 告警方式，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmWay(String AlarmWay) {
        this.AlarmWay = AlarmWay;
    }

    /**
     * Get 免打扰时间段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuietPeriods 免打扰时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QuietPeriod [] getQuietPeriods() {
        return this.QuietPeriods;
    }

    /**
     * Set 免打扰时间段
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuietPeriods 免打扰时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuietPeriods(QuietPeriod [] QuietPeriods) {
        this.QuietPeriods = QuietPeriods;
    }

    /**
     * Get 告警渠道规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmMessageRule 告警渠道规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmMessageRule() {
        return this.AlarmMessageRule;
    }

    /**
     * Set 告警渠道规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmMessageRule 告警渠道规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmMessageRule(String AlarmMessageRule) {
        this.AlarmMessageRule = AlarmMessageRule;
    }

    public AlarmReceiverGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmReceiverGroup(AlarmReceiverGroup source) {
        if (source.AlarmRecipientType != null) {
            this.AlarmRecipientType = new Long(source.AlarmRecipientType);
        }
        if (source.AlarmRecipientId != null) {
            this.AlarmRecipientId = new String(source.AlarmRecipientId);
        }
        if (source.AlarmRecipientName != null) {
            this.AlarmRecipientName = new String(source.AlarmRecipientName);
        }
        if (source.AlarmWay != null) {
            this.AlarmWay = new String(source.AlarmWay);
        }
        if (source.QuietPeriods != null) {
            this.QuietPeriods = new QuietPeriod[source.QuietPeriods.length];
            for (int i = 0; i < source.QuietPeriods.length; i++) {
                this.QuietPeriods[i] = new QuietPeriod(source.QuietPeriods[i]);
            }
        }
        if (source.AlarmMessageRule != null) {
            this.AlarmMessageRule = new String(source.AlarmMessageRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmRecipientType", this.AlarmRecipientType);
        this.setParamSimple(map, prefix + "AlarmRecipientId", this.AlarmRecipientId);
        this.setParamSimple(map, prefix + "AlarmRecipientName", this.AlarmRecipientName);
        this.setParamSimple(map, prefix + "AlarmWay", this.AlarmWay);
        this.setParamArrayObj(map, prefix + "QuietPeriods.", this.QuietPeriods);
        this.setParamSimple(map, prefix + "AlarmMessageRule", this.AlarmMessageRule);

    }
}

