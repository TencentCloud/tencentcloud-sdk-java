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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceHairAttributesInfo extends AbstractModel {

    /**
    * 取值范围：0：光头，1：短发，2：中发，3：长发，4：绑发。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * 取值范围：0：有刘海，1：无刘海。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bang")
    @Expose
    private Long Bang;

    /**
    * 取值范围：0：黑色，1：金色，2：棕色，3：灰白色。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Color")
    @Expose
    private Long Color;

    /**
     * Get 取值范围：0：光头，1：短发，2：中发，3：长发，4：绑发。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Length 取值范围：0：光头，1：短发，2：中发，3：长发，4：绑发。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 取值范围：0：光头，1：短发，2：中发，3：长发，4：绑发。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Length 取值范围：0：光头，1：短发，2：中发，3：长发，4：绑发。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 取值范围：0：有刘海，1：无刘海。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bang 取值范围：0：有刘海，1：无刘海。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBang() {
        return this.Bang;
    }

    /**
     * Set 取值范围：0：有刘海，1：无刘海。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bang 取值范围：0：有刘海，1：无刘海。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBang(Long Bang) {
        this.Bang = Bang;
    }

    /**
     * Get 取值范围：0：黑色，1：金色，2：棕色，3：灰白色。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Color 取值范围：0：黑色，1：金色，2：棕色，3：灰白色。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColor() {
        return this.Color;
    }

    /**
     * Set 取值范围：0：黑色，1：金色，2：棕色，3：灰白色。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Color 取值范围：0：黑色，1：金色，2：棕色，3：灰白色。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColor(Long Color) {
        this.Color = Color;
    }

    public FaceHairAttributesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceHairAttributesInfo(FaceHairAttributesInfo source) {
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.Bang != null) {
            this.Bang = new Long(source.Bang);
        }
        if (source.Color != null) {
            this.Color = new Long(source.Color);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Bang", this.Bang);
        this.setParamSimple(map, prefix + "Color", this.Color);

    }
}

