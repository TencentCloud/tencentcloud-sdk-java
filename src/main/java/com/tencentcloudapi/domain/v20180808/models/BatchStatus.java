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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchStatus extends AbstractModel{

    /**
    * 批量任务id
    */
    @SerializedName("LogId")
    @Expose
    private Long LogId;

    /**
    * 批量任务状态  doing：进行中  success：成功  failed：失败  partial_success：部分成功
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 批量任务类型
    */
    @SerializedName("BatchAction")
    @Expose
    private String BatchAction;

    /**
     * Get 批量任务id 
     * @return LogId 批量任务id
     */
    public Long getLogId() {
        return this.LogId;
    }

    /**
     * Set 批量任务id
     * @param LogId 批量任务id
     */
    public void setLogId(Long LogId) {
        this.LogId = LogId;
    }

    /**
     * Get 批量任务状态  doing：进行中  success：成功  failed：失败  partial_success：部分成功 
     * @return Status 批量任务状态  doing：进行中  success：成功  failed：失败  partial_success：部分成功
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 批量任务状态  doing：进行中  success：成功  failed：失败  partial_success：部分成功
     * @param Status 批量任务状态  doing：进行中  success：成功  failed：失败  partial_success：部分成功
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 批量任务类型 
     * @return BatchAction 批量任务类型
     */
    public String getBatchAction() {
        return this.BatchAction;
    }

    /**
     * Set 批量任务类型
     * @param BatchAction 批量任务类型
     */
    public void setBatchAction(String BatchAction) {
        this.BatchAction = BatchAction;
    }

    public BatchStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchStatus(BatchStatus source) {
        if (source.LogId != null) {
            this.LogId = new Long(source.LogId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BatchAction != null) {
            this.BatchAction = new String(source.BatchAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BatchAction", this.BatchAction);

    }
}

