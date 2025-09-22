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

public class BudgetSendInfoDto extends AbstractModel {

    /**
    * 通知周期,逗号隔开。
枚举值:
周一:1,
周二:2,
周天:7
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeekDays")
    @Expose
    private Long [] WeekDays;

    /**
    * 接收类型。
枚举值:
UIN 默认模式,
USER 用户,
GROUP 用户组。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * 发送接收窗口HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 预算配置id（预算名称）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BudgetId")
    @Expose
    private Long BudgetId;

    /**
    * 接收渠道,逗号隔开;
枚举值:
TITLE 标题，
SITE 站内信,
EMAIL 邮件,
SMS 短信,
WECHAT 微信,
VOICE 语音,
QYWX 企业微信;
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeWays")
    @Expose
    private String [] NoticeWays;

    /**
    * 发送开始窗口HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 用户id,用户组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverIds")
    @Expose
    private Long [] ReceiverIds;

    /**
     * Get 通知周期,逗号隔开。
枚举值:
周一:1,
周二:2,
周天:7
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeekDays 通知周期,逗号隔开。
枚举值:
周一:1,
周二:2,
周天:7
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set 通知周期,逗号隔开。
枚举值:
周一:1,
周二:2,
周天:7
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeekDays 通知周期,逗号隔开。
枚举值:
周一:1,
周二:2,
周天:7
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeekDays(Long [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get 接收类型。
枚举值:
UIN 默认模式,
USER 用户,
GROUP 用户组。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverType 接收类型。
枚举值:
UIN 默认模式,
USER 用户,
GROUP 用户组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set 接收类型。
枚举值:
UIN 默认模式,
USER 用户,
GROUP 用户组。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverType 接收类型。
枚举值:
UIN 默认模式,
USER 用户,
GROUP 用户组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get 发送接收窗口HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 发送接收窗口HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 发送接收窗口HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 发送接收窗口HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 预算配置id（预算名称）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BudgetId 预算配置id（预算名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set 预算配置id（预算名称）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BudgetId 预算配置id（预算名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBudgetId(Long BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get 接收渠道,逗号隔开;
枚举值:
TITLE 标题，
SITE 站内信,
EMAIL 邮件,
SMS 短信,
WECHAT 微信,
VOICE 语音,
QYWX 企业微信;
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeWays 接收渠道,逗号隔开;
枚举值:
TITLE 标题，
SITE 站内信,
EMAIL 邮件,
SMS 短信,
WECHAT 微信,
VOICE 语音,
QYWX 企业微信;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNoticeWays() {
        return this.NoticeWays;
    }

    /**
     * Set 接收渠道,逗号隔开;
枚举值:
TITLE 标题，
SITE 站内信,
EMAIL 邮件,
SMS 短信,
WECHAT 微信,
VOICE 语音,
QYWX 企业微信;
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeWays 接收渠道,逗号隔开;
枚举值:
TITLE 标题，
SITE 站内信,
EMAIL 邮件,
SMS 短信,
WECHAT 微信,
VOICE 语音,
QYWX 企业微信;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeWays(String [] NoticeWays) {
        this.NoticeWays = NoticeWays;
    }

    /**
     * Get 发送开始窗口HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 发送开始窗口HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 发送开始窗口HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 发送开始窗口HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 用户id,用户组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverIds 用户id,用户组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getReceiverIds() {
        return this.ReceiverIds;
    }

    /**
     * Set 用户id,用户组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverIds 用户id,用户组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverIds(Long [] ReceiverIds) {
        this.ReceiverIds = ReceiverIds;
    }

    public BudgetSendInfoDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetSendInfoDto(BudgetSendInfoDto source) {
        if (source.WeekDays != null) {
            this.WeekDays = new Long[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new Long(source.WeekDays[i]);
            }
        }
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new Long(source.BudgetId);
        }
        if (source.NoticeWays != null) {
            this.NoticeWays = new String[source.NoticeWays.length];
            for (int i = 0; i < source.NoticeWays.length; i++) {
                this.NoticeWays[i] = new String(source.NoticeWays[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ReceiverIds != null) {
            this.ReceiverIds = new Long[source.ReceiverIds.length];
            for (int i = 0; i < source.ReceiverIds.length; i++) {
                this.ReceiverIds[i] = new Long(source.ReceiverIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamArraySimple(map, prefix + "NoticeWays.", this.NoticeWays);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "ReceiverIds.", this.ReceiverIds);

    }
}

