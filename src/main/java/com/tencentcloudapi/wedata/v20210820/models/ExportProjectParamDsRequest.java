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

public class ExportProjectParamDsRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 域名
    */
    @SerializedName("OriginDomain")
    @Expose
    private String OriginDomain;

    /**
    * 发布范围 ALL, PUBLISH, PARTIAL 全量 增量 自选
    */
    @SerializedName("Range")
    @Expose
    private String Range;

    /**
    * 增量发布时间 OffsetDateTime格式 2021-11-05T23:59:59Z
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * 自选导出参数
    */
    @SerializedName("Params")
    @Expose
    private String [] Params;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 域名 
     * @return OriginDomain 域名
     */
    public String getOriginDomain() {
        return this.OriginDomain;
    }

    /**
     * Set 域名
     * @param OriginDomain 域名
     */
    public void setOriginDomain(String OriginDomain) {
        this.OriginDomain = OriginDomain;
    }

    /**
     * Get 发布范围 ALL, PUBLISH, PARTIAL 全量 增量 自选 
     * @return Range 发布范围 ALL, PUBLISH, PARTIAL 全量 增量 自选
     */
    public String getRange() {
        return this.Range;
    }

    /**
     * Set 发布范围 ALL, PUBLISH, PARTIAL 全量 增量 自选
     * @param Range 发布范围 ALL, PUBLISH, PARTIAL 全量 增量 自选
     */
    public void setRange(String Range) {
        this.Range = Range;
    }

    /**
     * Get 增量发布时间 OffsetDateTime格式 2021-11-05T23:59:59Z 
     * @return PublishTime 增量发布时间 OffsetDateTime格式 2021-11-05T23:59:59Z
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 增量发布时间 OffsetDateTime格式 2021-11-05T23:59:59Z
     * @param PublishTime 增量发布时间 OffsetDateTime格式 2021-11-05T23:59:59Z
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get 自选导出参数 
     * @return Params 自选导出参数
     */
    public String [] getParams() {
        return this.Params;
    }

    /**
     * Set 自选导出参数
     * @param Params 自选导出参数
     */
    public void setParams(String [] Params) {
        this.Params = Params;
    }

    public ExportProjectParamDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportProjectParamDsRequest(ExportProjectParamDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.OriginDomain != null) {
            this.OriginDomain = new String(source.OriginDomain);
        }
        if (source.Range != null) {
            this.Range = new String(source.Range);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.Params != null) {
            this.Params = new String[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new String(source.Params[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "OriginDomain", this.OriginDomain);
        this.setParamSimple(map, prefix + "Range", this.Range);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamArraySimple(map, prefix + "Params.", this.Params);

    }
}

