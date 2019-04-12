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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateTasksRequest  extends AbstractModel{

    /**
    * 销毁节点所属实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 销毁节点ID
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
     * 获取销毁节点所属实例ID
     * @return InstanceId 销毁节点所属实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置销毁节点所属实例ID
     * @param InstanceId 销毁节点所属实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取销毁节点ID
     * @return ResourceIds 销毁节点ID
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * 设置销毁节点ID
     * @param ResourceIds 销毁节点ID
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);

    }
}

