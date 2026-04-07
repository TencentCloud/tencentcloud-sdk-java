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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AliasValueConf extends AbstractModel {

    /**
    * Alias。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Value。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Alias。 
     * @return Alias Alias。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Alias。
     * @param Alias Alias。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Value。 
     * @return Value Value。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value。
     * @param Value Value。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AliasValueConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AliasValueConf(AliasValueConf source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

