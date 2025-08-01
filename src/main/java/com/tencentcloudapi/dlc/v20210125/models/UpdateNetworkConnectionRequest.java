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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateNetworkConnectionRequest extends AbstractModel {

    /**
    * 网络配置描述
    */
    @SerializedName("NetworkConnectionDesc")
    @Expose
    private String NetworkConnectionDesc;

    /**
    * 网络配置名称
    */
    @SerializedName("NetworkConnectionName")
    @Expose
    private String NetworkConnectionName;

    /**
     * Get 网络配置描述 
     * @return NetworkConnectionDesc 网络配置描述
     */
    public String getNetworkConnectionDesc() {
        return this.NetworkConnectionDesc;
    }

    /**
     * Set 网络配置描述
     * @param NetworkConnectionDesc 网络配置描述
     */
    public void setNetworkConnectionDesc(String NetworkConnectionDesc) {
        this.NetworkConnectionDesc = NetworkConnectionDesc;
    }

    /**
     * Get 网络配置名称 
     * @return NetworkConnectionName 网络配置名称
     */
    public String getNetworkConnectionName() {
        return this.NetworkConnectionName;
    }

    /**
     * Set 网络配置名称
     * @param NetworkConnectionName 网络配置名称
     */
    public void setNetworkConnectionName(String NetworkConnectionName) {
        this.NetworkConnectionName = NetworkConnectionName;
    }

    public UpdateNetworkConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateNetworkConnectionRequest(UpdateNetworkConnectionRequest source) {
        if (source.NetworkConnectionDesc != null) {
            this.NetworkConnectionDesc = new String(source.NetworkConnectionDesc);
        }
        if (source.NetworkConnectionName != null) {
            this.NetworkConnectionName = new String(source.NetworkConnectionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkConnectionDesc", this.NetworkConnectionDesc);
        this.setParamSimple(map, prefix + "NetworkConnectionName", this.NetworkConnectionName);

    }
}

