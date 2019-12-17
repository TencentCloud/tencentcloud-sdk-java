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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVocabRequest extends AbstractModel{

    /**
    * 要查询词汇的词汇库名
    */
    @SerializedName("VocabLibName")
    @Expose
    private String VocabLibName;

    /**
     * Get 要查询词汇的词汇库名 
     * @return VocabLibName 要查询词汇的词汇库名
     */
    public String getVocabLibName() {
        return this.VocabLibName;
    }

    /**
     * Set 要查询词汇的词汇库名
     * @param VocabLibName 要查询词汇的词汇库名
     */
    public void setVocabLibName(String VocabLibName) {
        this.VocabLibName = VocabLibName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VocabLibName", this.VocabLibName);

    }
}

