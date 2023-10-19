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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPACOSDiscoveryTaskFilesRequest extends AbstractModel {

    /**
    * DSPA实例Id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 扫描任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 扫描Bucket任务结果ID
    */
    @SerializedName("BucketResultId")
    @Expose
    private Long BucketResultId;

    /**
     * Get DSPA实例Id 
     * @return DspaId DSPA实例Id
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例Id
     * @param DspaId DSPA实例Id
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 扫描任务ID 
     * @return TaskId 扫描任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 扫描任务ID
     * @param TaskId 扫描任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 扫描Bucket任务结果ID 
     * @return BucketResultId 扫描Bucket任务结果ID
     */
    public Long getBucketResultId() {
        return this.BucketResultId;
    }

    /**
     * Set 扫描Bucket任务结果ID
     * @param BucketResultId 扫描Bucket任务结果ID
     */
    public void setBucketResultId(Long BucketResultId) {
        this.BucketResultId = BucketResultId;
    }

    public DescribeDSPACOSDiscoveryTaskFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPACOSDiscoveryTaskFilesRequest(DescribeDSPACOSDiscoveryTaskFilesRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.BucketResultId != null) {
            this.BucketResultId = new Long(source.BucketResultId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "BucketResultId", this.BucketResultId);

    }
}

