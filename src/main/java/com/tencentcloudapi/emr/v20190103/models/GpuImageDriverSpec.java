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

public class GpuImageDriverSpec extends AbstractModel {

    /**
    * <p>镜像ID</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>驱动名称</p>
    */
    @SerializedName("DriverName")
    @Expose
    private String DriverName;

    /**
    * <p>驱动版本</p>
    */
    @SerializedName("DriverVersion")
    @Expose
    private String DriverVersion;

    /**
    * <p>CUDA名称</p>
    */
    @SerializedName("CUDAName")
    @Expose
    private String CUDAName;

    /**
    * <p>CUDA版本</p>
    */
    @SerializedName("CUDAVersion")
    @Expose
    private String CUDAVersion;

    /**
    * <p>CUDNN名称</p>
    */
    @SerializedName("CUDNNName")
    @Expose
    private String CUDNNName;

    /**
    * <p>CUDNN版本</p>
    */
    @SerializedName("CUDNNVersion")
    @Expose
    private String CUDNNVersion;

    /**
     * Get <p>镜像ID</p> 
     * @return ImageId <p>镜像ID</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像ID</p>
     * @param ImageId <p>镜像ID</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>驱动名称</p> 
     * @return DriverName <p>驱动名称</p>
     */
    public String getDriverName() {
        return this.DriverName;
    }

    /**
     * Set <p>驱动名称</p>
     * @param DriverName <p>驱动名称</p>
     */
    public void setDriverName(String DriverName) {
        this.DriverName = DriverName;
    }

    /**
     * Get <p>驱动版本</p> 
     * @return DriverVersion <p>驱动版本</p>
     */
    public String getDriverVersion() {
        return this.DriverVersion;
    }

    /**
     * Set <p>驱动版本</p>
     * @param DriverVersion <p>驱动版本</p>
     */
    public void setDriverVersion(String DriverVersion) {
        this.DriverVersion = DriverVersion;
    }

    /**
     * Get <p>CUDA名称</p> 
     * @return CUDAName <p>CUDA名称</p>
     */
    public String getCUDAName() {
        return this.CUDAName;
    }

    /**
     * Set <p>CUDA名称</p>
     * @param CUDAName <p>CUDA名称</p>
     */
    public void setCUDAName(String CUDAName) {
        this.CUDAName = CUDAName;
    }

    /**
     * Get <p>CUDA版本</p> 
     * @return CUDAVersion <p>CUDA版本</p>
     */
    public String getCUDAVersion() {
        return this.CUDAVersion;
    }

    /**
     * Set <p>CUDA版本</p>
     * @param CUDAVersion <p>CUDA版本</p>
     */
    public void setCUDAVersion(String CUDAVersion) {
        this.CUDAVersion = CUDAVersion;
    }

    /**
     * Get <p>CUDNN名称</p> 
     * @return CUDNNName <p>CUDNN名称</p>
     */
    public String getCUDNNName() {
        return this.CUDNNName;
    }

    /**
     * Set <p>CUDNN名称</p>
     * @param CUDNNName <p>CUDNN名称</p>
     */
    public void setCUDNNName(String CUDNNName) {
        this.CUDNNName = CUDNNName;
    }

    /**
     * Get <p>CUDNN版本</p> 
     * @return CUDNNVersion <p>CUDNN版本</p>
     */
    public String getCUDNNVersion() {
        return this.CUDNNVersion;
    }

    /**
     * Set <p>CUDNN版本</p>
     * @param CUDNNVersion <p>CUDNN版本</p>
     */
    public void setCUDNNVersion(String CUDNNVersion) {
        this.CUDNNVersion = CUDNNVersion;
    }

    public GpuImageDriverSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GpuImageDriverSpec(GpuImageDriverSpec source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.DriverName != null) {
            this.DriverName = new String(source.DriverName);
        }
        if (source.DriverVersion != null) {
            this.DriverVersion = new String(source.DriverVersion);
        }
        if (source.CUDAName != null) {
            this.CUDAName = new String(source.CUDAName);
        }
        if (source.CUDAVersion != null) {
            this.CUDAVersion = new String(source.CUDAVersion);
        }
        if (source.CUDNNName != null) {
            this.CUDNNName = new String(source.CUDNNName);
        }
        if (source.CUDNNVersion != null) {
            this.CUDNNVersion = new String(source.CUDNNVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "DriverName", this.DriverName);
        this.setParamSimple(map, prefix + "DriverVersion", this.DriverVersion);
        this.setParamSimple(map, prefix + "CUDAName", this.CUDAName);
        this.setParamSimple(map, prefix + "CUDAVersion", this.CUDAVersion);
        this.setParamSimple(map, prefix + "CUDNNName", this.CUDNNName);
        this.setParamSimple(map, prefix + "CUDNNVersion", this.CUDNNVersion);

    }
}

