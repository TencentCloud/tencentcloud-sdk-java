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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientAttester extends AbstractModel {

    /**
    * <p>认证选项 ID。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>认证选项名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>认证规则类型。仅出参返回，取值有：</p><li>PRESET: 系统预置规则，仅允许修改 AttesterDuration；</li><li>CUSTOM: 用户自定义规则。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>认证方法。取值有：</p><li>TC-RCE: 使用风险识别 RCE 进行认证；</li><li>TC-CAPTCHA: 使用天御验证码进行认证；</li><li>TC-EO-CAPTCHA: 使用 EdgeOne 人机校验进行认证。</li>
    */
    @SerializedName("AttesterSource")
    @Expose
    private String AttesterSource;

    /**
    * <p>认证有效时间。默认为 60s，支持的单位有：</p><li>s：秒，取值范围 60～43200；</li><li>m：分，取值范围 1～720；</li><li>h：小时，取值范围 1～12。</li>
    */
    @SerializedName("AttesterDuration")
    @Expose
    private String AttesterDuration;

    /**
    * <p>是否开启认证结果使用限制。 </p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul><p>默认值：off</p>
    */
    @SerializedName("UsageLimit")
    @Expose
    private String UsageLimit;

    /**
    * <p>认证结果最大使用次数。当 UsageLimit 为 on 时，此字段必填。</p><p>取值范围：[1, 100000]</p>
    */
    @SerializedName("MaxUsageCount")
    @Expose
    private Long MaxUsageCount;

    /**
    * <p>TC-RCE 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-RCE 时，此字段必填。</li>
    */
    @SerializedName("TCRCEOption")
    @Expose
    private TCRCEOption TCRCEOption;

    /**
    * <p>TC-CAPTCHA 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-CAPTCHA 时，此字段必填。</li>
    */
    @SerializedName("TCCaptchaOption")
    @Expose
    private TCCaptchaOption TCCaptchaOption;

    /**
    * <p>TC-EO-CAPTCHA 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-EO-CAPTCHA 时，此字段必填。</li>
    */
    @SerializedName("TCEOCaptchaOption")
    @Expose
    private TCEOCaptchaOption TCEOCaptchaOption;

    /**
     * Get <p>认证选项 ID。</p> 
     * @return Id <p>认证选项 ID。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>认证选项 ID。</p>
     * @param Id <p>认证选项 ID。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>认证选项名称。</p> 
     * @return Name <p>认证选项名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>认证选项名称。</p>
     * @param Name <p>认证选项名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>认证规则类型。仅出参返回，取值有：</p><li>PRESET: 系统预置规则，仅允许修改 AttesterDuration；</li><li>CUSTOM: 用户自定义规则。</li> 
     * @return Type <p>认证规则类型。仅出参返回，取值有：</p><li>PRESET: 系统预置规则，仅允许修改 AttesterDuration；</li><li>CUSTOM: 用户自定义规则。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>认证规则类型。仅出参返回，取值有：</p><li>PRESET: 系统预置规则，仅允许修改 AttesterDuration；</li><li>CUSTOM: 用户自定义规则。</li>
     * @param Type <p>认证规则类型。仅出参返回，取值有：</p><li>PRESET: 系统预置规则，仅允许修改 AttesterDuration；</li><li>CUSTOM: 用户自定义规则。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>认证方法。取值有：</p><li>TC-RCE: 使用风险识别 RCE 进行认证；</li><li>TC-CAPTCHA: 使用天御验证码进行认证；</li><li>TC-EO-CAPTCHA: 使用 EdgeOne 人机校验进行认证。</li> 
     * @return AttesterSource <p>认证方法。取值有：</p><li>TC-RCE: 使用风险识别 RCE 进行认证；</li><li>TC-CAPTCHA: 使用天御验证码进行认证；</li><li>TC-EO-CAPTCHA: 使用 EdgeOne 人机校验进行认证。</li>
     */
    public String getAttesterSource() {
        return this.AttesterSource;
    }

    /**
     * Set <p>认证方法。取值有：</p><li>TC-RCE: 使用风险识别 RCE 进行认证；</li><li>TC-CAPTCHA: 使用天御验证码进行认证；</li><li>TC-EO-CAPTCHA: 使用 EdgeOne 人机校验进行认证。</li>
     * @param AttesterSource <p>认证方法。取值有：</p><li>TC-RCE: 使用风险识别 RCE 进行认证；</li><li>TC-CAPTCHA: 使用天御验证码进行认证；</li><li>TC-EO-CAPTCHA: 使用 EdgeOne 人机校验进行认证。</li>
     */
    public void setAttesterSource(String AttesterSource) {
        this.AttesterSource = AttesterSource;
    }

    /**
     * Get <p>认证有效时间。默认为 60s，支持的单位有：</p><li>s：秒，取值范围 60～43200；</li><li>m：分，取值范围 1～720；</li><li>h：小时，取值范围 1～12。</li> 
     * @return AttesterDuration <p>认证有效时间。默认为 60s，支持的单位有：</p><li>s：秒，取值范围 60～43200；</li><li>m：分，取值范围 1～720；</li><li>h：小时，取值范围 1～12。</li>
     */
    public String getAttesterDuration() {
        return this.AttesterDuration;
    }

    /**
     * Set <p>认证有效时间。默认为 60s，支持的单位有：</p><li>s：秒，取值范围 60～43200；</li><li>m：分，取值范围 1～720；</li><li>h：小时，取值范围 1～12。</li>
     * @param AttesterDuration <p>认证有效时间。默认为 60s，支持的单位有：</p><li>s：秒，取值范围 60～43200；</li><li>m：分，取值范围 1～720；</li><li>h：小时，取值范围 1～12。</li>
     */
    public void setAttesterDuration(String AttesterDuration) {
        this.AttesterDuration = AttesterDuration;
    }

    /**
     * Get <p>是否开启认证结果使用限制。 </p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul><p>默认值：off</p> 
     * @return UsageLimit <p>是否开启认证结果使用限制。 </p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul><p>默认值：off</p>
     */
    public String getUsageLimit() {
        return this.UsageLimit;
    }

    /**
     * Set <p>是否开启认证结果使用限制。 </p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul><p>默认值：off</p>
     * @param UsageLimit <p>是否开启认证结果使用限制。 </p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul><p>默认值：off</p>
     */
    public void setUsageLimit(String UsageLimit) {
        this.UsageLimit = UsageLimit;
    }

    /**
     * Get <p>认证结果最大使用次数。当 UsageLimit 为 on 时，此字段必填。</p><p>取值范围：[1, 100000]</p> 
     * @return MaxUsageCount <p>认证结果最大使用次数。当 UsageLimit 为 on 时，此字段必填。</p><p>取值范围：[1, 100000]</p>
     */
    public Long getMaxUsageCount() {
        return this.MaxUsageCount;
    }

    /**
     * Set <p>认证结果最大使用次数。当 UsageLimit 为 on 时，此字段必填。</p><p>取值范围：[1, 100000]</p>
     * @param MaxUsageCount <p>认证结果最大使用次数。当 UsageLimit 为 on 时，此字段必填。</p><p>取值范围：[1, 100000]</p>
     */
    public void setMaxUsageCount(Long MaxUsageCount) {
        this.MaxUsageCount = MaxUsageCount;
    }

    /**
     * Get <p>TC-RCE 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-RCE 时，此字段必填。</li> 
     * @return TCRCEOption <p>TC-RCE 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-RCE 时，此字段必填。</li>
     */
    public TCRCEOption getTCRCEOption() {
        return this.TCRCEOption;
    }

    /**
     * Set <p>TC-RCE 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-RCE 时，此字段必填。</li>
     * @param TCRCEOption <p>TC-RCE 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-RCE 时，此字段必填。</li>
     */
    public void setTCRCEOption(TCRCEOption TCRCEOption) {
        this.TCRCEOption = TCRCEOption;
    }

    /**
     * Get <p>TC-CAPTCHA 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-CAPTCHA 时，此字段必填。</li> 
     * @return TCCaptchaOption <p>TC-CAPTCHA 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-CAPTCHA 时，此字段必填。</li>
     */
    public TCCaptchaOption getTCCaptchaOption() {
        return this.TCCaptchaOption;
    }

    /**
     * Set <p>TC-CAPTCHA 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-CAPTCHA 时，此字段必填。</li>
     * @param TCCaptchaOption <p>TC-CAPTCHA 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-CAPTCHA 时，此字段必填。</li>
     */
    public void setTCCaptchaOption(TCCaptchaOption TCCaptchaOption) {
        this.TCCaptchaOption = TCCaptchaOption;
    }

    /**
     * Get <p>TC-EO-CAPTCHA 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-EO-CAPTCHA 时，此字段必填。</li> 
     * @return TCEOCaptchaOption <p>TC-EO-CAPTCHA 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-EO-CAPTCHA 时，此字段必填。</li>
     */
    public TCEOCaptchaOption getTCEOCaptchaOption() {
        return this.TCEOCaptchaOption;
    }

    /**
     * Set <p>TC-EO-CAPTCHA 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-EO-CAPTCHA 时，此字段必填。</li>
     * @param TCEOCaptchaOption <p>TC-EO-CAPTCHA 认证的配置信息。</p><li>当 AttesterSource 参数值为 TC-EO-CAPTCHA 时，此字段必填。</li>
     */
    public void setTCEOCaptchaOption(TCEOCaptchaOption TCEOCaptchaOption) {
        this.TCEOCaptchaOption = TCEOCaptchaOption;
    }

    public ClientAttester() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientAttester(ClientAttester source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AttesterSource != null) {
            this.AttesterSource = new String(source.AttesterSource);
        }
        if (source.AttesterDuration != null) {
            this.AttesterDuration = new String(source.AttesterDuration);
        }
        if (source.UsageLimit != null) {
            this.UsageLimit = new String(source.UsageLimit);
        }
        if (source.MaxUsageCount != null) {
            this.MaxUsageCount = new Long(source.MaxUsageCount);
        }
        if (source.TCRCEOption != null) {
            this.TCRCEOption = new TCRCEOption(source.TCRCEOption);
        }
        if (source.TCCaptchaOption != null) {
            this.TCCaptchaOption = new TCCaptchaOption(source.TCCaptchaOption);
        }
        if (source.TCEOCaptchaOption != null) {
            this.TCEOCaptchaOption = new TCEOCaptchaOption(source.TCEOCaptchaOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AttesterSource", this.AttesterSource);
        this.setParamSimple(map, prefix + "AttesterDuration", this.AttesterDuration);
        this.setParamSimple(map, prefix + "UsageLimit", this.UsageLimit);
        this.setParamSimple(map, prefix + "MaxUsageCount", this.MaxUsageCount);
        this.setParamObj(map, prefix + "TCRCEOption.", this.TCRCEOption);
        this.setParamObj(map, prefix + "TCCaptchaOption.", this.TCCaptchaOption);
        this.setParamObj(map, prefix + "TCEOCaptchaOption.", this.TCEOCaptchaOption);

    }
}

