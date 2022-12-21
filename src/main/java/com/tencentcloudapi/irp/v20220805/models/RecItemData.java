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
package com.tencentcloudapi.irp.v20220805.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecItemData extends AbstractModel{

    /**
    * 推荐的内容ID
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 内容类型，同内容上报类型一致
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemType")
    @Expose
    private String ItemType;

    /**
    * 推荐追踪id，本次推荐内容产生的后续行为上报均要用该ItemTraceId上报。每次接口调用返回的ItemTraceId不同
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemTraceId")
    @Expose
    private String ItemTraceId;

    /**
    * 推荐预测分，分值越高被推荐的理由越充分，取值范围[0,1000000]，用于做二次排序的参考
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
     * Get 推荐的内容ID 
     * @return ItemId 推荐的内容ID
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 推荐的内容ID
     * @param ItemId 推荐的内容ID
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 内容类型，同内容上报类型一致
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemType 内容类型，同内容上报类型一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItemType() {
        return this.ItemType;
    }

    /**
     * Set 内容类型，同内容上报类型一致
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemType 内容类型，同内容上报类型一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    /**
     * Get 推荐追踪id，本次推荐内容产生的后续行为上报均要用该ItemTraceId上报。每次接口调用返回的ItemTraceId不同
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemTraceId 推荐追踪id，本次推荐内容产生的后续行为上报均要用该ItemTraceId上报。每次接口调用返回的ItemTraceId不同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItemTraceId() {
        return this.ItemTraceId;
    }

    /**
     * Set 推荐追踪id，本次推荐内容产生的后续行为上报均要用该ItemTraceId上报。每次接口调用返回的ItemTraceId不同
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemTraceId 推荐追踪id，本次推荐内容产生的后续行为上报均要用该ItemTraceId上报。每次接口调用返回的ItemTraceId不同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemTraceId(String ItemTraceId) {
        this.ItemTraceId = ItemTraceId;
    }

    /**
     * Get 推荐预测分，分值越高被推荐的理由越充分，取值范围[0,1000000]，用于做二次排序的参考
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 推荐预测分，分值越高被推荐的理由越充分，取值范围[0,1000000]，用于做二次排序的参考
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 推荐预测分，分值越高被推荐的理由越充分，取值范围[0,1000000]，用于做二次排序的参考
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 推荐预测分，分值越高被推荐的理由越充分，取值范围[0,1000000]，用于做二次排序的参考
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Float Score) {
        this.Score = Score;
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
            this.ItemType = new String(source.ItemType);
        }
        if (source.ItemTraceId != null) {
            this.ItemTraceId = new String(source.ItemTraceId);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemType", this.ItemType);
        this.setParamSimple(map, prefix + "ItemTraceId", this.ItemTraceId);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

