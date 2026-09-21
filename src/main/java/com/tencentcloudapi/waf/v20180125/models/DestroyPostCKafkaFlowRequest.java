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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestroyPostCKafkaFlowRequest extends AbstractModel {

    /**
    * <p>投递流的流ID，可以通过DescribePostCKafkaFlows接口获取</p>
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * <p>1-访问日志，2-攻击日志，默认为访问日志。</p>
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
     * Get <p>投递流的流ID，可以通过DescribePostCKafkaFlows接口获取</p> 
     * @return FlowId <p>投递流的流ID，可以通过DescribePostCKafkaFlows接口获取</p>
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>投递流的流ID，可以通过DescribePostCKafkaFlows接口获取</p>
     * @param FlowId <p>投递流的流ID，可以通过DescribePostCKafkaFlows接口获取</p>
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>1-访问日志，2-攻击日志，默认为访问日志。</p> 
     * @return LogType <p>1-访问日志，2-攻击日志，默认为访问日志。</p>
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>1-访问日志，2-攻击日志，默认为访问日志。</p>
     * @param LogType <p>1-访问日志，2-攻击日志，默认为访问日志。</p>
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    public DestroyPostCKafkaFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestroyPostCKafkaFlowRequest(DestroyPostCKafkaFlowRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.LogType != null) {
            this.LogType = new Long(source.LogType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}

