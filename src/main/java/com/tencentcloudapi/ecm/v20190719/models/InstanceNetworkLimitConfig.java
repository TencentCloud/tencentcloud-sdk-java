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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNetworkLimitConfig extends AbstractModel{

    /**
    * cpu核数
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * 网卡数量限制
    */
    @SerializedName("NetworkInterfaceLimit")
    @Expose
    private Long NetworkInterfaceLimit;

    /**
    * 每张网卡内网ip数量限制
    */
    @SerializedName("InnerIpPerNetworkInterface")
    @Expose
    private Long InnerIpPerNetworkInterface;

    /**
    * 每个实例的外网ip限制
    */
    @SerializedName("PublicIpPerInstance")
    @Expose
    private Long PublicIpPerInstance;

    /**
     * Get cpu核数 
     * @return CpuNum cpu核数
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set cpu核数
     * @param CpuNum cpu核数
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get 网卡数量限制 
     * @return NetworkInterfaceLimit 网卡数量限制
     */
    public Long getNetworkInterfaceLimit() {
        return this.NetworkInterfaceLimit;
    }

    /**
     * Set 网卡数量限制
     * @param NetworkInterfaceLimit 网卡数量限制
     */
    public void setNetworkInterfaceLimit(Long NetworkInterfaceLimit) {
        this.NetworkInterfaceLimit = NetworkInterfaceLimit;
    }

    /**
     * Get 每张网卡内网ip数量限制 
     * @return InnerIpPerNetworkInterface 每张网卡内网ip数量限制
     */
    public Long getInnerIpPerNetworkInterface() {
        return this.InnerIpPerNetworkInterface;
    }

    /**
     * Set 每张网卡内网ip数量限制
     * @param InnerIpPerNetworkInterface 每张网卡内网ip数量限制
     */
    public void setInnerIpPerNetworkInterface(Long InnerIpPerNetworkInterface) {
        this.InnerIpPerNetworkInterface = InnerIpPerNetworkInterface;
    }

    /**
     * Get 每个实例的外网ip限制 
     * @return PublicIpPerInstance 每个实例的外网ip限制
     */
    public Long getPublicIpPerInstance() {
        return this.PublicIpPerInstance;
    }

    /**
     * Set 每个实例的外网ip限制
     * @param PublicIpPerInstance 每个实例的外网ip限制
     */
    public void setPublicIpPerInstance(Long PublicIpPerInstance) {
        this.PublicIpPerInstance = PublicIpPerInstance;
    }

    public InstanceNetworkLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNetworkLimitConfig(InstanceNetworkLimitConfig source) {
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.NetworkInterfaceLimit != null) {
            this.NetworkInterfaceLimit = new Long(source.NetworkInterfaceLimit);
        }
        if (source.InnerIpPerNetworkInterface != null) {
            this.InnerIpPerNetworkInterface = new Long(source.InnerIpPerNetworkInterface);
        }
        if (source.PublicIpPerInstance != null) {
            this.PublicIpPerInstance = new Long(source.PublicIpPerInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "NetworkInterfaceLimit", this.NetworkInterfaceLimit);
        this.setParamSimple(map, prefix + "InnerIpPerNetworkInterface", this.InnerIpPerNetworkInterface);
        this.setParamSimple(map, prefix + "PublicIpPerInstance", this.PublicIpPerInstance);

    }
}

