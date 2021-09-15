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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsTemplate extends AbstractModel{

    /**
    * 模板ID，必须填写已审核通过的模板ID。模板ID可登录短信控制台查看。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 短信签名内容，使用UTF-8编码，必须填写已审核通过的签名，签名信息可登录短信控制台查看。
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
     * Get 模板ID，必须填写已审核通过的模板ID。模板ID可登录短信控制台查看。 
     * @return TemplateId 模板ID，必须填写已审核通过的模板ID。模板ID可登录短信控制台查看。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID，必须填写已审核通过的模板ID。模板ID可登录短信控制台查看。
     * @param TemplateId 模板ID，必须填写已审核通过的模板ID。模板ID可登录短信控制台查看。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 短信签名内容，使用UTF-8编码，必须填写已审核通过的签名，签名信息可登录短信控制台查看。 
     * @return Sign 短信签名内容，使用UTF-8编码，必须填写已审核通过的签名，签名信息可登录短信控制台查看。
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * Set 短信签名内容，使用UTF-8编码，必须填写已审核通过的签名，签名信息可登录短信控制台查看。
     * @param Sign 短信签名内容，使用UTF-8编码，必须填写已审核通过的签名，签名信息可登录短信控制台查看。
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
    }

    public SmsTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsTemplate(SmsTemplate source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Sign != null) {
            this.Sign = new String(source.Sign);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Sign", this.Sign);

    }
}

