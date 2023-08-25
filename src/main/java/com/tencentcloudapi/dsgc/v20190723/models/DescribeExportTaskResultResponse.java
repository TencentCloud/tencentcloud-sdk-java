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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExportTaskResultResponse extends AbstractModel{

    /**
    * 导出任务结果
    */
    @SerializedName("ExportResult")
    @Expose
    private String ExportResult;

    /**
    * 导出文件地址
    */
    @SerializedName("ExportFileUrl")
    @Expose
    private String ExportFileUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 导出任务结果 
     * @return ExportResult 导出任务结果
     */
    public String getExportResult() {
        return this.ExportResult;
    }

    /**
     * Set 导出任务结果
     * @param ExportResult 导出任务结果
     */
    public void setExportResult(String ExportResult) {
        this.ExportResult = ExportResult;
    }

    /**
     * Get 导出文件地址 
     * @return ExportFileUrl 导出文件地址
     */
    public String getExportFileUrl() {
        return this.ExportFileUrl;
    }

    /**
     * Set 导出文件地址
     * @param ExportFileUrl 导出文件地址
     */
    public void setExportFileUrl(String ExportFileUrl) {
        this.ExportFileUrl = ExportFileUrl;
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

    public DescribeExportTaskResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExportTaskResultResponse(DescribeExportTaskResultResponse source) {
        if (source.ExportResult != null) {
            this.ExportResult = new String(source.ExportResult);
        }
        if (source.ExportFileUrl != null) {
            this.ExportFileUrl = new String(source.ExportFileUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExportResult", this.ExportResult);
        this.setParamSimple(map, prefix + "ExportFileUrl", this.ExportFileUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

