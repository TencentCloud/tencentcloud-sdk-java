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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopCompareRequest extends AbstractModel {

    /**
    * 迁移任务 Id，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * 是否强制停止。默认值为false，表示不强制停止；如果填true，同步任务增量阶段会跳过一致性校验产生的binlog，达到快速恢复任务的效果
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
     * Get 迁移任务 Id，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。
 
     * @return JobId 迁移任务 Id，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 迁移任务 Id，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     * @param JobId 迁移任务 Id，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。
 
     * @return CompareTaskId 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     * @param CompareTaskId 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get 是否强制停止。默认值为false，表示不强制停止；如果填true，同步任务增量阶段会跳过一致性校验产生的binlog，达到快速恢复任务的效果 
     * @return ForceStop 是否强制停止。默认值为false，表示不强制停止；如果填true，同步任务增量阶段会跳过一致性校验产生的binlog，达到快速恢复任务的效果
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set 是否强制停止。默认值为false，表示不强制停止；如果填true，同步任务增量阶段会跳过一致性校验产生的binlog，达到快速恢复任务的效果
     * @param ForceStop 是否强制停止。默认值为false，表示不强制停止；如果填true，同步任务增量阶段会跳过一致性校验产生的binlog，达到快速恢复任务的效果
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    public StopCompareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopCompareRequest(StopCompareRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.ForceStop != null) {
            this.ForceStop = new Boolean(source.ForceStop);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);

    }
}

