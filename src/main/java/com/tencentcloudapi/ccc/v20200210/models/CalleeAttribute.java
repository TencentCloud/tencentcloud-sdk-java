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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CalleeAttribute extends AbstractModel {

    /**
    * 被叫号码
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * 随路数据
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * 参数
    */
    @SerializedName("Variables")
    @Expose
    private Variable [] Variables;

    /**
     * Get 被叫号码 
     * @return Callee 被叫号码
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set 被叫号码
     * @param Callee 被叫号码
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get 随路数据 
     * @return UUI 随路数据
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set 随路数据
     * @param UUI 随路数据
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    /**
     * Get 参数 
     * @return Variables 参数
     */
    public Variable [] getVariables() {
        return this.Variables;
    }

    /**
     * Set 参数
     * @param Variables 参数
     */
    public void setVariables(Variable [] Variables) {
        this.Variables = Variables;
    }

    public CalleeAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CalleeAttribute(CalleeAttribute source) {
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
        }
        if (source.Variables != null) {
            this.Variables = new Variable[source.Variables.length];
            for (int i = 0; i < source.Variables.length; i++) {
                this.Variables[i] = new Variable(source.Variables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "UUI", this.UUI);
        this.setParamArrayObj(map, prefix + "Variables.", this.Variables);

    }
}

