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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSourceEnvInfo extends AbstractModel {

    /**
    * 环境
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * env环境的数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvDataSourceId")
    @Expose
    private String EnvDataSourceId;

    /**
    * 配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizParams")
    @Expose
    private String BizParams;

    /**
    * 是否支持tccatalog
    */
    @SerializedName("TcCatalogOpen")
    @Expose
    private Boolean TcCatalogOpen;

    /**
     * Get 环境
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Env 环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set 环境
注意：此字段可能返回 null，表示取不到有效值。
     * @param Env 环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get env环境的数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvDataSourceId env环境的数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvDataSourceId() {
        return this.EnvDataSourceId;
    }

    /**
     * Set env环境的数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvDataSourceId env环境的数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvDataSourceId(String EnvDataSourceId) {
        this.EnvDataSourceId = EnvDataSourceId;
    }

    /**
     * Get 配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizParams 配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizParams() {
        return this.BizParams;
    }

    /**
     * Set 配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizParams 配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizParams(String BizParams) {
        this.BizParams = BizParams;
    }

    /**
     * Get 是否支持tccatalog 
     * @return TcCatalogOpen 是否支持tccatalog
     */
    public Boolean getTcCatalogOpen() {
        return this.TcCatalogOpen;
    }

    /**
     * Set 是否支持tccatalog
     * @param TcCatalogOpen 是否支持tccatalog
     */
    public void setTcCatalogOpen(Boolean TcCatalogOpen) {
        this.TcCatalogOpen = TcCatalogOpen;
    }

    public DataSourceEnvInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceEnvInfo(DataSourceEnvInfo source) {
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.EnvDataSourceId != null) {
            this.EnvDataSourceId = new String(source.EnvDataSourceId);
        }
        if (source.BizParams != null) {
            this.BizParams = new String(source.BizParams);
        }
        if (source.TcCatalogOpen != null) {
            this.TcCatalogOpen = new Boolean(source.TcCatalogOpen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "EnvDataSourceId", this.EnvDataSourceId);
        this.setParamSimple(map, prefix + "BizParams", this.BizParams);
        this.setParamSimple(map, prefix + "TcCatalogOpen", this.TcCatalogOpen);

    }
}

