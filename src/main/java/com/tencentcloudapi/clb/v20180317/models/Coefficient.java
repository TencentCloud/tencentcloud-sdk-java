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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Coefficient extends AbstractModel {

    /**
    * <p>缓存命中输入积分系数。</p><p>用于 provider prompt cache 命中的输入 token。</p><p>取值范围：[0, 5000]</p><p>默认值：3</p>
    */
    @SerializedName("InputCachedCoefficient")
    @Expose
    private Float InputCachedCoefficient;

    /**
    * <p>输入积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：25</p>
    */
    @SerializedName("InputCoefficient")
    @Expose
    private Float InputCoefficient;

    /**
    * <p>输出积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：100</p>
    */
    @SerializedName("OutputCoefficient")
    @Expose
    private Float OutputCoefficient;

    /**
     * Get <p>缓存命中输入积分系数。</p><p>用于 provider prompt cache 命中的输入 token。</p><p>取值范围：[0, 5000]</p><p>默认值：3</p> 
     * @return InputCachedCoefficient <p>缓存命中输入积分系数。</p><p>用于 provider prompt cache 命中的输入 token。</p><p>取值范围：[0, 5000]</p><p>默认值：3</p>
     */
    public Float getInputCachedCoefficient() {
        return this.InputCachedCoefficient;
    }

    /**
     * Set <p>缓存命中输入积分系数。</p><p>用于 provider prompt cache 命中的输入 token。</p><p>取值范围：[0, 5000]</p><p>默认值：3</p>
     * @param InputCachedCoefficient <p>缓存命中输入积分系数。</p><p>用于 provider prompt cache 命中的输入 token。</p><p>取值范围：[0, 5000]</p><p>默认值：3</p>
     */
    public void setInputCachedCoefficient(Float InputCachedCoefficient) {
        this.InputCachedCoefficient = InputCachedCoefficient;
    }

    /**
     * Get <p>输入积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：25</p> 
     * @return InputCoefficient <p>输入积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：25</p>
     */
    public Float getInputCoefficient() {
        return this.InputCoefficient;
    }

    /**
     * Set <p>输入积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：25</p>
     * @param InputCoefficient <p>输入积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：25</p>
     */
    public void setInputCoefficient(Float InputCoefficient) {
        this.InputCoefficient = InputCoefficient;
    }

    /**
     * Get <p>输出积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：100</p> 
     * @return OutputCoefficient <p>输出积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：100</p>
     */
    public Float getOutputCoefficient() {
        return this.OutputCoefficient;
    }

    /**
     * Set <p>输出积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：100</p>
     * @param OutputCoefficient <p>输出积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：100</p>
     */
    public void setOutputCoefficient(Float OutputCoefficient) {
        this.OutputCoefficient = OutputCoefficient;
    }

    public Coefficient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Coefficient(Coefficient source) {
        if (source.InputCachedCoefficient != null) {
            this.InputCachedCoefficient = new Float(source.InputCachedCoefficient);
        }
        if (source.InputCoefficient != null) {
            this.InputCoefficient = new Float(source.InputCoefficient);
        }
        if (source.OutputCoefficient != null) {
            this.OutputCoefficient = new Float(source.OutputCoefficient);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputCachedCoefficient", this.InputCachedCoefficient);
        this.setParamSimple(map, prefix + "InputCoefficient", this.InputCoefficient);
        this.setParamSimple(map, prefix + "OutputCoefficient", this.OutputCoefficient);

    }
}

