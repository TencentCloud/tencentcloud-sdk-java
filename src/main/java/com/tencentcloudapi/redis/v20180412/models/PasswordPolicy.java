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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PasswordPolicy extends AbstractModel {

    /**
    * <p>是否启用实例级密码复杂度策略。</p><ul><li>true：开启。所有密码变动（创建/重置）必须通过下方定义的复杂度校验。</li><li>false：关闭。不进行复杂度过滤。</li></ul><p>默认值：false</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>大小写字母最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul>
    */
    @SerializedName("MinLetterCount")
    @Expose
    private Long MinLetterCount;

    /**
    * <p>数字字符的最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul>
    */
    @SerializedName("MinDigitCount")
    @Expose
    private Long MinDigitCount;

    /**
    * <p>特殊字符最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul>
    */
    @SerializedName("MinSpecialCount")
    @Expose
    private Long MinSpecialCount;

    /**
    * <p>密码的最小总长度（字符数）。</p><ul><li>取值范围：[8, 64]。</li><li>默认值：8。</li><li>约束限制：密码的最小总长度必须大于或等于 MinLetterCount 、MinDigitCount 与 MinSpecialCount 三个参数之和。</li></ul>
    */
    @SerializedName("MinLength")
    @Expose
    private Long MinLength;

    /**
     * Get <p>是否启用实例级密码复杂度策略。</p><ul><li>true：开启。所有密码变动（创建/重置）必须通过下方定义的复杂度校验。</li><li>false：关闭。不进行复杂度过滤。</li></ul><p>默认值：false</p> 
     * @return Enabled <p>是否启用实例级密码复杂度策略。</p><ul><li>true：开启。所有密码变动（创建/重置）必须通过下方定义的复杂度校验。</li><li>false：关闭。不进行复杂度过滤。</li></ul><p>默认值：false</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用实例级密码复杂度策略。</p><ul><li>true：开启。所有密码变动（创建/重置）必须通过下方定义的复杂度校验。</li><li>false：关闭。不进行复杂度过滤。</li></ul><p>默认值：false</p>
     * @param Enabled <p>是否启用实例级密码复杂度策略。</p><ul><li>true：开启。所有密码变动（创建/重置）必须通过下方定义的复杂度校验。</li><li>false：关闭。不进行复杂度过滤。</li></ul><p>默认值：false</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>大小写字母最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul> 
     * @return MinLetterCount <p>大小写字母最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul>
     */
    public Long getMinLetterCount() {
        return this.MinLetterCount;
    }

    /**
     * Set <p>大小写字母最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul>
     * @param MinLetterCount <p>大小写字母最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul>
     */
    public void setMinLetterCount(Long MinLetterCount) {
        this.MinLetterCount = MinLetterCount;
    }

    /**
     * Get <p>数字字符的最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul> 
     * @return MinDigitCount <p>数字字符的最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul>
     */
    public Long getMinDigitCount() {
        return this.MinDigitCount;
    }

    /**
     * Set <p>数字字符的最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul>
     * @param MinDigitCount <p>数字字符的最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul>
     */
    public void setMinDigitCount(Long MinDigitCount) {
        this.MinDigitCount = MinDigitCount;
    }

    /**
     * Get <p>特殊字符最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul> 
     * @return MinSpecialCount <p>特殊字符最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul>
     */
    public Long getMinSpecialCount() {
        return this.MinSpecialCount;
    }

    /**
     * Set <p>特殊字符最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul>
     * @param MinSpecialCount <p>特殊字符最小字符数。</p><ul><li>取值范围：[1,16]。</li><li>默认值：1。</li></ul>
     */
    public void setMinSpecialCount(Long MinSpecialCount) {
        this.MinSpecialCount = MinSpecialCount;
    }

    /**
     * Get <p>密码的最小总长度（字符数）。</p><ul><li>取值范围：[8, 64]。</li><li>默认值：8。</li><li>约束限制：密码的最小总长度必须大于或等于 MinLetterCount 、MinDigitCount 与 MinSpecialCount 三个参数之和。</li></ul> 
     * @return MinLength <p>密码的最小总长度（字符数）。</p><ul><li>取值范围：[8, 64]。</li><li>默认值：8。</li><li>约束限制：密码的最小总长度必须大于或等于 MinLetterCount 、MinDigitCount 与 MinSpecialCount 三个参数之和。</li></ul>
     */
    public Long getMinLength() {
        return this.MinLength;
    }

    /**
     * Set <p>密码的最小总长度（字符数）。</p><ul><li>取值范围：[8, 64]。</li><li>默认值：8。</li><li>约束限制：密码的最小总长度必须大于或等于 MinLetterCount 、MinDigitCount 与 MinSpecialCount 三个参数之和。</li></ul>
     * @param MinLength <p>密码的最小总长度（字符数）。</p><ul><li>取值范围：[8, 64]。</li><li>默认值：8。</li><li>约束限制：密码的最小总长度必须大于或等于 MinLetterCount 、MinDigitCount 与 MinSpecialCount 三个参数之和。</li></ul>
     */
    public void setMinLength(Long MinLength) {
        this.MinLength = MinLength;
    }

    public PasswordPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PasswordPolicy(PasswordPolicy source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.MinLetterCount != null) {
            this.MinLetterCount = new Long(source.MinLetterCount);
        }
        if (source.MinDigitCount != null) {
            this.MinDigitCount = new Long(source.MinDigitCount);
        }
        if (source.MinSpecialCount != null) {
            this.MinSpecialCount = new Long(source.MinSpecialCount);
        }
        if (source.MinLength != null) {
            this.MinLength = new Long(source.MinLength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "MinLetterCount", this.MinLetterCount);
        this.setParamSimple(map, prefix + "MinDigitCount", this.MinDigitCount);
        this.setParamSimple(map, prefix + "MinSpecialCount", this.MinSpecialCount);
        this.setParamSimple(map, prefix + "MinLength", this.MinLength);

    }
}

