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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProfileInfo extends AbstractModel{

    /**
    * 语言, 如"zh"。
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 邮件模板的内容。
    */
    @SerializedName("MailConfiguration")
    @Expose
    private MailConfiguration MailConfiguration;

    /**
     * Get 语言, 如"zh"。 
     * @return Language 语言, 如"zh"。
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 语言, 如"zh"。
     * @param Language 语言, 如"zh"。
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 邮件模板的内容。 
     * @return MailConfiguration 邮件模板的内容。
     */
    public MailConfiguration getMailConfiguration() {
        return this.MailConfiguration;
    }

    /**
     * Set 邮件模板的内容。
     * @param MailConfiguration 邮件模板的内容。
     */
    public void setMailConfiguration(MailConfiguration MailConfiguration) {
        this.MailConfiguration = MailConfiguration;
    }

    public ProfileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProfileInfo(ProfileInfo source) {
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.MailConfiguration != null) {
            this.MailConfiguration = new MailConfiguration(source.MailConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamObj(map, prefix + "MailConfiguration.", this.MailConfiguration);

    }
}

