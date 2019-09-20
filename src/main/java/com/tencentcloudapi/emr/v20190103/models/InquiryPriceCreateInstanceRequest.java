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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateInstanceRequest  extends AbstractModel{

    /**
    * 时间单位
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 时间长度
    */
    @SerializedName("TimeSpan")
    @Expose
    private Integer TimeSpan;

    /**
    * 询价资源描述
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NewResourceSpec ResourceSpec;

    /**
    * 货币种类
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 计费类型
    */
    @SerializedName("PayMode")
    @Expose
    private Integer PayMode;

    /**
    * 是否支持HA， 1 支持，0 不支持
    */
    @SerializedName("SupportHA")
    @Expose
    private Integer SupportHA;

    /**
    * 软件列表
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * 位置信息
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * VPC信息
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
     * 获取时间单位
     * @return TimeUnit 时间单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * 设置时间单位
     * @param TimeUnit 时间单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * 获取时间长度
     * @return TimeSpan 时间长度
     */
    public Integer getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * 设置时间长度
     * @param TimeSpan 时间长度
     */
    public void setTimeSpan(Integer TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * 获取询价资源描述
     * @return ResourceSpec 询价资源描述
     */
    public NewResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * 设置询价资源描述
     * @param ResourceSpec 询价资源描述
     */
    public void setResourceSpec(NewResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * 获取货币种类
     * @return Currency 货币种类
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * 设置货币种类
     * @param Currency 货币种类
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * 获取计费类型
     * @return PayMode 计费类型
     */
    public Integer getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置计费类型
     * @param PayMode 计费类型
     */
    public void setPayMode(Integer PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取是否支持HA， 1 支持，0 不支持
     * @return SupportHA 是否支持HA， 1 支持，0 不支持
     */
    public Integer getSupportHA() {
        return this.SupportHA;
    }

    /**
     * 设置是否支持HA， 1 支持，0 不支持
     * @param SupportHA 是否支持HA， 1 支持，0 不支持
     */
    public void setSupportHA(Integer SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * 获取软件列表
     * @return Software 软件列表
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * 设置软件列表
     * @param Software 软件列表
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * 获取位置信息
     * @return Placement 位置信息
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * 设置位置信息
     * @param Placement 位置信息
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * 获取VPC信息
     * @return VPCSettings VPC信息
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * 设置VPC信息
     * @param VPCSettings VPC信息
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);

    }
}

