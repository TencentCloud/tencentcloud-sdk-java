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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OphthalmologyBareEyeSight extends AbstractModel{

    /**
    * 左眼视力
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftEyeVisual")
    @Expose
    private KeyValueItem LeftEyeVisual;

    /**
    * 裸眼视力
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private KeyValueItem Text;

    /**
    * 右眼视力
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RightEyeVisual")
    @Expose
    private KeyValueItem RightEyeVisual;

    /**
     * Get 左眼视力
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftEyeVisual 左眼视力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getLeftEyeVisual() {
        return this.LeftEyeVisual;
    }

    /**
     * Set 左眼视力
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftEyeVisual 左眼视力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftEyeVisual(KeyValueItem LeftEyeVisual) {
        this.LeftEyeVisual = LeftEyeVisual;
    }

    /**
     * Get 裸眼视力
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 裸眼视力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getText() {
        return this.Text;
    }

    /**
     * Set 裸眼视力
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 裸眼视力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(KeyValueItem Text) {
        this.Text = Text;
    }

    /**
     * Get 右眼视力
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RightEyeVisual 右眼视力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getRightEyeVisual() {
        return this.RightEyeVisual;
    }

    /**
     * Set 右眼视力
注意：此字段可能返回 null，表示取不到有效值。
     * @param RightEyeVisual 右眼视力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRightEyeVisual(KeyValueItem RightEyeVisual) {
        this.RightEyeVisual = RightEyeVisual;
    }

    public OphthalmologyBareEyeSight() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OphthalmologyBareEyeSight(OphthalmologyBareEyeSight source) {
        if (source.LeftEyeVisual != null) {
            this.LeftEyeVisual = new KeyValueItem(source.LeftEyeVisual);
        }
        if (source.Text != null) {
            this.Text = new KeyValueItem(source.Text);
        }
        if (source.RightEyeVisual != null) {
            this.RightEyeVisual = new KeyValueItem(source.RightEyeVisual);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LeftEyeVisual.", this.LeftEyeVisual);
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamObj(map, prefix + "RightEyeVisual.", this.RightEyeVisual);

    }
}

