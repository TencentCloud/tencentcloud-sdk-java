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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageVolumeDetail extends AbstractModel {

    /**
    * 存储卷名称
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    * 存储卷类型
    */
    @SerializedName("VolumeType")
    @Expose
    private String VolumeType;

    /**
    * 存储卷详情
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 存储卷名称 
     * @return VolumeName 存储卷名称
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set 存储卷名称
     * @param VolumeName 存储卷名称
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
    }

    /**
     * Get 存储卷类型 
     * @return VolumeType 存储卷类型
     */
    public String getVolumeType() {
        return this.VolumeType;
    }

    /**
     * Set 存储卷类型
     * @param VolumeType 存储卷类型
     */
    public void setVolumeType(String VolumeType) {
        this.VolumeType = VolumeType;
    }

    /**
     * Get 存储卷详情 
     * @return Desc 存储卷详情
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 存储卷详情
     * @param Desc 存储卷详情
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public StorageVolumeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageVolumeDetail(StorageVolumeDetail source) {
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
        if (source.VolumeType != null) {
            this.VolumeType = new String(source.VolumeType);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "VolumeType", this.VolumeType);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

