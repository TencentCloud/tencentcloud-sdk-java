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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOnlineDDLJobRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Online DDL 对应的流程Id。创建任务时，CreateOnlineDDLJob 会返回此流程Id
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Online DDL 对应的流程Id。创建任务时，CreateOnlineDDLJob 会返回此流程Id 
     * @return FlowId Online DDL 对应的流程Id。创建任务时，CreateOnlineDDLJob 会返回此流程Id
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set Online DDL 对应的流程Id。创建任务时，CreateOnlineDDLJob 会返回此流程Id
     * @param FlowId Online DDL 对应的流程Id。创建任务时，CreateOnlineDDLJob 会返回此流程Id
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    public DescribeOnlineDDLJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOnlineDDLJobRequest(DescribeOnlineDDLJobRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

