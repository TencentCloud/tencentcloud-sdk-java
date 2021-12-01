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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppearIndexPair extends AbstractModel{

    /**
    * 出现信息，取值范围为[1，3]
    */
    @SerializedName("AppearIndex")
    @Expose
    private Long AppearIndex;

    /**
    * AppearInfo中AppearIndex对应元素的第Index元素，从0开始技术
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get 出现信息，取值范围为[1，3] 
     * @return AppearIndex 出现信息，取值范围为[1，3]
     */
    public Long getAppearIndex() {
        return this.AppearIndex;
    }

    /**
     * Set 出现信息，取值范围为[1，3]
     * @param AppearIndex 出现信息，取值范围为[1，3]
     */
    public void setAppearIndex(Long AppearIndex) {
        this.AppearIndex = AppearIndex;
    }

    /**
     * Get AppearInfo中AppearIndex对应元素的第Index元素，从0开始技术 
     * @return Index AppearInfo中AppearIndex对应元素的第Index元素，从0开始技术
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set AppearInfo中AppearIndex对应元素的第Index元素，从0开始技术
     * @param Index AppearInfo中AppearIndex对应元素的第Index元素，从0开始技术
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public AppearIndexPair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppearIndexPair(AppearIndexPair source) {
        if (source.AppearIndex != null) {
            this.AppearIndex = new Long(source.AppearIndex);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppearIndex", this.AppearIndex);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

