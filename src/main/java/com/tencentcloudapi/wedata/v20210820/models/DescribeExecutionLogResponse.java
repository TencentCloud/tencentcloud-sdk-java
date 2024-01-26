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

public class DescribeExecutionLogResponse extends AbstractModel {

    /**
    * 任务实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Logs")
    @Expose
    private String [] Logs;

    /**
    * 任务执行记录Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailId")
    @Expose
    private Long DetailId;

    /**
    * 子任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailStatus")
    @Expose
    private String DetailStatus;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务实例Id 
     * @return InstanceId 任务实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 任务实例Id
     * @param InstanceId 任务实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Logs 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLogs() {
        return this.Logs;
    }

    /**
     * Set 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Logs 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogs(String [] Logs) {
        this.Logs = Logs;
    }

    /**
     * Get 任务执行记录Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailId 任务执行记录Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDetailId() {
        return this.DetailId;
    }

    /**
     * Set 任务执行记录Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailId 任务执行记录Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailId(Long DetailId) {
        this.DetailId = DetailId;
    }

    /**
     * Get 子任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailStatus 子任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetailStatus() {
        return this.DetailStatus;
    }

    /**
     * Set 子任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailStatus 子任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailStatus(String DetailStatus) {
        this.DetailStatus = DetailStatus;
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

    public DescribeExecutionLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExecutionLogResponse(DescribeExecutionLogResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Logs != null) {
            this.Logs = new String[source.Logs.length];
            for (int i = 0; i < source.Logs.length; i++) {
                this.Logs[i] = new String(source.Logs[i]);
            }
        }
        if (source.DetailId != null) {
            this.DetailId = new Long(source.DetailId);
        }
        if (source.DetailStatus != null) {
            this.DetailStatus = new String(source.DetailStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "Logs.", this.Logs);
        this.setParamSimple(map, prefix + "DetailId", this.DetailId);
        this.setParamSimple(map, prefix + "DetailStatus", this.DetailStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

