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

public class L3Tag extends AbstractModel{

    /**
    * 三级标签名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 三级标签出现信息索引数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppearIndexPairSet")
    @Expose
    private AppearIndexPair [] AppearIndexPairSet;

    /**
    * 三级标签首次出现信息，可选值为[1,3]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstAppear")
    @Expose
    private Long FirstAppear;

    /**
     * Get 三级标签名 
     * @return Name 三级标签名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 三级标签名
     * @param Name 三级标签名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 三级标签出现信息索引数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppearIndexPairSet 三级标签出现信息索引数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppearIndexPair [] getAppearIndexPairSet() {
        return this.AppearIndexPairSet;
    }

    /**
     * Set 三级标签出现信息索引数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppearIndexPairSet 三级标签出现信息索引数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppearIndexPairSet(AppearIndexPair [] AppearIndexPairSet) {
        this.AppearIndexPairSet = AppearIndexPairSet;
    }

    /**
     * Get 三级标签首次出现信息，可选值为[1,3]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstAppear 三级标签首次出现信息，可选值为[1,3]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirstAppear() {
        return this.FirstAppear;
    }

    /**
     * Set 三级标签首次出现信息，可选值为[1,3]
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstAppear 三级标签首次出现信息，可选值为[1,3]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstAppear(Long FirstAppear) {
        this.FirstAppear = FirstAppear;
    }

    public L3Tag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L3Tag(L3Tag source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AppearIndexPairSet != null) {
            this.AppearIndexPairSet = new AppearIndexPair[source.AppearIndexPairSet.length];
            for (int i = 0; i < source.AppearIndexPairSet.length; i++) {
                this.AppearIndexPairSet[i] = new AppearIndexPair(source.AppearIndexPairSet[i]);
            }
        }
        if (source.FirstAppear != null) {
            this.FirstAppear = new Long(source.FirstAppear);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "AppearIndexPairSet.", this.AppearIndexPairSet);
        this.setParamSimple(map, prefix + "FirstAppear", this.FirstAppear);

    }
}

