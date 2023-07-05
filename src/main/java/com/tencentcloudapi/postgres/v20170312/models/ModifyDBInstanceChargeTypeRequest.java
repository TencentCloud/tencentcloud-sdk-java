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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceChargeTypeRequest extends AbstractModel{

    /**
    * 实例ID，形如postgres-6fego161
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例计费类型，目前支持：
<li>PREPAID：预付费，即包年包月
<li>POSTPAID_BY_HOUR：后付费，即按量计费
默认值：PREPAID
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 购买时长，单位：月。
<li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36
<li>后付费：只支持1
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 续费标记：
<li>0：手动续费
<li>1：自动续费
默认值：0
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 是否自动使用代金券：
<li>0：否
<li>1：是
默认值：0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
     * Get 实例ID，形如postgres-6fego161 
     * @return DBInstanceId 实例ID，形如postgres-6fego161
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID，形如postgres-6fego161
     * @param DBInstanceId 实例ID，形如postgres-6fego161
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 实例计费类型，目前支持：
<li>PREPAID：预付费，即包年包月
<li>POSTPAID_BY_HOUR：后付费，即按量计费
默认值：PREPAID 
     * @return InstanceChargeType 实例计费类型，目前支持：
<li>PREPAID：预付费，即包年包月
<li>POSTPAID_BY_HOUR：后付费，即按量计费
默认值：PREPAID
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费类型，目前支持：
<li>PREPAID：预付费，即包年包月
<li>POSTPAID_BY_HOUR：后付费，即按量计费
默认值：PREPAID
     * @param InstanceChargeType 实例计费类型，目前支持：
<li>PREPAID：预付费，即包年包月
<li>POSTPAID_BY_HOUR：后付费，即按量计费
默认值：PREPAID
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 购买时长，单位：月。
<li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36
<li>后付费：只支持1 
     * @return Period 购买时长，单位：月。
<li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36
<li>后付费：只支持1
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买时长，单位：月。
<li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36
<li>后付费：只支持1
     * @param Period 购买时长，单位：月。
<li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36
<li>后付费：只支持1
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 续费标记：
<li>0：手动续费
<li>1：自动续费
默认值：0 
     * @return AutoRenewFlag 续费标记：
<li>0：手动续费
<li>1：自动续费
默认值：0
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 续费标记：
<li>0：手动续费
<li>1：自动续费
默认值：0
     * @param AutoRenewFlag 续费标记：
<li>0：手动续费
<li>1：自动续费
默认值：0
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 是否自动使用代金券：
<li>0：否
<li>1：是
默认值：0 
     * @return AutoVoucher 是否自动使用代金券：
<li>0：否
<li>1：是
默认值：0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券：
<li>0：否
<li>1：是
默认值：0
     * @param AutoVoucher 是否自动使用代金券：
<li>0：否
<li>1：是
默认值：0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    public ModifyDBInstanceChargeTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceChargeTypeRequest(ModifyDBInstanceChargeTypeRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);

    }
}

