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

public class ImageTaskResult  extends AbstractModel{

    /**
    * 大教室场景学生肢体动作识别信息
    */
    @SerializedName("ActionInfo")
    @Expose
    private ActionInfo ActionInfo;

    /**
    * 属性识别结果
    */
    @SerializedName("FaceAttr")
    @Expose
    private FaceAttrResult FaceAttr;

    /**
    * 表情识别结果
    */
    @SerializedName("FaceExpression")
    @Expose
    private FaceExpressionResult FaceExpression;

    /**
    * 人脸检索结果
    */
    @SerializedName("FaceIdentify")
    @Expose
    private FaceIdentifyResult FaceIdentify;

    /**
    * 人脸检测结果
    */
    @SerializedName("FaceInfo")
    @Expose
    private FaceInfoResult FaceInfo;

    /**
    * 姿势识别结果
    */
    @SerializedName("FacePose")
    @Expose
    private FacePoseResult FacePose;

    /**
    * 动作分类结果
    */
    @SerializedName("Gesture")
    @Expose
    private GestureResult Gesture;

    /**
    * 手势分类结果
    */
    @SerializedName("HandTracking")
    @Expose
    private HandTrackingResult HandTracking;

    /**
    * 光照识别结果
    */
    @SerializedName("Light")
    @Expose
    private LightResult Light;

    /**
    * 学生肢体动作识别结果
    */
    @SerializedName("StudentBodyMovement")
    @Expose
    private StudentBodyMovementResult StudentBodyMovement;

    /**
    * 老师肢体动作识别结果
    */
    @SerializedName("TeacherBodyMovement")
    @Expose
    private BodyMovementResult TeacherBodyMovement;

    /**
    * 教师是否在屏幕内判断结果
    */
    @SerializedName("TeacherOutScreen")
    @Expose
    private TeacherOutScreenResult TeacherOutScreen;

    /**
    * 时间统计结果
    */
    @SerializedName("TimeInfo")
    @Expose
    private TimeInfoResult TimeInfo;

    /**
     * 获取大教室场景学生肢体动作识别信息
     * @return ActionInfo 大教室场景学生肢体动作识别信息
     */
    public ActionInfo getActionInfo() {
        return this.ActionInfo;
    }

    /**
     * 设置大教室场景学生肢体动作识别信息
     * @param ActionInfo 大教室场景学生肢体动作识别信息
     */
    public void setActionInfo(ActionInfo ActionInfo) {
        this.ActionInfo = ActionInfo;
    }

    /**
     * 获取属性识别结果
     * @return FaceAttr 属性识别结果
     */
    public FaceAttrResult getFaceAttr() {
        return this.FaceAttr;
    }

    /**
     * 设置属性识别结果
     * @param FaceAttr 属性识别结果
     */
    public void setFaceAttr(FaceAttrResult FaceAttr) {
        this.FaceAttr = FaceAttr;
    }

    /**
     * 获取表情识别结果
     * @return FaceExpression 表情识别结果
     */
    public FaceExpressionResult getFaceExpression() {
        return this.FaceExpression;
    }

    /**
     * 设置表情识别结果
     * @param FaceExpression 表情识别结果
     */
    public void setFaceExpression(FaceExpressionResult FaceExpression) {
        this.FaceExpression = FaceExpression;
    }

    /**
     * 获取人脸检索结果
     * @return FaceIdentify 人脸检索结果
     */
    public FaceIdentifyResult getFaceIdentify() {
        return this.FaceIdentify;
    }

    /**
     * 设置人脸检索结果
     * @param FaceIdentify 人脸检索结果
     */
    public void setFaceIdentify(FaceIdentifyResult FaceIdentify) {
        this.FaceIdentify = FaceIdentify;
    }

    /**
     * 获取人脸检测结果
     * @return FaceInfo 人脸检测结果
     */
    public FaceInfoResult getFaceInfo() {
        return this.FaceInfo;
    }

    /**
     * 设置人脸检测结果
     * @param FaceInfo 人脸检测结果
     */
    public void setFaceInfo(FaceInfoResult FaceInfo) {
        this.FaceInfo = FaceInfo;
    }

    /**
     * 获取姿势识别结果
     * @return FacePose 姿势识别结果
     */
    public FacePoseResult getFacePose() {
        return this.FacePose;
    }

