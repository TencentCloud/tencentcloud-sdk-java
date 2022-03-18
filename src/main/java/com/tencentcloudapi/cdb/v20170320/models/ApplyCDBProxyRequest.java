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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyCDBProxyRequest extends AbstractModel{

    /**
    * 主实例唯一标识ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 私有网络ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 私有网络子网ID
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 代理组节点个数
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 安全组
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * 描述说明，最大支持256位。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 主实例唯一标识ID 
     * @return InstanceId 主实例唯一标识ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 主实例唯一标识ID
     * @param InstanceId 主实例唯一标识ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 私有网络ID 
     * @return UniqVpcId 私有网络ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络ID
     * @param UniqVpcId 私有网络ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 私有网络子网ID 
     * @return UniqSubnetId 私有网络子网ID
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 私有网络子网ID
     * @param UniqSubnetId 私有网络子网ID
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 代理组节点个数 
     * @return ProxyCount 代理组节点个数
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set 代理组节点个数
     * @param ProxyCount 代理组节点个数
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get cpu核数 
     * @return Cpu cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu核数
     * @param Cpu cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存 
     * @return Mem 内存
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存
     * @param Mem 内存
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 安全组 
     * @return SecurityGroup 安全组
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 安全组
     * @param SecurityGroup 安全组
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 描述说明，最大支持256位。 
     * @return Desc 描述说明，最大支持256位。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述说明，最大支持256位。
     * @param Desc 描述说明，最大支持256位。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public ApplyCDBProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyCDBProxyRequest(ApplyCDBProxyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ProxyCount != null) {
            this.ProxyCount = new Long(source.ProxyCount);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ProxyCount", this.ProxyCount);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

