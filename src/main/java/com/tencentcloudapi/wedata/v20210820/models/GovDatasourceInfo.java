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

public class GovDatasourceInfo extends AbstractModel {

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * 数据源集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceClusterId")
    @Expose
    private String DatasourceClusterId;

    /**
    * 数据源urn
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceUrn")
    @Expose
    private String DatasourceUrn;

    /**
    * 数据源环境
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceEnv")
    @Expose
    private String DatasourceEnv;

    /**
     * Get 数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    /**
     * Get 数据源集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceClusterId 数据源集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceClusterId() {
        return this.DatasourceClusterId;
    }

    /**
     * Set 数据源集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceClusterId 数据源集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceClusterId(String DatasourceClusterId) {
        this.DatasourceClusterId = DatasourceClusterId;
    }

    /**
     * Get 数据源urn
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceUrn 数据源urn
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceUrn() {
        return this.DatasourceUrn;
    }

    /**
     * Set 数据源urn
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceUrn 数据源urn
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceUrn(String DatasourceUrn) {
        this.DatasourceUrn = DatasourceUrn;
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

    public GovDatasourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovDatasourceInfo(GovDatasourceInfo source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatasourceClusterId != null) {
            this.DatasourceClusterId = new String(source.DatasourceClusterId);
        }
        if (source.DatasourceUrn != null) {
            this.DatasourceUrn = new String(source.DatasourceUrn);
        }
        if (source.DatasourceEnv != null) {
            this.DatasourceEnv = new String(source.DatasourceEnv);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatasourceClusterId", this.DatasourceClusterId);
        this.setParamSimple(map, prefix + "DatasourceUrn", this.DatasourceUrn);
        this.setParamSimple(map, prefix + "DatasourceEnv", this.DatasourceEnv);

    }
}

