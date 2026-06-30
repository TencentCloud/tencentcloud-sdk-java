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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DecodeParams extends AbstractModel {

    /**
    * <p>视频截帧参数</p><p>取值范围：[0, 30]</p>
    */
    @SerializedName("ImageFrequency")
    @Expose
    private Long ImageFrequency;

    /**
     * Get <p>视频截帧参数</p><p>取值范围：[0, 30]</p> 
     * @return ImageFrequency <p>视频截帧参数</p><p>取值范围：[0, 30]</p>
     */
    public Long getImageFrequency() {
        return this.ImageFrequency;
    }

    /**
     * Set <p>视频截帧参数</p><p>取值范围：[0, 30]</p>
     * @param ImageFrequency <p>视频截帧参数</p><p>取值范围：[0, 30]</p>
     */
    public void setImageFrequency(Long ImageFrequency) {
        this.ImageFrequency = ImageFrequency;
    }

    public DecodeParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DecodeParams(DecodeParams source) {
        if (source.ImageFrequency != null) {
            this.ImageFrequency = new Long(source.ImageFrequency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageFrequency", this.ImageFrequency);

    }
}

