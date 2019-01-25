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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceInfo  extends AbstractModel{

    /**
    * 人脸框左上角 x。
    */
    @SerializedName("X")
    @Expose
    private Integer X;

    /**
    * 人脸框左上角 y。
    */
    @SerializedName("Y")
    @Expose
    private Integer Y;

    /**
    * 人脸框宽度。
    */
    @SerializedName("Width")
    @Expose
    private Integer Width;

    /**
    * 人脸框高度。
    */
    @SerializedName("Height")
    @Expose
    private Integer Height;

    /**
    * 人脸属性信息，包含性别( gender )、年龄( age )、表情( expression )、 
魅力( beauty )、眼镜( glass )、口罩（mask）、头发（hair）和姿态 (pitch，roll，yaw )。只有当 NeedFaceAttributes 设为 1 时才返回有效信息。
    */
    @SerializedName("FaceAttributesInfo")
    @Expose
    private FaceAttributesInfo FaceAttributesInfo;

    /**
    * 人脸质量信息，包含质量分（score）、模糊分（sharpness）、光照分（brightness）、遮挡分（completeness）。只有当NeedFaceDetection设为1时才返回有效信息。
    */
    @SerializedName("FaceQualityInfo")
    @Expose
    private FaceQualityInfo FaceQualityInfo;

    /**
     * 获取人脸框左上角 x。
     * @return X 人脸框左上角 x。
     */
    public Integer getX() {
        return this.X;
    }

    /**
     * 设置人脸框左上角 x。
     * @param X 人脸框左上角 x。
     */
    public void setX(Integer X) {
        this.X = X;
    }

    /**
     * 获取人脸框左上角 y。
     * @return Y 人脸框左上角 y。
     */
    public Integer getY() {
        return this.Y;
    }

    /**
     * 设置人脸框左上角 y。
     * @param Y 人脸框左上角 y。
     */
    public void setY(Integer Y) {
        this.Y = Y;
    }

    /**
     * 获取人脸框宽度。
     * @return Width 人脸框宽度。
     */
    public Integer getWidth() {
        return this.Width;
    }

    /**
     * 设置人脸框宽度。
     * @param Width 人脸框宽度。
     */
    public void setWidth(Integer Width) {
        this.Width = Width;
    }

    /**
     * 获取人脸框高度。
     * @return Height 人脸框高度。
     */
    public Integer getHeight() {
        return this.Height;
    }

    /**
     * 设置人脸框高度。
     * @param Height 人脸框高度。
     */
    public void setHeight(Integer Height) {
        this.Height = Height;
    }

    /**
     * 获取人脸属性信息，包含性别( gender )、年龄( age )、表情( expression )、 
魅力( beauty )、眼镜( glass )、口罩（mask）、头发（hair）和姿态 (pitch，roll，yaw )。只有当 NeedFaceAttributes 设为 1 时才返回有效信息。
     * @return FaceAttributesInfo 人脸属性信息，包含性别( gender )、年龄( age )、表情( expression )、 
魅力( beauty )、眼镜( glass )、口罩（mask）、头发（hair）和姿态 (pitch，roll，yaw )。只有当 NeedFaceAttributes 设为 1 时才返回有效信息。
     */
    public FaceAttributesInfo getFaceAttributesInfo() {
        return this.FaceAttributesInfo;
    }

    /**
     * 设置人脸属性信息，包含性别( gender )、年龄( age )、表情( expression )、 
魅力( beauty )、眼镜( glass )、口罩（mask）、头发（hair）和姿态 (pitch，roll，yaw )。只有当 NeedFaceAttributes 设为 1 时才返回有效信息。
     * @param FaceAttributesInfo 人脸属性信息，包含性别( gender )、年龄( age )、表情( expression )、 
魅力( beauty )、眼镜( glass )、口罩（mask）、头发（hair）和姿态 (pitch，roll，yaw )。只有当 NeedFaceAttributes 设为 1 时才返回有效信息。
     */
    public void setFaceAttributesInfo(FaceAttributesInfo FaceAttributesInfo) {
        this.FaceAttributesInfo = FaceAttributesInfo;
    }

    /**
     * 获取人脸质量信息，包含质量分（score）、模糊分（sharpness）、光照分（brightness）、遮挡分（completeness）。只有当NeedFaceDetection设为1时才返回有效信息。
     * @return FaceQualityInfo 人脸质量信息，包含质量分（score）、模糊分（sharpness）、光照分（brightness）、遮挡分（completeness）。只有当NeedFaceDetection设为1时才返回有效信息。
     */
    public FaceQualityInfo getFaceQualityInfo() {
        return this.FaceQualityInfo;
    }

    /**
     * 设置人脸质量信息，包含质量分（score）、模糊分（sharpness）、光照分（brightness）、遮挡分（completeness）。只有当NeedFaceDetection设为1时才返回有效信息。
     * @param FaceQualityInfo 人脸质量信息，包含质量分（score）、模糊分（sharpness）、光照分（brightness）、遮挡分（completeness）。只有当NeedFaceDetection设为1时才返回有效信息。
     */
    public void setFaceQualityInfo(FaceQualityInfo FaceQualityInfo) {
        this.FaceQualityInfo = FaceQualityInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamObj(map, prefix + "FaceAttributesInfo.", this.FaceAttributesInfo);
        this.setParamObj(map, prefix + "FaceQualityInfo.", this.FaceQualityInfo);

    }
}

