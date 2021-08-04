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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandaloneGatewayPackageInfo extends AbstractModel{

    /**
    * CPU核心数
    */
    @SerializedName("CPU")
    @Expose
    private Float CPU;

    /**
    * 内存大小，单位MB
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 套餐包版本名称
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
     * Get CPU核心数 
     * @return CPU CPU核心数
     */
    public Float getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核心数
     * @param CPU CPU核心数
     */
    public void setCPU(Float CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存大小，单位MB 
     * @return Mem 内存大小，单位MB
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存大小，单位MB
     * @param Mem 内存大小，单位MB
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 套餐包版本名称 
     * @return PackageVersion 套餐包版本名称
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 套餐包版本名称
     * @param PackageVersion 套餐包版本名称
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    public StandaloneGatewayPackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandaloneGatewayPackageInfo(StandaloneGatewayPackageInfo source) {
        if (source.CPU != null) {
            this.CPU = new Float(source.CPU);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);

    }
}

