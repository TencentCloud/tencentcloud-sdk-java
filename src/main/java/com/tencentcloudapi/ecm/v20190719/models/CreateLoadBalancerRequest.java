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

public class CreateLoadBalancerRequest extends AbstractModel{

    /**
    * ECM区域，形如ap-xian-ecm。
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 负载均衡实例的网络类型。目前只支持传入OPEN，表示公网属性。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通。
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡后端目标设备所属的网络 ID，如vpc-12345678。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 创建负载均衡的个数，默认值 1。
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * 负载均衡的带宽限制等信息。
    */
    @SerializedName("InternetAccessible")
    @Expose
    private LoadBalancerInternetAccessible InternetAccessible;

    /**
    * 标签。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 安全组。
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
     * Get ECM区域，形如ap-xian-ecm。 
     * @return EcmRegion ECM区域，形如ap-xian-ecm。
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM区域，形如ap-xian-ecm。
     * @param EcmRegion ECM区域，形如ap-xian-ecm。
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get 负载均衡实例的网络类型。目前只支持传入OPEN，表示公网属性。 
     * @return LoadBalancerType 负载均衡实例的网络类型。目前只支持传入OPEN，表示公网属性。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡实例的网络类型。目前只支持传入OPEN，表示公网属性。
     * @param LoadBalancerType 负载均衡实例的网络类型。目前只支持传入OPEN，表示公网属性。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通。 
     * @return VipIsp CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通。
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通。
     * @param VipIsp CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通。
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。 
     * @return LoadBalancerName 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
     * @param LoadBalancerName 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 负载均衡后端目标设备所属的网络 ID，如vpc-12345678。 
     * @return VpcId 负载均衡后端目标设备所属的网络 ID，如vpc-12345678。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 负载均衡后端目标设备所属的网络 ID，如vpc-12345678。
     * @param VpcId 负载均衡后端目标设备所属的网络 ID，如vpc-12345678。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 创建负载均衡的个数，默认值 1。 
     * @return Number 创建负载均衡的个数，默认值 1。
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 创建负载均衡的个数，默认值 1。
     * @param Number 创建负载均衡的个数，默认值 1。
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get 负载均衡的带宽限制等信息。 
     * @return InternetAccessible 负载均衡的带宽限制等信息。
     */
    public LoadBalancerInternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set 负载均衡的带宽限制等信息。
     * @param InternetAccessible 负载均衡的带宽限制等信息。
     */
    public void setInternetAccessible(LoadBalancerInternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get 标签。 
     * @return Tags 标签。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签。
     * @param Tags 标签。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 安全组。 
     * @return SecurityGroups 安全组。
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set 安全组。
     * @param SecurityGroups 安全组。
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    public CreateLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancerRequest(CreateLoadBalancerRequest source) {
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.VipIsp != null) {
            this.VipIsp = new String(source.VipIsp);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new LoadBalancerInternetAccessible(source.InternetAccessible);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);

    }
}

