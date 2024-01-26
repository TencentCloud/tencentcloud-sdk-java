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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExecutionLogRequest extends AbstractModel {

    /**
    * 任务实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 任务提交记录Id
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * 子任务记录id
    */
    @SerializedName("DetailId")
    @Expose
    private Long DetailId;

    /**
     * Get 任务实例Id 
     * @return InstanceId 任务实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 任务实例Id
     * @param InstanceId 任务实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 任务提交记录Id 
     * @return RecordId 任务提交记录Id
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 任务提交记录Id
     * @param RecordId 任务提交记录Id
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 子任务记录id 
     * @return DetailId 子任务记录id
     */
    public Long getDetailId() {
        return this.DetailId;
    }

    /**
     * Set 子任务记录id
     * @param DetailId 子任务记录id
     */
    public void setDetailId(Long DetailId) {
        this.DetailId = DetailId;
    }

    public DescribeExecutionLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExecutionLogRequest(DescribeExecutionLogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.DetailId != null) {
            this.DetailId = new Long(source.DetailId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "DetailId", this.DetailId);

    }
}

