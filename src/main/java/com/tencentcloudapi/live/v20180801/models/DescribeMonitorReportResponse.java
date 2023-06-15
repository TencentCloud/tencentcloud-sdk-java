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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMonitorReportResponse extends AbstractModel{

    /**
    * 媒体处理结果信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MPSResult")
    @Expose
    private MPSResult MPSResult;

    /**
    * 媒体诊断结果信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiagnoseResult")
    @Expose
    private DiagnoseResult DiagnoseResult;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 媒体处理结果信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MPSResult 媒体处理结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MPSResult getMPSResult() {
        return this.MPSResult;
    }

    /**
     * Set 媒体处理结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MPSResult 媒体处理结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMPSResult(MPSResult MPSResult) {
        this.MPSResult = MPSResult;
    }

    /**
     * Get 媒体诊断结果信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiagnoseResult 媒体诊断结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiagnoseResult getDiagnoseResult() {
        return this.DiagnoseResult;
    }

    /**
     * Set 媒体诊断结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiagnoseResult 媒体诊断结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnoseResult(DiagnoseResult DiagnoseResult) {
        this.DiagnoseResult = DiagnoseResult;
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

    public DescribeMonitorReportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMonitorReportResponse(DescribeMonitorReportResponse source) {
        if (source.MPSResult != null) {
            this.MPSResult = new MPSResult(source.MPSResult);
        }
        if (source.DiagnoseResult != null) {
            this.DiagnoseResult = new DiagnoseResult(source.DiagnoseResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MPSResult.", this.MPSResult);
        this.setParamObj(map, prefix + "DiagnoseResult.", this.DiagnoseResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

