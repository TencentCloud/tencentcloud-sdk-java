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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CropImageResponse extends AbstractModel{

    /**
    * 裁剪区域左上角X坐标值
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 裁剪区域左上角Y坐标值
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 裁剪区域的宽度，单位为像素
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 裁剪区域的高度，单位为像素
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 原图宽度，单位为像素
    */
    @SerializedName("OriginalWidth")
    @Expose
    private Long OriginalWidth;

    /**
    * 原图高度，单位为像素
    */
    @SerializedName("OriginalHeight")
    @Expose
    private Long OriginalHeight;

    /**
    * 0：抠图正常；
1：原图过长，指原图的高度是宽度的1.8倍以上；
2：原图过宽，指原图的宽度是高度的1.8倍以上；
3：抠图区域过长，指抠图的高度是主体备选框高度的1.6倍以上；
4：抠图区域过宽，指当没有检测到人脸时，抠图区域宽度是检测出的原图主体区域宽度的1.6倍以上；
5：纯色图，指裁剪区域视觉较为单一、缺乏主体部分 ；
6：宽高比异常，指Width : Height取值超出[1, 2.5]的范围；

以上是辅助决策的参考建议，可以根据业务需求选择采纳或忽视。
    */
    @SerializedName("CropResult")
    @Expose
    private Long CropResult;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 裁剪区域左上角X坐标值 
     * @return X 裁剪区域左上角X坐标值
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 裁剪区域左上角X坐标值
     * @param X 裁剪区域左上角X坐标值
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 裁剪区域左上角Y坐标值 
     * @return Y 裁剪区域左上角Y坐标值
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 裁剪区域左上角Y坐标值
     * @param Y 裁剪区域左上角Y坐标值
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 裁剪区域的宽度，单位为像素 
     * @return Width 裁剪区域的宽度，单位为像素
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 裁剪区域的宽度，单位为像素
     * @param Width 裁剪区域的宽度，单位为像素
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 裁剪区域的高度，单位为像素 
     * @return Height 裁剪区域的高度，单位为像素
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 裁剪区域的高度，单位为像素
     * @param Height 裁剪区域的高度，单位为像素
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 原图宽度，单位为像素 
     * @return OriginalWidth 原图宽度，单位为像素
     */
    public Long getOriginalWidth() {
        return this.OriginalWidth;
    }

    /**
     * Set 原图宽度，单位为像素
     * @param OriginalWidth 原图宽度，单位为像素
     */
    public void setOriginalWidth(Long OriginalWidth) {
        this.OriginalWidth = OriginalWidth;
    }

    /**
     * Get 原图高度，单位为像素 
     * @return OriginalHeight 原图高度，单位为像素
     */
    public Long getOriginalHeight() {
        return this.OriginalHeight;
    }

    /**
     * Set 原图高度，单位为像素
     * @param OriginalHeight 原图高度，单位为像素
     */
    public void setOriginalHeight(Long OriginalHeight) {
        this.OriginalHeight = OriginalHeight;
    }

    /**
     * Get 0：抠图正常；
1：原图过长，指原图的高度是宽度的1.8倍以上；
2：原图过宽，指原图的宽度是高度的1.8倍以上；
3：抠图区域过长，指抠图的高度是主体备选框高度的1.6倍以上；
4：抠图区域过宽，指当没有检测到人脸时，抠图区域宽度是检测出的原图主体区域宽度的1.6倍以上；
5：纯色图，指裁剪区域视觉较为单一、缺乏主体部分 ；
6：宽高比异常，指Width : Height取值超出[1, 2.5]的范围；

以上是辅助决策的参考建议，可以根据业务需求选择采纳或忽视。 
     * @return CropResult 0：抠图正常；
1：原图过长，指原图的高度是宽度的1.8倍以上；
2：原图过宽，指原图的宽度是高度的1.8倍以上；
3：抠图区域过长，指抠图的高度是主体备选框高度的1.6倍以上；
4：抠图区域过宽，指当没有检测到人脸时，抠图区域宽度是检测出的原图主体区域宽度的1.6倍以上；
5：纯色图，指裁剪区域视觉较为单一、缺乏主体部分 ；
6：宽高比异常，指Width : Height取值超出[1, 2.5]的范围；

以上是辅助决策的参考建议，可以根据业务需求选择采纳或忽视。
     */
    public Long getCropResult() {
        return this.CropResult;
    }

    /**
     * Set 0：抠图正常；
1：原图过长，指原图的高度是宽度的1.8倍以上；
2：原图过宽，指原图的宽度是高度的1.8倍以上；
3：抠图区域过长，指抠图的高度是主体备选框高度的1.6倍以上；
4：抠图区域过宽，指当没有检测到人脸时，抠图区域宽度是检测出的原图主体区域宽度的1.6倍以上；
5：纯色图，指裁剪区域视觉较为单一、缺乏主体部分 ；
6：宽高比异常，指Width : Height取值超出[1, 2.5]的范围；

以上是辅助决策的参考建议，可以根据业务需求选择采纳或忽视。
     * @param CropResult 0：抠图正常；
1：原图过长，指原图的高度是宽度的1.8倍以上；
2：原图过宽，指原图的宽度是高度的1.8倍以上；
3：抠图区域过长，指抠图的高度是主体备选框高度的1.6倍以上；
4：抠图区域过宽，指当没有检测到人脸时，抠图区域宽度是检测出的原图主体区域宽度的1.6倍以上；
5：纯色图，指裁剪区域视觉较为单一、缺乏主体部分 ；
6：宽高比异常，指Width : Height取值超出[1, 2.5]的范围；

以上是辅助决策的参考建议，可以根据业务需求选择采纳或忽视。
     */
    public void setCropResult(Long CropResult) {
        this.CropResult = CropResult;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "OriginalWidth", this.OriginalWidth);
        this.setParamSimple(map, prefix + "OriginalHeight", this.OriginalHeight);
        this.setParamSimple(map, prefix + "CropResult", this.CropResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

