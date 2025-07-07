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
    * 词表名称，长度在1-20之间
仅限中英文数字-_
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 词文件（纯文本文件）的二进制base64编码，以行分隔
格式要求：TXT
每行只有一个词，不满足格式则报错无法上传
每个词限制**5个汉字，15个字符**，单个词库最多不超过100个词
注意不要有空行，尤其是最后一行
    */
    @SerializedName("KeyWordFile")
    @Expose
    private String KeyWordFile;

    /**
     * Get 词表名称，长度在1-20之间
仅限中英文数字-_ 
     * @return Name 词表名称，长度在1-20之间
仅限中英文数字-_
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 词表名称，长度在1-20之间
仅限中英文数字-_
     * @param Name 词表名称，长度在1-20之间
仅限中英文数字-_
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 词文件（纯文本文件）的二进制base64编码，以行分隔
格式要求：TXT
每行只有一个词，不满足格式则报错无法上传
每个词限制**5个汉字，15个字符**，单个词库最多不超过100个词
注意不要有空行，尤其是最后一行 
     * @return KeyWordFile 词文件（纯文本文件）的二进制base64编码，以行分隔
格式要求：TXT
每行只有一个词，不满足格式则报错无法上传
每个词限制**5个汉字，15个字符**，单个词库最多不超过100个词
注意不要有空行，尤其是最后一行
     */
    public String getKeyWordFile() {
        return this.KeyWordFile;
    }

    /**
     * Set 词文件（纯文本文件）的二进制base64编码，以行分隔
格式要求：TXT
每行只有一个词，不满足格式则报错无法上传
每个词限制**5个汉字，15个字符**，单个词库最多不超过100个词
注意不要有空行，尤其是最后一行
     * @param KeyWordFile 词文件（纯文本文件）的二进制base64编码，以行分隔
格式要求：TXT
每行只有一个词，不满足格式则报错无法上传
每个词限制**5个汉字，15个字符**，单个词库最多不超过100个词
注意不要有空行，尤其是最后一行
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

