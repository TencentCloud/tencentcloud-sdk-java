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

public class FileOutputConf extends AbstractModel {

    /**
    * 单元格 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CellId")
    @Expose
    private String CellId;

    /**
    * Dashboard 图表配置，JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DashboardConf")
    @Expose
    private String DashboardConf;

    /**
    * 执行结果文件的预签名下载链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
     * Get 单元格 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CellId 单元格 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCellId() {
        return this.CellId;
    }

    /**
     * Set 单元格 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CellId 单元格 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCellId(String CellId) {
        this.CellId = CellId;
    }

    /**
     * Get Dashboard 图表配置，JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DashboardConf Dashboard 图表配置，JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDashboardConf() {
        return this.DashboardConf;
    }

    /**
     * Set Dashboard 图表配置，JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param DashboardConf Dashboard 图表配置，JSON 字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDashboardConf(String DashboardConf) {
        this.DashboardConf = DashboardConf;
    }

    /**
     * Get 执行结果文件的预签名下载链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputPath 执行结果文件的预签名下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set 执行结果文件的预签名下载链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputPath 执行结果文件的预签名下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    public FileOutputConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileOutputConf(FileOutputConf source) {
        if (source.CellId != null) {
            this.CellId = new String(source.CellId);
        }
        if (source.DashboardConf != null) {
            this.DashboardConf = new String(source.DashboardConf);
        }
        if (source.OutputPath != null) {
            this.OutputPath = new String(source.OutputPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CellId", this.CellId);
        this.setParamSimple(map, prefix + "DashboardConf", this.DashboardConf);
        this.setParamSimple(map, prefix + "OutputPath", this.OutputPath);

    }
}