    /**
     * 设置姿势识别结果
     * @param FacePose 姿势识别结果
     */
    public void setFacePose(FacePoseResult FacePose) {
        this.FacePose = FacePose;
    }

    /**
     * 获取动作分类结果
     * @return Gesture 动作分类结果
     */
    public GestureResult getGesture() {
        return this.Gesture;
    }

    /**
     * 设置动作分类结果
     * @param Gesture 动作分类结果
     */
    public void setGesture(GestureResult Gesture) {
        this.Gesture = Gesture;
    }

    /**
     * 获取手势分类结果
     * @return HandTracking 手势分类结果
     */
    public HandTrackingResult getHandTracking() {
        return this.HandTracking;
    }

    /**
     * 设置手势分类结果
     * @param HandTracking 手势分类结果
     */
    public void setHandTracking(HandTrackingResult HandTracking) {
        this.HandTracking = HandTracking;
    }

    /**
     * 获取光照识别结果
     * @return Light 光照识别结果
     */
    public LightResult getLight() {
        return this.Light;
    }

    /**
     * 设置光照识别结果
     * @param Light 光照识别结果
     */
    public void setLight(LightResult Light) {
        this.Light = Light;
    }

    /**
     * 获取学生肢体动作识别结果
     * @return StudentBodyMovement 学生肢体动作识别结果
     */
    public StudentBodyMovementResult getStudentBodyMovement() {
        return this.StudentBodyMovement;
    }

    /**
     * 设置学生肢体动作识别结果
     * @param StudentBodyMovement 学生肢体动作识别结果
     */
    public void setStudentBodyMovement(StudentBodyMovementResult StudentBodyMovement) {
        this.StudentBodyMovement = StudentBodyMovement;
    }

    /**
     * 获取老师肢体动作识别结果
     * @return TeacherBodyMovement 老师肢体动作识别结果
     */
    public BodyMovementResult getTeacherBodyMovement() {
        return this.TeacherBodyMovement;
    }

    /**
     * 设置老师肢体动作识别结果
     * @param TeacherBodyMovement 老师肢体动作识别结果
     */
    public void setTeacherBodyMovement(BodyMovementResult TeacherBodyMovement) {
        this.TeacherBodyMovement = TeacherBodyMovement;
    }

    /**
     * 获取教师是否在屏幕内判断结果
     * @return TeacherOutScreen 教师是否在屏幕内判断结果
     */
    public TeacherOutScreenResult getTeacherOutScreen() {
        return this.TeacherOutScreen;
    }

    /**
     * 设置教师是否在屏幕内判断结果
     * @param TeacherOutScreen 教师是否在屏幕内判断结果
     */
    public void setTeacherOutScreen(TeacherOutScreenResult TeacherOutScreen) {
        this.TeacherOutScreen = TeacherOutScreen;
    }

    /**
     * 获取时间统计结果
     * @return TimeInfo 时间统计结果
     */
    public TimeInfoResult getTimeInfo() {
        return this.TimeInfo;
    }

    /**
     * 设置时间统计结果
     * @param TimeInfo 时间统计结果
     */
    public void setTimeInfo(TimeInfoResult TimeInfo) {
        this.TimeInfo = TimeInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ActionInfo.", this.ActionInfo);
        this.setParamObj(map, prefix + "FaceAttr.", this.FaceAttr);
        this.setParamObj(map, prefix + "FaceExpression.", this.FaceExpression);
        this.setParamObj(map, prefix + "FaceIdentify.", this.FaceIdentify);
        this.setParamObj(map, prefix + "FaceInfo.", this.FaceInfo);
        this.setParamObj(map, prefix + "FacePose.", this.FacePose);
        this.setParamObj(map, prefix + "Gesture.", this.Gesture);
        this.setParamObj(map, prefix + "HandTracking.", this.HandTracking);
        this.setParamObj(map, prefix + "Light.", this.Light);
        this.setParamObj(map, prefix + "StudentBodyMovement.", this.StudentBodyMovement);
        this.setParamObj(map, prefix + "TeacherBodyMovement.", this.TeacherBodyMovement);
        this.setParamObj(map, prefix + "TeacherOutScreen.", this.TeacherOutScreen);
        this.setParamObj(map, prefix + "TimeInfo.", this.TimeInfo);

    }
}

