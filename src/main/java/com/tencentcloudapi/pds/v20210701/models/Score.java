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
package com.tencentcloudapi.pds.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Score extends AbstractModel {

    /**
    * 信誉分，1-5从低到高
    */
    @SerializedName("Star")
    @Expose
    private Long Star;

    /**
     * Get 信誉分，1-5从低到高 
     * @return Star 信誉分，1-5从低到高
     */
    public Long getStar() {
        return this.Star;
    }

    /**
     * Set 信誉分，1-5从低到高
     * @param Star 信誉分，1-5从低到高
     */
    public void setStar(Long Star) {
        this.Star = Star;
    }

    public Score() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Score(Score source) {
        if (source.Star != null) {
            this.Star = new Long(source.Star);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Star", this.Star);

    }
}

