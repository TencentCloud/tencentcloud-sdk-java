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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIp6TranslatorsRequest extends AbstractModel {

    /**
    * 转换实例名称
    */
    @SerializedName("Ip6TranslatorName")
    @Expose
    private String Ip6TranslatorName;

    /**
    * 创建转换实例数量，默认是1个
    */
    @SerializedName("Ip6TranslatorCount")
    @Expose
    private Long Ip6TranslatorCount;

    /**
    * 转换实例运营商属性，可取"CMCC","CTCC","CUCC","BGP"
    */
    @SerializedName("Ip6InternetServiceProvider")
    @Expose
    private String Ip6InternetServiceProvider;

    /**
     * Get 转换实例名称 
     * @return Ip6TranslatorName 转换实例名称
     */
    public String getIp6TranslatorName() {
        return this.Ip6TranslatorName;
    }

    /**
     * Set 转换实例名称
     * @param Ip6TranslatorName 转换实例名称
     */
    public void setIp6TranslatorName(String Ip6TranslatorName) {
        this.Ip6TranslatorName = Ip6TranslatorName;
    }

    /**
     * Get 创建转换实例数量，默认是1个 
     * @return Ip6TranslatorCount 创建转换实例数量，默认是1个
     */
    public Long getIp6TranslatorCount() {
        return this.Ip6TranslatorCount;
    }

    /**
     * Set 创建转换实例数量，默认是1个
     * @param Ip6TranslatorCount 创建转换实例数量，默认是1个
     */
    public void setIp6TranslatorCount(Long Ip6TranslatorCount) {
        this.Ip6TranslatorCount = Ip6TranslatorCount;
    }

    /**
     * Get 转换实例运营商属性，可取"CMCC","CTCC","CUCC","BGP" 
     * @return Ip6InternetServiceProvider 转换实例运营商属性，可取"CMCC","CTCC","CUCC","BGP"
     */
    public String getIp6InternetServiceProvider() {
        return this.Ip6InternetServiceProvider;
    }

    /**
     * Set 转换实例运营商属性，可取"CMCC","CTCC","CUCC","BGP"
     * @param Ip6InternetServiceProvider 转换实例运营商属性，可取"CMCC","CTCC","CUCC","BGP"
     */
    public void setIp6InternetServiceProvider(String Ip6InternetServiceProvider) {
        this.Ip6InternetServiceProvider = Ip6InternetServiceProvider;
    }

    public CreateIp6TranslatorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIp6TranslatorsRequest(CreateIp6TranslatorsRequest source) {
        if (source.Ip6TranslatorName != null) {
            this.Ip6TranslatorName = new String(source.Ip6TranslatorName);
        }
        if (source.Ip6TranslatorCount != null) {
            this.Ip6TranslatorCount = new Long(source.Ip6TranslatorCount);
        }
        if (source.Ip6InternetServiceProvider != null) {
            this.Ip6InternetServiceProvider = new String(source.Ip6InternetServiceProvider);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip6TranslatorName", this.Ip6TranslatorName);
        this.setParamSimple(map, prefix + "Ip6TranslatorCount", this.Ip6TranslatorCount);
        this.setParamSimple(map, prefix + "Ip6InternetServiceProvider", this.Ip6InternetServiceProvider);

    }
}

