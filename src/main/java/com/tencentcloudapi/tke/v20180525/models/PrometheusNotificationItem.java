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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusNotificationItem extends AbstractModel{

    /**
    * 是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 通道类型，默认为amp，支持以下
amp
webhook
alertmanager
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 如果Type为webhook, 则该字段为必填项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebHook")
    @Expose
    private String WebHook;

    /**
    * 如果Type为alertmanager, 则该字段为必填项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertManager")
    @Expose
    private PrometheusAlertManagerConfig AlertManager;

    /**
    * 收敛时间
    */
    @SerializedName("RepeatInterval")
    @Expose
    private String RepeatInterval;

    /**
    * 生效起始时间
    */
    @SerializedName("TimeRangeStart")
    @Expose
    private String TimeRangeStart;

    /**
    * 生效结束时间
    */
    @SerializedName("TimeRangeEnd")
    @Expose
    private String TimeRangeEnd;

    /**
    * 告警通知方式。目前有SMS、EMAIL、CALL、WECHAT方式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * 告警接收组（用户组）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverGroups")
    @Expose
    private String [] ReceiverGroups;

    /**
    * 电话告警顺序。
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNotifyOrder")
    @Expose
    private Long [] PhoneNotifyOrder;

    /**
    * 电话告警次数。
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneCircleTimes")
    @Expose
    private Long PhoneCircleTimes;

    /**
    * 电话告警轮内间隔。单位：秒
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneInnerInterval")
    @Expose
    private Long PhoneInnerInterval;

    /**
    * 电话告警轮外间隔。单位：秒
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneCircleInterval")
    @Expose
    private Long PhoneCircleInterval;

    /**
    * 电话告警触达通知
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneArriveNotice")
    @Expose
    private Boolean PhoneArriveNotice;

    /**
     * Get 是否启用 
     * @return Enabled 是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 通道类型，默认为amp，支持以下
amp
webhook
alertmanager 
     * @return Type 通道类型，默认为amp，支持以下
amp
webhook
alertmanager
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 通道类型，默认为amp，支持以下
amp
webhook
alertmanager
     * @param Type 通道类型，默认为amp，支持以下
amp
webhook
alertmanager
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 如果Type为webhook, 则该字段为必填项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebHook 如果Type为webhook, 则该字段为必填项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebHook() {
        return this.WebHook;
    }

    /**
     * Set 如果Type为webhook, 则该字段为必填项
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebHook 如果Type为webhook, 则该字段为必填项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebHook(String WebHook) {
        this.WebHook = WebHook;
    }

    /**
     * Get 如果Type为alertmanager, 则该字段为必填项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertManager 如果Type为alertmanager, 则该字段为必填项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusAlertManagerConfig getAlertManager() {
        return this.AlertManager;
    }

    /**
     * Set 如果Type为alertmanager, 则该字段为必填项
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertManager 如果Type为alertmanager, 则该字段为必填项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertManager(PrometheusAlertManagerConfig AlertManager) {
        this.AlertManager = AlertManager;
    }

    /**
     * Get 收敛时间 
     * @return RepeatInterval 收敛时间
     */
    public String getRepeatInterval() {
        return this.RepeatInterval;
    }

    /**
     * Set 收敛时间
     * @param RepeatInterval 收敛时间
     */
    public void setRepeatInterval(String RepeatInterval) {
        this.RepeatInterval = RepeatInterval;
    }

    /**
     * Get 生效起始时间 
     * @return TimeRangeStart 生效起始时间
     */
    public String getTimeRangeStart() {
        return this.TimeRangeStart;
    }

    /**
     * Set 生效起始时间
     * @param TimeRangeStart 生效起始时间
     */
    public void setTimeRangeStart(String TimeRangeStart) {
        this.TimeRangeStart = TimeRangeStart;
    }

    /**
     * Get 生效结束时间 
     * @return TimeRangeEnd 生效结束时间
     */
    public String getTimeRangeEnd() {
        return this.TimeRangeEnd;
    }

    /**
     * Set 生效结束时间
     * @param TimeRangeEnd 生效结束时间
     */
    public void setTimeRangeEnd(String TimeRangeEnd) {
        this.TimeRangeEnd = TimeRangeEnd;
    }

    /**
     * Get 告警通知方式。目前有SMS、EMAIL、CALL、WECHAT方式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyWay 告警通知方式。目前有SMS、EMAIL、CALL、WECHAT方式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNotifyWay() {
        return this.NotifyWay;
    }

    /**
     * Set 告警通知方式。目前有SMS、EMAIL、CALL、WECHAT方式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyWay 告警通知方式。目前有SMS、EMAIL、CALL、WECHAT方式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyWay(String [] NotifyWay) {
        this.NotifyWay = NotifyWay;
    }

    /**
     * Get 告警接收组（用户组）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverGroups 告警接收组（用户组）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set 告警接收组（用户组）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverGroups 告警接收组（用户组）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverGroups(String [] ReceiverGroups) {
        this.ReceiverGroups = ReceiverGroups;
    }

    /**
     * Get 电话告警顺序。
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneNotifyOrder 电话告警顺序。
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPhoneNotifyOrder() {
        return this.PhoneNotifyOrder;
    }

    /**
     * Set 电话告警顺序。
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneNotifyOrder 电话告警顺序。
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneNotifyOrder(Long [] PhoneNotifyOrder) {
        this.PhoneNotifyOrder = PhoneNotifyOrder;
    }

    /**
     * Get 电话告警次数。
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneCircleTimes 电话告警次数。
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhoneCircleTimes() {
        return this.PhoneCircleTimes;
    }

    /**
     * Set 电话告警次数。
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneCircleTimes 电话告警次数。
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneCircleTimes(Long PhoneCircleTimes) {
        this.PhoneCircleTimes = PhoneCircleTimes;
    }

    /**
     * Get 电话告警轮内间隔。单位：秒
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneInnerInterval 电话告警轮内间隔。单位：秒
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhoneInnerInterval() {
        return this.PhoneInnerInterval;
    }

    /**
     * Set 电话告警轮内间隔。单位：秒
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneInnerInterval 电话告警轮内间隔。单位：秒
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneInnerInterval(Long PhoneInnerInterval) {
        this.PhoneInnerInterval = PhoneInnerInterval;
    }

    /**
     * Get 电话告警轮外间隔。单位：秒
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneCircleInterval 电话告警轮外间隔。单位：秒
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhoneCircleInterval() {
        return this.PhoneCircleInterval;
    }

    /**
     * Set 电话告警轮外间隔。单位：秒
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneCircleInterval 电话告警轮外间隔。单位：秒
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneCircleInterval(Long PhoneCircleInterval) {
        this.PhoneCircleInterval = PhoneCircleInterval;
    }

    /**
     * Get 电话告警触达通知
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneArriveNotice 电话告警触达通知
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPhoneArriveNotice() {
        return this.PhoneArriveNotice;
    }

    /**
     * Set 电话告警触达通知
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneArriveNotice 电话告警触达通知
注：NotifyWay选择CALL，采用该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneArriveNotice(Boolean PhoneArriveNotice) {
        this.PhoneArriveNotice = PhoneArriveNotice;
    }

    public PrometheusNotificationItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusNotificationItem(PrometheusNotificationItem source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.WebHook != null) {
            this.WebHook = new String(source.WebHook);
        }
        if (source.AlertManager != null) {
            this.AlertManager = new PrometheusAlertManagerConfig(source.AlertManager);
        }
        if (source.RepeatInterval != null) {
            this.RepeatInterval = new String(source.RepeatInterval);
        }
        if (source.TimeRangeStart != null) {
            this.TimeRangeStart = new String(source.TimeRangeStart);
        }
        if (source.TimeRangeEnd != null) {
            this.TimeRangeEnd = new String(source.TimeRangeEnd);
        }
        if (source.NotifyWay != null) {
            this.NotifyWay = new String[source.NotifyWay.length];
            for (int i = 0; i < source.NotifyWay.length; i++) {
                this.NotifyWay[i] = new String(source.NotifyWay[i]);
            }
        }
        if (source.ReceiverGroups != null) {
            this.ReceiverGroups = new String[source.ReceiverGroups.length];
            for (int i = 0; i < source.ReceiverGroups.length; i++) {
                this.ReceiverGroups[i] = new String(source.ReceiverGroups[i]);
            }
        }
        if (source.PhoneNotifyOrder != null) {
            this.PhoneNotifyOrder = new Long[source.PhoneNotifyOrder.length];
            for (int i = 0; i < source.PhoneNotifyOrder.length; i++) {
                this.PhoneNotifyOrder[i] = new Long(source.PhoneNotifyOrder[i]);
            }
        }
        if (source.PhoneCircleTimes != null) {
            this.PhoneCircleTimes = new Long(source.PhoneCircleTimes);
        }
        if (source.PhoneInnerInterval != null) {
            this.PhoneInnerInterval = new Long(source.PhoneInnerInterval);
        }
        if (source.PhoneCircleInterval != null) {
            this.PhoneCircleInterval = new Long(source.PhoneCircleInterval);
        }
        if (source.PhoneArriveNotice != null) {
            this.PhoneArriveNotice = new Boolean(source.PhoneArriveNotice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "WebHook", this.WebHook);
        this.setParamObj(map, prefix + "AlertManager.", this.AlertManager);
        this.setParamSimple(map, prefix + "RepeatInterval", this.RepeatInterval);
        this.setParamSimple(map, prefix + "TimeRangeStart", this.TimeRangeStart);
        this.setParamSimple(map, prefix + "TimeRangeEnd", this.TimeRangeEnd);
        this.setParamArraySimple(map, prefix + "NotifyWay.", this.NotifyWay);
        this.setParamArraySimple(map, prefix + "ReceiverGroups.", this.ReceiverGroups);
        this.setParamArraySimple(map, prefix + "PhoneNotifyOrder.", this.PhoneNotifyOrder);
        this.setParamSimple(map, prefix + "PhoneCircleTimes", this.PhoneCircleTimes);
        this.setParamSimple(map, prefix + "PhoneInnerInterval", this.PhoneInnerInterval);
        this.setParamSimple(map, prefix + "PhoneCircleInterval", this.PhoneCircleInterval);
        this.setParamSimple(map, prefix + "PhoneArriveNotice", this.PhoneArriveNotice);

    }
}

