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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVolumeRequest extends AbstractModel {

    /**
    * 环境ID。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * 描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 缓存卷大小（GB），Turbo系列需要指定。
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

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
     * Get 缓存卷大小（GB），Turbo系列需要指定。 
     * @return Capacity 缓存卷大小（GB），Turbo系列需要指定。
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set 缓存卷大小（GB），Turbo系列需要指定。
     * @param Capacity 缓存卷大小（GB），Turbo系列需要指定。
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    public CreateVolumeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVolumeRequest(CreateVolumeRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);

    }
}

