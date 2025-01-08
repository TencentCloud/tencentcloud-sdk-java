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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseRunEmptyDirVolumeSource extends AbstractModel {

    /**
    * 启用emptydir数据卷
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableEmptyDirVolume")
    @Expose
    private Boolean EnableEmptyDirVolume;

    /**
    * "","Memory","HugePages"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Medium")
    @Expose
    private String Medium;

    /**
    * emptydir数据卷大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SizeLimit")
    @Expose
    private String SizeLimit;

    /**
     * Get 启用emptydir数据卷
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableEmptyDirVolume 启用emptydir数据卷
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableEmptyDirVolume() {
        return this.EnableEmptyDirVolume;
    }

    /**
     * Set 启用emptydir数据卷
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableEmptyDirVolume 启用emptydir数据卷
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableEmptyDirVolume(Boolean EnableEmptyDirVolume) {
        this.EnableEmptyDirVolume = EnableEmptyDirVolume;
    }

    /**
     * Get "","Memory","HugePages"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Medium "","Memory","HugePages"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMedium() {
        return this.Medium;
    }

    /**
     * Set "","Memory","HugePages"
注意：此字段可能返回 null，表示取不到有效值。
     * @param Medium "","Memory","HugePages"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMedium(String Medium) {
        this.Medium = Medium;
    }

    /**
     * Get emptydir数据卷大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SizeLimit emptydir数据卷大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSizeLimit() {
        return this.SizeLimit;
    }

    /**
     * Set emptydir数据卷大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param SizeLimit emptydir数据卷大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSizeLimit(String SizeLimit) {
        this.SizeLimit = SizeLimit;
    }

    public CloudBaseRunEmptyDirVolumeSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseRunEmptyDirVolumeSource(CloudBaseRunEmptyDirVolumeSource source) {
        if (source.EnableEmptyDirVolume != null) {
            this.EnableEmptyDirVolume = new Boolean(source.EnableEmptyDirVolume);
        }
        if (source.Medium != null) {
            this.Medium = new String(source.Medium);
        }
        if (source.SizeLimit != null) {
            this.SizeLimit = new String(source.SizeLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableEmptyDirVolume", this.EnableEmptyDirVolume);
        this.setParamSimple(map, prefix + "Medium", this.Medium);
        this.setParamSimple(map, prefix + "SizeLimit", this.SizeLimit);

    }
}

