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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateApiDocumentRequest extends AbstractModel{

    /**
    * 待创建文档的服务唯一 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 待创建 SDK 的服务所在环境。
    */
    @SerializedName("GenEnvironment")
    @Expose
    private String GenEnvironment;

    /**
    * 待创建 SDK 的语言。当前只支持 Python 和 JavaScript。
    */
    @SerializedName("GenLanguage")
    @Expose
    private String GenLanguage;

    /**
     * Get 待创建文档的服务唯一 ID。 
     * @return ServiceId 待创建文档的服务唯一 ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 待创建文档的服务唯一 ID。
     * @param ServiceId 待创建文档的服务唯一 ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 待创建 SDK 的服务所在环境。 
     * @return GenEnvironment 待创建 SDK 的服务所在环境。
     */
    public String getGenEnvironment() {
        return this.GenEnvironment;
    }

    /**
     * Set 待创建 SDK 的服务所在环境。
     * @param GenEnvironment 待创建 SDK 的服务所在环境。
     */
    public void setGenEnvironment(String GenEnvironment) {
        this.GenEnvironment = GenEnvironment;
    }

    /**
     * Get 待创建 SDK 的语言。当前只支持 Python 和 JavaScript。 
     * @return GenLanguage 待创建 SDK 的语言。当前只支持 Python 和 JavaScript。
     */
    public String getGenLanguage() {
        return this.GenLanguage;
    }

    /**
     * Set 待创建 SDK 的语言。当前只支持 Python 和 JavaScript。
     * @param GenLanguage 待创建 SDK 的语言。当前只支持 Python 和 JavaScript。
     */
    public void setGenLanguage(String GenLanguage) {
        this.GenLanguage = GenLanguage;
    }

    public GenerateApiDocumentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateApiDocumentRequest(GenerateApiDocumentRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.GenEnvironment != null) {
            this.GenEnvironment = new String(source.GenEnvironment);
        }
        if (source.GenLanguage != null) {
            this.GenLanguage = new String(source.GenLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "GenEnvironment", this.GenEnvironment);
        this.setParamSimple(map, prefix + "GenLanguage", this.GenLanguage);

    }
}

