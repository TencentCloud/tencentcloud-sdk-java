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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GPUInfo extends AbstractModel{

    /**
    * 实例GPU个数。值小于1代表VGPU类型，大于1代表GPU直通类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPUCount")
    @Expose
    private Float GPUCount;

    /**
    * 实例GPU地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPUId")
    @Expose
    private String [] GPUId;

    /**
    * 实例GPU类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPUType")
    @Expose
    private String GPUType;

    /**
     * Get 实例GPU个数。值小于1代表VGPU类型，大于1代表GPU直通类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPUCount 实例GPU个数。值小于1代表VGPU类型，大于1代表GPU直通类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getGPUCount() {
        return this.GPUCount;
    }

    /**
     * Set 实例GPU个数。值小于1代表VGPU类型，大于1代表GPU直通类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPUCount 实例GPU个数。值小于1代表VGPU类型，大于1代表GPU直通类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPUCount(Float GPUCount) {
        this.GPUCount = GPUCount;
    }

    /**
     * Get 实例GPU地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPUId 实例GPU地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getGPUId() {
        return this.GPUId;
    }

    /**
     * Set 实例GPU地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPUId 实例GPU地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPUId(String [] GPUId) {
        this.GPUId = GPUId;
    }

    /**
     * Get 实例GPU类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPUType 实例GPU类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * Set 实例GPU类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPUType 实例GPU类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    public GPUInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GPUInfo(GPUInfo source) {
        if (source.GPUCount != null) {
            this.GPUCount = new Float(source.GPUCount);
        }
        if (source.GPUId != null) {
            this.GPUId = new String[source.GPUId.length];
            for (int i = 0; i < source.GPUId.length; i++) {
                this.GPUId[i] = new String(source.GPUId[i]);
            }
        }
        if (source.GPUType != null) {
            this.GPUType = new String(source.GPUType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GPUCount", this.GPUCount);
        this.setParamArraySimple(map, prefix + "GPUId.", this.GPUId);
        this.setParamSimple(map, prefix + "GPUType", this.GPUType);

    }
}

