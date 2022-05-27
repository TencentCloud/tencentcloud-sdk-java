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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkAppJobResponse extends AbstractModel{

    /**
    * spark作业详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Job")
    @Expose
    private SparkJobInfo Job;

    /**
    * 查询的spark作业是否存在
    */
    @SerializedName("IsExists")
    @Expose
    private Boolean IsExists;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get spark作业详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Job spark作业详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SparkJobInfo getJob() {
        return this.Job;
    }

    /**
     * Set spark作业详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Job spark作业详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJob(SparkJobInfo Job) {
        this.Job = Job;
    }

    /**
     * Get 查询的spark作业是否存在 
     * @return IsExists 查询的spark作业是否存在
     */
    public Boolean getIsExists() {
        return this.IsExists;
    }

    /**
     * Set 查询的spark作业是否存在
     * @param IsExists 查询的spark作业是否存在
     */
    public void setIsExists(Boolean IsExists) {
        this.IsExists = IsExists;
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

    public DescribeSparkAppJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkAppJobResponse(DescribeSparkAppJobResponse source) {
        if (source.Job != null) {
            this.Job = new SparkJobInfo(source.Job);
        }
        if (source.IsExists != null) {
            this.IsExists = new Boolean(source.IsExists);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Job.", this.Job);
        this.setParamSimple(map, prefix + "IsExists", this.IsExists);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

