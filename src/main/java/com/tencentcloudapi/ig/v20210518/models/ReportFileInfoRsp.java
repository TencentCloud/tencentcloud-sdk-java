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
package com.tencentcloudapi.ig.v20210518.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportFileInfoRsp extends AbstractModel {

    /**
    * <p>报告id</p>
    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
    * <p>是否解析成功</p>
    */
    @SerializedName("IsAnalysis")
    @Expose
    private Boolean IsAnalysis;

    /**
    * <p>解析错误信息</p>
    */
    @SerializedName("ErrInfo")
    @Expose
    private String ErrInfo;

    /**
     * Get <p>报告id</p> 
     * @return ReportId <p>报告id</p>
     */
    public String getReportId() {
        return this.ReportId;
    }

    /**
     * Set <p>报告id</p>
     * @param ReportId <p>报告id</p>
     */
    public void setReportId(String ReportId) {
        this.ReportId = ReportId;
    }

    /**
     * Get <p>是否解析成功</p> 
     * @return IsAnalysis <p>是否解析成功</p>
     */
    public Boolean getIsAnalysis() {
        return this.IsAnalysis;
    }

    /**
     * Set <p>是否解析成功</p>
     * @param IsAnalysis <p>是否解析成功</p>
     */
    public void setIsAnalysis(Boolean IsAnalysis) {
        this.IsAnalysis = IsAnalysis;
    }

    /**
     * Get <p>解析错误信息</p> 
     * @return ErrInfo <p>解析错误信息</p>
     */
    public String getErrInfo() {
        return this.ErrInfo;
    }

    /**
     * Set <p>解析错误信息</p>
     * @param ErrInfo <p>解析错误信息</p>
     */
    public void setErrInfo(String ErrInfo) {
        this.ErrInfo = ErrInfo;
    }

    public ReportFileInfoRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportFileInfoRsp(ReportFileInfoRsp source) {
        if (source.ReportId != null) {
            this.ReportId = new String(source.ReportId);
        }
        if (source.IsAnalysis != null) {
            this.IsAnalysis = new Boolean(source.IsAnalysis);
        }
        if (source.ErrInfo != null) {
            this.ErrInfo = new String(source.ErrInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);
        this.setParamSimple(map, prefix + "IsAnalysis", this.IsAnalysis);
        this.setParamSimple(map, prefix + "ErrInfo", this.ErrInfo);

    }
}

