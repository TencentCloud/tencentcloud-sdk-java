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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessVpc extends AbstractModel{

    /**
    * Vpc的Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 内网接入状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 内网接入Ip
    */
    @SerializedName("AccessIp")
    @Expose
    private String AccessIp;

    /**
     * Get Vpc的Id 
     * @return VpcId Vpc的Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpc的Id
     * @param VpcId Vpc的Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网Id 
     * @return SubnetId 子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网Id
     * @param SubnetId 子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 内网接入状态 
     * @return Status 内网接入状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 内网接入状态
     * @param Status 内网接入状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 内网接入Ip 
     * @return AccessIp 内网接入Ip
     */
    public String getAccessIp() {
        return this.AccessIp;
    }

    /**
     * Set 内网接入Ip
     * @param AccessIp 内网接入Ip
     */
    public void setAccessIp(String AccessIp) {
        this.AccessIp = AccessIp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AccessIp", this.AccessIp);

    }
}

