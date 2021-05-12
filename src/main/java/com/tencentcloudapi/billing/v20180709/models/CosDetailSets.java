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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosDetailSets extends AbstractModel{

    /**
    * 存储桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 用量开始时间
    */
    @SerializedName("DosageBeginTime")
    @Expose
    private String DosageBeginTime;

    /**
    * 用量结束时间
    */
    @SerializedName("DosageEndTime")
    @Expose
    private String DosageEndTime;

    /**
    * 一级产品类型名称
    */
    @SerializedName("SubProductCodeName")
    @Expose
    private String SubProductCodeName;

    /**
    * 二级产品类型名称
    */
    @SerializedName("BillingItemCodeName")
    @Expose
    private String BillingItemCodeName;

    /**
    * 用量
    */
    @SerializedName("DosageValue")
    @Expose
    private String DosageValue;

    /**
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
     * Get 存储桶名称 
     * @return BucketName 存储桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 存储桶名称
     * @param BucketName 存储桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 用量开始时间 
     * @return DosageBeginTime 用量开始时间
     */
    public String getDosageBeginTime() {
        return this.DosageBeginTime;
    }

    /**
     * Set 用量开始时间
     * @param DosageBeginTime 用量开始时间
     */
    public void setDosageBeginTime(String DosageBeginTime) {
        this.DosageBeginTime = DosageBeginTime;
    }

    /**
     * Get 用量结束时间 
     * @return DosageEndTime 用量结束时间
     */
    public String getDosageEndTime() {
        return this.DosageEndTime;
    }

    /**
     * Set 用量结束时间
     * @param DosageEndTime 用量结束时间
     */
    public void setDosageEndTime(String DosageEndTime) {
        this.DosageEndTime = DosageEndTime;
    }

    /**
     * Get 一级产品类型名称 
     * @return SubProductCodeName 一级产品类型名称
     */
    public String getSubProductCodeName() {
        return this.SubProductCodeName;
    }

    /**
     * Set 一级产品类型名称
     * @param SubProductCodeName 一级产品类型名称
     */
    public void setSubProductCodeName(String SubProductCodeName) {
        this.SubProductCodeName = SubProductCodeName;
    }

    /**
     * Get 二级产品类型名称 
     * @return BillingItemCodeName 二级产品类型名称
     */
    public String getBillingItemCodeName() {
        return this.BillingItemCodeName;
    }

    /**
     * Set 二级产品类型名称
     * @param BillingItemCodeName 二级产品类型名称
     */
    public void setBillingItemCodeName(String BillingItemCodeName) {
        this.BillingItemCodeName = BillingItemCodeName;
    }

    /**
     * Get 用量 
     * @return DosageValue 用量
     */
    public String getDosageValue() {
        return this.DosageValue;
    }

    /**
     * Set 用量
     * @param DosageValue 用量
     */
    public void setDosageValue(String DosageValue) {
        this.DosageValue = DosageValue;
    }

    /**
     * Get 单位 
     * @return Unit 单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
     * @param Unit 单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public CosDetailSets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosDetailSets(CosDetailSets source) {
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.DosageBeginTime != null) {
            this.DosageBeginTime = new String(source.DosageBeginTime);
        }
        if (source.DosageEndTime != null) {
            this.DosageEndTime = new String(source.DosageEndTime);
        }
        if (source.SubProductCodeName != null) {
            this.SubProductCodeName = new String(source.SubProductCodeName);
        }
        if (source.BillingItemCodeName != null) {
            this.BillingItemCodeName = new String(source.BillingItemCodeName);
        }
        if (source.DosageValue != null) {
            this.DosageValue = new String(source.DosageValue);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "DosageBeginTime", this.DosageBeginTime);
        this.setParamSimple(map, prefix + "DosageEndTime", this.DosageEndTime);
        this.setParamSimple(map, prefix + "SubProductCodeName", this.SubProductCodeName);
        this.setParamSimple(map, prefix + "BillingItemCodeName", this.BillingItemCodeName);
        this.setParamSimple(map, prefix + "DosageValue", this.DosageValue);
        this.setParamSimple(map, prefix + "Unit", this.Unit);

    }
}

