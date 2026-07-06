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

public class ModelSpec extends AbstractModel {

    /**
    * 每分钟处理 Token 数（Tokens Per Minute）。
    */
    @SerializedName("TPM")
    @Expose
    private String TPM;

    /**
    * 每分钟请求数（Queries Per Minute）。
    */
    @SerializedName("QPM")
    @Expose
    private String QPM;

    /**
    * 最大输入 Token 长度。
    */
    @SerializedName("MaxInputToken")
    @Expose
    private String MaxInputToken;

    /**
    * 最大输出 Token 长度。
    */
    @SerializedName("MaxOutputToken")
    @Expose
    private String MaxOutputToken;

    /**
    * 上下文窗口长度。
    */
    @SerializedName("ContextLength")
    @Expose
    private String ContextLength;

    /**
    * 并发数。
    */
    @SerializedName("Concurrency")
    @Expose
    private String Concurrency;

    /**
    * 输入要求描述。
    */
    @SerializedName("InputDescription")
    @Expose
    private String InputDescription;

    /**
     * Get 每分钟处理 Token 数（Tokens Per Minute）。 
     * @return TPM 每分钟处理 Token 数（Tokens Per Minute）。
     */
    public String getTPM() {
        return this.TPM;
    }

    /**
     * Set 每分钟处理 Token 数（Tokens Per Minute）。
     * @param TPM 每分钟处理 Token 数（Tokens Per Minute）。
     */
    public void setTPM(String TPM) {
        this.TPM = TPM;
    }

    /**
     * Get 每分钟请求数（Queries Per Minute）。 
     * @return QPM 每分钟请求数（Queries Per Minute）。
     */
    public String getQPM() {
        return this.QPM;
    }

    /**
     * Set 每分钟请求数（Queries Per Minute）。
     * @param QPM 每分钟请求数（Queries Per Minute）。
     */
    public void setQPM(String QPM) {
        this.QPM = QPM;
    }

    /**
     * Get 最大输入 Token 长度。 
     * @return MaxInputToken 最大输入 Token 长度。
     */
    public String getMaxInputToken() {
        return this.MaxInputToken;
    }

    /**
     * Set 最大输入 Token 长度。
     * @param MaxInputToken 最大输入 Token 长度。
     */
    public void setMaxInputToken(String MaxInputToken) {
        this.MaxInputToken = MaxInputToken;
    }

    /**
     * Get 最大输出 Token 长度。 
     * @return MaxOutputToken 最大输出 Token 长度。
     */
    public String getMaxOutputToken() {
        return this.MaxOutputToken;
    }

    /**
     * Set 最大输出 Token 长度。
     * @param MaxOutputToken 最大输出 Token 长度。
     */
    public void setMaxOutputToken(String MaxOutputToken) {
        this.MaxOutputToken = MaxOutputToken;
    }

    /**
     * Get 上下文窗口长度。 
     * @return ContextLength 上下文窗口长度。
     */
    public String getContextLength() {
        return this.ContextLength;
    }

    /**
     * Set 上下文窗口长度。
     * @param ContextLength 上下文窗口长度。
     */
    public void setContextLength(String ContextLength) {
        this.ContextLength = ContextLength;
    }

    /**
     * Get 并发数。 
     * @return Concurrency 并发数。
     */
    public String getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set 并发数。
     * @param Concurrency 并发数。
     */
    public void setConcurrency(String Concurrency) {
        this.Concurrency = Concurrency;
    }

    /**
     * Get 输入要求描述。 
     * @return InputDescription 输入要求描述。
     */
    public String getInputDescription() {
        return this.InputDescription;
    }

    /**
     * Set 输入要求描述。
     * @param InputDescription 输入要求描述。
     */
    public void setInputDescription(String InputDescription) {
        this.InputDescription = InputDescription;
    }

    public ModelSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelSpec(ModelSpec source) {
        if (source.TPM != null) {
            this.TPM = new String(source.TPM);
        }
        if (source.QPM != null) {
            this.QPM = new String(source.QPM);
        }
        if (source.MaxInputToken != null) {
            this.MaxInputToken = new String(source.MaxInputToken);
        }
        if (source.MaxOutputToken != null) {
            this.MaxOutputToken = new String(source.MaxOutputToken);
        }
        if (source.ContextLength != null) {
            this.ContextLength = new String(source.ContextLength);
        }
        if (source.Concurrency != null) {
            this.Concurrency = new String(source.Concurrency);
        }
        if (source.InputDescription != null) {
            this.InputDescription = new String(source.InputDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TPM", this.TPM);
        this.setParamSimple(map, prefix + "QPM", this.QPM);
        this.setParamSimple(map, prefix + "MaxInputToken", this.MaxInputToken);
        this.setParamSimple(map, prefix + "MaxOutputToken", this.MaxOutputToken);
        this.setParamSimple(map, prefix + "ContextLength", this.ContextLength);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);
        this.setParamSimple(map, prefix + "InputDescription", this.InputDescription);

    }
}

