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
package com.tencentcloudapi.dtf.v20200506.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Transaction extends AbstractModel{

    /**
    * 主事务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionId")
    @Expose
    private Long TransactionId;

    /**
    * 主事务开始时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionBegin")
    @Expose
    private Long TransactionBegin;

    /**
    * 主事务结束时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionEnd")
    @Expose
    private Long TransactionEnd;

    /**
    * 主事务提交时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionCommit")
    @Expose
    private Long TransactionCommit;

    /**
    * 主事务回滚时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionRollback")
    @Expose
    private Long TransactionRollback;

    /**
    * 主事务异常停止时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionError")
    @Expose
    private Long TransactionError;

    /**
    * 主事务超时时长，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 主事务状态：0:Trying, 1:Confirming, 2: Confirmed, 3:Canceling, 4: Canceled
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 主事务结束标识：0:运行中, 1: 已结束
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndFlag")
    @Expose
    private Long EndFlag;

    /**
    * 主事务超时标识：0:运行中, 1: 已超时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeoutFlag")
    @Expose
    private Long TimeoutFlag;

    /**
    * 异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 事务分组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 主事务来源服务标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 分支事务数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BranchQuantity")
    @Expose
    private Long BranchQuantity;

    /**
    * 重试标识：true：可以重试；false：不可重试
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryFlag")
    @Expose
    private Boolean RetryFlag;

    /**
     * Get 主事务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionId 主事务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set 主事务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionId 主事务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionId(Long TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get 主事务开始时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionBegin 主事务开始时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTransactionBegin() {
        return this.TransactionBegin;
    }

    /**
     * Set 主事务开始时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionBegin 主事务开始时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionBegin(Long TransactionBegin) {
        this.TransactionBegin = TransactionBegin;
    }

    /**
     * Get 主事务结束时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionEnd 主事务结束时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTransactionEnd() {
        return this.TransactionEnd;
    }

    /**
     * Set 主事务结束时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionEnd 主事务结束时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionEnd(Long TransactionEnd) {
        this.TransactionEnd = TransactionEnd;
    }

    /**
     * Get 主事务提交时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionCommit 主事务提交时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTransactionCommit() {
        return this.TransactionCommit;
    }

    /**
     * Set 主事务提交时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionCommit 主事务提交时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionCommit(Long TransactionCommit) {
        this.TransactionCommit = TransactionCommit;
    }

    /**
     * Get 主事务回滚时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionRollback 主事务回滚时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTransactionRollback() {
        return this.TransactionRollback;
    }

    /**
     * Set 主事务回滚时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionRollback 主事务回滚时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionRollback(Long TransactionRollback) {
        this.TransactionRollback = TransactionRollback;
    }

    /**
     * Get 主事务异常停止时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionError 主事务异常停止时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTransactionError() {
        return this.TransactionError;
    }

    /**
     * Set 主事务异常停止时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionError 主事务异常停止时间戳，UTC，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionError(Long TransactionError) {
        this.TransactionError = TransactionError;
    }

    /**
     * Get 主事务超时时长，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timeout 主事务超时时长，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 主事务超时时长，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timeout 主事务超时时长，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 主事务状态：0:Trying, 1:Confirming, 2: Confirmed, 3:Canceling, 4: Canceled
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 主事务状态：0:Trying, 1:Confirming, 2: Confirmed, 3:Canceling, 4: Canceled
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 主事务状态：0:Trying, 1:Confirming, 2: Confirmed, 3:Canceling, 4: Canceled
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 主事务状态：0:Trying, 1:Confirming, 2: Confirmed, 3:Canceling, 4: Canceled
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 主事务结束标识：0:运行中, 1: 已结束
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndFlag 主事务结束标识：0:运行中, 1: 已结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndFlag() {
        return this.EndFlag;
    }

    /**
     * Set 主事务结束标识：0:运行中, 1: 已结束
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndFlag 主事务结束标识：0:运行中, 1: 已结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndFlag(Long EndFlag) {
        this.EndFlag = EndFlag;
    }

    /**
     * Get 主事务超时标识：0:运行中, 1: 已超时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeoutFlag 主事务超时标识：0:运行中, 1: 已超时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeoutFlag() {
        return this.TimeoutFlag;
    }

    /**
     * Set 主事务超时标识：0:运行中, 1: 已超时
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeoutFlag 主事务超时标识：0:运行中, 1: 已超时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeoutFlag(Long TimeoutFlag) {
        this.TimeoutFlag = TimeoutFlag;
    }

    /**
     * Get 异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 事务分组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 事务分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 事务分组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 事务分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 主事务来源服务标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Server 主事务来源服务标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 主事务来源服务标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Server 主事务来源服务标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get 分支事务数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BranchQuantity 分支事务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBranchQuantity() {
        return this.BranchQuantity;
    }

    /**
     * Set 分支事务数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param BranchQuantity 分支事务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBranchQuantity(Long BranchQuantity) {
        this.BranchQuantity = BranchQuantity;
    }

    /**
     * Get 重试标识：true：可以重试；false：不可重试
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryFlag 重试标识：true：可以重试；false：不可重试
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRetryFlag() {
        return this.RetryFlag;
    }

    /**
     * Set 重试标识：true：可以重试；false：不可重试
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryFlag 重试标识：true：可以重试；false：不可重试
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryFlag(Boolean RetryFlag) {
        this.RetryFlag = RetryFlag;
    }

    public Transaction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Transaction(Transaction source) {
        if (source.TransactionId != null) {
            this.TransactionId = new Long(source.TransactionId);
        }
        if (source.TransactionBegin != null) {
            this.TransactionBegin = new Long(source.TransactionBegin);
        }
        if (source.TransactionEnd != null) {
            this.TransactionEnd = new Long(source.TransactionEnd);
        }
        if (source.TransactionCommit != null) {
            this.TransactionCommit = new Long(source.TransactionCommit);
        }
        if (source.TransactionRollback != null) {
            this.TransactionRollback = new Long(source.TransactionRollback);
        }
        if (source.TransactionError != null) {
            this.TransactionError = new Long(source.TransactionError);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EndFlag != null) {
            this.EndFlag = new Long(source.EndFlag);
        }
        if (source.TimeoutFlag != null) {
            this.TimeoutFlag = new Long(source.TimeoutFlag);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.BranchQuantity != null) {
            this.BranchQuantity = new Long(source.BranchQuantity);
        }
        if (source.RetryFlag != null) {
            this.RetryFlag = new Boolean(source.RetryFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "TransactionBegin", this.TransactionBegin);
        this.setParamSimple(map, prefix + "TransactionEnd", this.TransactionEnd);
        this.setParamSimple(map, prefix + "TransactionCommit", this.TransactionCommit);
        this.setParamSimple(map, prefix + "TransactionRollback", this.TransactionRollback);
        this.setParamSimple(map, prefix + "TransactionError", this.TransactionError);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EndFlag", this.EndFlag);
        this.setParamSimple(map, prefix + "TimeoutFlag", this.TimeoutFlag);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "BranchQuantity", this.BranchQuantity);
        this.setParamSimple(map, prefix + "RetryFlag", this.RetryFlag);

    }
}

