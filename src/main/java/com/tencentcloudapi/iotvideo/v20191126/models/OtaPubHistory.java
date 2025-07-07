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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtaPubHistory extends AbstractModel {

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

    public OtaPubHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtaPubHistory(OtaPubHistory source) {
        if (source.OtaVersion != null) {
            this.OtaVersion = new String(source.OtaVersion);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new Long(source.PublishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OtaVersion", this.OtaVersion);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);

    }
}

