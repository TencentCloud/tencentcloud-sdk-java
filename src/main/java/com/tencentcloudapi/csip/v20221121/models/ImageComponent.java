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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageComponent extends AbstractModel {

    /**
    * <p>组件名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>组件版本</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>组件所在路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>组件类型</p><p>枚举值：</p><ul><li>SYSTEM_COMPONENT： 系统组件</li><li>APP_COMPONENT： 应用组件</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * <p>漏洞数</p>
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * <p>镜像组件Id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>组件Id</p>
    */
    @SerializedName("ComponentId")
    @Expose
    private Long ComponentId;

    /**
     * Get <p>组件名</p> 
     * @return Name <p>组件名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>组件名</p>
     * @param Name <p>组件名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>组件版本</p> 
     * @return Version <p>组件版本</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>组件版本</p>
     * @param Version <p>组件版本</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>组件所在路径</p> 
     * @return Path <p>组件所在路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>组件所在路径</p>
     * @param Path <p>组件所在路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>组件类型</p><p>枚举值：</p><ul><li>SYSTEM_COMPONENT： 系统组件</li><li>APP_COMPONENT： 应用组件</li></ul> 
     * @return Type <p>组件类型</p><p>枚举值：</p><ul><li>SYSTEM_COMPONENT： 系统组件</li><li>APP_COMPONENT： 应用组件</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>组件类型</p><p>枚举值：</p><ul><li>SYSTEM_COMPONENT： 系统组件</li><li>APP_COMPONENT： 应用组件</li></ul>
     * @param Type <p>组件类型</p><p>枚举值：</p><ul><li>SYSTEM_COMPONENT： 系统组件</li><li>APP_COMPONENT： 应用组件</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>镜像id</p> 
     * @return ImageID <p>镜像id</p>
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set <p>镜像id</p>
     * @param ImageID <p>镜像id</p>
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get <p>漏洞数</p> 
     * @return VulCount <p>漏洞数</p>
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set <p>漏洞数</p>
     * @param VulCount <p>漏洞数</p>
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get <p>镜像组件Id</p> 
     * @return Id <p>镜像组件Id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>镜像组件Id</p>
     * @param Id <p>镜像组件Id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>组件Id</p> 
     * @return ComponentId <p>组件Id</p>
     */
    public Long getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set <p>组件Id</p>
     * @param ComponentId <p>组件Id</p>
     */
    public void setComponentId(Long ComponentId) {
        this.ComponentId = ComponentId;
    }

    public ImageComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageComponent(ImageComponent source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ComponentId != null) {
            this.ComponentId = new Long(source.ComponentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);

    }
}

