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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushUrlsCacheRequest extends AbstractModel{

    /**
    * URL 列表，需要包含协议头部 http:// 或 https://
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * 指定预热请求回源时 HTTP 请求的 User-Agent 头部
默认为 TencentCdn
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 预热生效区域
mainland：预热至境内节点
overseas：预热至境外节点
global：预热全球节点
不填充情况下，默认为 mainland， URL 中域名必须在对应区域启用了加速服务才能提交对应区域的预热任务
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get URL 列表，需要包含协议头部 http:// 或 https:// 
     * @return Urls URL 列表，需要包含协议头部 http:// 或 https://
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set URL 列表，需要包含协议头部 http:// 或 https://
     * @param Urls URL 列表，需要包含协议头部 http:// 或 https://
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get 指定预热请求回源时 HTTP 请求的 User-Agent 头部
默认为 TencentCdn 
     * @return UserAgent 指定预热请求回源时 HTTP 请求的 User-Agent 头部
默认为 TencentCdn
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 指定预热请求回源时 HTTP 请求的 User-Agent 头部
默认为 TencentCdn
     * @param UserAgent 指定预热请求回源时 HTTP 请求的 User-Agent 头部
默认为 TencentCdn
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get 预热生效区域
mainland：预热至境内节点
overseas：预热至境外节点
global：预热全球节点
不填充情况下，默认为 mainland， URL 中域名必须在对应区域启用了加速服务才能提交对应区域的预热任务 
     * @return Area 预热生效区域
mainland：预热至境内节点
overseas：预热至境外节点
global：预热全球节点
不填充情况下，默认为 mainland， URL 中域名必须在对应区域启用了加速服务才能提交对应区域的预热任务
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 预热生效区域
mainland：预热至境内节点
overseas：预热至境外节点
global：预热全球节点
不填充情况下，默认为 mainland， URL 中域名必须在对应区域启用了加速服务才能提交对应区域的预热任务
     * @param Area 预热生效区域
mainland：预热至境内节点
overseas：预热至境外节点
global：预热全球节点
不填充情况下，默认为 mainland， URL 中域名必须在对应区域启用了加速服务才能提交对应区域的预热任务
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

