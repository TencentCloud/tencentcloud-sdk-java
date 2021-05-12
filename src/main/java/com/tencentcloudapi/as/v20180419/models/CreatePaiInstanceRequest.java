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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePaiInstanceRequest extends AbstractModel{

    /**
    * PAI实例的域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 公网带宽相关信息设置。
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 启动脚本的base64编码字符串。
    */
    @SerializedName("InitScript")
    @Expose
    private String InitScript;

    /**
    * 可用区列表。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * VPC ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网列表。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 实例显示名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例机型列表。
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * 实例登录设置。
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * 实例计费类型。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
     * Get PAI实例的域名。 
     * @return DomainName PAI实例的域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set PAI实例的域名。
     * @param DomainName PAI实例的域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 公网带宽相关信息设置。 
     * @return InternetAccessible 公网带宽相关信息设置。
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set 公网带宽相关信息设置。
     * @param InternetAccessible 公网带宽相关信息设置。
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get 启动脚本的base64编码字符串。 
     * @return InitScript 启动脚本的base64编码字符串。
     */
    public String getInitScript() {
        return this.InitScript;
    }

    /**
     * Set 启动脚本的base64编码字符串。
     * @param InitScript 启动脚本的base64编码字符串。
     */
    public void setInitScript(String InitScript) {
        this.InitScript = InitScript;
    }

    /**
     * Get 可用区列表。 
     * @return Zones 可用区列表。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 可用区列表。
     * @param Zones 可用区列表。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get VPC ID。 
     * @return VpcId VPC ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID。
     * @param VpcId VPC ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网列表。 
     * @return SubnetIds 子网列表。
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网列表。
     * @param SubnetIds 子网列表。
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 实例显示名称。 
     * @return InstanceName 实例显示名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例显示名称。
     * @param InstanceName 实例显示名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例机型列表。 
     * @return InstanceTypes 实例机型列表。
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set 实例机型列表。
     * @param InstanceTypes 实例机型列表。
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get 实例登录设置。 
     * @return LoginSettings 实例登录设置。
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set 实例登录设置。
     * @param LoginSettings 实例登录设置。
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get 实例计费类型。 
     * @return InstanceChargeType 实例计费类型。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费类型。
     * @param InstanceChargeType 实例计费类型。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。 
     * @return InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     * @param InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    public CreatePaiInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePaiInstanceRequest(CreatePaiInstanceRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.InitScript != null) {
            this.InitScript = new String(source.InitScript);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InitScript", this.InitScript);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);

    }
}

