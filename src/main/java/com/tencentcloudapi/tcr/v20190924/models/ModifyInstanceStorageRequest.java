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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceStorageRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>目标存储资源地域</p>
    */
    @SerializedName("TargetRegion")
    @Expose
    private String TargetRegion;

    /**
    * <p>目标存储资源名称</p>
    */
    @SerializedName("TargetStorageName")
    @Expose
    private String TargetStorageName;

    /**
     * Get <p>实例ID</p> 
     * @return RegistryId <p>实例ID</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>实例ID</p>
     * @param RegistryId <p>实例ID</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>目标存储资源地域</p> 
     * @return TargetRegion <p>目标存储资源地域</p>
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set <p>目标存储资源地域</p>
     * @param TargetRegion <p>目标存储资源地域</p>
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * Get <p>目标存储资源名称</p> 
     * @return TargetStorageName <p>目标存储资源名称</p>
     */
    public String getTargetStorageName() {
        return this.TargetStorageName;
    }

    /**
     * Set <p>目标存储资源名称</p>
     * @param TargetStorageName <p>目标存储资源名称</p>
     */
    public void setTargetStorageName(String TargetStorageName) {
        this.TargetStorageName = TargetStorageName;
    }

    public ModifyInstanceStorageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceStorageRequest(ModifyInstanceStorageRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.TargetRegion != null) {
            this.TargetRegion = new String(source.TargetRegion);
        }
        if (source.TargetStorageName != null) {
            this.TargetStorageName = new String(source.TargetStorageName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "TargetStorageName", this.TargetStorageName);

    }
}

