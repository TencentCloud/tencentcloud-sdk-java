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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEKSContainerInstanceRequest extends AbstractModel{

    /**
    * 容器实例 ID
    */
    @SerializedName("EksCiId")
    @Expose
    private String EksCiId;

    /**
    * 实例重启策略： Always(总是重启)、Never(从不重启)、OnFailure(失败时重启)
    */
    @SerializedName("RestartPolicy")
    @Expose
    private String RestartPolicy;

    /**
    * 数据卷，包含NfsVolume数组和CbsVolume数组
    */
    @SerializedName("EksCiVolume")
    @Expose
    private EksCiVolume EksCiVolume;

    /**
    * 容器组
    */
    @SerializedName("Containers")
    @Expose
    private Container [] Containers;

    /**
    * Init 容器组
    */
    @SerializedName("InitContainers")
    @Expose
    private Container [] InitContainers;

    /**
    * 容器实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 镜像仓库凭证数组
    */
    @SerializedName("ImageRegistryCredentials")
    @Expose
    private ImageRegistryCredential [] ImageRegistryCredentials;

    /**
     * Get 容器实例 ID 
     * @return EksCiId 容器实例 ID
     */
    public String getEksCiId() {
        return this.EksCiId;
    }

    /**
     * Set 容器实例 ID
     * @param EksCiId 容器实例 ID
     */
    public void setEksCiId(String EksCiId) {
        this.EksCiId = EksCiId;
    }

    /**
     * Get 实例重启策略： Always(总是重启)、Never(从不重启)、OnFailure(失败时重启) 
     * @return RestartPolicy 实例重启策略： Always(总是重启)、Never(从不重启)、OnFailure(失败时重启)
     */
    public String getRestartPolicy() {
        return this.RestartPolicy;
    }

    /**
     * Set 实例重启策略： Always(总是重启)、Never(从不重启)、OnFailure(失败时重启)
     * @param RestartPolicy 实例重启策略： Always(总是重启)、Never(从不重启)、OnFailure(失败时重启)
     */
    public void setRestartPolicy(String RestartPolicy) {
        this.RestartPolicy = RestartPolicy;
    }

    /**
     * Get 数据卷，包含NfsVolume数组和CbsVolume数组 
     * @return EksCiVolume 数据卷，包含NfsVolume数组和CbsVolume数组
     */
    public EksCiVolume getEksCiVolume() {
        return this.EksCiVolume;
    }

    /**
     * Set 数据卷，包含NfsVolume数组和CbsVolume数组
     * @param EksCiVolume 数据卷，包含NfsVolume数组和CbsVolume数组
     */
    public void setEksCiVolume(EksCiVolume EksCiVolume) {
        this.EksCiVolume = EksCiVolume;
    }

    /**
     * Get 容器组 
     * @return Containers 容器组
     */
    public Container [] getContainers() {
        return this.Containers;
    }

    /**
     * Set 容器组
     * @param Containers 容器组
     */
    public void setContainers(Container [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get Init 容器组 
     * @return InitContainers Init 容器组
     */
    public Container [] getInitContainers() {
        return this.InitContainers;
    }

    /**
     * Set Init 容器组
     * @param InitContainers Init 容器组
     */
    public void setInitContainers(Container [] InitContainers) {
        this.InitContainers = InitContainers;
    }

    /**
     * Get 容器实例名称 
     * @return Name 容器实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 容器实例名称
     * @param Name 容器实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 镜像仓库凭证数组 
     * @return ImageRegistryCredentials 镜像仓库凭证数组
     */
    public ImageRegistryCredential [] getImageRegistryCredentials() {
        return this.ImageRegistryCredentials;
    }

    /**
     * Set 镜像仓库凭证数组
     * @param ImageRegistryCredentials 镜像仓库凭证数组
     */
    public void setImageRegistryCredentials(ImageRegistryCredential [] ImageRegistryCredentials) {
        this.ImageRegistryCredentials = ImageRegistryCredentials;
    }

    public UpdateEKSContainerInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEKSContainerInstanceRequest(UpdateEKSContainerInstanceRequest source) {
        if (source.EksCiId != null) {
            this.EksCiId = new String(source.EksCiId);
        }
        if (source.RestartPolicy != null) {
            this.RestartPolicy = new String(source.RestartPolicy);
        }
        if (source.EksCiVolume != null) {
            this.EksCiVolume = new EksCiVolume(source.EksCiVolume);
        }
        if (source.Containers != null) {
            this.Containers = new Container[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new Container(source.Containers[i]);
            }
        }
        if (source.InitContainers != null) {
            this.InitContainers = new Container[source.InitContainers.length];
            for (int i = 0; i < source.InitContainers.length; i++) {
                this.InitContainers[i] = new Container(source.InitContainers[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ImageRegistryCredentials != null) {
            this.ImageRegistryCredentials = new ImageRegistryCredential[source.ImageRegistryCredentials.length];
            for (int i = 0; i < source.ImageRegistryCredentials.length; i++) {
                this.ImageRegistryCredentials[i] = new ImageRegistryCredential(source.ImageRegistryCredentials[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EksCiId", this.EksCiId);
        this.setParamSimple(map, prefix + "RestartPolicy", this.RestartPolicy);
        this.setParamObj(map, prefix + "EksCiVolume.", this.EksCiVolume);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamArrayObj(map, prefix + "InitContainers.", this.InitContainers);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "ImageRegistryCredentials.", this.ImageRegistryCredentials);

    }
}

