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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetDetailDataExportResultRequest extends AbstractModel {

    /**
    * 导出任务id
    */
    @SerializedName("ExportTaskId")
    @Expose
    private Long ExportTaskId;

    /**
    * DSPA实例Id，格式“dspa-xxxxxxxx”
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
     * Get 导出任务id 
     * @return ExportTaskId 导出任务id
     */
    public Long getExportTaskId() {
        return this.ExportTaskId;
    }

    /**
     * Set 导出任务id
     * @param ExportTaskId 导出任务id
     */
    public void setExportTaskId(Long ExportTaskId) {
        this.ExportTaskId = ExportTaskId;
    }

    /**
     * Get DSPA实例Id，格式“dspa-xxxxxxxx” 
     * @return DspaId DSPA实例Id，格式“dspa-xxxxxxxx”
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例Id，格式“dspa-xxxxxxxx”
     * @param DspaId DSPA实例Id，格式“dspa-xxxxxxxx”
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    public DescribeAssetDetailDataExportResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetDetailDataExportResultRequest(DescribeAssetDetailDataExportResultRequest source) {
        if (source.ExportTaskId != null) {
            this.ExportTaskId = new Long(source.ExportTaskId);
        }
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExportTaskId", this.ExportTaskId);
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);

    }
}

