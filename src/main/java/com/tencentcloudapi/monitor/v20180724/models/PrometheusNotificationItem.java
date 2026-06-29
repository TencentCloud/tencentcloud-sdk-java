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

public class PrometheusNotificationItem extends AbstractModel {

    /**
    * <p>是否启用</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>通道类型，默认为amp，支持以下<br>amp<br>webhook<br>alertmanager</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>如果Type为webhook, 则该字段为必填项</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebHook")
    @Expose
    private String WebHook;

    /**
    * <p>如果Type为alertmanager, 则该字段为必填项</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertManager")
    @Expose
    private PrometheusAlertManagerConfig AlertManager;

    /**
    * <p>收敛时间</p>
    */
    @SerializedName("RepeatInterval")
    @Expose
    private String RepeatInterval;

    /**
    * <p>生效起始时间</p>
    */
    @SerializedName("TimeRangeStart")
    @Expose
    private String TimeRangeStart;

    /**
    * <p>生效结束时间</p>
    */
    @SerializedName("TimeRangeEnd")
    @Expose
    private String TimeRangeEnd;

    /**
    * <p>告警通知方式。目前有SMS、EMAIL、CALL、WECHAT方式。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * <p>告警接收组（用户组）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverGroups")
    @Expose
    private String [] ReceiverGroups;

    /**
    * <p>电话告警顺序。<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNotifyOrder")
    @Expose
    private Long [] PhoneNotifyOrder;

    /**
    * <p>电话告警次数。<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneCircleTimes")
    @Expose
    private Long PhoneCircleTimes;

    /**
    * <p>电话告警轮内间隔。单位：秒<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneInnerInterval")
    @Expose
    private Long PhoneInnerInterval;

    /**
    * <p>电话告警轮外间隔。单位：秒<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneCircleInterval")
    @Expose
    private Long PhoneCircleInterval;

    /**
    * <p>电话告警触达通知<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneArriveNotice")
    @Expose
    private Boolean PhoneArriveNotice;

    /**
     * Get <p>是否启用</p> 
     * @return Enabled <p>是否启用</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用</p>
     * @param Enabled <p>是否启用</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>通道类型，默认为amp，支持以下<br>amp<br>webhook<br>alertmanager</p> 
     * @return Type <p>通道类型，默认为amp，支持以下<br>amp<br>webhook<br>alertmanager</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>通道类型，默认为amp，支持以下<br>amp<br>webhook<br>alertmanager</p>
     * @param Type <p>通道类型，默认为amp，支持以下<br>amp<br>webhook<br>alertmanager</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>如果Type为webhook, 则该字段为必填项</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebHook <p>如果Type为webhook, 则该字段为必填项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebHook() {
        return this.WebHook;
    }

    /**
     * Set <p>如果Type为webhook, 则该字段为必填项</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebHook <p>如果Type为webhook, 则该字段为必填项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebHook(String WebHook) {
        this.WebHook = WebHook;
    }

    /**
     * Get <p>如果Type为alertmanager, 则该字段为必填项</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertManager <p>如果Type为alertmanager, 则该字段为必填项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusAlertManagerConfig getAlertManager() {
        return this.AlertManager;
    }

    /**
     * Set <p>如果Type为alertmanager, 则该字段为必填项</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertManager <p>如果Type为alertmanager, 则该字段为必填项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertManager(PrometheusAlertManagerConfig AlertManager) {
        this.AlertManager = AlertManager;
    }

    /**
     * Get <p>收敛时间</p> 
     * @return RepeatInterval <p>收敛时间</p>
     */
    public String getRepeatInterval() {
        return this.RepeatInterval;
    }

    /**
     * Set <p>收敛时间</p>
     * @param RepeatInterval <p>收敛时间</p>
     */
    public void setRepeatInterval(String RepeatInterval) {
        this.RepeatInterval = RepeatInterval;
    }

