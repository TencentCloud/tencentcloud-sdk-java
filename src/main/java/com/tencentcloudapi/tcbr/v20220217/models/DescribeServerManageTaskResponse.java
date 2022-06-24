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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServerManageTaskResponse extends AbstractModel{

    /**
    * 是否存在
    */
    @SerializedName("IsExist")
    @Expose
    private Boolean IsExist;

    /**
    * 任务信息
    */
    @SerializedName("Task")
    @Expose
    private ServerManageTaskInfo Task;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否存在 
     * @return IsExist 是否存在
     */
    public Boolean getIsExist() {
        return this.IsExist;
    }

    /**
     * Set 是否存在
     * @param IsExist 是否存在
     */
    public void setIsExist(Boolean IsExist) {
        this.IsExist = IsExist;
    }

    /**
     * Get 任务信息 
     * @return Task 任务信息
     */
    public ServerManageTaskInfo getTask() {
        return this.Task;
    }

    /**
     * Set 任务信息
     * @param Task 任务信息
     */
    public void setTask(ServerManageTaskInfo Task) {
        this.Task = Task;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeServerManageTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServerManageTaskResponse(DescribeServerManageTaskResponse source) {
        if (source.IsExist != null) {
            this.IsExist = new Boolean(source.IsExist);
        }
        if (source.Task != null) {
            this.Task = new ServerManageTaskInfo(source.Task);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsExist", this.IsExist);
        this.setParamObj(map, prefix + "Task.", this.Task);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

