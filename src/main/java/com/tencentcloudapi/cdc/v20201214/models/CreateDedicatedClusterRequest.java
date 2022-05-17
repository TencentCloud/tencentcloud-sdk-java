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

public class CreateDedicatedClusterRequest extends AbstractModel{

    /**
    * 专用集群所属的SiteId
    */
    @SerializedName("SiteId")
    @Expose
    private String SiteId;

    /**
    * 专用集群的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 专用集群所属的可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 专用集群的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 专用集群所属的SiteId 
     * @return SiteId 专用集群所属的SiteId
     */
    public String getSiteId() {
        return this.SiteId;
    }

    /**
     * Set 专用集群所属的SiteId
     * @param SiteId 专用集群所属的SiteId
     */
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
    }

    /**
     * Get 专用集群的名称 
     * @return Name 专用集群的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 专用集群的名称
     * @param Name 专用集群的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 专用集群所属的可用区 
     * @return Zone 专用集群所属的可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 专用集群所属的可用区
     * @param Zone 专用集群所属的可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 专用集群的描述 
     * @return Description 专用集群的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 专用集群的描述
     * @param Description 专用集群的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateDedicatedClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDedicatedClusterRequest(CreateDedicatedClusterRequest source) {
        if (source.SiteId != null) {
            this.SiteId = new String(source.SiteId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

