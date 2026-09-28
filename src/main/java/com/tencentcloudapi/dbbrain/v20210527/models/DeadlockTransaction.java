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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeadlockTransaction extends AbstractModel {

    /**
    * <p>事务最终状态。Rollback（被回滚，对应 IsVictim=true）/ Normal（正常，对应 IsVictim=false）/ Unknown（无 victim 信息）。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>SQL Server 引擎内的事务 ID。同实例短期内唯一。与 Auxiliary 记录里的 transaction_id 对齐。</p>
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * <p>本事务是否为牺牲事务。true 表示 SQL Server 已回滚该事务；false 表示正常提交；null 表示 XML 缺 VictimProcessIds 无法判定。</p>
    */
    @SerializedName("IsVictim")
    @Expose
    private Boolean IsVictim;

    /**
    * <p>该事务下的进程/会话列表。并行计划下同一事务可能包含多个 worker（SessionId 相同 ExecutionContextId 不同）。</p>
    */
    @SerializedName("Sessions")
    @Expose
    private DeadlockSession [] Sessions;

    /**
     * Get <p>事务最终状态。Rollback（被回滚，对应 IsVictim=true）/ Normal（正常，对应 IsVictim=false）/ Unknown（无 victim 信息）。</p> 
     * @return Status <p>事务最终状态。Rollback（被回滚，对应 IsVictim=true）/ Normal（正常，对应 IsVictim=false）/ Unknown（无 victim 信息）。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>事务最终状态。Rollback（被回滚，对应 IsVictim=true）/ Normal（正常，对应 IsVictim=false）/ Unknown（无 victim 信息）。</p>
     * @param Status <p>事务最终状态。Rollback（被回滚，对应 IsVictim=true）/ Normal（正常，对应 IsVictim=false）/ Unknown（无 victim 信息）。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>SQL Server 引擎内的事务 ID。同实例短期内唯一。与 Auxiliary 记录里的 transaction_id 对齐。</p> 
     * @return TransactionId <p>SQL Server 引擎内的事务 ID。同实例短期内唯一。与 Auxiliary 记录里的 transaction_id 对齐。</p>
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set <p>SQL Server 引擎内的事务 ID。同实例短期内唯一。与 Auxiliary 记录里的 transaction_id 对齐。</p>
     * @param TransactionId <p>SQL Server 引擎内的事务 ID。同实例短期内唯一。与 Auxiliary 记录里的 transaction_id 对齐。</p>
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get <p>本事务是否为牺牲事务。true 表示 SQL Server 已回滚该事务；false 表示正常提交；null 表示 XML 缺 VictimProcessIds 无法判定。</p> 
     * @return IsVictim <p>本事务是否为牺牲事务。true 表示 SQL Server 已回滚该事务；false 表示正常提交；null 表示 XML 缺 VictimProcessIds 无法判定。</p>
     */
    public Boolean getIsVictim() {
        return this.IsVictim;
    }

    /**
     * Set <p>本事务是否为牺牲事务。true 表示 SQL Server 已回滚该事务；false 表示正常提交；null 表示 XML 缺 VictimProcessIds 无法判定。</p>
     * @param IsVictim <p>本事务是否为牺牲事务。true 表示 SQL Server 已回滚该事务；false 表示正常提交；null 表示 XML 缺 VictimProcessIds 无法判定。</p>
     */
    public void setIsVictim(Boolean IsVictim) {
        this.IsVictim = IsVictim;
    }

    /**
     * Get <p>该事务下的进程/会话列表。并行计划下同一事务可能包含多个 worker（SessionId 相同 ExecutionContextId 不同）。</p> 
     * @return Sessions <p>该事务下的进程/会话列表。并行计划下同一事务可能包含多个 worker（SessionId 相同 ExecutionContextId 不同）。</p>
     */
    public DeadlockSession [] getSessions() {
        return this.Sessions;
    }

    /**
     * Set <p>该事务下的进程/会话列表。并行计划下同一事务可能包含多个 worker（SessionId 相同 ExecutionContextId 不同）。</p>
     * @param Sessions <p>该事务下的进程/会话列表。并行计划下同一事务可能包含多个 worker（SessionId 相同 ExecutionContextId 不同）。</p>
     */
    public void setSessions(DeadlockSession [] Sessions) {
        this.Sessions = Sessions;
    }

    public DeadlockTransaction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeadlockTransaction(DeadlockTransaction source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.IsVictim != null) {
            this.IsVictim = new Boolean(source.IsVictim);
        }
        if (source.Sessions != null) {
            this.Sessions = new DeadlockSession[source.Sessions.length];
            for (int i = 0; i < source.Sessions.length; i++) {
                this.Sessions[i] = new DeadlockSession(source.Sessions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "IsVictim", this.IsVictim);
        this.setParamArrayObj(map, prefix + "Sessions.", this.Sessions);

    }
}

