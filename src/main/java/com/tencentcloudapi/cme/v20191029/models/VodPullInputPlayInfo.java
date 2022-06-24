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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VodPullInputPlayInfo extends AbstractModel{

    /**
    * 当前正在播放文件 Url 。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 点播文件已播放时长，单位：秒。
    */
    @SerializedName("TimeOffset")
    @Expose
    private Float TimeOffset;

    /**
     * Get 当前正在播放文件 Url 。 
     * @return Url 当前正在播放文件 Url 。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 当前正在播放文件 Url 。
     * @param Url 当前正在播放文件 Url 。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 点播文件已播放时长，单位：秒。 
     * @return TimeOffset 点播文件已播放时长，单位：秒。
     */
    public Float getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set 点播文件已播放时长，单位：秒。
     * @param TimeOffset 点播文件已播放时长，单位：秒。
     */
    public void setTimeOffset(Float TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    public VodPullInputPlayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VodPullInputPlayInfo(VodPullInputPlayInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.TimeOffset != null) {
            this.TimeOffset = new Float(source.TimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "TimeOffset", this.TimeOffset);

    }
}

