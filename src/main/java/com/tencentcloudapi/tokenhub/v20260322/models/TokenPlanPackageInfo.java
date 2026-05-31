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

public class TokenPlanPackageInfo extends AbstractModel {

    /**
    * 总额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
    */
    @SerializedName("TotalQuota")
    @Expose
    private String TotalQuota;

    /**
    * 总已使用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
    */
    @SerializedName("TotalUsed")
    @Expose
    private String TotalUsed;

    /**
    * 总周期数。
    */
    @SerializedName("TotalCycles")
    @Expose
    private Long TotalCycles;

    /**
    * 周期单位。取值：month（月）
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * 套餐包生效时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 套餐包到期时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 独占池已分配额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
    */
    @SerializedName("ExclusiveAllocated")
    @Expose
    private String ExclusiveAllocated;

    /**
    * 独占池已用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
    */
    @SerializedName("ExclusiveUsed")
    @Expose
    private String ExclusiveUsed;

    /**
    * 共享池总额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
    */
    @SerializedName("SharedPool")
    @Expose
    private String SharedPool;

    /**
    * 共享已用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
    */
    @SerializedName("SharedUsed")
    @Expose
    private String SharedUsed;

    /**
    * 当期额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
    */
    @SerializedName("CycleQuota")
    @Expose
    private String CycleQuota;

    /**
    * 当前周期。
    */
    @SerializedName("CurrentCycle")
    @Expose
    private Long CurrentCycle;

    /**
    * 剩余周期。
    */
    @SerializedName("RemainCycles")
    @Expose
    private Long RemainCycles;

    /**
     * Get 总额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐） 
     * @return TotalQuota 总额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public String getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set 总额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     * @param TotalQuota 总额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public void setTotalQuota(String TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get 总已使用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐） 
     * @return TotalUsed 总已使用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public String getTotalUsed() {
        return this.TotalUsed;
    }

    /**
     * Set 总已使用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     * @param TotalUsed 总已使用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public void setTotalUsed(String TotalUsed) {
        this.TotalUsed = TotalUsed;
    }

    /**
     * Get 总周期数。 
     * @return TotalCycles 总周期数。
     */
    public Long getTotalCycles() {
        return this.TotalCycles;
    }

    /**
     * Set 总周期数。
     * @param TotalCycles 总周期数。
     */
    public void setTotalCycles(Long TotalCycles) {
        this.TotalCycles = TotalCycles;
    }

    /**
     * Get 周期单位。取值：month（月） 
     * @return CycleUnit 周期单位。取值：month（月）
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set 周期单位。取值：month（月）
     * @param CycleUnit 周期单位。取值：month（月）
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get 套餐包生效时间。 
     * @return StartTime 套餐包生效时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 套餐包生效时间。
     * @param StartTime 套餐包生效时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 套餐包到期时间。 
     * @return ExpireTime 套餐包到期时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 套餐包到期时间。
     * @param ExpireTime 套餐包到期时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 独占池已分配额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐） 
     * @return ExclusiveAllocated 独占池已分配额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public String getExclusiveAllocated() {
        return this.ExclusiveAllocated;
    }

    /**
     * Set 独占池已分配额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     * @param ExclusiveAllocated 独占池已分配额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public void setExclusiveAllocated(String ExclusiveAllocated) {
        this.ExclusiveAllocated = ExclusiveAllocated;
    }

    /**
     * Get 独占池已用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐） 
     * @return ExclusiveUsed 独占池已用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public String getExclusiveUsed() {
        return this.ExclusiveUsed;
    }

    /**
     * Set 独占池已用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     * @param ExclusiveUsed 独占池已用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public void setExclusiveUsed(String ExclusiveUsed) {
        this.ExclusiveUsed = ExclusiveUsed;
    }

    /**
     * Get 共享池总额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐） 
     * @return SharedPool 共享池总额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public String getSharedPool() {
        return this.SharedPool;
    }

    /**
     * Set 共享池总额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     * @param SharedPool 共享池总额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public void setSharedPool(String SharedPool) {
        this.SharedPool = SharedPool;
    }

    /**
     * Get 共享已用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐） 
     * @return SharedUsed 共享已用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public String getSharedUsed() {
        return this.SharedUsed;
    }

    /**
     * Set 共享已用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     * @param SharedUsed 共享已用额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public void setSharedUsed(String SharedUsed) {
        this.SharedUsed = SharedUsed;
    }

    /**
     * Get 当期额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐） 
     * @return CycleQuota 当期额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public String getCycleQuota() {
        return this.CycleQuota;
    }

    /**
     * Set 当期额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     * @param CycleQuota 当期额度。根据套餐类型区分单位：credits（企业版专业套餐），tokens（企业版auto套餐）
     */
    public void setCycleQuota(String CycleQuota) {
        this.CycleQuota = CycleQuota;
    }

    /**
     * Get 当前周期。 
     * @return CurrentCycle 当前周期。
     */
    public Long getCurrentCycle() {
        return this.CurrentCycle;
    }

    /**
     * Set 当前周期。
     * @param CurrentCycle 当前周期。
     */
    public void setCurrentCycle(Long CurrentCycle) {
        this.CurrentCycle = CurrentCycle;
    }

    /**
     * Get 剩余周期。 
     * @return RemainCycles 剩余周期。
     */
    public Long getRemainCycles() {
        return this.RemainCycles;
    }

    /**
     * Set 剩余周期。
     * @param RemainCycles 剩余周期。
     */
    public void setRemainCycles(Long RemainCycles) {
        this.RemainCycles = RemainCycles;
    }

    public TokenPlanPackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenPlanPackageInfo(TokenPlanPackageInfo source) {
        if (source.TotalQuota != null) {
            this.TotalQuota = new String(source.TotalQuota);
        }
        if (source.TotalUsed != null) {
            this.TotalUsed = new String(source.TotalUsed);
        }
        if (source.TotalCycles != null) {
            this.TotalCycles = new Long(source.TotalCycles);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ExclusiveAllocated != null) {
            this.ExclusiveAllocated = new String(source.ExclusiveAllocated);
        }
        if (source.ExclusiveUsed != null) {
            this.ExclusiveUsed = new String(source.ExclusiveUsed);
        }
        if (source.SharedPool != null) {
            this.SharedPool = new String(source.SharedPool);
        }
        if (source.SharedUsed != null) {
            this.SharedUsed = new String(source.SharedUsed);
        }
        if (source.CycleQuota != null) {
            this.CycleQuota = new String(source.CycleQuota);
        }
        if (source.CurrentCycle != null) {
            this.CurrentCycle = new Long(source.CurrentCycle);
        }
        if (source.RemainCycles != null) {
            this.RemainCycles = new Long(source.RemainCycles);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "TotalUsed", this.TotalUsed);
        this.setParamSimple(map, prefix + "TotalCycles", this.TotalCycles);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ExclusiveAllocated", this.ExclusiveAllocated);
        this.setParamSimple(map, prefix + "ExclusiveUsed", this.ExclusiveUsed);
        this.setParamSimple(map, prefix + "SharedPool", this.SharedPool);
        this.setParamSimple(map, prefix + "SharedUsed", this.SharedUsed);
        this.setParamSimple(map, prefix + "CycleQuota", this.CycleQuota);
        this.setParamSimple(map, prefix + "CurrentCycle", this.CurrentCycle);
        this.setParamSimple(map, prefix + "RemainCycles", this.RemainCycles);

    }
}

