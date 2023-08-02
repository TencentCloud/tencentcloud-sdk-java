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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LinuxNodeAttribute extends AbstractModel{

    /**
    * cvmId
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点所属vpcid
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 节点所属子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * linux客户端节点地址
    */
    @SerializedName("LinuxClientNodeIp")
    @Expose
    private String LinuxClientNodeIp;

    /**
     * Get cvmId 
     * @return InstanceId cvmId
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set cvmId
     * @param InstanceId cvmId
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点所属vpcid 
     * @return VpcId 节点所属vpcid
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 节点所属vpcid
     * @param VpcId 节点所属vpcid
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 节点所属子网id 
     * @return SubnetId 节点所属子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 节点所属子网id
     * @param SubnetId 节点所属子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get linux客户端节点地址 
     * @return LinuxClientNodeIp linux客户端节点地址
     */
    public String getLinuxClientNodeIp() {
        return this.LinuxClientNodeIp;
    }

    /**
     * Set linux客户端节点地址
     * @param LinuxClientNodeIp linux客户端节点地址
     */
    public void setLinuxClientNodeIp(String LinuxClientNodeIp) {
        this.LinuxClientNodeIp = LinuxClientNodeIp;
    }

    public LinuxNodeAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinuxNodeAttribute(LinuxNodeAttribute source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.LinuxClientNodeIp != null) {
            this.LinuxClientNodeIp = new String(source.LinuxClientNodeIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "LinuxClientNodeIp", this.LinuxClientNodeIp);

    }
}

