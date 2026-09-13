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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileConfig extends AbstractModel {

    /**
    * <p>高级运行参数，变量替换用，map-json String,String</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * <p>执行资源 ID。来源：ListComputeResources 接口返回的 ResourceId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>默认 catalog</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultCatalog")
    @Expose
    private String DefaultCatalog;

    /**
    * <p>默认 schema</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultSchema")
    @Expose
    private String DefaultSchema;

    /**
    * <p>高级配置，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvanceConfig")
    @Expose
    private String AdvanceConfig;

    /**
    * <p>扩展参数，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraParams")
    @Expose
    private String ExtraParams;

    /**
    * <p>Notebook 交互控件定义，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Widgets")
    @Expose
    private String Widgets;

    /**
    * <p>各单元格输出配置。仅 Get 出参返回，入参忽略</p>
    */
    @SerializedName("OutputConf")
    @Expose
    private FileOutputConf [] OutputConf;

    /**
    * <p>SQL脚本语法标记</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlSyntax")
    @Expose
    private String SqlSyntax;

    /**
    * <p>平台集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get <p>高级运行参数，变量替换用，map-json String,String</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params <p>高级运行参数，变量替换用，map-json String,String</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set <p>高级运行参数，变量替换用，map-json String,String</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params <p>高级运行参数，变量替换用，map-json String,String</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get <p>执行资源 ID。来源：ListComputeResources 接口返回的 ResourceId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId <p>执行资源 ID。来源：ListComputeResources 接口返回的 ResourceId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>执行资源 ID。来源：ListComputeResources 接口返回的 ResourceId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId <p>执行资源 ID。来源：ListComputeResources 接口返回的 ResourceId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>默认 catalog</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultCatalog <p>默认 catalog</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultCatalog() {
        return this.DefaultCatalog;
    }

    /**
     * Set <p>默认 catalog</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultCatalog <p>默认 catalog</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultCatalog(String DefaultCatalog) {
        this.DefaultCatalog = DefaultCatalog;
    }

    /**
     * Get <p>默认 schema</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultSchema <p>默认 schema</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultSchema() {
        return this.DefaultSchema;
    }

    /**
     * Set <p>默认 schema</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultSchema <p>默认 schema</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultSchema(String DefaultSchema) {
        this.DefaultSchema = DefaultSchema;
    }

    /**
     * Get <p>高级配置，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvanceConfig <p>高级配置，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdvanceConfig() {
        return this.AdvanceConfig;
    }

    /**
     * Set <p>高级配置，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvanceConfig <p>高级配置，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvanceConfig(String AdvanceConfig) {
        this.AdvanceConfig = AdvanceConfig;
    }

    /**
     * Get <p>扩展参数，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraParams <p>扩展参数，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraParams() {
        return this.ExtraParams;
    }

    /**
     * Set <p>扩展参数，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraParams <p>扩展参数，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraParams(String ExtraParams) {
        this.ExtraParams = ExtraParams;
    }

    /**
     * Get <p>Notebook 交互控件定义，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Widgets <p>Notebook 交互控件定义，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWidgets() {
        return this.Widgets;
    }

    /**
     * Set <p>Notebook 交互控件定义，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Widgets <p>Notebook 交互控件定义，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidgets(String Widgets) {
        this.Widgets = Widgets;
    }

    /**
     * Get <p>各单元格输出配置。仅 Get 出参返回，入参忽略</p> 
     * @return OutputConf <p>各单元格输出配置。仅 Get 出参返回，入参忽略</p>
     */
    public FileOutputConf [] getOutputConf() {
        return this.OutputConf;
    }

    /**
     * Set <p>各单元格输出配置。仅 Get 出参返回，入参忽略</p>
     * @param OutputConf <p>各单元格输出配置。仅 Get 出参返回，入参忽略</p>
     */
    public void setOutputConf(FileOutputConf [] OutputConf) {
        this.OutputConf = OutputConf;
    }

    /**
     * Get <p>SQL脚本语法标记</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlSyntax <p>SQL脚本语法标记</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlSyntax() {
        return this.SqlSyntax;
    }

    /**
     * Set <p>SQL脚本语法标记</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlSyntax <p>SQL脚本语法标记</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlSyntax(String SqlSyntax) {
        this.SqlSyntax = SqlSyntax;
    }

    /**
     * Get <p>平台集群id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>平台集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>平台集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>平台集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public FileConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileConfig(FileConfig source) {
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.DefaultCatalog != null) {
            this.DefaultCatalog = new String(source.DefaultCatalog);
        }
        if (source.DefaultSchema != null) {
            this.DefaultSchema = new String(source.DefaultSchema);
        }
        if (source.AdvanceConfig != null) {
            this.AdvanceConfig = new String(source.AdvanceConfig);
        }
        if (source.ExtraParams != null) {
            this.ExtraParams = new String(source.ExtraParams);
        }
        if (source.Widgets != null) {
            this.Widgets = new String(source.Widgets);
        }
        if (source.OutputConf != null) {
            this.OutputConf = new FileOutputConf[source.OutputConf.length];
            for (int i = 0; i < source.OutputConf.length; i++) {
                this.OutputConf[i] = new FileOutputConf(source.OutputConf[i]);
            }
        }
        if (source.SqlSyntax != null) {
            this.SqlSyntax = new String(source.SqlSyntax);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "DefaultCatalog", this.DefaultCatalog);
        this.setParamSimple(map, prefix + "DefaultSchema", this.DefaultSchema);
        this.setParamSimple(map, prefix + "AdvanceConfig", this.AdvanceConfig);
        this.setParamSimple(map, prefix + "ExtraParams", this.ExtraParams);
        this.setParamSimple(map, prefix + "Widgets", this.Widgets);
        this.setParamArrayObj(map, prefix + "OutputConf.", this.OutputConf);
        this.setParamSimple(map, prefix + "SqlSyntax", this.SqlSyntax);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

