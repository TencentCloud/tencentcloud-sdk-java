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

public class ModifyDedicatedClusterInfoRequest extends AbstractModel{

    /**
    * 本地专用集群ID
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * 集群的新名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 集群的新可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 集群的新描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 集群所在站点
    */
    @SerializedName("SiteId")
    @Expose
    private String SiteId;

    /**
     * Get 本地专用集群ID 
     * @return DedicatedClusterId 本地专用集群ID
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set 本地专用集群ID
     * @param DedicatedClusterId 本地专用集群ID
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get 集群的新名称 
     * @return Name 集群的新名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 集群的新名称
     * @param Name 集群的新名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 集群的新可用区 
     * @return Zone 集群的新可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 集群的新可用区
     * @param Zone 集群的新可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 集群的新描述信息 
     * @return Description 集群的新描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 集群的新描述信息
     * @param Description 集群的新描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 集群所在站点 
     * @return SiteId 集群所在站点
     */
    public String getSiteId() {
        return this.SiteId;
    }

    /**
     * Set 集群所在站点
     * @param SiteId 集群所在站点
     */
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
    }

    public ModifyDedicatedClusterInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDedicatedClusterInfoRequest(ModifyDedicatedClusterInfoRequest source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);

    }
}

