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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrainingTaskRequest extends AbstractModel {

    /**
    * 训练任务ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 训练任务实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 训练任务ID 
     * @return Id 训练任务ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 训练任务ID
     * @param Id 训练任务ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 训练任务实例ID 
     * @return InstanceId 训练任务实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 训练任务实例ID
     * @param InstanceId 训练任务实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeTrainingTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrainingTaskRequest(DescribeTrainingTaskRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

