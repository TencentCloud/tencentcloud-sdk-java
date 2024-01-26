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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectParamDsRequest extends AbstractModel {

    /**
    * 请求结构体
    */
    @SerializedName("Request")
    @Expose
    private ParamDsRequest [] Request;

    /**
     * Get 请求结构体 
     * @return Request 请求结构体
     */
    public ParamDsRequest [] getRequest() {
        return this.Request;
    }

    /**
     * Set 请求结构体
     * @param Request 请求结构体
     */
    public void setRequest(ParamDsRequest [] Request) {
        this.Request = Request;
    }

    public CreateProjectParamDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectParamDsRequest(CreateProjectParamDsRequest source) {
        if (source.Request != null) {
            this.Request = new ParamDsRequest[source.Request.length];
            for (int i = 0; i < source.Request.length; i++) {
                this.Request[i] = new ParamDsRequest(source.Request[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Request.", this.Request);

    }
}

