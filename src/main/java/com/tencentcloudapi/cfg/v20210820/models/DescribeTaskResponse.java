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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskResponse extends AbstractModel{

    /**
    * 任务信息
    */
    @SerializedName("Task")
    @Expose
    private Task Task;

    /**
    * 任务对应的演练报告信息，null表示未导出报告
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportInfo")
    @Expose
    private TaskReportInfo ReportInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务信息 
     * @return Task 任务信息
     */
    public Task getTask() {
        return this.Task;
    }

    /**
     * Set 任务信息
     * @param Task 任务信息
     */
    public void setTask(Task Task) {
        this.Task = Task;
    }

    /**
     * Get 任务对应的演练报告信息，null表示未导出报告
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportInfo 任务对应的演练报告信息，null表示未导出报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskReportInfo getReportInfo() {
        return this.ReportInfo;
    }

    /**
     * Set 任务对应的演练报告信息，null表示未导出报告
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportInfo 任务对应的演练报告信息，null表示未导出报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportInfo(TaskReportInfo ReportInfo) {
        this.ReportInfo = ReportInfo;
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

    public DescribeTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskResponse(DescribeTaskResponse source) {
        if (source.Task != null) {
            this.Task = new Task(source.Task);
        }
        if (source.ReportInfo != null) {
            this.ReportInfo = new TaskReportInfo(source.ReportInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Task.", this.Task);
        this.setParamObj(map, prefix + "ReportInfo.", this.ReportInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

