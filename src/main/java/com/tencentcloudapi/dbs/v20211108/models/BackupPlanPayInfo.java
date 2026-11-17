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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupPlanPayInfo extends AbstractModel {

    /**
    * 实例规格。
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * 付费方式。取值：
- postPay：后付费
- prePay：预付费
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 免费额度，单位：字节。取值为 -1 表示不限量。
    */
    @SerializedName("FreeSpace")
    @Expose
    private Long FreeSpace;

    /**
    * 本月计费空间，单位：字节。
    */
    @SerializedName("TotalChargeSpace")
    @Expose
    private Long TotalChargeSpace;

    /**
    * 全量计费空间，单位：字节。
    */
    @SerializedName("FullChargeSpace")
    @Expose
    private Long FullChargeSpace;

    /**
    * 增量计费空间，单位：字节。
    */
    @SerializedName("IncrementChargeSpace")
    @Expose
    private Long IncrementChargeSpace;

    /**
    * 本月全量备份集大小，单位：字节。
    */
    @SerializedName("FullBackupSetSize")
    @Expose
    private Long FullBackupSetSize;

    /**
    * 本月增量备份集大小，单位：字节。
    */
    @SerializedName("IncrementBackupSetSize")
    @Expose
    private Long IncrementBackupSetSize;

    /**
    * 创建时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 统计周期，格式为“开始时间 - 结束时间”。
    */
    @SerializedName("TimeRange")
    @Expose
    private String TimeRange;

    /**
     * Get 实例规格。 
     * @return InstanceClass 实例规格。
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set 实例规格。
     * @param InstanceClass 实例规格。
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
    }

    /**
     * Get 付费方式。取值：
- postPay：后付费
- prePay：预付费 
     * @return PayType 付费方式。取值：
- postPay：后付费
- prePay：预付费
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 付费方式。取值：
- postPay：后付费
- prePay：预付费
     * @param PayType 付费方式。取值：
- postPay：后付费
- prePay：预付费
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 免费额度，单位：字节。取值为 -1 表示不限量。 
     * @return FreeSpace 免费额度，单位：字节。取值为 -1 表示不限量。
     */
    public Long getFreeSpace() {
        return this.FreeSpace;
    }

    /**
     * Set 免费额度，单位：字节。取值为 -1 表示不限量。
     * @param FreeSpace 免费额度，单位：字节。取值为 -1 表示不限量。
     */
    public void setFreeSpace(Long FreeSpace) {
        this.FreeSpace = FreeSpace;
    }

    /**
     * Get 本月计费空间，单位：字节。 
     * @return TotalChargeSpace 本月计费空间，单位：字节。
     */
    public Long getTotalChargeSpace() {
        return this.TotalChargeSpace;
    }

    /**
     * Set 本月计费空间，单位：字节。
     * @param TotalChargeSpace 本月计费空间，单位：字节。
     */
    public void setTotalChargeSpace(Long TotalChargeSpace) {
        this.TotalChargeSpace = TotalChargeSpace;
    }

    /**
     * Get 全量计费空间，单位：字节。 
     * @return FullChargeSpace 全量计费空间，单位：字节。
     */
    public Long getFullChargeSpace() {
        return this.FullChargeSpace;
    }

    /**
     * Set 全量计费空间，单位：字节。
     * @param FullChargeSpace 全量计费空间，单位：字节。
     */
    public void setFullChargeSpace(Long FullChargeSpace) {
        this.FullChargeSpace = FullChargeSpace;
    }

    /**
     * Get 增量计费空间，单位：字节。 
     * @return IncrementChargeSpace 增量计费空间，单位：字节。
     */
    public Long getIncrementChargeSpace() {
        return this.IncrementChargeSpace;
    }

    /**
     * Set 增量计费空间，单位：字节。
     * @param IncrementChargeSpace 增量计费空间，单位：字节。
     */
    public void setIncrementChargeSpace(Long IncrementChargeSpace) {
        this.IncrementChargeSpace = IncrementChargeSpace;
    }

    /**
     * Get 本月全量备份集大小，单位：字节。 
     * @return FullBackupSetSize 本月全量备份集大小，单位：字节。
     */
    public Long getFullBackupSetSize() {
        return this.FullBackupSetSize;
    }

    /**
     * Set 本月全量备份集大小，单位：字节。
     * @param FullBackupSetSize 本月全量备份集大小，单位：字节。
     */
    public void setFullBackupSetSize(Long FullBackupSetSize) {
        this.FullBackupSetSize = FullBackupSetSize;
    }

    /**
     * Get 本月增量备份集大小，单位：字节。 
     * @return IncrementBackupSetSize 本月增量备份集大小，单位：字节。
     */
    public Long getIncrementBackupSetSize() {
        return this.IncrementBackupSetSize;
    }

    /**
     * Set 本月增量备份集大小，单位：字节。
     * @param IncrementBackupSetSize 本月增量备份集大小，单位：字节。
     */
    public void setIncrementBackupSetSize(Long IncrementBackupSetSize) {
        this.IncrementBackupSetSize = IncrementBackupSetSize;
    }

    /**
     * Get 创建时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00。 
     * @return CreateTime 创建时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00。
     * @param CreateTime 创建时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 统计周期，格式为“开始时间 - 结束时间”。 
     * @return TimeRange 统计周期，格式为“开始时间 - 结束时间”。
     */
    public String getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set 统计周期，格式为“开始时间 - 结束时间”。
     * @param TimeRange 统计周期，格式为“开始时间 - 结束时间”。
     */
    public void setTimeRange(String TimeRange) {
        this.TimeRange = TimeRange;
    }

    public BackupPlanPayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPlanPayInfo(BackupPlanPayInfo source) {
        if (source.InstanceClass != null) {
            this.InstanceClass = new String(source.InstanceClass);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.FreeSpace != null) {
            this.FreeSpace = new Long(source.FreeSpace);
        }
        if (source.TotalChargeSpace != null) {
            this.TotalChargeSpace = new Long(source.TotalChargeSpace);
        }
        if (source.FullChargeSpace != null) {
            this.FullChargeSpace = new Long(source.FullChargeSpace);
        }
        if (source.IncrementChargeSpace != null) {
            this.IncrementChargeSpace = new Long(source.IncrementChargeSpace);
        }
        if (source.FullBackupSetSize != null) {
            this.FullBackupSetSize = new Long(source.FullBackupSetSize);
        }
        if (source.IncrementBackupSetSize != null) {
            this.IncrementBackupSetSize = new Long(source.IncrementBackupSetSize);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new String(source.TimeRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceClass", this.InstanceClass);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "FreeSpace", this.FreeSpace);
        this.setParamSimple(map, prefix + "TotalChargeSpace", this.TotalChargeSpace);
        this.setParamSimple(map, prefix + "FullChargeSpace", this.FullChargeSpace);
        this.setParamSimple(map, prefix + "IncrementChargeSpace", this.IncrementChargeSpace);
        this.setParamSimple(map, prefix + "FullBackupSetSize", this.FullBackupSetSize);
        this.setParamSimple(map, prefix + "IncrementBackupSetSize", this.IncrementBackupSetSize);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);

    }
}

