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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Key extends AbstractModel{

    /**
    * 自动识别的字段名称
    */
    @SerializedName("AutoName")
    @Expose
    private String AutoName;

    /**
    * 定义的字段名称（传key的名称）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
     * Get 自动识别的字段名称 
     * @return AutoName 自动识别的字段名称
     */
    public String getAutoName() {
        return this.AutoName;
    }

    /**
     * Set 自动识别的字段名称
     * @param AutoName 自动识别的字段名称
     */
    public void setAutoName(String AutoName) {
        this.AutoName = AutoName;
    }

    /**
     * Get 定义的字段名称（传key的名称）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigName 定义的字段名称（传key的名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 定义的字段名称（传key的名称）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigName 定义的字段名称（传key的名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    public Key() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Key(Key source) {
        if (source.AutoName != null) {
            this.AutoName = new String(source.AutoName);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoName", this.AutoName);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);

    }
}

