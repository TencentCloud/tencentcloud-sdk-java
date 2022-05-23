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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckSavepointRequest extends AbstractModel{

    /**
    * 作业 id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 快照资源 id
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
    * 快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint
    */
    @SerializedName("RecordType")
    @Expose
    private Long RecordType;

    /**
    * 快照路径，目前只支持 cos 路径
    */
    @SerializedName("SavepointPath")
    @Expose
    private String SavepointPath;

    /**
    * 工作空间 id
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 作业 id 
     * @return JobId 作业 id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业 id
     * @param JobId 作业 id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 快照资源 id 
     * @return SerialId 快照资源 id
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set 快照资源 id
     * @param SerialId 快照资源 id
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Get 快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint 
     * @return RecordType 快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint
     */
    public Long getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint
     * @param RecordType 快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint
     */
    public void setRecordType(Long RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 快照路径，目前只支持 cos 路径 
     * @return SavepointPath 快照路径，目前只支持 cos 路径
     */
    public String getSavepointPath() {
        return this.SavepointPath;
    }

    /**
     * Set 快照路径，目前只支持 cos 路径
     * @param SavepointPath 快照路径，目前只支持 cos 路径
     */
    public void setSavepointPath(String SavepointPath) {
        this.SavepointPath = SavepointPath;
    }

    /**
     * Get 工作空间 id 
     * @return WorkSpaceId 工作空间 id
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 id
     * @param WorkSpaceId 工作空间 id
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public CheckSavepointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckSavepointRequest(CheckSavepointRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.SerialId != null) {
            this.SerialId = new String(source.SerialId);
        }
        if (source.RecordType != null) {
            this.RecordType = new Long(source.RecordType);
        }
        if (source.SavepointPath != null) {
            this.SavepointPath = new String(source.SavepointPath);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "SerialId", this.SerialId);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "SavepointPath", this.SavepointPath);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

