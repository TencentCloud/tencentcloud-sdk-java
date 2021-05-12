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

public class PurgeUrlsCacheRequest extends AbstractModel{

    /**
    * URL 列表，需要包含协议头部 http:// 或 https://
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * 刷新区域
无此参数时，默认刷新加速域名所在加速区域
填充 mainland 时，仅刷新中国境内加速节点上缓存内容
填充 overseas 时，仅刷新中国境外加速节点上缓存内容
指定刷新区域时，需要与域名加速区域匹配
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 是否对中文字符进行编码后刷新
    */
    @SerializedName("UrlEncode")
    @Expose
    private Boolean UrlEncode;

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
     * Get 刷新区域
无此参数时，默认刷新加速域名所在加速区域
填充 mainland 时，仅刷新中国境内加速节点上缓存内容
填充 overseas 时，仅刷新中国境外加速节点上缓存内容
指定刷新区域时，需要与域名加速区域匹配 
     * @return Area 刷新区域
无此参数时，默认刷新加速域名所在加速区域
填充 mainland 时，仅刷新中国境内加速节点上缓存内容
填充 overseas 时，仅刷新中国境外加速节点上缓存内容
指定刷新区域时，需要与域名加速区域匹配
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 刷新区域
无此参数时，默认刷新加速域名所在加速区域
填充 mainland 时，仅刷新中国境内加速节点上缓存内容
填充 overseas 时，仅刷新中国境外加速节点上缓存内容
指定刷新区域时，需要与域名加速区域匹配
     * @param Area 刷新区域
无此参数时，默认刷新加速域名所在加速区域
填充 mainland 时，仅刷新中国境内加速节点上缓存内容
填充 overseas 时，仅刷新中国境外加速节点上缓存内容
指定刷新区域时，需要与域名加速区域匹配
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 是否对中文字符进行编码后刷新 
     * @return UrlEncode 是否对中文字符进行编码后刷新
     */
    public Boolean getUrlEncode() {
        return this.UrlEncode;
    }

    /**
     * Set 是否对中文字符进行编码后刷新
     * @param UrlEncode 是否对中文字符进行编码后刷新
     */
    public void setUrlEncode(Boolean UrlEncode) {
        this.UrlEncode = UrlEncode;
    }

    public PurgeUrlsCacheRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PurgeUrlsCacheRequest(PurgeUrlsCacheRequest source) {
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.UrlEncode != null) {
            this.UrlEncode = new Boolean(source.UrlEncode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "UrlEncode", this.UrlEncode);

    }
}

