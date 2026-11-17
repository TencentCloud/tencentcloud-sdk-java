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

public class DescribeTokenPlanPersonalPackageResponse extends AbstractModel {

    /**
    * <p>产品类型。</p>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * <p>套餐状态。取值：active（生效中）、processing（处理中）、failed（创建失败）、isolated（隔离/欠费）、destroyed（已销毁）、used_up（额度用尽）、stopped（已停止）、unpurchased（未购买）。</p>
    */
    @SerializedName("PackageStatus")
    @Expose
    private String PackageStatus;

    /**
    * <p>计费资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>总额度。</p>
    */
    @SerializedName("TotalCredits")
    @Expose
    private String TotalCredits;

    /**
    * <p>已使用额度。</p>
    */
    @SerializedName("TotalUsed")
    @Expose
    private String TotalUsed;

    /**
    * <p>单周期额度。</p>
    */
    @SerializedName("CycleCredits")
    @Expose
    private String CycleCredits;

    /**
    * <p>总周期数。</p>
    */
    @SerializedName("TotalCycles")
    @Expose
    private Long TotalCycles;

    /**
    * <p>当前周期序号。</p>
    */
    @SerializedName("CurrentCycle")
    @Expose
    private Long CurrentCycle;

    /**
    * <p>剩余周期数。</p>
    */
    @SerializedName("RemainCycles")
    @Expose
    private Long RemainCycles;

    /**
    * <p>套餐生效时间，ISO 8601 格式。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>套餐过期时间，ISO 8601 格式。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>当前周期到期日，ISO 8601 格式。</p>
    */
    @SerializedName("PeriodEndDate")
    @Expose
    private String PeriodEndDate;

    /**
    * <p>自动续费标识。取值：0（未开启）、1（已开启）。</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>输出token数</p><p>单位：tokens</p>
    */
    @SerializedName("OutputToken")
    @Expose
    private Long OutputToken;

    /**
    * <p>输入token数</p><p>单位：token</p>
    */
    @SerializedName("InputToken")
    @Expose
    private Long InputToken;

    /**
    * <p>缓存命中token数</p><p>单位：token</p>
    */
    @SerializedName("CacheToken")
    @Expose
    private Long CacheToken;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>产品类型。</p> 
     * @return ProductType <p>产品类型。</p>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品类型。</p>
     * @param ProductType <p>产品类型。</p>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>套餐状态。取值：active（生效中）、processing（处理中）、failed（创建失败）、isolated（隔离/欠费）、destroyed（已销毁）、used_up（额度用尽）、stopped（已停止）、unpurchased（未购买）。</p> 
     * @return PackageStatus <p>套餐状态。取值：active（生效中）、processing（处理中）、failed（创建失败）、isolated（隔离/欠费）、destroyed（已销毁）、used_up（额度用尽）、stopped（已停止）、unpurchased（未购买）。</p>
     */
    public String getPackageStatus() {
        return this.PackageStatus;
    }

    /**
     * Set <p>套餐状态。取值：active（生效中）、processing（处理中）、failed（创建失败）、isolated（隔离/欠费）、destroyed（已销毁）、used_up（额度用尽）、stopped（已停止）、unpurchased（未购买）。</p>
     * @param PackageStatus <p>套餐状态。取值：active（生效中）、processing（处理中）、failed（创建失败）、isolated（隔离/欠费）、destroyed（已销毁）、used_up（额度用尽）、stopped（已停止）、unpurchased（未购买）。</p>
     */
    public void setPackageStatus(String PackageStatus) {
        this.PackageStatus = PackageStatus;
    }

    /**
     * Get <p>计费资源ID</p> 
     * @return ResourceId <p>计费资源ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>计费资源ID</p>
     * @param ResourceId <p>计费资源ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>总额度。</p> 
     * @return TotalCredits <p>总额度。</p>
     */
    public String getTotalCredits() {
        return this.TotalCredits;
    }

    /**
     * Set <p>总额度。</p>
     * @param TotalCredits <p>总额度。</p>
     */
    public void setTotalCredits(String TotalCredits) {
        this.TotalCredits = TotalCredits;
    }

    /**
     * Get <p>已使用额度。</p> 
     * @return TotalUsed <p>已使用额度。</p>
     */
    public String getTotalUsed() {
        return this.TotalUsed;
    }

    /**
     * Set <p>已使用额度。</p>
     * @param TotalUsed <p>已使用额度。</p>
     */
    public void setTotalUsed(String TotalUsed) {
        this.TotalUsed = TotalUsed;
    }

    /**
     * Get <p>单周期额度。</p> 
     * @return CycleCredits <p>单周期额度。</p>
     */
    public String getCycleCredits() {
        return this.CycleCredits;
    }

    /**
     * Set <p>单周期额度。</p>
     * @param CycleCredits <p>单周期额度。</p>
     */
    public void setCycleCredits(String CycleCredits) {
        this.CycleCredits = CycleCredits;
    }

    /**
     * Get <p>总周期数。</p> 
     * @return TotalCycles <p>总周期数。</p>
     */
    public Long getTotalCycles() {
        return this.TotalCycles;
    }

    /**
     * Set <p>总周期数。</p>
     * @param TotalCycles <p>总周期数。</p>
     */
    public void setTotalCycles(Long TotalCycles) {
        this.TotalCycles = TotalCycles;
    }

    /**
     * Get <p>当前周期序号。</p> 
     * @return CurrentCycle <p>当前周期序号。</p>
     */
    public Long getCurrentCycle() {
        return this.CurrentCycle;
    }

