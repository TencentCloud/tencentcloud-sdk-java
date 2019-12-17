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

public class DisableCachesRequest extends AbstractModel{

    /**
    * 需要禁用的 URL 列表
每次最多可提交 100 条，每日最多可提交 3000 条
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
     * Get 需要禁用的 URL 列表
每次最多可提交 100 条，每日最多可提交 3000 条 
     * @return Urls 需要禁用的 URL 列表
每次最多可提交 100 条，每日最多可提交 3000 条
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set 需要禁用的 URL 列表
每次最多可提交 100 条，每日最多可提交 3000 条
     * @param Urls 需要禁用的 URL 列表
每次最多可提交 100 条，每日最多可提交 3000 条
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

