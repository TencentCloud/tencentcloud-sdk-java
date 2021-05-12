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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBizConfigRequest extends AbstractModel{

    /**
    * 审核业务类类型
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
     * Get 审核业务类类型 
     * @return BizType 审核业务类类型
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 审核业务类类型
     * @param BizType 审核业务类类型
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    public DescribeBizConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBizConfigRequest(DescribeBizConfigRequest source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);

    }
}

