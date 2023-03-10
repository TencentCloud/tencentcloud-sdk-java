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

public class RecGoodsData extends AbstractModel{

    /**
    * 推荐返回的商品ID
    */
    @SerializedName("GoodsId")
    @Expose
    private String GoodsId;

    /**
    * 推荐结果分，取值范围[0,1000000]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 推荐追踪id，本次推荐内容产生的后续行为上报均要用该GoodsTraceId上报。每次接口调用返回的GoodsTraceId不同
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsTraceId")
    @Expose
    private String GoodsTraceId;

    /**
    * 商品所在位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
     * Get 推荐返回的商品ID 
     * @return GoodsId 推荐返回的商品ID
     */
    public String getGoodsId() {
        return this.GoodsId;
    }

    /**
     * Set 推荐返回的商品ID
     * @param GoodsId 推荐返回的商品ID
     */
    public void setGoodsId(String GoodsId) {
        this.GoodsId = GoodsId;
    }

    /**
     * Get 推荐结果分，取值范围[0,1000000]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 推荐结果分，取值范围[0,1000000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 推荐结果分，取值范围[0,1000000]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 推荐结果分，取值范围[0,1000000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 推荐追踪id，本次推荐内容产生的后续行为上报均要用该GoodsTraceId上报。每次接口调用返回的GoodsTraceId不同
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GoodsTraceId 推荐追踪id，本次推荐内容产生的后续行为上报均要用该GoodsTraceId上报。每次接口调用返回的GoodsTraceId不同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGoodsTraceId() {
        return this.GoodsTraceId;
    }

    /**
     * Set 推荐追踪id，本次推荐内容产生的后续行为上报均要用该GoodsTraceId上报。每次接口调用返回的GoodsTraceId不同
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsTraceId 推荐追踪id，本次推荐内容产生的后续行为上报均要用该GoodsTraceId上报。每次接口调用返回的GoodsTraceId不同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsTraceId(String GoodsTraceId) {
        this.GoodsTraceId = GoodsTraceId;
    }

    /**
     * Get 商品所在位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 商品所在位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 商品所在位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 商品所在位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    public RecGoodsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecGoodsData(RecGoodsData source) {
        if (source.GoodsId != null) {
            this.GoodsId = new String(source.GoodsId);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.GoodsTraceId != null) {
            this.GoodsTraceId = new String(source.GoodsTraceId);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsId", this.GoodsId);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "GoodsTraceId", this.GoodsTraceId);
        this.setParamSimple(map, prefix + "Position", this.Position);

    }
}

