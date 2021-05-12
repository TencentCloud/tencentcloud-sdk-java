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

public class DocumentSDK extends AbstractModel{

    /**
    * 生成的 document 会存放到 COS 中，此出参返回产生文件的下载链接。
    */
    @SerializedName("DocumentURL")
    @Expose
    private String DocumentURL;

    /**
    * 生成的 SDK 会存放到 COS 中，此出参返回产生 SDK 文件的下载链接。
    */
    @SerializedName("SdkURL")
    @Expose
    private String SdkURL;

    /**
     * Get 生成的 document 会存放到 COS 中，此出参返回产生文件的下载链接。 
     * @return DocumentURL 生成的 document 会存放到 COS 中，此出参返回产生文件的下载链接。
     */
    public String getDocumentURL() {
        return this.DocumentURL;
    }

    /**
     * Set 生成的 document 会存放到 COS 中，此出参返回产生文件的下载链接。
     * @param DocumentURL 生成的 document 会存放到 COS 中，此出参返回产生文件的下载链接。
     */
    public void setDocumentURL(String DocumentURL) {
        this.DocumentURL = DocumentURL;
    }

    /**
     * Get 生成的 SDK 会存放到 COS 中，此出参返回产生 SDK 文件的下载链接。 
     * @return SdkURL 生成的 SDK 会存放到 COS 中，此出参返回产生 SDK 文件的下载链接。
     */
    public String getSdkURL() {
        return this.SdkURL;
    }

    /**
     * Set 生成的 SDK 会存放到 COS 中，此出参返回产生 SDK 文件的下载链接。
     * @param SdkURL 生成的 SDK 会存放到 COS 中，此出参返回产生 SDK 文件的下载链接。
     */
    public void setSdkURL(String SdkURL) {
        this.SdkURL = SdkURL;
    }

    public DocumentSDK() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocumentSDK(DocumentSDK source) {
        if (source.DocumentURL != null) {
            this.DocumentURL = new String(source.DocumentURL);
        }
        if (source.SdkURL != null) {
            this.SdkURL = new String(source.SdkURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocumentURL", this.DocumentURL);
        this.setParamSimple(map, prefix + "SdkURL", this.SdkURL);

    }
}