    /**
     * Set <p>当前周期序号。</p>
     * @param CurrentCycle <p>当前周期序号。</p>
     */
    public void setCurrentCycle(Long CurrentCycle) {
        this.CurrentCycle = CurrentCycle;
    }

    /**
     * Get <p>剩余周期数。</p> 
     * @return RemainCycles <p>剩余周期数。</p>
     */
    public Long getRemainCycles() {
        return this.RemainCycles;
    }

    /**
     * Set <p>剩余周期数。</p>
     * @param RemainCycles <p>剩余周期数。</p>
     */
    public void setRemainCycles(Long RemainCycles) {
        this.RemainCycles = RemainCycles;
    }

    /**
     * Get <p>套餐生效时间，ISO 8601 格式。</p> 
     * @return StartTime <p>套餐生效时间，ISO 8601 格式。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>套餐生效时间，ISO 8601 格式。</p>
     * @param StartTime <p>套餐生效时间，ISO 8601 格式。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>套餐过期时间，ISO 8601 格式。</p> 
     * @return ExpireTime <p>套餐过期时间，ISO 8601 格式。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>套餐过期时间，ISO 8601 格式。</p>
     * @param ExpireTime <p>套餐过期时间，ISO 8601 格式。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>当前周期到期日，ISO 8601 格式。</p> 
     * @return PeriodEndDate <p>当前周期到期日，ISO 8601 格式。</p>
     */
    public String getPeriodEndDate() {
        return this.PeriodEndDate;
    }

    /**
     * Set <p>当前周期到期日，ISO 8601 格式。</p>
     * @param PeriodEndDate <p>当前周期到期日，ISO 8601 格式。</p>
     */
    public void setPeriodEndDate(String PeriodEndDate) {
        this.PeriodEndDate = PeriodEndDate;
    }

    /**
     * Get <p>自动续费标识。取值：0（未开启）、1（已开启）。</p> 
     * @return AutoRenewFlag <p>自动续费标识。取值：0（未开启）、1（已开启）。</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标识。取值：0（未开启）、1（已开启）。</p>
     * @param AutoRenewFlag <p>自动续费标识。取值：0（未开启）、1（已开启）。</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>输出token数</p><p>单位：tokens</p> 
     * @return OutputToken <p>输出token数</p><p>单位：tokens</p>
     */
    public Long getOutputToken() {
        return this.OutputToken;
    }

    /**
     * Set <p>输出token数</p><p>单位：tokens</p>
     * @param OutputToken <p>输出token数</p><p>单位：tokens</p>
     */
    public void setOutputToken(Long OutputToken) {
        this.OutputToken = OutputToken;
    }

    /**
     * Get <p>输入token数</p><p>单位：token</p> 
     * @return InputToken <p>输入token数</p><p>单位：token</p>
     */
    public Long getInputToken() {
        return this.InputToken;
    }

    /**
     * Set <p>输入token数</p><p>单位：token</p>
     * @param InputToken <p>输入token数</p><p>单位：token</p>
     */
    public void setInputToken(Long InputToken) {
        this.InputToken = InputToken;
    }

    /**
     * Get <p>缓存命中token数</p><p>单位：token</p> 
     * @return CacheToken <p>缓存命中token数</p><p>单位：token</p>
     */
    public Long getCacheToken() {
        return this.CacheToken;
    }

    /**
     * Set <p>缓存命中token数</p><p>单位：token</p>
     * @param CacheToken <p>缓存命中token数</p><p>单位：token</p>
     */
    public void setCacheToken(Long CacheToken) {
        this.CacheToken = CacheToken;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTokenPlanPersonalPackageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenPlanPersonalPackageResponse(DescribeTokenPlanPersonalPackageResponse source) {
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.PackageStatus != null) {
            this.PackageStatus = new String(source.PackageStatus);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TotalCredits != null) {
            this.TotalCredits = new String(source.TotalCredits);
        }
        if (source.TotalUsed != null) {
            this.TotalUsed = new String(source.TotalUsed);
        }
        if (source.CycleCredits != null) {
            this.CycleCredits = new String(source.CycleCredits);
        }
        if (source.TotalCycles != null) {
            this.TotalCycles = new Long(source.TotalCycles);
        }
        if (source.CurrentCycle != null) {
            this.CurrentCycle = new Long(source.CurrentCycle);
        }
        if (source.RemainCycles != null) {
            this.RemainCycles = new Long(source.RemainCycles);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.PeriodEndDate != null) {
            this.PeriodEndDate = new String(source.PeriodEndDate);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.OutputToken != null) {
            this.OutputToken = new Long(source.OutputToken);
        }
        if (source.InputToken != null) {
            this.InputToken = new Long(source.InputToken);
        }
        if (source.CacheToken != null) {
            this.CacheToken = new Long(source.CacheToken);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "PackageStatus", this.PackageStatus);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TotalCredits", this.TotalCredits);
        this.setParamSimple(map, prefix + "TotalUsed", this.TotalUsed);
        this.setParamSimple(map, prefix + "CycleCredits", this.CycleCredits);
        this.setParamSimple(map, prefix + "TotalCycles", this.TotalCycles);
        this.setParamSimple(map, prefix + "CurrentCycle", this.CurrentCycle);
        this.setParamSimple(map, prefix + "RemainCycles", this.RemainCycles);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "PeriodEndDate", this.PeriodEndDate);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "OutputToken", this.OutputToken);
        this.setParamSimple(map, prefix + "InputToken", this.InputToken);
        this.setParamSimple(map, prefix + "CacheToken", this.CacheToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

