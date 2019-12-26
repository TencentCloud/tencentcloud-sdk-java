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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnatIp extends AbstractModel{

    /**
    * 私有网络子网的唯一性id，如subnet-12345678
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * IP地址，如192.168.0.1
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
     * Get 私有网络子网的唯一性id，如subnet-12345678 
     * @return SubnetId 私有网络子网的唯一性id，如subnet-12345678
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络子网的唯一性id，如subnet-12345678
     * @param SubnetId 私有网络子网的唯一性id，如subnet-12345678
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get IP地址，如192.168.0.1 
     * @return Ip IP地址，如192.168.0.1
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址，如192.168.0.1
     * @param Ip IP地址，如192.168.0.1
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);

    }
}

