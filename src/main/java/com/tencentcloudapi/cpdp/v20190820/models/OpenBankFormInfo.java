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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenBankFormInfo extends AbstractModel{

    /**
    * 网银页面提交html
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FormHtml")
    @Expose
    private String FormHtml;

    /**
    * 网银提交页面字符集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FormEncoding")
    @Expose
    private String FormEncoding;

    /**
     * Get 网银页面提交html
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FormHtml 网银页面提交html
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormHtml() {
        return this.FormHtml;
    }

    /**
     * Set 网银页面提交html
注意：此字段可能返回 null，表示取不到有效值。
     * @param FormHtml 网银页面提交html
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormHtml(String FormHtml) {
        this.FormHtml = FormHtml;
    }

    /**
     * Get 网银提交页面字符集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FormEncoding 网银提交页面字符集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormEncoding() {
        return this.FormEncoding;
    }

    /**
     * Set 网银提交页面字符集
注意：此字段可能返回 null，表示取不到有效值。
     * @param FormEncoding 网银提交页面字符集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormEncoding(String FormEncoding) {
        this.FormEncoding = FormEncoding;
    }

    public OpenBankFormInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankFormInfo(OpenBankFormInfo source) {
        if (source.FormHtml != null) {
            this.FormHtml = new String(source.FormHtml);
        }
        if (source.FormEncoding != null) {
            this.FormEncoding = new String(source.FormEncoding);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FormHtml", this.FormHtml);
        this.setParamSimple(map, prefix + "FormEncoding", this.FormEncoding);

    }
}

