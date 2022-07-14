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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaveAndDeployLogstashPipelineRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例管道信息
    */
    @SerializedName("Pipeline")
    @Expose
    private LogstashPipeline Pipeline;

    /**
    * 操作类型<li>1：只保存</li><li>2：保存并部署</li>
    */
    @SerializedName("OpType")
    @Expose
    private Long OpType;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例管道信息 
     * @return Pipeline 实例管道信息
     */
    public LogstashPipeline getPipeline() {
        return this.Pipeline;
    }

    /**
     * Set 实例管道信息
     * @param Pipeline 实例管道信息
     */
    public void setPipeline(LogstashPipeline Pipeline) {
        this.Pipeline = Pipeline;
    }

    /**
     * Get 操作类型<li>1：只保存</li><li>2：保存并部署</li> 
     * @return OpType 操作类型<li>1：只保存</li><li>2：保存并部署</li>
     */
    public Long getOpType() {
        return this.OpType;
    }

    /**
     * Set 操作类型<li>1：只保存</li><li>2：保存并部署</li>
     * @param OpType 操作类型<li>1：只保存</li><li>2：保存并部署</li>
     */
    public void setOpType(Long OpType) {
        this.OpType = OpType;
    }

    public SaveAndDeployLogstashPipelineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaveAndDeployLogstashPipelineRequest(SaveAndDeployLogstashPipelineRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Pipeline != null) {
            this.Pipeline = new LogstashPipeline(source.Pipeline);
        }
        if (source.OpType != null) {
            this.OpType = new Long(source.OpType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "Pipeline.", this.Pipeline);
        this.setParamSimple(map, prefix + "OpType", this.OpType);

    }
}

