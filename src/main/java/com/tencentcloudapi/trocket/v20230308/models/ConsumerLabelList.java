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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerLabelList extends AbstractModel {

    /**
    * <p>消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>标签数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private ConsumerLabelItem [] Labels;

    /**
     * Get <p>消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Group <p>消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Group <p>消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>标签数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount <p>标签数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>标签数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount <p>标签数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumerLabelItem [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(ConsumerLabelItem [] Labels) {
        this.Labels = Labels;
    }

    public ConsumerLabelList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerLabelList(ConsumerLabelList source) {
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Labels != null) {
            this.Labels = new ConsumerLabelItem[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new ConsumerLabelItem(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

