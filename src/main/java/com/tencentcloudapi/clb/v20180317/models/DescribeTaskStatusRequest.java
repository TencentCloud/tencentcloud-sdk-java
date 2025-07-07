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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskStatusRequest extends AbstractModel {

    /**
    * 请求ID，即接口返回的 RequestId 参数。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 订单ID。
注意：参数TaskId和DealName必须传一个。
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
     * Get 请求ID，即接口返回的 RequestId 参数。 
     * @return TaskId 请求ID，即接口返回的 RequestId 参数。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 请求ID，即接口返回的 RequestId 参数。
     * @param TaskId 请求ID，即接口返回的 RequestId 参数。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 订单ID。
注意：参数TaskId和DealName必须传一个。 
     * @return DealName 订单ID。
注意：参数TaskId和DealName必须传一个。
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 订单ID。
注意：参数TaskId和DealName必须传一个。
     * @param DealName 订单ID。
注意：参数TaskId和DealName必须传一个。
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    public DescribeTaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskStatusRequest(DescribeTaskStatusRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);

    }
}

