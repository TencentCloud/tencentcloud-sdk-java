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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiRateLimitRulesRequest extends AbstractModel{

    /**
    * Api ID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
     * Get Api ID 
     * @return ApiId Api ID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Api ID
     * @param ApiId Api ID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    public DescribeApiRateLimitRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiRateLimitRulesRequest(DescribeApiRateLimitRulesRequest source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);

    }
}

