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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTestRunBatchItem extends AbstractModel {

    /**
    * 任务实例Id
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * 当前任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务是否结束
    */
    @SerializedName("Finished")
    @Expose
    private Boolean Finished;

    /**
    * 日志内容
    */
    @SerializedName("LogContent")
    @Expose
    private String LogContent;

    /**
     * Get 任务实例Id 
     * @return InstanceKey 任务实例Id
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set 任务实例Id
     * @param InstanceKey 任务实例Id
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get 当前任务状态 
     * @return Status 当前任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前任务状态
     * @param Status 当前任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务是否结束 
     * @return Finished 任务是否结束
     */
    public Boolean getFinished() {
        return this.Finished;
    }

    /**
     * Set 任务是否结束
     * @param Finished 任务是否结束
     */
    public void setFinished(Boolean Finished) {
        this.Finished = Finished;
    }

    /**
     * Get 日志内容 
     * @return LogContent 日志内容
     */
    public String getLogContent() {
        return this.LogContent;
    }

    /**
     * Set 日志内容
     * @param LogContent 日志内容
     */
    public void setLogContent(String LogContent) {
        this.LogContent = LogContent;
    }

    public DescribeTestRunBatchItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTestRunBatchItem(DescribeTestRunBatchItem source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Finished != null) {
            this.Finished = new Boolean(source.Finished);
        }
        if (source.LogContent != null) {
            this.LogContent = new String(source.LogContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Finished", this.Finished);
        this.setParamSimple(map, prefix + "LogContent", this.LogContent);

    }
}

