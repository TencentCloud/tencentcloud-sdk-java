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
    * 认证选项 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 认证选项名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 认证规则类型。仅出参返回，取值有：
<li>PRESET: 系统预置规则，仅允许修改 AttesterDuration；</li>
<li>CUSTOM: 用户自定义规则。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 认证方法。取值有：
<li>TC-RCE: 使用风险识别 RCE 进行认证；</li>
<li>TC-CAPTCHA: 使用天御验证码进行认证。</li>
    */
    @SerializedName("AttesterSource")
    @Expose
    private String AttesterSource;

    /**
    * 认证有效时间。默认为 60s，支持的单位有：
<li>s：秒，取值范围 60～43200；</li>
<li>m：分，取值范围 1～720；</li>
<li>h：小时，取值范围 1～12。</li>
    */
    @SerializedName("AttesterDuration")
    @Expose
    private String AttesterDuration;

    /**
    * TC-RCE 认证的配置信息。
<li>当 AttesterSource 参数值为 TC-RCE 时，此字段必填。</li>
    */
    @SerializedName("TCRCEOption")
    @Expose
    private TCRCEOption TCRCEOption;

    /**
    * TC-CAPTCHA 认证的配置信息。
<li>当 AttesterSource 参数值为 TC-CAPTCHA 时，此字段必填。</li>
    */
    @SerializedName("TCCaptchaOption")
    @Expose
    private TCCaptchaOption TCCaptchaOption;

    /**
     * Get 认证选项 ID。 
     * @return Id 认证选项 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 认证选项 ID。
     * @param Id 认证选项 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 认证选项名称。 
     * @return Name 认证选项名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 认证选项名称。
     * @param Name 认证选项名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 认证规则类型。仅出参返回，取值有：
<li>PRESET: 系统预置规则，仅允许修改 AttesterDuration；</li>
<li>CUSTOM: 用户自定义规则。</li> 
     * @return Type 认证规则类型。仅出参返回，取值有：
<li>PRESET: 系统预置规则，仅允许修改 AttesterDuration；</li>
<li>CUSTOM: 用户自定义规则。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 认证规则类型。仅出参返回，取值有：
<li>PRESET: 系统预置规则，仅允许修改 AttesterDuration；</li>
<li>CUSTOM: 用户自定义规则。</li>
     * @param Type 认证规则类型。仅出参返回，取值有：
<li>PRESET: 系统预置规则，仅允许修改 AttesterDuration；</li>
<li>CUSTOM: 用户自定义规则。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 认证方法。取值有：
<li>TC-RCE: 使用风险识别 RCE 进行认证；</li>
<li>TC-CAPTCHA: 使用天御验证码进行认证。</li> 
     * @return AttesterSource 认证方法。取值有：
<li>TC-RCE: 使用风险识别 RCE 进行认证；</li>
<li>TC-CAPTCHA: 使用天御验证码进行认证。</li>
     */
    public String getAttesterSource() {
        return this.AttesterSource;
    }

    /**
     * Set 认证方法。取值有：
<li>TC-RCE: 使用风险识别 RCE 进行认证；</li>
<li>TC-CAPTCHA: 使用天御验证码进行认证。</li>
     * @param AttesterSource 认证方法。取值有：
<li>TC-RCE: 使用风险识别 RCE 进行认证；</li>
<li>TC-CAPTCHA: 使用天御验证码进行认证。</li>
     */
    public void setAttesterSource(String AttesterSource) {
        this.AttesterSource = AttesterSource;
    }

    /**
     * Get 认证有效时间。默认为 60s，支持的单位有：
<li>s：秒，取值范围 60～43200；</li>
<li>m：分，取值范围 1～720；</li>
<li>h：小时，取值范围 1～12。</li> 
     * @return AttesterDuration 认证有效时间。默认为 60s，支持的单位有：
<li>s：秒，取值范围 60～43200；</li>
<li>m：分，取值范围 1～720；</li>
<li>h：小时，取值范围 1～12。</li>
     */
    public String getAttesterDuration() {
        return this.AttesterDuration;
    }

    /**
     * Set 认证有效时间。默认为 60s，支持的单位有：
<li>s：秒，取值范围 60～43200；</li>
<li>m：分，取值范围 1～720；</li>
<li>h：小时，取值范围 1～12。</li>
     * @param AttesterDuration 认证有效时间。默认为 60s，支持的单位有：
<li>s：秒，取值范围 60～43200；</li>
<li>m：分，取值范围 1～720；</li>
<li>h：小时，取值范围 1～12。</li>
     */
    public void setAttesterDuration(String AttesterDuration) {
        this.AttesterDuration = AttesterDuration;
    }

    /**
     * Get TC-RCE 认证的配置信息。
<li>当 AttesterSource 参数值为 TC-RCE 时，此字段必填。</li> 
     * @return TCRCEOption TC-RCE 认证的配置信息。
<li>当 AttesterSource 参数值为 TC-RCE 时，此字段必填。</li>
     */
    public TCRCEOption getTCRCEOption() {
        return this.TCRCEOption;
    }

    /**
     * Set TC-RCE 认证的配置信息。
<li>当 AttesterSource 参数值为 TC-RCE 时，此字段必填。</li>
     * @param TCRCEOption TC-RCE 认证的配置信息。
<li>当 AttesterSource 参数值为 TC-RCE 时，此字段必填。</li>
     */
    public void setTCRCEOption(TCRCEOption TCRCEOption) {
        this.TCRCEOption = TCRCEOption;
    }

    /**
     * Get TC-CAPTCHA 认证的配置信息。
<li>当 AttesterSource 参数值为 TC-CAPTCHA 时，此字段必填。</li> 
     * @return TCCaptchaOption TC-CAPTCHA 认证的配置信息。
<li>当 AttesterSource 参数值为 TC-CAPTCHA 时，此字段必填。</li>
     */
    public TCCaptchaOption getTCCaptchaOption() {
        return this.TCCaptchaOption;
    }

    /**
     * Set TC-CAPTCHA 认证的配置信息。
<li>当 AttesterSource 参数值为 TC-CAPTCHA 时，此字段必填。</li>
     * @param TCCaptchaOption TC-CAPTCHA 认证的配置信息。
<li>当 AttesterSource 参数值为 TC-CAPTCHA 时，此字段必填。</li>
     */
    public void setTCCaptchaOption(TCCaptchaOption TCCaptchaOption) {
        this.TCCaptchaOption = TCCaptchaOption;
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
        if (source.TCRCEOption != null) {
            this.TCRCEOption = new TCRCEOption(source.TCRCEOption);
        }
        if (source.TCCaptchaOption != null) {
            this.TCCaptchaOption = new TCCaptchaOption(source.TCCaptchaOption);
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
        this.setParamObj(map, prefix + "TCRCEOption.", this.TCRCEOption);
        this.setParamObj(map, prefix + "TCCaptchaOption.", this.TCCaptchaOption);

    }
}

