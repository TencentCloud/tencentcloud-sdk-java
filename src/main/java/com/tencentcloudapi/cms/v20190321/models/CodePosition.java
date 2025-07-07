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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodePosition extends AbstractModel {

    /**
    * 二维码边界点X轴坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FloatX")
    @Expose
    private Float FloatX;

    /**
    * 二维码边界点Y轴坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FloatY")
    @Expose
    private Float FloatY;

    /**
     * Get 二维码边界点X轴坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FloatX 二维码边界点X轴坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFloatX() {
        return this.FloatX;
    }

    /**
     * Set 二维码边界点X轴坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param FloatX 二维码边界点X轴坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFloatX(Float FloatX) {
        this.FloatX = FloatX;
    }

    /**
     * Get 二维码边界点Y轴坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FloatY 二维码边界点Y轴坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFloatY() {
        return this.FloatY;
    }

    /**
     * Set 二维码边界点Y轴坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param FloatY 二维码边界点Y轴坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFloatY(Float FloatY) {
        this.FloatY = FloatY;
    }

    public CodePosition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodePosition(CodePosition source) {
        if (source.FloatX != null) {
            this.FloatX = new Float(source.FloatX);
        }
        if (source.FloatY != null) {
            this.FloatY = new Float(source.FloatY);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FloatX", this.FloatX);
        this.setParamSimple(map, prefix + "FloatY", this.FloatY);

    }
}

