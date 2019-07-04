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

public class ImageTaskStatistic  extends AbstractModel{

    /**
    * 人员检测统计信息
    */
    @SerializedName("FaceDetect")
    @Expose
    private FaceDetectStatistic [] FaceDetect;

    /**
    * 人脸表情统计信息
    */
    @SerializedName("FaceExpression")
    @Expose
    private FaceExpressStatistic [] FaceExpression;

    /**
    * 人脸检索统计信息
    */
    @SerializedName("FaceIdentify")
    @Expose
    private FaceIdentifyStatistic [] FaceIdentify;

    /**
    * 姿势识别统计信息
    */
    @SerializedName("Gesture")
    @Expose
    private ActionStatistic Gesture;

    /**
    * 手势识别统计信息
    */
    @SerializedName("Handtracking")
    @Expose
    private ActionStatistic Handtracking;

    /**
    * 光照统计信息
    */
    @SerializedName("Light")
    @Expose
    private LightStatistic Light;

    /**
    * 学生动作统计信息
    */
    @SerializedName("StudentMovement")
    @Expose
    private ActionStatistic StudentMovement;

    /**
    * 教师动作统计信息
    */
    @SerializedName("TeacherMovement")
    @Expose
    private ActionStatistic TeacherMovement;

    /**
     * 获取人员检测统计信息
     * @return FaceDetect 人员检测统计信息
     */
    public FaceDetectStatistic [] getFaceDetect() {
        return this.FaceDetect;
    }

    /**
     * 设置人员检测统计信息
     * @param FaceDetect 人员检测统计信息
     */
    public void setFaceDetect(FaceDetectStatistic [] FaceDetect) {
        this.FaceDetect = FaceDetect;
    }

    /**
     * 获取人脸表情统计信息
     * @return FaceExpression 人脸表情统计信息
     */
    public FaceExpressStatistic [] getFaceExpression() {
        return this.FaceExpression;
    }

    /**
     * 设置人脸表情统计信息
     * @param FaceExpression 人脸表情统计信息
     */
    public void setFaceExpression(FaceExpressStatistic [] FaceExpression) {
        this.FaceExpression = FaceExpression;
    }

    /**
     * 获取人脸检索统计信息
     * @return FaceIdentify 人脸检索统计信息
     */
    public FaceIdentifyStatistic [] getFaceIdentify() {
        return this.FaceIdentify;
    }

    /**
     * 设置人脸检索统计信息
     * @param FaceIdentify 人脸检索统计信息
     */
    public void setFaceIdentify(FaceIdentifyStatistic [] FaceIdentify) {
        this.FaceIdentify = FaceIdentify;
    }

    /**
     * 获取姿势识别统计信息
     * @return Gesture 姿势识别统计信息
     */
    public ActionStatistic getGesture() {
        return this.Gesture;
    }

    /**
     * 设置姿势识别统计信息
     * @param Gesture 姿势识别统计信息
     */
    public void setGesture(ActionStatistic Gesture) {
        this.Gesture = Gesture;
    }

    /**
     * 获取手势识别统计信息
     * @return Handtracking 手势识别统计信息
     */
    public ActionStatistic getHandtracking() {
        return this.Handtracking;
    }

    /**
     * 设置手势识别统计信息
     * @param Handtracking 手势识别统计信息
     */
    public void setHandtracking(ActionStatistic Handtracking) {
        this.Handtracking = Handtracking;
    }

    /**
     * 获取光照统计信息
     * @return Light 光照统计信息
     */
    public LightStatistic getLight() {
        return this.Light;
    }

    /**
     * 设置光照统计信息
     * @param Light 光照统计信息
     */
    public void setLight(LightStatistic Light) {
        this.Light = Light;
    }

    /**
     * 获取学生动作统计信息
     * @return StudentMovement 学生动作统计信息
     */
    public ActionStatistic getStudentMovement() {
        return this.StudentMovement;
    }

    /**
     * 设置学生动作统计信息
     * @param StudentMovement 学生动作统计信息
     */
    public void setStudentMovement(ActionStatistic StudentMovement) {
        this.StudentMovement = StudentMovement;
    }

    /**
     * 获取教师动作统计信息
     * @return TeacherMovement 教师动作统计信息
     */
    public ActionStatistic getTeacherMovement() {
        return this.TeacherMovement;
    }

    /**
     * 设置教师动作统计信息
     * @param TeacherMovement 教师动作统计信息
     */
    public void setTeacherMovement(ActionStatistic TeacherMovement) {
        this.TeacherMovement = TeacherMovement;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FaceDetect.", this.FaceDetect);
        this.setParamArrayObj(map, prefix + "FaceExpression.", this.FaceExpression);
        this.setParamArrayObj(map, prefix + "FaceIdentify.", this.FaceIdentify);
        this.setParamObj(map, prefix + "Gesture.", this.Gesture);
        this.setParamObj(map, prefix + "Handtracking.", this.Handtracking);
        this.setParamObj(map, prefix + "Light.", this.Light);
        this.setParamObj(map, prefix + "StudentMovement.", this.StudentMovement);
        this.setParamObj(map, prefix + "TeacherMovement.", this.TeacherMovement);

    }
}

