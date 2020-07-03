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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);

    }
}

