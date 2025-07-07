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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulAffectedImageInfo extends AbstractModel {

    /**
    * 镜像ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 关联的主机数(包含普通节点数和超级节点数)
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 关联的超级节点数
    */
    @SerializedName("SuperNodeCount")
    @Expose
    private Long SuperNodeCount;

    /**
    * 关联的容器数
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * 组件列表
    */
    @SerializedName("ComponentList")
    @Expose
    private VulAffectedImageComponentInfo [] ComponentList;

    /**
     * Get 镜像ID 
     * @return ImageID 镜像ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像ID
     * @param ImageID 镜像ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
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
     * Get 关联的主机数(包含普通节点数和超级节点数) 
     * @return HostCount 关联的主机数(包含普通节点数和超级节点数)
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 关联的主机数(包含普通节点数和超级节点数)
     * @param HostCount 关联的主机数(包含普通节点数和超级节点数)
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 关联的超级节点数 
     * @return SuperNodeCount 关联的超级节点数
     */
    public Long getSuperNodeCount() {
        return this.SuperNodeCount;
    }

    /**
     * Set 关联的超级节点数
     * @param SuperNodeCount 关联的超级节点数
     */
    public void setSuperNodeCount(Long SuperNodeCount) {
        this.SuperNodeCount = SuperNodeCount;
    }

    /**
     * Get 关联的容器数 
     * @return ContainerCount 关联的容器数
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set 关联的容器数
     * @param ContainerCount 关联的容器数
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get 组件列表 
     * @return ComponentList 组件列表
     */
    public VulAffectedImageComponentInfo [] getComponentList() {
        return this.ComponentList;
    }

    /**
     * Set 组件列表
     * @param ComponentList 组件列表
     */
    public void setComponentList(VulAffectedImageComponentInfo [] ComponentList) {
        this.ComponentList = ComponentList;
    }

    public VulAffectedImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulAffectedImageInfo(VulAffectedImageInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.SuperNodeCount != null) {
            this.SuperNodeCount = new Long(source.SuperNodeCount);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.ComponentList != null) {
            this.ComponentList = new VulAffectedImageComponentInfo[source.ComponentList.length];
            for (int i = 0; i < source.ComponentList.length; i++) {
                this.ComponentList[i] = new VulAffectedImageComponentInfo(source.ComponentList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "SuperNodeCount", this.SuperNodeCount);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamArrayObj(map, prefix + "ComponentList.", this.ComponentList);

    }
}

