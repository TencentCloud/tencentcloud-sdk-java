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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitCommonRsp extends AbstractModel {

    /**
    * 响应码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 提示信息
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
     * Get 响应码 
     * @return Code 响应码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 响应码
     * @param Code 响应码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 提示信息 
     * @return Info 提示信息
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 提示信息
     * @param Info 提示信息
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    public RateLimitCommonRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitCommonRsp(RateLimitCommonRsp source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Info", this.Info);

    }
}

