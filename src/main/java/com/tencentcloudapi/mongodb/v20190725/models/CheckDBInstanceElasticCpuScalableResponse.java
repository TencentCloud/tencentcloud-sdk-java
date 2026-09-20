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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckDBInstanceElasticCpuScalableResponse extends AbstractModel {

    /**
    * <p>是否可以进行弹性CPU扩容</p>
    */
    @SerializedName("Scalable")
    @Expose
    private Boolean Scalable;

    /**
    * <p>当前是否处于扩容状态</p>
    */
    @SerializedName("IsScaled")
    @Expose
    private Boolean IsScaled;

    /**
    * <p>实例是否被锁定（有流程在执行）</p>
    */
    @SerializedName("IsLocked")
    @Expose
    private Boolean IsLocked;

    /**
    * <p>不可扩容的原因</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>最大可扩容的CPU核数，MIN(最小分片CPU核数, 24)</p>
    */
    @SerializedName("MaxExtraCpu")
    @Expose
    private Long MaxExtraCpu;

    /**
    * <p>当前扩容的CPU核数（如果处于扩容状态）</p>
    */
    @SerializedName("ExtraCpu")
    @Expose
    private Long ExtraCpu;

    /**
    * <p>扩容触发类型: 1-手动, 2-周期, 3-一次性时间段, 4-监控</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * <p>扩容时间</p>
    */
    @SerializedName("ScaleUpTime")
    @Expose
    private String ScaleUpTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>是否可以进行弹性CPU扩容</p> 
     * @return Scalable <p>是否可以进行弹性CPU扩容</p>
     */
    public Boolean getScalable() {
        return this.Scalable;
    }

    /**
     * Set <p>是否可以进行弹性CPU扩容</p>
     * @param Scalable <p>是否可以进行弹性CPU扩容</p>
     */
    public void setScalable(Boolean Scalable) {
        this.Scalable = Scalable;
    }

    /**
     * Get <p>当前是否处于扩容状态</p> 
     * @return IsScaled <p>当前是否处于扩容状态</p>
     */
    public Boolean getIsScaled() {
        return this.IsScaled;
    }

    /**
     * Set <p>当前是否处于扩容状态</p>
     * @param IsScaled <p>当前是否处于扩容状态</p>
     */
    public void setIsScaled(Boolean IsScaled) {
        this.IsScaled = IsScaled;
    }

    /**
     * Get <p>实例是否被锁定（有流程在执行）</p> 
     * @return IsLocked <p>实例是否被锁定（有流程在执行）</p>
     */
    public Boolean getIsLocked() {
        return this.IsLocked;
    }

    /**
     * Set <p>实例是否被锁定（有流程在执行）</p>
     * @param IsLocked <p>实例是否被锁定（有流程在执行）</p>
     */
    public void setIsLocked(Boolean IsLocked) {
        this.IsLocked = IsLocked;
    }

    /**
     * Get <p>不可扩容的原因</p> 
     * @return Reason <p>不可扩容的原因</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>不可扩容的原因</p>
     * @param Reason <p>不可扩容的原因</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>最大可扩容的CPU核数，MIN(最小分片CPU核数, 24)</p> 
     * @return MaxExtraCpu <p>最大可扩容的CPU核数，MIN(最小分片CPU核数, 24)</p>
     */
    public Long getMaxExtraCpu() {
        return this.MaxExtraCpu;
    }

    /**
     * Set <p>最大可扩容的CPU核数，MIN(最小分片CPU核数, 24)</p>
     * @param MaxExtraCpu <p>最大可扩容的CPU核数，MIN(最小分片CPU核数, 24)</p>
     */
    public void setMaxExtraCpu(Long MaxExtraCpu) {
        this.MaxExtraCpu = MaxExtraCpu;
    }

    /**
     * Get <p>当前扩容的CPU核数（如果处于扩容状态）</p> 
     * @return ExtraCpu <p>当前扩容的CPU核数（如果处于扩容状态）</p>
     */
    public Long getExtraCpu() {
        return this.ExtraCpu;
    }

    /**
     * Set <p>当前扩容的CPU核数（如果处于扩容状态）</p>
     * @param ExtraCpu <p>当前扩容的CPU核数（如果处于扩容状态）</p>
     */
    public void setExtraCpu(Long ExtraCpu) {
        this.ExtraCpu = ExtraCpu;
    }

    /**
     * Get <p>扩容触发类型: 1-手动, 2-周期, 3-一次性时间段, 4-监控</p> 
     * @return TriggerType <p>扩容触发类型: 1-手动, 2-周期, 3-一次性时间段, 4-监控</p>
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>扩容触发类型: 1-手动, 2-周期, 3-一次性时间段, 4-监控</p>
     * @param TriggerType <p>扩容触发类型: 1-手动, 2-周期, 3-一次性时间段, 4-监控</p>
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>扩容时间</p> 
     * @return ScaleUpTime <p>扩容时间</p>
     */
    public String getScaleUpTime() {
        return this.ScaleUpTime;
    }

    /**
     * Set <p>扩容时间</p>
     * @param ScaleUpTime <p>扩容时间</p>
     */
    public void setScaleUpTime(String ScaleUpTime) {
        this.ScaleUpTime = ScaleUpTime;
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

    public CheckDBInstanceElasticCpuScalableResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckDBInstanceElasticCpuScalableResponse(CheckDBInstanceElasticCpuScalableResponse source) {
        if (source.Scalable != null) {
            this.Scalable = new Boolean(source.Scalable);
        }
        if (source.IsScaled != null) {
            this.IsScaled = new Boolean(source.IsScaled);
        }
        if (source.IsLocked != null) {
            this.IsLocked = new Boolean(source.IsLocked);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.MaxExtraCpu != null) {
            this.MaxExtraCpu = new Long(source.MaxExtraCpu);
        }
        if (source.ExtraCpu != null) {
            this.ExtraCpu = new Long(source.ExtraCpu);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.ScaleUpTime != null) {
            this.ScaleUpTime = new String(source.ScaleUpTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scalable", this.Scalable);
        this.setParamSimple(map, prefix + "IsScaled", this.IsScaled);
        this.setParamSimple(map, prefix + "IsLocked", this.IsLocked);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "MaxExtraCpu", this.MaxExtraCpu);
        this.setParamSimple(map, prefix + "ExtraCpu", this.ExtraCpu);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "ScaleUpTime", this.ScaleUpTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

