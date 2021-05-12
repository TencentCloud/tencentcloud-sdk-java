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

public class RecordUsage extends AbstractModel{

    /**
    * 本组数据对应的时间点，格式如:2020-09-07或2020-09-07 00:05:05。
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * 视频时长-标清SD，单位：秒。
    */
    @SerializedName("Class1VideoTime")
    @Expose
    private Long Class1VideoTime;

    /**
    * 视频时长-高清HD，单位：秒。
    */
    @SerializedName("Class2VideoTime")
    @Expose
    private Long Class2VideoTime;

    /**
    * 视频时长-超清HD，单位：秒。
    */
    @SerializedName("Class3VideoTime")
    @Expose
    private Long Class3VideoTime;

    /**
    * 语音时长，单位：秒。
    */
    @SerializedName("AudioTime")
    @Expose
    private Long AudioTime;

    /**
     * Get 本组数据对应的时间点，格式如:2020-09-07或2020-09-07 00:05:05。 
     * @return TimeKey 本组数据对应的时间点，格式如:2020-09-07或2020-09-07 00:05:05。
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set 本组数据对应的时间点，格式如:2020-09-07或2020-09-07 00:05:05。
     * @param TimeKey 本组数据对应的时间点，格式如:2020-09-07或2020-09-07 00:05:05。
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get 视频时长-标清SD，单位：秒。 
     * @return Class1VideoTime 视频时长-标清SD，单位：秒。
     */
    public Long getClass1VideoTime() {
        return this.Class1VideoTime;
    }

    /**
     * Set 视频时长-标清SD，单位：秒。
     * @param Class1VideoTime 视频时长-标清SD，单位：秒。
     */
    public void setClass1VideoTime(Long Class1VideoTime) {
        this.Class1VideoTime = Class1VideoTime;
    }

    /**
     * Get 视频时长-高清HD，单位：秒。 
     * @return Class2VideoTime 视频时长-高清HD，单位：秒。
     */
    public Long getClass2VideoTime() {
        return this.Class2VideoTime;
    }

    /**
     * Set 视频时长-高清HD，单位：秒。
     * @param Class2VideoTime 视频时长-高清HD，单位：秒。
     */
    public void setClass2VideoTime(Long Class2VideoTime) {
        this.Class2VideoTime = Class2VideoTime;
    }

    /**
     * Get 视频时长-超清HD，单位：秒。 
     * @return Class3VideoTime 视频时长-超清HD，单位：秒。
     */
    public Long getClass3VideoTime() {
        return this.Class3VideoTime;
    }

    /**
     * Set 视频时长-超清HD，单位：秒。
     * @param Class3VideoTime 视频时长-超清HD，单位：秒。
     */
    public void setClass3VideoTime(Long Class3VideoTime) {
        this.Class3VideoTime = Class3VideoTime;
    }

    /**
     * Get 语音时长，单位：秒。 
     * @return AudioTime 语音时长，单位：秒。
     */
    public Long getAudioTime() {
        return this.AudioTime;
    }

    /**
     * Set 语音时长，单位：秒。
     * @param AudioTime 语音时长，单位：秒。
     */
    public void setAudioTime(Long AudioTime) {
        this.AudioTime = AudioTime;
    }

    public RecordUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordUsage(RecordUsage source) {
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.Class1VideoTime != null) {
            this.Class1VideoTime = new Long(source.Class1VideoTime);
        }
        if (source.Class2VideoTime != null) {
            this.Class2VideoTime = new Long(source.Class2VideoTime);
        }
        if (source.Class3VideoTime != null) {
            this.Class3VideoTime = new Long(source.Class3VideoTime);
        }
        if (source.AudioTime != null) {
            this.AudioTime = new Long(source.AudioTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "Class1VideoTime", this.Class1VideoTime);
        this.setParamSimple(map, prefix + "Class2VideoTime", this.Class2VideoTime);
        this.setParamSimple(map, prefix + "Class3VideoTime", this.Class3VideoTime);
        this.setParamSimple(map, prefix + "AudioTime", this.AudioTime);

    }
}

