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

public class ListDiagnoseReportRequest extends AbstractModel{

    /**
    * 用于搜索诊断URL的关键字，不填时返回用户所有的诊断任务。
    */
    @SerializedName("KeyWords")
    @Expose
    private String KeyWords;

    /**
    * 用于搜索诊断系统返回的诊断链接，形如：http://cdn.cloud.tencent.com/self_diagnose/xxxxx
    */
    @SerializedName("DiagnoseLink")
    @Expose
    private String DiagnoseLink;

    /**
    * 请求源带协议头，形如：https://console.cloud.tencent.com
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
     * Get 用于搜索诊断URL的关键字，不填时返回用户所有的诊断任务。 
     * @return KeyWords 用于搜索诊断URL的关键字，不填时返回用户所有的诊断任务。
     */
    public String getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set 用于搜索诊断URL的关键字，不填时返回用户所有的诊断任务。
     * @param KeyWords 用于搜索诊断URL的关键字，不填时返回用户所有的诊断任务。
     */
    public void setKeyWords(String KeyWords) {
        this.KeyWords = KeyWords;
    }

    /**
     * Get 用于搜索诊断系统返回的诊断链接，形如：http://cdn.cloud.tencent.com/self_diagnose/xxxxx 
     * @return DiagnoseLink 用于搜索诊断系统返回的诊断链接，形如：http://cdn.cloud.tencent.com/self_diagnose/xxxxx
     */
    public String getDiagnoseLink() {
        return this.DiagnoseLink;
    }

    /**
     * Set 用于搜索诊断系统返回的诊断链接，形如：http://cdn.cloud.tencent.com/self_diagnose/xxxxx
     * @param DiagnoseLink 用于搜索诊断系统返回的诊断链接，形如：http://cdn.cloud.tencent.com/self_diagnose/xxxxx
     */
    public void setDiagnoseLink(String DiagnoseLink) {
        this.DiagnoseLink = DiagnoseLink;
    }

    /**
     * Get 请求源带协议头，形如：https://console.cloud.tencent.com 
     * @return Origin 请求源带协议头，形如：https://console.cloud.tencent.com
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 请求源带协议头，形如：https://console.cloud.tencent.com
     * @param Origin 请求源带协议头，形如：https://console.cloud.tencent.com
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public ListDiagnoseReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDiagnoseReportRequest(ListDiagnoseReportRequest source) {
        if (source.KeyWords != null) {
            this.KeyWords = new String(source.KeyWords);
        }
        if (source.DiagnoseLink != null) {
            this.DiagnoseLink = new String(source.DiagnoseLink);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyWords", this.KeyWords);
        this.setParamSimple(map, prefix + "DiagnoseLink", this.DiagnoseLink);
        this.setParamSimple(map, prefix + "Origin", this.Origin);

    }
}

