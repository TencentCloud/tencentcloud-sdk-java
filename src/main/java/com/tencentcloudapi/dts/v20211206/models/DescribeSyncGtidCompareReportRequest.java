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

public class DescribeSyncGtidCompareReportRequest extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 创建的校验任务id
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * 是否需要展示不一致详情
    */
    @SerializedName("NeedDiffDetail")
    @Expose
    private Boolean NeedDiffDetail;

    /**
     * Get 任务id 
     * @return JobId 任务id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务id
     * @param JobId 任务id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 创建的校验任务id 
     * @return CompareTaskId 创建的校验任务id
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set 创建的校验任务id
     * @param CompareTaskId 创建的校验任务id
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get 是否需要展示不一致详情 
     * @return NeedDiffDetail 是否需要展示不一致详情
     */
    public Boolean getNeedDiffDetail() {
        return this.NeedDiffDetail;
    }

    /**
     * Set 是否需要展示不一致详情
     * @param NeedDiffDetail 是否需要展示不一致详情
     */
    public void setNeedDiffDetail(Boolean NeedDiffDetail) {
        this.NeedDiffDetail = NeedDiffDetail;
    }

    public DescribeSyncGtidCompareReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSyncGtidCompareReportRequest(DescribeSyncGtidCompareReportRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.NeedDiffDetail != null) {
            this.NeedDiffDetail = new Boolean(source.NeedDiffDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "NeedDiffDetail", this.NeedDiffDetail);

    }
}

