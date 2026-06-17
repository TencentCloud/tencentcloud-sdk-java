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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuotaInfo extends AbstractModel {

    /**
    * 限额包 ID。
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 限额包状态。取值：1（正常）、3（已耗尽）、4（已销毁）。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 限额周期。取值：d（按日）、m（按月）、lifetime（总额度，不重置）。
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * 维度当期限额总量（Token 数）。使用字符串避免大数精度丢失。
    */
    @SerializedName("CycleCredits")
    @Expose
    private String CycleCredits;

    /**
    * 维度当期已使用量（Token 数）。使用字符串避免大数精度丢失。
    */
    @SerializedName("CycleUsed")
    @Expose
    private String CycleUsed;

    /**
    * 限额生效起始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 限额过期时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get 限额包 ID。 
     * @return PkgId 限额包 ID。
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 限额包 ID。
     * @param PkgId 限额包 ID。
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 限额包状态。取值：1（正常）、3（已耗尽）、4（已销毁）。 
     * @return Status 限额包状态。取值：1（正常）、3（已耗尽）、4（已销毁）。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 限额包状态。取值：1（正常）、3（已耗尽）、4（已销毁）。
     * @param Status 限额包状态。取值：1（正常）、3（已耗尽）、4（已销毁）。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 限额周期。取值：d（按日）、m（按月）、lifetime（总额度，不重置）。 
     * @return CycleUnit 限额周期。取值：d（按日）、m（按月）、lifetime（总额度，不重置）。
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set 限额周期。取值：d（按日）、m（按月）、lifetime（总额度，不重置）。
     * @param CycleUnit 限额周期。取值：d（按日）、m（按月）、lifetime（总额度，不重置）。
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get 维度当期限额总量（Token 数）。使用字符串避免大数精度丢失。 
     * @return CycleCredits 维度当期限额总量（Token 数）。使用字符串避免大数精度丢失。
     */
    public String getCycleCredits() {
        return this.CycleCredits;
    }

    /**
     * Set 维度当期限额总量（Token 数）。使用字符串避免大数精度丢失。
     * @param CycleCredits 维度当期限额总量（Token 数）。使用字符串避免大数精度丢失。
     */
    public void setCycleCredits(String CycleCredits) {
        this.CycleCredits = CycleCredits;
    }

    /**
     * Get 维度当期已使用量（Token 数）。使用字符串避免大数精度丢失。 
     * @return CycleUsed 维度当期已使用量（Token 数）。使用字符串避免大数精度丢失。
     */
    public String getCycleUsed() {
        return this.CycleUsed;
    }

    /**
     * Set 维度当期已使用量（Token 数）。使用字符串避免大数精度丢失。
     * @param CycleUsed 维度当期已使用量（Token 数）。使用字符串避免大数精度丢失。
     */
    public void setCycleUsed(String CycleUsed) {
        this.CycleUsed = CycleUsed;
    }

    /**
     * Get 限额生效起始时间。 
     * @return StartTime 限额生效起始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 限额生效起始时间。
     * @param StartTime 限额生效起始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 限额过期时间。 
     * @return ExpireTime 限额过期时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 限额过期时间。
     * @param ExpireTime 限额过期时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public QuotaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuotaInfo(QuotaInfo source) {
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.CycleCredits != null) {
            this.CycleCredits = new String(source.CycleCredits);
        }
        if (source.CycleUsed != null) {
            this.CycleUsed = new String(source.CycleUsed);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "CycleCredits", this.CycleCredits);
        this.setParamSimple(map, prefix + "CycleUsed", this.CycleUsed);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

