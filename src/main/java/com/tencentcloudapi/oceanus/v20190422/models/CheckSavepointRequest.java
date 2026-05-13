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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckSavepointRequest extends AbstractModel {

    /**
    * <p>作业 id</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>快照资源 id</p>
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
    * <p>快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint</p>
    */
    @SerializedName("RecordType")
    @Expose
    private Long RecordType;

    /**
    * <p>快照路径，目前只支持 cos 路径</p>
    */
    @SerializedName("SavepointPath")
    @Expose
    private String SavepointPath;

    /**
    * <p>工作空间 id</p>
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get <p>作业 id</p> 
     * @return JobId <p>作业 id</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业 id</p>
     * @param JobId <p>作业 id</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>快照资源 id</p> 
     * @return SerialId <p>快照资源 id</p>
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set <p>快照资源 id</p>
     * @param SerialId <p>快照资源 id</p>
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Get <p>快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint</p> 
     * @return RecordType <p>快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint</p>
     */
    public Long getRecordType() {
        return this.RecordType;
    }

    /**
     * Set <p>快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint</p>
     * @param RecordType <p>快照类型 1: savepoint；2: checkpoint；3: cancelWithSavepoint</p>
     */
    public void setRecordType(Long RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get <p>快照路径，目前只支持 cos 路径</p> 
     * @return SavepointPath <p>快照路径，目前只支持 cos 路径</p>
     */
    public String getSavepointPath() {
        return this.SavepointPath;
    }

    /**
     * Set <p>快照路径，目前只支持 cos 路径</p>
     * @param SavepointPath <p>快照路径，目前只支持 cos 路径</p>
     */
    public void setSavepointPath(String SavepointPath) {
        this.SavepointPath = SavepointPath;
    }

    /**
     * Get <p>工作空间 id</p> 
     * @return WorkSpaceId <p>工作空间 id</p>
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set <p>工作空间 id</p>
     * @param WorkSpaceId <p>工作空间 id</p>
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

