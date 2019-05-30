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
package com.tencentcloudapi.ecc.v20181213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EHOCRRequest  extends AbstractModel{

    /**
    * 图片所在的url或base64编码后的图像数据，依据InputType而定
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 输出图片类型，0表示Image字段是图片所在的url，1表示Image字段是base64编码后的图像数据
    */
    @SerializedName("InputType")
    @Expose
    private Long InputType;

    /**
     * 获取图片所在的url或base64编码后的图像数据，依据InputType而定
     * @return Image 图片所在的url或base64编码后的图像数据，依据InputType而定
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * 设置图片所在的url或base64编码后的图像数据，依据InputType而定
     * @param Image 图片所在的url或base64编码后的图像数据，依据InputType而定
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * 获取输出图片类型，0表示Image字段是图片所在的url，1表示Image字段是base64编码后的图像数据
     * @return InputType 输出图片类型，0表示Image字段是图片所在的url，1表示Image字段是base64编码后的图像数据
     */
    public Long getInputType() {
        return this.InputType;
    }

    /**
     * 设置输出图片类型，0表示Image字段是图片所在的url，1表示Image字段是base64编码后的图像数据
     * @param InputType 输出图片类型，0表示Image字段是图片所在的url，1表示Image字段是base64编码后的图像数据
     */
    public void setInputType(Long InputType) {
        this.InputType = InputType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "InputType", this.InputType);

    }
}

