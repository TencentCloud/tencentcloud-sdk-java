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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SQLScriptConfig extends AbstractModel {

    /**
    * 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据源环境
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceEnv")
    @Expose
    private String DatasourceEnv;

    /**
    * 计算资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputeResource")
    @Expose
    private String ComputeResource;

    /**
    * 执行资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 高级运行参数,变量替换，map-json String,String
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * 高级设置，执行配置参数，map-json String,String. 采用Base64编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvanceConfig")
    @Expose
    private String AdvanceConfig;

    /**
     * Get 数据源Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据源环境
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceEnv 数据源环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceEnv() {
        return this.DatasourceEnv;
    }

    /**
     * Set 数据源环境
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceEnv 数据源环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceEnv(String DatasourceEnv) {
        this.DatasourceEnv = DatasourceEnv;
    }

    /**
     * Get 计算资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputeResource 计算资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComputeResource() {
        return this.ComputeResource;
    }

    /**
     * Set 计算资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputeResource 计算资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputeResource(String ComputeResource) {
        this.ComputeResource = ComputeResource;
    }

    /**
     * Get 执行资源组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupId 执行资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 执行资源组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupId 执行资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 高级运行参数,变量替换，map-json String,String
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 高级运行参数,变量替换，map-json String,String
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 高级运行参数,变量替换，map-json String,String
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 高级运行参数,变量替换，map-json String,String
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get 高级设置，执行配置参数，map-json String,String. 采用Base64编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvanceConfig 高级设置，执行配置参数，map-json String,String. 采用Base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdvanceConfig() {
        return this.AdvanceConfig;
    }

    /**
     * Set 高级设置，执行配置参数，map-json String,String. 采用Base64编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvanceConfig 高级设置，执行配置参数，map-json String,String. 采用Base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvanceConfig(String AdvanceConfig) {
        this.AdvanceConfig = AdvanceConfig;
    }

    public SQLScriptConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SQLScriptConfig(SQLScriptConfig source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatasourceEnv != null) {
            this.DatasourceEnv = new String(source.DatasourceEnv);
        }
        if (source.ComputeResource != null) {
            this.ComputeResource = new String(source.ComputeResource);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.AdvanceConfig != null) {
            this.AdvanceConfig = new String(source.AdvanceConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceEnv", this.DatasourceEnv);
        this.setParamSimple(map, prefix + "ComputeResource", this.ComputeResource);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "AdvanceConfig", this.AdvanceConfig);

    }
}

