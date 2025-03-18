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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReturnCustomPageActionParameters extends AbstractModel {

    /**
    * 响应状态码。
    */
    @SerializedName("ResponseCode")
    @Expose
    private String ResponseCode;

    /**
    * 响应的自定义页面ID。
    */
    @SerializedName("ErrorPageId")
    @Expose
    private String ErrorPageId;

    /**
     * Get 响应状态码。 
     * @return ResponseCode 响应状态码。
     */
    public String getResponseCode() {
        return this.ResponseCode;
    }

    /**
     * Set 响应状态码。
     * @param ResponseCode 响应状态码。
     */
    public void setResponseCode(String ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    /**
     * Get 响应的自定义页面ID。 
     * @return ErrorPageId 响应的自定义页面ID。
     */
    public String getErrorPageId() {
        return this.ErrorPageId;
    }

    /**
     * Set 响应的自定义页面ID。
     * @param ErrorPageId 响应的自定义页面ID。
     */
    public void setErrorPageId(String ErrorPageId) {
        this.ErrorPageId = ErrorPageId;
    }

    public ReturnCustomPageActionParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReturnCustomPageActionParameters(ReturnCustomPageActionParameters source) {
        if (source.ResponseCode != null) {
            this.ResponseCode = new String(source.ResponseCode);
        }
        if (source.ErrorPageId != null) {
            this.ErrorPageId = new String(source.ErrorPageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResponseCode", this.ResponseCode);
        this.setParamSimple(map, prefix + "ErrorPageId", this.ErrorPageId);

    }
}

