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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportData extends AbstractModel{

    /**
    * 项目ID/域名ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 项目名称/域名。
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 流量总和/带宽最大值，单位分别为bytes，bps。
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 单个资源占总体百分比。
    */
    @SerializedName("Percentage")
    @Expose
    private Float Percentage;

    /**
    * 计费流量总和/计费带宽最大值，单位分别为bytes，bps。
    */
    @SerializedName("BillingValue")
    @Expose
    private Long BillingValue;

    /**
    * 计费数值占总体百分比。
    */
    @SerializedName("BillingPercentage")
    @Expose
    private Float BillingPercentage;

    /**
     * Get 项目ID/域名ID。 
     * @return ResourceId 项目ID/域名ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 项目ID/域名ID。
     * @param ResourceId 项目ID/域名ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 项目名称/域名。 
     * @return Resource 项目名称/域名。
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 项目名称/域名。
     * @param Resource 项目名称/域名。
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 流量总和/带宽最大值，单位分别为bytes，bps。 
     * @return Value 流量总和/带宽最大值，单位分别为bytes，bps。
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 流量总和/带宽最大值，单位分别为bytes，bps。
     * @param Value 流量总和/带宽最大值，单位分别为bytes，bps。
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 单个资源占总体百分比。 
     * @return Percentage 单个资源占总体百分比。
     */
    public Float getPercentage() {
        return this.Percentage;
    }

    /**
     * Set 单个资源占总体百分比。
     * @param Percentage 单个资源占总体百分比。
     */
    public void setPercentage(Float Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Get 计费流量总和/计费带宽最大值，单位分别为bytes，bps。 
     * @return BillingValue 计费流量总和/计费带宽最大值，单位分别为bytes，bps。
     */
    public Long getBillingValue() {
        return this.BillingValue;
    }

    /**
     * Set 计费流量总和/计费带宽最大值，单位分别为bytes，bps。
     * @param BillingValue 计费流量总和/计费带宽最大值，单位分别为bytes，bps。
     */
    public void setBillingValue(Long BillingValue) {
        this.BillingValue = BillingValue;
    }

    /**
     * Get 计费数值占总体百分比。 
     * @return BillingPercentage 计费数值占总体百分比。
     */
    public Float getBillingPercentage() {
        return this.BillingPercentage;
    }

    /**
     * Set 计费数值占总体百分比。
     * @param BillingPercentage 计费数值占总体百分比。
     */
    public void setBillingPercentage(Float BillingPercentage) {
        this.BillingPercentage = BillingPercentage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);
        this.setParamSimple(map, prefix + "BillingValue", this.BillingValue);
        this.setParamSimple(map, prefix + "BillingPercentage", this.BillingPercentage);

    }
}

