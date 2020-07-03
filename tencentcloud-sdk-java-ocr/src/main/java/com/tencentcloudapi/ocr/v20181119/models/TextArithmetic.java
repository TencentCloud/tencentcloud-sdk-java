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

public class TextArithmetic extends AbstractModel{

    /**
    * 识别出的文本行内容
    */
    @SerializedName("DetectedText")
    @Expose
    private String DetectedText;

    /**
    * 算式运算结果
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * 保留字段，暂不支持
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 原图文本行坐标，以四个顶点坐标表示（保留字段，暂不支持）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
    * 保留字段，暂不支持
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * 文本行旋转纠正之后在图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）
    */
    @SerializedName("ItemCoord")
    @Expose
    private ItemCoord ItemCoord;

    /**
    * 算式题型编号：
‘1’: 加减乘除四则
‘2’: 加减乘除已知结果求运算因子
‘3’: 判断大小
‘4’: 约等于估算
‘5’: 带余数除法
‘6’: 分数四则运算
‘7’: 单位换算
‘8’: 竖式加减法
‘9’: 竖式乘除法
‘10’: 脱式计算
‘11’: 解方程
    */
    @SerializedName("ExpressionType")
    @Expose
    private String ExpressionType;

    /**
     * Get 识别出的文本行内容 
     * @return DetectedText 识别出的文本行内容
     */
    public String getDetectedText() {
        return this.DetectedText;
    }

    /**
     * Set 识别出的文本行内容
     * @param DetectedText 识别出的文本行内容
     */
    public void setDetectedText(String DetectedText) {
        this.DetectedText = DetectedText;
    }

    /**
     * Get 算式运算结果 
     * @return Result 算式运算结果
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set 算式运算结果
     * @param Result 算式运算结果
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get 保留字段，暂不支持 
     * @return Confidence 保留字段，暂不支持
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 保留字段，暂不支持
     * @param Confidence 保留字段，暂不支持
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 原图文本行坐标，以四个顶点坐标表示（保留字段，暂不支持）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Polygon 原图文本行坐标，以四个顶点坐标表示（保留字段，暂不支持）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set 原图文本行坐标，以四个顶点坐标表示（保留字段，暂不支持）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Polygon 原图文本行坐标，以四个顶点坐标表示（保留字段，暂不支持）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get 保留字段，暂不支持 
     * @return AdvancedInfo 保留字段，暂不支持
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 保留字段，暂不支持
     * @param AdvancedInfo 保留字段，暂不支持
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get 文本行旋转纠正之后在图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height） 
     * @return ItemCoord 文本行旋转纠正之后在图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）
     */
    public ItemCoord getItemCoord() {
        return this.ItemCoord;
    }

    /**
     * Set 文本行旋转纠正之后在图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）
     * @param ItemCoord 文本行旋转纠正之后在图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）
     */
    public void setItemCoord(ItemCoord ItemCoord) {
        this.ItemCoord = ItemCoord;
    }

    /**
     * Get 算式题型编号：
‘1’: 加减乘除四则
‘2’: 加减乘除已知结果求运算因子
‘3’: 判断大小
‘4’: 约等于估算
‘5’: 带余数除法
‘6’: 分数四则运算
‘7’: 单位换算
‘8’: 竖式加减法
‘9’: 竖式乘除法
‘10’: 脱式计算
‘11’: 解方程 
     * @return ExpressionType 算式题型编号：
‘1’: 加减乘除四则
‘2’: 加减乘除已知结果求运算因子
‘3’: 判断大小
‘4’: 约等于估算
‘5’: 带余数除法
‘6’: 分数四则运算
‘7’: 单位换算
‘8’: 竖式加减法
‘9’: 竖式乘除法
‘10’: 脱式计算
‘11’: 解方程
     */
    public String getExpressionType() {
        return this.ExpressionType;
    }

    /**
     * Set 算式题型编号：
‘1’: 加减乘除四则
‘2’: 加减乘除已知结果求运算因子
‘3’: 判断大小
‘4’: 约等于估算
‘5’: 带余数除法
‘6’: 分数四则运算
‘7’: 单位换算
‘8’: 竖式加减法
‘9’: 竖式乘除法
‘10’: 脱式计算
‘11’: 解方程
     * @param ExpressionType 算式题型编号：
‘1’: 加减乘除四则
‘2’: 加减乘除已知结果求运算因子
‘3’: 判断大小
‘4’: 约等于估算
‘5’: 带余数除法
‘6’: 分数四则运算
‘7’: 单位换算
‘8’: 竖式加减法
‘9’: 竖式乘除法
‘10’: 脱式计算
‘11’: 解方程
     */
    public void setExpressionType(String ExpressionType) {
        this.ExpressionType = ExpressionType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetectedText", this.DetectedText);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArrayObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamObj(map, prefix + "ItemCoord.", this.ItemCoord);
        this.setParamSimple(map, prefix + "ExpressionType", this.ExpressionType);

    }
}

