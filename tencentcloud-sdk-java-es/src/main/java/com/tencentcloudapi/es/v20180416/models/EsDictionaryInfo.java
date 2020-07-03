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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EsDictionaryInfo extends AbstractModel{

    /**
    * 启用词词典列表
    */
    @SerializedName("MainDict")
    @Expose
    private DictInfo [] MainDict;

    /**
    * 停用词词典列表
    */
    @SerializedName("Stopwords")
    @Expose
    private DictInfo [] Stopwords;

    /**
     * Get 启用词词典列表 
     * @return MainDict 启用词词典列表
     */
    public DictInfo [] getMainDict() {
        return this.MainDict;
    }

    /**
     * Set 启用词词典列表
     * @param MainDict 启用词词典列表
     */
    public void setMainDict(DictInfo [] MainDict) {
        this.MainDict = MainDict;
    }

    /**
     * Get 停用词词典列表 
     * @return Stopwords 停用词词典列表
     */
    public DictInfo [] getStopwords() {
        return this.Stopwords;
    }

    /**
     * Set 停用词词典列表
     * @param Stopwords 停用词词典列表
     */
    public void setStopwords(DictInfo [] Stopwords) {
        this.Stopwords = Stopwords;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MainDict.", this.MainDict);
        this.setParamArrayObj(map, prefix + "Stopwords.", this.Stopwords);

    }
}

