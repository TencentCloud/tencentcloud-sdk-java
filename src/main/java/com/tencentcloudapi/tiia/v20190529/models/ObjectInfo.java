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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectInfo extends AbstractModel{

    /**
    * 图像主体区域。
    */
    @SerializedName("Box")
    @Expose
    private Box Box;

    /**
    * 主体类别ID。
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 整张图颜色信息。
    */
    @SerializedName("Colors")
    @Expose
    private ColorInfo [] Colors;

    /**
    * 属性信息。
    */
    @SerializedName("Attributes")
    @Expose
    private Attribute [] Attributes;

    /**
     * Get 图像主体区域。 
     * @return Box 图像主体区域。
     */
    public Box getBox() {
        return this.Box;
    }

    /**
     * Set 图像主体区域。
     * @param Box 图像主体区域。
     */
    public void setBox(Box Box) {
        this.Box = Box;
    }

    /**
     * Get 主体类别ID。 
     * @return CategoryId 主体类别ID。
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 主体类别ID。
     * @param CategoryId 主体类别ID。
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 整张图颜色信息。 
     * @return Colors 整张图颜色信息。
     */
    public ColorInfo [] getColors() {
        return this.Colors;
    }

    /**
     * Set 整张图颜色信息。
     * @param Colors 整张图颜色信息。
     */
    public void setColors(ColorInfo [] Colors) {
        this.Colors = Colors;
    }

    /**
     * Get 属性信息。 
     * @return Attributes 属性信息。
     */
    public Attribute [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set 属性信息。
     * @param Attributes 属性信息。
     */
    public void setAttributes(Attribute [] Attributes) {
        this.Attributes = Attributes;
    }

    public ObjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectInfo(ObjectInfo source) {
        if (source.Box != null) {
            this.Box = new Box(source.Box);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.Colors != null) {
            this.Colors = new ColorInfo[source.Colors.length];
            for (int i = 0; i < source.Colors.length; i++) {
                this.Colors[i] = new ColorInfo(source.Colors[i]);
            }
        }
        if (source.Attributes != null) {
            this.Attributes = new Attribute[source.Attributes.length];
            for (int i = 0; i < source.Attributes.length; i++) {
                this.Attributes[i] = new Attribute(source.Attributes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Box.", this.Box);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamArrayObj(map, prefix + "Colors.", this.Colors);
        this.setParamArrayObj(map, prefix + "Attributes.", this.Attributes);

    }
}

