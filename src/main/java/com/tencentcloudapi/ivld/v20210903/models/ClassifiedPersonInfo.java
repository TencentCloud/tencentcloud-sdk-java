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

public class ClassifiedPersonInfo extends AbstractModel{

    /**
    * 人物分类名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassifyName")
    @Expose
    private String ClassifyName;

    /**
    * 符合特定分类的人物信息数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersonInfoSet")
    @Expose
    private PersonInfo [] PersonInfoSet;

    /**
     * Get 人物分类名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassifyName 人物分类名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassifyName() {
        return this.ClassifyName;
    }

    /**
     * Set 人物分类名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassifyName 人物分类名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassifyName(String ClassifyName) {
        this.ClassifyName = ClassifyName;
    }

    /**
     * Get 符合特定分类的人物信息数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersonInfoSet 符合特定分类的人物信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PersonInfo [] getPersonInfoSet() {
        return this.PersonInfoSet;
    }

    /**
     * Set 符合特定分类的人物信息数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersonInfoSet 符合特定分类的人物信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonInfoSet(PersonInfo [] PersonInfoSet) {
        this.PersonInfoSet = PersonInfoSet;
    }

    public ClassifiedPersonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassifiedPersonInfo(ClassifiedPersonInfo source) {
        if (source.ClassifyName != null) {
            this.ClassifyName = new String(source.ClassifyName);
        }
        if (source.PersonInfoSet != null) {
            this.PersonInfoSet = new PersonInfo[source.PersonInfoSet.length];
            for (int i = 0; i < source.PersonInfoSet.length; i++) {
                this.PersonInfoSet[i] = new PersonInfo(source.PersonInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClassifyName", this.ClassifyName);
        this.setParamArrayObj(map, prefix + "PersonInfoSet.", this.PersonInfoSet);

    }
}

