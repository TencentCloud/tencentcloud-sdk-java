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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedAIModelSpec extends AbstractModel {

    /**
    * <p>最大输入 Token</p>
    */
    @SerializedName("MaxInputToken")
    @Expose
    private String MaxInputToken;

    /**
    * <p>最大输出 Token</p>
    */
    @SerializedName("MaxOutputToken")
    @Expose
    private String MaxOutputToken;

    /**
    * <p>上下文长度</p>
    */
    @SerializedName("ContextLength")
    @Expose
    private String ContextLength;

    /**
     * Get <p>最大输入 Token</p> 
     * @return MaxInputToken <p>最大输入 Token</p>
     */
    public String getMaxInputToken() {
        return this.MaxInputToken;
    }

    /**
     * Set <p>最大输入 Token</p>
     * @param MaxInputToken <p>最大输入 Token</p>
     */
    public void setMaxInputToken(String MaxInputToken) {
        this.MaxInputToken = MaxInputToken;
    }

    /**
     * Get <p>最大输出 Token</p> 
     * @return MaxOutputToken <p>最大输出 Token</p>
     */
    public String getMaxOutputToken() {
        return this.MaxOutputToken;
    }

    /**
     * Set <p>最大输出 Token</p>
     * @param MaxOutputToken <p>最大输出 Token</p>
     */
    public void setMaxOutputToken(String MaxOutputToken) {
        this.MaxOutputToken = MaxOutputToken;
    }

    /**
     * Get <p>上下文长度</p> 
     * @return ContextLength <p>上下文长度</p>
     */
    public String getContextLength() {
        return this.ContextLength;
    }

    /**
     * Set <p>上下文长度</p>
     * @param ContextLength <p>上下文长度</p>
     */
    public void setContextLength(String ContextLength) {
        this.ContextLength = ContextLength;
    }

    public ManagedAIModelSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedAIModelSpec(ManagedAIModelSpec source) {
        if (source.MaxInputToken != null) {
            this.MaxInputToken = new String(source.MaxInputToken);
        }
        if (source.MaxOutputToken != null) {
            this.MaxOutputToken = new String(source.MaxOutputToken);
        }
        if (source.ContextLength != null) {
            this.ContextLength = new String(source.ContextLength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxInputToken", this.MaxInputToken);
        this.setParamSimple(map, prefix + "MaxOutputToken", this.MaxOutputToken);
        this.setParamSimple(map, prefix + "ContextLength", this.ContextLength);

    }
}

