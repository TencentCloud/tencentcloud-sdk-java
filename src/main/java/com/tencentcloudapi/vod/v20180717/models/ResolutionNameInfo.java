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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResolutionNameInfo extends AbstractModel {

    /**
    * 视频短边长度，单位：像素。
    */
    @SerializedName("MinEdgeLength")
    @Expose
    private Long MinEdgeLength;

    /**
    * 展示名字。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 视频短边长度，单位：像素。 
     * @return MinEdgeLength 视频短边长度，单位：像素。
     */
    public Long getMinEdgeLength() {
        return this.MinEdgeLength;
    }

    /**
     * Set 视频短边长度，单位：像素。
     * @param MinEdgeLength 视频短边长度，单位：像素。
     */
    public void setMinEdgeLength(Long MinEdgeLength) {
        this.MinEdgeLength = MinEdgeLength;
    }

    /**
     * Get 展示名字。 
     * @return Name 展示名字。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 展示名字。
     * @param Name 展示名字。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ResolutionNameInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResolutionNameInfo(ResolutionNameInfo source) {
        if (source.MinEdgeLength != null) {
            this.MinEdgeLength = new Long(source.MinEdgeLength);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinEdgeLength", this.MinEdgeLength);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

