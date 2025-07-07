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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpaceRelation extends AbstractModel {

    /**
    * 构件id
    */
    @SerializedName("ElementId")
    @Expose
    private String ElementId;

    /**
    * 构件名称
    */
    @SerializedName("ElementName")
    @Expose
    private String ElementName;

    /**
    * 空间层级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 空间编码
    */
    @SerializedName("SpaceCode")
    @Expose
    private String SpaceCode;

    /**
    * 父级空间编码
    */
    @SerializedName("ParentSpaceCode")
    @Expose
    private String ParentSpaceCode;

    /**
    * 子构件信息
    */
    @SerializedName("Children")
    @Expose
    private SpaceRelation [] Children;

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
     * Get 空间层级 
     * @return Level 空间层级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 空间层级
     * @param Level 空间层级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 空间编码 
     * @return SpaceCode 空间编码
     */
    public String getSpaceCode() {
        return this.SpaceCode;
    }

    /**
     * Set 空间编码
     * @param SpaceCode 空间编码
     */
    public void setSpaceCode(String SpaceCode) {
        this.SpaceCode = SpaceCode;
    }

    /**
     * Get 父级空间编码 
     * @return ParentSpaceCode 父级空间编码
     */
    public String getParentSpaceCode() {
        return this.ParentSpaceCode;
    }

    /**
     * Set 父级空间编码
     * @param ParentSpaceCode 父级空间编码
     */
    public void setParentSpaceCode(String ParentSpaceCode) {
        this.ParentSpaceCode = ParentSpaceCode;
    }

    /**
     * Get 子构件信息 
     * @return Children 子构件信息
     */
    public SpaceRelation [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子构件信息
     * @param Children 子构件信息
     */
    public void setChildren(SpaceRelation [] Children) {
        this.Children = Children;
    }

    public SpaceRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpaceRelation(SpaceRelation source) {
        if (source.ElementId != null) {
            this.ElementId = new String(source.ElementId);
        }
        if (source.ElementName != null) {
            this.ElementName = new String(source.ElementName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.SpaceCode != null) {
            this.SpaceCode = new String(source.SpaceCode);
        }
        if (source.ParentSpaceCode != null) {
            this.ParentSpaceCode = new String(source.ParentSpaceCode);
        }
        if (source.Children != null) {
            this.Children = new SpaceRelation[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new SpaceRelation(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ElementId", this.ElementId);
        this.setParamSimple(map, prefix + "ElementName", this.ElementName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "SpaceCode", this.SpaceCode);
        this.setParamSimple(map, prefix + "ParentSpaceCode", this.ParentSpaceCode);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

