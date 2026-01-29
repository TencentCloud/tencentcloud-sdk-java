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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetRenewalRequest extends AbstractModel {

    /**
    * 产品编码。
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 地域编码。
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 实例ID，仅支持指定一个。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 续费标识。枚举值如下：
NOTIFY_AND_MANUAL_RENEW：手动续费
NOTIFY_AND_AUTO_RENEW：自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 自动续费周期长度，不填写时默认按产品侧设置的默认值
如果是月，支持：1-11
如果是年，支持：1-5
实际按产品侧支持的范围为主
    */
    @SerializedName("RenewPeriod")
    @Expose
    private String RenewPeriod;

    /**
    * 自动续费周期单位，不填写时默认按产品侧设置的默认值
y 年，m 月
实际按产品侧支持的范围为主
    */
    @SerializedName("RenewPeriodUnit")
    @Expose
    private String RenewPeriodUnit;

    /**
     * Get 产品编码。 
     * @return ProductCode 产品编码。
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品编码。
     * @param ProductCode 产品编码。
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 地域编码。 
     * @return RegionCode 地域编码。
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地域编码。
     * @param RegionCode 地域编码。
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 实例ID，仅支持指定一个。 
     * @return InstanceId 实例ID，仅支持指定一个。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，仅支持指定一个。
     * @param InstanceId 实例ID，仅支持指定一个。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 续费标识。枚举值如下：
NOTIFY_AND_MANUAL_RENEW：手动续费
NOTIFY_AND_AUTO_RENEW：自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续 
     * @return RenewFlag 续费标识。枚举值如下：
NOTIFY_AND_MANUAL_RENEW：手动续费
NOTIFY_AND_AUTO_RENEW：自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费标识。枚举值如下：
NOTIFY_AND_MANUAL_RENEW：手动续费
NOTIFY_AND_AUTO_RENEW：自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续
     * @param RenewFlag 续费标识。枚举值如下：
NOTIFY_AND_MANUAL_RENEW：手动续费
NOTIFY_AND_AUTO_RENEW：自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 自动续费周期长度，不填写时默认按产品侧设置的默认值
如果是月，支持：1-11
如果是年，支持：1-5
实际按产品侧支持的范围为主 
     * @return RenewPeriod 自动续费周期长度，不填写时默认按产品侧设置的默认值
如果是月，支持：1-11
如果是年，支持：1-5
实际按产品侧支持的范围为主
     */
    public String getRenewPeriod() {
        return this.RenewPeriod;
    }

    /**
     * Set 自动续费周期长度，不填写时默认按产品侧设置的默认值
如果是月，支持：1-11
如果是年，支持：1-5
实际按产品侧支持的范围为主
     * @param RenewPeriod 自动续费周期长度，不填写时默认按产品侧设置的默认值
如果是月，支持：1-11
如果是年，支持：1-5
实际按产品侧支持的范围为主
     */
    public void setRenewPeriod(String RenewPeriod) {
        this.RenewPeriod = RenewPeriod;
    }

    /**
     * Get 自动续费周期单位，不填写时默认按产品侧设置的默认值
y 年，m 月
实际按产品侧支持的范围为主 
     * @return RenewPeriodUnit 自动续费周期单位，不填写时默认按产品侧设置的默认值
y 年，m 月
实际按产品侧支持的范围为主
     */
    public String getRenewPeriodUnit() {
        return this.RenewPeriodUnit;
    }

    /**
     * Set 自动续费周期单位，不填写时默认按产品侧设置的默认值
y 年，m 月
实际按产品侧支持的范围为主
     * @param RenewPeriodUnit 自动续费周期单位，不填写时默认按产品侧设置的默认值
y 年，m 月
实际按产品侧支持的范围为主
     */
    public void setRenewPeriodUnit(String RenewPeriodUnit) {
        this.RenewPeriodUnit = RenewPeriodUnit;
    }

    public SetRenewalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetRenewalRequest(SetRenewalRequest source) {
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.RenewPeriod != null) {
            this.RenewPeriod = new String(source.RenewPeriod);
        }
        if (source.RenewPeriodUnit != null) {
            this.RenewPeriodUnit = new String(source.RenewPeriodUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "RenewPeriod", this.RenewPeriod);
        this.setParamSimple(map, prefix + "RenewPeriodUnit", this.RenewPeriodUnit);

    }
}

