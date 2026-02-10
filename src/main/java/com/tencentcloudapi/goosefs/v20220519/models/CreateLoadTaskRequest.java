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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadTaskRequest extends AbstractModel {

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 创建预热任务参数
    */
    @SerializedName("LoadTaskCreationAttrs")
    @Expose
    private LoadTaskCreationAttrs LoadTaskCreationAttrs;

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 创建预热任务参数 
     * @return LoadTaskCreationAttrs 创建预热任务参数
     */
    public LoadTaskCreationAttrs getLoadTaskCreationAttrs() {
        return this.LoadTaskCreationAttrs;
    }

    /**
     * Set 创建预热任务参数
     * @param LoadTaskCreationAttrs 创建预热任务参数
     */
    public void setLoadTaskCreationAttrs(LoadTaskCreationAttrs LoadTaskCreationAttrs) {
        this.LoadTaskCreationAttrs = LoadTaskCreationAttrs;
    }

    public CreateLoadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadTaskRequest(CreateLoadTaskRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.LoadTaskCreationAttrs != null) {
            this.LoadTaskCreationAttrs = new LoadTaskCreationAttrs(source.LoadTaskCreationAttrs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "LoadTaskCreationAttrs.", this.LoadTaskCreationAttrs);

    }
}

