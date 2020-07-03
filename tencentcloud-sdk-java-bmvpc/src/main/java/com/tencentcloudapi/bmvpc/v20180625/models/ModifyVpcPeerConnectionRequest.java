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

public class ModifyVpcPeerConnectionRequest extends AbstractModel{

    /**
    * 黑石对等连接唯一ID
    */
    @SerializedName("VpcPeerConnectionId")
    @Expose
    private String VpcPeerConnectionId;

    /**
    * 对等连接带宽
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 对等连接名称
    */
    @SerializedName("VpcPeerConnectionName")
    @Expose
    private String VpcPeerConnectionName;

    /**
     * Get 黑石对等连接唯一ID 
     * @return VpcPeerConnectionId 黑石对等连接唯一ID
     */
    public String getVpcPeerConnectionId() {
        return this.VpcPeerConnectionId;
    }

    /**
     * Set 黑石对等连接唯一ID
     * @param VpcPeerConnectionId 黑石对等连接唯一ID
     */
    public void setVpcPeerConnectionId(String VpcPeerConnectionId) {
        this.VpcPeerConnectionId = VpcPeerConnectionId;
    }

    /**
     * Get 对等连接带宽 
     * @return Bandwidth 对等连接带宽
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 对等连接带宽
     * @param Bandwidth 对等连接带宽
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 对等连接名称 
     * @return VpcPeerConnectionName 对等连接名称
     */
    public String getVpcPeerConnectionName() {
        return this.VpcPeerConnectionName;
    }

    /**
     * Set 对等连接名称
     * @param VpcPeerConnectionName 对等连接名称
     */
    public void setVpcPeerConnectionName(String VpcPeerConnectionName) {
        this.VpcPeerConnectionName = VpcPeerConnectionName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcPeerConnectionId", this.VpcPeerConnectionId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "VpcPeerConnectionName", this.VpcPeerConnectionName);

    }
}

