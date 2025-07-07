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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Volume extends AbstractModel {

    /**
    * 缓存卷ID。
    */
    @SerializedName("VolumeId")
    @Expose
    private String VolumeId;

    /**
    * 名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 环境ID。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 缓存卷类型，取值范围：
* SHARED：多点挂载共享存储
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 缓存卷规格，取值范围：

- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 缓存卷大小（GB）。
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * 缓存卷使用量（Byte）。
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

    /**
    * 缓存卷吞吐上限（MiB/s）。
    */
    @SerializedName("BandwidthLimit")
    @Expose
    private Float BandwidthLimit;

    /**
    * 默认挂载路径。
    */
    @SerializedName("DefaultMountPath")
    @Expose
    private String DefaultMountPath;

    /**
    * 是否为默认缓存卷。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 缓存卷ID。 
     * @return VolumeId 缓存卷ID。
     */
    public String getVolumeId() {
        return this.VolumeId;
    }

    /**
     * Set 缓存卷ID。
     * @param VolumeId 缓存卷ID。
     */
    public void setVolumeId(String VolumeId) {
        this.VolumeId = VolumeId;
    }

    /**
     * Get 名称。 
     * @return Name 名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称。
     * @param Name 名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述。 
     * @return Description 描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。
     * @param Description 描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 环境ID。 
     * @return EnvironmentId 环境ID。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境ID。
     * @param EnvironmentId 环境ID。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 缓存卷类型，取值范围：
* SHARED：多点挂载共享存储 
     * @return Type 缓存卷类型，取值范围：
* SHARED：多点挂载共享存储
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 缓存卷类型，取值范围：
* SHARED：多点挂载共享存储
     * @param Type 缓存卷类型，取值范围：
* SHARED：多点挂载共享存储
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 缓存卷规格，取值范围：

- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型 
     * @return Spec 缓存卷规格，取值范围：

- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 缓存卷规格，取值范围：

- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
     * @param Spec 缓存卷规格，取值范围：

- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 缓存卷大小（GB）。 
     * @return Capacity 缓存卷大小（GB）。
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set 缓存卷大小（GB）。
     * @param Capacity 缓存卷大小（GB）。
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get 缓存卷使用量（Byte）。 
     * @return Usage 缓存卷使用量（Byte）。
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set 缓存卷使用量（Byte）。
     * @param Usage 缓存卷使用量（Byte）。
     */
    public void setUsage(Long Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 缓存卷吞吐上限（MiB/s）。 
     * @return BandwidthLimit 缓存卷吞吐上限（MiB/s）。
     */
    public Float getBandwidthLimit() {
        return this.BandwidthLimit;
    }

    /**
     * Set 缓存卷吞吐上限（MiB/s）。
     * @param BandwidthLimit 缓存卷吞吐上限（MiB/s）。
     */
    public void setBandwidthLimit(Float BandwidthLimit) {
        this.BandwidthLimit = BandwidthLimit;
    }

    /**
     * Get 默认挂载路径。 
     * @return DefaultMountPath 默认挂载路径。
     */
    public String getDefaultMountPath() {
        return this.DefaultMountPath;
    }

    /**
     * Set 默认挂载路径。
     * @param DefaultMountPath 默认挂载路径。
     */
    public void setDefaultMountPath(String DefaultMountPath) {
        this.DefaultMountPath = DefaultMountPath;
    }

    /**
     * Get 是否为默认缓存卷。 
     * @return IsDefault 是否为默认缓存卷。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认缓存卷。
     * @param IsDefault 是否为默认缓存卷。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 状态。 
     * @return Status 状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。
     * @param Status 状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Volume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Volume(Volume source) {
        if (source.VolumeId != null) {
            this.VolumeId = new String(source.VolumeId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
        if (source.BandwidthLimit != null) {
            this.BandwidthLimit = new Float(source.BandwidthLimit);
        }
        if (source.DefaultMountPath != null) {
            this.DefaultMountPath = new String(source.DefaultMountPath);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeId", this.VolumeId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "BandwidthLimit", this.BandwidthLimit);
        this.setParamSimple(map, prefix + "DefaultMountPath", this.DefaultMountPath);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

