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

public class MediaSourceInfo extends AbstractModel{

    /**
    * 媒体源资源下载信息。
    */
    @SerializedName("DownInfo")
    @Expose
    private DownInfo DownInfo;

    /**
    * 媒体源ID标记，用于多个输入源时，请内媒体源的定位，对于多输入的任务，一般要求必选。
ID只能包含字母、数字、下划线、中划线，长读不能超过128。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 媒体源类型，具体类型如下：
Video：视频
Image：图片
Audio：音频
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 媒体源资源下载信息。 
     * @return DownInfo 媒体源资源下载信息。
     */
    public DownInfo getDownInfo() {
        return this.DownInfo;
    }

    /**
     * Set 媒体源资源下载信息。
     * @param DownInfo 媒体源资源下载信息。
     */
    public void setDownInfo(DownInfo DownInfo) {
        this.DownInfo = DownInfo;
    }

    /**
     * Get 媒体源ID标记，用于多个输入源时，请内媒体源的定位，对于多输入的任务，一般要求必选。
ID只能包含字母、数字、下划线、中划线，长读不能超过128。 
     * @return Id 媒体源ID标记，用于多个输入源时，请内媒体源的定位，对于多输入的任务，一般要求必选。
ID只能包含字母、数字、下划线、中划线，长读不能超过128。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 媒体源ID标记，用于多个输入源时，请内媒体源的定位，对于多输入的任务，一般要求必选。
ID只能包含字母、数字、下划线、中划线，长读不能超过128。
     * @param Id 媒体源ID标记，用于多个输入源时，请内媒体源的定位，对于多输入的任务，一般要求必选。
ID只能包含字母、数字、下划线、中划线，长读不能超过128。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 媒体源类型，具体类型如下：
Video：视频
Image：图片
Audio：音频 
     * @return Type 媒体源类型，具体类型如下：
Video：视频
Image：图片
Audio：音频
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 媒体源类型，具体类型如下：
Video：视频
Image：图片
Audio：音频
     * @param Type 媒体源类型，具体类型如下：
Video：视频
Image：图片
Audio：音频
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public MediaSourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSourceInfo(MediaSourceInfo source) {
        if (source.DownInfo != null) {
            this.DownInfo = new DownInfo(source.DownInfo);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DownInfo.", this.DownInfo);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

