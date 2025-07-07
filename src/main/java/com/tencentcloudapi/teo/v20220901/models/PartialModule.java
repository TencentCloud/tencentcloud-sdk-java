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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartialModule extends AbstractModel {

    /**
    * 模块名称，取值为：
<li>waf：托管规则。</li>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 模块下的需要例外的具体规则ID列表。
    */
    @SerializedName("Include")
    @Expose
    private Long [] Include;

    /**
     * Get 模块名称，取值为：
<li>waf：托管规则。</li> 
     * @return Module 模块名称，取值为：
<li>waf：托管规则。</li>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名称，取值为：
<li>waf：托管规则。</li>
     * @param Module 模块名称，取值为：
<li>waf：托管规则。</li>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 模块下的需要例外的具体规则ID列表。 
     * @return Include 模块下的需要例外的具体规则ID列表。
     */
    public Long [] getInclude() {
        return this.Include;
    }

    /**
     * Set 模块下的需要例外的具体规则ID列表。
     * @param Include 模块下的需要例外的具体规则ID列表。
     */
    public void setInclude(Long [] Include) {
        this.Include = Include;
    }

    public PartialModule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartialModule(PartialModule source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Include != null) {
            this.Include = new Long[source.Include.length];
            for (int i = 0; i < source.Include.length; i++) {
                this.Include[i] = new Long(source.Include[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "Include.", this.Include);

    }
}

