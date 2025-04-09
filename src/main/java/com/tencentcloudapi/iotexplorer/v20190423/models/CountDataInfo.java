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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CountDataInfo extends AbstractModel {

    /**
    * 视频上报异常次数
    */
    @SerializedName("VideoExceptionNum")
    @Expose
    private Long VideoExceptionNum;

    /**
    * 视频上报成功次数
    */
    @SerializedName("VideoSuccessNum")
    @Expose
    private Long VideoSuccessNum;

    /**
    * 视频上报成功率

    */
    @SerializedName("VideoSuccessRate")
    @Expose
    private String VideoSuccessRate;

    /**
    * 事件上报异常次数
    */
    @SerializedName("EventExceptionNum")
    @Expose
    private Long EventExceptionNum;

    /**
    * 事件上报成功次数
    */
    @SerializedName("EventSuccessNum")
    @Expose
    private Long EventSuccessNum;

    /**
    * 事件上报成功率
    */
    @SerializedName("EventSuccessRate")
    @Expose
    private String EventSuccessRate;

    /**
     * Get 视频上报异常次数 
     * @return VideoExceptionNum 视频上报异常次数
     */
    public Long getVideoExceptionNum() {
        return this.VideoExceptionNum;
    }

    /**
     * Set 视频上报异常次数
     * @param VideoExceptionNum 视频上报异常次数
     */
    public void setVideoExceptionNum(Long VideoExceptionNum) {
        this.VideoExceptionNum = VideoExceptionNum;
    }

    /**
     * Get 视频上报成功次数 
     * @return VideoSuccessNum 视频上报成功次数
     */
    public Long getVideoSuccessNum() {
        return this.VideoSuccessNum;
    }

    /**
     * Set 视频上报成功次数
     * @param VideoSuccessNum 视频上报成功次数
     */
    public void setVideoSuccessNum(Long VideoSuccessNum) {
        this.VideoSuccessNum = VideoSuccessNum;
    }

    /**
     * Get 视频上报成功率
 
     * @return VideoSuccessRate 视频上报成功率

     */
    public String getVideoSuccessRate() {
        return this.VideoSuccessRate;
    }

    /**
     * Set 视频上报成功率

     * @param VideoSuccessRate 视频上报成功率

     */
    public void setVideoSuccessRate(String VideoSuccessRate) {
        this.VideoSuccessRate = VideoSuccessRate;
    }

    /**
     * Get 事件上报异常次数 
     * @return EventExceptionNum 事件上报异常次数
     */
    public Long getEventExceptionNum() {
        return this.EventExceptionNum;
    }

    /**
     * Set 事件上报异常次数
     * @param EventExceptionNum 事件上报异常次数
     */
    public void setEventExceptionNum(Long EventExceptionNum) {
        this.EventExceptionNum = EventExceptionNum;
    }

    /**
     * Get 事件上报成功次数 
     * @return EventSuccessNum 事件上报成功次数
     */
    public Long getEventSuccessNum() {
        return this.EventSuccessNum;
    }

    /**
     * Set 事件上报成功次数
     * @param EventSuccessNum 事件上报成功次数
     */
    public void setEventSuccessNum(Long EventSuccessNum) {
        this.EventSuccessNum = EventSuccessNum;
    }

    /**
     * Get 事件上报成功率 
     * @return EventSuccessRate 事件上报成功率
     */
    public String getEventSuccessRate() {
        return this.EventSuccessRate;
    }

    /**
     * Set 事件上报成功率
     * @param EventSuccessRate 事件上报成功率
     */
    public void setEventSuccessRate(String EventSuccessRate) {
        this.EventSuccessRate = EventSuccessRate;
    }

    public CountDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CountDataInfo(CountDataInfo source) {
        if (source.VideoExceptionNum != null) {
            this.VideoExceptionNum = new Long(source.VideoExceptionNum);
        }
        if (source.VideoSuccessNum != null) {
            this.VideoSuccessNum = new Long(source.VideoSuccessNum);
        }
        if (source.VideoSuccessRate != null) {
            this.VideoSuccessRate = new String(source.VideoSuccessRate);
        }
        if (source.EventExceptionNum != null) {
            this.EventExceptionNum = new Long(source.EventExceptionNum);
        }
        if (source.EventSuccessNum != null) {
            this.EventSuccessNum = new Long(source.EventSuccessNum);
        }
        if (source.EventSuccessRate != null) {
            this.EventSuccessRate = new String(source.EventSuccessRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoExceptionNum", this.VideoExceptionNum);
        this.setParamSimple(map, prefix + "VideoSuccessNum", this.VideoSuccessNum);
        this.setParamSimple(map, prefix + "VideoSuccessRate", this.VideoSuccessRate);
        this.setParamSimple(map, prefix + "EventExceptionNum", this.EventExceptionNum);
        this.setParamSimple(map, prefix + "EventSuccessNum", this.EventSuccessNum);
        this.setParamSimple(map, prefix + "EventSuccessRate", this.EventSuccessRate);

    }
}

