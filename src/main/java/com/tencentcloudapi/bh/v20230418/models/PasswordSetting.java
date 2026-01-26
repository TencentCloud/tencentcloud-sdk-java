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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PasswordSetting extends AbstractModel {

    /**
    * 密码最小长度，8-20，默认8。
    */
    @SerializedName("MinLength")
    @Expose
    private Long MinLength;

    /**
    * 密码复杂度，0不限制，1包含字母和数字，2至少包括大写字母、小写字母、数字、特殊符号，默认2。
    */
    @SerializedName("Complexity")
    @Expose
    private Long Complexity;

    /**
    * 密码有效期，0不限制，30天，90天，180天。
    */
    @SerializedName("ValidTerm")
    @Expose
    private Long ValidTerm;

    /**
    * 检查最近n次密码设置是否存在相同密码，2-10，默认5。
    */
    @SerializedName("CheckHistory")
    @Expose
    private Long CheckHistory;

    /**
     * Get 密码最小长度，8-20，默认8。 
     * @return MinLength 密码最小长度，8-20，默认8。
     */
    public Long getMinLength() {
        return this.MinLength;
    }

    /**
     * Set 密码最小长度，8-20，默认8。
     * @param MinLength 密码最小长度，8-20，默认8。
     */
    public void setMinLength(Long MinLength) {
        this.MinLength = MinLength;
    }

    /**
     * Get 密码复杂度，0不限制，1包含字母和数字，2至少包括大写字母、小写字母、数字、特殊符号，默认2。 
     * @return Complexity 密码复杂度，0不限制，1包含字母和数字，2至少包括大写字母、小写字母、数字、特殊符号，默认2。
     */
    public Long getComplexity() {
        return this.Complexity;
    }

    /**
     * Set 密码复杂度，0不限制，1包含字母和数字，2至少包括大写字母、小写字母、数字、特殊符号，默认2。
     * @param Complexity 密码复杂度，0不限制，1包含字母和数字，2至少包括大写字母、小写字母、数字、特殊符号，默认2。
     */
    public void setComplexity(Long Complexity) {
        this.Complexity = Complexity;
    }

    /**
     * Get 密码有效期，0不限制，30天，90天，180天。 
     * @return ValidTerm 密码有效期，0不限制，30天，90天，180天。
     */
    public Long getValidTerm() {
        return this.ValidTerm;
    }

    /**
     * Set 密码有效期，0不限制，30天，90天，180天。
     * @param ValidTerm 密码有效期，0不限制，30天，90天，180天。
     */
    public void setValidTerm(Long ValidTerm) {
        this.ValidTerm = ValidTerm;
    }

    /**
     * Get 检查最近n次密码设置是否存在相同密码，2-10，默认5。 
     * @return CheckHistory 检查最近n次密码设置是否存在相同密码，2-10，默认5。
     */
    public Long getCheckHistory() {
        return this.CheckHistory;
    }

    /**
     * Set 检查最近n次密码设置是否存在相同密码，2-10，默认5。
     * @param CheckHistory 检查最近n次密码设置是否存在相同密码，2-10，默认5。
     */
    public void setCheckHistory(Long CheckHistory) {
        this.CheckHistory = CheckHistory;
    }

    public PasswordSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PasswordSetting(PasswordSetting source) {
        if (source.MinLength != null) {
            this.MinLength = new Long(source.MinLength);
        }
        if (source.Complexity != null) {
            this.Complexity = new Long(source.Complexity);
        }
        if (source.ValidTerm != null) {
            this.ValidTerm = new Long(source.ValidTerm);
        }
        if (source.CheckHistory != null) {
            this.CheckHistory = new Long(source.CheckHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinLength", this.MinLength);
        this.setParamSimple(map, prefix + "Complexity", this.Complexity);
        this.setParamSimple(map, prefix + "ValidTerm", this.ValidTerm);
        this.setParamSimple(map, prefix + "CheckHistory", this.CheckHistory);

    }
}

