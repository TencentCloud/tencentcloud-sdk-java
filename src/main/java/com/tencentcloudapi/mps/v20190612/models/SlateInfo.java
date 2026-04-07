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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlateInfo extends AbstractModel {

    /**
    * source location的ID。
    */
    @SerializedName("SourceLocationId")
    @Expose
    private String SourceLocationId;

    /**
    * 对应的vod垫片内容源名称。
    */
    @SerializedName("VodSourceName")
    @Expose
    private String VodSourceName;

    /**
     * Get source location的ID。 
     * @return SourceLocationId source location的ID。
     */
    public String getSourceLocationId() {
        return this.SourceLocationId;
    }

    /**
     * Set source location的ID。
     * @param SourceLocationId source location的ID。
     */
    public void setSourceLocationId(String SourceLocationId) {
        this.SourceLocationId = SourceLocationId;
    }

    /**
     * Get 对应的vod垫片内容源名称。 
     * @return VodSourceName 对应的vod垫片内容源名称。
     */
    public String getVodSourceName() {
        return this.VodSourceName;
    }

    /**
     * Set 对应的vod垫片内容源名称。
     * @param VodSourceName 对应的vod垫片内容源名称。
     */
    public void setVodSourceName(String VodSourceName) {
        this.VodSourceName = VodSourceName;
    }

    public SlateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlateInfo(SlateInfo source) {
        if (source.SourceLocationId != null) {
            this.SourceLocationId = new String(source.SourceLocationId);
        }
        if (source.VodSourceName != null) {
            this.VodSourceName = new String(source.VodSourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceLocationId", this.SourceLocationId);
        this.setParamSimple(map, prefix + "VodSourceName", this.VodSourceName);

    }
}

