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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SgDnsParseCount extends AbstractModel {

    /**
    * 有效下发的IP个数，离散数据
    */
    @SerializedName("ValidCount")
    @Expose
    private Long ValidCount;

    /**
    * 未下发的IP个数，离散数据
    */
    @SerializedName("InvalidCount")
    @Expose
    private Long InvalidCount;

    /**
     * Get 有效下发的IP个数，离散数据 
     * @return ValidCount 有效下发的IP个数，离散数据
     */
    public Long getValidCount() {
        return this.ValidCount;
    }

    /**
     * Set 有效下发的IP个数，离散数据
     * @param ValidCount 有效下发的IP个数，离散数据
     */
    public void setValidCount(Long ValidCount) {
        this.ValidCount = ValidCount;
    }

    /**
     * Get 未下发的IP个数，离散数据 
     * @return InvalidCount 未下发的IP个数，离散数据
     */
    public Long getInvalidCount() {
        return this.InvalidCount;
    }

    /**
     * Set 未下发的IP个数，离散数据
     * @param InvalidCount 未下发的IP个数，离散数据
     */
    public void setInvalidCount(Long InvalidCount) {
        this.InvalidCount = InvalidCount;
    }

    public SgDnsParseCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SgDnsParseCount(SgDnsParseCount source) {
        if (source.ValidCount != null) {
            this.ValidCount = new Long(source.ValidCount);
        }
        if (source.InvalidCount != null) {
            this.InvalidCount = new Long(source.InvalidCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ValidCount", this.ValidCount);
        this.setParamSimple(map, prefix + "InvalidCount", this.InvalidCount);

    }
}

