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

public class UpdateGrafanaNotificationChannelRequest extends AbstractModel{

    /**
    * 通道 ID，例如：nchannel-abcd1234
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Grafana 实例 ID，例如：grafana-12345678
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 告警通道名称，例如：test
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 接受告警通道 ID 数组
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * 已废弃，请使用 OrganizationIds
    */
    @SerializedName("ExtraOrgIds")
    @Expose
    private String [] ExtraOrgIds;

    /**
    * 生效的组织 ID 数组
    */
    @SerializedName("OrganizationIds")
    @Expose
    private String [] OrganizationIds;

    /**
     * Get 通道 ID，例如：nchannel-abcd1234 
     * @return ChannelId 通道 ID，例如：nchannel-abcd1234
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID，例如：nchannel-abcd1234
     * @param ChannelId 通道 ID，例如：nchannel-abcd1234
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Grafana 实例 ID，例如：grafana-12345678 
     * @return InstanceId Grafana 实例 ID，例如：grafana-12345678
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Grafana 实例 ID，例如：grafana-12345678
     * @param InstanceId Grafana 实例 ID，例如：grafana-12345678
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 告警通道名称，例如：test 
     * @return ChannelName 告警通道名称，例如：test
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 告警通道名称，例如：test
     * @param ChannelName 告警通道名称，例如：test
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 接受告警通道 ID 数组 
     * @return Receivers 接受告警通道 ID 数组
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 接受告警通道 ID 数组
     * @param Receivers 接受告警通道 ID 数组
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get 已废弃，请使用 OrganizationIds 
     * @return ExtraOrgIds 已废弃，请使用 OrganizationIds
     */
    public String [] getExtraOrgIds() {
        return this.ExtraOrgIds;
    }

    /**
     * Set 已废弃，请使用 OrganizationIds
     * @param ExtraOrgIds 已废弃，请使用 OrganizationIds
     */
    public void setExtraOrgIds(String [] ExtraOrgIds) {
        this.ExtraOrgIds = ExtraOrgIds;
    }

    /**
     * Get 生效的组织 ID 数组 
     * @return OrganizationIds 生效的组织 ID 数组
     */
    public String [] getOrganizationIds() {
        return this.OrganizationIds;
    }

    /**
     * Set 生效的组织 ID 数组
     * @param OrganizationIds 生效的组织 ID 数组
     */
    public void setOrganizationIds(String [] OrganizationIds) {
        this.OrganizationIds = OrganizationIds;
    }

    public UpdateGrafanaNotificationChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGrafanaNotificationChannelRequest(UpdateGrafanaNotificationChannelRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.Receivers != null) {
            this.Receivers = new String[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new String(source.Receivers[i]);
            }
        }
        if (source.ExtraOrgIds != null) {
            this.ExtraOrgIds = new String[source.ExtraOrgIds.length];
            for (int i = 0; i < source.ExtraOrgIds.length; i++) {
                this.ExtraOrgIds[i] = new String(source.ExtraOrgIds[i]);
            }
        }
        if (source.OrganizationIds != null) {
            this.OrganizationIds = new String[source.OrganizationIds.length];
            for (int i = 0; i < source.OrganizationIds.length; i++) {
                this.OrganizationIds[i] = new String(source.OrganizationIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamArraySimple(map, prefix + "ExtraOrgIds.", this.ExtraOrgIds);
        this.setParamArraySimple(map, prefix + "OrganizationIds.", this.OrganizationIds);

    }
}

