/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenStat extends AbstractModel {

    /**
    * 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 请求 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 对应哪条会话, 会话 ID, 用于回答的消息存储使用, 可提前生成, 保存消息时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * token 已使用数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedCount")
    @Expose
    private Long UsedCount;

    /**
    * 免费 token 数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreeCount")
    @Expose
    private Long FreeCount;

    /**
    * 订单总 token 数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderCount")
    @Expose
    private Long OrderCount;

    /**
    * 当前执行状态汇总, 常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusSummary")
    @Expose
    private String StatusSummary;

    /**
    * 当前执行状态汇总后中文展示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusSummaryTitle")
    @Expose
    private String StatusSummaryTitle;

    /**
    * 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Elapsed")
    @Expose
    private Long Elapsed;

    /**
    * 当前请求消耗 token 数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenCount")
    @Expose
    private Long TokenCount;

    /**
    * 执行过程信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Procedures")
    @Expose
    private Procedure [] Procedures;

    /**
    * 执行过程信息TraceId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
     * Get 会话 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 请求 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestId 请求 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 请求 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestId 请求 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 对应哪条会话, 会话 ID, 用于回答的消息存储使用, 可提前生成, 保存消息时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId 对应哪条会话, 会话 ID, 用于回答的消息存储使用, 可提前生成, 保存消息时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 对应哪条会话, 会话 ID, 用于回答的消息存储使用, 可提前生成, 保存消息时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId 对应哪条会话, 会话 ID, 用于回答的消息存储使用, 可提前生成, 保存消息时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get token 已使用数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedCount token 已使用数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUsedCount() {
        return this.UsedCount;
    }

    /**
     * Set token 已使用数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedCount token 已使用数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedCount(Long UsedCount) {
        this.UsedCount = UsedCount;
    }

    /**
     * Get 免费 token 数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreeCount 免费 token 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFreeCount() {
        return this.FreeCount;
    }

    /**
     * Set 免费 token 数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreeCount 免费 token 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreeCount(Long FreeCount) {
        this.FreeCount = FreeCount;
    }

    /**
     * Get 订单总 token 数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderCount 订单总 token 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrderCount() {
        return this.OrderCount;
    }

    /**
     * Set 订单总 token 数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderCount 订单总 token 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderCount(Long OrderCount) {
        this.OrderCount = OrderCount;
    }

    /**
     * Get 当前执行状态汇总, 常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusSummary 当前执行状态汇总, 常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusSummary() {
        return this.StatusSummary;
    }

    /**
     * Set 当前执行状态汇总, 常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusSummary 当前执行状态汇总, 常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusSummary(String StatusSummary) {
        this.StatusSummary = StatusSummary;
    }

    /**
     * Get 当前执行状态汇总后中文展示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusSummaryTitle 当前执行状态汇总后中文展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusSummaryTitle() {
        return this.StatusSummaryTitle;
    }

    /**
     * Set 当前执行状态汇总后中文展示
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusSummaryTitle 当前执行状态汇总后中文展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusSummaryTitle(String StatusSummaryTitle) {
        this.StatusSummaryTitle = StatusSummaryTitle;
    }

    /**
     * Get 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Elapsed 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElapsed() {
        return this.Elapsed;
    }

    /**
     * Set 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param Elapsed 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElapsed(Long Elapsed) {
        this.Elapsed = Elapsed;
    }

    /**
     * Get 当前请求消耗 token 数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenCount 当前请求消耗 token 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTokenCount() {
        return this.TokenCount;
    }

    /**
     * Set 当前请求消耗 token 数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenCount 当前请求消耗 token 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenCount(Long TokenCount) {
        this.TokenCount = TokenCount;
    }

    /**
     * Get 执行过程信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Procedures 执行过程信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Procedure [] getProcedures() {
        return this.Procedures;
    }

    /**
     * Set 执行过程信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Procedures 执行过程信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedures(Procedure [] Procedures) {
        this.Procedures = Procedures;
    }

    /**
     * Get 执行过程信息TraceId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TraceId 执行过程信息TraceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set 执行过程信息TraceId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TraceId 执行过程信息TraceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    public TokenStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenStat(TokenStat source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.UsedCount != null) {
            this.UsedCount = new Long(source.UsedCount);
        }
        if (source.FreeCount != null) {
            this.FreeCount = new Long(source.FreeCount);
        }
        if (source.OrderCount != null) {
            this.OrderCount = new Long(source.OrderCount);
        }
        if (source.StatusSummary != null) {
            this.StatusSummary = new String(source.StatusSummary);
        }
        if (source.StatusSummaryTitle != null) {
            this.StatusSummaryTitle = new String(source.StatusSummaryTitle);
        }
        if (source.Elapsed != null) {
            this.Elapsed = new Long(source.Elapsed);
        }
        if (source.TokenCount != null) {
            this.TokenCount = new Long(source.TokenCount);
        }
        if (source.Procedures != null) {
            this.Procedures = new Procedure[source.Procedures.length];
            for (int i = 0; i < source.Procedures.length; i++) {
                this.Procedures[i] = new Procedure(source.Procedures[i]);
            }
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "UsedCount", this.UsedCount);
        this.setParamSimple(map, prefix + "FreeCount", this.FreeCount);
        this.setParamSimple(map, prefix + "OrderCount", this.OrderCount);
        this.setParamSimple(map, prefix + "StatusSummary", this.StatusSummary);
        this.setParamSimple(map, prefix + "StatusSummaryTitle", this.StatusSummaryTitle);
        this.setParamSimple(map, prefix + "Elapsed", this.Elapsed);
        this.setParamSimple(map, prefix + "TokenCount", this.TokenCount);
        this.setParamArrayObj(map, prefix + "Procedures.", this.Procedures);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);

    }
}

