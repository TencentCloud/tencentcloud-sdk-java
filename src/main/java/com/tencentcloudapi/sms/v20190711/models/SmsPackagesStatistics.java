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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsPackagesStatistics extends AbstractModel{

    /**
    * 套餐包创建时间，标准时间，例如：2019-10-08 17:18:37。
    */
    @SerializedName("PackageCreateTime")
    @Expose
    private String PackageCreateTime;

    /**
    * 套餐包创建时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("PackageCreateUnixTime")
    @Expose
    private Long PackageCreateUnixTime;

    /**
    * 套餐包生效时间，标准时间，例如：2019-10-08 17:18:37。
    */
    @SerializedName("PackageEffectiveTime")
    @Expose
    private String PackageEffectiveTime;

    /**
    * 套餐包生效时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("PackageEffectiveUnixTime")
    @Expose
    private Long PackageEffectiveUnixTime;

    /**
    * 套餐包过期时间，标准时间，例如：2019-10-08 17:18:37。
    */
    @SerializedName("PackageExpiredTime")
    @Expose
    private String PackageExpiredTime;

    /**
    * 套餐包过期时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("PackageExpiredUnixTime")
    @Expose
    private Long PackageExpiredUnixTime;

    /**
    * 套餐包条数。
    */
    @SerializedName("AmountOfPackage")
    @Expose
    private Long AmountOfPackage;

    /**
    * 0表示赠送套餐包，1表示购买套餐包。
    */
    @SerializedName("TypeOfPackage")
    @Expose
    private Long TypeOfPackage;

    /**
    * 套餐包 ID。
    */
    @SerializedName("PackageId")
    @Expose
    private Long PackageId;

    /**
    * 当前使用量。
    */
    @SerializedName("CurrentUsage")
    @Expose
    private Long CurrentUsage;

    /**
     * Get 套餐包创建时间，标准时间，例如：2019-10-08 17:18:37。 
     * @return PackageCreateTime 套餐包创建时间，标准时间，例如：2019-10-08 17:18:37。
     */
    public String getPackageCreateTime() {
        return this.PackageCreateTime;
    }

    /**
     * Set 套餐包创建时间，标准时间，例如：2019-10-08 17:18:37。
     * @param PackageCreateTime 套餐包创建时间，标准时间，例如：2019-10-08 17:18:37。
     */
    public void setPackageCreateTime(String PackageCreateTime) {
        this.PackageCreateTime = PackageCreateTime;
    }

    /**
     * Get 套餐包创建时间，UNIX 时间戳（单位：秒）。 
     * @return PackageCreateUnixTime 套餐包创建时间，UNIX 时间戳（单位：秒）。
     */
    public Long getPackageCreateUnixTime() {
        return this.PackageCreateUnixTime;
    }

    /**
     * Set 套餐包创建时间，UNIX 时间戳（单位：秒）。
     * @param PackageCreateUnixTime 套餐包创建时间，UNIX 时间戳（单位：秒）。
     */
    public void setPackageCreateUnixTime(Long PackageCreateUnixTime) {
        this.PackageCreateUnixTime = PackageCreateUnixTime;
    }

    /**
     * Get 套餐包生效时间，标准时间，例如：2019-10-08 17:18:37。 
     * @return PackageEffectiveTime 套餐包生效时间，标准时间，例如：2019-10-08 17:18:37。
     */
    public String getPackageEffectiveTime() {
        return this.PackageEffectiveTime;
    }

    /**
     * Set 套餐包生效时间，标准时间，例如：2019-10-08 17:18:37。
     * @param PackageEffectiveTime 套餐包生效时间，标准时间，例如：2019-10-08 17:18:37。
     */
    public void setPackageEffectiveTime(String PackageEffectiveTime) {
        this.PackageEffectiveTime = PackageEffectiveTime;
    }

    /**
     * Get 套餐包生效时间，UNIX 时间戳（单位：秒）。 
     * @return PackageEffectiveUnixTime 套餐包生效时间，UNIX 时间戳（单位：秒）。
     */
    public Long getPackageEffectiveUnixTime() {
        return this.PackageEffectiveUnixTime;
    }

    /**
     * Set 套餐包生效时间，UNIX 时间戳（单位：秒）。
     * @param PackageEffectiveUnixTime 套餐包生效时间，UNIX 时间戳（单位：秒）。
     */
    public void setPackageEffectiveUnixTime(Long PackageEffectiveUnixTime) {
        this.PackageEffectiveUnixTime = PackageEffectiveUnixTime;
    }

    /**
     * Get 套餐包过期时间，标准时间，例如：2019-10-08 17:18:37。 
     * @return PackageExpiredTime 套餐包过期时间，标准时间，例如：2019-10-08 17:18:37。
     */
    public String getPackageExpiredTime() {
        return this.PackageExpiredTime;
    }

    /**
     * Set 套餐包过期时间，标准时间，例如：2019-10-08 17:18:37。
     * @param PackageExpiredTime 套餐包过期时间，标准时间，例如：2019-10-08 17:18:37。
     */
    public void setPackageExpiredTime(String PackageExpiredTime) {
        this.PackageExpiredTime = PackageExpiredTime;
    }

    /**
     * Get 套餐包过期时间，UNIX 时间戳（单位：秒）。 
     * @return PackageExpiredUnixTime 套餐包过期时间，UNIX 时间戳（单位：秒）。
     */
    public Long getPackageExpiredUnixTime() {
        return this.PackageExpiredUnixTime;
    }

    /**
     * Set 套餐包过期时间，UNIX 时间戳（单位：秒）。
     * @param PackageExpiredUnixTime 套餐包过期时间，UNIX 时间戳（单位：秒）。
     */
    public void setPackageExpiredUnixTime(Long PackageExpiredUnixTime) {
        this.PackageExpiredUnixTime = PackageExpiredUnixTime;
    }

    /**
     * Get 套餐包条数。 
     * @return AmountOfPackage 套餐包条数。
     */
    public Long getAmountOfPackage() {
        return this.AmountOfPackage;
    }

    /**
     * Set 套餐包条数。
     * @param AmountOfPackage 套餐包条数。
     */
    public void setAmountOfPackage(Long AmountOfPackage) {
        this.AmountOfPackage = AmountOfPackage;
    }

    /**
     * Get 0表示赠送套餐包，1表示购买套餐包。 
     * @return TypeOfPackage 0表示赠送套餐包，1表示购买套餐包。
     */
    public Long getTypeOfPackage() {
        return this.TypeOfPackage;
    }

    /**
     * Set 0表示赠送套餐包，1表示购买套餐包。
     * @param TypeOfPackage 0表示赠送套餐包，1表示购买套餐包。
     */
    public void setTypeOfPackage(Long TypeOfPackage) {
        this.TypeOfPackage = TypeOfPackage;
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
     * Get 当前使用量。 
     * @return CurrentUsage 当前使用量。
     */
    public Long getCurrentUsage() {
        return this.CurrentUsage;
    }

    /**
     * Set 当前使用量。
     * @param CurrentUsage 当前使用量。
     */
    public void setCurrentUsage(Long CurrentUsage) {
        this.CurrentUsage = CurrentUsage;
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

