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
package com.tencentcloudapi.vdb.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Network extends AbstractModel {

    /**
    * <p>VpcId(VPC网络下有效)</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网Id(VPC网络下有效)。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>内网访问IP。</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>内网访问Port。</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>旧 ip 保留时长，单位天</p>
    */
    @SerializedName("PreserveDuration")
    @Expose
    private Long PreserveDuration;

    /**
    * <p>旧 ip 到期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>是否是ssl网络</p>
    */
    @SerializedName("IsSSL")
    @Expose
    private Boolean IsSSL;

    /**
     * Get <p>VpcId(VPC网络下有效)</p> 
     * @return VpcId <p>VpcId(VPC网络下有效)</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VpcId(VPC网络下有效)</p>
     * @param VpcId <p>VpcId(VPC网络下有效)</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网Id(VPC网络下有效)。</p> 
     * @return SubnetId <p>子网Id(VPC网络下有效)。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网Id(VPC网络下有效)。</p>
     * @param SubnetId <p>子网Id(VPC网络下有效)。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>内网访问IP。</p> 
     * @return Vip <p>内网访问IP。</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>内网访问IP。</p>
     * @param Vip <p>内网访问IP。</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>内网访问Port。</p> 
     * @return Port <p>内网访问Port。</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>内网访问Port。</p>
     * @param Port <p>内网访问Port。</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>旧 ip 保留时长，单位天</p> 
     * @return PreserveDuration <p>旧 ip 保留时长，单位天</p>
     */
    public Long getPreserveDuration() {
        return this.PreserveDuration;
    }

    /**
     * Set <p>旧 ip 保留时长，单位天</p>
     * @param PreserveDuration <p>旧 ip 保留时长，单位天</p>
     */
    public void setPreserveDuration(Long PreserveDuration) {
        this.PreserveDuration = PreserveDuration;
    }

    /**
     * Get <p>旧 ip 到期时间</p> 
     * @return ExpireTime <p>旧 ip 到期时间</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>旧 ip 到期时间</p>
     * @param ExpireTime <p>旧 ip 到期时间</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>是否是ssl网络</p> 
     * @return IsSSL <p>是否是ssl网络</p>
     */
    public Boolean getIsSSL() {
        return this.IsSSL;
    }

    /**
     * Set <p>是否是ssl网络</p>
     * @param IsSSL <p>是否是ssl网络</p>
     */
    public void setIsSSL(Boolean IsSSL) {
        this.IsSSL = IsSSL;
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
        if (source.IsSSL != null) {
            this.IsSSL = new Boolean(source.IsSSL);
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
        this.setParamSimple(map, prefix + "IsSSL", this.IsSSL);

    }
}

