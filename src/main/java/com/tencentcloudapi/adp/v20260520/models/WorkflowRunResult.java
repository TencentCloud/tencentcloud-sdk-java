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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowRunResult extends AbstractModel {

    /**
    * 运行状态。1: 排队中；2: 运行中；3: 运行成功；4: 运行失败； 5: 已取消
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 错误信息
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * 消耗的token总数
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get 运行状态。1: 排队中；2: 运行中；3: 运行成功；4: 运行失败； 5: 已取消 
     * @return Status 运行状态。1: 排队中；2: 运行中；3: 运行成功；4: 运行失败； 5: 已取消
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 运行状态。1: 排队中；2: 运行中；3: 运行成功；4: 运行失败； 5: 已取消
     * @param Status 运行状态。1: 排队中；2: 运行中；3: 运行成功；4: 运行失败； 5: 已取消
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 错误信息 
     * @return FailMessage 错误信息
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set 错误信息
     * @param FailMessage 错误信息
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get 消耗的token总数 
     * @return TotalTokens 消耗的token总数
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set 消耗的token总数
     * @param TotalTokens 消耗的token总数
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public WorkflowRunResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunResult(WorkflowRunResult source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

