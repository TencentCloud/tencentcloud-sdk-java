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

public class EyeItem extends AbstractModel{

    /**
    * 左眼
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Left")
    @Expose
    private EyeChildItem Left;

    /**
    * 右眼
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Right")
    @Expose
    private EyeChildItem Right;

    /**
    * 瞳距
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pd")
    @Expose
    private BaseItem2 Pd;

    /**
     * Get 左眼
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Left 左眼
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EyeChildItem getLeft() {
        return this.Left;
    }

    /**
     * Set 左眼
注意：此字段可能返回 null，表示取不到有效值。
     * @param Left 左眼
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeft(EyeChildItem Left) {
        this.Left = Left;
    }

    /**
     * Get 右眼
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Right 右眼
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EyeChildItem getRight() {
        return this.Right;
    }

    /**
     * Set 右眼
注意：此字段可能返回 null，表示取不到有效值。
     * @param Right 右眼
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRight(EyeChildItem Right) {
        this.Right = Right;
    }

    /**
     * Get 瞳距
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pd 瞳距
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem2 getPd() {
        return this.Pd;
    }

    /**
     * Set 瞳距
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pd 瞳距
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPd(BaseItem2 Pd) {
        this.Pd = Pd;
    }

    public EyeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EyeItem(EyeItem source) {
        if (source.Left != null) {
            this.Left = new EyeChildItem(source.Left);
        }
        if (source.Right != null) {
            this.Right = new EyeChildItem(source.Right);
        }
        if (source.Pd != null) {
            this.Pd = new BaseItem2(source.Pd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Left.", this.Left);
        this.setParamObj(map, prefix + "Right.", this.Right);
        this.setParamObj(map, prefix + "Pd.", this.Pd);

    }
}

