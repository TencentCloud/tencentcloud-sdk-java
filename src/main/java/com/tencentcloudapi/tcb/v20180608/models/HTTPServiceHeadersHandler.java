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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPServiceHeadersHandler extends AbstractModel {

    /**
    * 添加请求头列表
    */
    @SerializedName("RequestHeadersToAdd")
    @Expose
    private HTTPServiceHeaderToAdd [] RequestHeadersToAdd;

    /**
    * 删除请求头列表
    */
    @SerializedName("RequestHeadersToRemove")
    @Expose
    private String [] RequestHeadersToRemove;

    /**
    * 添加返回头列表
    */
    @SerializedName("ResponseHeadersToAdd")
    @Expose
    private HTTPServiceHeaderToAdd [] ResponseHeadersToAdd;

    /**
    * 删除返回头列表
    */
    @SerializedName("ResponseHeadersToRemove")
    @Expose
    private String [] ResponseHeadersToRemove;

    /**
     * Get 添加请求头列表 
     * @return RequestHeadersToAdd 添加请求头列表
     */
    public HTTPServiceHeaderToAdd [] getRequestHeadersToAdd() {
        return this.RequestHeadersToAdd;
    }

    /**
     * Set 添加请求头列表
     * @param RequestHeadersToAdd 添加请求头列表
     */
    public void setRequestHeadersToAdd(HTTPServiceHeaderToAdd [] RequestHeadersToAdd) {
        this.RequestHeadersToAdd = RequestHeadersToAdd;
    }

    /**
     * Get 删除请求头列表 
     * @return RequestHeadersToRemove 删除请求头列表
     */
    public String [] getRequestHeadersToRemove() {
        return this.RequestHeadersToRemove;
    }

    /**
     * Set 删除请求头列表
     * @param RequestHeadersToRemove 删除请求头列表
     */
    public void setRequestHeadersToRemove(String [] RequestHeadersToRemove) {
        this.RequestHeadersToRemove = RequestHeadersToRemove;
    }

    /**
     * Get 添加返回头列表 
     * @return ResponseHeadersToAdd 添加返回头列表
     */
    public HTTPServiceHeaderToAdd [] getResponseHeadersToAdd() {
        return this.ResponseHeadersToAdd;
    }

    /**
     * Set 添加返回头列表
     * @param ResponseHeadersToAdd 添加返回头列表
     */
    public void setResponseHeadersToAdd(HTTPServiceHeaderToAdd [] ResponseHeadersToAdd) {
        this.ResponseHeadersToAdd = ResponseHeadersToAdd;
    }

    /**
     * Get 删除返回头列表 
     * @return ResponseHeadersToRemove 删除返回头列表
     */
    public String [] getResponseHeadersToRemove() {
        return this.ResponseHeadersToRemove;
    }

    /**
     * Set 删除返回头列表
     * @param ResponseHeadersToRemove 删除返回头列表
     */
    public void setResponseHeadersToRemove(String [] ResponseHeadersToRemove) {
        this.ResponseHeadersToRemove = ResponseHeadersToRemove;
    }

    public HTTPServiceHeadersHandler() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceHeadersHandler(HTTPServiceHeadersHandler source) {
        if (source.RequestHeadersToAdd != null) {
            this.RequestHeadersToAdd = new HTTPServiceHeaderToAdd[source.RequestHeadersToAdd.length];
            for (int i = 0; i < source.RequestHeadersToAdd.length; i++) {
                this.RequestHeadersToAdd[i] = new HTTPServiceHeaderToAdd(source.RequestHeadersToAdd[i]);
            }
        }
        if (source.RequestHeadersToRemove != null) {
            this.RequestHeadersToRemove = new String[source.RequestHeadersToRemove.length];
            for (int i = 0; i < source.RequestHeadersToRemove.length; i++) {
                this.RequestHeadersToRemove[i] = new String(source.RequestHeadersToRemove[i]);
            }
        }
        if (source.ResponseHeadersToAdd != null) {
            this.ResponseHeadersToAdd = new HTTPServiceHeaderToAdd[source.ResponseHeadersToAdd.length];
            for (int i = 0; i < source.ResponseHeadersToAdd.length; i++) {
                this.ResponseHeadersToAdd[i] = new HTTPServiceHeaderToAdd(source.ResponseHeadersToAdd[i]);
            }
        }
        if (source.ResponseHeadersToRemove != null) {
            this.ResponseHeadersToRemove = new String[source.ResponseHeadersToRemove.length];
            for (int i = 0; i < source.ResponseHeadersToRemove.length; i++) {
                this.ResponseHeadersToRemove[i] = new String(source.ResponseHeadersToRemove[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RequestHeadersToAdd.", this.RequestHeadersToAdd);
        this.setParamArraySimple(map, prefix + "RequestHeadersToRemove.", this.RequestHeadersToRemove);
        this.setParamArrayObj(map, prefix + "ResponseHeadersToAdd.", this.ResponseHeadersToAdd);
        this.setParamArraySimple(map, prefix + "ResponseHeadersToRemove.", this.ResponseHeadersToRemove);

    }
}

