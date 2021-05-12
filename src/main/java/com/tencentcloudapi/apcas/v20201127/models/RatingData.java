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
package com.tencentcloudapi.apcas.v20201127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RatingData extends AbstractModel{

    /**
    * 线索评级（取值：0、1、2、3分别代表无、低、中、高意愿）
    */
    @SerializedName("Rank")
    @Expose
    private Long Rank;

    /**
     * Get 线索评级（取值：0、1、2、3分别代表无、低、中、高意愿） 
     * @return Rank 线索评级（取值：0、1、2、3分别代表无、低、中、高意愿）
     */
    public Long getRank() {
        return this.Rank;
    }

    /**
     * Set 线索评级（取值：0、1、2、3分别代表无、低、中、高意愿）
     * @param Rank 线索评级（取值：0、1、2、3分别代表无、低、中、高意愿）
     */
    public void setRank(Long Rank) {
        this.Rank = Rank;
    }

    public RatingData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RatingData(RatingData source) {
        if (source.Rank != null) {
            this.Rank = new Long(source.Rank);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rank", this.Rank);

    }
}

