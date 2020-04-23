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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteServiceLinkedRoleResponse extends AbstractModel{

    /**
    * 删除任务ID，可用于检查删除服务相关角色状态。
    */
    @SerializedName("DeletionTaskId")
    @Expose
    private String DeletionTaskId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 删除任务ID，可用于检查删除服务相关角色状态。 
     * @return DeletionTaskId 删除任务ID，可用于检查删除服务相关角色状态。
     */
    public String getDeletionTaskId() {
        return this.DeletionTaskId;
    }

    /**
     * Set 删除任务ID，可用于检查删除服务相关角色状态。
     * @param DeletionTaskId 删除任务ID，可用于检查删除服务相关角色状态。
     */
    public void setDeletionTaskId(String DeletionTaskId) {
        this.DeletionTaskId = DeletionTaskId;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeletionTaskId", this.DeletionTaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

