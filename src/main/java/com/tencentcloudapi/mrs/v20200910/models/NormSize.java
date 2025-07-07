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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NormSize extends AbstractModel {

    /**
    * 数量
    */
    @SerializedName("Number")
    @Expose
    private String [] Number;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 归一化值
    */
    @SerializedName("Impl")
    @Expose
    private String Impl;

    /**
     * Get 数量 
     * @return Number 数量
     */
    public String [] getNumber() {
        return this.Number;
    }

    /**
     * Set 数量
     * @param Number 数量
     */
    public void setNumber(String [] Number) {
        this.Number = Number;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 单位 
     * @return Unit 单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
     * @param Unit 单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 归一化值 
     * @return Impl 归一化值
     */
    public String getImpl() {
        return this.Impl;
    }

    /**
     * Set 归一化值
     * @param Impl 归一化值
     */
    public void setImpl(String Impl) {
        this.Impl = Impl;
    }

    public NormSize() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormSize(NormSize source) {
        if (source.Number != null) {
            this.Number = new String[source.Number.length];
            for (int i = 0; i < source.Number.length; i++) {
                this.Number[i] = new String(source.Number[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Impl != null) {
            this.Impl = new String(source.Impl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Number.", this.Number);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Impl", this.Impl);

    }
}

