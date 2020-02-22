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

public class ItemValue extends AbstractModel{

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
    private Long X;

    /**
    * Y坐标
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 宽度
    */
    @SerializedName("W")
    @Expose
    private Long W;

    /**
    * 高度
    */
    @SerializedName("H")
    @Expose
    private Long H;

    /**
     * Get 识别出的源文 
     * @return SourceText 识别出的源文
     */
    public String getSourceText() {
        return this.SourceText;
    }

    /**
     * Set 识别出的源文
     * @param SourceText 识别出的源文
     */
    public void setSourceText(String SourceText) {
        this.SourceText = SourceText;
    }

    /**
     * Get 翻译后的译文 
     * @return TargetText 翻译后的译文
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set 翻译后的译文
     * @param TargetText 翻译后的译文
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Get X坐标 
     * @return X X坐标
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set X坐标
     * @param X X坐标
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get Y坐标 
     * @return Y Y坐标
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Y坐标
     * @param Y Y坐标
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 宽度 
     * @return W 宽度
     */
    public Long getW() {
        return this.W;
    }

    /**
     * Set 宽度
     * @param W 宽度
     */
    public void setW(Long W) {
        this.W = W;
    }

    /**
     * Get 高度 
     * @return H 高度
     */
    public Long getH() {
        return this.H;
    }

    /**
     * Set 高度
     * @param H 高度
     */
    public void setH(Long H) {
        this.H = H;
    }

    /**
     * Internal implementation, normal users should not use it.
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

