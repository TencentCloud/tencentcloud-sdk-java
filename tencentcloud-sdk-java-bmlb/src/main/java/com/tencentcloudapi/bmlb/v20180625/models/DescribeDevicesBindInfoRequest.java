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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDevicesBindInfoRequest extends AbstractModel{

    /**
    * 黑石私有网络唯一ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 主机ID或虚机IP列表，可用于获取绑定了该主机的负载均衡列表。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get 黑石私有网络唯一ID。 
     * @return VpcId 黑石私有网络唯一ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 黑石私有网络唯一ID。
     * @param VpcId 黑石私有网络唯一ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 主机ID或虚机IP列表，可用于获取绑定了该主机的负载均衡列表。 
     * @return InstanceIds 主机ID或虚机IP列表，可用于获取绑定了该主机的负载均衡列表。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 主机ID或虚机IP列表，可用于获取绑定了该主机的负载均衡列表。
     * @param InstanceIds 主机ID或虚机IP列表，可用于获取绑定了该主机的负载均衡列表。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