    /**
     * Get <p>生效起始时间</p> 
     * @return TimeRangeStart <p>生效起始时间</p>
     */
    public String getTimeRangeStart() {
        return this.TimeRangeStart;
    }

    /**
     * Set <p>生效起始时间</p>
     * @param TimeRangeStart <p>生效起始时间</p>
     */
    public void setTimeRangeStart(String TimeRangeStart) {
        this.TimeRangeStart = TimeRangeStart;
    }

    /**
     * Get <p>生效结束时间</p> 
     * @return TimeRangeEnd <p>生效结束时间</p>
     */
    public String getTimeRangeEnd() {
        return this.TimeRangeEnd;
    }

    /**
     * Set <p>生效结束时间</p>
     * @param TimeRangeEnd <p>生效结束时间</p>
     */
    public void setTimeRangeEnd(String TimeRangeEnd) {
        this.TimeRangeEnd = TimeRangeEnd;
    }

    /**
     * Get <p>告警通知方式。目前有SMS、EMAIL、CALL、WECHAT方式。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyWay <p>告警通知方式。目前有SMS、EMAIL、CALL、WECHAT方式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNotifyWay() {
        return this.NotifyWay;
    }

    /**
     * Set <p>告警通知方式。目前有SMS、EMAIL、CALL、WECHAT方式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyWay <p>告警通知方式。目前有SMS、EMAIL、CALL、WECHAT方式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyWay(String [] NotifyWay) {
        this.NotifyWay = NotifyWay;
    }

    /**
     * Get <p>告警接收组（用户组）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverGroups <p>告警接收组（用户组）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set <p>告警接收组（用户组）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverGroups <p>告警接收组（用户组）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverGroups(String [] ReceiverGroups) {
        this.ReceiverGroups = ReceiverGroups;
    }

    /**
     * Get <p>电话告警顺序。<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneNotifyOrder <p>电话告警顺序。<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPhoneNotifyOrder() {
        return this.PhoneNotifyOrder;
    }

    /**
     * Set <p>电话告警顺序。<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneNotifyOrder <p>电话告警顺序。<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneNotifyOrder(Long [] PhoneNotifyOrder) {
        this.PhoneNotifyOrder = PhoneNotifyOrder;
    }

    /**
     * Get <p>电话告警次数。<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneCircleTimes <p>电话告警次数。<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhoneCircleTimes() {
        return this.PhoneCircleTimes;
    }

    /**
     * Set <p>电话告警次数。<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneCircleTimes <p>电话告警次数。<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneCircleTimes(Long PhoneCircleTimes) {
        this.PhoneCircleTimes = PhoneCircleTimes;
    }

    /**
     * Get <p>电话告警轮内间隔。单位：秒<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneInnerInterval <p>电话告警轮内间隔。单位：秒<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhoneInnerInterval() {
        return this.PhoneInnerInterval;
    }

    /**
     * Set <p>电话告警轮内间隔。单位：秒<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneInnerInterval <p>电话告警轮内间隔。单位：秒<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneInnerInterval(Long PhoneInnerInterval) {
        this.PhoneInnerInterval = PhoneInnerInterval;
    }

    /**
     * Get <p>电话告警轮外间隔。单位：秒<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneCircleInterval <p>电话告警轮外间隔。单位：秒<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhoneCircleInterval() {
        return this.PhoneCircleInterval;
    }

    /**
     * Set <p>电话告警轮外间隔。单位：秒<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneCircleInterval <p>电话告警轮外间隔。单位：秒<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneCircleInterval(Long PhoneCircleInterval) {
        this.PhoneCircleInterval = PhoneCircleInterval;
    }

    /**
     * Get <p>电话告警触达通知<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneArriveNotice <p>电话告警触达通知<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPhoneArriveNotice() {
        return this.PhoneArriveNotice;
    }

    /**
     * Set <p>电话告警触达通知<br>注：NotifyWay选择CALL，采用该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneArriveNotice <p>电话告警触达通知<br>注：NotifyWay选择CALL，采用该参数。</p>
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

