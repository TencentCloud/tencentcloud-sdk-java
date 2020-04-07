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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateHostsRequest extends AbstractModel{

    /**
    * 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 用于保证请求幂等性的字符串。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
    */
    @SerializedName("HostChargePrepaid")
    @Expose
    private ChargePrepaid HostChargePrepaid;

    /**
    * 实例计费类型。目前仅支持：PREPAID（预付费，即包年包月模式），默认为：'PREPAID'。
    */
    @SerializedName("HostChargeType")
    @Expose
    private String HostChargeType;

    /**
    * CDH实例机型，默认为：'HS1'。
    */
    @SerializedName("HostType")
    @Expose
    private String HostType;

    /**
    * 购买CDH实例数量，默认为：1。
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
     * Get 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。 
     * @return Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     * @param Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 用于保证请求幂等性的字符串。 
     * @return ClientToken 用于保证请求幂等性的字符串。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。
     * @param ClientToken 用于保证请求幂等性的字符串。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。 
     * @return HostChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public ChargePrepaid getHostChargePrepaid() {
        return this.HostChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     * @param HostChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public void setHostChargePrepaid(ChargePrepaid HostChargePrepaid) {
        this.HostChargePrepaid = HostChargePrepaid;
    }

    /**
     * Get 实例计费类型。目前仅支持：PREPAID（预付费，即包年包月模式），默认为：'PREPAID'。 
     * @return HostChargeType 实例计费类型。目前仅支持：PREPAID（预付费，即包年包月模式），默认为：'PREPAID'。
     */
    public String getHostChargeType() {
        return this.HostChargeType;
    }

    /**
     * Set 实例计费类型。目前仅支持：PREPAID（预付费，即包年包月模式），默认为：'PREPAID'。
     * @param HostChargeType 实例计费类型。目前仅支持：PREPAID（预付费，即包年包月模式），默认为：'PREPAID'。
     */
    public void setHostChargeType(String HostChargeType) {
        this.HostChargeType = HostChargeType;
    }

    /**
     * Get CDH实例机型，默认为：'HS1'。 
     * @return HostType CDH实例机型，默认为：'HS1'。
     */
    public String getHostType() {
        return this.HostType;
    }

    /**
     * Set CDH实例机型，默认为：'HS1'。
     * @param HostType CDH实例机型，默认为：'HS1'。
     */
    public void setHostType(String HostType) {
        this.HostType = HostType;
    }

    /**
     * Get 购买CDH实例数量，默认为：1。 
     * @return HostCount 购买CDH实例数量，默认为：1。
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 购买CDH实例数量，默认为：1。
     * @param HostCount 购买CDH实例数量，默认为：1。
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例。 
     * @return TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例。
     * @param TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "HostChargePrepaid.", this.HostChargePrepaid);
        this.setParamSimple(map, prefix + "HostChargeType", this.HostChargeType);
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

