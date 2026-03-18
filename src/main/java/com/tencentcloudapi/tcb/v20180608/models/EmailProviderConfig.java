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
    * smtp配置
    */
    @SerializedName("SmtpConfig")
    @Expose
    private EmailSmtpConfig SmtpConfig;

    /**
    * 可选：TRUE，FALSE，如果On为TRUE，则表示采用默认代发。
    */
    @SerializedName("On")
    @Expose
    private String On;

    /**
     * Get smtp配置 
     * @return SmtpConfig smtp配置
     */
    public EmailSmtpConfig getSmtpConfig() {
        return this.SmtpConfig;
    }

    /**
     * Set smtp配置
     * @param SmtpConfig smtp配置
     */
    public void setSmtpConfig(EmailSmtpConfig SmtpConfig) {
        this.SmtpConfig = SmtpConfig;
    }

    /**
     * Get 可选：TRUE，FALSE，如果On为TRUE，则表示采用默认代发。 
     * @return On 可选：TRUE，FALSE，如果On为TRUE，则表示采用默认代发。
     */
    public String getOn() {
        return this.On;
    }

    /**
     * Set 可选：TRUE，FALSE，如果On为TRUE，则表示采用默认代发。
     * @param On 可选：TRUE，FALSE，如果On为TRUE，则表示采用默认代发。
     */
    public void setOn(String On) {
        this.On = On;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SmtpConfig.", this.SmtpConfig);
        this.setParamSimple(map, prefix + "On", this.On);

    }
}

