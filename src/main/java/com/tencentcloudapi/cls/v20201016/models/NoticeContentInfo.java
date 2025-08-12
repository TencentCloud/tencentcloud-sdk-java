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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeContentInfo extends AbstractModel {

    /**
    * 通知内容模板标题信息。
部分通知渠道类型不支持“标题”，请参照[腾讯云控制台页面](https://console.cloud.tencent.com/cls/alarm/notice-template)。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 通知内容模板正文信息。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 请求头（Request Headers）：在HTTP请求中，请求头包含了客户端向服务器发送的附加信息，如用户代理、授权凭证、期望的响应格式等。
仅“自定义回调”支持该配置。
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
     * Get 通知内容模板标题信息。
部分通知渠道类型不支持“标题”，请参照[腾讯云控制台页面](https://console.cloud.tencent.com/cls/alarm/notice-template)。 
     * @return Title 通知内容模板标题信息。
部分通知渠道类型不支持“标题”，请参照[腾讯云控制台页面](https://console.cloud.tencent.com/cls/alarm/notice-template)。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 通知内容模板标题信息。
部分通知渠道类型不支持“标题”，请参照[腾讯云控制台页面](https://console.cloud.tencent.com/cls/alarm/notice-template)。
     * @param Title 通知内容模板标题信息。
部分通知渠道类型不支持“标题”，请参照[腾讯云控制台页面](https://console.cloud.tencent.com/cls/alarm/notice-template)。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 通知内容模板正文信息。 
     * @return Content 通知内容模板正文信息。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 通知内容模板正文信息。
     * @param Content 通知内容模板正文信息。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 请求头（Request Headers）：在HTTP请求中，请求头包含了客户端向服务器发送的附加信息，如用户代理、授权凭证、期望的响应格式等。
仅“自定义回调”支持该配置。 
     * @return Headers 请求头（Request Headers）：在HTTP请求中，请求头包含了客户端向服务器发送的附加信息，如用户代理、授权凭证、期望的响应格式等。
仅“自定义回调”支持该配置。
     */
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 请求头（Request Headers）：在HTTP请求中，请求头包含了客户端向服务器发送的附加信息，如用户代理、授权凭证、期望的响应格式等。
仅“自定义回调”支持该配置。
     * @param Headers 请求头（Request Headers）：在HTTP请求中，请求头包含了客户端向服务器发送的附加信息，如用户代理、授权凭证、期望的响应格式等。
仅“自定义回调”支持该配置。
     */
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    public NoticeContentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeContentInfo(NoticeContentInfo source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Headers != null) {
            this.Headers = new String[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new String(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArraySimple(map, prefix + "Headers.", this.Headers);

    }
}

