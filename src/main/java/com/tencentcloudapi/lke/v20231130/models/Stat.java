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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Stat extends AbstractModel {

    /**
    * x轴时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("X")
    @Expose
    private String X;

    /**
    * y轴统计值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Y")
    @Expose
    private Float Y;

    /**
     * Get x轴时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return X x轴时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getX() {
        return this.X;
    }

    /**
     * Set x轴时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param X x轴时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setX(String X) {
        this.X = X;
    }

    /**
     * Get y轴统计值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Y y轴统计值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getY() {
        return this.Y;
    }

    /**
     * Set y轴统计值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Y y轴统计值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setY(Float Y) {
        this.Y = Y;
    }

    public Stat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Stat(Stat source) {
        if (source.X != null) {
            this.X = new String(source.X);
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

