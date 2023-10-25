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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HitInfo extends AbstractModel {

    /**
    * 标识模型命中还是关键词命中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 命中关键词
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 自定义词库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * 位置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Positions")
    @Expose
    private Positions [] Positions;

    /**
     * Get 标识模型命中还是关键词命中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 标识模型命中还是关键词命中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 标识模型命中还是关键词命中
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 标识模型命中还是关键词命中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 命中关键词
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keyword 命中关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 命中关键词
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keyword 命中关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 自定义词库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibName 自定义词库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set 自定义词库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibName 自定义词库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get 位置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Positions 位置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Positions [] getPositions() {
        return this.Positions;
    }

    /**
     * Set 位置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Positions 位置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPositions(Positions [] Positions) {
        this.Positions = Positions;
    }

    public HitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HitInfo(HitInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.Positions != null) {
            this.Positions = new Positions[source.Positions.length];
            for (int i = 0; i < source.Positions.length; i++) {
                this.Positions[i] = new Positions(source.Positions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamArrayObj(map, prefix + "Positions.", this.Positions);

    }
}

