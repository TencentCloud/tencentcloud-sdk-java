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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiModalUsage extends AbstractModel {

    /**
    * 消耗tokens
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * 输入图片数量
    */
    @SerializedName("TotalImages")
    @Expose
    private Long TotalImages;

    /**
     * Get 消耗tokens 
     * @return TotalTokens 消耗tokens
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set 消耗tokens
     * @param TotalTokens 消耗tokens
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get 输入图片数量 
     * @return TotalImages 输入图片数量
     */
    public Long getTotalImages() {
        return this.TotalImages;
    }

    /**
     * Set 输入图片数量
     * @param TotalImages 输入图片数量
     */
    public void setTotalImages(Long TotalImages) {
        this.TotalImages = TotalImages;
    }

    public MultiModalUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiModalUsage(MultiModalUsage source) {
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.TotalImages != null) {
            this.TotalImages = new Long(source.TotalImages);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "TotalImages", this.TotalImages);

    }
}

