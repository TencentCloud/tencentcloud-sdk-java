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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GPUArgs extends AbstractModel {

    /**
    * CUDA版本信息
    */
    @SerializedName("CUDA")
    @Expose
    private DriverVersion CUDA;

    /**
    * cuDNN版本信息
    */
    @SerializedName("CUDNN")
    @Expose
    private CUDNN CUDNN;

    /**
    * 自定义GPU驱动信息
    */
    @SerializedName("CustomDriver")
    @Expose
    private CustomDriver CustomDriver;

    /**
    * GPU驱动版本信息
    */
    @SerializedName("Driver")
    @Expose
    private DriverVersion Driver;

    /**
    * 是否启用MIG特性
    */
    @SerializedName("MIGEnable")
    @Expose
    private Boolean MIGEnable;

    /**
     * Get CUDA版本信息 
     * @return CUDA CUDA版本信息
     */
    public DriverVersion getCUDA() {
        return this.CUDA;
    }

    /**
     * Set CUDA版本信息
     * @param CUDA CUDA版本信息
     */
    public void setCUDA(DriverVersion CUDA) {
        this.CUDA = CUDA;
    }

    /**
     * Get cuDNN版本信息 
     * @return CUDNN cuDNN版本信息
     */
    public CUDNN getCUDNN() {
        return this.CUDNN;
    }

    /**
     * Set cuDNN版本信息
     * @param CUDNN cuDNN版本信息
     */
    public void setCUDNN(CUDNN CUDNN) {
        this.CUDNN = CUDNN;
    }

    /**
     * Get 自定义GPU驱动信息 
     * @return CustomDriver 自定义GPU驱动信息
     */
    public CustomDriver getCustomDriver() {
        return this.CustomDriver;
    }

    /**
     * Set 自定义GPU驱动信息
     * @param CustomDriver 自定义GPU驱动信息
     */
    public void setCustomDriver(CustomDriver CustomDriver) {
        this.CustomDriver = CustomDriver;
    }

    /**
     * Get GPU驱动版本信息 
     * @return Driver GPU驱动版本信息
     */
    public DriverVersion getDriver() {
        return this.Driver;
    }

    /**
     * Set GPU驱动版本信息
     * @param Driver GPU驱动版本信息
     */
    public void setDriver(DriverVersion Driver) {
        this.Driver = Driver;
    }

    /**
     * Get 是否启用MIG特性 
     * @return MIGEnable 是否启用MIG特性
     */
    public Boolean getMIGEnable() {
        return this.MIGEnable;
    }

    /**
     * Set 是否启用MIG特性
     * @param MIGEnable 是否启用MIG特性
     */
    public void setMIGEnable(Boolean MIGEnable) {
        this.MIGEnable = MIGEnable;
    }

    public GPUArgs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GPUArgs(GPUArgs source) {
        if (source.CUDA != null) {
            this.CUDA = new DriverVersion(source.CUDA);
        }
        if (source.CUDNN != null) {
            this.CUDNN = new CUDNN(source.CUDNN);
        }
        if (source.CustomDriver != null) {
            this.CustomDriver = new CustomDriver(source.CustomDriver);
        }
        if (source.Driver != null) {
            this.Driver = new DriverVersion(source.Driver);
        }
        if (source.MIGEnable != null) {
            this.MIGEnable = new Boolean(source.MIGEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CUDA.", this.CUDA);
        this.setParamObj(map, prefix + "CUDNN.", this.CUDNN);
        this.setParamObj(map, prefix + "CustomDriver.", this.CustomDriver);
        this.setParamObj(map, prefix + "Driver.", this.Driver);
        this.setParamSimple(map, prefix + "MIGEnable", this.MIGEnable);

    }
}

