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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInboundEndpointRequest extends AbstractModel {

    /**
    * 终端节点ID
    */
    @SerializedName("EndpointId")
    @Expose
    private String EndpointId;

    /**
    * 终端节点名称
    */
    @SerializedName("EndpointName")
    @Expose
    private String EndpointName;

    /**
     * Get 终端节点ID 
     * @return EndpointId 终端节点ID
     */
    public String getEndpointId() {
        return this.EndpointId;
    }

    /**
     * Set 终端节点ID
     * @param EndpointId 终端节点ID
     */
    public void setEndpointId(String EndpointId) {
        this.EndpointId = EndpointId;
    }

    /**
     * Get 终端节点名称 
     * @return EndpointName 终端节点名称
     */
    public String getEndpointName() {
        return this.EndpointName;
    }

    /**
     * Set 终端节点名称
     * @param EndpointName 终端节点名称
     */
    public void setEndpointName(String EndpointName) {
        this.EndpointName = EndpointName;
    }

    public ModifyInboundEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInboundEndpointRequest(ModifyInboundEndpointRequest source) {
        if (source.EndpointId != null) {
            this.EndpointId = new String(source.EndpointId);
        }
        if (source.EndpointName != null) {
            this.EndpointName = new String(source.EndpointName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointId", this.EndpointId);
        this.setParamSimple(map, prefix + "EndpointName", this.EndpointName);

    }
}

