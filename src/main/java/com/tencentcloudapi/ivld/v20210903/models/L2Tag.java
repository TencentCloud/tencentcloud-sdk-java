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

public class L2Tag extends AbstractModel{

    /**
    * 二级标签名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 从属于此二级标签的三级标签数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("L3TagSet")
    @Expose
    private L3Tag [] L3TagSet;

    /**
    * 二级标签出现信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppearIndexPairSet")
    @Expose
    private AppearIndexPair [] AppearIndexPairSet;

    /**
    * 二级标签首次出现信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstAppear")
    @Expose
    private Long FirstAppear;

    /**
     * Get 二级标签名 
     * @return Name 二级标签名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 二级标签名
     * @param Name 二级标签名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 从属于此二级标签的三级标签数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return L3TagSet 从属于此二级标签的三级标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public L3Tag [] getL3TagSet() {
        return this.L3TagSet;
    }

    /**
     * Set 从属于此二级标签的三级标签数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param L3TagSet 从属于此二级标签的三级标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setL3TagSet(L3Tag [] L3TagSet) {
        this.L3TagSet = L3TagSet;
    }

    /**
     * Get 二级标签出现信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppearIndexPairSet 二级标签出现信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppearIndexPair [] getAppearIndexPairSet() {
        return this.AppearIndexPairSet;
    }

    /**
     * Set 二级标签出现信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppearIndexPairSet 二级标签出现信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppearIndexPairSet(AppearIndexPair [] AppearIndexPairSet) {
        this.AppearIndexPairSet = AppearIndexPairSet;
    }

    /**
     * Get 二级标签首次出现信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstAppear 二级标签首次出现信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirstAppear() {
        return this.FirstAppear;
    }

    /**
     * Set 二级标签首次出现信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstAppear 二级标签首次出现信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstAppear(Long FirstAppear) {
        this.FirstAppear = FirstAppear;
    }

    public L2Tag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L2Tag(L2Tag source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.L3TagSet != null) {
            this.L3TagSet = new L3Tag[source.L3TagSet.length];
            for (int i = 0; i < source.L3TagSet.length; i++) {
                this.L3TagSet[i] = new L3Tag(source.L3TagSet[i]);
            }
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
        this.setParamArrayObj(map, prefix + "L3TagSet.", this.L3TagSet);
        this.setParamArrayObj(map, prefix + "AppearIndexPairSet.", this.AppearIndexPairSet);
        this.setParamSimple(map, prefix + "FirstAppear", this.FirstAppear);

    }
}

