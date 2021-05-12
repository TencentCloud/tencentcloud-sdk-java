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

public class ResourceRefDetail extends AbstractModel{

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源版本，-1表示使用最新版本
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 资源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 1: 主资源
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 1: 系统内置资源
    */
    @SerializedName("SystemProvide")
    @Expose
    private Long SystemProvide;

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源版本，-1表示使用最新版本 
     * @return Version 资源版本，-1表示使用最新版本
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 资源版本，-1表示使用最新版本
     * @param Version 资源版本，-1表示使用最新版本
     */
    public void setVersion(Long Version) {
        this.Version = Version;
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
     * Get 1: 主资源 
     * @return Type 1: 主资源
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1: 主资源
     * @param Type 1: 主资源
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 1: 系统内置资源 
     * @return SystemProvide 1: 系统内置资源
     */
    public Long getSystemProvide() {
        return this.SystemProvide;
    }

    /**
     * Set 1: 系统内置资源
     * @param SystemProvide 1: 系统内置资源
     */
    public void setSystemProvide(Long SystemProvide) {
        this.SystemProvide = SystemProvide;
    }

    public ResourceRefDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceRefDetail(ResourceRefDetail source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SystemProvide != null) {
            this.SystemProvide = new Long(source.SystemProvide);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SystemProvide", this.SystemProvide);

    }
}

