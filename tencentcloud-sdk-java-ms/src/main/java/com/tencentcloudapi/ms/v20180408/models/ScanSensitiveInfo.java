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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanSensitiveInfo extends AbstractModel{

    /**
    * 敏感词
    */
    @SerializedName("WordList")
    @Expose
    private String [] WordList;

    /**
    * 敏感词对应的文件信息
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 文件sha1值
    */
    @SerializedName("FileSha")
    @Expose
    private String FileSha;

    /**
     * Get 敏感词 
     * @return WordList 敏感词
     */
    public String [] getWordList() {
        return this.WordList;
    }

    /**
     * Set 敏感词
     * @param WordList 敏感词
     */
    public void setWordList(String [] WordList) {
        this.WordList = WordList;
    }

    /**
     * Get 敏感词对应的文件信息 
     * @return FilePath 敏感词对应的文件信息
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 敏感词对应的文件信息
     * @param FilePath 敏感词对应的文件信息
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 文件sha1值 
     * @return FileSha 文件sha1值
     */
    public String getFileSha() {
        return this.FileSha;
    }

    /**
     * Set 文件sha1值
     * @param FileSha 文件sha1值
     */
    public void setFileSha(String FileSha) {
        this.FileSha = FileSha;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WordList.", this.WordList);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileSha", this.FileSha);

    }
}

