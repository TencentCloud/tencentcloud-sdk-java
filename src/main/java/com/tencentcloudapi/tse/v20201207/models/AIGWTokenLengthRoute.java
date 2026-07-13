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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWTokenLengthRoute extends AbstractModel {

    /**
    * <p>默认tokenizer编码器</p><p>枚举值：</p><ul><li>o200k_base： OpenApi o200k_base</li><li>cl100k_base： OpenApi cl100k_base</li><li>p50k_base： OpenApi p50k_base</li><li>r50k_base： OpenApi r50k_base</li></ul>
    */
    @SerializedName("DefaultEncodingName")
    @Expose
    private String DefaultEncodingName;

    /**
    * <p>token 计数失败、规则为空或未命中任何规则时执行的默认二级路由（暂时只能选择一个指定模型路由）</p>
    */
    @SerializedName("DefaultTarget")
    @Expose
    private AIGWLLMModelServiceSubRoute DefaultTarget;

    /**
    * <p>规则</p>
    */
    @SerializedName("Rules")
    @Expose
    private AIGWTokenLengthRouteRule [] Rules;

    /**
     * Get <p>默认tokenizer编码器</p><p>枚举值：</p><ul><li>o200k_base： OpenApi o200k_base</li><li>cl100k_base： OpenApi cl100k_base</li><li>p50k_base： OpenApi p50k_base</li><li>r50k_base： OpenApi r50k_base</li></ul> 
     * @return DefaultEncodingName <p>默认tokenizer编码器</p><p>枚举值：</p><ul><li>o200k_base： OpenApi o200k_base</li><li>cl100k_base： OpenApi cl100k_base</li><li>p50k_base： OpenApi p50k_base</li><li>r50k_base： OpenApi r50k_base</li></ul>
     */
    public String getDefaultEncodingName() {
        return this.DefaultEncodingName;
    }

    /**
     * Set <p>默认tokenizer编码器</p><p>枚举值：</p><ul><li>o200k_base： OpenApi o200k_base</li><li>cl100k_base： OpenApi cl100k_base</li><li>p50k_base： OpenApi p50k_base</li><li>r50k_base： OpenApi r50k_base</li></ul>
     * @param DefaultEncodingName <p>默认tokenizer编码器</p><p>枚举值：</p><ul><li>o200k_base： OpenApi o200k_base</li><li>cl100k_base： OpenApi cl100k_base</li><li>p50k_base： OpenApi p50k_base</li><li>r50k_base： OpenApi r50k_base</li></ul>
     */
    public void setDefaultEncodingName(String DefaultEncodingName) {
        this.DefaultEncodingName = DefaultEncodingName;
    }

    /**
     * Get <p>token 计数失败、规则为空或未命中任何规则时执行的默认二级路由（暂时只能选择一个指定模型路由）</p> 
     * @return DefaultTarget <p>token 计数失败、规则为空或未命中任何规则时执行的默认二级路由（暂时只能选择一个指定模型路由）</p>
     */
    public AIGWLLMModelServiceSubRoute getDefaultTarget() {
        return this.DefaultTarget;
    }

    /**
     * Set <p>token 计数失败、规则为空或未命中任何规则时执行的默认二级路由（暂时只能选择一个指定模型路由）</p>
     * @param DefaultTarget <p>token 计数失败、规则为空或未命中任何规则时执行的默认二级路由（暂时只能选择一个指定模型路由）</p>
     */
    public void setDefaultTarget(AIGWLLMModelServiceSubRoute DefaultTarget) {
        this.DefaultTarget = DefaultTarget;
    }

    /**
     * Get <p>规则</p> 
     * @return Rules <p>规则</p>
     */
    public AIGWTokenLengthRouteRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>规则</p>
     * @param Rules <p>规则</p>
     */
    public void setRules(AIGWTokenLengthRouteRule [] Rules) {
        this.Rules = Rules;
    }

    public AIGWTokenLengthRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWTokenLengthRoute(AIGWTokenLengthRoute source) {
        if (source.DefaultEncodingName != null) {
            this.DefaultEncodingName = new String(source.DefaultEncodingName);
        }
        if (source.DefaultTarget != null) {
            this.DefaultTarget = new AIGWLLMModelServiceSubRoute(source.DefaultTarget);
        }
        if (source.Rules != null) {
            this.Rules = new AIGWTokenLengthRouteRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new AIGWTokenLengthRouteRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefaultEncodingName", this.DefaultEncodingName);
        this.setParamObj(map, prefix + "DefaultTarget.", this.DefaultTarget);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

