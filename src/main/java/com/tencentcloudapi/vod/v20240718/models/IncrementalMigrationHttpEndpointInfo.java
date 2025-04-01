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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationHttpEndpointInfo extends AbstractModel {

    /**
    * 地址信息，支持域名或 IP 地址。
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 备份地址信息。
    */
    @SerializedName("StandbyEndpointSet")
    @Expose
    private String [] StandbyEndpointSet;

    /**
     * Get 地址信息，支持域名或 IP 地址。 
     * @return Endpoint 地址信息，支持域名或 IP 地址。
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 地址信息，支持域名或 IP 地址。
     * @param Endpoint 地址信息，支持域名或 IP 地址。
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 备份地址信息。 
     * @return StandbyEndpointSet 备份地址信息。
     */
    public String [] getStandbyEndpointSet() {
        return this.StandbyEndpointSet;
    }

    /**
     * Set 备份地址信息。
     * @param StandbyEndpointSet 备份地址信息。
     */
    public void setStandbyEndpointSet(String [] StandbyEndpointSet) {
        this.StandbyEndpointSet = StandbyEndpointSet;
    }

    public IncrementalMigrationHttpEndpointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationHttpEndpointInfo(IncrementalMigrationHttpEndpointInfo source) {
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.StandbyEndpointSet != null) {
            this.StandbyEndpointSet = new String[source.StandbyEndpointSet.length];
            for (int i = 0; i < source.StandbyEndpointSet.length; i++) {
                this.StandbyEndpointSet[i] = new String(source.StandbyEndpointSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamArraySimple(map, prefix + "StandbyEndpointSet.", this.StandbyEndpointSet);

    }
}

