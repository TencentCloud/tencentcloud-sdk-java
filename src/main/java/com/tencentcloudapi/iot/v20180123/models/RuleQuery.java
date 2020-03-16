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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleQuery extends AbstractModel{

    /**
    * 字段
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 过滤规则
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 产品Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
     * Get 字段 
     * @return Field 字段
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 字段
     * @param Field 字段
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 过滤规则 
     * @return Condition 过滤规则
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 过滤规则
     * @param Condition 过滤规则
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic Topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic Topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 产品Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId 产品Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 产品Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);

    }
}

