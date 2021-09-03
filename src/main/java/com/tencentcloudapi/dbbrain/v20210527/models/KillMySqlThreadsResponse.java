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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KillMySqlThreadsResponse extends AbstractModel{

    /**
    * kill完成的sql会话ID列表。
    */
    @SerializedName("Threads")
    @Expose
    private Long [] Threads;

    /**
    * 执行ID， Prepare阶段的任务输出，用于Commit阶段中指定执行kill操作的会话ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlExecId")
    @Expose
    private String SqlExecId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get kill完成的sql会话ID列表。 
     * @return Threads kill完成的sql会话ID列表。
     */
    public Long [] getThreads() {
        return this.Threads;
    }

    /**
     * Set kill完成的sql会话ID列表。
     * @param Threads kill完成的sql会话ID列表。
     */
    public void setThreads(Long [] Threads) {
        this.Threads = Threads;
    }

    /**
     * Get 执行ID， Prepare阶段的任务输出，用于Commit阶段中指定执行kill操作的会话ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlExecId 执行ID， Prepare阶段的任务输出，用于Commit阶段中指定执行kill操作的会话ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlExecId() {
        return this.SqlExecId;
    }

    /**
     * Set 执行ID， Prepare阶段的任务输出，用于Commit阶段中指定执行kill操作的会话ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlExecId 执行ID， Prepare阶段的任务输出，用于Commit阶段中指定执行kill操作的会话ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlExecId(String SqlExecId) {
        this.SqlExecId = SqlExecId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public KillMySqlThreadsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillMySqlThreadsResponse(KillMySqlThreadsResponse source) {
        if (source.Threads != null) {
            this.Threads = new Long[source.Threads.length];
            for (int i = 0; i < source.Threads.length; i++) {
                this.Threads[i] = new Long(source.Threads[i]);
            }
        }
        if (source.SqlExecId != null) {
            this.SqlExecId = new String(source.SqlExecId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Threads.", this.Threads);
        this.setParamSimple(map, prefix + "SqlExecId", this.SqlExecId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

