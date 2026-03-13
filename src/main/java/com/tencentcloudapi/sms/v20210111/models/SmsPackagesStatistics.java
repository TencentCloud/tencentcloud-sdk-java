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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsPackagesStatistics extends AbstractModel {

    /**
    * <p>套餐包创建时间，UNIX 时间戳。</p><p>单位：秒</p>
    */
    @SerializedName("PackageCreateTime")
    @Expose
    private Long PackageCreateTime;

    /**
    * <p>套餐包生效时间，UNIX 时间戳。</p><p>单位：秒</p>
    */
    @SerializedName("PackageEffectiveTime")
    @Expose
    private Long PackageEffectiveTime;

    /**
    * <p>套餐包过期时间，UNIX 时间戳。</p><p>单位：秒</p>
    */
    @SerializedName("PackageExpiredTime")
    @Expose
    private Long PackageExpiredTime;

    /**
    * <p>套餐包条数。</p><p>单位：条</p>
    */
    @SerializedName("PackageAmount")
    @Expose
    private Long PackageAmount;

    /**
    * <p>套餐包类别。</p><p>枚举值：</p><ul><li>0： 赠送套餐</li><li>1： 购买套餐包</li></ul>
    */
    @SerializedName("PackageType")
    @Expose
    private Long PackageType;

    /**
    * <p>套餐包 ID。</p>
    */
    @SerializedName("PackageId")
    @Expose
    private Long PackageId;

    /**
    * <p>当前使用套餐包条数。</p><p>单位：条</p>
    */
    @SerializedName("CurrentUsage")
    @Expose
    private Long CurrentUsage;

    /**
     * Get <p>套餐包创建时间，UNIX 时间戳。</p><p>单位：秒</p> 
     * @return PackageCreateTime <p>套餐包创建时间，UNIX 时间戳。</p><p>单位：秒</p>
     */
    public Long getPackageCreateTime() {
        return this.PackageCreateTime;
    }

    /**
     * Set <p>套餐包创建时间，UNIX 时间戳。</p><p>单位：秒</p>
     * @param PackageCreateTime <p>套餐包创建时间，UNIX 时间戳。</p><p>单位：秒</p>
     */
    public void setPackageCreateTime(Long PackageCreateTime) {
        this.PackageCreateTime = PackageCreateTime;
    }

    /**
     * Get <p>套餐包生效时间，UNIX 时间戳。</p><p>单位：秒</p> 
     * @return PackageEffectiveTime <p>套餐包生效时间，UNIX 时间戳。</p><p>单位：秒</p>
     */
    public Long getPackageEffectiveTime() {
        return this.PackageEffectiveTime;
    }

    /**
     * Set <p>套餐包生效时间，UNIX 时间戳。</p><p>单位：秒</p>
     * @param PackageEffectiveTime <p>套餐包生效时间，UNIX 时间戳。</p><p>单位：秒</p>
     */
    public void setPackageEffectiveTime(Long PackageEffectiveTime) {
        this.PackageEffectiveTime = PackageEffectiveTime;
    }

    /**
     * Get <p>套餐包过期时间，UNIX 时间戳。</p><p>单位：秒</p> 
     * @return PackageExpiredTime <p>套餐包过期时间，UNIX 时间戳。</p><p>单位：秒</p>
     */
    public Long getPackageExpiredTime() {
        return this.PackageExpiredTime;
    }

    /**
     * Set <p>套餐包过期时间，UNIX 时间戳。</p><p>单位：秒</p>
     * @param PackageExpiredTime <p>套餐包过期时间，UNIX 时间戳。</p><p>单位：秒</p>
     */
    public void setPackageExpiredTime(Long PackageExpiredTime) {
        this.PackageExpiredTime = PackageExpiredTime;
    }

    /**
     * Get <p>套餐包条数。</p><p>单位：条</p> 
     * @return PackageAmount <p>套餐包条数。</p><p>单位：条</p>
     */
    public Long getPackageAmount() {
        return this.PackageAmount;
    }

    /**
     * Set <p>套餐包条数。</p><p>单位：条</p>
     * @param PackageAmount <p>套餐包条数。</p><p>单位：条</p>
     */
    public void setPackageAmount(Long PackageAmount) {
        this.PackageAmount = PackageAmount;
    }

    /**
     * Get <p>套餐包类别。</p><p>枚举值：</p><ul><li>0： 赠送套餐</li><li>1： 购买套餐包</li></ul> 
     * @return PackageType <p>套餐包类别。</p><p>枚举值：</p><ul><li>0： 赠送套餐</li><li>1： 购买套餐包</li></ul>
     */
    public Long getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>套餐包类别。</p><p>枚举值：</p><ul><li>0： 赠送套餐</li><li>1： 购买套餐包</li></ul>
     * @param PackageType <p>套餐包类别。</p><p>枚举值：</p><ul><li>0： 赠送套餐</li><li>1： 购买套餐包</li></ul>
     */
    public void setPackageType(Long PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get <p>套餐包 ID。</p> 
     * @return PackageId <p>套餐包 ID。</p>
     */
    public Long getPackageId() {
        return this.PackageId;
    }

    /**
     * Set <p>套餐包 ID。</p>
     * @param PackageId <p>套餐包 ID。</p>
     */
    public void setPackageId(Long PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get <p>当前使用套餐包条数。</p><p>单位：条</p> 
     * @return CurrentUsage <p>当前使用套餐包条数。</p><p>单位：条</p>
     */
    public Long getCurrentUsage() {
        return this.CurrentUsage;
    }

    /**
     * Set <p>当前使用套餐包条数。</p><p>单位：条</p>
     * @param CurrentUsage <p>当前使用套餐包条数。</p><p>单位：条</p>
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

