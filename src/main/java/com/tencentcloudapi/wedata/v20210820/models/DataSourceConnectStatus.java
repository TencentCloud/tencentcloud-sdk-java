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

public class DataSourceConnectStatus extends AbstractModel {

    /**
    * id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 项目id
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
    * 连接结果
    */
    @SerializedName("ConnectResult")
    @Expose
    private Long ConnectResult;

    /**
    * 错误信息
    */
    @SerializedName("ConnectError")
    @Expose
    private String ConnectError;

    /**
    * 时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
     * Get id 
     * @return Id id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
     * @param Id id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

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
     * Get 连接结果 
     * @return ConnectResult 连接结果
     */
    public Long getConnectResult() {
        return this.ConnectResult;
    }

    /**
     * Set 连接结果
     * @param ConnectResult 连接结果
     */
    public void setConnectResult(Long ConnectResult) {
        this.ConnectResult = ConnectResult;
    }

    /**
     * Get 错误信息 
     * @return ConnectError 错误信息
     */
    public String getConnectError() {
        return this.ConnectError;
    }

    /**
     * Set 错误信息
     * @param ConnectError 错误信息
     */
    public void setConnectError(String ConnectError) {
        this.ConnectError = ConnectError;
    }

    /**
     * Get 时间戳 
     * @return Timestamp 时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳
     * @param Timestamp 时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    public DataSourceConnectStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceConnectStatus(DataSourceConnectStatus source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.ConnectResult != null) {
            this.ConnectResult = new Long(source.ConnectResult);
        }
        if (source.ConnectError != null) {
            this.ConnectError = new String(source.ConnectError);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ConnectResult", this.ConnectResult);
        this.setParamSimple(map, prefix + "ConnectError", this.ConnectError);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

