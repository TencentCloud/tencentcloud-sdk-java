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

public class UpdateLogstashPipelineDescRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例管道ID
    */
    @SerializedName("PipelineId")
    @Expose
    private String PipelineId;

    /**
    * 管道描述信息
    */
    @SerializedName("PipelineDesc")
    @Expose
    private String PipelineDesc;

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
     * Get 实例管道ID 
     * @return PipelineId 实例管道ID
     */
    public String getPipelineId() {
        return this.PipelineId;
    }

    /**
     * Set 实例管道ID
     * @param PipelineId 实例管道ID
     */
    public void setPipelineId(String PipelineId) {
        this.PipelineId = PipelineId;
    }

    /**
     * Get 管道描述信息 
     * @return PipelineDesc 管道描述信息
     */
    public String getPipelineDesc() {
        return this.PipelineDesc;
    }

    /**
     * Set 管道描述信息
     * @param PipelineDesc 管道描述信息
     */
    public void setPipelineDesc(String PipelineDesc) {
        this.PipelineDesc = PipelineDesc;
    }

    public UpdateLogstashPipelineDescRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateLogstashPipelineDescRequest(UpdateLogstashPipelineDescRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PipelineId != null) {
            this.PipelineId = new String(source.PipelineId);
        }
        if (source.PipelineDesc != null) {
            this.PipelineDesc = new String(source.PipelineDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PipelineId", this.PipelineId);
        this.setParamSimple(map, prefix + "PipelineDesc", this.PipelineDesc);

    }
}

