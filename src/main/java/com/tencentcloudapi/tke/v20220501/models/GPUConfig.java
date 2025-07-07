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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GPUConfig extends AbstractModel {

    /**
    * 机型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * GPU相关的参数，包括驱动版本，CUDA版本，cuDNN版本，是否开启MIG以及是否开启Fabric等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPUParams")
    @Expose
    private GPUParams GPUParams;

    /**
     * Get 机型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 机型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 机型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 机型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get GPU相关的参数，包括驱动版本，CUDA版本，cuDNN版本，是否开启MIG以及是否开启Fabric等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPUParams GPU相关的参数，包括驱动版本，CUDA版本，cuDNN版本，是否开启MIG以及是否开启Fabric等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GPUParams getGPUParams() {
        return this.GPUParams;
    }

    /**
     * Set GPU相关的参数，包括驱动版本，CUDA版本，cuDNN版本，是否开启MIG以及是否开启Fabric等
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPUParams GPU相关的参数，包括驱动版本，CUDA版本，cuDNN版本，是否开启MIG以及是否开启Fabric等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPUParams(GPUParams GPUParams) {
        this.GPUParams = GPUParams;
    }

    public GPUConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GPUConfig(GPUConfig source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.GPUParams != null) {
            this.GPUParams = new GPUParams(source.GPUParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "GPUParams.", this.GPUParams);

    }
}

