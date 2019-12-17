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

public class FaceShape extends AbstractModel{

    /**
    * 描述脸型轮廓的 21 点。
    */
    @SerializedName("FaceProfile")
    @Expose
    private Point [] FaceProfile;

    /**
    * 描述左侧眼睛轮廓的 8 点。
    */
    @SerializedName("LeftEye")
    @Expose
    private Point [] LeftEye;

    /**
    * 描述右侧眼睛轮廓的 8 点。
    */
    @SerializedName("RightEye")
    @Expose
    private Point [] RightEye;

    /**
    * 描述左侧眉毛轮廓的 8 点。
    */
    @SerializedName("LeftEyeBrow")
    @Expose
    private Point [] LeftEyeBrow;

    /**
    * 描述右侧眉毛轮廓的 8 点。
    */
    @SerializedName("RightEyeBrow")
    @Expose
    private Point [] RightEyeBrow;

    /**
    * 描述嘴巴轮廓的 22 点。
    */
    @SerializedName("Mouth")
    @Expose
    private Point [] Mouth;

    /**
    * 描述鼻子轮廓的 13 点。
    */
    @SerializedName("Nose")
    @Expose
    private Point [] Nose;

    /**
    * 左瞳孔轮廓的 1 个点。
    */
    @SerializedName("LeftPupil")
    @Expose
    private Point [] LeftPupil;

    /**
    * 右瞳孔轮廓的 1 个点。
    */
    @SerializedName("RightPupil")
    @Expose
    private Point [] RightPupil;

    /**
     * Get 描述脸型轮廓的 21 点。 
     * @return FaceProfile 描述脸型轮廓的 21 点。
     */
    public Point [] getFaceProfile() {
        return this.FaceProfile;
    }

    /**
     * Set 描述脸型轮廓的 21 点。
     * @param FaceProfile 描述脸型轮廓的 21 点。
     */
    public void setFaceProfile(Point [] FaceProfile) {
        this.FaceProfile = FaceProfile;
    }

    /**
     * Get 描述左侧眼睛轮廓的 8 点。 
     * @return LeftEye 描述左侧眼睛轮廓的 8 点。
     */
    public Point [] getLeftEye() {
        return this.LeftEye;
    }

    /**
     * Set 描述左侧眼睛轮廓的 8 点。
     * @param LeftEye 描述左侧眼睛轮廓的 8 点。
     */
    public void setLeftEye(Point [] LeftEye) {
        this.LeftEye = LeftEye;
    }

    /**
     * Get 描述右侧眼睛轮廓的 8 点。 
     * @return RightEye 描述右侧眼睛轮廓的 8 点。
     */
    public Point [] getRightEye() {
        return this.RightEye;
    }

    /**
     * Set 描述右侧眼睛轮廓的 8 点。
     * @param RightEye 描述右侧眼睛轮廓的 8 点。
     */
    public void setRightEye(Point [] RightEye) {
        this.RightEye = RightEye;
    }

    /**
     * Get 描述左侧眉毛轮廓的 8 点。 
     * @return LeftEyeBrow 描述左侧眉毛轮廓的 8 点。
     */
    public Point [] getLeftEyeBrow() {
        return this.LeftEyeBrow;
    }

    /**
     * Set 描述左侧眉毛轮廓的 8 点。
     * @param LeftEyeBrow 描述左侧眉毛轮廓的 8 点。
     */
    public void setLeftEyeBrow(Point [] LeftEyeBrow) {
        this.LeftEyeBrow = LeftEyeBrow;
    }

    /**
     * Get 描述右侧眉毛轮廓的 8 点。 
     * @return RightEyeBrow 描述右侧眉毛轮廓的 8 点。
     */
    public Point [] getRightEyeBrow() {
        return this.RightEyeBrow;
    }

    /**
     * Set 描述右侧眉毛轮廓的 8 点。
     * @param RightEyeBrow 描述右侧眉毛轮廓的 8 点。
     */
    public void setRightEyeBrow(Point [] RightEyeBrow) {
        this.RightEyeBrow = RightEyeBrow;
    }

    /**
     * Get 描述嘴巴轮廓的 22 点。 
     * @return Mouth 描述嘴巴轮廓的 22 点。
     */
    public Point [] getMouth() {
        return this.Mouth;
    }

    /**
     * Set 描述嘴巴轮廓的 22 点。
     * @param Mouth 描述嘴巴轮廓的 22 点。
     */
    public void setMouth(Point [] Mouth) {
        this.Mouth = Mouth;
    }

    /**
     * Get 描述鼻子轮廓的 13 点。 
     * @return Nose 描述鼻子轮廓的 13 点。
     */
    public Point [] getNose() {
        return this.Nose;
    }

    /**
     * Set 描述鼻子轮廓的 13 点。
     * @param Nose 描述鼻子轮廓的 13 点。
     */
    public void setNose(Point [] Nose) {
        this.Nose = Nose;
    }

    /**
     * Get 左瞳孔轮廓的 1 个点。 
     * @return LeftPupil 左瞳孔轮廓的 1 个点。
     */
    public Point [] getLeftPupil() {
        return this.LeftPupil;
    }

    /**
     * Set 左瞳孔轮廓的 1 个点。
     * @param LeftPupil 左瞳孔轮廓的 1 个点。
     */
    public void setLeftPupil(Point [] LeftPupil) {
        this.LeftPupil = LeftPupil;
    }

    /**
     * Get 右瞳孔轮廓的 1 个点。 
     * @return RightPupil 右瞳孔轮廓的 1 个点。
     */
    public Point [] getRightPupil() {
        return this.RightPupil;
    }

    /**
     * Set 右瞳孔轮廓的 1 个点。
     * @param RightPupil 右瞳孔轮廓的 1 个点。
     */
    public void setRightPupil(Point [] RightPupil) {
        this.RightPupil = RightPupil;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FaceProfile.", this.FaceProfile);
        this.setParamArrayObj(map, prefix + "LeftEye.", this.LeftEye);
        this.setParamArrayObj(map, prefix + "RightEye.", this.RightEye);
        this.setParamArrayObj(map, prefix + "LeftEyeBrow.", this.LeftEyeBrow);
        this.setParamArrayObj(map, prefix + "RightEyeBrow.", this.RightEyeBrow);
        this.setParamArrayObj(map, prefix + "Mouth.", this.Mouth);
        this.setParamArrayObj(map, prefix + "Nose.", this.Nose);
        this.setParamArrayObj(map, prefix + "LeftPupil.", this.LeftPupil);
        this.setParamArrayObj(map, prefix + "RightPupil.", this.RightPupil);

    }
}

