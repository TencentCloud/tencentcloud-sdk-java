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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleItem extends AbstractModel {

    /**
    *  信息类型
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    *  操作符，默认是包含

    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 信息类型
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
    * 信息类
    */
    @SerializedName("Levels")
    @Expose
    private ValueLevel [] Levels;

    /**
     * Get  信息类型 
     * @return Key  信息类型
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set  信息类型
     * @param Key  信息类型
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get  操作符，默认是包含
 
     * @return Op  操作符，默认是包含

     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set  操作符，默认是包含

     * @param Op  操作符，默认是包含

     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 信息类型 
     * @return Value 信息类型
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 信息类型
     * @param Value 信息类型
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    /**
     * Get 信息类 
     * @return Levels 信息类
     */
    public ValueLevel [] getLevels() {
        return this.Levels;
    }

    /**
     * Set 信息类
     * @param Levels 信息类
     */
    public void setLevels(ValueLevel [] Levels) {
        this.Levels = Levels;
    }

    public RuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleItem(RuleItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
        if (source.Levels != null) {
            this.Levels = new ValueLevel[source.Levels.length];
            for (int i = 0; i < source.Levels.length; i++) {
                this.Levels[i] = new ValueLevel(source.Levels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);
        this.setParamArrayObj(map, prefix + "Levels.", this.Levels);

    }
}

