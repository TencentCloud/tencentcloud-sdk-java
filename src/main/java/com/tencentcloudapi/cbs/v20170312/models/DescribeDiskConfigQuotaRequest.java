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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiskConfigQuotaRequest  extends AbstractModel{

    /**
    * 查询类别，取值范围。<br><li>INQUIRY_CBS_CONFIG：查询云盘配置列表<br><li>INQUIRY_CVM_CONFIG：查询云盘与实例搭配的配置列表。
    */
    @SerializedName("InquiryType")
    @Expose
    private String InquiryType;

    /**
    * 查询一个或多个[可用区](/document/product/213/15753#ZoneInfo)下的配置。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 付费模式。取值范围：<br><li>PREPAID：预付费<br><li>POSTPAID_BY_HOUR：后付费。
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * 硬盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：表示SSD云硬盘。
    */
    @SerializedName("DiskTypes")
    @Expose
    private String [] DiskTypes;

    /**
    * 系统盘或数据盘。取值范围：<br><li>SYSTEM_DISK：表示系统盘<br><li>DATA_DISK：表示数据盘。
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * 按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
    */
    @SerializedName("InstanceFamilies")
    @Expose
    private String [] InstanceFamilies;

    /**
    * 实例CPU核数。
    */
    @SerializedName("CPU")
    @Expose
    private Integer CPU;

    /**
    * 实例内存大小。
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
     * 获取查询类别，取值范围。<br><li>INQUIRY_CBS_CONFIG：查询云盘配置列表<br><li>INQUIRY_CVM_CONFIG：查询云盘与实例搭配的配置列表。
     * @return InquiryType 查询类别，取值范围。<br><li>INQUIRY_CBS_CONFIG：查询云盘配置列表<br><li>INQUIRY_CVM_CONFIG：查询云盘与实例搭配的配置列表。
     */
    public String getInquiryType() {
        return this.InquiryType;
    }

    /**
     * 设置查询类别，取值范围。<br><li>INQUIRY_CBS_CONFIG：查询云盘配置列表<br><li>INQUIRY_CVM_CONFIG：查询云盘与实例搭配的配置列表。
     * @param InquiryType 查询类别，取值范围。<br><li>INQUIRY_CBS_CONFIG：查询云盘配置列表<br><li>INQUIRY_CVM_CONFIG：查询云盘与实例搭配的配置列表。
     */
    public void setInquiryType(String InquiryType) {
        this.InquiryType = InquiryType;
    }

    /**
     * 获取查询一个或多个[可用区](/document/product/213/15753#ZoneInfo)下的配置。
     * @return Zones 查询一个或多个[可用区](/document/product/213/15753#ZoneInfo)下的配置。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * 设置查询一个或多个[可用区](/document/product/213/15753#ZoneInfo)下的配置。
     * @param Zones 查询一个或多个[可用区](/document/product/213/15753#ZoneInfo)下的配置。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * 获取付费模式。取值范围：<br><li>PREPAID：预付费<br><li>POSTPAID_BY_HOUR：后付费。
     * @return DiskChargeType 付费模式。取值范围：<br><li>PREPAID：预付费<br><li>POSTPAID_BY_HOUR：后付费。
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * 设置付费模式。取值范围：<br><li>PREPAID：预付费<br><li>POSTPAID_BY_HOUR：后付费。
     * @param DiskChargeType 付费模式。取值范围：<br><li>PREPAID：预付费<br><li>POSTPAID_BY_HOUR：后付费。
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * 获取硬盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：表示SSD云硬盘。
     * @return DiskTypes 硬盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：表示SSD云硬盘。
     */
    public String [] getDiskTypes() {
        return this.DiskTypes;
    }

    /**
     * 设置硬盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：表示SSD云硬盘。
     * @param DiskTypes 硬盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：表示SSD云硬盘。
     */
    public void setDiskTypes(String [] DiskTypes) {
        this.DiskTypes = DiskTypes;
    }

    /**
     * 获取系统盘或数据盘。取值范围：<br><li>SYSTEM_DISK：表示系统盘<br><li>DATA_DISK：表示数据盘。
     * @return DiskUsage 系统盘或数据盘。取值范围：<br><li>SYSTEM_DISK：表示系统盘<br><li>DATA_DISK：表示数据盘。
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * 设置系统盘或数据盘。取值范围：<br><li>SYSTEM_DISK：表示系统盘<br><li>DATA_DISK：表示数据盘。
     * @param DiskUsage 系统盘或数据盘。取值范围：<br><li>SYSTEM_DISK：表示系统盘<br><li>DATA_DISK：表示数据盘。
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * 获取按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
     * @return InstanceFamilies 按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
     */
    public String [] getInstanceFamilies() {
        return this.InstanceFamilies;
    }

    /**
     * 设置按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
     * @param InstanceFamilies 按照实例机型系列过滤。实例机型系列形如：S1、I1、M1等。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
     */
    public void setInstanceFamilies(String [] InstanceFamilies) {
        this.InstanceFamilies = InstanceFamilies;
    }

    /**
     * 获取实例CPU核数。
     * @return CPU 实例CPU核数。
     */
    public Integer getCPU() {
        return this.CPU;
    }

    /**
     * 设置实例CPU核数。
     * @param CPU 实例CPU核数。
     */
    public void setCPU(Integer CPU) {
        this.CPU = CPU;
    }

    /**
     * 获取实例内存大小。
     * @return Memory 实例内存大小。
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置实例内存大小。
     * @param Memory 实例内存大小。
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InquiryType", this.InquiryType);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamArraySimple(map, prefix + "DiskTypes.", this.DiskTypes);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamArraySimple(map, prefix + "InstanceFamilies.", this.InstanceFamilies);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);

    }
}

