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

public class CreateGrafanaNotificationChannelRequest extends AbstractModel{

    /**
    * Grafana 实例 ID，例如：grafana-abcdefgh
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
    * 默认为1，已废弃，请使用 OrganizationIds
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * 接受告警通道 ID 数组
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * 额外组织 ID 数组，已废弃，请使用 OrganizationIds
    */
    @SerializedName("ExtraOrgIds")
    @Expose
    private String [] ExtraOrgIds;

    /**
    * 生效的所有组织 ID 数组，默认为 ["1"]
    */
    @SerializedName("OrganizationIds")
    @Expose
    private String [] OrganizationIds;

    /**
     * Get Grafana 实例 ID，例如：grafana-abcdefgh 
     * @return InstanceId Grafana 实例 ID，例如：grafana-abcdefgh
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Grafana 实例 ID，例如：grafana-abcdefgh
     * @param InstanceId Grafana 实例 ID，例如：grafana-abcdefgh
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
     * Get 默认为1，已废弃，请使用 OrganizationIds 
     * @return OrgId 默认为1，已废弃，请使用 OrganizationIds
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set 默认为1，已废弃，请使用 OrganizationIds
     * @param OrgId 默认为1，已废弃，请使用 OrganizationIds
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
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
     * Get 额外组织 ID 数组，已废弃，请使用 OrganizationIds 
     * @return ExtraOrgIds 额外组织 ID 数组，已废弃，请使用 OrganizationIds
     */
    public String [] getExtraOrgIds() {
        return this.ExtraOrgIds;
    }

    /**
     * Set 额外组织 ID 数组，已废弃，请使用 OrganizationIds
     * @param ExtraOrgIds 额外组织 ID 数组，已废弃，请使用 OrganizationIds
     */
    public void setExtraOrgIds(String [] ExtraOrgIds) {
        this.ExtraOrgIds = ExtraOrgIds;
    }

    /**
     * Get 生效的所有组织 ID 数组，默认为 ["1"] 
     * @return OrganizationIds 生效的所有组织 ID 数组，默认为 ["1"]
     */
    public String [] getOrganizationIds() {
        return this.OrganizationIds;
    }

    /**
     * Set 生效的所有组织 ID 数组，默认为 ["1"]
     * @param OrganizationIds 生效的所有组织 ID 数组，默认为 ["1"]
     */
    public void setOrganizationIds(String [] OrganizationIds) {
        this.OrganizationIds = OrganizationIds;
    }

    public CreateGrafanaNotificationChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGrafanaNotificationChannelRequest(CreateGrafanaNotificationChannelRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.OrgId != null) {
            this.OrgId = new Long(source.OrgId);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamArraySimple(map, prefix + "ExtraOrgIds.", this.ExtraOrgIds);
        this.setParamArraySimple(map, prefix + "OrganizationIds.", this.OrganizationIds);

    }
}

