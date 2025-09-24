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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecretInfo extends AbstractModel {

    /**
    * 密钥上传方式，可选值：manual、upload
    */
    @SerializedName("SecretSource")
    @Expose
    private String SecretSource;

    /**
    * 密钥内容（用户手动输入/前端从密钥文件提取出的密钥内容）
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 上传的密钥文件文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get 密钥上传方式，可选值：manual、upload 
     * @return SecretSource 密钥上传方式，可选值：manual、upload
     */
    public String getSecretSource() {
        return this.SecretSource;
    }

    /**
     * Set 密钥上传方式，可选值：manual、upload
     * @param SecretSource 密钥上传方式，可选值：manual、upload
     */
    public void setSecretSource(String SecretSource) {
        this.SecretSource = SecretSource;
    }

    /**
     * Get 密钥内容（用户手动输入/前端从密钥文件提取出的密钥内容） 
     * @return SecretKey 密钥内容（用户手动输入/前端从密钥文件提取出的密钥内容）
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 密钥内容（用户手动输入/前端从密钥文件提取出的密钥内容）
     * @param SecretKey 密钥内容（用户手动输入/前端从密钥文件提取出的密钥内容）
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 上传的密钥文件文件名 
     * @return FileName 上传的密钥文件文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 上传的密钥文件文件名
     * @param FileName 上传的密钥文件文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public SecretInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecretInfo(SecretInfo source) {
        if (source.SecretSource != null) {
            this.SecretSource = new String(source.SecretSource);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretSource", this.SecretSource);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

