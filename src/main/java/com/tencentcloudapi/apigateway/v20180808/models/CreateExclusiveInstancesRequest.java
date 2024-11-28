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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateExclusiveInstancesRequest extends AbstractModel {

    /**
    * 可用区
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 实例类型：     
basic：            基础版
professional： 专业版
enterprise：     企业版
platium：         铂金版
diamond：       钻石版
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 网络配置
    */
    @SerializedName("NetworkConfig")
    @Expose
    private InstanceNetworkConfig NetworkConfig;

    /**
    * VPC配置
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
    * 付费类型：
POSTPAID：后付费
PREPAID： 预付费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例描述
    */
    @SerializedName("InstanceDescription")
    @Expose
    private String InstanceDescription;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 预付费付费时长：单位是月
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 预付费续费标志：
NOTIFY_AND_MANUAL_RENEW 手动续费
NOTIFY_AND_AUTO_RENEW 自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW 不续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private String AutoRenewFlag;

    /**
     * Get 可用区 
     * @return Zones 可用区
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 可用区
     * @param Zones 可用区
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 实例类型：     
basic：            基础版
professional： 专业版
enterprise：     企业版
platium：         铂金版
diamond：       钻石版 
     * @return InstanceType 实例类型：     
basic：            基础版
professional： 专业版
enterprise：     企业版
platium：         铂金版
diamond：       钻石版
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型：     
basic：            基础版
professional： 专业版
enterprise：     企业版
platium：         铂金版
diamond：       钻石版
     * @param InstanceType 实例类型：     
basic：            基础版
professional： 专业版
enterprise：     企业版
platium：         铂金版
diamond：       钻石版
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 网络配置 
     * @return NetworkConfig 网络配置
     */
    public InstanceNetworkConfig getNetworkConfig() {
        return this.NetworkConfig;
    }

    /**
     * Set 网络配置
     * @param NetworkConfig 网络配置
     */
    public void setNetworkConfig(InstanceNetworkConfig NetworkConfig) {
        this.NetworkConfig = NetworkConfig;
    }

    /**
     * Get VPC配置 
     * @return VpcConfig VPC配置
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set VPC配置
     * @param VpcConfig VPC配置
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get 付费类型：
POSTPAID：后付费
PREPAID： 预付费 
     * @return PayMode 付费类型：
POSTPAID：后付费
PREPAID： 预付费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费类型：
POSTPAID：后付费
PREPAID： 预付费
     * @param PayMode 付费类型：
POSTPAID：后付费
PREPAID： 预付费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例描述 
     * @return InstanceDescription 实例描述
     */
    public String getInstanceDescription() {
        return this.InstanceDescription;
    }

    /**
     * Set 实例描述
     * @param InstanceDescription 实例描述
     */
    public void setInstanceDescription(String InstanceDescription) {
        this.InstanceDescription = InstanceDescription;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 预付费付费时长：单位是月 
     * @return Period 预付费付费时长：单位是月
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 预付费付费时长：单位是月
     * @param Period 预付费付费时长：单位是月
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 预付费续费标志：
NOTIFY_AND_MANUAL_RENEW 手动续费
NOTIFY_AND_AUTO_RENEW 自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW 不续费 
     * @return AutoRenewFlag 预付费续费标志：
NOTIFY_AND_MANUAL_RENEW 手动续费
NOTIFY_AND_AUTO_RENEW 自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW 不续费
     */
    public String getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 预付费续费标志：
NOTIFY_AND_MANUAL_RENEW 手动续费
NOTIFY_AND_AUTO_RENEW 自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW 不续费
     * @param AutoRenewFlag 预付费续费标志：
NOTIFY_AND_MANUAL_RENEW 手动续费
NOTIFY_AND_AUTO_RENEW 自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW 不续费
     */
    public void setAutoRenewFlag(String AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public CreateExclusiveInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExclusiveInstancesRequest(CreateExclusiveInstancesRequest source) {
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.NetworkConfig != null) {
            this.NetworkConfig = new InstanceNetworkConfig(source.NetworkConfig);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new VpcConfig(source.VpcConfig);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceDescription != null) {
            this.InstanceDescription = new String(source.InstanceDescription);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new String(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "NetworkConfig.", this.NetworkConfig);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceDescription", this.InstanceDescription);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

