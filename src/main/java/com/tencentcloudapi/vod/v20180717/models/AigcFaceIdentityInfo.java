/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcFaceIdentityInfo extends AbstractModel {

    /**
    * 视频中的人脸 ID。同一个人脸在视频中间隔超过1s时会视作不同 ID。
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * 从视频中截取的人脸示意图。
    */
    @SerializedName("FaceImage")
    @Expose
    private String FaceImage;

    /**
    * 该人脸可对口型区间的起点时间，可作为对口型最佳开始时间。单位：毫秒。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 该人脸可对口型区间的终点时间；注：此结果存在毫秒级误差，会长于实际区间终点。单位：毫秒。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 视频中的人脸 ID。同一个人脸在视频中间隔超过1s时会视作不同 ID。 
     * @return FaceId 视频中的人脸 ID。同一个人脸在视频中间隔超过1s时会视作不同 ID。
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set 视频中的人脸 ID。同一个人脸在视频中间隔超过1s时会视作不同 ID。
     * @param FaceId 视频中的人脸 ID。同一个人脸在视频中间隔超过1s时会视作不同 ID。
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get 从视频中截取的人脸示意图。 
     * @return FaceImage 从视频中截取的人脸示意图。
     */
    public String getFaceImage() {
        return this.FaceImage;
    }

    /**
     * Set 从视频中截取的人脸示意图。
     * @param FaceImage 从视频中截取的人脸示意图。
     */
    public void setFaceImage(String FaceImage) {
        this.FaceImage = FaceImage;
    }

    /**
     * Get 该人脸可对口型区间的起点时间，可作为对口型最佳开始时间。单位：毫秒。 
     * @return StartTime 该人脸可对口型区间的起点时间，可作为对口型最佳开始时间。单位：毫秒。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 该人脸可对口型区间的起点时间，可作为对口型最佳开始时间。单位：毫秒。
     * @param StartTime 该人脸可对口型区间的起点时间，可作为对口型最佳开始时间。单位：毫秒。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 该人脸可对口型区间的终点时间；注：此结果存在毫秒级误差，会长于实际区间终点。单位：毫秒。 
     * @return EndTime 该人脸可对口型区间的终点时间；注：此结果存在毫秒级误差，会长于实际区间终点。单位：毫秒。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 该人脸可对口型区间的终点时间；注：此结果存在毫秒级误差，会长于实际区间终点。单位：毫秒。
     * @param EndTime 该人脸可对口型区间的终点时间；注：此结果存在毫秒级误差，会长于实际区间终点。单位：毫秒。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public AigcFaceIdentityInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcFaceIdentityInfo(AigcFaceIdentityInfo source) {
        if (source.FaceId != null) {
            this.FaceId = new String(source.FaceId);
        }
        if (source.FaceImage != null) {
            this.FaceImage = new String(source.FaceImage);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceId", this.FaceId);
        this.setParamSimple(map, prefix + "FaceImage", this.FaceImage);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

