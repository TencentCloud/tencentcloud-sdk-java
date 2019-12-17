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
package com.tencentcloudapi.hcm.v20181106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Item extends AbstractModel{

    /**
    * 识别的算式是否正确
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * 识别的算式
    */
    @SerializedName("ItemString")
    @Expose
    private String ItemString;

    /**
    * 识别的算式在图片上的位置信息
    */
    @SerializedName("ItemCoord")
    @Expose
    private ItemCoord ItemCoord;

    /**
    * 推荐的答案，暂不支持多个关系运算符、无关系运算符、单位换算错题的推荐答案返回。
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * 算式题型编号，如加减乘除四则题型，具体题型及编号如下：1 加减乘除四则 2 加减乘除已知结果求运算因子3 判断大小 4 约等于估算 5 带余数除法 6 分数四则运算 7 单位换算 8 竖式加减法 9 竖式乘除法 10 脱式计算 11 解方程
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpressionType")
    @Expose
    private String ExpressionType;

    /**
     * Get 识别的算式是否正确 
     * @return Item 识别的算式是否正确
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set 识别的算式是否正确
     * @param Item 识别的算式是否正确
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get 识别的算式 
     * @return ItemString 识别的算式
     */
    public String getItemString() {
        return this.ItemString;
    }

    /**
     * Set 识别的算式
     * @param ItemString 识别的算式
     */
    public void setItemString(String ItemString) {
        this.ItemString = ItemString;
    }

    /**
     * Get 识别的算式在图片上的位置信息 
     * @return ItemCoord 识别的算式在图片上的位置信息
     */
    public ItemCoord getItemCoord() {
        return this.ItemCoord;
    }

    /**
     * Set 识别的算式在图片上的位置信息
     * @param ItemCoord 识别的算式在图片上的位置信息
     */
    public void setItemCoord(ItemCoord ItemCoord) {
        this.ItemCoord = ItemCoord;
    }

    /**
     * Get 推荐的答案，暂不支持多个关系运算符、无关系运算符、单位换算错题的推荐答案返回。 
     * @return Answer 推荐的答案，暂不支持多个关系运算符、无关系运算符、单位换算错题的推荐答案返回。
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set 推荐的答案，暂不支持多个关系运算符、无关系运算符、单位换算错题的推荐答案返回。
     * @param Answer 推荐的答案，暂不支持多个关系运算符、无关系运算符、单位换算错题的推荐答案返回。
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get 算式题型编号，如加减乘除四则题型，具体题型及编号如下：1 加减乘除四则 2 加减乘除已知结果求运算因子3 判断大小 4 约等于估算 5 带余数除法 6 分数四则运算 7 单位换算 8 竖式加减法 9 竖式乘除法 10 脱式计算 11 解方程
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpressionType 算式题型编号，如加减乘除四则题型，具体题型及编号如下：1 加减乘除四则 2 加减乘除已知结果求运算因子3 判断大小 4 约等于估算 5 带余数除法 6 分数四则运算 7 单位换算 8 竖式加减法 9 竖式乘除法 10 脱式计算 11 解方程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpressionType() {
        return this.ExpressionType;
    }

    /**
     * Set 算式题型编号，如加减乘除四则题型，具体题型及编号如下：1 加减乘除四则 2 加减乘除已知结果求运算因子3 判断大小 4 约等于估算 5 带余数除法 6 分数四则运算 7 单位换算 8 竖式加减法 9 竖式乘除法 10 脱式计算 11 解方程
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpressionType 算式题型编号，如加减乘除四则题型，具体题型及编号如下：1 加减乘除四则 2 加减乘除已知结果求运算因子3 判断大小 4 约等于估算 5 带余数除法 6 分数四则运算 7 单位换算 8 竖式加减法 9 竖式乘除法 10 脱式计算 11 解方程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpressionType(String ExpressionType) {
        this.ExpressionType = ExpressionType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "ItemString", this.ItemString);
        this.setParamObj(map, prefix + "ItemCoord.", this.ItemCoord);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "ExpressionType", this.ExpressionType);

    }
}

