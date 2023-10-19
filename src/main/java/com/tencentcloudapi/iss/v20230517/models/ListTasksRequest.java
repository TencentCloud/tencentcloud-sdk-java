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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTasksRequest extends AbstractModel {

    /**
    * 页码，默认为1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量，默认为10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 默认不根据该字段进行筛选，否则根据设备操作类型进行筛选，对应任务的Action字段，批量任务操作类型以Batch开头。目前值有：BatchDeleteUserDevice，BatchDisableDevice，BatchEnableDevice，DeleteUserDevice，DisableDevice，EnableDevice
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 默认不根据该字段进行筛选，否则根据任务状态进行筛选。状态码：1-NEW，2-RUNNING，3-COMPLETED，4-FAILED
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 页码，默认为1 
     * @return PageNumber 页码，默认为1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，默认为1
     * @param PageNumber 页码，默认为1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量，默认为10 
     * @return PageSize 每页数量，默认为10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量，默认为10
     * @param PageSize 每页数量，默认为10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 默认不根据该字段进行筛选，否则根据设备操作类型进行筛选，对应任务的Action字段，批量任务操作类型以Batch开头。目前值有：BatchDeleteUserDevice，BatchDisableDevice，BatchEnableDevice，DeleteUserDevice，DisableDevice，EnableDevice 
     * @return Operation 默认不根据该字段进行筛选，否则根据设备操作类型进行筛选，对应任务的Action字段，批量任务操作类型以Batch开头。目前值有：BatchDeleteUserDevice，BatchDisableDevice，BatchEnableDevice，DeleteUserDevice，DisableDevice，EnableDevice
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 默认不根据该字段进行筛选，否则根据设备操作类型进行筛选，对应任务的Action字段，批量任务操作类型以Batch开头。目前值有：BatchDeleteUserDevice，BatchDisableDevice，BatchEnableDevice，DeleteUserDevice，DisableDevice，EnableDevice
     * @param Operation 默认不根据该字段进行筛选，否则根据设备操作类型进行筛选，对应任务的Action字段，批量任务操作类型以Batch开头。目前值有：BatchDeleteUserDevice，BatchDisableDevice，BatchEnableDevice，DeleteUserDevice，DisableDevice，EnableDevice
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 默认不根据该字段进行筛选，否则根据任务状态进行筛选。状态码：1-NEW，2-RUNNING，3-COMPLETED，4-FAILED 
     * @return Status 默认不根据该字段进行筛选，否则根据任务状态进行筛选。状态码：1-NEW，2-RUNNING，3-COMPLETED，4-FAILED
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 默认不根据该字段进行筛选，否则根据任务状态进行筛选。状态码：1-NEW，2-RUNNING，3-COMPLETED，4-FAILED
     * @param Status 默认不根据该字段进行筛选，否则根据任务状态进行筛选。状态码：1-NEW，2-RUNNING，3-COMPLETED，4-FAILED
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ListTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTasksRequest(ListTasksRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

