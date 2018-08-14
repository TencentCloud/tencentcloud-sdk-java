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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemValue  extends AbstractModel{

    /**
    * 识别出的源文
    */
    @SerializedName("SourceText")
    @Expose
    private String SourceText;

    /**
    * 翻译后的译文
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
    * X坐标
    */
    @SerializedName("X")
    @Expose
    private Integer X;

    /**
    * Y坐标
    */
    @SerializedName("Y")
    @Expose
    private Integer Y;

    /**
    * 宽度
    */
    @SerializedName("W")
    @Expose
    private Integer W;

    /**
    * 高度
    */
    @SerializedName("H")
    @Expose
    private Integer H;

    /**
     * 获取识别出的源文
     * @return SourceText 识别出的源文
     */
    public String getSourceText() {
        return this.SourceText;
    }

    /**
     * 设置识别出的源文
     * @param SourceText 识别出的源文
     */
    public void setSourceText(String SourceText) {
        this.SourceText = SourceText;
    }

    /**
     * 获取翻译后的译文
     * @return TargetText 翻译后的译文
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * 设置翻译后的译文
     * @param TargetText 翻译后的译文
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * 获取X坐标
     * @return X X坐标
     */
    public Integer getX() {
        return this.X;
    }

    /**
     * 设置X坐标
     * @param X X坐标
     */
    public void setX(Integer X) {
        this.X = X;
    }

    /**
     * 获取Y坐标
     * @return Y Y坐标
     */
    public Integer getY() {
        return this.Y;
    }

    /**
     * 设置Y坐标
     * @param Y Y坐标
     */
    public void setY(Integer Y) {
        this.Y = Y;
    }

    /**
     * 获取宽度
     * @return W 宽度
     */
    public Integer getW() {
        return this.W;
    }

    /**
     * 设置宽度
     * @param W 宽度
     */
    public void setW(Integer W) {
        this.W = W;
    }

    /**
     * 获取高度
     * @return H 高度
     */
    public Integer getH() {
        return this.H;
    }

    /**
     * 设置高度
     * @param H 高度
     */
    public void setH(Integer H) {
        this.H = H;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceText", this.SourceText);
        this.setParamSimple(map, prefix + "TargetText", this.TargetText);
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "W", this.W);
        this.setParamSimple(map, prefix + "H", this.H);

    }
}

