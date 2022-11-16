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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataBasesRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据源类型
    */
    @SerializedName("DsTypes")
    @Expose
    private Long [] DsTypes;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 数据源id 
     * @return DatasourceId 数据源id
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
     * @param DatasourceId 数据源id
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据源类型 
     * @return DsTypes 数据源类型
     */
    public Long [] getDsTypes() {
        return this.DsTypes;
    }

    /**
     * Set 数据源类型
     * @param DsTypes 数据源类型
     */
    public void setDsTypes(Long [] DsTypes) {
        this.DsTypes = DsTypes;
    }

    public DescribeDataBasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataBasesRequest(DescribeDataBasesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DsTypes != null) {
            this.DsTypes = new Long[source.DsTypes.length];
            for (int i = 0; i < source.DsTypes.length; i++) {
                this.DsTypes[i] = new Long(source.DsTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamArraySimple(map, prefix + "DsTypes.", this.DsTypes);

    }
}

