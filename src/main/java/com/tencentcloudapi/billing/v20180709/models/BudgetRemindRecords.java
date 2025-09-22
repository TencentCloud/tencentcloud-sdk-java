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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BudgetRemindRecords extends AbstractModel {

    /**
    * 预算周期
    */
    @SerializedName("DateDesc")
    @Expose
    private String DateDesc;

    /**
    * 实际费用
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * 预算值额度
    */
    @SerializedName("BudgetQuota")
    @Expose
    private String BudgetQuota;

    /**
    * 提醒类型。
枚举值:
BUDGET 预算提醒,
WAVE 波动提醒.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * 消息内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageContent")
    @Expose
    private String MessageContent;

    /**
    * 发送时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendTime")
    @Expose
    private Long SendTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get 预算周期 
     * @return DateDesc 预算周期
     */
    public String getDateDesc() {
        return this.DateDesc;
    }

    /**
     * Set 预算周期
     * @param DateDesc 预算周期
     */
    public void setDateDesc(String DateDesc) {
        this.DateDesc = DateDesc;
    }

    /**
     * Get 实际费用 
     * @return RealCost 实际费用
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set 实际费用
     * @param RealCost 实际费用
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get 预算值额度 
     * @return BudgetQuota 预算值额度
     */
    public String getBudgetQuota() {
        return this.BudgetQuota;
    }

    /**
     * Set 预算值额度
     * @param BudgetQuota 预算值额度
     */
    public void setBudgetQuota(String BudgetQuota) {
        this.BudgetQuota = BudgetQuota;
    }

    /**
     * Get 提醒类型。
枚举值:
BUDGET 预算提醒,
WAVE 波动提醒.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmType 提醒类型。
枚举值:
BUDGET 预算提醒,
WAVE 波动提醒.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set 提醒类型。
枚举值:
BUDGET 预算提醒,
WAVE 波动提醒.
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmType 提醒类型。
枚举值:
BUDGET 预算提醒,
WAVE 波动提醒.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get 消息内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageContent 消息内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessageContent() {
        return this.MessageContent;
    }

    /**
     * Set 消息内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageContent 消息内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageContent(String MessageContent) {
        this.MessageContent = MessageContent;
    }

    /**
     * Get 发送时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendTime 发送时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSendTime() {
        return this.SendTime;
    }

    /**
     * Set 发送时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendTime 发送时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendTime(Long SendTime) {
        this.SendTime = SendTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public BudgetRemindRecords() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetRemindRecords(BudgetRemindRecords source) {
        if (source.DateDesc != null) {
            this.DateDesc = new String(source.DateDesc);
        }
        if (source.RealCost != null) {
            this.RealCost = new String(source.RealCost);
        }
        if (source.BudgetQuota != null) {
            this.BudgetQuota = new String(source.BudgetQuota);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.MessageContent != null) {
            this.MessageContent = new String(source.MessageContent);
        }
        if (source.SendTime != null) {
            this.SendTime = new Long(source.SendTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DateDesc", this.DateDesc);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamSimple(map, prefix + "BudgetQuota", this.BudgetQuota);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "MessageContent", this.MessageContent);
        this.setParamSimple(map, prefix + "SendTime", this.SendTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

