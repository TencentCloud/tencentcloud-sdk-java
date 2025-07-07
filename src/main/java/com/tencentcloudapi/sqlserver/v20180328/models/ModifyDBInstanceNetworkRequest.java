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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceNetworkRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 新VPC网络Id
    */
    @SerializedName("NewVpcId")
    @Expose
    private String NewVpcId;

    /**
    * 新子网Id
    */
    @SerializedName("NewSubnetId")
    @Expose
    private String NewSubnetId;

    /**
    * 原vip保留时长，单位小时，默认为0，代表立即回收，最大为168小时
    */
    @SerializedName("OldIpRetainTime")
    @Expose
    private Long OldIpRetainTime;

    /**
    * 指定VIP地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 目标节点，0-修改主节点网络，1-修改备节点网络，默认取值0

    */
    @SerializedName("DRNetwork")
    @Expose
    private Long DRNetwork;

    /**
    * 备机资源ID。当DRNetwork = 1时必填
    */
    @SerializedName("DrInstanceId")
    @Expose
    private String DrInstanceId;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 新VPC网络Id 
     * @return NewVpcId 新VPC网络Id
     */
    public String getNewVpcId() {
        return this.NewVpcId;
    }

    /**
     * Set 新VPC网络Id
     * @param NewVpcId 新VPC网络Id
     */
    public void setNewVpcId(String NewVpcId) {
        this.NewVpcId = NewVpcId;
    }

    /**
     * Get 新子网Id 
     * @return NewSubnetId 新子网Id
     */
    public String getNewSubnetId() {
        return this.NewSubnetId;
    }

    /**
     * Set 新子网Id
     * @param NewSubnetId 新子网Id
     */
    public void setNewSubnetId(String NewSubnetId) {
        this.NewSubnetId = NewSubnetId;
    }

    /**
     * Get 原vip保留时长，单位小时，默认为0，代表立即回收，最大为168小时 
     * @return OldIpRetainTime 原vip保留时长，单位小时，默认为0，代表立即回收，最大为168小时
     */
    public Long getOldIpRetainTime() {
        return this.OldIpRetainTime;
    }

    /**
     * Set 原vip保留时长，单位小时，默认为0，代表立即回收，最大为168小时
     * @param OldIpRetainTime 原vip保留时长，单位小时，默认为0，代表立即回收，最大为168小时
     */
    public void setOldIpRetainTime(Long OldIpRetainTime) {
        this.OldIpRetainTime = OldIpRetainTime;
    }

    /**
     * Get 指定VIP地址 
     * @return Vip 指定VIP地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 指定VIP地址
     * @param Vip 指定VIP地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 目标节点，0-修改主节点网络，1-修改备节点网络，默认取值0
 
     * @return DRNetwork 目标节点，0-修改主节点网络，1-修改备节点网络，默认取值0

     */
    public Long getDRNetwork() {
        return this.DRNetwork;
    }

    /**
     * Set 目标节点，0-修改主节点网络，1-修改备节点网络，默认取值0

     * @param DRNetwork 目标节点，0-修改主节点网络，1-修改备节点网络，默认取值0

     */
    public void setDRNetwork(Long DRNetwork) {
        this.DRNetwork = DRNetwork;
    }

    /**
     * Get 备机资源ID。当DRNetwork = 1时必填 
     * @return DrInstanceId 备机资源ID。当DRNetwork = 1时必填
     */
    public String getDrInstanceId() {
        return this.DrInstanceId;
    }

    /**
     * Set 备机资源ID。当DRNetwork = 1时必填
     * @param DrInstanceId 备机资源ID。当DRNetwork = 1时必填
     */
    public void setDrInstanceId(String DrInstanceId) {
        this.DrInstanceId = DrInstanceId;
    }

    public ModifyDBInstanceNetworkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceNetworkRequest(ModifyDBInstanceNetworkRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NewVpcId != null) {
            this.NewVpcId = new String(source.NewVpcId);
        }
        if (source.NewSubnetId != null) {
            this.NewSubnetId = new String(source.NewSubnetId);
        }
        if (source.OldIpRetainTime != null) {
            this.OldIpRetainTime = new Long(source.OldIpRetainTime);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.DRNetwork != null) {
            this.DRNetwork = new Long(source.DRNetwork);
        }
        if (source.DrInstanceId != null) {
            this.DrInstanceId = new String(source.DrInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NewVpcId", this.NewVpcId);
        this.setParamSimple(map, prefix + "NewSubnetId", this.NewSubnetId);
        this.setParamSimple(map, prefix + "OldIpRetainTime", this.OldIpRetainTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "DRNetwork", this.DRNetwork);
        this.setParamSimple(map, prefix + "DrInstanceId", this.DrInstanceId);

    }
}

