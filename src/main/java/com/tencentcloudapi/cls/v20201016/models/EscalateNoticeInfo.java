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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EscalateNoticeInfo extends AbstractModel {

    /**
    * 告警通知模板接收者信息。
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * 告警通知模板回调信息。
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * 告警升级开关。`true`：开启告警升级、`false`：关闭告警升级，默认：false
    */
    @SerializedName("Escalate")
    @Expose
    private Boolean Escalate;

    /**
    * 告警升级间隔。单位：分钟，范围`[1，14400]`
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 升级条件。`1`：无人认领且未恢复、`2`：未恢复，默认为1
- 无人认领且未恢复：告警没有恢复并且没有人认领则升级
- 未恢复：当前告警持续未恢复则升级

    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 告警升级后下一个环节的通知渠道配置，最多可配置5个环节。
    */
    @SerializedName("EscalateNotice")
    @Expose
    private EscalateNoticeInfo EscalateNotice;

    /**
     * Get 告警通知模板接收者信息。 
     * @return NoticeReceivers 告警通知模板接收者信息。
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set 告警通知模板接收者信息。
     * @param NoticeReceivers 告警通知模板接收者信息。
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get 告警通知模板回调信息。 
     * @return WebCallbacks 告警通知模板回调信息。
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set 告警通知模板回调信息。
     * @param WebCallbacks 告警通知模板回调信息。
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get 告警升级开关。`true`：开启告警升级、`false`：关闭告警升级，默认：false 
     * @return Escalate 告警升级开关。`true`：开启告警升级、`false`：关闭告警升级，默认：false
     */
    public Boolean getEscalate() {
        return this.Escalate;
    }

    /**
     * Set 告警升级开关。`true`：开启告警升级、`false`：关闭告警升级，默认：false
     * @param Escalate 告警升级开关。`true`：开启告警升级、`false`：关闭告警升级，默认：false
     */
    public void setEscalate(Boolean Escalate) {
        this.Escalate = Escalate;
    }

    /**
     * Get 告警升级间隔。单位：分钟，范围`[1，14400]` 
     * @return Interval 告警升级间隔。单位：分钟，范围`[1，14400]`
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 告警升级间隔。单位：分钟，范围`[1，14400]`
     * @param Interval 告警升级间隔。单位：分钟，范围`[1，14400]`
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 升级条件。`1`：无人认领且未恢复、`2`：未恢复，默认为1
- 无人认领且未恢复：告警没有恢复并且没有人认领则升级
- 未恢复：当前告警持续未恢复则升级
 
     * @return Type 升级条件。`1`：无人认领且未恢复、`2`：未恢复，默认为1
- 无人认领且未恢复：告警没有恢复并且没有人认领则升级
- 未恢复：当前告警持续未恢复则升级

     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 升级条件。`1`：无人认领且未恢复、`2`：未恢复，默认为1
- 无人认领且未恢复：告警没有恢复并且没有人认领则升级
- 未恢复：当前告警持续未恢复则升级

     * @param Type 升级条件。`1`：无人认领且未恢复、`2`：未恢复，默认为1
- 无人认领且未恢复：告警没有恢复并且没有人认领则升级
- 未恢复：当前告警持续未恢复则升级

     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 告警升级后下一个环节的通知渠道配置，最多可配置5个环节。 
     * @return EscalateNotice 告警升级后下一个环节的通知渠道配置，最多可配置5个环节。
     */
    public EscalateNoticeInfo getEscalateNotice() {
        return this.EscalateNotice;
    }

    /**
     * Set 告警升级后下一个环节的通知渠道配置，最多可配置5个环节。
     * @param EscalateNotice 告警升级后下一个环节的通知渠道配置，最多可配置5个环节。
     */
    public void setEscalateNotice(EscalateNoticeInfo EscalateNotice) {
        this.EscalateNotice = EscalateNotice;
    }

    public EscalateNoticeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EscalateNoticeInfo(EscalateNoticeInfo source) {
        if (source.NoticeReceivers != null) {
            this.NoticeReceivers = new NoticeReceiver[source.NoticeReceivers.length];
            for (int i = 0; i < source.NoticeReceivers.length; i++) {
                this.NoticeReceivers[i] = new NoticeReceiver(source.NoticeReceivers[i]);
            }
        }
        if (source.WebCallbacks != null) {
            this.WebCallbacks = new WebCallback[source.WebCallbacks.length];
            for (int i = 0; i < source.WebCallbacks.length; i++) {
                this.WebCallbacks[i] = new WebCallback(source.WebCallbacks[i]);
            }
        }
        if (source.Escalate != null) {
            this.Escalate = new Boolean(source.Escalate);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.EscalateNotice != null) {
            this.EscalateNotice = new EscalateNoticeInfo(source.EscalateNotice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);
        this.setParamSimple(map, prefix + "Escalate", this.Escalate);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "EscalateNotice.", this.EscalateNotice);

    }
}

