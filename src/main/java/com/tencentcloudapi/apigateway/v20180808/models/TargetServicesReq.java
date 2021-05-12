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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetServicesReq extends AbstractModel{

    /**
    * vm ip
    */
    @SerializedName("VmIp")
    @Expose
    private String VmIp;

    /**
    * vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vm port
    */
    @SerializedName("VmPort")
    @Expose
    private Long VmPort;

    /**
    * cvm所在宿主机ip
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * docker ip
    */
    @SerializedName("DockerIp")
    @Expose
    private String DockerIp;

    /**
     * Get vm ip 
     * @return VmIp vm ip
     */
    public String getVmIp() {
        return this.VmIp;
    }

    /**
     * Set vm ip
     * @param VmIp vm ip
     */
    public void setVmIp(String VmIp) {
        this.VmIp = VmIp;
    }

    /**
     * Get vpc id 
     * @return VpcId vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
     * @param VpcId vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vm port 
     * @return VmPort vm port
     */
    public Long getVmPort() {
        return this.VmPort;
    }

    /**
     * Set vm port
     * @param VmPort vm port
     */
    public void setVmPort(Long VmPort) {
        this.VmPort = VmPort;
    }

    /**
     * Get cvm所在宿主机ip 
     * @return HostIp cvm所在宿主机ip
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set cvm所在宿主机ip
     * @param HostIp cvm所在宿主机ip
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get docker ip 
     * @return DockerIp docker ip
     */
    public String getDockerIp() {
        return this.DockerIp;
    }

    /**
     * Set docker ip
     * @param DockerIp docker ip
     */
    public void setDockerIp(String DockerIp) {
        this.DockerIp = DockerIp;
    }

    public TargetServicesReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetServicesReq(TargetServicesReq source) {
        if (source.VmIp != null) {
            this.VmIp = new String(source.VmIp);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VmPort != null) {
            this.VmPort = new Long(source.VmPort);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.DockerIp != null) {
            this.DockerIp = new String(source.DockerIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VmIp", this.VmIp);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VmPort", this.VmPort);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "DockerIp", this.DockerIp);

    }
}

