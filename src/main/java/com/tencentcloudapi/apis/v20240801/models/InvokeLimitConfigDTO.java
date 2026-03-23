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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeLimitConfigDTO extends AbstractModel {

    /**
    * Type类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 令牌桶最大容量

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenBucketMaxNum")
    @Expose
    private Long TokenBucketMaxNum;

    /**
    * 令牌生成速率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenBucketRate")
    @Expose
    private Long TokenBucketRate;

    /**
    * 漏斗容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FunnelMaxNum")
    @Expose
    private Long FunnelMaxNum;

    /**
    * 漏嘴流速
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FunnelRate")
    @Expose
    private Long FunnelRate;

    /**
    * 滑动窗口最大请求数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlidingWindowMaxNum")
    @Expose
    private Long SlidingWindowMaxNum;

    /**
    * 滑动窗口长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlidingWindowSize")
    @Expose
    private Long SlidingWindowSize;

    /**
    * 时间窗口最大请求数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeWindow")
    @Expose
    private Long TimeWindow;

    /**
    * 时间窗口长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeWindowInterval")
    @Expose
    private Long TimeWindowInterval;

    /**
    * 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get Type类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type Type类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type Type类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 令牌桶最大容量

注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenBucketMaxNum 令牌桶最大容量

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTokenBucketMaxNum() {
        return this.TokenBucketMaxNum;
    }

    /**
     * Set 令牌桶最大容量

注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenBucketMaxNum 令牌桶最大容量

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenBucketMaxNum(Long TokenBucketMaxNum) {
        this.TokenBucketMaxNum = TokenBucketMaxNum;
    }

    /**
     * Get 令牌生成速率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenBucketRate 令牌生成速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTokenBucketRate() {
        return this.TokenBucketRate;
    }

    /**
     * Set 令牌生成速率
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenBucketRate 令牌生成速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenBucketRate(Long TokenBucketRate) {
        this.TokenBucketRate = TokenBucketRate;
    }

    /**
     * Get 漏斗容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FunnelMaxNum 漏斗容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFunnelMaxNum() {
        return this.FunnelMaxNum;
    }

    /**
     * Set 漏斗容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FunnelMaxNum 漏斗容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunnelMaxNum(Long FunnelMaxNum) {
        this.FunnelMaxNum = FunnelMaxNum;
    }

    /**
     * Get 漏嘴流速
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FunnelRate 漏嘴流速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFunnelRate() {
        return this.FunnelRate;
    }

    /**
     * Set 漏嘴流速
注意：此字段可能返回 null，表示取不到有效值。
     * @param FunnelRate 漏嘴流速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunnelRate(Long FunnelRate) {
        this.FunnelRate = FunnelRate;
    }

    /**
     * Get 滑动窗口最大请求数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlidingWindowMaxNum 滑动窗口最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSlidingWindowMaxNum() {
        return this.SlidingWindowMaxNum;
    }

    /**
     * Set 滑动窗口最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlidingWindowMaxNum 滑动窗口最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlidingWindowMaxNum(Long SlidingWindowMaxNum) {
        this.SlidingWindowMaxNum = SlidingWindowMaxNum;
    }

    /**
     * Get 滑动窗口长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlidingWindowSize 滑动窗口长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSlidingWindowSize() {
        return this.SlidingWindowSize;
    }

    /**
     * Set 滑动窗口长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlidingWindowSize 滑动窗口长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlidingWindowSize(Long SlidingWindowSize) {
        this.SlidingWindowSize = SlidingWindowSize;
    }

    /**
     * Get 时间窗口最大请求数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeWindow 时间窗口最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeWindow() {
        return this.TimeWindow;
    }

    /**
     * Set 时间窗口最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeWindow 时间窗口最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeWindow(Long TimeWindow) {
        this.TimeWindow = TimeWindow;
    }

    /**
     * Get 时间窗口长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeWindowInterval 时间窗口长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeWindowInterval() {
        return this.TimeWindowInterval;
    }

    /**
     * Set 时间窗口长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeWindowInterval 时间窗口长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeWindowInterval(Long TimeWindowInterval) {
        this.TimeWindowInterval = TimeWindowInterval;
    }

    /**
     * Get 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timeout 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timeout 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public InvokeLimitConfigDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeLimitConfigDTO(InvokeLimitConfigDTO source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TokenBucketMaxNum != null) {
            this.TokenBucketMaxNum = new Long(source.TokenBucketMaxNum);
        }
        if (source.TokenBucketRate != null) {
            this.TokenBucketRate = new Long(source.TokenBucketRate);
        }
        if (source.FunnelMaxNum != null) {
            this.FunnelMaxNum = new Long(source.FunnelMaxNum);
        }
        if (source.FunnelRate != null) {
            this.FunnelRate = new Long(source.FunnelRate);
        }
        if (source.SlidingWindowMaxNum != null) {
            this.SlidingWindowMaxNum = new Long(source.SlidingWindowMaxNum);
        }
        if (source.SlidingWindowSize != null) {
            this.SlidingWindowSize = new Long(source.SlidingWindowSize);
        }
        if (source.TimeWindow != null) {
            this.TimeWindow = new Long(source.TimeWindow);
        }
        if (source.TimeWindowInterval != null) {
            this.TimeWindowInterval = new Long(source.TimeWindowInterval);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TokenBucketMaxNum", this.TokenBucketMaxNum);
        this.setParamSimple(map, prefix + "TokenBucketRate", this.TokenBucketRate);
        this.setParamSimple(map, prefix + "FunnelMaxNum", this.FunnelMaxNum);
        this.setParamSimple(map, prefix + "FunnelRate", this.FunnelRate);
        this.setParamSimple(map, prefix + "SlidingWindowMaxNum", this.SlidingWindowMaxNum);
        this.setParamSimple(map, prefix + "SlidingWindowSize", this.SlidingWindowSize);
        this.setParamSimple(map, prefix + "TimeWindow", this.TimeWindow);
        this.setParamSimple(map, prefix + "TimeWindowInterval", this.TimeWindowInterval);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

