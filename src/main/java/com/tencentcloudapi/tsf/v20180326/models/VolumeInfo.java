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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeInfo extends AbstractModel {

    /**
    * 数据卷类型
    */
    @SerializedName("VolumeType")
    @Expose
    private String VolumeType;

    /**
    * 数据卷名称
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    * 数据卷配置
    */
    @SerializedName("VolumeConfig")
    @Expose
    private String VolumeConfig;

    /**
    * -
    */
    @SerializedName("ConfigMapOptions")
    @Expose
    private ConfigMapOption [] ConfigMapOptions;

    /**
    * -
    */
    @SerializedName("EmptyDirOption")
    @Expose
    private EmptyDirOption EmptyDirOption;

    /**
     * Get 数据卷类型 
     * @return VolumeType 数据卷类型
     */
    public String getVolumeType() {
        return this.VolumeType;
    }

    /**
     * Set 数据卷类型
     * @param VolumeType 数据卷类型
     */
    public void setVolumeType(String VolumeType) {
        this.VolumeType = VolumeType;
    }

    /**
     * Get 数据卷名称 
     * @return VolumeName 数据卷名称
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set 数据卷名称
     * @param VolumeName 数据卷名称
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
    }

    /**
     * Get 数据卷配置 
     * @return VolumeConfig 数据卷配置
     */
    public String getVolumeConfig() {
        return this.VolumeConfig;
    }

    /**
     * Set 数据卷配置
     * @param VolumeConfig 数据卷配置
     */
    public void setVolumeConfig(String VolumeConfig) {
        this.VolumeConfig = VolumeConfig;
    }

    /**
     * Get - 
     * @return ConfigMapOptions -
     */
    public ConfigMapOption [] getConfigMapOptions() {
        return this.ConfigMapOptions;
    }

    /**
     * Set -
     * @param ConfigMapOptions -
     */
    public void setConfigMapOptions(ConfigMapOption [] ConfigMapOptions) {
        this.ConfigMapOptions = ConfigMapOptions;
    }

    /**
     * Get - 
     * @return EmptyDirOption -
     */
    public EmptyDirOption getEmptyDirOption() {
        return this.EmptyDirOption;
    }

    /**
     * Set -
     * @param EmptyDirOption -
     */
    public void setEmptyDirOption(EmptyDirOption EmptyDirOption) {
        this.EmptyDirOption = EmptyDirOption;
    }

    public VolumeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeInfo(VolumeInfo source) {
        if (source.VolumeType != null) {
            this.VolumeType = new String(source.VolumeType);
        }
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
        if (source.VolumeConfig != null) {
            this.VolumeConfig = new String(source.VolumeConfig);
        }
        if (source.ConfigMapOptions != null) {
            this.ConfigMapOptions = new ConfigMapOption[source.ConfigMapOptions.length];
            for (int i = 0; i < source.ConfigMapOptions.length; i++) {
                this.ConfigMapOptions[i] = new ConfigMapOption(source.ConfigMapOptions[i]);
            }
        }
        if (source.EmptyDirOption != null) {
            this.EmptyDirOption = new EmptyDirOption(source.EmptyDirOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeType", this.VolumeType);
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "VolumeConfig", this.VolumeConfig);
        this.setParamArrayObj(map, prefix + "ConfigMapOptions.", this.ConfigMapOptions);
        this.setParamObj(map, prefix + "EmptyDirOption.", this.EmptyDirOption);

    }
}

