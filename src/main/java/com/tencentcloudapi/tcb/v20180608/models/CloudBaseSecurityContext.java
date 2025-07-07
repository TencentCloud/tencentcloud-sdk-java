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

public class CloudBaseSecurityContext extends AbstractModel {

    /**
    * 安全特性
    */
    @SerializedName("Capabilities")
    @Expose
    private CloudBaseCapabilities Capabilities;

    /**
     * Get 安全特性 
     * @return Capabilities 安全特性
     */
    public CloudBaseCapabilities getCapabilities() {
        return this.Capabilities;
    }

    /**
     * Set 安全特性
     * @param Capabilities 安全特性
     */
    public void setCapabilities(CloudBaseCapabilities Capabilities) {
        this.Capabilities = Capabilities;
    }

    public CloudBaseSecurityContext() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseSecurityContext(CloudBaseSecurityContext source) {
        if (source.Capabilities != null) {
            this.Capabilities = new CloudBaseCapabilities(source.Capabilities);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Capabilities.", this.Capabilities);

    }
}

