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

public class CreateAigcQuotaRequest extends AbstractModel {

    /**
    * <p><strong>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</strong></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>配额类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li><li>Text： AIGC 生文任务</li></ul>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>任务的配额数。</p><p>单位：张/秒/token数。</p><ul><li>当 QuotaType 为 Image 时，单位为张；</li><li>当 QuotaType 为 Video 时，单位为秒；</li><li>当 QuotaType 为 Text 时，单位为 token 数。</li></ul>
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
    * <p>仅当QuotaType=Text时有效，用于选择需要进行配额限制ApiToken</p>
    */
    @SerializedName("ApiToken")
    @Expose
    private String ApiToken;

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
    * <p>是否开启按单个模型设置配额</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul>
    */
    @SerializedName("ModelQuotaSwitch")
    @Expose
    private String ModelQuotaSwitch;

    /**
    * <p>按单个模型设置的配额，仅ModelQuotaSwitch=ON时有效。</p>
    */
    @SerializedName("ModelQuotas")
    @Expose
    private AigcModelQuota [] ModelQuotas;

    /**
     * Get <p><strong>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</strong></p> 
     * @return SubAppId <p><strong>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</strong></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><strong>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</strong></p>
     * @param SubAppId <p><strong>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</strong></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

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
     * Get <p>任务的配额数。</p><p>单位：张/秒/token数。</p><ul><li>当 QuotaType 为 Image 时，单位为张；</li><li>当 QuotaType 为 Video 时，单位为秒；</li><li>当 QuotaType 为 Text 时，单位为 token 数。</li></ul> 
     * @return QuotaLimit <p>任务的配额数。</p><p>单位：张/秒/token数。</p><ul><li>当 QuotaType 为 Image 时，单位为张；</li><li>当 QuotaType 为 Video 时，单位为秒；</li><li>当 QuotaType 为 Text 时，单位为 token 数。</li></ul>
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set <p>任务的配额数。</p><p>单位：张/秒/token数。</p><ul><li>当 QuotaType 为 Image 时，单位为张；</li><li>当 QuotaType 为 Video 时，单位为秒；</li><li>当 QuotaType 为 Text 时，单位为 token 数。</li></ul>
     * @param QuotaLimit <p>任务的配额数。</p><p>单位：张/秒/token数。</p><ul><li>当 QuotaType 为 Image 时，单位为张；</li><li>当 QuotaType 为 Video 时，单位为秒；</li><li>当 QuotaType 为 Text 时，单位为 token 数。</li></ul>
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    /**
     * Get <p>仅当QuotaType=Text时有效，用于选择需要进行配额限制ApiToken</p> 
     * @return ApiToken <p>仅当QuotaType=Text时有效，用于选择需要进行配额限制ApiToken</p>
     */
    public String getApiToken() {
        return this.ApiToken;
    }

    /**
     * Set <p>仅当QuotaType=Text时有效，用于选择需要进行配额限制ApiToken</p>
     * @param ApiToken <p>仅当QuotaType=Text时有效，用于选择需要进行配额限制ApiToken</p>
     */
    public void setApiToken(String ApiToken) {
        this.ApiToken = ApiToken;
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
     * Get <p>是否开启按单个模型设置配额</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul> 
     * @return ModelQuotaSwitch <p>是否开启按单个模型设置配额</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul>
     */
    public String getModelQuotaSwitch() {
        return this.ModelQuotaSwitch;
    }

    /**
     * Set <p>是否开启按单个模型设置配额</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul>
     * @param ModelQuotaSwitch <p>是否开启按单个模型设置配额</p><p>枚举值：</p><ul><li>ON： 打开</li><li>OFF： 关闭</li></ul>
     */
    public void setModelQuotaSwitch(String ModelQuotaSwitch) {
        this.ModelQuotaSwitch = ModelQuotaSwitch;
    }

    /**
     * Get <p>按单个模型设置的配额，仅ModelQuotaSwitch=ON时有效。</p> 
     * @return ModelQuotas <p>按单个模型设置的配额，仅ModelQuotaSwitch=ON时有效。</p>
     */
    public AigcModelQuota [] getModelQuotas() {
        return this.ModelQuotas;
    }

    /**
     * Set <p>按单个模型设置的配额，仅ModelQuotaSwitch=ON时有效。</p>
     * @param ModelQuotas <p>按单个模型设置的配额，仅ModelQuotaSwitch=ON时有效。</p>
     */
    public void setModelQuotas(AigcModelQuota [] ModelQuotas) {
        this.ModelQuotas = ModelQuotas;
    }

    public CreateAigcQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcQuotaRequest(CreateAigcQuotaRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
        if (source.ApiToken != null) {
            this.ApiToken = new String(source.ApiToken);
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
            this.ModelQuotas = new AigcModelQuota[source.ModelQuotas.length];
            for (int i = 0; i < source.ModelQuotas.length; i++) {
                this.ModelQuotas[i] = new AigcModelQuota(source.ModelQuotas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);
        this.setParamSimple(map, prefix + "ApiToken", this.ApiToken);
        this.setParamSimple(map, prefix + "QuotaPeriod", this.QuotaPeriod);
        this.setParamSimple(map, prefix + "ResetDay", this.ResetDay);
        this.setParamSimple(map, prefix + "ModelQuotaSwitch", this.ModelQuotaSwitch);
        this.setParamArrayObj(map, prefix + "ModelQuotas.", this.ModelQuotas);

    }
}

