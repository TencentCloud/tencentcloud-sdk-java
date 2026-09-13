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
    * 通知渠道ID，可通过基础平台通知渠道相关接口获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 通知渠道名称，可以是用户组名称或邮箱地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 是否启用邮件渠道，默认值：false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEmailChannel")
    @Expose
    private Boolean IsEmailChannel;

    /**
    * 一组告警条件，有 启动，成功，失败和任务超时告警
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmConditions")
    @Expose
    private String [] AlarmConditions;

    /**
    * 通知渠道类型。取值：0 未指定，1 Email，2 Webhook，3 Teams，4 Slack
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelType")
    @Expose
    private Long ChannelType;

    /**
     * Get 通知渠道ID，可通过基础平台通知渠道相关接口获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelId 通知渠道ID，可通过基础平台通知渠道相关接口获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通知渠道ID，可通过基础平台通知渠道相关接口获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelId 通知渠道ID，可通过基础平台通知渠道相关接口获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 通知渠道名称，可以是用户组名称或邮箱地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelName 通知渠道名称，可以是用户组名称或邮箱地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 通知渠道名称，可以是用户组名称或邮箱地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelName 通知渠道名称，可以是用户组名称或邮箱地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 是否启用邮件渠道，默认值：false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEmailChannel 是否启用邮件渠道，默认值：false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsEmailChannel() {
        return this.IsEmailChannel;
    }

    /**
     * Set 是否启用邮件渠道，默认值：false
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEmailChannel 是否启用邮件渠道，默认值：false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEmailChannel(Boolean IsEmailChannel) {
        this.IsEmailChannel = IsEmailChannel;
    }

    /**
     * Get 一组告警条件，有 启动，成功，失败和任务超时告警
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmConditions 一组告警条件，有 启动，成功，失败和任务超时告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAlarmConditions() {
        return this.AlarmConditions;
    }

    /**
     * Set 一组告警条件，有 启动，成功，失败和任务超时告警
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmConditions 一组告警条件，有 启动，成功，失败和任务超时告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmConditions(String [] AlarmConditions) {
        this.AlarmConditions = AlarmConditions;
    }

    /**
     * Get 通知渠道类型。取值：0 未指定，1 Email，2 Webhook，3 Teams，4 Slack
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelType 通知渠道类型。取值：0 未指定，1 Email，2 Webhook，3 Teams，4 Slack
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set 通知渠道类型。取值：0 未指定，1 Email，2 Webhook，3 Teams，4 Slack
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelType 通知渠道类型。取值：0 未指定，1 Email，2 Webhook，3 Teams，4 Slack
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

