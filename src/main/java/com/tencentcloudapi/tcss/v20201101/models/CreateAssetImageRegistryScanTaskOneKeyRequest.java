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

public class CreateAssetImageRegistryScanTaskOneKeyRequest extends AbstractModel {

    /**
    * 是否扫描全部镜像(废弃)
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 扫描的镜像列表
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * 扫描类型数组
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * 扫描的镜像列表Id
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * 剔除扫描的镜像id列表
    */
    @SerializedName("ExcludeIDs")
    @Expose
    private Long [] ExcludeIDs;

    /**
    * 是否最新镜像
    */
    @SerializedName("IsLatest")
    @Expose
    private Boolean IsLatest;

    /**
    * 扫描范围 0全部镜像，1自选镜像，2推荐扫描镜像
    */
    @SerializedName("ScanScope")
    @Expose
    private Long ScanScope;

    /**
    * 仓库类型
    */
    @SerializedName("RegistryType")
    @Expose
    private String [] RegistryType;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String [] Namespace;

    /**
    * 是否存在运行中的容器
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Boolean ContainerRunning;

    /**
    * 任务超时时长单位s
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get 是否扫描全部镜像(废弃) 
     * @return All 是否扫描全部镜像(废弃)
     * @deprecated
     */
    @Deprecated
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 是否扫描全部镜像(废弃)
     * @param All 是否扫描全部镜像(废弃)
     * @deprecated
     */
    @Deprecated
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 扫描的镜像列表 
     * @return Images 扫描的镜像列表
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set 扫描的镜像列表
     * @param Images 扫描的镜像列表
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get 扫描类型数组 
     * @return ScanType 扫描类型数组
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set 扫描类型数组
     * @param ScanType 扫描类型数组
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get 扫描的镜像列表Id 
     * @return Id 扫描的镜像列表Id
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set 扫描的镜像列表Id
     * @param Id 扫描的镜像列表Id
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get 剔除扫描的镜像id列表 
     * @return ExcludeIDs 剔除扫描的镜像id列表
     */
    public Long [] getExcludeIDs() {
        return this.ExcludeIDs;
    }

    /**
     * Set 剔除扫描的镜像id列表
     * @param ExcludeIDs 剔除扫描的镜像id列表
     */
    public void setExcludeIDs(Long [] ExcludeIDs) {
        this.ExcludeIDs = ExcludeIDs;
    }

    /**
     * Get 是否最新镜像 
     * @return IsLatest 是否最新镜像
     */
    public Boolean getIsLatest() {
        return this.IsLatest;
    }

    /**
     * Set 是否最新镜像
     * @param IsLatest 是否最新镜像
     */
    public void setIsLatest(Boolean IsLatest) {
        this.IsLatest = IsLatest;
    }

    /**
     * Get 扫描范围 0全部镜像，1自选镜像，2推荐扫描镜像 
     * @return ScanScope 扫描范围 0全部镜像，1自选镜像，2推荐扫描镜像
     */
    public Long getScanScope() {
        return this.ScanScope;
    }

    /**
     * Set 扫描范围 0全部镜像，1自选镜像，2推荐扫描镜像
     * @param ScanScope 扫描范围 0全部镜像，1自选镜像，2推荐扫描镜像
     */
    public void setScanScope(Long ScanScope) {
        this.ScanScope = ScanScope;
    }

    /**
     * Get 仓库类型 
     * @return RegistryType 仓库类型
     */
    public String [] getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 仓库类型
     * @param RegistryType 仓库类型
     */
    public void setRegistryType(String [] RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String [] getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String [] Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 是否存在运行中的容器 
     * @return ContainerRunning 是否存在运行中的容器
     */
    public Boolean getContainerRunning() {
        return this.ContainerRunning;
    }

    /**
     * Set 是否存在运行中的容器
     * @param ContainerRunning 是否存在运行中的容器
     */
    public void setContainerRunning(Boolean ContainerRunning) {
        this.ContainerRunning = ContainerRunning;
    }

    /**
     * Get 任务超时时长单位s 
     * @return Timeout 任务超时时长单位s
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 任务超时时长单位s
     * @param Timeout 任务超时时长单位s
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public CreateAssetImageRegistryScanTaskOneKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageRegistryScanTaskOneKeyRequest(CreateAssetImageRegistryScanTaskOneKeyRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new ImageInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageInfo(source.Images[i]);
            }
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
        if (source.ExcludeIDs != null) {
            this.ExcludeIDs = new Long[source.ExcludeIDs.length];
            for (int i = 0; i < source.ExcludeIDs.length; i++) {
                this.ExcludeIDs[i] = new Long(source.ExcludeIDs[i]);
            }
        }
        if (source.IsLatest != null) {
            this.IsLatest = new Boolean(source.IsLatest);
        }
        if (source.ScanScope != null) {
            this.ScanScope = new Long(source.ScanScope);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String[source.RegistryType.length];
            for (int i = 0; i < source.RegistryType.length; i++) {
                this.RegistryType[i] = new String(source.RegistryType[i]);
            }
        }
        if (source.Namespace != null) {
            this.Namespace = new String[source.Namespace.length];
            for (int i = 0; i < source.Namespace.length; i++) {
                this.Namespace[i] = new String(source.Namespace[i]);
            }
        }
        if (source.ContainerRunning != null) {
            this.ContainerRunning = new Boolean(source.ContainerRunning);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamArraySimple(map, prefix + "ExcludeIDs.", this.ExcludeIDs);
        this.setParamSimple(map, prefix + "IsLatest", this.IsLatest);
        this.setParamSimple(map, prefix + "ScanScope", this.ScanScope);
        this.setParamArraySimple(map, prefix + "RegistryType.", this.RegistryType);
        this.setParamArraySimple(map, prefix + "Namespace.", this.Namespace);
        this.setParamSimple(map, prefix + "ContainerRunning", this.ContainerRunning);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

