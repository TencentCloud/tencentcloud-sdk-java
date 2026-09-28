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

public class WaiterItem extends AbstractModel {

    /**
    * <p>该边持有或申请的锁模式。</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>并行执行子线程 ID。0 表示主线程；大于 0 表示并行计划的 worker。SessionId + ExecutionContextId 组合可唯一区分并行执行下的 worker。</p>
    */
    @SerializedName("ExecutionContextId")
    @Expose
    private Long ExecutionContextId;

    /**
    * <p>进程内部指针，对应 Transactions[].Processes[].ProcessId。</p>
    */
    @SerializedName("ProcessId")
    @Expose
    private String ProcessId;

    /**
    * <p>该边对应进程的 SPID，便于前端直接展示无需回查。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private Long SessionId;

    /**
    * <p>仅 Waiters 边有值。常见值：wait（普通等待）/ convert（锁转换，如从 S 升级到 X）。owner 边无此字段。</p>
    */
    @SerializedName("RequestType")
    @Expose
    private String RequestType;

    /**
     * Get <p>该边持有或申请的锁模式。</p> 
     * @return Mode <p>该边持有或申请的锁模式。</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>该边持有或申请的锁模式。</p>
     * @param Mode <p>该边持有或申请的锁模式。</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>并行执行子线程 ID。0 表示主线程；大于 0 表示并行计划的 worker。SessionId + ExecutionContextId 组合可唯一区分并行执行下的 worker。</p> 
     * @return ExecutionContextId <p>并行执行子线程 ID。0 表示主线程；大于 0 表示并行计划的 worker。SessionId + ExecutionContextId 组合可唯一区分并行执行下的 worker。</p>
     */
    public Long getExecutionContextId() {
        return this.ExecutionContextId;
    }

    /**
     * Set <p>并行执行子线程 ID。0 表示主线程；大于 0 表示并行计划的 worker。SessionId + ExecutionContextId 组合可唯一区分并行执行下的 worker。</p>
     * @param ExecutionContextId <p>并行执行子线程 ID。0 表示主线程；大于 0 表示并行计划的 worker。SessionId + ExecutionContextId 组合可唯一区分并行执行下的 worker。</p>
     */
    public void setExecutionContextId(Long ExecutionContextId) {
        this.ExecutionContextId = ExecutionContextId;
    }

    /**
     * Get <p>进程内部指针，对应 Transactions[].Processes[].ProcessId。</p> 
     * @return ProcessId <p>进程内部指针，对应 Transactions[].Processes[].ProcessId。</p>
     */
    public String getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set <p>进程内部指针，对应 Transactions[].Processes[].ProcessId。</p>
     * @param ProcessId <p>进程内部指针，对应 Transactions[].Processes[].ProcessId。</p>
     */
    public void setProcessId(String ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get <p>该边对应进程的 SPID，便于前端直接展示无需回查。</p> 
     * @return SessionId <p>该边对应进程的 SPID，便于前端直接展示无需回查。</p>
     */
    public Long getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>该边对应进程的 SPID，便于前端直接展示无需回查。</p>
     * @param SessionId <p>该边对应进程的 SPID，便于前端直接展示无需回查。</p>
     */
    public void setSessionId(Long SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>仅 Waiters 边有值。常见值：wait（普通等待）/ convert（锁转换，如从 S 升级到 X）。owner 边无此字段。</p> 
     * @return RequestType <p>仅 Waiters 边有值。常见值：wait（普通等待）/ convert（锁转换，如从 S 升级到 X）。owner 边无此字段。</p>
     */
    public String getRequestType() {
        return this.RequestType;
    }

    /**
     * Set <p>仅 Waiters 边有值。常见值：wait（普通等待）/ convert（锁转换，如从 S 升级到 X）。owner 边无此字段。</p>
     * @param RequestType <p>仅 Waiters 边有值。常见值：wait（普通等待）/ convert（锁转换，如从 S 升级到 X）。owner 边无此字段。</p>
     */
    public void setRequestType(String RequestType) {
        this.RequestType = RequestType;
    }

    public WaiterItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaiterItem(WaiterItem source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.ExecutionContextId != null) {
            this.ExecutionContextId = new Long(source.ExecutionContextId);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new String(source.ProcessId);
        }
        if (source.SessionId != null) {
            this.SessionId = new Long(source.SessionId);
        }
        if (source.RequestType != null) {
            this.RequestType = new String(source.RequestType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "ExecutionContextId", this.ExecutionContextId);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RequestType", this.RequestType);

    }
}

