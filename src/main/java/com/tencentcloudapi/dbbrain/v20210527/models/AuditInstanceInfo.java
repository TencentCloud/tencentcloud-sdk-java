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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditInstanceInfo extends AbstractModel{

    /**
    * appId。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 审计状态，0-未开通审计；1-已开通审计。
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * 实例Id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 项目Id。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例所在地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 资源Tags。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTags")
    @Expose
    private String [] ResourceTags;

    /**
     * Get appId。 
     * @return AppId appId。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appId。
     * @param AppId appId。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 审计状态，0-未开通审计；1-已开通审计。 
     * @return AuditStatus 审计状态，0-未开通审计；1-已开通审计。
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 审计状态，0-未开通审计；1-已开通审计。
     * @param AuditStatus 审计状态，0-未开通审计；1-已开通审计。
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get 实例Id。 
     * @return InstanceId 实例Id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id。
     * @param InstanceId 实例Id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 项目Id。 
     * @return ProjectId 项目Id。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id。
     * @param ProjectId 项目Id。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例所在地域。 
     * @return Region 实例所在地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在地域。
     * @param Region 实例所在地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 资源Tags。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTags 资源Tags。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 资源Tags。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTags 资源Tags。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTags(String [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    public AuditInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditInstanceInfo(AuditInstanceInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new String[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new String(source.ResourceTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArraySimple(map, prefix + "ResourceTags.", this.ResourceTags);

    }
}

