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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMultiDevicesRequest extends AbstractModel{

    /**
    * 产品 ID，创建产品时腾讯云为用户分配全局唯一的 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 任务 ID，由批量创建设备接口返回
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 分页偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小，每页返回的设备个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 产品 ID，创建产品时腾讯云为用户分配全局唯一的 ID 
     * @return ProductId 产品 ID，创建产品时腾讯云为用户分配全局唯一的 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID，创建产品时腾讯云为用户分配全局唯一的 ID
     * @param ProductId 产品 ID，创建产品时腾讯云为用户分配全局唯一的 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 任务 ID，由批量创建设备接口返回 
     * @return TaskId 任务 ID，由批量创建设备接口返回
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID，由批量创建设备接口返回
     * @param TaskId 任务 ID，由批量创建设备接口返回
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 分页偏移 
     * @return Offset 分页偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移
     * @param Offset 分页偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小，每页返回的设备个数 
     * @return Limit 分页大小，每页返回的设备个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，每页返回的设备个数
     * @param Limit 分页大小，每页返回的设备个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

