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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateOtaTaskStatusRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 固件升级任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 固件任务取消状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 固件升级任务ID 
     * @return TaskId 固件升级任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 固件升级任务ID
     * @param TaskId 固件升级任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 固件任务取消状态 
     * @return Status 固件任务取消状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 固件任务取消状态
     * @param Status 固件任务取消状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UpdateOtaTaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOtaTaskStatusRequest(UpdateOtaTaskStatusRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

