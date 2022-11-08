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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskInstanceReportDetailResponse extends AbstractModel{

    /**
    * 任务实例运行指标概览
    */
    @SerializedName("Summary")
    @Expose
    private InstanceReportSummary Summary;

    /**
    * 任务实例读取节点运行指标
    */
    @SerializedName("ReadNode")
    @Expose
    private InstanceReportReadNode ReadNode;

    /**
    * 任务实例写入节点运行指标
    */
    @SerializedName("WriteNode")
    @Expose
    private InstanceReportWriteNode WriteNode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务实例运行指标概览 
     * @return Summary 任务实例运行指标概览
     */
    public InstanceReportSummary getSummary() {
        return this.Summary;
    }

    /**
     * Set 任务实例运行指标概览
     * @param Summary 任务实例运行指标概览
     */
    public void setSummary(InstanceReportSummary Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 任务实例读取节点运行指标 
     * @return ReadNode 任务实例读取节点运行指标
     */
    public InstanceReportReadNode getReadNode() {
        return this.ReadNode;
    }

    /**
     * Set 任务实例读取节点运行指标
     * @param ReadNode 任务实例读取节点运行指标
     */
    public void setReadNode(InstanceReportReadNode ReadNode) {
        this.ReadNode = ReadNode;
    }

    /**
     * Get 任务实例写入节点运行指标 
     * @return WriteNode 任务实例写入节点运行指标
     */
    public InstanceReportWriteNode getWriteNode() {
        return this.WriteNode;
    }

    /**
     * Set 任务实例写入节点运行指标
     * @param WriteNode 任务实例写入节点运行指标
     */
    public void setWriteNode(InstanceReportWriteNode WriteNode) {
        this.WriteNode = WriteNode;
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

    public DescribeTaskInstanceReportDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskInstanceReportDetailResponse(DescribeTaskInstanceReportDetailResponse source) {
        if (source.Summary != null) {
            this.Summary = new InstanceReportSummary(source.Summary);
        }
        if (source.ReadNode != null) {
            this.ReadNode = new InstanceReportReadNode(source.ReadNode);
        }
        if (source.WriteNode != null) {
            this.WriteNode = new InstanceReportWriteNode(source.WriteNode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamObj(map, prefix + "ReadNode.", this.ReadNode);
        this.setParamObj(map, prefix + "WriteNode.", this.WriteNode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

