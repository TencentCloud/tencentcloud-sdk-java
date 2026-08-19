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

public class SessionIdAffinityConfig extends AbstractModel {

    /**
    * <p>会话 ID 参数的传递位置。不填写时默认为 Header。</p><p>枚举值：</p><ul><li>Header： 在请求头中传递参数。</li></ul><p>默认值：Header。</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>传递会话 ID 的请求头名称。当 Source 为 Header 时必填。<br>不填写时默认为 EO-Infer-Session-Id。</p><p>入参限制：长度为 1-64 个字符，仅支持字母、数字、中划线。</p><p>默认值：EO-Infer-Session-Id。</p>
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
     * Get <p>会话 ID 参数的传递位置。不填写时默认为 Header。</p><p>枚举值：</p><ul><li>Header： 在请求头中传递参数。</li></ul><p>默认值：Header。</p> 
     * @return Source <p>会话 ID 参数的传递位置。不填写时默认为 Header。</p><p>枚举值：</p><ul><li>Header： 在请求头中传递参数。</li></ul><p>默认值：Header。</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>会话 ID 参数的传递位置。不填写时默认为 Header。</p><p>枚举值：</p><ul><li>Header： 在请求头中传递参数。</li></ul><p>默认值：Header。</p>
     * @param Source <p>会话 ID 参数的传递位置。不填写时默认为 Header。</p><p>枚举值：</p><ul><li>Header： 在请求头中传递参数。</li></ul><p>默认值：Header。</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>传递会话 ID 的请求头名称。当 Source 为 Header 时必填。<br>不填写时默认为 EO-Infer-Session-Id。</p><p>入参限制：长度为 1-64 个字符，仅支持字母、数字、中划线。</p><p>默认值：EO-Infer-Session-Id。</p> 
     * @return HeaderName <p>传递会话 ID 的请求头名称。当 Source 为 Header 时必填。<br>不填写时默认为 EO-Infer-Session-Id。</p><p>入参限制：长度为 1-64 个字符，仅支持字母、数字、中划线。</p><p>默认值：EO-Infer-Session-Id。</p>
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set <p>传递会话 ID 的请求头名称。当 Source 为 Header 时必填。<br>不填写时默认为 EO-Infer-Session-Id。</p><p>入参限制：长度为 1-64 个字符，仅支持字母、数字、中划线。</p><p>默认值：EO-Infer-Session-Id。</p>
     * @param HeaderName <p>传递会话 ID 的请求头名称。当 Source 为 Header 时必填。<br>不填写时默认为 EO-Infer-Session-Id。</p><p>入参限制：长度为 1-64 个字符，仅支持字母、数字、中划线。</p><p>默认值：EO-Infer-Session-Id。</p>
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    public SessionIdAffinityConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionIdAffinityConfig(SessionIdAffinityConfig source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.HeaderName != null) {
            this.HeaderName = new String(source.HeaderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);

    }
}

