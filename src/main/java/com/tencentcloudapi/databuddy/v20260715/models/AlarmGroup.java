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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmGroup extends AbstractModel {

    /**
    * <p>通知渠道ID，可通过基础平台通知渠道相关接口获取</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>通知渠道名称，可以是用户组名称或邮箱地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * <p>是否启用邮件渠道，默认值：false</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEmailChannel")
    @Expose
    private Boolean IsEmailChannel;

    /**
    * <p>告警条件列表。取值：<br>START：启动<br>SUCCESS：成功<br>FAILURE：失败<br>MONITOR_INDICATOR_ALARM：监控指标告警</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmConditions")
    @Expose
    private String [] AlarmConditions;

    /**
    * <p>通知渠道类型。取值：0 未指定，1 Email，2 Webhook，3 Teams，4 Slack</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelType")
    @Expose
    private Long ChannelType;

    /**
     * Get <p>通知渠道ID，可通过基础平台通知渠道相关接口获取</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelId <p>通知渠道ID，可通过基础平台通知渠道相关接口获取</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通知渠道ID，可通过基础平台通知渠道相关接口获取</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelId <p>通知渠道ID，可通过基础平台通知渠道相关接口获取</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>通知渠道名称，可以是用户组名称或邮箱地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelName <p>通知渠道名称，可以是用户组名称或邮箱地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set <p>通知渠道名称，可以是用户组名称或邮箱地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelName <p>通知渠道名称，可以是用户组名称或邮箱地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get <p>是否启用邮件渠道，默认值：false</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEmailChannel <p>是否启用邮件渠道，默认值：false</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsEmailChannel() {
        return this.IsEmailChannel;
    }

    /**
     * Set <p>是否启用邮件渠道，默认值：false</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEmailChannel <p>是否启用邮件渠道，默认值：false</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEmailChannel(Boolean IsEmailChannel) {
        this.IsEmailChannel = IsEmailChannel;
    }

    /**
     * Get <p>告警条件列表。取值：<br>START：启动<br>SUCCESS：成功<br>FAILURE：失败<br>MONITOR_INDICATOR_ALARM：监控指标告警</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmConditions <p>告警条件列表。取值：<br>START：启动<br>SUCCESS：成功<br>FAILURE：失败<br>MONITOR_INDICATOR_ALARM：监控指标告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAlarmConditions() {
        return this.AlarmConditions;
    }

    /**
     * Set <p>告警条件列表。取值：<br>START：启动<br>SUCCESS：成功<br>FAILURE：失败<br>MONITOR_INDICATOR_ALARM：监控指标告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmConditions <p>告警条件列表。取值：<br>START：启动<br>SUCCESS：成功<br>FAILURE：失败<br>MONITOR_INDICATOR_ALARM：监控指标告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmConditions(String [] AlarmConditions) {
        this.AlarmConditions = AlarmConditions;
    }

    /**
     * Get <p>通知渠道类型。取值：0 未指定，1 Email，2 Webhook，3 Teams，4 Slack</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelType <p>通知渠道类型。取值：0 未指定，1 Email，2 Webhook，3 Teams，4 Slack</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set <p>通知渠道类型。取值：0 未指定，1 Email，2 Webhook，3 Teams，4 Slack</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelType <p>通知渠道类型。取值：0 未指定，1 Email，2 Webhook，3 Teams，4 Slack</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelType(Long ChannelType) {
        this.ChannelType = ChannelType;
    }

    public AlarmGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmGroup(AlarmGroup source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.IsEmailChannel != null) {
            this.IsEmailChannel = new Boolean(source.IsEmailChannel);
        }
        if (source.AlarmConditions != null) {
            this.AlarmConditions = new String[source.AlarmConditions.length];
            for (int i = 0; i < source.AlarmConditions.length; i++) {
                this.AlarmConditions[i] = new String(source.AlarmConditions[i]);
            }
        }
        if (source.ChannelType != null) {
            this.ChannelType = new Long(source.ChannelType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "IsEmailChannel", this.IsEmailChannel);
        this.setParamArraySimple(map, prefix + "AlarmConditions.", this.AlarmConditions);
        this.setParamSimple(map, prefix + "ChannelType", this.ChannelType);

    }
}

