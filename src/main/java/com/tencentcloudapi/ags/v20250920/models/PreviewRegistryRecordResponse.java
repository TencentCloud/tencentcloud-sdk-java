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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreviewRegistryRecordResponse extends AbstractModel {

    /**
    * <p>只读元数据预览结果对象（JSON 字符串形式）。字段：StatusCode（远端 HTTP 状态码，必返）、Body（远端响应体截断字符串，必返）、HasUpdate（Boolean，必返；远端内容按 Sync 相同的规范化规则处理后是否与请求 Version 配置不同；Error 非空时固定返回 false，此时不表示远端没有变化）、Error（调用错误信息，可选）。</p>
    */
    @SerializedName("PreviewResult")
    @Expose
    private String PreviewResult;

    /**
    * <p>实际预览的 Version ID（由 VersionId / Label 解析得到）。</p>
    */
    @SerializedName("ResolvedVersionId")
    @Expose
    private String ResolvedVersionId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>只读元数据预览结果对象（JSON 字符串形式）。字段：StatusCode（远端 HTTP 状态码，必返）、Body（远端响应体截断字符串，必返）、HasUpdate（Boolean，必返；远端内容按 Sync 相同的规范化规则处理后是否与请求 Version 配置不同；Error 非空时固定返回 false，此时不表示远端没有变化）、Error（调用错误信息，可选）。</p> 
     * @return PreviewResult <p>只读元数据预览结果对象（JSON 字符串形式）。字段：StatusCode（远端 HTTP 状态码，必返）、Body（远端响应体截断字符串，必返）、HasUpdate（Boolean，必返；远端内容按 Sync 相同的规范化规则处理后是否与请求 Version 配置不同；Error 非空时固定返回 false，此时不表示远端没有变化）、Error（调用错误信息，可选）。</p>
     */
    public String getPreviewResult() {
        return this.PreviewResult;
    }

    /**
     * Set <p>只读元数据预览结果对象（JSON 字符串形式）。字段：StatusCode（远端 HTTP 状态码，必返）、Body（远端响应体截断字符串，必返）、HasUpdate（Boolean，必返；远端内容按 Sync 相同的规范化规则处理后是否与请求 Version 配置不同；Error 非空时固定返回 false，此时不表示远端没有变化）、Error（调用错误信息，可选）。</p>
     * @param PreviewResult <p>只读元数据预览结果对象（JSON 字符串形式）。字段：StatusCode（远端 HTTP 状态码，必返）、Body（远端响应体截断字符串，必返）、HasUpdate（Boolean，必返；远端内容按 Sync 相同的规范化规则处理后是否与请求 Version 配置不同；Error 非空时固定返回 false，此时不表示远端没有变化）、Error（调用错误信息，可选）。</p>
     */
    public void setPreviewResult(String PreviewResult) {
        this.PreviewResult = PreviewResult;
    }

    /**
     * Get <p>实际预览的 Version ID（由 VersionId / Label 解析得到）。</p> 
     * @return ResolvedVersionId <p>实际预览的 Version ID（由 VersionId / Label 解析得到）。</p>
     */
    public String getResolvedVersionId() {
        return this.ResolvedVersionId;
    }

    /**
     * Set <p>实际预览的 Version ID（由 VersionId / Label 解析得到）。</p>
     * @param ResolvedVersionId <p>实际预览的 Version ID（由 VersionId / Label 解析得到）。</p>
     */
    public void setResolvedVersionId(String ResolvedVersionId) {
        this.ResolvedVersionId = ResolvedVersionId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public PreviewRegistryRecordResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewRegistryRecordResponse(PreviewRegistryRecordResponse source) {
        if (source.PreviewResult != null) {
            this.PreviewResult = new String(source.PreviewResult);
        }
        if (source.ResolvedVersionId != null) {
            this.ResolvedVersionId = new String(source.ResolvedVersionId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PreviewResult", this.PreviewResult);
        this.setParamSimple(map, prefix + "ResolvedVersionId", this.ResolvedVersionId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

