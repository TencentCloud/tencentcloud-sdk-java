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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemResourceItem extends AbstractModel{

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源类型。1 表示 JAR 包，目前只支持该值。
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 资源备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 资源所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 资源的最新版本
    */
    @SerializedName("LatestResourceConfigVersion")
    @Expose
    private Long LatestResourceConfigVersion;

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源名称 
     * @return Name 资源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名称
     * @param Name 资源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源类型。1 表示 JAR 包，目前只支持该值。 
     * @return ResourceType 资源类型。1 表示 JAR 包，目前只支持该值。
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型。1 表示 JAR 包，目前只支持该值。
     * @param ResourceType 资源类型。1 表示 JAR 包，目前只支持该值。
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源备注 
     * @return Remark 资源备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 资源备注
     * @param Remark 资源备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 资源所属地域 
     * @return Region 资源所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 资源所属地域
     * @param Region 资源所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 资源的最新版本 
     * @return LatestResourceConfigVersion 资源的最新版本
     */
    public Long getLatestResourceConfigVersion() {
        return this.LatestResourceConfigVersion;
    }

    /**
     * Set 资源的最新版本
     * @param LatestResourceConfigVersion 资源的最新版本
     */
    public void setLatestResourceConfigVersion(Long LatestResourceConfigVersion) {
        this.LatestResourceConfigVersion = LatestResourceConfigVersion;
    }

    public SystemResourceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemResourceItem(SystemResourceItem source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LatestResourceConfigVersion != null) {
            this.LatestResourceConfigVersion = new Long(source.LatestResourceConfigVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "LatestResourceConfigVersion", this.LatestResourceConfigVersion);

    }
}

