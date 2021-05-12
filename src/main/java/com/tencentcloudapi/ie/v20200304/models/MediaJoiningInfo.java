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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaJoiningInfo extends AbstractModel{

    /**
    * 输出目标信息，拼接只采用FileName和Format，用于指定目标文件名和格式。
其中Format只支持mp4.
    */
    @SerializedName("TargetInfo")
    @Expose
    private MediaTargetInfo TargetInfo;

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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TargetInfo.", this.TargetInfo);

    }
}

