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
package com.tencentcloudapi.controlcenter.v20230110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineConfigItem extends AbstractModel {

    /**
    * 账号工厂基线项唯一标识,只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * 账号工厂基线项配置，不同基线项配置参数不同。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Configuration")
    @Expose
    private String Configuration;

    /**
     * Get 账号工厂基线项唯一标识,只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Identifier 账号工厂基线项唯一标识,只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set 账号工厂基线项唯一标识,只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Identifier 账号工厂基线项唯一标识,只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get 账号工厂基线项配置，不同基线项配置参数不同。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Configuration 账号工厂基线项配置，不同基线项配置参数不同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfiguration() {
        return this.Configuration;
    }

    /**
     * Set 账号工厂基线项配置，不同基线项配置参数不同。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Configuration 账号工厂基线项配置，不同基线项配置参数不同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfiguration(String Configuration) {
        this.Configuration = Configuration;
    }

    public BaselineConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineConfigItem(BaselineConfigItem source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.Configuration != null) {
            this.Configuration = new String(source.Configuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "Configuration", this.Configuration);

    }
}

