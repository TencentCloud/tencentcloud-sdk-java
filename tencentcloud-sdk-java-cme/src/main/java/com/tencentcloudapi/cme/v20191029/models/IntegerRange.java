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

public class IntegerRange extends AbstractModel{

    /**
    * 按整形代表值的下限检索。
    */
    @SerializedName("LowerBound")
    @Expose
    private Long LowerBound;

    /**
    * 按整形代表值的上限检索。
    */
    @SerializedName("UpperBound")
    @Expose
    private Long UpperBound;

    /**
     * Get 按整形代表值的下限检索。 
     * @return LowerBound 按整形代表值的下限检索。
     */
    public Long getLowerBound() {
        return this.LowerBound;
    }

    /**
     * Set 按整形代表值的下限检索。
     * @param LowerBound 按整形代表值的下限检索。
     */
    public void setLowerBound(Long LowerBound) {
        this.LowerBound = LowerBound;
    }

    /**
     * Get 按整形代表值的上限检索。 
     * @return UpperBound 按整形代表值的上限检索。
     */
    public Long getUpperBound() {
        return this.UpperBound;
    }

    /**
     * Set 按整形代表值的上限检索。
     * @param UpperBound 按整形代表值的上限检索。
     */
    public void setUpperBound(Long UpperBound) {
        this.UpperBound = UpperBound;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LowerBound", this.LowerBound);
        this.setParamSimple(map, prefix + "UpperBound", this.UpperBound);

    }
}

