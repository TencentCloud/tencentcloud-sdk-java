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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemediationExecutions extends AbstractModel {

    /**
    * 修正状态 1：运行中 2：成功 3：失败
    */
    @SerializedName("ExecutionStatus")
    @Expose
    private Long ExecutionStatus;

    /**
    * 资源类型
    */
    @SerializedName("ExecutionResourceType")
    @Expose
    private String ExecutionResourceType;

    /**
    * 修复时间
    */
    @SerializedName("ExecutionCreateDate")
    @Expose
    private String ExecutionCreateDate;

    /**
    * 错误信息
    */
    @SerializedName("ExecutionStatusMessage")
    @Expose
    private String ExecutionStatusMessage;

    /**
    * 资源ID
    */
    @SerializedName("ExecutionResourceIds")
    @Expose
    private String ExecutionResourceIds;

    /**
     * Get 修正状态 1：运行中 2：成功 3：失败 
     * @return ExecutionStatus 修正状态 1：运行中 2：成功 3：失败
     */
    public Long getExecutionStatus() {
        return this.ExecutionStatus;
    }

    /**
     * Set 修正状态 1：运行中 2：成功 3：失败
     * @param ExecutionStatus 修正状态 1：运行中 2：成功 3：失败
     */
    public void setExecutionStatus(Long ExecutionStatus) {
        this.ExecutionStatus = ExecutionStatus;
    }

    /**
     * Get 资源类型 
     * @return ExecutionResourceType 资源类型
     */
    public String getExecutionResourceType() {
        return this.ExecutionResourceType;
    }

    /**
     * Set 资源类型
     * @param ExecutionResourceType 资源类型
     */
    public void setExecutionResourceType(String ExecutionResourceType) {
        this.ExecutionResourceType = ExecutionResourceType;
    }

    /**
     * Get 修复时间 
     * @return ExecutionCreateDate 修复时间
     */
    public String getExecutionCreateDate() {
        return this.ExecutionCreateDate;
    }

    /**
     * Set 修复时间
     * @param ExecutionCreateDate 修复时间
     */
    public void setExecutionCreateDate(String ExecutionCreateDate) {
        this.ExecutionCreateDate = ExecutionCreateDate;
    }

    /**
     * Get 错误信息 
     * @return ExecutionStatusMessage 错误信息
     */
    public String getExecutionStatusMessage() {
        return this.ExecutionStatusMessage;
    }

    /**
     * Set 错误信息
     * @param ExecutionStatusMessage 错误信息
     */
    public void setExecutionStatusMessage(String ExecutionStatusMessage) {
        this.ExecutionStatusMessage = ExecutionStatusMessage;
    }

    /**
     * Get 资源ID 
     * @return ExecutionResourceIds 资源ID
     */
    public String getExecutionResourceIds() {
        return this.ExecutionResourceIds;
    }

    /**
     * Set 资源ID
     * @param ExecutionResourceIds 资源ID
     */
    public void setExecutionResourceIds(String ExecutionResourceIds) {
        this.ExecutionResourceIds = ExecutionResourceIds;
    }

    public RemediationExecutions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemediationExecutions(RemediationExecutions source) {
        if (source.ExecutionStatus != null) {
            this.ExecutionStatus = new Long(source.ExecutionStatus);
        }
        if (source.ExecutionResourceType != null) {
            this.ExecutionResourceType = new String(source.ExecutionResourceType);
        }
        if (source.ExecutionCreateDate != null) {
            this.ExecutionCreateDate = new String(source.ExecutionCreateDate);
        }
        if (source.ExecutionStatusMessage != null) {
            this.ExecutionStatusMessage = new String(source.ExecutionStatusMessage);
        }
        if (source.ExecutionResourceIds != null) {
            this.ExecutionResourceIds = new String(source.ExecutionResourceIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionStatus", this.ExecutionStatus);
        this.setParamSimple(map, prefix + "ExecutionResourceType", this.ExecutionResourceType);
        this.setParamSimple(map, prefix + "ExecutionCreateDate", this.ExecutionCreateDate);
        this.setParamSimple(map, prefix + "ExecutionStatusMessage", this.ExecutionStatusMessage);
        this.setParamSimple(map, prefix + "ExecutionResourceIds", this.ExecutionResourceIds);

    }
}

