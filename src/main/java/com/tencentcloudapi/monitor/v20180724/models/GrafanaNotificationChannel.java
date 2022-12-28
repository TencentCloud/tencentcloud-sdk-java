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

public class GrafanaNotificationChannel extends AbstractModel{

    /**
    * 渠道 ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 渠道名
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 告警通道模板 ID 数组
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 默认生效组织，已废弃，请使用 OrganizationIds
    */
    @SerializedName("OrgId")
    @Expose
    private String OrgId;

    /**
    * 额外生效组织，已废弃，请使用 OrganizationIds
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraOrgIds")
    @Expose
    private String [] ExtraOrgIds;

    /**
    * 生效组织，已废弃，请使用 OrganizationIds
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgIds")
    @Expose
    private String [] OrgIds;

    /**
    * 告警渠道的所有生效组织
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationIds")
    @Expose
    private String [] OrganizationIds;

    /**
     * Get 渠道 ID 
     * @return ChannelId 渠道 ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 渠道 ID
     * @param ChannelId 渠道 ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 渠道名 
     * @return ChannelName 渠道名
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名
     * @param ChannelName 渠道名
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 告警通道模板 ID 数组 
     * @return Receivers 告警通道模板 ID 数组
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 告警通道模板 ID 数组
     * @param Receivers 告警通道模板 ID 数组
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间 
     * @return UpdatedAt 更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
     * @param UpdatedAt 更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 默认生效组织，已废弃，请使用 OrganizationIds 
     * @return OrgId 默认生效组织，已废弃，请使用 OrganizationIds
     */
    public String getOrgId() {
        return this.OrgId;
    }

    /**
     * Set 默认生效组织，已废弃，请使用 OrganizationIds
     * @param OrgId 默认生效组织，已废弃，请使用 OrganizationIds
     */
    public void setOrgId(String OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get 额外生效组织，已废弃，请使用 OrganizationIds
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraOrgIds 额外生效组织，已废弃，请使用 OrganizationIds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExtraOrgIds() {
        return this.ExtraOrgIds;
    }

    /**
     * Set 额外生效组织，已废弃，请使用 OrganizationIds
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraOrgIds 额外生效组织，已废弃，请使用 OrganizationIds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraOrgIds(String [] ExtraOrgIds) {
        this.ExtraOrgIds = ExtraOrgIds;
    }

    /**
     * Get 生效组织，已废弃，请使用 OrganizationIds
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgIds 生效组织，已废弃，请使用 OrganizationIds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOrgIds() {
        return this.OrgIds;
    }

    /**
     * Set 生效组织，已废弃，请使用 OrganizationIds
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgIds 生效组织，已废弃，请使用 OrganizationIds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgIds(String [] OrgIds) {
        this.OrgIds = OrgIds;
    }

    /**
     * Get 告警渠道的所有生效组织
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationIds 告警渠道的所有生效组织
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOrganizationIds() {
        return this.OrganizationIds;
    }

    /**
     * Set 告警渠道的所有生效组织
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationIds 告警渠道的所有生效组织
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationIds(String [] OrganizationIds) {
        this.OrganizationIds = OrganizationIds;
    }

    public GrafanaNotificationChannel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrafanaNotificationChannel(GrafanaNotificationChannel source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
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
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.OrgId != null) {
            this.OrgId = new String(source.OrgId);
        }
        if (source.ExtraOrgIds != null) {
            this.ExtraOrgIds = new String[source.ExtraOrgIds.length];
            for (int i = 0; i < source.ExtraOrgIds.length; i++) {
                this.ExtraOrgIds[i] = new String(source.ExtraOrgIds[i]);
            }
        }
        if (source.OrgIds != null) {
            this.OrgIds = new String[source.OrgIds.length];
            for (int i = 0; i < source.OrgIds.length; i++) {
                this.OrgIds[i] = new String(source.OrgIds[i]);
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
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamArraySimple(map, prefix + "ExtraOrgIds.", this.ExtraOrgIds);
        this.setParamArraySimple(map, prefix + "OrgIds.", this.OrgIds);
        this.setParamArraySimple(map, prefix + "OrganizationIds.", this.OrganizationIds);

    }
}

