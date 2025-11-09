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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkConfiguration extends AbstractModel {

    /**
    * 网络模式（当前支持 PUBLIC）
    */
    @SerializedName("NetworkMode")
    @Expose
    private String NetworkMode;

    /**
     * Get 网络模式（当前支持 PUBLIC） 
     * @return NetworkMode 网络模式（当前支持 PUBLIC）
     */
    public String getNetworkMode() {
        return this.NetworkMode;
    }

    /**
     * Set 网络模式（当前支持 PUBLIC）
     * @param NetworkMode 网络模式（当前支持 PUBLIC）
     */
    public void setNetworkMode(String NetworkMode) {
        this.NetworkMode = NetworkMode;
    }

    public NetworkConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkConfiguration(NetworkConfiguration source) {
        if (source.NetworkMode != null) {
            this.NetworkMode = new String(source.NetworkMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkMode", this.NetworkMode);

    }
}

