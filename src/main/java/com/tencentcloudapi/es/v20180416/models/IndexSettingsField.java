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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexSettingsField extends AbstractModel {

    /**
    * <p>索引主分片数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumberOfShards")
    @Expose
    private String NumberOfShards;

    /**
    * <p>索引副本分片数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumberOfReplicas")
    @Expose
    private String NumberOfReplicas;

    /**
    * <p>索引刷新频率</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefreshInterval")
    @Expose
    private String RefreshInterval;

    /**
    * <p>动态字段识别开关</p>
    */
    @SerializedName("Dynamic")
    @Expose
    private String Dynamic;

    /**
    * <p>索引字段数上限</p>
    */
    @SerializedName("TotalFieldsLimit")
    @Expose
    private String TotalFieldsLimit;

    /**
     * Get <p>索引主分片数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumberOfShards <p>索引主分片数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumberOfShards() {
        return this.NumberOfShards;
    }

    /**
     * Set <p>索引主分片数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumberOfShards <p>索引主分片数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumberOfShards(String NumberOfShards) {
        this.NumberOfShards = NumberOfShards;
    }

    /**
     * Get <p>索引副本分片数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumberOfReplicas <p>索引副本分片数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumberOfReplicas() {
        return this.NumberOfReplicas;
    }

    /**
     * Set <p>索引副本分片数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumberOfReplicas <p>索引副本分片数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumberOfReplicas(String NumberOfReplicas) {
        this.NumberOfReplicas = NumberOfReplicas;
    }

    /**
     * Get <p>索引刷新频率</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefreshInterval <p>索引刷新频率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefreshInterval() {
        return this.RefreshInterval;
    }

    /**
     * Set <p>索引刷新频率</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefreshInterval <p>索引刷新频率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefreshInterval(String RefreshInterval) {
        this.RefreshInterval = RefreshInterval;
    }

    /**
     * Get <p>动态字段识别开关</p> 
     * @return Dynamic <p>动态字段识别开关</p>
     */
    public String getDynamic() {
        return this.Dynamic;
    }

    /**
     * Set <p>动态字段识别开关</p>
     * @param Dynamic <p>动态字段识别开关</p>
     */
    public void setDynamic(String Dynamic) {
        this.Dynamic = Dynamic;
    }

    /**
     * Get <p>索引字段数上限</p> 
     * @return TotalFieldsLimit <p>索引字段数上限</p>
     */
    public String getTotalFieldsLimit() {
        return this.TotalFieldsLimit;
    }

    /**
     * Set <p>索引字段数上限</p>
     * @param TotalFieldsLimit <p>索引字段数上限</p>
     */
    public void setTotalFieldsLimit(String TotalFieldsLimit) {
        this.TotalFieldsLimit = TotalFieldsLimit;
    }

    public IndexSettingsField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexSettingsField(IndexSettingsField source) {
        if (source.NumberOfShards != null) {
            this.NumberOfShards = new String(source.NumberOfShards);
        }
        if (source.NumberOfReplicas != null) {
            this.NumberOfReplicas = new String(source.NumberOfReplicas);
        }
        if (source.RefreshInterval != null) {
            this.RefreshInterval = new String(source.RefreshInterval);
        }
        if (source.Dynamic != null) {
            this.Dynamic = new String(source.Dynamic);
        }
        if (source.TotalFieldsLimit != null) {
            this.TotalFieldsLimit = new String(source.TotalFieldsLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NumberOfShards", this.NumberOfShards);
        this.setParamSimple(map, prefix + "NumberOfReplicas", this.NumberOfReplicas);
        this.setParamSimple(map, prefix + "RefreshInterval", this.RefreshInterval);
        this.setParamSimple(map, prefix + "Dynamic", this.Dynamic);
        this.setParamSimple(map, prefix + "TotalFieldsLimit", this.TotalFieldsLimit);

    }
}

