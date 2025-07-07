/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class InquiryPriceCreateDisksRequest extends AbstractModel {

    /**
    * 云硬盘计费类型： <ul>   <li>PREPAID：预付费，即包年包月</li>   <li>POSTPAID_BY_HOUR：按小时后付费</li> </ul>
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * 硬盘介质类型。取值范围： <ul>   <li>CLOUD_PREMIUM：表示高性能云硬盘</li>   <li>CLOUD_SSD：表示SSD云硬盘</li>   <li>CLOUD_HSSD：表示增强型SSD云硬盘</li>   <li>CLOUD_TSSD：表示极速型SSD云硬盘</li> </ul>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 云硬盘大小，单位为GiB。云盘大小取值范围参见云硬盘[产品分类](/document/product/362/2353)的说明。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 云硬盘所属项目ID。该参数可以通过调用[DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 projectId 字段来获取。不填为默认项目。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 购买云硬盘的数量。不填则默认为1。
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * 额外购买的云硬盘性能值，单位MiB/s。仅大小超过460GiB的增强型SSD（CLOUD_HSSD）和极速型SSD（CLOUD_TSSD）云硬盘才支持购买额外性能。
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。<br>创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;

    /**
    * 指定云硬盘备份点配额。
    */
    @SerializedName("DiskBackupQuota")
    @Expose
    private Long DiskBackupQuota;

    /**
     * Get 云硬盘计费类型： <ul>   <li>PREPAID：预付费，即包年包月</li>   <li>POSTPAID_BY_HOUR：按小时后付费</li> </ul> 
     * @return DiskChargeType 云硬盘计费类型： <ul>   <li>PREPAID：预付费，即包年包月</li>   <li>POSTPAID_BY_HOUR：按小时后付费</li> </ul>
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set 云硬盘计费类型： <ul>   <li>PREPAID：预付费，即包年包月</li>   <li>POSTPAID_BY_HOUR：按小时后付费</li> </ul>
     * @param DiskChargeType 云硬盘计费类型： <ul>   <li>PREPAID：预付费，即包年包月</li>   <li>POSTPAID_BY_HOUR：按小时后付费</li> </ul>
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get 硬盘介质类型。取值范围： <ul>   <li>CLOUD_PREMIUM：表示高性能云硬盘</li>   <li>CLOUD_SSD：表示SSD云硬盘</li>   <li>CLOUD_HSSD：表示增强型SSD云硬盘</li>   <li>CLOUD_TSSD：表示极速型SSD云硬盘</li> </ul> 
     * @return DiskType 硬盘介质类型。取值范围： <ul>   <li>CLOUD_PREMIUM：表示高性能云硬盘</li>   <li>CLOUD_SSD：表示SSD云硬盘</li>   <li>CLOUD_HSSD：表示增强型SSD云硬盘</li>   <li>CLOUD_TSSD：表示极速型SSD云硬盘</li> </ul>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 硬盘介质类型。取值范围： <ul>   <li>CLOUD_PREMIUM：表示高性能云硬盘</li>   <li>CLOUD_SSD：表示SSD云硬盘</li>   <li>CLOUD_HSSD：表示增强型SSD云硬盘</li>   <li>CLOUD_TSSD：表示极速型SSD云硬盘</li> </ul>
     * @param DiskType 硬盘介质类型。取值范围： <ul>   <li>CLOUD_PREMIUM：表示高性能云硬盘</li>   <li>CLOUD_SSD：表示SSD云硬盘</li>   <li>CLOUD_HSSD：表示增强型SSD云硬盘</li>   <li>CLOUD_TSSD：表示极速型SSD云硬盘</li> </ul>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 云硬盘大小，单位为GiB。云盘大小取值范围参见云硬盘[产品分类](/document/product/362/2353)的说明。 
     * @return DiskSize 云硬盘大小，单位为GiB。云盘大小取值范围参见云硬盘[产品分类](/document/product/362/2353)的说明。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 云硬盘大小，单位为GiB。云盘大小取值范围参见云硬盘[产品分类](/document/product/362/2353)的说明。
     * @param DiskSize 云硬盘大小，单位为GiB。云盘大小取值范围参见云硬盘[产品分类](/document/product/362/2353)的说明。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 云硬盘所属项目ID。该参数可以通过调用[DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 projectId 字段来获取。不填为默认项目。 
     * @return ProjectId 云硬盘所属项目ID。该参数可以通过调用[DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 projectId 字段来获取。不填为默认项目。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 云硬盘所属项目ID。该参数可以通过调用[DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 projectId 字段来获取。不填为默认项目。
     * @param ProjectId 云硬盘所属项目ID。该参数可以通过调用[DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 projectId 字段来获取。不填为默认项目。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 购买云硬盘的数量。不填则默认为1。 
     * @return DiskCount 购买云硬盘的数量。不填则默认为1。
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set 购买云硬盘的数量。不填则默认为1。
     * @param DiskCount 购买云硬盘的数量。不填则默认为1。
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get 额外购买的云硬盘性能值，单位MiB/s。仅大小超过460GiB的增强型SSD（CLOUD_HSSD）和极速型SSD（CLOUD_TSSD）云硬盘才支持购买额外性能。 
     * @return ThroughputPerformance 额外购买的云硬盘性能值，单位MiB/s。仅大小超过460GiB的增强型SSD（CLOUD_HSSD）和极速型SSD（CLOUD_TSSD）云硬盘才支持购买额外性能。
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set 额外购买的云硬盘性能值，单位MiB/s。仅大小超过460GiB的增强型SSD（CLOUD_HSSD）和极速型SSD（CLOUD_TSSD）云硬盘才支持购买额外性能。
     * @param ThroughputPerformance 额外购买的云硬盘性能值，单位MiB/s。仅大小超过460GiB的增强型SSD（CLOUD_HSSD）和极速型SSD（CLOUD_TSSD）云硬盘才支持购买额外性能。
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    /**
     * Get 预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。<br>创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。 
     * @return DiskChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。<br>创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。<br>创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。
     * @param DiskChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。<br>创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get 指定云硬盘备份点配额。 
     * @return DiskBackupQuota 指定云硬盘备份点配额。
     */
    public Long getDiskBackupQuota() {
        return this.DiskBackupQuota;
    }

    /**
     * Set 指定云硬盘备份点配额。
     * @param DiskBackupQuota 指定云硬盘备份点配额。
     */
    public void setDiskBackupQuota(Long DiskBackupQuota) {
        this.DiskBackupQuota = DiskBackupQuota;
    }

    public InquiryPriceCreateDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateDisksRequest(InquiryPriceCreateDisksRequest source) {
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
        }
        if (source.DiskChargePrepaid != null) {
            this.DiskChargePrepaid = new DiskChargePrepaid(source.DiskChargePrepaid);
        }
        if (source.DiskBackupQuota != null) {
            this.DiskBackupQuota = new Long(source.DiskBackupQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DiskBackupQuota", this.DiskBackupQuota);

    }
}

