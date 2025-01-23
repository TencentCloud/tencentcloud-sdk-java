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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Element extends AbstractModel {

    /**
    * 元素内容，当type为figure时该字段内容为图片的位置
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 元素坐标
    */
    @SerializedName("Coord")
    @Expose
    private Polygon Coord;

    /**
    * 元素group类型，包括multiple-choice(选择题)、fill-in-the-blank(填空题)、problem-solving(解答题)、arithmetic(算术题)
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultList")
    @Expose
    private ResultList [] ResultList;

    /**
    * 元素索引
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get 元素内容，当type为figure时该字段内容为图片的位置 
     * @return Text 元素内容，当type为figure时该字段内容为图片的位置
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 元素内容，当type为figure时该字段内容为图片的位置
     * @param Text 元素内容，当type为figure时该字段内容为图片的位置
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 元素坐标 
     * @return Coord 元素坐标
     */
    public Polygon getCoord() {
        return this.Coord;
    }

    /**
     * Set 元素坐标
     * @param Coord 元素坐标
     */
    public void setCoord(Polygon Coord) {
        this.Coord = Coord;
    }

    /**
     * Get 元素group类型，包括multiple-choice(选择题)、fill-in-the-blank(填空题)、problem-solving(解答题)、arithmetic(算术题) 
     * @return GroupType 元素group类型，包括multiple-choice(选择题)、fill-in-the-blank(填空题)、problem-solving(解答题)、arithmetic(算术题)
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 元素group类型，包括multiple-choice(选择题)、fill-in-the-blank(填空题)、problem-solving(解答题)、arithmetic(算术题)
     * @param GroupType 元素group类型，包括multiple-choice(选择题)、fill-in-the-blank(填空题)、problem-solving(解答题)、arithmetic(算术题)
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultList 结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResultList [] getResultList() {
        return this.ResultList;
    }

    /**
     * Set 结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultList 结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultList(ResultList [] ResultList) {
        this.ResultList = ResultList;
    }

    /**
     * Get 元素索引 
     * @return Index 元素索引
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 元素索引
     * @param Index 元素索引
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public Element() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Element(Element source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Coord != null) {
            this.Coord = new Polygon(source.Coord);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.ResultList != null) {
            this.ResultList = new ResultList[source.ResultList.length];
            for (int i = 0; i < source.ResultList.length; i++) {
                this.ResultList[i] = new ResultList(source.ResultList[i]);
            }
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "Coord.", this.Coord);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArrayObj(map, prefix + "ResultList.", this.ResultList);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

