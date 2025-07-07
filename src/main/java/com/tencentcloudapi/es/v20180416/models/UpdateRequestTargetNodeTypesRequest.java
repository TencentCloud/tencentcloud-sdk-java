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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRequestTargetNodeTypesRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 接收请求的目标节点类型列表
    */
    @SerializedName("TargetNodeTypes")
    @Expose
    private String [] TargetNodeTypes;

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
     * Get 接收请求的目标节点类型列表 
     * @return TargetNodeTypes 接收请求的目标节点类型列表
     */
    public String [] getTargetNodeTypes() {
        return this.TargetNodeTypes;
    }

    /**
     * Set 接收请求的目标节点类型列表
     * @param TargetNodeTypes 接收请求的目标节点类型列表
     */
    public void setTargetNodeTypes(String [] TargetNodeTypes) {
        this.TargetNodeTypes = TargetNodeTypes;
    }

    public UpdateRequestTargetNodeTypesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRequestTargetNodeTypesRequest(UpdateRequestTargetNodeTypesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TargetNodeTypes != null) {
            this.TargetNodeTypes = new String[source.TargetNodeTypes.length];
            for (int i = 0; i < source.TargetNodeTypes.length; i++) {
                this.TargetNodeTypes[i] = new String(source.TargetNodeTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "TargetNodeTypes.", this.TargetNodeTypes);

    }
}

