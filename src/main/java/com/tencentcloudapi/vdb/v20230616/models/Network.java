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
package com.tencentcloudapi.vdb.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Network extends AbstractModel {

    /**
    * VpcId(VPC网络下有效)
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网Id(VPC网络下有效)。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 内网访问IP。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 内网访问Port。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 旧 ip 保留时长，单位天
    */
    @SerializedName("PreserveDuration")
    @Expose
    private Long PreserveDuration;

    /**
    * 旧 ip 到期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get VpcId(VPC网络下有效) 
     * @return VpcId VpcId(VPC网络下有效)
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VpcId(VPC网络下有效)
     * @param VpcId VpcId(VPC网络下有效)
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网Id(VPC网络下有效)。 
     * @return SubnetId 子网Id(VPC网络下有效)。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网Id(VPC网络下有效)。
     * @param SubnetId 子网Id(VPC网络下有效)。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 内网访问IP。 
     * @return Vip 内网访问IP。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 内网访问IP。
     * @param Vip 内网访问IP。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 内网访问Port。 
     * @return Port 内网访问Port。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 内网访问Port。
     * @param Port 内网访问Port。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 旧 ip 保留时长，单位天 
     * @return PreserveDuration 旧 ip 保留时长，单位天
     */
    public Long getPreserveDuration() {
        return this.PreserveDuration;
    }

    /**
     * Set 旧 ip 保留时长，单位天
     * @param PreserveDuration 旧 ip 保留时长，单位天
     */
    public void setPreserveDuration(Long PreserveDuration) {
        this.PreserveDuration = PreserveDuration;
    }

    /**
     * Get 旧 ip 到期时间 
     * @return ExpireTime 旧 ip 到期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 旧 ip 到期时间
     * @param ExpireTime 旧 ip 到期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public Network() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Network(Network source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.PreserveDuration != null) {
            this.PreserveDuration = new Long(source.PreserveDuration);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "PreserveDuration", this.PreserveDuration);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

