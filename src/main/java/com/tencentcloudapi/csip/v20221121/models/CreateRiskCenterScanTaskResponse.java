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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRiskCenterScanTaskResponse extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 0,任务创建成功；小于0失败；-1为存在资产未认证
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 未认证资产列表
    */
    @SerializedName("UnAuthAsset")
    @Expose
    private String [] UnAuthAsset;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 0,任务创建成功；小于0失败；-1为存在资产未认证 
     * @return Status 0,任务创建成功；小于0失败；-1为存在资产未认证
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0,任务创建成功；小于0失败；-1为存在资产未认证
     * @param Status 0,任务创建成功；小于0失败；-1为存在资产未认证
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 未认证资产列表 
     * @return UnAuthAsset 未认证资产列表
     */
    public String [] getUnAuthAsset() {
        return this.UnAuthAsset;
    }

    /**
     * Set 未认证资产列表
     * @param UnAuthAsset 未认证资产列表
     */
    public void setUnAuthAsset(String [] UnAuthAsset) {
        this.UnAuthAsset = UnAuthAsset;
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

    public CreateRiskCenterScanTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRiskCenterScanTaskResponse(CreateRiskCenterScanTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UnAuthAsset != null) {
            this.UnAuthAsset = new String[source.UnAuthAsset.length];
            for (int i = 0; i < source.UnAuthAsset.length; i++) {
                this.UnAuthAsset[i] = new String(source.UnAuthAsset[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "UnAuthAsset.", this.UnAuthAsset);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

