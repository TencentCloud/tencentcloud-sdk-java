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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAsrKeyWordLibRequest extends AbstractModel {

    /**
    * <p>词表名称，长度在1-20之间<br>仅限中英文数字-_</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>词文件（纯文本文件）的二进制base64编码，以行分隔<br>格式要求：TXT<br>每行只有一个词，不满足格式则报错无法上传<br>每个词限制<strong>5个汉字，15个字符</strong>，单个词库最多不超过100个词<br>注意不要有空行，尤其是最后一行</p>
    */
    @SerializedName("KeyWordFile")
    @Expose
    private String KeyWordFile;

    /**
     * Get <p>词表名称，长度在1-20之间<br>仅限中英文数字-_</p> 
     * @return Name <p>词表名称，长度在1-20之间<br>仅限中英文数字-_</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>词表名称，长度在1-20之间<br>仅限中英文数字-_</p>
     * @param Name <p>词表名称，长度在1-20之间<br>仅限中英文数字-_</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>词文件（纯文本文件）的二进制base64编码，以行分隔<br>格式要求：TXT<br>每行只有一个词，不满足格式则报错无法上传<br>每个词限制<strong>5个汉字，15个字符</strong>，单个词库最多不超过100个词<br>注意不要有空行，尤其是最后一行</p> 
     * @return KeyWordFile <p>词文件（纯文本文件）的二进制base64编码，以行分隔<br>格式要求：TXT<br>每行只有一个词，不满足格式则报错无法上传<br>每个词限制<strong>5个汉字，15个字符</strong>，单个词库最多不超过100个词<br>注意不要有空行，尤其是最后一行</p>
     */
    public String getKeyWordFile() {
        return this.KeyWordFile;
    }

    /**
     * Set <p>词文件（纯文本文件）的二进制base64编码，以行分隔<br>格式要求：TXT<br>每行只有一个词，不满足格式则报错无法上传<br>每个词限制<strong>5个汉字，15个字符</strong>，单个词库最多不超过100个词<br>注意不要有空行，尤其是最后一行</p>
     * @param KeyWordFile <p>词文件（纯文本文件）的二进制base64编码，以行分隔<br>格式要求：TXT<br>每行只有一个词，不满足格式则报错无法上传<br>每个词限制<strong>5个汉字，15个字符</strong>，单个词库最多不超过100个词<br>注意不要有空行，尤其是最后一行</p>
     */
    public void setKeyWordFile(String KeyWordFile) {
        this.KeyWordFile = KeyWordFile;
    }

    public CreateAsrKeyWordLibRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAsrKeyWordLibRequest(CreateAsrKeyWordLibRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.KeyWordFile != null) {
            this.KeyWordFile = new String(source.KeyWordFile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "KeyWordFile", this.KeyWordFile);

    }
}

