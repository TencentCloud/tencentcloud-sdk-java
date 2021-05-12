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
package com.tencentcloudapi.tms.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTextLibRequest extends AbstractModel{

    /**
    * 内容类型 text: 1; image: 2; audio: 3; video: 4
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
     * Get 内容类型 text: 1; image: 2; audio: 3; video: 4 
     * @return StrategyType 内容类型 text: 1; image: 2; audio: 3; video: 4
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 内容类型 text: 1; image: 2; audio: 3; video: 4
     * @param StrategyType 内容类型 text: 1; image: 2; audio: 3; video: 4
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    public DescribeTextLibRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTextLibRequest(DescribeTextLibRequest source) {
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);

    }
}

