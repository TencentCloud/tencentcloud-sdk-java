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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassifyDetectInfo extends AbstractModel{

    /**
    * 分类名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分类类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 位置坐标
    */
    @SerializedName("Rect")
    @Expose
    private Rect Rect;

    /**
     * Get 分类名称 
     * @return Name 分类名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分类名称
     * @param Name 分类名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分类类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 分类类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 分类类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 分类类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 位置坐标 
     * @return Rect 位置坐标
     */
    public Rect getRect() {
        return this.Rect;
    }

    /**
     * Set 位置坐标
     * @param Rect 位置坐标
     */
    public void setRect(Rect Rect) {
        this.Rect = Rect;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Rect.", this.Rect);

    }
}

