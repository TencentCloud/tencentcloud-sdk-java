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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtaPubHistory extends AbstractModel{

    /**
    * 版本名称
    */
    @SerializedName("OtaVersion")
    @Expose
    private String OtaVersion;

    /**
    * 发布时间，unix时间戳，单位：秒
    */
    @SerializedName("PublishTime")
    @Expose
    private Long PublishTime;

    /**
     * Get 版本名称 
     * @return OtaVersion 版本名称
     */
    public String getOtaVersion() {
        return this.OtaVersion;
    }

    /**
     * Set 版本名称
     * @param OtaVersion 版本名称
     */
    public void setOtaVersion(String OtaVersion) {
        this.OtaVersion = OtaVersion;
    }

    /**
     * Get 发布时间，unix时间戳，单位：秒 
     * @return PublishTime 发布时间，unix时间戳，单位：秒
     */
    public Long getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 发布时间，unix时间戳，单位：秒
     * @param PublishTime 发布时间，unix时间戳，单位：秒
     */
    public void setPublishTime(Long PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OtaVersion", this.OtaVersion);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);

    }
}

