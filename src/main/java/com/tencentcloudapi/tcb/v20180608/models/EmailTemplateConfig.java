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

public class EmailTemplateConfig extends AbstractModel {

    /**
    * <p>注册登录模板</p><p>入参限制：模板中必须包含{{.VerificationCode}}变量，用于邮件中验证码的展示，可选变量有{{.Usage}}、{{.ExpireMinutes}}、{{.Email}}。邮件模板中禁止包含 script、javascript、onclick、onload、iframe、link 标签及 CSS expression、CSS url() 等</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegisterSignIn")
    @Expose
    private LocalizedTemplate RegisterSignIn;

    /**
    * <p>默认模板</p><p>入参限制：模板中必须包含{{.VerificationCode}}变量，用于邮件中验证码的展示，可选变量有{{.Usage}}、{{.ExpireMinutes}}、{{.Email}}。邮件模板中禁止包含 script、javascript、onclick、onload、iframe、link 标签及 CSS expression、CSS url() 等</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultTpl")
    @Expose
    private LocalizedTemplate DefaultTpl;

    /**
     * Get <p>注册登录模板</p><p>入参限制：模板中必须包含{{.VerificationCode}}变量，用于邮件中验证码的展示，可选变量有{{.Usage}}、{{.ExpireMinutes}}、{{.Email}}。邮件模板中禁止包含 script、javascript、onclick、onload、iframe、link 标签及 CSS expression、CSS url() 等</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegisterSignIn <p>注册登录模板</p><p>入参限制：模板中必须包含{{.VerificationCode}}变量，用于邮件中验证码的展示，可选变量有{{.Usage}}、{{.ExpireMinutes}}、{{.Email}}。邮件模板中禁止包含 script、javascript、onclick、onload、iframe、link 标签及 CSS expression、CSS url() 等</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LocalizedTemplate getRegisterSignIn() {
        return this.RegisterSignIn;
    }

    /**
     * Set <p>注册登录模板</p><p>入参限制：模板中必须包含{{.VerificationCode}}变量，用于邮件中验证码的展示，可选变量有{{.Usage}}、{{.ExpireMinutes}}、{{.Email}}。邮件模板中禁止包含 script、javascript、onclick、onload、iframe、link 标签及 CSS expression、CSS url() 等</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegisterSignIn <p>注册登录模板</p><p>入参限制：模板中必须包含{{.VerificationCode}}变量，用于邮件中验证码的展示，可选变量有{{.Usage}}、{{.ExpireMinutes}}、{{.Email}}。邮件模板中禁止包含 script、javascript、onclick、onload、iframe、link 标签及 CSS expression、CSS url() 等</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegisterSignIn(LocalizedTemplate RegisterSignIn) {
        this.RegisterSignIn = RegisterSignIn;
    }

    /**
     * Get <p>默认模板</p><p>入参限制：模板中必须包含{{.VerificationCode}}变量，用于邮件中验证码的展示，可选变量有{{.Usage}}、{{.ExpireMinutes}}、{{.Email}}。邮件模板中禁止包含 script、javascript、onclick、onload、iframe、link 标签及 CSS expression、CSS url() 等</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultTpl <p>默认模板</p><p>入参限制：模板中必须包含{{.VerificationCode}}变量，用于邮件中验证码的展示，可选变量有{{.Usage}}、{{.ExpireMinutes}}、{{.Email}}。邮件模板中禁止包含 script、javascript、onclick、onload、iframe、link 标签及 CSS expression、CSS url() 等</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LocalizedTemplate getDefaultTpl() {
        return this.DefaultTpl;
    }

    /**
     * Set <p>默认模板</p><p>入参限制：模板中必须包含{{.VerificationCode}}变量，用于邮件中验证码的展示，可选变量有{{.Usage}}、{{.ExpireMinutes}}、{{.Email}}。邮件模板中禁止包含 script、javascript、onclick、onload、iframe、link 标签及 CSS expression、CSS url() 等</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultTpl <p>默认模板</p><p>入参限制：模板中必须包含{{.VerificationCode}}变量，用于邮件中验证码的展示，可选变量有{{.Usage}}、{{.ExpireMinutes}}、{{.Email}}。邮件模板中禁止包含 script、javascript、onclick、onload、iframe、link 标签及 CSS expression、CSS url() 等</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultTpl(LocalizedTemplate DefaultTpl) {
        this.DefaultTpl = DefaultTpl;
    }

    public EmailTemplateConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmailTemplateConfig(EmailTemplateConfig source) {
        if (source.RegisterSignIn != null) {
            this.RegisterSignIn = new LocalizedTemplate(source.RegisterSignIn);
        }
        if (source.DefaultTpl != null) {
            this.DefaultTpl = new LocalizedTemplate(source.DefaultTpl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RegisterSignIn.", this.RegisterSignIn);
        this.setParamObj(map, prefix + "DefaultTpl.", this.DefaultTpl);

    }
}

