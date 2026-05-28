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

public class ReportFileInfoReq extends AbstractModel {

    /**
    * <p>报告文件链接</p>
    */
    @SerializedName("ReportFileUrl")
    @Expose
    private String ReportFileUrl;

    /**
    * <p>报告文件类型，1:pdf，2:图片</p>
    */
    @SerializedName("ReportFileType")
    @Expose
    private Long ReportFileType;

    /**
    * <p>报告id</p>
    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
     * Get <p>报告文件链接</p> 
     * @return ReportFileUrl <p>报告文件链接</p>
     */
    public String getReportFileUrl() {
        return this.ReportFileUrl;
    }

    /**
     * Set <p>报告文件链接</p>
     * @param ReportFileUrl <p>报告文件链接</p>
     */
    public void setReportFileUrl(String ReportFileUrl) {
        this.ReportFileUrl = ReportFileUrl;
    }

    /**
     * Get <p>报告文件类型，1:pdf，2:图片</p> 
     * @return ReportFileType <p>报告文件类型，1:pdf，2:图片</p>
     */
    public Long getReportFileType() {
        return this.ReportFileType;
    }

    /**
     * Set <p>报告文件类型，1:pdf，2:图片</p>
     * @param ReportFileType <p>报告文件类型，1:pdf，2:图片</p>
     */
    public void setReportFileType(Long ReportFileType) {
        this.ReportFileType = ReportFileType;
    }

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

    public ReportFileInfoReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportFileInfoReq(ReportFileInfoReq source) {
        if (source.ReportFileUrl != null) {
            this.ReportFileUrl = new String(source.ReportFileUrl);
        }
        if (source.ReportFileType != null) {
            this.ReportFileType = new Long(source.ReportFileType);
        }
        if (source.ReportId != null) {
            this.ReportId = new String(source.ReportId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportFileUrl", this.ReportFileUrl);
        this.setParamSimple(map, prefix + "ReportFileType", this.ReportFileType);
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);

    }
}

