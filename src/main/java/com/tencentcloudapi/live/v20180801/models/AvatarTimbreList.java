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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvatarTimbreList extends AbstractModel {

    /**
    * 音色 类型。
    */
    @SerializedName("TimbreType")
    @Expose
    private String TimbreType;

    /**
    * 音色信息列表。
    */
    @SerializedName("TimbreInfoList")
    @Expose
    private AvatarTimbreInfo [] TimbreInfoList;

    /**
     * Get 音色 类型。 
     * @return TimbreType 音色 类型。
     */
    public String getTimbreType() {
        return this.TimbreType;
    }

    /**
     * Set 音色 类型。
     * @param TimbreType 音色 类型。
     */
    public void setTimbreType(String TimbreType) {
        this.TimbreType = TimbreType;
    }

    /**
     * Get 音色信息列表。 
     * @return TimbreInfoList 音色信息列表。
     */
    public AvatarTimbreInfo [] getTimbreInfoList() {
        return this.TimbreInfoList;
    }

    /**
     * Set 音色信息列表。
     * @param TimbreInfoList 音色信息列表。
     */
    public void setTimbreInfoList(AvatarTimbreInfo [] TimbreInfoList) {
        this.TimbreInfoList = TimbreInfoList;
    }

    public AvatarTimbreList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvatarTimbreList(AvatarTimbreList source) {
        if (source.TimbreType != null) {
            this.TimbreType = new String(source.TimbreType);
        }
        if (source.TimbreInfoList != null) {
            this.TimbreInfoList = new AvatarTimbreInfo[source.TimbreInfoList.length];
            for (int i = 0; i < source.TimbreInfoList.length; i++) {
                this.TimbreInfoList[i] = new AvatarTimbreInfo(source.TimbreInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimbreType", this.TimbreType);
        this.setParamArrayObj(map, prefix + "TimbreInfoList.", this.TimbreInfoList);

    }
}

