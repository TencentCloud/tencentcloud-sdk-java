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

public class UsageSeries extends AbstractModel {

    /**
    * 总 token 数用量时间周期内的 JSON 字符串形式，如 `"[12,null,15]"`。
    */
    @SerializedName("TotalToken")
    @Expose
    private String TotalToken;

    /**
    * 输入 token 数用量时间周期内的 JSON 字符串形式，如 `"[7,null,9]"`。
    */
    @SerializedName("InputTotalToken")
    @Expose
    private String InputTotalToken;

    /**
    * 输出 token 数用量时间周期内的 JSON 字符串形式，如 `"[5,null,6]"`。
    */
    @SerializedName("OutputTotalToken")
    @Expose
    private String OutputTotalToken;

    /**
     * Get 总 token 数用量时间周期内的 JSON 字符串形式，如 `"[12,null,15]"`。 
     * @return TotalToken 总 token 数用量时间周期内的 JSON 字符串形式，如 `"[12,null,15]"`。
     */
    public String getTotalToken() {
        return this.TotalToken;
    }

    /**
     * Set 总 token 数用量时间周期内的 JSON 字符串形式，如 `"[12,null,15]"`。
     * @param TotalToken 总 token 数用量时间周期内的 JSON 字符串形式，如 `"[12,null,15]"`。
     */
    public void setTotalToken(String TotalToken) {
        this.TotalToken = TotalToken;
    }

    /**
     * Get 输入 token 数用量时间周期内的 JSON 字符串形式，如 `"[7,null,9]"`。 
     * @return InputTotalToken 输入 token 数用量时间周期内的 JSON 字符串形式，如 `"[7,null,9]"`。
     */
    public String getInputTotalToken() {
        return this.InputTotalToken;
    }

    /**
     * Set 输入 token 数用量时间周期内的 JSON 字符串形式，如 `"[7,null,9]"`。
     * @param InputTotalToken 输入 token 数用量时间周期内的 JSON 字符串形式，如 `"[7,null,9]"`。
     */
    public void setInputTotalToken(String InputTotalToken) {
        this.InputTotalToken = InputTotalToken;
    }

    /**
     * Get 输出 token 数用量时间周期内的 JSON 字符串形式，如 `"[5,null,6]"`。 
     * @return OutputTotalToken 输出 token 数用量时间周期内的 JSON 字符串形式，如 `"[5,null,6]"`。
     */
    public String getOutputTotalToken() {
        return this.OutputTotalToken;
    }

    /**
     * Set 输出 token 数用量时间周期内的 JSON 字符串形式，如 `"[5,null,6]"`。
     * @param OutputTotalToken 输出 token 数用量时间周期内的 JSON 字符串形式，如 `"[5,null,6]"`。
     */
    public void setOutputTotalToken(String OutputTotalToken) {
        this.OutputTotalToken = OutputTotalToken;
    }

    public UsageSeries() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageSeries(UsageSeries source) {
        if (source.TotalToken != null) {
            this.TotalToken = new String(source.TotalToken);
        }
        if (source.InputTotalToken != null) {
            this.InputTotalToken = new String(source.InputTotalToken);
        }
        if (source.OutputTotalToken != null) {
            this.OutputTotalToken = new String(source.OutputTotalToken);
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

