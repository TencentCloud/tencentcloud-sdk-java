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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedCluster extends AbstractModel{

    /**
    * 专用集群id。如"cluster-xxxxx"。
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * 专用集群所属可用区名称。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 专用集群的描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 专用集群的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 专用集群的生命周期。如"PENDING"。
    */
    @SerializedName("LifecycleStatus")
    @Expose
    private String LifecycleStatus;

    /**
    * 专用集群的创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 专用集群所属的站点id。
    */
    @SerializedName("SiteId")
    @Expose
    private String SiteId;

    /**
     * Get 专用集群id。如"cluster-xxxxx"。 
     * @return DedicatedClusterId 专用集群id。如"cluster-xxxxx"。
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set 专用集群id。如"cluster-xxxxx"。
     * @param DedicatedClusterId 专用集群id。如"cluster-xxxxx"。
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get 专用集群所属可用区名称。 
     * @return Zone 专用集群所属可用区名称。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 专用集群所属可用区名称。
     * @param Zone 专用集群所属可用区名称。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 专用集群的描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 专用集群的描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 专用集群的描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 专用集群的描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 专用集群的名称。 
     * @return Name 专用集群的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 专用集群的名称。
     * @param Name 专用集群的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 专用集群的生命周期。如"PENDING"。 
     * @return LifecycleStatus 专用集群的生命周期。如"PENDING"。
     */
    public String getLifecycleStatus() {
        return this.LifecycleStatus;
    }

    /**
     * Set 专用集群的生命周期。如"PENDING"。
     * @param LifecycleStatus 专用集群的生命周期。如"PENDING"。
     */
    public void setLifecycleStatus(String LifecycleStatus) {
        this.LifecycleStatus = LifecycleStatus;
    }

    /**
     * Get 专用集群的创建时间。 
     * @return CreateTime 专用集群的创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 专用集群的创建时间。
     * @param CreateTime 专用集群的创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 专用集群所属的站点id。 
     * @return SiteId 专用集群所属的站点id。
     */
    public String getSiteId() {
        return this.SiteId;
    }

    /**
     * Set 专用集群所属的站点id。
     * @param SiteId 专用集群所属的站点id。
     */
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
    }

    public DedicatedCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedCluster(DedicatedCluster source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LifecycleStatus != null) {
            this.LifecycleStatus = new String(source.LifecycleStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SiteId != null) {
            this.SiteId = new String(source.SiteId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LifecycleStatus", this.LifecycleStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);

    }
}

