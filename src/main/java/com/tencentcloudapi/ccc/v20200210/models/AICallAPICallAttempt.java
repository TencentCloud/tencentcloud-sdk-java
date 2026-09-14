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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AICallAPICallAttempt extends AbstractModel {

    /**
    * <p>尝试序号，从 1 开始，1 表示首次调用。</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * <p>本次尝试的发起时间戳，Unix 毫秒级时间戳。</p><p>单位：ms</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * <p>本次尝试的结果状态，取值同 APICall.Status。</p><p>枚举值：</p><ul><li>success： 调通且返回 2xx，进入成功分支</li><li>failed： 调用失败或返回非 2xx，进入失败分支</li><li>internal_fail： 内部调用失败</li><li>terminated： 调用过程中被用户新意图打断，无最终结果</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>本次尝试的 HTTP 状态码。调不通时为 0。</p>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * <p>本次尝试调不通时的错误类型，取值同 APICall.ErrorType。</p><p>枚举值：</p><ul><li>timeout： 请求超时</li><li>connect_failed： 建立连接失败</li><li>dns_failed： DNS 解析失败</li><li>tls_failed： TLS 证书校验失败</li><li>other： 其他错误</li></ul>
    */
    @SerializedName("ErrorType")
    @Expose
    private String ErrorType;

    /**
    * <p>本次尝试的失败摘要，格式为 {状态码或错误类型}：{错误信息}。本次尝试成功时为空。</p>
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * <p>本次尝试耗时。</p><p>单位：ms</p>
    */
    @SerializedName("CostMS")
    @Expose
    private Long CostMS;

    /**
    * <p>本次尝试的请求详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Request")
    @Expose
    private AICallAPICallRequestDetail Request;

    /**
    * <p>本次尝试的响应详情。调不通（Status 为 unreachable）或异步上报时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Response")
    @Expose
    private AICallAPICallResponseDetail Response;

    /**
     * Get <p>尝试序号，从 1 开始，1 表示首次调用。</p> 
     * @return Index <p>尝试序号，从 1 开始，1 表示首次调用。</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>尝试序号，从 1 开始，1 表示首次调用。</p>
     * @param Index <p>尝试序号，从 1 开始，1 表示首次调用。</p>
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get <p>本次尝试的发起时间戳，Unix 毫秒级时间戳。</p><p>单位：ms</p> 
     * @return Timestamp <p>本次尝试的发起时间戳，Unix 毫秒级时间戳。</p><p>单位：ms</p>
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>本次尝试的发起时间戳，Unix 毫秒级时间戳。</p><p>单位：ms</p>
     * @param Timestamp <p>本次尝试的发起时间戳，Unix 毫秒级时间戳。</p><p>单位：ms</p>
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>本次尝试的结果状态，取值同 APICall.Status。</p><p>枚举值：</p><ul><li>success： 调通且返回 2xx，进入成功分支</li><li>failed： 调用失败或返回非 2xx，进入失败分支</li><li>internal_fail： 内部调用失败</li><li>terminated： 调用过程中被用户新意图打断，无最终结果</li></ul> 
     * @return Status <p>本次尝试的结果状态，取值同 APICall.Status。</p><p>枚举值：</p><ul><li>success： 调通且返回 2xx，进入成功分支</li><li>failed： 调用失败或返回非 2xx，进入失败分支</li><li>internal_fail： 内部调用失败</li><li>terminated： 调用过程中被用户新意图打断，无最终结果</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>本次尝试的结果状态，取值同 APICall.Status。</p><p>枚举值：</p><ul><li>success： 调通且返回 2xx，进入成功分支</li><li>failed： 调用失败或返回非 2xx，进入失败分支</li><li>internal_fail： 内部调用失败</li><li>terminated： 调用过程中被用户新意图打断，无最终结果</li></ul>
     * @param Status <p>本次尝试的结果状态，取值同 APICall.Status。</p><p>枚举值：</p><ul><li>success： 调通且返回 2xx，进入成功分支</li><li>failed： 调用失败或返回非 2xx，进入失败分支</li><li>internal_fail： 内部调用失败</li><li>terminated： 调用过程中被用户新意图打断，无最终结果</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>本次尝试的 HTTP 状态码。调不通时为 0。</p> 
     * @return StatusCode <p>本次尝试的 HTTP 状态码。调不通时为 0。</p>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set <p>本次尝试的 HTTP 状态码。调不通时为 0。</p>
     * @param StatusCode <p>本次尝试的 HTTP 状态码。调不通时为 0。</p>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get <p>本次尝试调不通时的错误类型，取值同 APICall.ErrorType。</p><p>枚举值：</p><ul><li>timeout： 请求超时</li><li>connect_failed： 建立连接失败</li><li>dns_failed： DNS 解析失败</li><li>tls_failed： TLS 证书校验失败</li><li>other： 其他错误</li></ul> 
     * @return ErrorType <p>本次尝试调不通时的错误类型，取值同 APICall.ErrorType。</p><p>枚举值：</p><ul><li>timeout： 请求超时</li><li>connect_failed： 建立连接失败</li><li>dns_failed： DNS 解析失败</li><li>tls_failed： TLS 证书校验失败</li><li>other： 其他错误</li></ul>
     */
    public String getErrorType() {
        return this.ErrorType;
    }

    /**
     * Set <p>本次尝试调不通时的错误类型，取值同 APICall.ErrorType。</p><p>枚举值：</p><ul><li>timeout： 请求超时</li><li>connect_failed： 建立连接失败</li><li>dns_failed： DNS 解析失败</li><li>tls_failed： TLS 证书校验失败</li><li>other： 其他错误</li></ul>
     * @param ErrorType <p>本次尝试调不通时的错误类型，取值同 APICall.ErrorType。</p><p>枚举值：</p><ul><li>timeout： 请求超时</li><li>connect_failed： 建立连接失败</li><li>dns_failed： DNS 解析失败</li><li>tls_failed： TLS 证书校验失败</li><li>other： 其他错误</li></ul>
     */
    public void setErrorType(String ErrorType) {
        this.ErrorType = ErrorType;
    }

    /**
     * Get <p>本次尝试的失败摘要，格式为 {状态码或错误类型}：{错误信息}。本次尝试成功时为空。</p> 
     * @return Summary <p>本次尝试的失败摘要，格式为 {状态码或错误类型}：{错误信息}。本次尝试成功时为空。</p>
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>本次尝试的失败摘要，格式为 {状态码或错误类型}：{错误信息}。本次尝试成功时为空。</p>
     * @param Summary <p>本次尝试的失败摘要，格式为 {状态码或错误类型}：{错误信息}。本次尝试成功时为空。</p>
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>本次尝试耗时。</p><p>单位：ms</p> 
     * @return CostMS <p>本次尝试耗时。</p><p>单位：ms</p>
     */
    public Long getCostMS() {
        return this.CostMS;
    }

    /**
     * Set <p>本次尝试耗时。</p><p>单位：ms</p>
     * @param CostMS <p>本次尝试耗时。</p><p>单位：ms</p>
     */
    public void setCostMS(Long CostMS) {
        this.CostMS = CostMS;
    }

    /**
     * Get <p>本次尝试的请求详情。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Request <p>本次尝试的请求详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AICallAPICallRequestDetail getRequest() {
        return this.Request;
    }

    /**
     * Set <p>本次尝试的请求详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Request <p>本次尝试的请求详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequest(AICallAPICallRequestDetail Request) {
        this.Request = Request;
    }

    /**
     * Get <p>本次尝试的响应详情。调不通（Status 为 unreachable）或异步上报时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Response <p>本次尝试的响应详情。调不通（Status 为 unreachable）或异步上报时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AICallAPICallResponseDetail getResponse() {
        return this.Response;
    }

    /**
     * Set <p>本次尝试的响应详情。调不通（Status 为 unreachable）或异步上报时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Response <p>本次尝试的响应详情。调不通（Status 为 unreachable）或异步上报时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponse(AICallAPICallResponseDetail Response) {
        this.Response = Response;
    }

    public AICallAPICallAttempt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallAPICallAttempt(AICallAPICallAttempt source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.ErrorType != null) {
            this.ErrorType = new String(source.ErrorType);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.CostMS != null) {
            this.CostMS = new Long(source.CostMS);
        }
        if (source.Request != null) {
            this.Request = new AICallAPICallRequestDetail(source.Request);
        }
        if (source.Response != null) {
            this.Response = new AICallAPICallResponseDetail(source.Response);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "ErrorType", this.ErrorType);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "CostMS", this.CostMS);
        this.setParamObj(map, prefix + "Request.", this.Request);
        this.setParamObj(map, prefix + "Response.", this.Response);

    }
}

