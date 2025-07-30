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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryShipperTaskRequest extends AbstractModel {

    /**
    * 投递规则Id。

- 通过 [获取投递任务列表](https://cloud.tencent.com/document/product/614/58745)获取ShipperId。
    */
    @SerializedName("ShipperId")
    @Expose
    private String ShipperId;

    /**
    * 投递任务Id。

- 通过 [获取投递任务列表](https://cloud.tencent.com/document/product/614/58745) 获取TaskId。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 投递规则Id。

- 通过 [获取投递任务列表](https://cloud.tencent.com/document/product/614/58745)获取ShipperId。 
     * @return ShipperId 投递规则Id。

- 通过 [获取投递任务列表](https://cloud.tencent.com/document/product/614/58745)获取ShipperId。
     */
    public String getShipperId() {
        return this.ShipperId;
    }

    /**
     * Set 投递规则Id。

- 通过 [获取投递任务列表](https://cloud.tencent.com/document/product/614/58745)获取ShipperId。
     * @param ShipperId 投递规则Id。

- 通过 [获取投递任务列表](https://cloud.tencent.com/document/product/614/58745)获取ShipperId。
     */
    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
    }

    /**
     * Get 投递任务Id。

- 通过 [获取投递任务列表](https://cloud.tencent.com/document/product/614/58745) 获取TaskId。 
     * @return TaskId 投递任务Id。

- 通过 [获取投递任务列表](https://cloud.tencent.com/document/product/614/58745) 获取TaskId。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 投递任务Id。

- 通过 [获取投递任务列表](https://cloud.tencent.com/document/product/614/58745) 获取TaskId。
     * @param TaskId 投递任务Id。

- 通过 [获取投递任务列表](https://cloud.tencent.com/document/product/614/58745) 获取TaskId。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public RetryShipperTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryShipperTaskRequest(RetryShipperTaskRequest source) {
        if (source.ShipperId != null) {
            this.ShipperId = new String(source.ShipperId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShipperId", this.ShipperId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

