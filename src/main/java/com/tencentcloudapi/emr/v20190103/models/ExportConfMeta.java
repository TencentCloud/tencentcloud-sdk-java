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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportConfMeta extends AbstractModel {

    /**
    * <p>组件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>文件名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Classification")
    @Expose
    private String Classification;

    /**
    * <p>组件版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceVersion")
    @Expose
    private String ServiceVersion;

    /**
    * <p>导出配置参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
     * Get <p>组件名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName <p>组件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>组件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName <p>组件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>文件名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Classification <p>文件名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassification() {
        return this.Classification;
    }

    /**
     * Set <p>文件名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Classification <p>文件名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassification(String Classification) {
        this.Classification = Classification;
    }

    /**
     * Get <p>组件版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceVersion <p>组件版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceVersion() {
        return this.ServiceVersion;
    }

    /**
     * Set <p>组件版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceVersion <p>组件版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceVersion(String ServiceVersion) {
        this.ServiceVersion = ServiceVersion;
    }

    /**
     * Get <p>导出配置参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties <p>导出配置参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>导出配置参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties <p>导出配置参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    public ExportConfMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportConfMeta(ExportConfMeta source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Classification != null) {
            this.Classification = new String(source.Classification);
        }
        if (source.ServiceVersion != null) {
            this.ServiceVersion = new String(source.ServiceVersion);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Classification", this.Classification);
        this.setParamSimple(map, prefix + "ServiceVersion", this.ServiceVersion);
        this.setParamSimple(map, prefix + "Properties", this.Properties);

    }
}

