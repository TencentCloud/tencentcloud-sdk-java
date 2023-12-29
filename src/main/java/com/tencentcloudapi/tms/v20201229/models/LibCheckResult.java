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

public class LibCheckResult extends AbstractModel {

    /**
    * 库ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * 库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * 库类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibType")
    @Expose
    private Long LibType;

    /**
    * 命中的关键词
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 命中的关键词在送审文本的位置，可能存在多个位置，每个位置显示开始位置和结束位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Positions")
    @Expose
    private Positions [] Positions;

    /**
     * Get 库ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibId 库ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set 库ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibId 库ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get 库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibName 库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set 库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibName 库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get 库类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibType 库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLibType() {
        return this.LibType;
    }

    /**
     * Set 库类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibType 库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibType(Long LibType) {
        this.LibType = LibType;
    }

    /**
     * Get 命中的关键词
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keyword 命中的关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 命中的关键词
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keyword 命中的关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 命中的关键词在送审文本的位置，可能存在多个位置，每个位置显示开始位置和结束位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Positions 命中的关键词在送审文本的位置，可能存在多个位置，每个位置显示开始位置和结束位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Positions [] getPositions() {
        return this.Positions;
    }

    /**
     * Set 命中的关键词在送审文本的位置，可能存在多个位置，每个位置显示开始位置和结束位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Positions 命中的关键词在送审文本的位置，可能存在多个位置，每个位置显示开始位置和结束位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPositions(Positions [] Positions) {
        this.Positions = Positions;
    }

    public LibCheckResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibCheckResult(LibCheckResult source) {
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.LibType != null) {
            this.LibType = new Long(source.LibType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
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
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamSimple(map, prefix + "LibType", this.LibType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArrayObj(map, prefix + "Positions.", this.Positions);

    }
}

