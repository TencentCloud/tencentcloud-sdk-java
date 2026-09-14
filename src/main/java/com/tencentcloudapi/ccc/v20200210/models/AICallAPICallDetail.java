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

public class AICallAPICallDetail extends AbstractModel {

    /**
    * <p>是否异步上报。节点配置「等待接口返回」关闭时为 true，此时不处理响应也不影响流程走向，Status、StatusCode、CostMS 等结果字段均为空，只记录 Attempts 中的请求详情。</p>
    */
    @SerializedName("Async")
    @Expose
    private Boolean Async;

    /**
    * <p>本次接口调用的最终状态，重试场景为最后一次尝试的状态，Async 为 true 时为空。后续可能新增取值，请做好兼容。</p><p>枚举值：</p><ul><li>success： 调通且返回 2xx，进入成功分支</li><li>failed： 调用失败或返回非 2xx，进入失败分支</li><li>terminated： 调用过程中被用户新意图打断，无最终结果</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>最终 HTTP 状态码。调不通或异步上报时为 0。</p>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * <p>失败摘要，格式为 {状态码或错误类型}：{错误信息}。调用成功时为空。</p>
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * <p>接口调用总耗时，包含全部重试。异步上报时为 0。</p><p>单位：ms</p>
    */
    @SerializedName("CostMS")
    @Expose
    private Long CostMS;

    /**
    * <p>重试次数。0 表示首次调用即结束，未发生重试。</p>
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * <p>每次尝试的明细，按时间顺序排列，至少包含首次调用。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attempts")
    @Expose
    private AICallAPICallAttempt [] Attempts;

    /**
     * Get <p>是否异步上报。节点配置「等待接口返回」关闭时为 true，此时不处理响应也不影响流程走向，Status、StatusCode、CostMS 等结果字段均为空，只记录 Attempts 中的请求详情。</p> 
     * @return Async <p>是否异步上报。节点配置「等待接口返回」关闭时为 true，此时不处理响应也不影响流程走向，Status、StatusCode、CostMS 等结果字段均为空，只记录 Attempts 中的请求详情。</p>
     */
    public Boolean getAsync() {
        return this.Async;
    }

    /**
     * Set <p>是否异步上报。节点配置「等待接口返回」关闭时为 true，此时不处理响应也不影响流程走向，Status、StatusCode、CostMS 等结果字段均为空，只记录 Attempts 中的请求详情。</p>
     * @param Async <p>是否异步上报。节点配置「等待接口返回」关闭时为 true，此时不处理响应也不影响流程走向，Status、StatusCode、CostMS 等结果字段均为空，只记录 Attempts 中的请求详情。</p>
     */
    public void setAsync(Boolean Async) {
        this.Async = Async;
    }

    /**
     * Get <p>本次接口调用的最终状态，重试场景为最后一次尝试的状态，Async 为 true 时为空。后续可能新增取值，请做好兼容。</p><p>枚举值：</p><ul><li>success： 调通且返回 2xx，进入成功分支</li><li>failed： 调用失败或返回非 2xx，进入失败分支</li><li>terminated： 调用过程中被用户新意图打断，无最终结果</li></ul> 
     * @return Status <p>本次接口调用的最终状态，重试场景为最后一次尝试的状态，Async 为 true 时为空。后续可能新增取值，请做好兼容。</p><p>枚举值：</p><ul><li>success： 调通且返回 2xx，进入成功分支</li><li>failed： 调用失败或返回非 2xx，进入失败分支</li><li>terminated： 调用过程中被用户新意图打断，无最终结果</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>本次接口调用的最终状态，重试场景为最后一次尝试的状态，Async 为 true 时为空。后续可能新增取值，请做好兼容。</p><p>枚举值：</p><ul><li>success： 调通且返回 2xx，进入成功分支</li><li>failed： 调用失败或返回非 2xx，进入失败分支</li><li>terminated： 调用过程中被用户新意图打断，无最终结果</li></ul>
     * @param Status <p>本次接口调用的最终状态，重试场景为最后一次尝试的状态，Async 为 true 时为空。后续可能新增取值，请做好兼容。</p><p>枚举值：</p><ul><li>success： 调通且返回 2xx，进入成功分支</li><li>failed： 调用失败或返回非 2xx，进入失败分支</li><li>terminated： 调用过程中被用户新意图打断，无最终结果</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>最终 HTTP 状态码。调不通或异步上报时为 0。</p> 
     * @return StatusCode <p>最终 HTTP 状态码。调不通或异步上报时为 0。</p>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set <p>最终 HTTP 状态码。调不通或异步上报时为 0。</p>
     * @param StatusCode <p>最终 HTTP 状态码。调不通或异步上报时为 0。</p>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get <p>失败摘要，格式为 {状态码或错误类型}：{错误信息}。调用成功时为空。</p> 
     * @return Summary <p>失败摘要，格式为 {状态码或错误类型}：{错误信息}。调用成功时为空。</p>
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>失败摘要，格式为 {状态码或错误类型}：{错误信息}。调用成功时为空。</p>
     * @param Summary <p>失败摘要，格式为 {状态码或错误类型}：{错误信息}。调用成功时为空。</p>
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>接口调用总耗时，包含全部重试。异步上报时为 0。</p><p>单位：ms</p> 
     * @return CostMS <p>接口调用总耗时，包含全部重试。异步上报时为 0。</p><p>单位：ms</p>
     */
    public Long getCostMS() {
        return this.CostMS;
    }

    /**
     * Set <p>接口调用总耗时，包含全部重试。异步上报时为 0。</p><p>单位：ms</p>
     * @param CostMS <p>接口调用总耗时，包含全部重试。异步上报时为 0。</p><p>单位：ms</p>
     */
    public void setCostMS(Long CostMS) {
        this.CostMS = CostMS;
    }

    /**
     * Get <p>重试次数。0 表示首次调用即结束，未发生重试。</p> 
     * @return RetryCount <p>重试次数。0 表示首次调用即结束，未发生重试。</p>
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set <p>重试次数。0 表示首次调用即结束，未发生重试。</p>
     * @param RetryCount <p>重试次数。0 表示首次调用即结束，未发生重试。</p>
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get <p>每次尝试的明细，按时间顺序排列，至少包含首次调用。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Attempts <p>每次尝试的明细，按时间顺序排列，至少包含首次调用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AICallAPICallAttempt [] getAttempts() {
        return this.Attempts;
    }

    /**
     * Set <p>每次尝试的明细，按时间顺序排列，至少包含首次调用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Attempts <p>每次尝试的明细，按时间顺序排列，至少包含首次调用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttempts(AICallAPICallAttempt [] Attempts) {
        this.Attempts = Attempts;
    }

    public AICallAPICallDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallAPICallDetail(AICallAPICallDetail source) {
        if (source.Async != null) {
            this.Async = new Boolean(source.Async);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.CostMS != null) {
            this.CostMS = new Long(source.CostMS);
        }
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.Attempts != null) {
            this.Attempts = new AICallAPICallAttempt[source.Attempts.length];
            for (int i = 0; i < source.Attempts.length; i++) {
                this.Attempts[i] = new AICallAPICallAttempt(source.Attempts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Async", this.Async);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "CostMS", this.CostMS);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamArrayObj(map, prefix + "Attempts.", this.Attempts);

    }
}

