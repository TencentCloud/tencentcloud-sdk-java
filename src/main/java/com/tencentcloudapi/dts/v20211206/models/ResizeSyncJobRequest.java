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

public class ResizeSyncJobRequest extends AbstractModel {

    /**
    * 同步任务id，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。

    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 任务规格，可选值包括micro,small,medium,large
    */
    @SerializedName("NewInstanceClass")
    @Expose
    private String NewInstanceClass;

    /**
     * Get 同步任务id，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。
 
     * @return JobId 同步任务id，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。

     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 同步任务id，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。

     * @param JobId 同步任务id，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。

     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 任务规格，可选值包括micro,small,medium,large 
     * @return NewInstanceClass 任务规格，可选值包括micro,small,medium,large
     */
    public String getNewInstanceClass() {
        return this.NewInstanceClass;
    }

    /**
     * Set 任务规格，可选值包括micro,small,medium,large
     * @param NewInstanceClass 任务规格，可选值包括micro,small,medium,large
     */
    public void setNewInstanceClass(String NewInstanceClass) {
        this.NewInstanceClass = NewInstanceClass;
    }

    public ResizeSyncJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResizeSyncJobRequest(ResizeSyncJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.NewInstanceClass != null) {
            this.NewInstanceClass = new String(source.NewInstanceClass);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "NewInstanceClass", this.NewInstanceClass);

    }
}

