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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageDto extends AbstractModel {

    /**
    * <p>镜像ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>镜像名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>镜像地址</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>镜像描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>镜像类型（Ray/Workspace）</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>镜像内置的 Ray 版本号</p>
    */
    @SerializedName("RayVersion")
    @Expose
    private String RayVersion;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get <p>镜像ID</p> 
     * @return Id <p>镜像ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>镜像ID</p>
     * @param Id <p>镜像ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>镜像名称</p> 
     * @return Name <p>镜像名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>镜像名称</p>
     * @param Name <p>镜像名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>镜像地址</p> 
     * @return Url <p>镜像地址</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>镜像地址</p>
     * @param Url <p>镜像地址</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>镜像描述</p> 
     * @return Description <p>镜像描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>镜像描述</p>
     * @param Description <p>镜像描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>镜像类型（Ray/Workspace）</p> 
     * @return Type <p>镜像类型（Ray/Workspace）</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>镜像类型（Ray/Workspace）</p>
     * @param Type <p>镜像类型（Ray/Workspace）</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>镜像内置的 Ray 版本号</p> 
     * @return RayVersion <p>镜像内置的 Ray 版本号</p>
     */
    public String getRayVersion() {
        return this.RayVersion;
    }

    /**
     * Set <p>镜像内置的 Ray 版本号</p>
     * @param RayVersion <p>镜像内置的 Ray 版本号</p>
     */
    public void setRayVersion(String RayVersion) {
        this.RayVersion = RayVersion;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ImageDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageDto(ImageDto source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RayVersion != null) {
            this.RayVersion = new String(source.RayVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RayVersion", this.RayVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

