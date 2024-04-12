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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListReleaseItem extends AbstractModel {

    /**
    * 版本ID
    */
    @SerializedName("ReleaseBizId")
    @Expose
    private String ReleaseBizId;

    /**
    * 发布人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 发布描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 发布状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 发布状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 发布成功数
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 发布失败数
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
     * Get 版本ID 
     * @return ReleaseBizId 版本ID
     */
    public String getReleaseBizId() {
        return this.ReleaseBizId;
    }

    /**
     * Set 版本ID
     * @param ReleaseBizId 版本ID
     */
    public void setReleaseBizId(String ReleaseBizId) {
        this.ReleaseBizId = ReleaseBizId;
    }

    /**
     * Get 发布人 
     * @return Operator 发布人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 发布人
     * @param Operator 发布人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 发布描述 
     * @return Desc 发布描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 发布描述
     * @param Desc 发布描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 发布状态 
     * @return Status 发布状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 发布状态
     * @param Status 发布状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 发布状态描述 
     * @return StatusDesc 发布状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 发布状态描述
     * @param StatusDesc 发布状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 失败原因 
     * @return Reason 失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 失败原因
     * @param Reason 失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 发布成功数 
     * @return SuccessCount 发布成功数
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 发布成功数
     * @param SuccessCount 发布成功数
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 发布失败数 
     * @return FailCount 发布失败数
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 发布失败数
     * @param FailCount 发布失败数
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    public ListReleaseItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListReleaseItem(ListReleaseItem source) {
        if (source.ReleaseBizId != null) {
            this.ReleaseBizId = new String(source.ReleaseBizId);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReleaseBizId", this.ReleaseBizId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);

    }
}

