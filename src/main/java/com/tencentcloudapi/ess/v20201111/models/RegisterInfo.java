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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterInfo extends AbstractModel{

    /**
    * 法人姓名
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 社会统一信用代码
    */
    @SerializedName("Uscc")
    @Expose
    private String Uscc;

    /**
     * Get 法人姓名 
     * @return LegalName 法人姓名
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set 法人姓名
     * @param LegalName 法人姓名
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get 社会统一信用代码 
     * @return Uscc 社会统一信用代码
     */
    public String getUscc() {
        return this.Uscc;
    }

    /**
     * Set 社会统一信用代码
     * @param Uscc 社会统一信用代码
     */
    public void setUscc(String Uscc) {
        this.Uscc = Uscc;
    }

    public RegisterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterInfo(RegisterInfo source) {
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.Uscc != null) {
            this.Uscc = new String(source.Uscc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "Uscc", this.Uscc);

    }
}

