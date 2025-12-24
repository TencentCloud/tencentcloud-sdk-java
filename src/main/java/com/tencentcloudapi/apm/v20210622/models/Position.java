/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Position extends AbstractModel {

    /**
    * 节点位置横坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("X")
    @Expose
    private Float X;

    /**
    * 节点位置纵坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Y")
    @Expose
    private Float Y;

    /**
     * Get 节点位置横坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return X 节点位置横坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getX() {
        return this.X;
    }

    /**
     * Set 节点位置横坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param X 节点位置横坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setX(Float X) {
        this.X = X;
    }

    /**
     * Get 节点位置纵坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Y 节点位置纵坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getY() {
        return this.Y;
    }

    /**
     * Set 节点位置纵坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Y 节点位置纵坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setY(Float Y) {
        this.Y = Y;
    }

    public Position() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Position(Position source) {
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

