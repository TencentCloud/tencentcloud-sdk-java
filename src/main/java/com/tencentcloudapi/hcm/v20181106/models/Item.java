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
    * 识别的算式是否正确，算式运算结果: ‘YES’:正确 ‘NO’: 错误 ‘NA’: 非法参数
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * 识别出的算式，识别出的文本行字符串
    */
    @SerializedName("ItemString")
    @Expose
    private String ItemString;

    /**
    * 识别的算式在图片上的位置信息，文本行在旋转纠正之后的图像中的像素坐 标，表示为(左上角 x, 左上角 y，宽 width， 高 height)
    */
    @SerializedName("ItemCoord")
    @Expose
    private ItemCoord ItemCoord;

    /**
    * 错题推荐答案，算式运算结果正确返回为 ""，算式运算结果错误返回推荐答案 (注:暂不支持多个关系运算符(如 1<10<7)、 无关系运算符(如 frac(1,2)+frac(2,3))、单 位换算(如 1 元=100 角)错题的推荐答案 返回)
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
    * 文本行置信度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemConf")
    @Expose
    private Float ItemConf;

    /**
    * 用于标识题目 id，如果有若干算式属于同一 题，则其对应的 id 相同。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuestionId")
    @Expose
    private String QuestionId;

    /**
     * Get 识别的算式是否正确，算式运算结果: ‘YES’:正确 ‘NO’: 错误 ‘NA’: 非法参数 
     * @return Item 识别的算式是否正确，算式运算结果: ‘YES’:正确 ‘NO’: 错误 ‘NA’: 非法参数
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set 识别的算式是否正确，算式运算结果: ‘YES’:正确 ‘NO’: 错误 ‘NA’: 非法参数
     * @param Item 识别的算式是否正确，算式运算结果: ‘YES’:正确 ‘NO’: 错误 ‘NA’: 非法参数
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get 识别出的算式，识别出的文本行字符串 
     * @return ItemString 识别出的算式，识别出的文本行字符串
     */
    public String getItemString() {
        return this.ItemString;
    }

    /**
     * Set 识别出的算式，识别出的文本行字符串
     * @param ItemString 识别出的算式，识别出的文本行字符串
     */
    public void setItemString(String ItemString) {
        this.ItemString = ItemString;
    }

    /**
     * Get 识别的算式在图片上的位置信息，文本行在旋转纠正之后的图像中的像素坐 标，表示为(左上角 x, 左上角 y，宽 width， 高 height) 
     * @return ItemCoord 识别的算式在图片上的位置信息，文本行在旋转纠正之后的图像中的像素坐 标，表示为(左上角 x, 左上角 y，宽 width， 高 height)
     */
    public ItemCoord getItemCoord() {
        return this.ItemCoord;
    }

    /**
     * Set 识别的算式在图片上的位置信息，文本行在旋转纠正之后的图像中的像素坐 标，表示为(左上角 x, 左上角 y，宽 width， 高 height)
     * @param ItemCoord 识别的算式在图片上的位置信息，文本行在旋转纠正之后的图像中的像素坐 标，表示为(左上角 x, 左上角 y，宽 width， 高 height)
     */
    public void setItemCoord(ItemCoord ItemCoord) {
        this.ItemCoord = ItemCoord;
    }

    /**
     * Get 错题推荐答案，算式运算结果正确返回为 ""，算式运算结果错误返回推荐答案 (注:暂不支持多个关系运算符(如 1<10<7)、 无关系运算符(如 frac(1,2)+frac(2,3))、单 位换算(如 1 元=100 角)错题的推荐答案 返回) 
     * @return Answer 错题推荐答案，算式运算结果正确返回为 ""，算式运算结果错误返回推荐答案 (注:暂不支持多个关系运算符(如 1<10<7)、 无关系运算符(如 frac(1,2)+frac(2,3))、单 位换算(如 1 元=100 角)错题的推荐答案 返回)
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set 错题推荐答案，算式运算结果正确返回为 ""，算式运算结果错误返回推荐答案 (注:暂不支持多个关系运算符(如 1<10<7)、 无关系运算符(如 frac(1,2)+frac(2,3))、单 位换算(如 1 元=100 角)错题的推荐答案 返回)
     * @param Answer 错题推荐答案，算式运算结果正确返回为 ""，算式运算结果错误返回推荐答案 (注:暂不支持多个关系运算符(如 1<10<7)、 无关系运算符(如 frac(1,2)+frac(2,3))、单 位换算(如 1 元=100 角)错题的推荐答案 返回)
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
     * Get 文本行置信度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemConf 文本行置信度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getItemConf() {
        return this.ItemConf;
    }

    /**
     * Set 文本行置信度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemConf 文本行置信度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemConf(Float ItemConf) {
        this.ItemConf = ItemConf;
    }

    /**
     * Get 用于标识题目 id，如果有若干算式属于同一 题，则其对应的 id 相同。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuestionId 用于标识题目 id，如果有若干算式属于同一 题，则其对应的 id 相同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuestionId() {
        return this.QuestionId;
    }

    /**
     * Set 用于标识题目 id，如果有若干算式属于同一 题，则其对应的 id 相同。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuestionId 用于标识题目 id，如果有若干算式属于同一 题，则其对应的 id 相同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuestionId(String QuestionId) {
        this.QuestionId = QuestionId;
    }

    public Item() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Item(Item source) {
        if (source.Item != null) {
            this.Item = new String(source.Item);
        }
        if (source.ItemString != null) {
            this.ItemString = new String(source.ItemString);
        }
        if (source.ItemCoord != null) {
            this.ItemCoord = new ItemCoord(source.ItemCoord);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.ExpressionType != null) {
            this.ExpressionType = new String(source.ExpressionType);
        }
        if (source.ItemConf != null) {
            this.ItemConf = new Float(source.ItemConf);
        }
        if (source.QuestionId != null) {
            this.QuestionId = new String(source.QuestionId);
        }
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
        this.setParamSimple(map, prefix + "ItemConf", this.ItemConf);
        this.setParamSimple(map, prefix + "QuestionId", this.QuestionId);

    }
}

