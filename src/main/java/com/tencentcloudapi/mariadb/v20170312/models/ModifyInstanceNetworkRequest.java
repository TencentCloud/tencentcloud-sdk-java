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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceNetworkRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 希望转到的VPC网络的VpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 希望转到的VPC网络的子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 如果需要指定VIP，填上该字段
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 如果需要指定VIPv6，填上该字段
    */
    @SerializedName("Vipv6")
    @Expose
    private String Vipv6;

    /**
    * VIP保留时长，单位小时，取值范围（0~168），0表示立即释放，有一分钟释放延迟。不传此参数，默认24小时释放VIP。
    */
    @SerializedName("VipReleaseDelay")
    @Expose
    private Long VipReleaseDelay;

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
     * Get 希望转到的VPC网络的VpcId 
     * @return VpcId 希望转到的VPC网络的VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 希望转到的VPC网络的VpcId
     * @param VpcId 希望转到的VPC网络的VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 希望转到的VPC网络的子网ID 
     * @return SubnetId 希望转到的VPC网络的子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 希望转到的VPC网络的子网ID
     * @param SubnetId 希望转到的VPC网络的子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 如果需要指定VIP，填上该字段 
     * @return Vip 如果需要指定VIP，填上该字段
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 如果需要指定VIP，填上该字段
     * @param Vip 如果需要指定VIP，填上该字段
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 如果需要指定VIPv6，填上该字段 
     * @return Vipv6 如果需要指定VIPv6，填上该字段
     */
    public String getVipv6() {
        return this.Vipv6;
    }

    /**
     * Set 如果需要指定VIPv6，填上该字段
     * @param Vipv6 如果需要指定VIPv6，填上该字段
     */
    public void setVipv6(String Vipv6) {
        this.Vipv6 = Vipv6;
    }

    /**
     * Get VIP保留时长，单位小时，取值范围（0~168），0表示立即释放，有一分钟释放延迟。不传此参数，默认24小时释放VIP。 
     * @return VipReleaseDelay VIP保留时长，单位小时，取值范围（0~168），0表示立即释放，有一分钟释放延迟。不传此参数，默认24小时释放VIP。
     */
    public Long getVipReleaseDelay() {
        return this.VipReleaseDelay;
    }

    /**
     * Set VIP保留时长，单位小时，取值范围（0~168），0表示立即释放，有一分钟释放延迟。不传此参数，默认24小时释放VIP。
     * @param VipReleaseDelay VIP保留时长，单位小时，取值范围（0~168），0表示立即释放，有一分钟释放延迟。不传此参数，默认24小时释放VIP。
     */
    public void setVipReleaseDelay(Long VipReleaseDelay) {
        this.VipReleaseDelay = VipReleaseDelay;
    }

    public ModifyInstanceNetworkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceNetworkRequest(ModifyInstanceNetworkRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vipv6 != null) {
            this.Vipv6 = new String(source.Vipv6);
        }
        if (source.VipReleaseDelay != null) {
            this.VipReleaseDelay = new Long(source.VipReleaseDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vipv6", this.Vipv6);
        this.setParamSimple(map, prefix + "VipReleaseDelay", this.VipReleaseDelay);

    }
}

