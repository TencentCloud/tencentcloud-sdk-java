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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmailProviderConfig extends AbstractModel {

    /**
    * <p>smtp配置</p>
    */
    @SerializedName("SmtpConfig")
    @Expose
    private EmailSmtpConfig SmtpConfig;

    /**
    * <p>可选：TRUE，FALSE，如果On为TRUE，则表示采用默认代发。</p>
    */
    @SerializedName("On")
    @Expose
    private String On;

    /**
    * <p>邮件模板配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateConfig")
    @Expose
    private EmailTemplateConfig TemplateConfig;

    /**
     * Get <p>smtp配置</p> 
     * @return SmtpConfig <p>smtp配置</p>
     */
    public EmailSmtpConfig getSmtpConfig() {
        return this.SmtpConfig;
    }

    /**
     * Set <p>smtp配置</p>
     * @param SmtpConfig <p>smtp配置</p>
     */
    public void setSmtpConfig(EmailSmtpConfig SmtpConfig) {
        this.SmtpConfig = SmtpConfig;
    }

    /**
     * Get <p>可选：TRUE，FALSE，如果On为TRUE，则表示采用默认代发。</p> 
     * @return On <p>可选：TRUE，FALSE，如果On为TRUE，则表示采用默认代发。</p>
     */
    public String getOn() {
        return this.On;
    }

    /**
     * Set <p>可选：TRUE，FALSE，如果On为TRUE，则表示采用默认代发。</p>
     * @param On <p>可选：TRUE，FALSE，如果On为TRUE，则表示采用默认代发。</p>
     */
    public void setOn(String On) {
        this.On = On;
    }

    /**
     * Get <p>邮件模板配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateConfig <p>邮件模板配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmailTemplateConfig getTemplateConfig() {
        return this.TemplateConfig;
    }

    /**
     * Set <p>邮件模板配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateConfig <p>邮件模板配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateConfig(EmailTemplateConfig TemplateConfig) {
        this.TemplateConfig = TemplateConfig;
    }

    public EmailProviderConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmailProviderConfig(EmailProviderConfig source) {
        if (source.SmtpConfig != null) {
            this.SmtpConfig = new EmailSmtpConfig(source.SmtpConfig);
        }
        if (source.On != null) {
            this.On = new String(source.On);
        }
        if (source.TemplateConfig != null) {
            this.TemplateConfig = new EmailTemplateConfig(source.TemplateConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SmtpConfig.", this.SmtpConfig);
        this.setParamSimple(map, prefix + "On", this.On);
        this.setParamObj(map, prefix + "TemplateConfig.", this.TemplateConfig);

    }
}

