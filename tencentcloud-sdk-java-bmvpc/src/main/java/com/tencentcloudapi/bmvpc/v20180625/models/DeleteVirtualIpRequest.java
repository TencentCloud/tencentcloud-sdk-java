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

public class DeleteVirtualIpRequest extends AbstractModel{

    /**
    * 私有网络唯一ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 退还的IP列表。
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
     * Get 私有网络唯一ID。 
     * @return VpcId 私有网络唯一ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络唯一ID。
     * @param VpcId 私有网络唯一ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 退还的IP列表。 
     * @return Ips 退还的IP列表。
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * Set 退还的IP列表。
     * @param Ips 退还的IP列表。
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "Ips.", this.Ips);

    }
}

