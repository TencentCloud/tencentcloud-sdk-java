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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsPackagesStatistics extends AbstractModel{

    /**
    * 套餐包创建时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("PackageCreateTime")
    @Expose
    private Long PackageCreateTime;

    /**
    * 套餐包生效时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("PackageEffectiveTime")
    @Expose
    private Long PackageEffectiveTime;

    /**
    * 套餐包过期时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("PackageExpiredTime")
    @Expose
    private Long PackageExpiredTime;

    /**
    * 套餐包条数。
    */
    @SerializedName("PackageAmount")
    @Expose
    private Long PackageAmount;

    /**
    * 套餐包类别，0表示赠送套餐包，1表示购买套餐包。
    */
    @SerializedName("PackageType")
    @Expose
    private Long PackageType;

    /**
    * 套餐包 ID。
    */
    @SerializedName("PackageId")
    @Expose
    private Long PackageId;

    /**
    * 当前使用套餐包条数。
    */
    @SerializedName("CurrentUsage")
    @Expose
    private Long CurrentUsage;

    /**
     * Get 套餐包创建时间，UNIX 时间戳（单位：秒）。 
     * @return PackageCreateTime 套餐包创建时间，UNIX 时间戳（单位：秒）。
     */
    public Long getPackageCreateTime() {
        return this.PackageCreateTime;
    }

    /**
     * Set 套餐包创建时间，UNIX 时间戳（单位：秒）。
     * @param PackageCreateTime 套餐包创建时间，UNIX 时间戳（单位：秒）。
     */
    public void setPackageCreateTime(Long PackageCreateTime) {
        this.PackageCreateTime = PackageCreateTime;
    }

    /**
     * Get 套餐包生效时间，UNIX 时间戳（单位：秒）。 
     * @return PackageEffectiveTime 套餐包生效时间，UNIX 时间戳（单位：秒）。
     */
    public Long getPackageEffectiveTime() {
        return this.PackageEffectiveTime;
    }

    /**
     * Set 套餐包生效时间，UNIX 时间戳（单位：秒）。
     * @param PackageEffectiveTime 套餐包生效时间，UNIX 时间戳（单位：秒）。
     */
    public void setPackageEffectiveTime(Long PackageEffectiveTime) {
        this.PackageEffectiveTime = PackageEffectiveTime;
    }

    /**
     * Get 套餐包过期时间，UNIX 时间戳（单位：秒）。 
     * @return PackageExpiredTime 套餐包过期时间，UNIX 时间戳（单位：秒）。
     */
    public Long getPackageExpiredTime() {
        return this.PackageExpiredTime;
    }

    /**
     * Set 套餐包过期时间，UNIX 时间戳（单位：秒）。
     * @param PackageExpiredTime 套餐包过期时间，UNIX 时间戳（单位：秒）。
     */
    public void setPackageExpiredTime(Long PackageExpiredTime) {
        this.PackageExpiredTime = PackageExpiredTime;
    }

    /**
     * Get 套餐包条数。 
     * @return PackageAmount 套餐包条数。
     */
    public Long getPackageAmount() {
        return this.PackageAmount;
    }

    /**
     * Set 套餐包条数。
     * @param PackageAmount 套餐包条数。
     */
    public void setPackageAmount(Long PackageAmount) {
        this.PackageAmount = PackageAmount;
    }

    /**
     * Get 套餐包类别，0表示赠送套餐包，1表示购买套餐包。 
     * @return PackageType 套餐包类别，0表示赠送套餐包，1表示购买套餐包。
     */
    public Long getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 套餐包类别，0表示赠送套餐包，1表示购买套餐包。
     * @param PackageType 套餐包类别，0表示赠送套餐包，1表示购买套餐包。
     */
    public void setPackageType(Long PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 套餐包 ID。 
     * @return PackageId 套餐包 ID。
     */
    public Long getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 套餐包 ID。
     * @param PackageId 套餐包 ID。
     */
    public void setPackageId(Long PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 当前使用套餐包条数。 
     * @return CurrentUsage 当前使用套餐包条数。
     */
    public Long getCurrentUsage() {
        return this.CurrentUsage;
    }

    /**
     * Set 当前使用套餐包条数。
     * @param CurrentUsage 当前使用套餐包条数。
     */
    public void setCurrentUsage(Long CurrentUsage) {
        this.CurrentUsage = CurrentUsage;
    }

    public SmsPackagesStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsPackagesStatistics(SmsPackagesStatistics source) {
        if (source.PackageCreateTime != null) {
            this.PackageCreateTime = new Long(source.PackageCreateTime);
        }
        if (source.PackageEffectiveTime != null) {
            this.PackageEffectiveTime = new Long(source.PackageEffectiveTime);
        }
        if (source.PackageExpiredTime != null) {
            this.PackageExpiredTime = new Long(source.PackageExpiredTime);
        }
        if (source.PackageAmount != null) {
            this.PackageAmount = new Long(source.PackageAmount);
        }
        if (source.PackageType != null) {
            this.PackageType = new Long(source.PackageType);
        }
        if (source.PackageId != null) {
            this.PackageId = new Long(source.PackageId);
        }
        if (source.CurrentUsage != null) {
            this.CurrentUsage = new Long(source.CurrentUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageCreateTime", this.PackageCreateTime);
        this.setParamSimple(map, prefix + "PackageEffectiveTime", this.PackageEffectiveTime);
        this.setParamSimple(map, prefix + "PackageExpiredTime", this.PackageExpiredTime);
        this.setParamSimple(map, prefix + "PackageAmount", this.PackageAmount);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "CurrentUsage", this.CurrentUsage);

    }
}

