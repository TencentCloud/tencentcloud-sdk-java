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

public class ImageTaskFunction  extends AbstractModel{

    /**
    * 大教室场景肢体动作识别选项
    */
    @SerializedName("EnableActionClass")
    @Expose
    private Boolean EnableActionClass;

    /**
    * 人脸检测选项
    */
    @SerializedName("EnableFaceDetect")
    @Expose
    private Boolean EnableFaceDetect;

    /**
    * 人脸表情识别选项
    */
    @SerializedName("EnableFaceExpression")
    @Expose
    private Boolean EnableFaceExpression;

    /**
    * 人脸检索选项
    */
    @SerializedName("EnableFaceIdentify")
    @Expose
    private Boolean EnableFaceIdentify;

    /**
    * 动作选项
    */
    @SerializedName("EnableGesture")
    @Expose
    private Boolean EnableGesture;

    /**
    * 手势选项
    */
    @SerializedName("EnableHandTracking")
    @Expose
    private Boolean EnableHandTracking;

    /**
    * 光照选项
    */
    @SerializedName("EnableLightJudge")
    @Expose
    private Boolean EnableLightJudge;

    /**
    * 学生动作选项
    */
    @SerializedName("EnableStudentBodyMovements")
    @Expose
    private Boolean EnableStudentBodyMovements;

    /**
    * 教师动作选项
    */
    @SerializedName("EnableTeacherBodyMovements")
    @Expose
    private Boolean EnableTeacherBodyMovements;

    /**
     * 获取大教室场景肢体动作识别选项
     * @return EnableActionClass 大教室场景肢体动作识别选项
     */
    public Boolean getEnableActionClass() {
        return this.EnableActionClass;
    }

    /**
     * 设置大教室场景肢体动作识别选项
     * @param EnableActionClass 大教室场景肢体动作识别选项
     */
    public void setEnableActionClass(Boolean EnableActionClass) {
        this.EnableActionClass = EnableActionClass;
    }

    /**
     * 获取人脸检测选项
     * @return EnableFaceDetect 人脸检测选项
     */
    public Boolean getEnableFaceDetect() {
        return this.EnableFaceDetect;
    }

    /**
     * 设置人脸检测选项
     * @param EnableFaceDetect 人脸检测选项
     */
    public void setEnableFaceDetect(Boolean EnableFaceDetect) {
        this.EnableFaceDetect = EnableFaceDetect;
    }

    /**
     * 获取人脸表情识别选项
     * @return EnableFaceExpression 人脸表情识别选项
     */
    public Boolean getEnableFaceExpression() {
        return this.EnableFaceExpression;
    }

    /**
     * 设置人脸表情识别选项
     * @param EnableFaceExpression 人脸表情识别选项
     */
    public void setEnableFaceExpression(Boolean EnableFaceExpression) {
        this.EnableFaceExpression = EnableFaceExpression;
    }

    /**
     * 获取人脸检索选项
     * @return EnableFaceIdentify 人脸检索选项
     */
    public Boolean getEnableFaceIdentify() {
        return this.EnableFaceIdentify;
    }

    /**
     * 设置人脸检索选项
     * @param EnableFaceIdentify 人脸检索选项
     */
    public void setEnableFaceIdentify(Boolean EnableFaceIdentify) {
        this.EnableFaceIdentify = EnableFaceIdentify;
    }

    /**
     * 获取动作选项
     * @return EnableGesture 动作选项
     */
    public Boolean getEnableGesture() {
        return this.EnableGesture;
    }

    /**
     * 设置动作选项
     * @param EnableGesture 动作选项
     */
    public void setEnableGesture(Boolean EnableGesture) {
        this.EnableGesture = EnableGesture;
    }

    /**
     * 获取手势选项
     * @return EnableHandTracking 手势选项
     */
    public Boolean getEnableHandTracking() {
        return this.EnableHandTracking;
    }

    /**
     * 设置手势选项
     * @param EnableHandTracking 手势选项
     */
    public void setEnableHandTracking(Boolean EnableHandTracking) {
        this.EnableHandTracking = EnableHandTracking;
    }

    /**
     * 获取光照选项
     * @return EnableLightJudge 光照选项
     */
    public Boolean getEnableLightJudge() {
        return this.EnableLightJudge;
    }

    /**
     * 设置光照选项
     * @param EnableLightJudge 光照选项
     */
    public void setEnableLightJudge(Boolean EnableLightJudge) {
        this.EnableLightJudge = EnableLightJudge;
    }

    /**
     * 获取学生动作选项
     * @return EnableStudentBodyMovements 学生动作选项
     */
    public Boolean getEnableStudentBodyMovements() {
        return this.EnableStudentBodyMovements;
    }

    /**
     * 设置学生动作选项
     * @param EnableStudentBodyMovements 学生动作选项
     */
    public void setEnableStudentBodyMovements(Boolean EnableStudentBodyMovements) {
        this.EnableStudentBodyMovements = EnableStudentBodyMovements;
    }

    /**
     * 获取教师动作选项
     * @return EnableTeacherBodyMovements 教师动作选项
     */
    public Boolean getEnableTeacherBodyMovements() {
        return this.EnableTeacherBodyMovements;
    }

    /**
     * 设置教师动作选项
     * @param EnableTeacherBodyMovements 教师动作选项
     */
    public void setEnableTeacherBodyMovements(Boolean EnableTeacherBodyMovements) {
        this.EnableTeacherBodyMovements = EnableTeacherBodyMovements;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableActionClass", this.EnableActionClass);
        this.setParamSimple(map, prefix + "EnableFaceDetect", this.EnableFaceDetect);
        this.setParamSimple(map, prefix + "EnableFaceExpression", this.EnableFaceExpression);
        this.setParamSimple(map, prefix + "EnableFaceIdentify", this.EnableFaceIdentify);
        this.setParamSimple(map, prefix + "EnableGesture", this.EnableGesture);
        this.setParamSimple(map, prefix + "EnableHandTracking", this.EnableHandTracking);
        this.setParamSimple(map, prefix + "EnableLightJudge", this.EnableLightJudge);
        this.setParamSimple(map, prefix + "EnableStudentBodyMovements", this.EnableStudentBodyMovements);
        this.setParamSimple(map, prefix + "EnableTeacherBodyMovements", this.EnableTeacherBodyMovements);

    }
}

