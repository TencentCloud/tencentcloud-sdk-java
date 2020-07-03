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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSitesRequest extends AbstractModel{

    /**
    * 站点的url列表
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * 访问网站的客户端标识
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
     * Get 站点的url列表 
     * @return Urls 站点的url列表
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set 站点的url列表
     * @param Urls 站点的url列表
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get 访问网站的客户端标识 
     * @return UserAgent 访问网站的客户端标识
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 访问网站的客户端标识
     * @param UserAgent 访问网站的客户端标识
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);

    }
}

