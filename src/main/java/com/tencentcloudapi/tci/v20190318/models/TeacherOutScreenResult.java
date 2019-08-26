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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TeacherOutScreenResult  extends AbstractModel{

    /**
    * 动作识别结果
    */
    @SerializedName("Class")
    @Expose
    private String Class;

    /**
    * 识别结果高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 识别结果左坐标
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
    * 识别结果顶坐标
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * 识别结果宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
     * 获取动作识别结果
     * Java getClass cannot and should not be overrided, hence we have to transfer it to a new name which should never conflict with another attribute. The underscode(_) is used as a postfix, because it is invalid in API 3.0, but can be used in Java, even it is not recommended.
     * @return Class 动作识别结果
     */
    public String getClass_() {
        return this.Class;
    }

    /**
     * 设置动作识别结果
     * @param Class 动作识别结果
     */
    public void setClass(String Class) {
        this.Class = Class;
    }

    /**
     * 获取识别结果高度
     * @return Height 识别结果高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * 设置识别结果高度
     * @param Height 识别结果高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * 获取识别结果左坐标
     * @return Left 识别结果左坐标
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * 设置识别结果左坐标
     * @param Left 识别结果左坐标
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    /**
     * 获取识别结果顶坐标
     * @return Top 识别结果顶坐标
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * 设置识别结果顶坐标
     * @param Top 识别结果顶坐标
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * 获取识别结果宽度
     * @return Width 识别结果宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * 设置识别结果宽度
     * @param Width 识别结果宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Class", this.Class);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "Width", this.Width);

    }
}

