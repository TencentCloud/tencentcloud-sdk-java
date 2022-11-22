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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotRollbackTaskResponse extends AbstractModel{

    /**
    * 快照所属域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 快照 ID
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 回滚状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 快照回滚任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 总数量
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * 开始回滚时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 快照所属域名 
     * @return Domain 快照所属域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 快照所属域名
     * @param Domain 快照所属域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 快照 ID 
     * @return SnapshotId 快照 ID
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照 ID
     * @param SnapshotId 快照 ID
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 回滚状态 
     * @return Status 回滚状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 回滚状态
     * @param Status 回滚状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 快照回滚任务 ID 
     * @return TaskId 快照回滚任务 ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 快照回滚任务 ID
     * @param TaskId 快照回滚任务 ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 总数量 
     * @return RecordCount 总数量
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set 总数量
     * @param RecordCount 总数量
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get 开始回滚时间 
     * @return CreatedOn 开始回滚时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 开始回滚时间
     * @param CreatedOn 开始回滚时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
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

    public DescribeSnapshotRollbackTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotRollbackTaskResponse(DescribeSnapshotRollbackTaskResponse source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

