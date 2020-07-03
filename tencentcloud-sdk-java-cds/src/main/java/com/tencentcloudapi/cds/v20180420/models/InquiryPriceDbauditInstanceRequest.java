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
package com.tencentcloudapi.cds.v20180420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceDbauditInstanceRequest extends AbstractModel{

    /**
    * 实例规格，取值范围： cdsaudit，cdsaudit_adv， cdsaudit_ent 分别为合规版，高级版，企业版
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * 询价类型： renew，续费；newbuy，新购
    */
    @SerializedName("InquiryType")
    @Expose
    private String InquiryType;

    /**
    * 购买实例的时长。取值范围：1（y/m），2（y/m）,，3（y/m），4（m）， 5（m），6（m）， 7（m），8（m），9（m）， 10（m）
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 购买时长单位，y：年；m：月
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 实例所在地域
    */
    @SerializedName("ServiceRegion")
    @Expose
    private String ServiceRegion;

    /**
     * Get 实例规格，取值范围： cdsaudit，cdsaudit_adv， cdsaudit_ent 分别为合规版，高级版，企业版 
     * @return InstanceVersion 实例规格，取值范围： cdsaudit，cdsaudit_adv， cdsaudit_ent 分别为合规版，高级版，企业版
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set 实例规格，取值范围： cdsaudit，cdsaudit_adv， cdsaudit_ent 分别为合规版，高级版，企业版
     * @param InstanceVersion 实例规格，取值范围： cdsaudit，cdsaudit_adv， cdsaudit_ent 分别为合规版，高级版，企业版
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get 询价类型： renew，续费；newbuy，新购 
     * @return InquiryType 询价类型： renew，续费；newbuy，新购
     */
    public String getInquiryType() {
        return this.InquiryType;
    }

    /**
     * Set 询价类型： renew，续费；newbuy，新购
     * @param InquiryType 询价类型： renew，续费；newbuy，新购
     */
    public void setInquiryType(String InquiryType) {
        this.InquiryType = InquiryType;
    }

    /**
     * Get 购买实例的时长。取值范围：1（y/m），2（y/m）,，3（y/m），4（m）， 5（m），6（m）， 7（m），8（m），9（m）， 10（m） 
     * @return TimeSpan 购买实例的时长。取值范围：1（y/m），2（y/m）,，3（y/m），4（m）， 5（m），6（m）， 7（m），8（m），9（m）， 10（m）
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买实例的时长。取值范围：1（y/m），2（y/m）,，3（y/m），4（m）， 5（m），6（m）， 7（m），8（m），9（m）， 10（m）
     * @param TimeSpan 购买实例的时长。取值范围：1（y/m），2（y/m）,，3（y/m），4（m）， 5（m），6（m）， 7（m），8（m），9（m）， 10（m）
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 购买时长单位，y：年；m：月 
     * @return TimeUnit 购买时长单位，y：年；m：月
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 购买时长单位，y：年；m：月
     * @param TimeUnit 购买时长单位，y：年；m：月
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 实例所在地域 
     * @return ServiceRegion 实例所在地域
     */
    public String getServiceRegion() {
        return this.ServiceRegion;
    }

    /**
     * Set 实例所在地域
     * @param ServiceRegion 实例所在地域
     */
    public void setServiceRegion(String ServiceRegion) {
        this.ServiceRegion = ServiceRegion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "InquiryType", this.InquiryType);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "ServiceRegion", this.ServiceRegion);

    }
}

