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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndicatorCoord extends AbstractModel{

    /**
    * 指标横坐标值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoordX")
    @Expose
    private String CoordX;

    /**
    * 指标纵坐标值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoordY")
    @Expose
    private String CoordY;

    /**
    * 指标标签，用于标识附加信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoordTag")
    @Expose
    private String CoordTag;

    /**
     * Get 指标横坐标值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoordX 指标横坐标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoordX() {
        return this.CoordX;
    }

    /**
     * Set 指标横坐标值
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoordX 指标横坐标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoordX(String CoordX) {
        this.CoordX = CoordX;
    }

    /**
     * Get 指标纵坐标值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoordY 指标纵坐标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoordY() {
        return this.CoordY;
    }

    /**
     * Set 指标纵坐标值
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoordY 指标纵坐标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoordY(String CoordY) {
        this.CoordY = CoordY;
    }

    /**
     * Get 指标标签，用于标识附加信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoordTag 指标标签，用于标识附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoordTag() {
        return this.CoordTag;
    }

    /**
     * Set 指标标签，用于标识附加信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoordTag 指标标签，用于标识附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoordTag(String CoordTag) {
        this.CoordTag = CoordTag;
    }

    public IndicatorCoord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndicatorCoord(IndicatorCoord source) {
        if (source.CoordX != null) {
            this.CoordX = new String(source.CoordX);
        }
        if (source.CoordY != null) {
            this.CoordY = new String(source.CoordY);
        }
        if (source.CoordTag != null) {
            this.CoordTag = new String(source.CoordTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CoordX", this.CoordX);
        this.setParamSimple(map, prefix + "CoordY", this.CoordY);
        this.setParamSimple(map, prefix + "CoordTag", this.CoordTag);

    }
}

