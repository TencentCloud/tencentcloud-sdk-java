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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContinueRunFailedTaskBatchRequest extends AbstractModel {

    /**
    * 任务批次ID。在[任务管理](https://console.cloud.tencent.com/tsf/tct?rid=1)页面点击任务ID进入执行记录页，第一列即为任务批次ID，在[任务执行记录](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=task)页能查看所有任务批次ID。
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
     * Get 任务批次ID。在[任务管理](https://console.cloud.tencent.com/tsf/tct?rid=1)页面点击任务ID进入执行记录页，第一列即为任务批次ID，在[任务执行记录](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=task)页能查看所有任务批次ID。 
     * @return BatchId 任务批次ID。在[任务管理](https://console.cloud.tencent.com/tsf/tct?rid=1)页面点击任务ID进入执行记录页，第一列即为任务批次ID，在[任务执行记录](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=task)页能查看所有任务批次ID。
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 任务批次ID。在[任务管理](https://console.cloud.tencent.com/tsf/tct?rid=1)页面点击任务ID进入执行记录页，第一列即为任务批次ID，在[任务执行记录](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=task)页能查看所有任务批次ID。
     * @param BatchId 任务批次ID。在[任务管理](https://console.cloud.tencent.com/tsf/tct?rid=1)页面点击任务ID进入执行记录页，第一列即为任务批次ID，在[任务执行记录](https://console.cloud.tencent.com/tsf/tct?rid=1&tab=task)页能查看所有任务批次ID。
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    public ContinueRunFailedTaskBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContinueRunFailedTaskBatchRequest(ContinueRunFailedTaskBatchRequest source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);

    }
}

