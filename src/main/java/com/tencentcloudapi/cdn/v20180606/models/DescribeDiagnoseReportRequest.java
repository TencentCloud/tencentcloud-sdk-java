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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiagnoseReportRequest extends AbstractModel{

    /**
    * 报告ID
    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
     * Get 报告ID 
     * @return ReportId 报告ID
     */
    public String getReportId() {
        return this.ReportId;
    }

    /**
     * Set 报告ID
     * @param ReportId 报告ID
     */
    public void setReportId(String ReportId) {
        this.ReportId = ReportId;
    }

    public DescribeDiagnoseReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiagnoseReportRequest(DescribeDiagnoseReportRequest source) {
        if (source.ReportId != null) {
            this.ReportId = new String(source.ReportId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);

    }
}

