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

public class UpdateImageRegistryTimingScanTaskRequest extends AbstractModel {

    /**
    * 定时扫描周期
    */
    @SerializedName("ScanPeriod")
    @Expose
    private Long ScanPeriod;

    /**
    * 定时扫描开关
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 定时扫描的时间
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 扫描木马类型数组
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * 扫描镜像
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * 是否扫描所有
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 扫描镜像Id
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * 是否扫描最新版本
    */
    @SerializedName("Latest")
    @Expose
    private Boolean Latest;

    /**
    * 是否存在运行中的容器
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Boolean ContainerRunning;

    /**
    * 扫描结束时间
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * 扫描范围 0全部镜像，1自选镜像，2推荐扫描镜像
    */
    @SerializedName("ScanScope")
    @Expose
    private Long ScanScope;

    /**
    * 仓库类型 tcr,ccr,harbor
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
    * 排除的镜像资产id
    */
    @SerializedName("ExcludeImageAssetIds")
    @Expose
    private Long [] ExcludeImageAssetIds;

    /**
     * Get 定时扫描周期 
     * @return ScanPeriod 定时扫描周期
     */
    public Long getScanPeriod() {
        return this.ScanPeriod;
    }

    /**
     * Set 定时扫描周期
     * @param ScanPeriod 定时扫描周期
     */
    public void setScanPeriod(Long ScanPeriod) {
        this.ScanPeriod = ScanPeriod;
    }

    /**
     * Get 定时扫描开关 
     * @return Enable 定时扫描开关
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 定时扫描开关
     * @param Enable 定时扫描开关
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 定时扫描的时间 
     * @return ScanTime 定时扫描的时间
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 定时扫描的时间
     * @param ScanTime 定时扫描的时间
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 扫描木马类型数组 
     * @return ScanType 扫描木马类型数组
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set 扫描木马类型数组
     * @param ScanType 扫描木马类型数组
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get 扫描镜像 
     * @return Images 扫描镜像
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set 扫描镜像
     * @param Images 扫描镜像
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get 是否扫描所有 
     * @return All 是否扫描所有
     * @deprecated
     */
    @Deprecated
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 是否扫描所有
     * @param All 是否扫描所有
     * @deprecated
     */
    @Deprecated
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 扫描镜像Id 
     * @return Id 扫描镜像Id
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set 扫描镜像Id
     * @param Id 扫描镜像Id
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get 是否扫描最新版本 
     * @return Latest 是否扫描最新版本
     */
    public Boolean getLatest() {
        return this.Latest;
    }

    /**
     * Set 是否扫描最新版本
     * @param Latest 是否扫描最新版本
     */
    public void setLatest(Boolean Latest) {
        this.Latest = Latest;
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
     * Get 扫描结束时间 
     * @return ScanEndTime 扫描结束时间
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set 扫描结束时间
     * @param ScanEndTime 扫描结束时间
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
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
     * Get 仓库类型 tcr,ccr,harbor 
     * @return RegistryType 仓库类型 tcr,ccr,harbor
     */
    public String [] getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 仓库类型 tcr,ccr,harbor
     * @param RegistryType 仓库类型 tcr,ccr,harbor
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
     * Get 排除的镜像资产id 
     * @return ExcludeImageAssetIds 排除的镜像资产id
     */
    public Long [] getExcludeImageAssetIds() {
        return this.ExcludeImageAssetIds;
    }

    /**
     * Set 排除的镜像资产id
     * @param ExcludeImageAssetIds 排除的镜像资产id
     */
    public void setExcludeImageAssetIds(Long [] ExcludeImageAssetIds) {
        this.ExcludeImageAssetIds = ExcludeImageAssetIds;
    }

    public UpdateImageRegistryTimingScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateImageRegistryTimingScanTaskRequest(UpdateImageRegistryTimingScanTaskRequest source) {
        if (source.ScanPeriod != null) {
            this.ScanPeriod = new Long(source.ScanPeriod);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.Images != null) {
            this.Images = new ImageInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageInfo(source.Images[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
        if (source.Latest != null) {
            this.Latest = new Boolean(source.Latest);
        }
        if (source.ContainerRunning != null) {
            this.ContainerRunning = new Boolean(source.ContainerRunning);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
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
        if (source.ExcludeImageAssetIds != null) {
            this.ExcludeImageAssetIds = new Long[source.ExcludeImageAssetIds.length];
            for (int i = 0; i < source.ExcludeImageAssetIds.length; i++) {
                this.ExcludeImageAssetIds[i] = new Long(source.ExcludeImageAssetIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanPeriod", this.ScanPeriod);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamSimple(map, prefix + "Latest", this.Latest);
        this.setParamSimple(map, prefix + "ContainerRunning", this.ContainerRunning);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "ScanScope", this.ScanScope);
        this.setParamArraySimple(map, prefix + "RegistryType.", this.RegistryType);
        this.setParamArraySimple(map, prefix + "Namespace.", this.Namespace);
        this.setParamArraySimple(map, prefix + "ExcludeImageAssetIds.", this.ExcludeImageAssetIds);

    }
}

