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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStructureTaskResultResponse extends AbstractModel{

    /**
    * 结果状态：
0：返回成功
1：结果未生成
2：结果生成失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 结构化识别结果数组，每个数组元素对应一个图片的结构化结果，顺序和输入参数的ImageList或FileList对应。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private ResultObject [] Results;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 结果状态：
0：返回成功
1：结果未生成
2：结果生成失败 
     * @return Status 结果状态：
0：返回成功
1：结果未生成
2：结果生成失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 结果状态：
0：返回成功
1：结果未生成
2：结果生成失败
     * @param Status 结果状态：
0：返回成功
1：结果未生成
2：结果生成失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 结构化识别结果数组，每个数组元素对应一个图片的结构化结果，顺序和输入参数的ImageList或FileList对应。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results 结构化识别结果数组，每个数组元素对应一个图片的结构化结果，顺序和输入参数的ImageList或FileList对应。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResultObject [] getResults() {
        return this.Results;
    }

    /**
     * Set 结构化识别结果数组，每个数组元素对应一个图片的结构化结果，顺序和输入参数的ImageList或FileList对应。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results 结构化识别结果数组，每个数组元素对应一个图片的结构化结果，顺序和输入参数的ImageList或FileList对应。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(ResultObject [] Results) {
        this.Results = Results;
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

    public DescribeStructureTaskResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStructureTaskResultResponse(DescribeStructureTaskResultResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Results != null) {
            this.Results = new ResultObject[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new ResultObject(source.Results[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

