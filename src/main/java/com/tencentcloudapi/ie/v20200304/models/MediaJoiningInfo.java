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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaJoiningInfo extends AbstractModel {

    /**
    * 输出目标信息，拼接只采用FileName和Format，用于指定目标文件名和格式。
其中Format只支持mp4.
    */
    @SerializedName("TargetInfo")
    @Expose
    private MediaTargetInfo TargetInfo;

    /**
    * 拼接模式：
Fast：快速；
Normal：正常；
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get 输出目标信息，拼接只采用FileName和Format，用于指定目标文件名和格式。
其中Format只支持mp4. 
     * @return TargetInfo 输出目标信息，拼接只采用FileName和Format，用于指定目标文件名和格式。
其中Format只支持mp4.
     */
    public MediaTargetInfo getTargetInfo() {
        return this.TargetInfo;
    }

    /**
     * Set 输出目标信息，拼接只采用FileName和Format，用于指定目标文件名和格式。
其中Format只支持mp4.
     * @param TargetInfo 输出目标信息，拼接只采用FileName和Format，用于指定目标文件名和格式。
其中Format只支持mp4.
     */
    public void setTargetInfo(MediaTargetInfo TargetInfo) {
        this.TargetInfo = TargetInfo;
    }

    /**
     * Get 拼接模式：
Fast：快速；
Normal：正常； 
     * @return Mode 拼接模式：
Fast：快速；
Normal：正常；
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 拼接模式：
Fast：快速；
Normal：正常；
     * @param Mode 拼接模式：
Fast：快速；
Normal：正常；
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public MediaJoiningInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaJoiningInfo(MediaJoiningInfo source) {
        if (source.TargetInfo != null) {
            this.TargetInfo = new MediaTargetInfo(source.TargetInfo);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TargetInfo.", this.TargetInfo);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

