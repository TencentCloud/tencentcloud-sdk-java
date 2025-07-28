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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rules extends AbstractModel {

    /**
    * 判断条件id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 判断条件配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private RuleConditionItem [] Conditions;

    /**
    * 条件列表的链接符号，取值如下：

- &&：逻辑与
- ||：逻辑或
    */
    @SerializedName("Linker")
    @Expose
    private String Linker;

    /**
    * 满足判断条件执行节点索引；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RearDriveIndexs")
    @Expose
    private Long [] RearDriveIndexs;

    /**
     * Get 判断条件id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 判断条件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 判断条件id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 判断条件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 判断条件配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conditions 判断条件配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleConditionItem [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 判断条件配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions 判断条件配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(RuleConditionItem [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 条件列表的链接符号，取值如下：

- &&：逻辑与
- ||：逻辑或 
     * @return Linker 条件列表的链接符号，取值如下：

- &&：逻辑与
- ||：逻辑或
     */
    public String getLinker() {
        return this.Linker;
    }

    /**
     * Set 条件列表的链接符号，取值如下：

- &&：逻辑与
- ||：逻辑或
     * @param Linker 条件列表的链接符号，取值如下：

- &&：逻辑与
- ||：逻辑或
     */
    public void setLinker(String Linker) {
        this.Linker = Linker;
    }

    /**
     * Get 满足判断条件执行节点索引；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RearDriveIndexs 满足判断条件执行节点索引；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRearDriveIndexs() {
        return this.RearDriveIndexs;
    }

    /**
     * Set 满足判断条件执行节点索引；
注意：此字段可能返回 null，表示取不到有效值。
     * @param RearDriveIndexs 满足判断条件执行节点索引；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRearDriveIndexs(Long [] RearDriveIndexs) {
        this.RearDriveIndexs = RearDriveIndexs;
    }

    public Rules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rules(Rules source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Conditions != null) {
            this.Conditions = new RuleConditionItem[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new RuleConditionItem(source.Conditions[i]);
            }
        }
        if (source.Linker != null) {
            this.Linker = new String(source.Linker);
        }
        if (source.RearDriveIndexs != null) {
            this.RearDriveIndexs = new Long[source.RearDriveIndexs.length];
            for (int i = 0; i < source.RearDriveIndexs.length; i++) {
                this.RearDriveIndexs[i] = new Long(source.RearDriveIndexs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Linker", this.Linker);
        this.setParamArraySimple(map, prefix + "RearDriveIndexs.", this.RearDriveIndexs);

    }
}

