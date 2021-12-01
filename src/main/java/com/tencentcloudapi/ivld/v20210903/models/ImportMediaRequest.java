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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportMediaRequest extends AbstractModel{

    /**
    * 待分析视频的URL，目前只支持*不带签名的*COS地址，长度最长1KB
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * 待分析视频的MD5，为空时不做校验，否则会做MD5校验，长度必须为32B
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * 待分析视频的名称，指定后可支持筛选，最多100个中文字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 待分析视频的URL，目前只支持*不带签名的*COS地址，长度最长1KB 
     * @return URL 待分析视频的URL，目前只支持*不带签名的*COS地址，长度最长1KB
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 待分析视频的URL，目前只支持*不带签名的*COS地址，长度最长1KB
     * @param URL 待分析视频的URL，目前只支持*不带签名的*COS地址，长度最长1KB
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get 待分析视频的MD5，为空时不做校验，否则会做MD5校验，长度必须为32B 
     * @return MD5 待分析视频的MD5，为空时不做校验，否则会做MD5校验，长度必须为32B
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set 待分析视频的MD5，为空时不做校验，否则会做MD5校验，长度必须为32B
     * @param MD5 待分析视频的MD5，为空时不做校验，否则会做MD5校验，长度必须为32B
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get 待分析视频的名称，指定后可支持筛选，最多100个中文字符 
     * @return Name 待分析视频的名称，指定后可支持筛选，最多100个中文字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 待分析视频的名称，指定后可支持筛选，最多100个中文字符
     * @param Name 待分析视频的名称，指定后可支持筛选，最多100个中文字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ImportMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportMediaRequest(ImportMediaRequest source) {
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

