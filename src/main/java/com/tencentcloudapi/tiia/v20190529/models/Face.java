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

public class Face  extends AbstractModel{

    /**
    * 与图片中人脸最相似的公众人物的名字。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 公众人物身份标签的数组，一个公众人物可能有多个身份标签。
    */
    @SerializedName("Labels")
    @Expose
    private Labels [] Labels;

    /**
    * 对人物的简介。
    */
    @SerializedName("BasicInfo")
    @Expose
    private String BasicInfo;

    /**
    * 算法对于Name的置信度（图像中人脸与公众人物的相似度），0-100之间，值越高，表示对于Name越确定。
当Confidence低于70分时，Name仅供参考。您可以根据业务实际情况调整阈值。
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 人脸区域左上角横坐标。
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 人脸区域左上角纵坐标。
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 人脸区域宽度。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 人脸区域高度。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * 获取与图片中人脸最相似的公众人物的名字。
     * @return Name 与图片中人脸最相似的公众人物的名字。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置与图片中人脸最相似的公众人物的名字。
     * @param Name 与图片中人脸最相似的公众人物的名字。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取公众人物身份标签的数组，一个公众人物可能有多个身份标签。
     * @return Labels 公众人物身份标签的数组，一个公众人物可能有多个身份标签。
     */
    public Labels [] getLabels() {
        return this.Labels;
    }

    /**
     * 设置公众人物身份标签的数组，一个公众人物可能有多个身份标签。
     * @param Labels 公众人物身份标签的数组，一个公众人物可能有多个身份标签。
     */
    public void setLabels(Labels [] Labels) {
        this.Labels = Labels;
    }

    /**
     * 获取对人物的简介。
     * @return BasicInfo 对人物的简介。
     */
    public String getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * 设置对人物的简介。
     * @param BasicInfo 对人物的简介。
     */
    public void setBasicInfo(String BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * 获取算法对于Name的置信度（图像中人脸与公众人物的相似度），0-100之间，值越高，表示对于Name越确定。
当Confidence低于70分时，Name仅供参考。您可以根据业务实际情况调整阈值。
     * @return Confidence 算法对于Name的置信度（图像中人脸与公众人物的相似度），0-100之间，值越高，表示对于Name越确定。
当Confidence低于70分时，Name仅供参考。您可以根据业务实际情况调整阈值。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置算法对于Name的置信度（图像中人脸与公众人物的相似度），0-100之间，值越高，表示对于Name越确定。
当Confidence低于70分时，Name仅供参考。您可以根据业务实际情况调整阈值。
     * @param Confidence 算法对于Name的置信度（图像中人脸与公众人物的相似度），0-100之间，值越高，表示对于Name越确定。
当Confidence低于70分时，Name仅供参考。您可以根据业务实际情况调整阈值。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 获取人脸区域左上角横坐标。
     * @return X 人脸区域左上角横坐标。
     */
    public Long getX() {
        return this.X;
    }

    /**
     * 设置人脸区域左上角横坐标。
     * @param X 人脸区域左上角横坐标。
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * 获取人脸区域左上角纵坐标。
     * @return Y 人脸区域左上角纵坐标。
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * 设置人脸区域左上角纵坐标。
     * @param Y 人脸区域左上角纵坐标。
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * 获取人脸区域宽度。
     * @return Width 人脸区域宽度。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * 设置人脸区域宽度。
     * @param Width 人脸区域宽度。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * 获取人脸区域高度。
     * @return Height 人脸区域高度。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * 设置人脸区域高度。
     * @param Height 人脸区域高度。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "BasicInfo", this.BasicInfo);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

