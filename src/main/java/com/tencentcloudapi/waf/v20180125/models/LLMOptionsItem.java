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

public class LLMOptionsItem extends AbstractModel {

    /**
    * 键
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 操作符
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 值
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
    * Header参数值时使用
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 区域选择
    */
    @SerializedName("Areas")
    @Expose
    private Area [] Areas;

    /**
     * Get 键 
     * @return Key 键
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 键
     * @param Key 键
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 操作符 
     * @return Op 操作符
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set 操作符
     * @param Op 操作符
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 值 
     * @return Value 值
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 值
     * @param Value 值
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    /**
     * Get Header参数值时使用 
     * @return Name Header参数值时使用
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Header参数值时使用
     * @param Name Header参数值时使用
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 区域选择 
     * @return Areas 区域选择
     */
    public Area [] getAreas() {
        return this.Areas;
    }

    /**
     * Set 区域选择
     * @param Areas 区域选择
     */
    public void setAreas(Area [] Areas) {
        this.Areas = Areas;
    }

    public LLMOptionsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMOptionsItem(LLMOptionsItem source) {
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Areas != null) {
            this.Areas = new Area[source.Areas.length];
            for (int i = 0; i < source.Areas.length; i++) {
                this.Areas[i] = new Area(source.Areas[i]);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Areas.", this.Areas);

    }
}

