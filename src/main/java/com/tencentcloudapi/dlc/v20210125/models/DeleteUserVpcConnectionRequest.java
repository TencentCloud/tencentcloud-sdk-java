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

public class DeleteUserVpcConnectionRequest extends AbstractModel {

    /**
    * 引擎网络ID
    */
    @SerializedName("EngineNetworkId")
    @Expose
    private String EngineNetworkId;

    /**
    * 终端节点ID
    */
    @SerializedName("UserVpcEndpointId")
    @Expose
    private String UserVpcEndpointId;

    /**
     * Get 引擎网络ID 
     * @return EngineNetworkId 引擎网络ID
     */
    public String getEngineNetworkId() {
        return this.EngineNetworkId;
    }

    /**
     * Set 引擎网络ID
     * @param EngineNetworkId 引擎网络ID
     */
    public void setEngineNetworkId(String EngineNetworkId) {
        this.EngineNetworkId = EngineNetworkId;
    }

    /**
     * Get 终端节点ID 
     * @return UserVpcEndpointId 终端节点ID
     */
    public String getUserVpcEndpointId() {
        return this.UserVpcEndpointId;
    }

    /**
     * Set 终端节点ID
     * @param UserVpcEndpointId 终端节点ID
     */
    public void setUserVpcEndpointId(String UserVpcEndpointId) {
        this.UserVpcEndpointId = UserVpcEndpointId;
    }

    public DeleteUserVpcConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUserVpcConnectionRequest(DeleteUserVpcConnectionRequest source) {
        if (source.EngineNetworkId != null) {
            this.EngineNetworkId = new String(source.EngineNetworkId);
        }
        if (source.UserVpcEndpointId != null) {
            this.UserVpcEndpointId = new String(source.UserVpcEndpointId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineNetworkId", this.EngineNetworkId);
        this.setParamSimple(map, prefix + "UserVpcEndpointId", this.UserVpcEndpointId);

    }
}

