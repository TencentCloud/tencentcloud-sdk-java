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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Element extends AbstractModel {

    /**
    * <p>元素内容，当type为figure时该字段内容为图片的位置</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>元素坐标</p>
    */
    @SerializedName("Coord")
    @Expose
    private Polygon Coord;

    /**
    * <p>元素group类型，包括multiple-choice(选择题)、fill-in-the-blank(填空题)、problem-solving(解答题)、arithmetic(算术题)</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>结果列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultList")
    @Expose
    private ResultList [] ResultList;

    /**
    * <p>元素索引</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * <p>元素所在页</p><p>单位：页</p><p>默认值：1</p>
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
     * Get <p>元素内容，当type为figure时该字段内容为图片的位置</p> 
     * @return Text <p>元素内容，当type为figure时该字段内容为图片的位置</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>元素内容，当type为figure时该字段内容为图片的位置</p>
     * @param Text <p>元素内容，当type为figure时该字段内容为图片的位置</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>元素坐标</p> 
     * @return Coord <p>元素坐标</p>
     */
    public Polygon getCoord() {
        return this.Coord;
    }

    /**
     * Set <p>元素坐标</p>
     * @param Coord <p>元素坐标</p>
     */
    public void setCoord(Polygon Coord) {
        this.Coord = Coord;
    }

    /**
     * Get <p>元素group类型，包括multiple-choice(选择题)、fill-in-the-blank(填空题)、problem-solving(解答题)、arithmetic(算术题)</p> 
     * @return GroupType <p>元素group类型，包括multiple-choice(选择题)、fill-in-the-blank(填空题)、problem-solving(解答题)、arithmetic(算术题)</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>元素group类型，包括multiple-choice(选择题)、fill-in-the-blank(填空题)、problem-solving(解答题)、arithmetic(算术题)</p>
     * @param GroupType <p>元素group类型，包括multiple-choice(选择题)、fill-in-the-blank(填空题)、problem-solving(解答题)、arithmetic(算术题)</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>结果列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultList <p>结果列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResultList [] getResultList() {
        return this.ResultList;
    }

    /**
     * Set <p>结果列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultList <p>结果列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultList(ResultList [] ResultList) {
        this.ResultList = ResultList;
    }

    /**
     * Get <p>元素索引</p> 
     * @return Index <p>元素索引</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>元素索引</p>
     * @param Index <p>元素索引</p>
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get <p>元素所在页</p><p>单位：页</p><p>默认值：1</p> 
     * @return PageIndex <p>元素所在页</p><p>单位：页</p><p>默认值：1</p>
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set <p>元素所在页</p><p>单位：页</p><p>默认值：1</p>
     * @param PageIndex <p>元素所在页</p><p>单位：页</p><p>默认值：1</p>
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
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
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
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
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);

    }
}

