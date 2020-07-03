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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BandwidthAlert extends AbstractModel{

    /**
    * 带宽封顶配置开关
on：开启
off：关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 带宽封顶阈值，单位为bps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BpsThreshold")
    @Expose
    private Long BpsThreshold;

    /**
    * 达到阈值后的操作
RESOLVE_DNS_TO_ORIGIN：直接回源，仅自有源站域名支持
RETURN_404：全部请求返回 404
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CounterMeasure")
    @Expose
    private String CounterMeasure;

    /**
    * 上次触发带宽封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTriggerTime")
    @Expose
    private String LastTriggerTime;

    /**
     * Get 带宽封顶配置开关
on：开启
off：关闭 
     * @return Switch 带宽封顶配置开关
on：开启
off：关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 带宽封顶配置开关
on：开启
off：关闭
     * @param Switch 带宽封顶配置开关
on：开启
off：关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 带宽封顶阈值，单位为bps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BpsThreshold 带宽封顶阈值，单位为bps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBpsThreshold() {
        return this.BpsThreshold;
    }

    /**
     * Set 带宽封顶阈值，单位为bps
注意：此字段可能返回 null，表示取不到有效值。
     * @param BpsThreshold 带宽封顶阈值，单位为bps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBpsThreshold(Long BpsThreshold) {
        this.BpsThreshold = BpsThreshold;
    }

    /**
     * Get 达到阈值后的操作
RESOLVE_DNS_TO_ORIGIN：直接回源，仅自有源站域名支持
RETURN_404：全部请求返回 404
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CounterMeasure 达到阈值后的操作
RESOLVE_DNS_TO_ORIGIN：直接回源，仅自有源站域名支持
RETURN_404：全部请求返回 404
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCounterMeasure() {
        return this.CounterMeasure;
    }

    /**
     * Set 达到阈值后的操作
RESOLVE_DNS_TO_ORIGIN：直接回源，仅自有源站域名支持
RETURN_404：全部请求返回 404
注意：此字段可能返回 null，表示取不到有效值。
     * @param CounterMeasure 达到阈值后的操作
RESOLVE_DNS_TO_ORIGIN：直接回源，仅自有源站域名支持
RETURN_404：全部请求返回 404
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCounterMeasure(String CounterMeasure) {
        this.CounterMeasure = CounterMeasure;
    }

    /**
     * Get 上次触发带宽封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTriggerTime 上次触发带宽封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTriggerTime() {
        return this.LastTriggerTime;
    }

    /**
     * Set 上次触发带宽封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTriggerTime 上次触发带宽封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTriggerTime(String LastTriggerTime) {
        this.LastTriggerTime = LastTriggerTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "BpsThreshold", this.BpsThreshold);
        this.setParamSimple(map, prefix + "CounterMeasure", this.CounterMeasure);
        this.setParamSimple(map, prefix + "LastTriggerTime", this.LastTriggerTime);

    }
}

