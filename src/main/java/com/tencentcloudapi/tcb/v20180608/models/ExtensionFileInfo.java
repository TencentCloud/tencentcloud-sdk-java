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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtensionFileInfo extends AbstractModel{

    /**
    * 模板里使用的地址
    */
    @SerializedName("CodeUri")
    @Expose
    private String CodeUri;

    /**
    * 上传文件的临时地址，含签名
    */
    @SerializedName("UploadUrl")
    @Expose
    private String UploadUrl;

    /**
    * 自定义密钥。如果为空，则表示不需要加密
    */
    @SerializedName("CustomKey")
    @Expose
    private String CustomKey;

    /**
    * 文件大小限制，单位M，客户端上传前需要主动检查文件大小，超过限制的文件会被删除。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get 模板里使用的地址 
     * @return CodeUri 模板里使用的地址
     */
    public String getCodeUri() {
        return this.CodeUri;
    }

    /**
     * Set 模板里使用的地址
     * @param CodeUri 模板里使用的地址
     */
    public void setCodeUri(String CodeUri) {
        this.CodeUri = CodeUri;
    }

    /**
     * Get 上传文件的临时地址，含签名 
     * @return UploadUrl 上传文件的临时地址，含签名
     */
    public String getUploadUrl() {
        return this.UploadUrl;
    }

    /**
     * Set 上传文件的临时地址，含签名
     * @param UploadUrl 上传文件的临时地址，含签名
     */
    public void setUploadUrl(String UploadUrl) {
        this.UploadUrl = UploadUrl;
    }

    /**
     * Get 自定义密钥。如果为空，则表示不需要加密 
     * @return CustomKey 自定义密钥。如果为空，则表示不需要加密
     */
    public String getCustomKey() {
        return this.CustomKey;
    }

    /**
     * Set 自定义密钥。如果为空，则表示不需要加密
     * @param CustomKey 自定义密钥。如果为空，则表示不需要加密
     */
    public void setCustomKey(String CustomKey) {
        this.CustomKey = CustomKey;
    }

    /**
     * Get 文件大小限制，单位M，客户端上传前需要主动检查文件大小，超过限制的文件会被删除。 
     * @return MaxSize 文件大小限制，单位M，客户端上传前需要主动检查文件大小，超过限制的文件会被删除。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 文件大小限制，单位M，客户端上传前需要主动检查文件大小，超过限制的文件会被删除。
     * @param MaxSize 文件大小限制，单位M，客户端上传前需要主动检查文件大小，超过限制的文件会被删除。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public ExtensionFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtensionFileInfo(ExtensionFileInfo source) {
        if (source.CodeUri != null) {
            this.CodeUri = new String(source.CodeUri);
        }
        if (source.UploadUrl != null) {
            this.UploadUrl = new String(source.UploadUrl);
        }
        if (source.CustomKey != null) {
            this.CustomKey = new String(source.CustomKey);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CodeUri", this.CodeUri);
        this.setParamSimple(map, prefix + "UploadUrl", this.UploadUrl);
        this.setParamSimple(map, prefix + "CustomKey", this.CustomKey);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

