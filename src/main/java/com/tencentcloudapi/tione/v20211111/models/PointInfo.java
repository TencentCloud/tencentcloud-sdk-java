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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PointInfo extends AbstractModel{

    /**
    * X坐标值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("X")
    @Expose
    private Float X;

    /**
    * Y坐标值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Y")
    @Expose
    private Float Y;

    /**
     * Get X坐标值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return X X坐标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getX() {
        return this.X;
    }

    /**
     * Set X坐标值
注意：此字段可能返回 null，表示取不到有效值。
     * @param X X坐标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setX(Float X) {
        this.X = X;
    }

    /**
     * Get Y坐标值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Y Y坐标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getY() {
        return this.Y;
    }

    /**
     * Set Y坐标值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Y Y坐标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setY(Float Y) {
        this.Y = Y;
    }

    public PointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PointInfo(PointInfo source) {
        if (source.X != null) {
            this.X = new Float(source.X);
        }
        if (source.Y != null) {
            this.Y = new Float(source.Y);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);

    }
}

