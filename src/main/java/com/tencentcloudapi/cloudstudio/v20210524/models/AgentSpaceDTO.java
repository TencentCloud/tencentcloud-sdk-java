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
package com.tencentcloudapi.cloudstudio.v20210524.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentSpaceDTO extends AbstractModel{

    /**
    * 工作空间名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private Long ImageId;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 云服务器登录名称
    */
    @SerializedName("RemoteUser")
    @Expose
    private String RemoteUser;

    /**
    * 云服务器登录地址
    */
    @SerializedName("RemoteHost")
    @Expose
    private String RemoteHost;

    /**
    * 云服务器登录端口
    */
    @SerializedName("RemotePort")
    @Expose
    private String RemotePort;

    /**
    * 工作空间类型
    */
    @SerializedName("WorkspaceType")
    @Expose
    private String WorkspaceType;

    /**
    * 工作空间版本
    */
    @SerializedName("WorkspaceVersion")
    @Expose
    private Long WorkspaceVersion;

    /**
    * 工作空间资源结构
    */
    @SerializedName("WorkspaceResourceDTO")
    @Expose
    private WorkspaceResourceDTO WorkspaceResourceDTO;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 工作空间名称 
     * @return Name 工作空间名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 工作空间名称
     * @param Name 工作空间名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 镜像id 
     * @return ImageId 镜像id
     */
    public Long getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id
     * @param ImageId 镜像id
     */
    public void setImageId(Long ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 云服务器登录名称 
     * @return RemoteUser 云服务器登录名称
     */
    public String getRemoteUser() {
        return this.RemoteUser;
    }

    /**
     * Set 云服务器登录名称
     * @param RemoteUser 云服务器登录名称
     */
    public void setRemoteUser(String RemoteUser) {
        this.RemoteUser = RemoteUser;
    }

    /**
     * Get 云服务器登录地址 
     * @return RemoteHost 云服务器登录地址
     */
    public String getRemoteHost() {
        return this.RemoteHost;
    }

    /**
     * Set 云服务器登录地址
     * @param RemoteHost 云服务器登录地址
     */
    public void setRemoteHost(String RemoteHost) {
        this.RemoteHost = RemoteHost;
    }

    /**
     * Get 云服务器登录端口 
     * @return RemotePort 云服务器登录端口
     */
    public String getRemotePort() {
        return this.RemotePort;
    }

    /**
     * Set 云服务器登录端口
     * @param RemotePort 云服务器登录端口
     */
    public void setRemotePort(String RemotePort) {
        this.RemotePort = RemotePort;
    }

    /**
     * Get 工作空间类型 
     * @return WorkspaceType 工作空间类型
     */
    public String getWorkspaceType() {
        return this.WorkspaceType;
    }

    /**
     * Set 工作空间类型
     * @param WorkspaceType 工作空间类型
     */
    public void setWorkspaceType(String WorkspaceType) {
        this.WorkspaceType = WorkspaceType;
    }

    /**
     * Get 工作空间版本 
     * @return WorkspaceVersion 工作空间版本
     */
    public Long getWorkspaceVersion() {
        return this.WorkspaceVersion;
    }

    /**
     * Set 工作空间版本
     * @param WorkspaceVersion 工作空间版本
     */
    public void setWorkspaceVersion(Long WorkspaceVersion) {
        this.WorkspaceVersion = WorkspaceVersion;
    }

    /**
     * Get 工作空间资源结构 
     * @return WorkspaceResourceDTO 工作空间资源结构
     */
    public WorkspaceResourceDTO getWorkspaceResourceDTO() {
        return this.WorkspaceResourceDTO;
    }

    /**
     * Set 工作空间资源结构
     * @param WorkspaceResourceDTO 工作空间资源结构
     */
    public void setWorkspaceResourceDTO(WorkspaceResourceDTO WorkspaceResourceDTO) {
        this.WorkspaceResourceDTO = WorkspaceResourceDTO;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AgentSpaceDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentSpaceDTO(AgentSpaceDTO source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ImageId != null) {
            this.ImageId = new Long(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.RemoteUser != null) {
            this.RemoteUser = new String(source.RemoteUser);
        }
        if (source.RemoteHost != null) {
            this.RemoteHost = new String(source.RemoteHost);
        }
        if (source.RemotePort != null) {
            this.RemotePort = new String(source.RemotePort);
        }
        if (source.WorkspaceType != null) {
            this.WorkspaceType = new String(source.WorkspaceType);
        }
        if (source.WorkspaceVersion != null) {
            this.WorkspaceVersion = new Long(source.WorkspaceVersion);
        }
        if (source.WorkspaceResourceDTO != null) {
            this.WorkspaceResourceDTO = new WorkspaceResourceDTO(source.WorkspaceResourceDTO);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "RemoteUser", this.RemoteUser);
        this.setParamSimple(map, prefix + "RemoteHost", this.RemoteHost);
        this.setParamSimple(map, prefix + "RemotePort", this.RemotePort);
        this.setParamSimple(map, prefix + "WorkspaceType", this.WorkspaceType);
        this.setParamSimple(map, prefix + "WorkspaceVersion", this.WorkspaceVersion);
        this.setParamObj(map, prefix + "WorkspaceResourceDTO.", this.WorkspaceResourceDTO);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

