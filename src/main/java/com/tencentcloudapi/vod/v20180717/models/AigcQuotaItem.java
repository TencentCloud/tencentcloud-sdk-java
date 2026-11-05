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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcQuotaItem extends AbstractModel {

    /**
    * <p>配额类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li><li>Text： AIGC 生文任务</li></ul>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>仅当QuotaLimit=Text时有效，用于选择需要进行配额限制ApiToken</p>
    */
    @SerializedName("ApiToken")
    @Expose
    private String ApiToken;

    /**
    * <p>任务的配额数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
    * <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

    /**
    * <p>配额重置周期。</p><p>枚举值：</p><ul><li>Day： 每天重置。</li><li>Month： 每月指定日期重置。</li><li>Total： 永不重置，QuotaLimit参数即为总额度。</li></ul>
    */
    @SerializedName("QuotaPeriod")
    @Expose
    private String QuotaPeriod;

    /**
    * <p>每月配额的重置日期，仅QuotaPeriod=Month时有效。</p><p>如果当月无所选日期时，顺延至次月 1 日 00:00 重置。</p>
    */
    @SerializedName("ResetDay")
    @Expose
    private Long ResetDay;

    /**
    * <p>是否开启按单个模型设置配额</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
    */
    @SerializedName("ModelQuotaSwitch")
    @Expose
    private String ModelQuotaSwitch;

    /**
    * <p>按单个模型设置的配额，仅ModelQuotaSwitch=ON时有效。</p>
    */
    @SerializedName("ModelQuotas")
    @Expose
    private AigcModelQuotaWithUsage [] ModelQuotas;

    /**
     * Get <p>配额类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li><li>Text： AIGC 生文任务</li></ul> 
     * @return QuotaType <p>配额类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li><li>Text： AIGC 生文任务</li></ul>
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set <p>配额类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li><li>Text： AIGC 生文任务</li></ul>
     * @param QuotaType <p>配额类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li><li>Text： AIGC 生文任务</li></ul>
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get <p>仅当QuotaLimit=Text时有效，用于选择需要进行配额限制ApiToken</p> 
     * @return ApiToken <p>仅当QuotaLimit=Text时有效，用于选择需要进行配额限制ApiToken</p>
     */
    public String getApiToken() {
        return this.ApiToken;
    }

    /**
     * Set <p>仅当QuotaLimit=Text时有效，用于选择需要进行配额限制ApiToken</p>
     * @param ApiToken <p>仅当QuotaLimit=Text时有效，用于选择需要进行配额限制ApiToken</p>
     */
    public void setApiToken(String ApiToken) {
        this.ApiToken = ApiToken;
    }

    /**
     * Get <p>任务的配额数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul> 
     * @return QuotaLimit <p>任务的配额数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set <p>任务的配额数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
     * @param QuotaLimit <p>任务的配额数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    /**
     * Get <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul> 
     * @return Usage <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
     * @param Usage <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
     */
    public void setUsage(Long Usage) {
        this.Usage = Usage;
    }

    /**
     * Get <p>配额重置周期。</p><p>枚举值：</p><ul><li>Day： 每天重置。</li><li>Month： 每月指定日期重置。</li><li>Total： 永不重置，QuotaLimit参数即为总额度。</li></ul> 
     * @return QuotaPeriod <p>配额重置周期。</p><p>枚举值：</p><ul><li>Day： 每天重置。</li><li>Month： 每月指定日期重置。</li><li>Total： 永不重置，QuotaLimit参数即为总额度。</li></ul>
     */
    public String getQuotaPeriod() {
        return this.QuotaPeriod;
    }

    /**
     * Set <p>配额重置周期。</p><p>枚举值：</p><ul><li>Day： 每天重置。</li><li>Month： 每月指定日期重置。</li><li>Total： 永不重置，QuotaLimit参数即为总额度。</li></ul>
     * @param QuotaPeriod <p>配额重置周期。</p><p>枚举值：</p><ul><li>Day： 每天重置。</li><li>Month： 每月指定日期重置。</li><li>Total： 永不重置，QuotaLimit参数即为总额度。</li></ul>
     */
    public void setQuotaPeriod(String QuotaPeriod) {
        this.QuotaPeriod = QuotaPeriod;
    }

    /**
     * Get <p>每月配额的重置日期，仅QuotaPeriod=Month时有效。</p><p>如果当月无所选日期时，顺延至次月 1 日 00:00 重置。</p> 
     * @return ResetDay <p>每月配额的重置日期，仅QuotaPeriod=Month时有效。</p><p>如果当月无所选日期时，顺延至次月 1 日 00:00 重置。</p>
     */
    public Long getResetDay() {
        return this.ResetDay;
    }

    /**
     * Set <p>每月配额的重置日期，仅QuotaPeriod=Month时有效。</p><p>如果当月无所选日期时，顺延至次月 1 日 00:00 重置。</p>
     * @param ResetDay <p>每月配额的重置日期，仅QuotaPeriod=Month时有效。</p><p>如果当月无所选日期时，顺延至次月 1 日 00:00 重置。</p>
     */
    public void setResetDay(Long ResetDay) {
        this.ResetDay = ResetDay;
    }

    /**
     * Get <p>是否开启按单个模型设置配额</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p> 
     * @return ModelQuotaSwitch <p>是否开启按单个模型设置配额</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
     */
    public String getModelQuotaSwitch() {
        return this.ModelQuotaSwitch;
    }

    /**
     * Set <p>是否开启按单个模型设置配额</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
     * @param ModelQuotaSwitch <p>是否开启按单个模型设置配额</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
     */
    public void setModelQuotaSwitch(String ModelQuotaSwitch) {
        this.ModelQuotaSwitch = ModelQuotaSwitch;
    }

    /**
     * Get <p>按单个模型设置的配额，仅ModelQuotaSwitch=ON时有效。</p> 
     * @return ModelQuotas <p>按单个模型设置的配额，仅ModelQuotaSwitch=ON时有效。</p>
     */
    public AigcModelQuotaWithUsage [] getModelQuotas() {
        return this.ModelQuotas;
    }

    /**
     * Set <p>按单个模型设置的配额，仅ModelQuotaSwitch=ON时有效。</p>
     * @param ModelQuotas <p>按单个模型设置的配额，仅ModelQuotaSwitch=ON时有效。</p>
     */
    public void setModelQuotas(AigcModelQuotaWithUsage [] ModelQuotas) {
        this.ModelQuotas = ModelQuotas;
    }

    public AigcQuotaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcQuotaItem(AigcQuotaItem source) {
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.ApiToken != null) {
            this.ApiToken = new String(source.ApiToken);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
        if (source.QuotaPeriod != null) {
            this.QuotaPeriod = new String(source.QuotaPeriod);
        }
        if (source.ResetDay != null) {
            this.ResetDay = new Long(source.ResetDay);
        }
        if (source.ModelQuotaSwitch != null) {
            this.ModelQuotaSwitch = new String(source.ModelQuotaSwitch);
        }
        if (source.ModelQuotas != null) {
            this.ModelQuotas = new AigcModelQuotaWithUsage[source.ModelQuotas.length];
            for (int i = 0; i < source.ModelQuotas.length; i++) {
                this.ModelQuotas[i] = new AigcModelQuotaWithUsage(source.ModelQuotas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "ApiToken", this.ApiToken);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "QuotaPeriod", this.QuotaPeriod);
        this.setParamSimple(map, prefix + "ResetDay", this.ResetDay);
        this.setParamSimple(map, prefix + "ModelQuotaSwitch", this.ModelQuotaSwitch);
        this.setParamArrayObj(map, prefix + "ModelQuotas.", this.ModelQuotas);

    }
}

