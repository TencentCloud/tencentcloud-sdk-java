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

public class UpdateAsrKeyWordLibRequest extends AbstractModel {

    /**
    * <p>关键词表ID</p>
    */
    @SerializedName("KeyWordLibId")
    @Expose
    private String KeyWordLibId;

    /**
    * <p>词表名称，长度在1-20之间<br>仅限中英文数字-_</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <ul><li>词文件（纯文本文件）以行分隔 ，进行二进制base64编码</li><li>格式要求：TXT 每行只有一个词，不满足格式则报错无法上传 </li><li>每个词最多5个汉字或15个字符，单个词库最多不超过100个词</li><li>此参数为空则只更新词表名称</li></ul>
    */
    @SerializedName("KeyWordFile")
    @Expose
    private String KeyWordFile;

    /**
     * Get <p>关键词表ID</p> 
     * @return KeyWordLibId <p>关键词表ID</p>
     */
    public String getKeyWordLibId() {
        return this.KeyWordLibId;
    }

    /**
     * Set <p>关键词表ID</p>
     * @param KeyWordLibId <p>关键词表ID</p>
     */
    public void setKeyWordLibId(String KeyWordLibId) {
        this.KeyWordLibId = KeyWordLibId;
    }

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
     * Get <ul><li>词文件（纯文本文件）以行分隔 ，进行二进制base64编码</li><li>格式要求：TXT 每行只有一个词，不满足格式则报错无法上传 </li><li>每个词最多5个汉字或15个字符，单个词库最多不超过100个词</li><li>此参数为空则只更新词表名称</li></ul> 
     * @return KeyWordFile <ul><li>词文件（纯文本文件）以行分隔 ，进行二进制base64编码</li><li>格式要求：TXT 每行只有一个词，不满足格式则报错无法上传 </li><li>每个词最多5个汉字或15个字符，单个词库最多不超过100个词</li><li>此参数为空则只更新词表名称</li></ul>
     */
    public String getKeyWordFile() {
        return this.KeyWordFile;
    }

    /**
     * Set <ul><li>词文件（纯文本文件）以行分隔 ，进行二进制base64编码</li><li>格式要求：TXT 每行只有一个词，不满足格式则报错无法上传 </li><li>每个词最多5个汉字或15个字符，单个词库最多不超过100个词</li><li>此参数为空则只更新词表名称</li></ul>
     * @param KeyWordFile <ul><li>词文件（纯文本文件）以行分隔 ，进行二进制base64编码</li><li>格式要求：TXT 每行只有一个词，不满足格式则报错无法上传 </li><li>每个词最多5个汉字或15个字符，单个词库最多不超过100个词</li><li>此参数为空则只更新词表名称</li></ul>
     */
    public void setKeyWordFile(String KeyWordFile) {
        this.KeyWordFile = KeyWordFile;
    }

    public UpdateAsrKeyWordLibRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAsrKeyWordLibRequest(UpdateAsrKeyWordLibRequest source) {
        if (source.KeyWordLibId != null) {
            this.KeyWordLibId = new String(source.KeyWordLibId);
        }
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
        this.setParamSimple(map, prefix + "KeyWordLibId", this.KeyWordLibId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "KeyWordFile", this.KeyWordFile);

    }
}

