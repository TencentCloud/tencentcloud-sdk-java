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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealtimeSpeechConf extends AbstractModel {

    /**
    * 实时语音服务开关，取值：open/close
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实时语音音质类型，取值：high-高音质 ordinary-普通音质
    */
    @SerializedName("Quality")
    @Expose
    private String Quality;

    /**
     * Get 实时语音服务开关，取值：open/close 
     * @return Status 实时语音服务开关，取值：open/close
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实时语音服务开关，取值：open/close
     * @param Status 实时语音服务开关，取值：open/close
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实时语音音质类型，取值：high-高音质 ordinary-普通音质 
     * @return Quality 实时语音音质类型，取值：high-高音质 ordinary-普通音质
     */
    public String getQuality() {
        return this.Quality;
    }

    /**
     * Set 实时语音音质类型，取值：high-高音质 ordinary-普通音质
     * @param Quality 实时语音音质类型，取值：high-高音质 ordinary-普通音质
     */
    public void setQuality(String Quality) {
        this.Quality = Quality;
    }

    public RealtimeSpeechConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealtimeSpeechConf(RealtimeSpeechConf source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Quality != null) {
            this.Quality = new String(source.Quality);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Quality", this.Quality);

    }
}

