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

public class OwnerItem extends AbstractModel {

    /**
    * <p>锁模式。常见值：X（排他）/ U（更新）/ S（共享）/ IX / IU / RangeS-U / RangeX-X 等。</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>该边对应进程的并行执行子线程 ID。</p>
    */
    @SerializedName("ExecutionContextId")
    @Expose
    private Long ExecutionContextId;

    /**
    * <p>SQL Server 引擎内的进程指针，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 拼接死锁环。partial 事件为 null。</p>
    */
    @SerializedName("ProcessId")
    @Expose
    private String ProcessId;

    /**
    * <p>SQL Server 会话 ID。日志排查主键。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private Long SessionId;

    /**
     * Get <p>锁模式。常见值：X（排他）/ U（更新）/ S（共享）/ IX / IU / RangeS-U / RangeX-X 等。</p> 
     * @return Mode <p>锁模式。常见值：X（排他）/ U（更新）/ S（共享）/ IX / IU / RangeS-U / RangeX-X 等。</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>锁模式。常见值：X（排他）/ U（更新）/ S（共享）/ IX / IU / RangeS-U / RangeX-X 等。</p>
     * @param Mode <p>锁模式。常见值：X（排他）/ U（更新）/ S（共享）/ IX / IU / RangeS-U / RangeX-X 等。</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>该边对应进程的并行执行子线程 ID。</p> 
     * @return ExecutionContextId <p>该边对应进程的并行执行子线程 ID。</p>
     */
    public Long getExecutionContextId() {
        return this.ExecutionContextId;
    }

    /**
     * Set <p>该边对应进程的并行执行子线程 ID。</p>
     * @param ExecutionContextId <p>该边对应进程的并行执行子线程 ID。</p>
     */
    public void setExecutionContextId(Long ExecutionContextId) {
        this.ExecutionContextId = ExecutionContextId;
    }

    /**
     * Get <p>SQL Server 引擎内的进程指针，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 拼接死锁环。partial 事件为 null。</p> 
     * @return ProcessId <p>SQL Server 引擎内的进程指针，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 拼接死锁环。partial 事件为 null。</p>
     */
    public String getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set <p>SQL Server 引擎内的进程指针，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 拼接死锁环。partial 事件为 null。</p>
     * @param ProcessId <p>SQL Server 引擎内的进程指针，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 拼接死锁环。partial 事件为 null。</p>
     */
    public void setProcessId(String ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get <p>SQL Server 会话 ID。日志排查主键。</p> 
     * @return SessionId <p>SQL Server 会话 ID。日志排查主键。</p>
     */
    public Long getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>SQL Server 会话 ID。日志排查主键。</p>
     * @param SessionId <p>SQL Server 会话 ID。日志排查主键。</p>
     */
    public void setSessionId(Long SessionId) {
        this.SessionId = SessionId;
    }

    public OwnerItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwnerItem(OwnerItem source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "ExecutionContextId", this.ExecutionContextId);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

