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
package com.tencentcloudapi.irp.v20220324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecItemData extends AbstractModel{

    /**
    * 推荐的内容id，即用户行为上报中的itemId
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 物料子类型，包括如下： 1-图文、2-长视频（横视频）、3-短视频（横视频）、4-小说、5-小视频（竖视频）、6-纯文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemType")
    @Expose
    private Long ItemType;

    /**
    * 推荐内容的权重，取值范围[0,1000000]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 推荐预测分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 关键词，多个用英文分号分割，和物料上传的keyword一致
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 推荐的内容id，即用户行为上报中的itemId 
     * @return ItemId 推荐的内容id，即用户行为上报中的itemId
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 推荐的内容id，即用户行为上报中的itemId
     * @param ItemId 推荐的内容id，即用户行为上报中的itemId
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 物料子类型，包括如下： 1-图文、2-长视频（横视频）、3-短视频（横视频）、4-小说、5-小视频（竖视频）、6-纯文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemType 物料子类型，包括如下： 1-图文、2-长视频（横视频）、3-短视频（横视频）、4-小说、5-小视频（竖视频）、6-纯文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getItemType() {
        return this.ItemType;
    }

    /**
     * Set 物料子类型，包括如下： 1-图文、2-长视频（横视频）、3-短视频（横视频）、4-小说、5-小视频（竖视频）、6-纯文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemType 物料子类型，包括如下： 1-图文、2-长视频（横视频）、3-短视频（横视频）、4-小说、5-小视频（竖视频）、6-纯文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemType(Long ItemType) {
        this.ItemType = ItemType;
    }

    /**
     * Get 推荐内容的权重，取值范围[0,1000000]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 推荐内容的权重，取值范围[0,1000000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 推荐内容的权重，取值范围[0,1000000]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 推荐内容的权重，取值范围[0,1000000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 推荐预测分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 推荐预测分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 推荐预测分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 推荐预测分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 关键词，多个用英文分号分割，和物料上传的keyword一致
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keyword 关键词，多个用英文分号分割，和物料上传的keyword一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键词，多个用英文分号分割，和物料上传的keyword一致
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keyword 关键词，多个用英文分号分割，和物料上传的keyword一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public RecItemData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecItemData(RecItemData source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.ItemType != null) {
            this.ItemType = new Long(source.ItemType);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemType", this.ItemType);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

