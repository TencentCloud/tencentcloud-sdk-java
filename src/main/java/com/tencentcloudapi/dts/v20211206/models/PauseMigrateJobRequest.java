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

public class PauseMigrateJobRequest extends AbstractModel {

    /**
    * 数据迁移任务ID，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
     * Get 数据迁移任务ID，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。
 
     * @return JobId 数据迁移任务ID，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 数据迁移任务ID，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     * @param JobId 数据迁移任务ID，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    public PauseMigrateJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PauseMigrateJobRequest(PauseMigrateJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);

    }
}

