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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexSettingsField extends AbstractModel{

    /**
    * 索引主分片数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumberOfShards")
    @Expose
    private String NumberOfShards;

    /**
    * 索引副本分片数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumberOfReplicas")
    @Expose
    private String NumberOfReplicas;

    /**
    * 索引刷新频率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefreshInterval")
    @Expose
    private String RefreshInterval;

    /**
     * Get 索引主分片数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumberOfShards 索引主分片数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumberOfShards() {
        return this.NumberOfShards;
    }

    /**
     * Set 索引主分片数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumberOfShards 索引主分片数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumberOfShards(String NumberOfShards) {
        this.NumberOfShards = NumberOfShards;
    }

    /**
     * Get 索引副本分片数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumberOfReplicas 索引副本分片数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumberOfReplicas() {
        return this.NumberOfReplicas;
    }

    /**
     * Set 索引副本分片数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumberOfReplicas 索引副本分片数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumberOfReplicas(String NumberOfReplicas) {
        this.NumberOfReplicas = NumberOfReplicas;
    }

    /**
     * Get 索引刷新频率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefreshInterval 索引刷新频率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefreshInterval() {
        return this.RefreshInterval;
    }

    /**
     * Set 索引刷新频率
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefreshInterval 索引刷新频率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefreshInterval(String RefreshInterval) {
        this.RefreshInterval = RefreshInterval;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NumberOfShards", this.NumberOfShards);
        this.setParamSimple(map, prefix + "NumberOfReplicas", this.NumberOfReplicas);
        this.setParamSimple(map, prefix + "RefreshInterval", this.RefreshInterval);

    }
}

