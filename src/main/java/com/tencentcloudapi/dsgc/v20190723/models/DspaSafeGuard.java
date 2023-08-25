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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaSafeGuard extends AbstractModel{

    /**
    * 加密状态，可取值如下：
UNSET 未设置
DISABLE 规则设置未启用
ENABLE 规则设置并启用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encrypt")
    @Expose
    private String Encrypt;

    /**
    * 脱敏状态，可取值如下：
UNSET 未设置
DISABLE 规则设置未启用
ENABLE 规则设置并启用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desensitization")
    @Expose
    private String Desensitization;

    /**
     * Get 加密状态，可取值如下：
UNSET 未设置
DISABLE 规则设置未启用
ENABLE 规则设置并启用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encrypt 加密状态，可取值如下：
UNSET 未设置
DISABLE 规则设置未启用
ENABLE 规则设置并启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set 加密状态，可取值如下：
UNSET 未设置
DISABLE 规则设置未启用
ENABLE 规则设置并启用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encrypt 加密状态，可取值如下：
UNSET 未设置
DISABLE 规则设置未启用
ENABLE 规则设置并启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncrypt(String Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get 脱敏状态，可取值如下：
UNSET 未设置
DISABLE 规则设置未启用
ENABLE 规则设置并启用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desensitization 脱敏状态，可取值如下：
UNSET 未设置
DISABLE 规则设置未启用
ENABLE 规则设置并启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesensitization() {
        return this.Desensitization;
    }

    /**
     * Set 脱敏状态，可取值如下：
UNSET 未设置
DISABLE 规则设置未启用
ENABLE 规则设置并启用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desensitization 脱敏状态，可取值如下：
UNSET 未设置
DISABLE 规则设置未启用
ENABLE 规则设置并启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesensitization(String Desensitization) {
        this.Desensitization = Desensitization;
    }

    public DspaSafeGuard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaSafeGuard(DspaSafeGuard source) {
        if (source.Encrypt != null) {
            this.Encrypt = new String(source.Encrypt);
        }
        if (source.Desensitization != null) {
            this.Desensitization = new String(source.Desensitization);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "Desensitization", this.Desensitization);

    }
}

