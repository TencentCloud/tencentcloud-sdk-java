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
package com.tencentcloudapi.mmps.v20200710.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanTaskReportUrlResponse extends AbstractModel{

    /**
    * 返回值, 0:成功, 其他值请查看“返回值”定义
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 诊断报告/堆栈信息下载链接
    */
    @SerializedName("ReportUrl")
    @Expose
    private String ReportUrl;

    /**
    * 诊断报告/堆栈名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportTitle")
    @Expose
    private String ReportTitle;

    /**
    * 诊断json结果内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportResult")
    @Expose
    private String ReportResult;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回值, 0:成功, 其他值请查看“返回值”定义 
     * @return Result 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 返回值, 0:成功, 其他值请查看“返回值”定义
     * @param Result 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 诊断报告/堆栈信息下载链接 
     * @return ReportUrl 诊断报告/堆栈信息下载链接
     */
    public String getReportUrl() {
        return this.ReportUrl;
    }

    /**
     * Set 诊断报告/堆栈信息下载链接
     * @param ReportUrl 诊断报告/堆栈信息下载链接
     */
    public void setReportUrl(String ReportUrl) {
        this.ReportUrl = ReportUrl;
    }

    /**
     * Get 诊断报告/堆栈名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportTitle 诊断报告/堆栈名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportTitle() {
        return this.ReportTitle;
    }

    /**
     * Set 诊断报告/堆栈名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportTitle 诊断报告/堆栈名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportTitle(String ReportTitle) {
        this.ReportTitle = ReportTitle;
    }

    /**
     * Get 诊断json结果内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportResult 诊断json结果内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportResult() {
        return this.ReportResult;
    }

    /**
     * Set 诊断json结果内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportResult 诊断json结果内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportResult(String ReportResult) {
        this.ReportResult = ReportResult;
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

    public DescribeScanTaskReportUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanTaskReportUrlResponse(DescribeScanTaskReportUrlResponse source) {
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.ReportUrl != null) {
            this.ReportUrl = new String(source.ReportUrl);
        }
        if (source.ReportTitle != null) {
            this.ReportTitle = new String(source.ReportTitle);
        }
        if (source.ReportResult != null) {
            this.ReportResult = new String(source.ReportResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ReportUrl", this.ReportUrl);
        this.setParamSimple(map, prefix + "ReportTitle", this.ReportTitle);
        this.setParamSimple(map, prefix + "ReportResult", this.ReportResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

