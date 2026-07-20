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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Environment extends AbstractModel {

    /**
    * <p>IP地理位置信息</p>
    */
    @SerializedName("Location")
    @Expose
    private IPLocation Location;

    /**
    * <p>IP基础网络信息</p>
    */
    @SerializedName("Network")
    @Expose
    private IPNetwork Network;

    /**
     * Get <p>IP地理位置信息</p> 
     * @return Location <p>IP地理位置信息</p>
     */
    public IPLocation getLocation() {
        return this.Location;
    }

    /**
     * Set <p>IP地理位置信息</p>
     * @param Location <p>IP地理位置信息</p>
     */
    public void setLocation(IPLocation Location) {
        this.Location = Location;
    }

    /**
     * Get <p>IP基础网络信息</p> 
     * @return Network <p>IP基础网络信息</p>
     */
    public IPNetwork getNetwork() {
        return this.Network;
    }

    /**
     * Set <p>IP基础网络信息</p>
     * @param Network <p>IP基础网络信息</p>
     */
    public void setNetwork(IPNetwork Network) {
        this.Network = Network;
    }

    public Environment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Environment(Environment source) {
        if (source.Location != null) {
            this.Location = new IPLocation(source.Location);
        }
        if (source.Network != null) {
            this.Network = new IPNetwork(source.Network);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamObj(map, prefix + "Network.", this.Network);

    }
}

