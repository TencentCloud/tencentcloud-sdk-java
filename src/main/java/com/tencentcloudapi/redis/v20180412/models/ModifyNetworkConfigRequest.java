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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkConfigRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 操作类型：changeVip——修改实例VIP；changeVpc——修改实例子网；changeBaseToVpc——基础网络转VPC网络
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * VIP地址，changeVip的时候填写，不填则默认分配
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 私有网络ID，changeVpc、changeBaseToVpc的时候需要提供
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID，changeVpc、changeBaseToVpc的时候需要提供
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 原VIP保留时间，单位：天，注：需要最新版SDK，否则原VIP立即释放，查看SDK版本，详见 [SDK中心](https://cloud.tencent.com/document/sdk)
    */
    @SerializedName("Recycle")
    @Expose
    private Long Recycle;

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
     * Get 操作类型：changeVip——修改实例VIP；changeVpc——修改实例子网；changeBaseToVpc——基础网络转VPC网络 
     * @return Operation 操作类型：changeVip——修改实例VIP；changeVpc——修改实例子网；changeBaseToVpc——基础网络转VPC网络
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型：changeVip——修改实例VIP；changeVpc——修改实例子网；changeBaseToVpc——基础网络转VPC网络
     * @param Operation 操作类型：changeVip——修改实例VIP；changeVpc——修改实例子网；changeBaseToVpc——基础网络转VPC网络
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get VIP地址，changeVip的时候填写，不填则默认分配 
     * @return Vip VIP地址，changeVip的时候填写，不填则默认分配
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VIP地址，changeVip的时候填写，不填则默认分配
     * @param Vip VIP地址，changeVip的时候填写，不填则默认分配
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 私有网络ID，changeVpc、changeBaseToVpc的时候需要提供 
     * @return VpcId 私有网络ID，changeVpc、changeBaseToVpc的时候需要提供
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，changeVpc、changeBaseToVpc的时候需要提供
     * @param VpcId 私有网络ID，changeVpc、changeBaseToVpc的时候需要提供
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID，changeVpc、changeBaseToVpc的时候需要提供 
     * @return SubnetId 子网ID，changeVpc、changeBaseToVpc的时候需要提供
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID，changeVpc、changeBaseToVpc的时候需要提供
     * @param SubnetId 子网ID，changeVpc、changeBaseToVpc的时候需要提供
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 原VIP保留时间，单位：天，注：需要最新版SDK，否则原VIP立即释放，查看SDK版本，详见 [SDK中心](https://cloud.tencent.com/document/sdk) 
     * @return Recycle 原VIP保留时间，单位：天，注：需要最新版SDK，否则原VIP立即释放，查看SDK版本，详见 [SDK中心](https://cloud.tencent.com/document/sdk)
     */
    public Long getRecycle() {
        return this.Recycle;
    }

    /**
     * Set 原VIP保留时间，单位：天，注：需要最新版SDK，否则原VIP立即释放，查看SDK版本，详见 [SDK中心](https://cloud.tencent.com/document/sdk)
     * @param Recycle 原VIP保留时间，单位：天，注：需要最新版SDK，否则原VIP立即释放，查看SDK版本，详见 [SDK中心](https://cloud.tencent.com/document/sdk)
     */
    public void setRecycle(Long Recycle) {
        this.Recycle = Recycle;
    }

    public ModifyNetworkConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkConfigRequest(ModifyNetworkConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Recycle != null) {
            this.Recycle = new Long(source.Recycle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Recycle", this.Recycle);

    }
}

