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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageStats extends AbstractModel {

    /**
    * 时间周期内的累计总 token 数。
    */
    @SerializedName("TotalToken")
    @Expose
    private Long TotalToken;

    /**
    * 时间周期内的累计输入 token 数。
    */
    @SerializedName("InputTotalToken")
    @Expose
    private Long InputTotalToken;

    /**
    * 时间周期内的累计输出 token 数。
    */
    @SerializedName("OutputTotalToken")
    @Expose
    private Long OutputTotalToken;

    /**
     * Get 时间周期内的累计总 token 数。 
     * @return TotalToken 时间周期内的累计总 token 数。
     */
    public Long getTotalToken() {
        return this.TotalToken;
    }

    /**
     * Set 时间周期内的累计总 token 数。
     * @param TotalToken 时间周期内的累计总 token 数。
     */
    public void setTotalToken(Long TotalToken) {
        this.TotalToken = TotalToken;
    }

    /**
     * Get 时间周期内的累计输入 token 数。 
     * @return InputTotalToken 时间周期内的累计输入 token 数。
     */
    public Long getInputTotalToken() {
        return this.InputTotalToken;
    }

    /**
     * Set 时间周期内的累计输入 token 数。
     * @param InputTotalToken 时间周期内的累计输入 token 数。
     */
    public void setInputTotalToken(Long InputTotalToken) {
        this.InputTotalToken = InputTotalToken;
    }

    /**
     * Get 时间周期内的累计输出 token 数。 
     * @return OutputTotalToken 时间周期内的累计输出 token 数。
     */
    public Long getOutputTotalToken() {
        return this.OutputTotalToken;
    }

    /**
     * Set 时间周期内的累计输出 token 数。
     * @param OutputTotalToken 时间周期内的累计输出 token 数。
     */
    public void setOutputTotalToken(Long OutputTotalToken) {
        this.OutputTotalToken = OutputTotalToken;
    }

    public UsageStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageStats(UsageStats source) {
        if (source.TotalToken != null) {
            this.TotalToken = new Long(source.TotalToken);
        }
        if (source.InputTotalToken != null) {
            this.InputTotalToken = new Long(source.InputTotalToken);
        }
        if (source.OutputTotalToken != null) {
            this.OutputTotalToken = new Long(source.OutputTotalToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalToken", this.TotalToken);
        this.setParamSimple(map, prefix + "InputTotalToken", this.InputTotalToken);
        this.setParamSimple(map, prefix + "OutputTotalToken", this.OutputTotalToken);

    }
}

