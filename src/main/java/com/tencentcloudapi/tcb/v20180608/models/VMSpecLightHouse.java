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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VMSpecLightHouse extends AbstractModel {

    /**
    * LH主机的BundleId
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 主机配置详情json
    */
    @SerializedName("BundleConfig")
    @Expose
    private String BundleConfig;

    /**
     * Get LH主机的BundleId 
     * @return BundleId LH主机的BundleId
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set LH主机的BundleId
     * @param BundleId LH主机的BundleId
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 主机配置详情json 
     * @return BundleConfig 主机配置详情json
     */
    public String getBundleConfig() {
        return this.BundleConfig;
    }

    /**
     * Set 主机配置详情json
     * @param BundleConfig 主机配置详情json
     */
    public void setBundleConfig(String BundleConfig) {
        this.BundleConfig = BundleConfig;
    }

    public VMSpecLightHouse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VMSpecLightHouse(VMSpecLightHouse source) {
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleConfig != null) {
            this.BundleConfig = new String(source.BundleConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleConfig", this.BundleConfig);

    }
}

