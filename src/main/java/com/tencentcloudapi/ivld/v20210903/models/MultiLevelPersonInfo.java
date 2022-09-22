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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiLevelPersonInfo extends AbstractModel{

    /**
    * 一级分类名称(分类信息参见自定义人物类型)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("L1ClassifyName")
    @Expose
    private String L1ClassifyName;

    /**
    * 已分类人物信息数组(所有分类类型为二级分类)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("L2ClassifiedPersonInfoSet")
    @Expose
    private ClassifiedPersonInfo [] L2ClassifiedPersonInfoSet;

    /**
    * 检测结果来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
     * Get 一级分类名称(分类信息参见自定义人物类型)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return L1ClassifyName 一级分类名称(分类信息参见自定义人物类型)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getL1ClassifyName() {
        return this.L1ClassifyName;
    }

    /**
     * Set 一级分类名称(分类信息参见自定义人物类型)
注意：此字段可能返回 null，表示取不到有效值。
     * @param L1ClassifyName 一级分类名称(分类信息参见自定义人物类型)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setL1ClassifyName(String L1ClassifyName) {
        this.L1ClassifyName = L1ClassifyName;
    }

    /**
     * Get 已分类人物信息数组(所有分类类型为二级分类)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return L2ClassifiedPersonInfoSet 已分类人物信息数组(所有分类类型为二级分类)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClassifiedPersonInfo [] getL2ClassifiedPersonInfoSet() {
        return this.L2ClassifiedPersonInfoSet;
    }

    /**
     * Set 已分类人物信息数组(所有分类类型为二级分类)
注意：此字段可能返回 null，表示取不到有效值。
     * @param L2ClassifiedPersonInfoSet 已分类人物信息数组(所有分类类型为二级分类)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setL2ClassifiedPersonInfoSet(ClassifiedPersonInfo [] L2ClassifiedPersonInfoSet) {
        this.L2ClassifiedPersonInfoSet = L2ClassifiedPersonInfoSet;
    }

    /**
     * Get 检测结果来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 检测结果来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 检测结果来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 检测结果来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    public MultiLevelPersonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiLevelPersonInfo(MultiLevelPersonInfo source) {
        if (source.L1ClassifyName != null) {
            this.L1ClassifyName = new String(source.L1ClassifyName);
        }
        if (source.L2ClassifiedPersonInfoSet != null) {
            this.L2ClassifiedPersonInfoSet = new ClassifiedPersonInfo[source.L2ClassifiedPersonInfoSet.length];
            for (int i = 0; i < source.L2ClassifiedPersonInfoSet.length; i++) {
                this.L2ClassifiedPersonInfoSet[i] = new ClassifiedPersonInfo(source.L2ClassifiedPersonInfoSet[i]);
            }
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "L1ClassifyName", this.L1ClassifyName);
        this.setParamArrayObj(map, prefix + "L2ClassifiedPersonInfoSet.", this.L2ClassifiedPersonInfoSet);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

