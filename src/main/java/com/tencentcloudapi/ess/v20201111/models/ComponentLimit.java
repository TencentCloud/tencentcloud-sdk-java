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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentLimit extends AbstractModel {

    /**
    * <p>控件类型，支持以下类型</p><ul><li>SIGN_SEAL : 印章控件</li><li>SIGN_PAGING_SEAL : 骑缝章控件</li><li>SIGN_LEGAL_PERSON_SEAL : 企业法定代表人控件</li><li>SIGN_SIGNATURE : 用户签名控件</li></ul>
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * <p>签署控件类型的值(可选)，用于限制签署时印章或者签名的选择范围</p><p>1.当 ComponentType 是 SIGN_SEAL 或者 SIGN_PAGING_SEAL 时，可指定印章类型或具体企业印章Id。具体场景与规则说明如下：</p><p>指定印章类型:可传入以下枚举值来限制印章类型</p><ul><li> <b>OFFICIAL</b> :  企业公章</li><li> <b>CONTRACT</b> : 合同专用章</li><li> <b>FINANCE</b> : 财务专用章</li><li> <b>PERSONNEL</b> : 人事专用章</li><li> <b>OTHER</b> : 其他</li></ul><p>指定具体印章Id:可通过传递 ComponentValue 来指定具体的企业印章ID（支持传入多个）<br><strong>限制条件</strong>：</p><ul><li>可为本企业（即发起方）的签署人指定本企业具体印章ID。</li><li>主企业发起或<a href="https://qian.tencent.com/developers/company/groupCompany">集团账号主代子</a>发起的业务场景下，也支持指定子企业的具体印章ID。</li><li><font color="red"><strong>他方企业签署人不支持指定具体印章ID</strong></font></li></ul><p><font color="red"><strong>注意： 若请求中同时指定了具体的印章ID和印章类型，将以印章ID为准，传入的印章类型参数会被自动忽略。</strong></font><br><br></p><p>2.当ComponentType 是 SIGN_SIGNATURE 时可传入以下类型（支持多个）</p><ul><li>HANDWRITE : 需要实时手写的手写签名</li><li>HANDWRITTEN_ESIGN : 长效手写签名， 是使用保存到个人中心的印章列表的手写签名(并且包含HANDWRITE)</li><li>OCR_ESIGN : OCR印章（智慧手写签名）</li><li>ESIGN : 个人印章</li><li>SYSTEM_ESIGN : 系统印章</li></ul><br>3.当ComponentType 是 SIGN_LEGAL_PERSON_SEAL 时无需传递此参数。
    */
    @SerializedName("ComponentValue")
    @Expose
    private String [] ComponentValue;

    /**
     * Get <p>控件类型，支持以下类型</p><ul><li>SIGN_SEAL : 印章控件</li><li>SIGN_PAGING_SEAL : 骑缝章控件</li><li>SIGN_LEGAL_PERSON_SEAL : 企业法定代表人控件</li><li>SIGN_SIGNATURE : 用户签名控件</li></ul> 
     * @return ComponentType <p>控件类型，支持以下类型</p><ul><li>SIGN_SEAL : 印章控件</li><li>SIGN_PAGING_SEAL : 骑缝章控件</li><li>SIGN_LEGAL_PERSON_SEAL : 企业法定代表人控件</li><li>SIGN_SIGNATURE : 用户签名控件</li></ul>
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set <p>控件类型，支持以下类型</p><ul><li>SIGN_SEAL : 印章控件</li><li>SIGN_PAGING_SEAL : 骑缝章控件</li><li>SIGN_LEGAL_PERSON_SEAL : 企业法定代表人控件</li><li>SIGN_SIGNATURE : 用户签名控件</li></ul>
     * @param ComponentType <p>控件类型，支持以下类型</p><ul><li>SIGN_SEAL : 印章控件</li><li>SIGN_PAGING_SEAL : 骑缝章控件</li><li>SIGN_LEGAL_PERSON_SEAL : 企业法定代表人控件</li><li>SIGN_SIGNATURE : 用户签名控件</li></ul>
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
    }

    /**
     * Get <p>签署控件类型的值(可选)，用于限制签署时印章或者签名的选择范围</p><p>1.当 ComponentType 是 SIGN_SEAL 或者 SIGN_PAGING_SEAL 时，可指定印章类型或具体企业印章Id。具体场景与规则说明如下：</p><p>指定印章类型:可传入以下枚举值来限制印章类型</p><ul><li> <b>OFFICIAL</b> :  企业公章</li><li> <b>CONTRACT</b> : 合同专用章</li><li> <b>FINANCE</b> : 财务专用章</li><li> <b>PERSONNEL</b> : 人事专用章</li><li> <b>OTHER</b> : 其他</li></ul><p>指定具体印章Id:可通过传递 ComponentValue 来指定具体的企业印章ID（支持传入多个）<br><strong>限制条件</strong>：</p><ul><li>可为本企业（即发起方）的签署人指定本企业具体印章ID。</li><li>主企业发起或<a href="https://qian.tencent.com/developers/company/groupCompany">集团账号主代子</a>发起的业务场景下，也支持指定子企业的具体印章ID。</li><li><font color="red"><strong>他方企业签署人不支持指定具体印章ID</strong></font></li></ul><p><font color="red"><strong>注意： 若请求中同时指定了具体的印章ID和印章类型，将以印章ID为准，传入的印章类型参数会被自动忽略。</strong></font><br><br></p><p>2.当ComponentType 是 SIGN_SIGNATURE 时可传入以下类型（支持多个）</p><ul><li>HANDWRITE : 需要实时手写的手写签名</li><li>HANDWRITTEN_ESIGN : 长效手写签名， 是使用保存到个人中心的印章列表的手写签名(并且包含HANDWRITE)</li><li>OCR_ESIGN : OCR印章（智慧手写签名）</li><li>ESIGN : 个人印章</li><li>SYSTEM_ESIGN : 系统印章</li></ul><br>3.当ComponentType 是 SIGN_LEGAL_PERSON_SEAL 时无需传递此参数。 
     * @return ComponentValue <p>签署控件类型的值(可选)，用于限制签署时印章或者签名的选择范围</p><p>1.当 ComponentType 是 SIGN_SEAL 或者 SIGN_PAGING_SEAL 时，可指定印章类型或具体企业印章Id。具体场景与规则说明如下：</p><p>指定印章类型:可传入以下枚举值来限制印章类型</p><ul><li> <b>OFFICIAL</b> :  企业公章</li><li> <b>CONTRACT</b> : 合同专用章</li><li> <b>FINANCE</b> : 财务专用章</li><li> <b>PERSONNEL</b> : 人事专用章</li><li> <b>OTHER</b> : 其他</li></ul><p>指定具体印章Id:可通过传递 ComponentValue 来指定具体的企业印章ID（支持传入多个）<br><strong>限制条件</strong>：</p><ul><li>可为本企业（即发起方）的签署人指定本企业具体印章ID。</li><li>主企业发起或<a href="https://qian.tencent.com/developers/company/groupCompany">集团账号主代子</a>发起的业务场景下，也支持指定子企业的具体印章ID。</li><li><font color="red"><strong>他方企业签署人不支持指定具体印章ID</strong></font></li></ul><p><font color="red"><strong>注意： 若请求中同时指定了具体的印章ID和印章类型，将以印章ID为准，传入的印章类型参数会被自动忽略。</strong></font><br><br></p><p>2.当ComponentType 是 SIGN_SIGNATURE 时可传入以下类型（支持多个）</p><ul><li>HANDWRITE : 需要实时手写的手写签名</li><li>HANDWRITTEN_ESIGN : 长效手写签名， 是使用保存到个人中心的印章列表的手写签名(并且包含HANDWRITE)</li><li>OCR_ESIGN : OCR印章（智慧手写签名）</li><li>ESIGN : 个人印章</li><li>SYSTEM_ESIGN : 系统印章</li></ul><br>3.当ComponentType 是 SIGN_LEGAL_PERSON_SEAL 时无需传递此参数。
     */
    public String [] getComponentValue() {
        return this.ComponentValue;
    }

    /**
     * Set <p>签署控件类型的值(可选)，用于限制签署时印章或者签名的选择范围</p><p>1.当 ComponentType 是 SIGN_SEAL 或者 SIGN_PAGING_SEAL 时，可指定印章类型或具体企业印章Id。具体场景与规则说明如下：</p><p>指定印章类型:可传入以下枚举值来限制印章类型</p><ul><li> <b>OFFICIAL</b> :  企业公章</li><li> <b>CONTRACT</b> : 合同专用章</li><li> <b>FINANCE</b> : 财务专用章</li><li> <b>PERSONNEL</b> : 人事专用章</li><li> <b>OTHER</b> : 其他</li></ul><p>指定具体印章Id:可通过传递 ComponentValue 来指定具体的企业印章ID（支持传入多个）<br><strong>限制条件</strong>：</p><ul><li>可为本企业（即发起方）的签署人指定本企业具体印章ID。</li><li>主企业发起或<a href="https://qian.tencent.com/developers/company/groupCompany">集团账号主代子</a>发起的业务场景下，也支持指定子企业的具体印章ID。</li><li><font color="red"><strong>他方企业签署人不支持指定具体印章ID</strong></font></li></ul><p><font color="red"><strong>注意： 若请求中同时指定了具体的印章ID和印章类型，将以印章ID为准，传入的印章类型参数会被自动忽略。</strong></font><br><br></p><p>2.当ComponentType 是 SIGN_SIGNATURE 时可传入以下类型（支持多个）</p><ul><li>HANDWRITE : 需要实时手写的手写签名</li><li>HANDWRITTEN_ESIGN : 长效手写签名， 是使用保存到个人中心的印章列表的手写签名(并且包含HANDWRITE)</li><li>OCR_ESIGN : OCR印章（智慧手写签名）</li><li>ESIGN : 个人印章</li><li>SYSTEM_ESIGN : 系统印章</li></ul><br>3.当ComponentType 是 SIGN_LEGAL_PERSON_SEAL 时无需传递此参数。
     * @param ComponentValue <p>签署控件类型的值(可选)，用于限制签署时印章或者签名的选择范围</p><p>1.当 ComponentType 是 SIGN_SEAL 或者 SIGN_PAGING_SEAL 时，可指定印章类型或具体企业印章Id。具体场景与规则说明如下：</p><p>指定印章类型:可传入以下枚举值来限制印章类型</p><ul><li> <b>OFFICIAL</b> :  企业公章</li><li> <b>CONTRACT</b> : 合同专用章</li><li> <b>FINANCE</b> : 财务专用章</li><li> <b>PERSONNEL</b> : 人事专用章</li><li> <b>OTHER</b> : 其他</li></ul><p>指定具体印章Id:可通过传递 ComponentValue 来指定具体的企业印章ID（支持传入多个）<br><strong>限制条件</strong>：</p><ul><li>可为本企业（即发起方）的签署人指定本企业具体印章ID。</li><li>主企业发起或<a href="https://qian.tencent.com/developers/company/groupCompany">集团账号主代子</a>发起的业务场景下，也支持指定子企业的具体印章ID。</li><li><font color="red"><strong>他方企业签署人不支持指定具体印章ID</strong></font></li></ul><p><font color="red"><strong>注意： 若请求中同时指定了具体的印章ID和印章类型，将以印章ID为准，传入的印章类型参数会被自动忽略。</strong></font><br><br></p><p>2.当ComponentType 是 SIGN_SIGNATURE 时可传入以下类型（支持多个）</p><ul><li>HANDWRITE : 需要实时手写的手写签名</li><li>HANDWRITTEN_ESIGN : 长效手写签名， 是使用保存到个人中心的印章列表的手写签名(并且包含HANDWRITE)</li><li>OCR_ESIGN : OCR印章（智慧手写签名）</li><li>ESIGN : 个人印章</li><li>SYSTEM_ESIGN : 系统印章</li></ul><br>3.当ComponentType 是 SIGN_LEGAL_PERSON_SEAL 时无需传递此参数。
     */
    public void setComponentValue(String [] ComponentValue) {
        this.ComponentValue = ComponentValue;
    }

    public ComponentLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentLimit(ComponentLimit source) {
        if (source.ComponentType != null) {
            this.ComponentType = new String(source.ComponentType);
        }
        if (source.ComponentValue != null) {
            this.ComponentValue = new String[source.ComponentValue.length];
            for (int i = 0; i < source.ComponentValue.length; i++) {
                this.ComponentValue[i] = new String(source.ComponentValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentType", this.ComponentType);
        this.setParamArraySimple(map, prefix + "ComponentValue.", this.ComponentValue);

    }
}

