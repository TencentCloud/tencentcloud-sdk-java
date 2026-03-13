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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsPackagesStatistics extends AbstractModel {

    /**
    * <p>套餐包创建时间，标准时间，例如：2019-10-08 17:18:37。</p>
    */
    @SerializedName("PackageCreateTime")
    @Expose
    private String PackageCreateTime;

    /**
    * <p>套餐包创建时间，UNIX 时间戳。</p><p>单位：秒</p>
    */
    @SerializedName("PackageCreateUnixTime")
    @Expose
    private Long PackageCreateUnixTime;

    /**
    * <p>套餐包生效时间，标准时间，例如：2019-10-08 17:18:37。</p>
    */
    @SerializedName("PackageEffectiveTime")
    @Expose
    private String PackageEffectiveTime;

    /**
    * <p>套餐包生效时间，UNIX 时间戳。</p><p>单位：秒</p>
    */
    @SerializedName("PackageEffectiveUnixTime")
    @Expose
    private Long PackageEffectiveUnixTime;

    /**
    * <p>套餐包过期时间，标准时间，例如：2019-10-08 17:18:37。</p>
    */
    @SerializedName("PackageExpiredTime")
    @Expose
    private String PackageExpiredTime;

    /**
    * <p>套餐包过期时间，UNIX 时间戳。</p><p>单位：秒</p>
    */
    @SerializedName("PackageExpiredUnixTime")
    @Expose
    private Long PackageExpiredUnixTime;

    /**
    * <p>套餐包条数。</p><p>单位：条</p>
    */
    @SerializedName("AmountOfPackage")
    @Expose
    private Long AmountOfPackage;

    /**
    * <p>套餐包类别。</p><p>枚举值：</p><ul><li>0： 赠送套餐包</li><li>1： 购买套餐包</li></ul>
    */
    @SerializedName("TypeOfPackage")
    @Expose
    private Long TypeOfPackage;

    /**
    * <p>套餐包 ID。</p>
    */
    @SerializedName("PackageId")
    @Expose
    private Long PackageId;

    /**
    * <p>当前使用量。</p><p>单位：条</p>
    */
    @SerializedName("CurrentUsage")
    @Expose
    private Long CurrentUsage;

    /**
     * Get <p>套餐包创建时间，标准时间，例如：2019-10-08 17:18:37。</p> 
     * @return PackageCreateTime <p>套餐包创建时间，标准时间，例如：2019-10-08 17:18:37。</p>
     */
    public String getPackageCreateTime() {
        return this.PackageCreateTime;
    }

    /**
     * Set <p>套餐包创建时间，标准时间，例如：2019-10-08 17:18:37。</p>
     * @param PackageCreateTime <p>套餐包创建时间，标准时间，例如：2019-10-08 17:18:37。</p>
     */
    public void setPackageCreateTime(String PackageCreateTime) {
        this.PackageCreateTime = PackageCreateTime;
    }

    /**
     * Get <p>套餐包创建时间，UNIX 时间戳。</p><p>单位：秒</p> 
     * @return PackageCreateUnixTime <p>套餐包创建时间，UNIX 时间戳。</p><p>单位：秒</p>
     */
    public Long getPackageCreateUnixTime() {
        return this.PackageCreateUnixTime;
    }

    /**
     * Set <p>套餐包创建时间，UNIX 时间戳。</p><p>单位：秒</p>
     * @param PackageCreateUnixTime <p>套餐包创建时间，UNIX 时间戳。</p><p>单位：秒</p>
     */
    public void setPackageCreateUnixTime(Long PackageCreateUnixTime) {
        this.PackageCreateUnixTime = PackageCreateUnixTime;
    }

    /**
     * Get <p>套餐包生效时间，标准时间，例如：2019-10-08 17:18:37。</p> 
     * @return PackageEffectiveTime <p>套餐包生效时间，标准时间，例如：2019-10-08 17:18:37。</p>
     */
    public String getPackageEffectiveTime() {
        return this.PackageEffectiveTime;
    }

    /**
     * Set <p>套餐包生效时间，标准时间，例如：2019-10-08 17:18:37。</p>
     * @param PackageEffectiveTime <p>套餐包生效时间，标准时间，例如：2019-10-08 17:18:37。</p>
     */
    public void setPackageEffectiveTime(String PackageEffectiveTime) {
        this.PackageEffectiveTime = PackageEffectiveTime;
    }

    /**
     * Get <p>套餐包生效时间，UNIX 时间戳。</p><p>单位：秒</p> 
     * @return PackageEffectiveUnixTime <p>套餐包生效时间，UNIX 时间戳。</p><p>单位：秒</p>
     */
    public Long getPackageEffectiveUnixTime() {
        return this.PackageEffectiveUnixTime;
    }

    /**
     * Set <p>套餐包生效时间，UNIX 时间戳。</p><p>单位：秒</p>
     * @param PackageEffectiveUnixTime <p>套餐包生效时间，UNIX 时间戳。</p><p>单位：秒</p>
     */
    public void setPackageEffectiveUnixTime(Long PackageEffectiveUnixTime) {
        this.PackageEffectiveUnixTime = PackageEffectiveUnixTime;
    }

    /**
     * Get <p>套餐包过期时间，标准时间，例如：2019-10-08 17:18:37。</p> 
     * @return PackageExpiredTime <p>套餐包过期时间，标准时间，例如：2019-10-08 17:18:37。</p>
     */
    public String getPackageExpiredTime() {
        return this.PackageExpiredTime;
    }

    /**
     * Set <p>套餐包过期时间，标准时间，例如：2019-10-08 17:18:37。</p>
     * @param PackageExpiredTime <p>套餐包过期时间，标准时间，例如：2019-10-08 17:18:37。</p>
     */
    public void setPackageExpiredTime(String PackageExpiredTime) {
        this.PackageExpiredTime = PackageExpiredTime;
    }

    /**
     * Get <p>套餐包过期时间，UNIX 时间戳。</p><p>单位：秒</p> 
     * @return PackageExpiredUnixTime <p>套餐包过期时间，UNIX 时间戳。</p><p>单位：秒</p>
     */
    public Long getPackageExpiredUnixTime() {
        return this.PackageExpiredUnixTime;
    }

    /**
     * Set <p>套餐包过期时间，UNIX 时间戳。</p><p>单位：秒</p>
     * @param PackageExpiredUnixTime <p>套餐包过期时间，UNIX 时间戳。</p><p>单位：秒</p>
     */
    public void setPackageExpiredUnixTime(Long PackageExpiredUnixTime) {
        this.PackageExpiredUnixTime = PackageExpiredUnixTime;
    }

    /**
     * Get <p>套餐包条数。</p><p>单位：条</p> 
     * @return AmountOfPackage <p>套餐包条数。</p><p>单位：条</p>
     */
    public Long getAmountOfPackage() {
        return this.AmountOfPackage;
    }

    /**
     * Set <p>套餐包条数。</p><p>单位：条</p>
     * @param AmountOfPackage <p>套餐包条数。</p><p>单位：条</p>
     */
    public void setAmountOfPackage(Long AmountOfPackage) {
        this.AmountOfPackage = AmountOfPackage;
    }

    /**
     * Get <p>套餐包类别。</p><p>枚举值：</p><ul><li>0： 赠送套餐包</li><li>1： 购买套餐包</li></ul> 
     * @return TypeOfPackage <p>套餐包类别。</p><p>枚举值：</p><ul><li>0： 赠送套餐包</li><li>1： 购买套餐包</li></ul>
     */
    public Long getTypeOfPackage() {
        return this.TypeOfPackage;
    }

    /**
     * Set <p>套餐包类别。</p><p>枚举值：</p><ul><li>0： 赠送套餐包</li><li>1： 购买套餐包</li></ul>
     * @param TypeOfPackage <p>套餐包类别。</p><p>枚举值：</p><ul><li>0： 赠送套餐包</li><li>1： 购买套餐包</li></ul>
     */
    public void setTypeOfPackage(Long TypeOfPackage) {
        this.TypeOfPackage = TypeOfPackage;
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
     * Get <p>当前使用量。</p><p>单位：条</p> 
     * @return CurrentUsage <p>当前使用量。</p><p>单位：条</p>
     */
    public Long getCurrentUsage() {
        return this.CurrentUsage;
    }

    /**
     * Set <p>当前使用量。</p><p>单位：条</p>
     * @param CurrentUsage <p>当前使用量。</p><p>单位：条</p>
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
            this.PackageCreateTime = new String(source.PackageCreateTime);
        }
        if (source.PackageCreateUnixTime != null) {
            this.PackageCreateUnixTime = new Long(source.PackageCreateUnixTime);
        }
        if (source.PackageEffectiveTime != null) {
            this.PackageEffectiveTime = new String(source.PackageEffectiveTime);
        }
        if (source.PackageEffectiveUnixTime != null) {
            this.PackageEffectiveUnixTime = new Long(source.PackageEffectiveUnixTime);
        }
        if (source.PackageExpiredTime != null) {
            this.PackageExpiredTime = new String(source.PackageExpiredTime);
        }
        if (source.PackageExpiredUnixTime != null) {
            this.PackageExpiredUnixTime = new Long(source.PackageExpiredUnixTime);
        }
        if (source.AmountOfPackage != null) {
            this.AmountOfPackage = new Long(source.AmountOfPackage);
        }
        if (source.TypeOfPackage != null) {
            this.TypeOfPackage = new Long(source.TypeOfPackage);
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
        this.setParamSimple(map, prefix + "PackageCreateUnixTime", this.PackageCreateUnixTime);
        this.setParamSimple(map, prefix + "PackageEffectiveTime", this.PackageEffectiveTime);
        this.setParamSimple(map, prefix + "PackageEffectiveUnixTime", this.PackageEffectiveUnixTime);
        this.setParamSimple(map, prefix + "PackageExpiredTime", this.PackageExpiredTime);
        this.setParamSimple(map, prefix + "PackageExpiredUnixTime", this.PackageExpiredUnixTime);
        this.setParamSimple(map, prefix + "AmountOfPackage", this.AmountOfPackage);
        this.setParamSimple(map, prefix + "TypeOfPackage", this.TypeOfPackage);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "CurrentUsage", this.CurrentUsage);

    }
}

