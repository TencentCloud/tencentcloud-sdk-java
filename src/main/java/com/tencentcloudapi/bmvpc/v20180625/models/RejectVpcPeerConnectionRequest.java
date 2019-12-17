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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RejectVpcPeerConnectionRequest extends AbstractModel{

    /**
    * 黑石对等连接实例ID
    */
    @SerializedName("VpcPeerConnectionId")
    @Expose
    private String VpcPeerConnectionId;

    /**
     * Get 黑石对等连接实例ID 
     * @return VpcPeerConnectionId 黑石对等连接实例ID
     */
    public String getVpcPeerConnectionId() {
        return this.VpcPeerConnectionId;
    }

    /**
     * Set 黑石对等连接实例ID
     * @param VpcPeerConnectionId 黑石对等连接实例ID
     */
    public void setVpcPeerConnectionId(String VpcPeerConnectionId) {
        this.VpcPeerConnectionId = VpcPeerConnectionId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcPeerConnectionId", this.VpcPeerConnectionId);

    }
}

