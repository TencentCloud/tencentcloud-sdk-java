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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GPUParams extends AbstractModel {

    /**
    * GPU驱动版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Driver")
    @Expose
    private String Driver;

    /**
    * CUDA版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CUDA")
    @Expose
    private String CUDA;

    /**
    * CUDNN版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CUDNN")
    @Expose
    private String CUDNN;

    /**
    * 是否启用MIG特性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MIGEnable")
    @Expose
    private Boolean MIGEnable;

    /**
    * 是否启用Fabric特性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fabric")
    @Expose
    private Boolean Fabric;

    /**
    * 自定义驱动下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomGPUDriver")
    @Expose
    private String CustomGPUDriver;

    /**
     * Get GPU驱动版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Driver GPU驱动版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDriver() {
        return this.Driver;
    }

    /**
     * Set GPU驱动版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Driver GPU驱动版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDriver(String Driver) {
        this.Driver = Driver;
    }

    /**
     * Get CUDA版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CUDA CUDA版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCUDA() {
        return this.CUDA;
    }

    /**
     * Set CUDA版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CUDA CUDA版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCUDA(String CUDA) {
        this.CUDA = CUDA;
    }

    /**
     * Get CUDNN版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CUDNN CUDNN版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCUDNN() {
        return this.CUDNN;
    }

    /**
     * Set CUDNN版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CUDNN CUDNN版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCUDNN(String CUDNN) {
        this.CUDNN = CUDNN;
    }

    /**
     * Get 是否启用MIG特性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MIGEnable 是否启用MIG特性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getMIGEnable() {
        return this.MIGEnable;
    }

    /**
     * Set 是否启用MIG特性
注意：此字段可能返回 null，表示取不到有效值。
     * @param MIGEnable 是否启用MIG特性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMIGEnable(Boolean MIGEnable) {
        this.MIGEnable = MIGEnable;
    }

    /**
     * Get 是否启用Fabric特性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fabric 是否启用Fabric特性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getFabric() {
        return this.Fabric;
    }

    /**
     * Set 是否启用Fabric特性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fabric 是否启用Fabric特性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFabric(Boolean Fabric) {
        this.Fabric = Fabric;
    }

    /**
     * Get 自定义驱动下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomGPUDriver 自定义驱动下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomGPUDriver() {
        return this.CustomGPUDriver;
    }

    /**
     * Set 自定义驱动下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomGPUDriver 自定义驱动下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomGPUDriver(String CustomGPUDriver) {
        this.CustomGPUDriver = CustomGPUDriver;
    }

    public GPUParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GPUParams(GPUParams source) {
        if (source.Driver != null) {
            this.Driver = new String(source.Driver);
        }
        if (source.CUDA != null) {
            this.CUDA = new String(source.CUDA);
        }
        if (source.CUDNN != null) {
            this.CUDNN = new String(source.CUDNN);
        }
        if (source.MIGEnable != null) {
            this.MIGEnable = new Boolean(source.MIGEnable);
        }
        if (source.Fabric != null) {
            this.Fabric = new Boolean(source.Fabric);
        }
        if (source.CustomGPUDriver != null) {
            this.CustomGPUDriver = new String(source.CustomGPUDriver);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Driver", this.Driver);
        this.setParamSimple(map, prefix + "CUDA", this.CUDA);
        this.setParamSimple(map, prefix + "CUDNN", this.CUDNN);
        this.setParamSimple(map, prefix + "MIGEnable", this.MIGEnable);
        this.setParamSimple(map, prefix + "Fabric", this.Fabric);
        this.setParamSimple(map, prefix + "CustomGPUDriver", this.CustomGPUDriver);

    }
}

