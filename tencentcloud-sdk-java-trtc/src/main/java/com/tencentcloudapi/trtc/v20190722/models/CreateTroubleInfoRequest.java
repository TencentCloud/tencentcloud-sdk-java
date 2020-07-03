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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTroubleInfoRequest extends AbstractModel{

    /**
    * 应用的ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 房间ID
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 老师用户ID
    */
    @SerializedName("TeacherUserId")
    @Expose
    private String TeacherUserId;

    /**
    * 学生用户ID
    */
    @SerializedName("StudentUserId")
    @Expose
    private String StudentUserId;

    /**
    * 体验异常端（老师或学生）的用户 ID。
    */
    @SerializedName("TroubleUserId")
    @Expose
    private String TroubleUserId;

    /**
    * 异常类型。
1. 仅视频异常
2. 仅声音异常
3. 音视频都异常
5. 进房异常
4. 切课
6. 求助
7. 问题反馈
8. 投诉
    */
    @SerializedName("TroubleType")
    @Expose
    private Long TroubleType;

    /**
    * 异常发生的UNIX 时间戳，单位为秒。
    */
    @SerializedName("TroubleTime")
    @Expose
    private Long TroubleTime;

    /**
    * 异常详情
    */
    @SerializedName("TroubleMsg")
    @Expose
    private String TroubleMsg;

    /**
     * Get 应用的ID 
     * @return SdkAppId 应用的ID
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用的ID
     * @param SdkAppId 应用的ID
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 房间ID 
     * @return RoomId 房间ID
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间ID
     * @param RoomId 房间ID
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 老师用户ID 
     * @return TeacherUserId 老师用户ID
     */
    public String getTeacherUserId() {
        return this.TeacherUserId;
    }

    /**
     * Set 老师用户ID
     * @param TeacherUserId 老师用户ID
     */
    public void setTeacherUserId(String TeacherUserId) {
        this.TeacherUserId = TeacherUserId;
    }

    /**
     * Get 学生用户ID 
     * @return StudentUserId 学生用户ID
     */
    public String getStudentUserId() {
        return this.StudentUserId;
    }

    /**
     * Set 学生用户ID
     * @param StudentUserId 学生用户ID
     */
    public void setStudentUserId(String StudentUserId) {
        this.StudentUserId = StudentUserId;
    }

    /**
     * Get 体验异常端（老师或学生）的用户 ID。 
     * @return TroubleUserId 体验异常端（老师或学生）的用户 ID。
     */
    public String getTroubleUserId() {
        return this.TroubleUserId;
    }

    /**
     * Set 体验异常端（老师或学生）的用户 ID。
     * @param TroubleUserId 体验异常端（老师或学生）的用户 ID。
     */
    public void setTroubleUserId(String TroubleUserId) {
        this.TroubleUserId = TroubleUserId;
    }

    /**
     * Get 异常类型。
1. 仅视频异常
2. 仅声音异常
3. 音视频都异常
5. 进房异常
4. 切课
6. 求助
7. 问题反馈
8. 投诉 
     * @return TroubleType 异常类型。
1. 仅视频异常
2. 仅声音异常
3. 音视频都异常
5. 进房异常
4. 切课
6. 求助
7. 问题反馈
8. 投诉
     */
    public Long getTroubleType() {
        return this.TroubleType;
    }

    /**
     * Set 异常类型。
1. 仅视频异常
2. 仅声音异常
3. 音视频都异常
5. 进房异常
4. 切课
6. 求助
7. 问题反馈
8. 投诉
     * @param TroubleType 异常类型。
1. 仅视频异常
2. 仅声音异常
3. 音视频都异常
5. 进房异常
4. 切课
6. 求助
7. 问题反馈
8. 投诉
     */
    public void setTroubleType(Long TroubleType) {
        this.TroubleType = TroubleType;
    }

    /**
     * Get 异常发生的UNIX 时间戳，单位为秒。 
     * @return TroubleTime 异常发生的UNIX 时间戳，单位为秒。
     */
    public Long getTroubleTime() {
        return this.TroubleTime;
    }

    /**
     * Set 异常发生的UNIX 时间戳，单位为秒。
     * @param TroubleTime 异常发生的UNIX 时间戳，单位为秒。
     */
    public void setTroubleTime(Long TroubleTime) {
        this.TroubleTime = TroubleTime;
    }

    /**
     * Get 异常详情 
     * @return TroubleMsg 异常详情
     */
    public String getTroubleMsg() {
        return this.TroubleMsg;
    }

    /**
     * Set 异常详情
     * @param TroubleMsg 异常详情
     */
    public void setTroubleMsg(String TroubleMsg) {
        this.TroubleMsg = TroubleMsg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "TeacherUserId", this.TeacherUserId);
        this.setParamSimple(map, prefix + "StudentUserId", this.StudentUserId);
        this.setParamSimple(map, prefix + "TroubleUserId", this.TroubleUserId);
        this.setParamSimple(map, prefix + "TroubleType", this.TroubleType);
        this.setParamSimple(map, prefix + "TroubleTime", this.TroubleTime);
        this.setParamSimple(map, prefix + "TroubleMsg", this.TroubleMsg);

    }
}

