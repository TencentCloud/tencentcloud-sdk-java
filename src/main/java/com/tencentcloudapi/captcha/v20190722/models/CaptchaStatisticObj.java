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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CaptchaStatisticObj extends AbstractModel {

    /**
    * <p>请求总量</p>
    */
    @SerializedName("ActionTotal")
    @Expose
    private Long ActionTotal;

    /**
    * <p>验证总量</p>
    */
    @SerializedName("VerifyTotal")
    @Expose
    private Long VerifyTotal;

    /**
    * <p>验证通过总量</p>
    */
    @SerializedName("VerifyThroughTotal")
    @Expose
    private Long VerifyThroughTotal;

    /**
    * <p>验证拦截总量</p>
    */
    @SerializedName("VerifyInterceptTotal")
    @Expose
    private Long VerifyInterceptTotal;

    /**
    * <p>票据校验总量</p>
    */
    @SerializedName("TicketTotal")
    @Expose
    private Long TicketTotal;

    /**
    * <p>票据通过总量</p>
    */
    @SerializedName("TicketThroughTotal")
    @Expose
    private Long TicketThroughTotal;

    /**
    * <p>票据拦截总量</p>
    */
    @SerializedName("TicketInterceptTotal")
    @Expose
    private Long TicketInterceptTotal;

    /**
    * <p>请求趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestTrend")
    @Expose
    private RequestTrendObj [] RequestTrend;

    /**
    * <p>拦截率趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InterceptPerTrend")
    @Expose
    private InterceptPerTrendObj [] InterceptPerTrend;

    /**
    * <p>票据校验趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TicketCheckTrend")
    @Expose
    private TicketCheckTrendObj [] TicketCheckTrend;

    /**
     * Get <p>请求总量</p> 
     * @return ActionTotal <p>请求总量</p>
     */
    public Long getActionTotal() {
        return this.ActionTotal;
    }

    /**
     * Set <p>请求总量</p>
     * @param ActionTotal <p>请求总量</p>
     */
    public void setActionTotal(Long ActionTotal) {
        this.ActionTotal = ActionTotal;
    }

    /**
     * Get <p>验证总量</p> 
     * @return VerifyTotal <p>验证总量</p>
     */
    public Long getVerifyTotal() {
        return this.VerifyTotal;
    }

    /**
     * Set <p>验证总量</p>
     * @param VerifyTotal <p>验证总量</p>
     */
    public void setVerifyTotal(Long VerifyTotal) {
        this.VerifyTotal = VerifyTotal;
    }

    /**
     * Get <p>验证通过总量</p> 
     * @return VerifyThroughTotal <p>验证通过总量</p>
     */
    public Long getVerifyThroughTotal() {
        return this.VerifyThroughTotal;
    }

    /**
     * Set <p>验证通过总量</p>
     * @param VerifyThroughTotal <p>验证通过总量</p>
     */
    public void setVerifyThroughTotal(Long VerifyThroughTotal) {
        this.VerifyThroughTotal = VerifyThroughTotal;
    }

    /**
     * Get <p>验证拦截总量</p> 
     * @return VerifyInterceptTotal <p>验证拦截总量</p>
     */
    public Long getVerifyInterceptTotal() {
        return this.VerifyInterceptTotal;
    }

    /**
     * Set <p>验证拦截总量</p>
     * @param VerifyInterceptTotal <p>验证拦截总量</p>
     */
    public void setVerifyInterceptTotal(Long VerifyInterceptTotal) {
        this.VerifyInterceptTotal = VerifyInterceptTotal;
    }

    /**
     * Get <p>票据校验总量</p> 
     * @return TicketTotal <p>票据校验总量</p>
     */
    public Long getTicketTotal() {
        return this.TicketTotal;
    }

    /**
     * Set <p>票据校验总量</p>
     * @param TicketTotal <p>票据校验总量</p>
     */
    public void setTicketTotal(Long TicketTotal) {
        this.TicketTotal = TicketTotal;
    }

    /**
     * Get <p>票据通过总量</p> 
     * @return TicketThroughTotal <p>票据通过总量</p>
     */
    public Long getTicketThroughTotal() {
        return this.TicketThroughTotal;
    }

    /**
     * Set <p>票据通过总量</p>
     * @param TicketThroughTotal <p>票据通过总量</p>
     */
    public void setTicketThroughTotal(Long TicketThroughTotal) {
        this.TicketThroughTotal = TicketThroughTotal;
    }

    /**
     * Get <p>票据拦截总量</p> 
     * @return TicketInterceptTotal <p>票据拦截总量</p>
     */
    public Long getTicketInterceptTotal() {
        return this.TicketInterceptTotal;
    }

    /**
     * Set <p>票据拦截总量</p>
     * @param TicketInterceptTotal <p>票据拦截总量</p>
     */
    public void setTicketInterceptTotal(Long TicketInterceptTotal) {
        this.TicketInterceptTotal = TicketInterceptTotal;
    }

    /**
     * Get <p>请求趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestTrend <p>请求趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RequestTrendObj [] getRequestTrend() {
        return this.RequestTrend;
    }

    /**
     * Set <p>请求趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestTrend <p>请求趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestTrend(RequestTrendObj [] RequestTrend) {
        this.RequestTrend = RequestTrend;
    }

    /**
     * Get <p>拦截率趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InterceptPerTrend <p>拦截率趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InterceptPerTrendObj [] getInterceptPerTrend() {
        return this.InterceptPerTrend;
    }

    /**
     * Set <p>拦截率趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InterceptPerTrend <p>拦截率趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterceptPerTrend(InterceptPerTrendObj [] InterceptPerTrend) {
        this.InterceptPerTrend = InterceptPerTrend;
    }

    /**
     * Get <p>票据校验趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TicketCheckTrend <p>票据校验趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TicketCheckTrendObj [] getTicketCheckTrend() {
        return this.TicketCheckTrend;
    }

    /**
     * Set <p>票据校验趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TicketCheckTrend <p>票据校验趋势图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTicketCheckTrend(TicketCheckTrendObj [] TicketCheckTrend) {
        this.TicketCheckTrend = TicketCheckTrend;
    }

    public CaptchaStatisticObj() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CaptchaStatisticObj(CaptchaStatisticObj source) {
        if (source.ActionTotal != null) {
            this.ActionTotal = new Long(source.ActionTotal);
        }
        if (source.VerifyTotal != null) {
            this.VerifyTotal = new Long(source.VerifyTotal);
        }
        if (source.VerifyThroughTotal != null) {
            this.VerifyThroughTotal = new Long(source.VerifyThroughTotal);
        }
        if (source.VerifyInterceptTotal != null) {
            this.VerifyInterceptTotal = new Long(source.VerifyInterceptTotal);
        }
        if (source.TicketTotal != null) {
            this.TicketTotal = new Long(source.TicketTotal);
        }
        if (source.TicketThroughTotal != null) {
            this.TicketThroughTotal = new Long(source.TicketThroughTotal);
        }
        if (source.TicketInterceptTotal != null) {
            this.TicketInterceptTotal = new Long(source.TicketInterceptTotal);
        }
        if (source.RequestTrend != null) {
            this.RequestTrend = new RequestTrendObj[source.RequestTrend.length];
            for (int i = 0; i < source.RequestTrend.length; i++) {
                this.RequestTrend[i] = new RequestTrendObj(source.RequestTrend[i]);
            }
        }
        if (source.InterceptPerTrend != null) {
            this.InterceptPerTrend = new InterceptPerTrendObj[source.InterceptPerTrend.length];
            for (int i = 0; i < source.InterceptPerTrend.length; i++) {
                this.InterceptPerTrend[i] = new InterceptPerTrendObj(source.InterceptPerTrend[i]);
            }
        }
        if (source.TicketCheckTrend != null) {
            this.TicketCheckTrend = new TicketCheckTrendObj[source.TicketCheckTrend.length];
            for (int i = 0; i < source.TicketCheckTrend.length; i++) {
                this.TicketCheckTrend[i] = new TicketCheckTrendObj(source.TicketCheckTrend[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionTotal", this.ActionTotal);
        this.setParamSimple(map, prefix + "VerifyTotal", this.VerifyTotal);
        this.setParamSimple(map, prefix + "VerifyThroughTotal", this.VerifyThroughTotal);
        this.setParamSimple(map, prefix + "VerifyInterceptTotal", this.VerifyInterceptTotal);
        this.setParamSimple(map, prefix + "TicketTotal", this.TicketTotal);
        this.setParamSimple(map, prefix + "TicketThroughTotal", this.TicketThroughTotal);
        this.setParamSimple(map, prefix + "TicketInterceptTotal", this.TicketInterceptTotal);
        this.setParamArrayObj(map, prefix + "RequestTrend.", this.RequestTrend);
        this.setParamArrayObj(map, prefix + "InterceptPerTrend.", this.InterceptPerTrend);
        this.setParamArrayObj(map, prefix + "TicketCheckTrend.", this.TicketCheckTrend);

    }
}

