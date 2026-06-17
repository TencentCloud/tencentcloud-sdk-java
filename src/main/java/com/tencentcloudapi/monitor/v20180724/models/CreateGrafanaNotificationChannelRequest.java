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

public class CreateGrafanaNotificationChannelRequest extends AbstractModel {

    /**
    * <p>Grafana 实例 ID，例如：grafana-abcdefgh</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>告警通道名称，例如：my-channel</p>
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * <p>接受告警通道 ID 数组，值为告警管理/基础配置/通知模板中的模板 ID</p>
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * <p>默认为1，建议使用 OrganizationIds</p>
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * <p>额外组织 ID 数组，已废弃，请使用 OrganizationIds</p>
    */
    @SerializedName("ExtraOrgIds")
    @Expose
    private String [] ExtraOrgIds;

    /**
    * <p>生效的所有组织 ID 数组，默认为 [&quot;1&quot;]</p>
    */
    @SerializedName("OrganizationIds")
    @Expose
    private String [] OrganizationIds;

    /**
     * Get <p>Grafana 实例 ID，例如：grafana-abcdefgh</p> 
     * @return InstanceId <p>Grafana 实例 ID，例如：grafana-abcdefgh</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Grafana 实例 ID，例如：grafana-abcdefgh</p>
     * @param InstanceId <p>Grafana 实例 ID，例如：grafana-abcdefgh</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>告警通道名称，例如：my-channel</p> 
     * @return ChannelName <p>告警通道名称，例如：my-channel</p>
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set <p>告警通道名称，例如：my-channel</p>
     * @param ChannelName <p>告警通道名称，例如：my-channel</p>
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get <p>接受告警通道 ID 数组，值为告警管理/基础配置/通知模板中的模板 ID</p> 
     * @return Receivers <p>接受告警通道 ID 数组，值为告警管理/基础配置/通知模板中的模板 ID</p>
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set <p>接受告警通道 ID 数组，值为告警管理/基础配置/通知模板中的模板 ID</p>
     * @param Receivers <p>接受告警通道 ID 数组，值为告警管理/基础配置/通知模板中的模板 ID</p>
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get <p>默认为1，建议使用 OrganizationIds</p> 
     * @return OrgId <p>默认为1，建议使用 OrganizationIds</p>
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set <p>默认为1，建议使用 OrganizationIds</p>
     * @param OrgId <p>默认为1，建议使用 OrganizationIds</p>
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get <p>额外组织 ID 数组，已废弃，请使用 OrganizationIds</p> 
     * @return ExtraOrgIds <p>额外组织 ID 数组，已废弃，请使用 OrganizationIds</p>
     */
    public String [] getExtraOrgIds() {
        return this.ExtraOrgIds;
    }

    /**
     * Set <p>额外组织 ID 数组，已废弃，请使用 OrganizationIds</p>
     * @param ExtraOrgIds <p>额外组织 ID 数组，已废弃，请使用 OrganizationIds</p>
     */
    public void setExtraOrgIds(String [] ExtraOrgIds) {
        this.ExtraOrgIds = ExtraOrgIds;
    }

    /**
     * Get <p>生效的所有组织 ID 数组，默认为 [&quot;1&quot;]</p> 
     * @return OrganizationIds <p>生效的所有组织 ID 数组，默认为 [&quot;1&quot;]</p>
     */
    public String [] getOrganizationIds() {
        return this.OrganizationIds;
    }

    /**
     * Set <p>生效的所有组织 ID 数组，默认为 [&quot;1&quot;]</p>
     * @param OrganizationIds <p>生效的所有组织 ID 数组，默认为 [&quot;1&quot;]</p>
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
        if (source.Receivers != null) {
            this.Receivers = new String[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new String(source.Receivers[i]);
            }
        }
        if (source.OrgId != null) {
            this.OrgId = new Long(source.OrgId);
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
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamArraySimple(map, prefix + "ExtraOrgIds.", this.ExtraOrgIds);
        this.setParamArraySimple(map, prefix + "OrganizationIds.", this.OrganizationIds);

    }
}

