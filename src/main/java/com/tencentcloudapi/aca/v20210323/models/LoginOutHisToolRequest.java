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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginOutHisToolRequest extends AbstractModel {

    /**
    * 登出请求header
    */
    @SerializedName("Header")
    @Expose
    private LoginOutHeader Header;

    /**
    * 登出请求数据
    */
    @SerializedName("Data")
    @Expose
    private LoginOutData Data;

    /**
     * Get 登出请求header 
     * @return Header 登出请求header
     */
    public LoginOutHeader getHeader() {
        return this.Header;
    }

    /**
     * Set 登出请求header
     * @param Header 登出请求header
     */
    public void setHeader(LoginOutHeader Header) {
        this.Header = Header;
    }

    /**
     * Get 登出请求数据 
     * @return Data 登出请求数据
     */
    public LoginOutData getData() {
        return this.Data;
    }

    /**
     * Set 登出请求数据
     * @param Data 登出请求数据
     */
    public void setData(LoginOutData Data) {
        this.Data = Data;
    }

    public LoginOutHisToolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginOutHisToolRequest(LoginOutHisToolRequest source) {
        if (source.Header != null) {
            this.Header = new LoginOutHeader(source.Header);
        }
        if (source.Data != null) {
            this.Data = new LoginOutData(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Header.", this.Header);
        this.setParamObj(map, prefix + "Data.", this.Data);

    }
}

