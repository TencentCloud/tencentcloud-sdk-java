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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElementPropertyRes extends AbstractModel {

    /**
    * 建筑id
    */
    @SerializedName("BuildingId")
    @Expose
    private String BuildingId;

    /**
    * 构件id
    */
    @SerializedName("ElementId")
    @Expose
    private String ElementId;

    /**
    * 构件属性集合
    */
    @SerializedName("PropertySet")
    @Expose
    private ElementProperty [] PropertySet;

    /**
    * 构件地理坐标
    */
    @SerializedName("Coordinates")
    @Expose
    private ElementCoordinates Coordinates;

    /**
    * 构件偏移量
    */
    @SerializedName("Translate")
    @Expose
    private ElementTranslate Translate;

    /**
    * 构件名称
    */
    @SerializedName("ElementName")
    @Expose
    private String ElementName;

    /**
    * 构件类型代码
    */
    @SerializedName("EntityTypeCode")
    @Expose
    private String EntityTypeCode;

    /**
    * 构件类型名称
    */
    @SerializedName("EntityTypeName")
    @Expose
    private String EntityTypeName;

    /**
     * Get 建筑id 
     * @return BuildingId 建筑id
     */
    public String getBuildingId() {
        return this.BuildingId;
    }

    /**
     * Set 建筑id
     * @param BuildingId 建筑id
     */
    public void setBuildingId(String BuildingId) {
        this.BuildingId = BuildingId;
    }

    /**
     * Get 构件id 
     * @return ElementId 构件id
     */
    public String getElementId() {
        return this.ElementId;
    }

    /**
     * Set 构件id
     * @param ElementId 构件id
     */
    public void setElementId(String ElementId) {
        this.ElementId = ElementId;
    }

    /**
     * Get 构件属性集合 
     * @return PropertySet 构件属性集合
     */
    public ElementProperty [] getPropertySet() {
        return this.PropertySet;
    }

    /**
     * Set 构件属性集合
     * @param PropertySet 构件属性集合
     */
    public void setPropertySet(ElementProperty [] PropertySet) {
        this.PropertySet = PropertySet;
    }

    /**
     * Get 构件地理坐标 
     * @return Coordinates 构件地理坐标
     */
    public ElementCoordinates getCoordinates() {
        return this.Coordinates;
    }

    /**
     * Set 构件地理坐标
     * @param Coordinates 构件地理坐标
     */
    public void setCoordinates(ElementCoordinates Coordinates) {
        this.Coordinates = Coordinates;
    }

    /**
     * Get 构件偏移量 
     * @return Translate 构件偏移量
     */
    public ElementTranslate getTranslate() {
        return this.Translate;
    }

    /**
     * Set 构件偏移量
     * @param Translate 构件偏移量
     */
    public void setTranslate(ElementTranslate Translate) {
        this.Translate = Translate;
    }

    /**
     * Get 构件名称 
     * @return ElementName 构件名称
     */
    public String getElementName() {
        return this.ElementName;
    }

    /**
     * Set 构件名称
     * @param ElementName 构件名称
     */
    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    /**
     * Get 构件类型代码 
     * @return EntityTypeCode 构件类型代码
     */
    public String getEntityTypeCode() {
        return this.EntityTypeCode;
    }

    /**
     * Set 构件类型代码
     * @param EntityTypeCode 构件类型代码
     */
    public void setEntityTypeCode(String EntityTypeCode) {
        this.EntityTypeCode = EntityTypeCode;
    }

    /**
     * Get 构件类型名称 
     * @return EntityTypeName 构件类型名称
     */
    public String getEntityTypeName() {
        return this.EntityTypeName;
    }

    /**
     * Set 构件类型名称
     * @param EntityTypeName 构件类型名称
     */
    public void setEntityTypeName(String EntityTypeName) {
        this.EntityTypeName = EntityTypeName;
    }

    public ElementPropertyRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElementPropertyRes(ElementPropertyRes source) {
        if (source.BuildingId != null) {
            this.BuildingId = new String(source.BuildingId);
        }
        if (source.ElementId != null) {
            this.ElementId = new String(source.ElementId);
        }
        if (source.PropertySet != null) {
            this.PropertySet = new ElementProperty[source.PropertySet.length];
            for (int i = 0; i < source.PropertySet.length; i++) {
                this.PropertySet[i] = new ElementProperty(source.PropertySet[i]);
            }
        }
        if (source.Coordinates != null) {
            this.Coordinates = new ElementCoordinates(source.Coordinates);
        }
        if (source.Translate != null) {
            this.Translate = new ElementTranslate(source.Translate);
        }
        if (source.ElementName != null) {
            this.ElementName = new String(source.ElementName);
        }
        if (source.EntityTypeCode != null) {
            this.EntityTypeCode = new String(source.EntityTypeCode);
        }
        if (source.EntityTypeName != null) {
            this.EntityTypeName = new String(source.EntityTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BuildingId", this.BuildingId);
        this.setParamSimple(map, prefix + "ElementId", this.ElementId);
        this.setParamArrayObj(map, prefix + "PropertySet.", this.PropertySet);
        this.setParamObj(map, prefix + "Coordinates.", this.Coordinates);
        this.setParamObj(map, prefix + "Translate.", this.Translate);
        this.setParamSimple(map, prefix + "ElementName", this.ElementName);
        this.setParamSimple(map, prefix + "EntityTypeCode", this.EntityTypeCode);
        this.setParamSimple(map, prefix + "EntityTypeName", this.EntityTypeName);

    }
}

