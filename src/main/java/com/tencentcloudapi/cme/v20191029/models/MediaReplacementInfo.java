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

public class MediaReplacementInfo extends AbstractModel{

    /**
    * 素材 ID。
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 替换媒体选取的开始时间，单位为秒，默认为 0。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
     * Get 素材 ID。 
     * @return MaterialId 素材 ID。
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 素材 ID。
     * @param MaterialId 素材 ID。
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 替换媒体选取的开始时间，单位为秒，默认为 0。 
     * @return StartTimeOffset 替换媒体选取的开始时间，单位为秒，默认为 0。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 替换媒体选取的开始时间，单位为秒，默认为 0。
     * @param StartTimeOffset 替换媒体选取的开始时间，单位为秒，默认为 0。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);

    }
}

