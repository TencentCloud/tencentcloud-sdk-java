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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetUpgradeGroupFaceModelVersionJobListResponse extends AbstractModel{

    /**
    * 人员库升级任务信息列表。
    */
    @SerializedName("JobInfos")
    @Expose
    private UpgradeJobInfo [] JobInfos;

    /**
    * 升级任务总数量。
    */
    @SerializedName("JobNum")
    @Expose
    private Long JobNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人员库升级任务信息列表。 
     * @return JobInfos 人员库升级任务信息列表。
     */
    public UpgradeJobInfo [] getJobInfos() {
        return this.JobInfos;
    }

    /**
     * Set 人员库升级任务信息列表。
     * @param JobInfos 人员库升级任务信息列表。
     */
    public void setJobInfos(UpgradeJobInfo [] JobInfos) {
        this.JobInfos = JobInfos;
    }

    /**
     * Get 升级任务总数量。 
     * @return JobNum 升级任务总数量。
     */
    public Long getJobNum() {
        return this.JobNum;
    }

    /**
     * Set 升级任务总数量。
     * @param JobNum 升级任务总数量。
     */
    public void setJobNum(Long JobNum) {
        this.JobNum = JobNum;
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

    public GetUpgradeGroupFaceModelVersionJobListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUpgradeGroupFaceModelVersionJobListResponse(GetUpgradeGroupFaceModelVersionJobListResponse source) {
        if (source.JobInfos != null) {
            this.JobInfos = new UpgradeJobInfo[source.JobInfos.length];
            for (int i = 0; i < source.JobInfos.length; i++) {
                this.JobInfos[i] = new UpgradeJobInfo(source.JobInfos[i]);
            }
        }
        if (source.JobNum != null) {
            this.JobNum = new Long(source.JobNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "JobInfos.", this.JobInfos);
        this.setParamSimple(map, prefix + "JobNum", this.JobNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

