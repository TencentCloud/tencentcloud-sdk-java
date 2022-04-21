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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceNetworkAddressRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 原IP保留时长，单位为分钟；原IP会在约定时间后释放，在释放前原IP和新IP均可访问；0表示立即回收原IP
    */
    @SerializedName("OldIpExpiredTime")
    @Expose
    private Long OldIpExpiredTime;

    /**
    * 切换后IP地址的归属私有网络统一ID，若为基础网络，该字段为空
    */
    @SerializedName("NewUniqVpcId")
    @Expose
    private String NewUniqVpcId;

    /**
    * 切换后IP地址的归属子网统一ID，若为基础网络，该字段为空
    */
    @SerializedName("NewUniqSubnetId")
    @Expose
    private String NewUniqSubnetId;

    /**
    * 待修改IP信息
    */
    @SerializedName("NetworkAddresses")
    @Expose
    private ModifyNetworkAddress [] NetworkAddresses;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 原IP保留时长，单位为分钟；原IP会在约定时间后释放，在释放前原IP和新IP均可访问；0表示立即回收原IP 
     * @return OldIpExpiredTime 原IP保留时长，单位为分钟；原IP会在约定时间后释放，在释放前原IP和新IP均可访问；0表示立即回收原IP
     */
    public Long getOldIpExpiredTime() {
        return this.OldIpExpiredTime;
    }

    /**
     * Set 原IP保留时长，单位为分钟；原IP会在约定时间后释放，在释放前原IP和新IP均可访问；0表示立即回收原IP
     * @param OldIpExpiredTime 原IP保留时长，单位为分钟；原IP会在约定时间后释放，在释放前原IP和新IP均可访问；0表示立即回收原IP
     */
    public void setOldIpExpiredTime(Long OldIpExpiredTime) {
        this.OldIpExpiredTime = OldIpExpiredTime;
    }

    /**
     * Get 切换后IP地址的归属私有网络统一ID，若为基础网络，该字段为空 
     * @return NewUniqVpcId 切换后IP地址的归属私有网络统一ID，若为基础网络，该字段为空
     */
    public String getNewUniqVpcId() {
        return this.NewUniqVpcId;
    }

    /**
     * Set 切换后IP地址的归属私有网络统一ID，若为基础网络，该字段为空
     * @param NewUniqVpcId 切换后IP地址的归属私有网络统一ID，若为基础网络，该字段为空
     */
    public void setNewUniqVpcId(String NewUniqVpcId) {
        this.NewUniqVpcId = NewUniqVpcId;
    }

    /**
     * Get 切换后IP地址的归属子网统一ID，若为基础网络，该字段为空 
     * @return NewUniqSubnetId 切换后IP地址的归属子网统一ID，若为基础网络，该字段为空
     */
    public String getNewUniqSubnetId() {
        return this.NewUniqSubnetId;
    }

    /**
     * Set 切换后IP地址的归属子网统一ID，若为基础网络，该字段为空
     * @param NewUniqSubnetId 切换后IP地址的归属子网统一ID，若为基础网络，该字段为空
     */
    public void setNewUniqSubnetId(String NewUniqSubnetId) {
        this.NewUniqSubnetId = NewUniqSubnetId;
    }

    /**
     * Get 待修改IP信息 
     * @return NetworkAddresses 待修改IP信息
     */
    public ModifyNetworkAddress [] getNetworkAddresses() {
        return this.NetworkAddresses;
    }

    /**
     * Set 待修改IP信息
     * @param NetworkAddresses 待修改IP信息
     */
    public void setNetworkAddresses(ModifyNetworkAddress [] NetworkAddresses) {
        this.NetworkAddresses = NetworkAddresses;
    }

    public ModifyDBInstanceNetworkAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceNetworkAddressRequest(ModifyDBInstanceNetworkAddressRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OldIpExpiredTime != null) {
            this.OldIpExpiredTime = new Long(source.OldIpExpiredTime);
        }
        if (source.NewUniqVpcId != null) {
            this.NewUniqVpcId = new String(source.NewUniqVpcId);
        }
        if (source.NewUniqSubnetId != null) {
            this.NewUniqSubnetId = new String(source.NewUniqSubnetId);
        }
        if (source.NetworkAddresses != null) {
            this.NetworkAddresses = new ModifyNetworkAddress[source.NetworkAddresses.length];
            for (int i = 0; i < source.NetworkAddresses.length; i++) {
                this.NetworkAddresses[i] = new ModifyNetworkAddress(source.NetworkAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OldIpExpiredTime", this.OldIpExpiredTime);
        this.setParamSimple(map, prefix + "NewUniqVpcId", this.NewUniqVpcId);
        this.setParamSimple(map, prefix + "NewUniqSubnetId", this.NewUniqSubnetId);
        this.setParamArrayObj(map, prefix + "NetworkAddresses.", this.NetworkAddresses);

    }
}

