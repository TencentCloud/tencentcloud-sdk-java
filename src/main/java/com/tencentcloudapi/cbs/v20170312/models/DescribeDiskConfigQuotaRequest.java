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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiskConfigQuotaRequest extends AbstractModel {

    /**
    * 查询类别，取值范围。<br> INQUIRY_CBS_CONFIG：查询云盘配置列表<br> INQUIRY_CVM_CONFIG：查询云盘与实例搭配的配置列表。
    */
    @SerializedName("InquiryType")
    @Expose
    private String InquiryType;

    /**
    * 付费模式。取值范围：<br> PREPAID：预付费<br> POSTPAID_BY_HOUR：后付费。
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * 按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
    */
    @SerializedName("InstanceFamilies")
    @Expose
    private String [] InstanceFamilies;

    /**
    * 硬盘介质类型。取值范围：<br> CLOUD_BASIC：表示普通云硬盘<br> CLOUD_PREMIUM：表示高性能云硬盘<br> CLOUD_SSD：表示SSD云硬盘<br> CLOUD_HSSD：表示增强型SSD云硬盘。
    */
    @SerializedName("DiskTypes")
    @Expose
    private String [] DiskTypes;

    /**
    * 查询一个或多个[可用区](/document/product/213/15753#ZoneInfo)下的配置。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 实例内存大小,单位GB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 系统盘或数据盘。取值范围：<br> SYSTEM_DISK：表示系统盘<br> DATA_DISK：表示数据盘。
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * 实例CPU核数。
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 专用集群ID。
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
     * Get 查询类别，取值范围。<br> INQUIRY_CBS_CONFIG：查询云盘配置列表<br> INQUIRY_CVM_CONFIG：查询云盘与实例搭配的配置列表。 
     * @return InquiryType 查询类别，取值范围。<br> INQUIRY_CBS_CONFIG：查询云盘配置列表<br> INQUIRY_CVM_CONFIG：查询云盘与实例搭配的配置列表。
     */
    public String getInquiryType() {
        return this.InquiryType;
    }

    /**
     * Set 查询类别，取值范围。<br> INQUIRY_CBS_CONFIG：查询云盘配置列表<br> INQUIRY_CVM_CONFIG：查询云盘与实例搭配的配置列表。
     * @param InquiryType 查询类别，取值范围。<br> INQUIRY_CBS_CONFIG：查询云盘配置列表<br> INQUIRY_CVM_CONFIG：查询云盘与实例搭配的配置列表。
     */
    public void setInquiryType(String InquiryType) {
        this.InquiryType = InquiryType;
    }

    /**
     * Get 付费模式。取值范围：<br> PREPAID：预付费<br> POSTPAID_BY_HOUR：后付费。 
     * @return DiskChargeType 付费模式。取值范围：<br> PREPAID：预付费<br> POSTPAID_BY_HOUR：后付费。
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set 付费模式。取值范围：<br> PREPAID：预付费<br> POSTPAID_BY_HOUR：后付费。
     * @param DiskChargeType 付费模式。取值范围：<br> PREPAID：预付费<br> POSTPAID_BY_HOUR：后付费。
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get 按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。详见[实例类型](https://cloud.tencent.com/document/product/213/11518) 
     * @return InstanceFamilies 按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
     */
    public String [] getInstanceFamilies() {
        return this.InstanceFamilies;
    }

    /**
     * Set 按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
     * @param InstanceFamilies 按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
     */
    public void setInstanceFamilies(String [] InstanceFamilies) {
        this.InstanceFamilies = InstanceFamilies;
    }

    /**
     * Get 硬盘介质类型。取值范围：<br> CLOUD_BASIC：表示普通云硬盘<br> CLOUD_PREMIUM：表示高性能云硬盘<br> CLOUD_SSD：表示SSD云硬盘<br> CLOUD_HSSD：表示增强型SSD云硬盘。 
     * @return DiskTypes 硬盘介质类型。取值范围：<br> CLOUD_BASIC：表示普通云硬盘<br> CLOUD_PREMIUM：表示高性能云硬盘<br> CLOUD_SSD：表示SSD云硬盘<br> CLOUD_HSSD：表示增强型SSD云硬盘。
     */
    public String [] getDiskTypes() {
        return this.DiskTypes;
    }

    /**
     * Set 硬盘介质类型。取值范围：<br> CLOUD_BASIC：表示普通云硬盘<br> CLOUD_PREMIUM：表示高性能云硬盘<br> CLOUD_SSD：表示SSD云硬盘<br> CLOUD_HSSD：表示增强型SSD云硬盘。
     * @param DiskTypes 硬盘介质类型。取值范围：<br> CLOUD_BASIC：表示普通云硬盘<br> CLOUD_PREMIUM：表示高性能云硬盘<br> CLOUD_SSD：表示SSD云硬盘<br> CLOUD_HSSD：表示增强型SSD云硬盘。
     */
    public void setDiskTypes(String [] DiskTypes) {
        this.DiskTypes = DiskTypes;
    }

    /**
     * Get 查询一个或多个[可用区](/document/product/213/15753#ZoneInfo)下的配置。 
     * @return Zones 查询一个或多个[可用区](/document/product/213/15753#ZoneInfo)下的配置。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 查询一个或多个[可用区](/document/product/213/15753#ZoneInfo)下的配置。
     * @param Zones 查询一个或多个[可用区](/document/product/213/15753#ZoneInfo)下的配置。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 实例内存大小,单位GB。 
     * @return Memory 实例内存大小,单位GB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小,单位GB。
     * @param Memory 实例内存大小,单位GB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 系统盘或数据盘。取值范围：<br> SYSTEM_DISK：表示系统盘<br> DATA_DISK：表示数据盘。 
     * @return DiskUsage 系统盘或数据盘。取值范围：<br> SYSTEM_DISK：表示系统盘<br> DATA_DISK：表示数据盘。
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set 系统盘或数据盘。取值范围：<br> SYSTEM_DISK：表示系统盘<br> DATA_DISK：表示数据盘。
     * @param DiskUsage 系统盘或数据盘。取值范围：<br> SYSTEM_DISK：表示系统盘<br> DATA_DISK：表示数据盘。
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get 实例CPU核数。 
     * @return CPU 实例CPU核数。
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set 实例CPU核数。
     * @param CPU 实例CPU核数。
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 专用集群ID。 
     * @return DedicatedClusterId 专用集群ID。
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set 专用集群ID。
     * @param DedicatedClusterId 专用集群ID。
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    public DescribeDiskConfigQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskConfigQuotaRequest(DescribeDiskConfigQuotaRequest source) {
        if (source.InquiryType != null) {
            this.InquiryType = new String(source.InquiryType);
        }
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.InstanceFamilies != null) {
            this.InstanceFamilies = new String[source.InstanceFamilies.length];
            for (int i = 0; i < source.InstanceFamilies.length; i++) {
                this.InstanceFamilies[i] = new String(source.InstanceFamilies[i]);
            }
        }
        if (source.DiskTypes != null) {
            this.DiskTypes = new String[source.DiskTypes.length];
            for (int i = 0; i < source.DiskTypes.length; i++) {
                this.DiskTypes[i] = new String(source.DiskTypes[i]);
            }
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InquiryType", this.InquiryType);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamArraySimple(map, prefix + "InstanceFamilies.", this.InstanceFamilies);
        this.setParamArraySimple(map, prefix + "DiskTypes.", this.DiskTypes);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);

    }
}

