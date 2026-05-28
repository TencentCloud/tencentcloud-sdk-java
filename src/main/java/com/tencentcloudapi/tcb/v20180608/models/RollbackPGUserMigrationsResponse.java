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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackPGUserMigrationsResponse extends AbstractModel {

    /**
    * <p>任务ID</p><p>可通过DescribeTaskResult 接口查询进度</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>已成功回滚并删除 history 的 migration</p>
    */
    @SerializedName("RolledBack")
    @Expose
    private MigrationSummary [] RolledBack;

    /**
    * <p>未提供 Rollback SQL、视为成功并删除 history 的 migration</p>
    */
    @SerializedName("SkippedRollbackSql")
    @Expose
    private MigrationSummary [] SkippedRollbackSql;

    /**
    * <p>执行 Rollback SQL 失败的 migration，可为空</p>
    */
    @SerializedName("Failed")
    @Expose
    private MigrationSummary Failed;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务ID</p><p>可通过DescribeTaskResult 接口查询进度</p> 
     * @return TaskId <p>任务ID</p><p>可通过DescribeTaskResult 接口查询进度</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p><p>可通过DescribeTaskResult 接口查询进度</p>
     * @param TaskId <p>任务ID</p><p>可通过DescribeTaskResult 接口查询进度</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>已成功回滚并删除 history 的 migration</p> 
     * @return RolledBack <p>已成功回滚并删除 history 的 migration</p>
     */
    public MigrationSummary [] getRolledBack() {
        return this.RolledBack;
    }

    /**
     * Set <p>已成功回滚并删除 history 的 migration</p>
     * @param RolledBack <p>已成功回滚并删除 history 的 migration</p>
     */
    public void setRolledBack(MigrationSummary [] RolledBack) {
        this.RolledBack = RolledBack;
    }

    /**
     * Get <p>未提供 Rollback SQL、视为成功并删除 history 的 migration</p> 
     * @return SkippedRollbackSql <p>未提供 Rollback SQL、视为成功并删除 history 的 migration</p>
     */
    public MigrationSummary [] getSkippedRollbackSql() {
        return this.SkippedRollbackSql;
    }

    /**
     * Set <p>未提供 Rollback SQL、视为成功并删除 history 的 migration</p>
     * @param SkippedRollbackSql <p>未提供 Rollback SQL、视为成功并删除 history 的 migration</p>
     */
    public void setSkippedRollbackSql(MigrationSummary [] SkippedRollbackSql) {
        this.SkippedRollbackSql = SkippedRollbackSql;
    }

    /**
     * Get <p>执行 Rollback SQL 失败的 migration，可为空</p> 
     * @return Failed <p>执行 Rollback SQL 失败的 migration，可为空</p>
     */
    public MigrationSummary getFailed() {
        return this.Failed;
    }

    /**
     * Set <p>执行 Rollback SQL 失败的 migration，可为空</p>
     * @param Failed <p>执行 Rollback SQL 失败的 migration，可为空</p>
     */
    public void setFailed(MigrationSummary Failed) {
        this.Failed = Failed;
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

    public RollbackPGUserMigrationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackPGUserMigrationsResponse(RollbackPGUserMigrationsResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RolledBack != null) {
            this.RolledBack = new MigrationSummary[source.RolledBack.length];
            for (int i = 0; i < source.RolledBack.length; i++) {
                this.RolledBack[i] = new MigrationSummary(source.RolledBack[i]);
            }
        }
        if (source.SkippedRollbackSql != null) {
            this.SkippedRollbackSql = new MigrationSummary[source.SkippedRollbackSql.length];
            for (int i = 0; i < source.SkippedRollbackSql.length; i++) {
                this.SkippedRollbackSql[i] = new MigrationSummary(source.SkippedRollbackSql[i]);
            }
        }
        if (source.Failed != null) {
            this.Failed = new MigrationSummary(source.Failed);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "RolledBack.", this.RolledBack);
        this.setParamArrayObj(map, prefix + "SkippedRollbackSql.", this.SkippedRollbackSql);
        this.setParamObj(map, prefix + "Failed.", this.Failed);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

