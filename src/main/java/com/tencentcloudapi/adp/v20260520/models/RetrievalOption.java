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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetrievalOption extends AbstractModel {

    /**
    * <p>时效性检索增强配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpirationAwareness")
    @Expose
    private ExpirationAwareness ExpirationAwareness;

    /**
    * <p>GraphRAG配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GraphRag")
    @Expose
    private GraphRAG GraphRag;

    /**
    * <p>表格增强配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableEnhancement")
    @Expose
    private TableEnhancement TableEnhancement;

    /**
     * Get <p>时效性检索增强配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpirationAwareness <p>时效性检索增强配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExpirationAwareness getExpirationAwareness() {
        return this.ExpirationAwareness;
    }

    /**
     * Set <p>时效性检索增强配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpirationAwareness <p>时效性检索增强配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpirationAwareness(ExpirationAwareness ExpirationAwareness) {
        this.ExpirationAwareness = ExpirationAwareness;
    }

    /**
     * Get <p>GraphRAG配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GraphRag <p>GraphRAG配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GraphRAG getGraphRag() {
        return this.GraphRag;
    }

    /**
     * Set <p>GraphRAG配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GraphRag <p>GraphRAG配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGraphRag(GraphRAG GraphRag) {
        this.GraphRag = GraphRag;
    }

    /**
     * Get <p>表格增强配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableEnhancement <p>表格增强配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableEnhancement getTableEnhancement() {
        return this.TableEnhancement;
    }

    /**
     * Set <p>表格增强配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableEnhancement <p>表格增强配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableEnhancement(TableEnhancement TableEnhancement) {
        this.TableEnhancement = TableEnhancement;
    }

    public RetrievalOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetrievalOption(RetrievalOption source) {
        if (source.ExpirationAwareness != null) {
            this.ExpirationAwareness = new ExpirationAwareness(source.ExpirationAwareness);
        }
        if (source.GraphRag != null) {
            this.GraphRag = new GraphRAG(source.GraphRag);
        }
        if (source.TableEnhancement != null) {
            this.TableEnhancement = new TableEnhancement(source.TableEnhancement);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ExpirationAwareness.", this.ExpirationAwareness);
        this.setParamObj(map, prefix + "GraphRag.", this.GraphRag);
        this.setParamObj(map, prefix + "TableEnhancement.", this.TableEnhancement);

    }
}

