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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateBindResourceTaskResultRequest extends AbstractModel {

    /**
    * 任务ID，根据任务ID查询绑定云资源结果， 最大支持100个
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
     * Get 任务ID，根据任务ID查询绑定云资源结果， 最大支持100个 
     * @return TaskIds 任务ID，根据任务ID查询绑定云资源结果， 最大支持100个
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务ID，根据任务ID查询绑定云资源结果， 最大支持100个
     * @param TaskIds 任务ID，根据任务ID查询绑定云资源结果， 最大支持100个
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    public DescribeCertificateBindResourceTaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateBindResourceTaskResultRequest(DescribeCertificateBindResourceTaskResultRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);

    }
}

