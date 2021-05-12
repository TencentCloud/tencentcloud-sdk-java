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
    * QQ分词词典列表
    */
    @SerializedName("QQDict")
    @Expose
    private DictInfo [] QQDict;

    /**
    * 同义词词典列表
    */
    @SerializedName("Synonym")
    @Expose
    private DictInfo [] Synonym;

    /**
    * 更新词典类型
    */
    @SerializedName("UpdateType")
    @Expose
    private String UpdateType;

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
     * Get QQ分词词典列表 
     * @return QQDict QQ分词词典列表
     */
    public DictInfo [] getQQDict() {
        return this.QQDict;
    }

    /**
     * Set QQ分词词典列表
     * @param QQDict QQ分词词典列表
     */
    public void setQQDict(DictInfo [] QQDict) {
        this.QQDict = QQDict;
    }

    /**
     * Get 同义词词典列表 
     * @return Synonym 同义词词典列表
     */
    public DictInfo [] getSynonym() {
        return this.Synonym;
    }

    /**
     * Set 同义词词典列表
     * @param Synonym 同义词词典列表
     */
    public void setSynonym(DictInfo [] Synonym) {
        this.Synonym = Synonym;
    }

    /**
     * Get 更新词典类型 
     * @return UpdateType 更新词典类型
     */
    public String getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set 更新词典类型
     * @param UpdateType 更新词典类型
     */
    public void setUpdateType(String UpdateType) {
        this.UpdateType = UpdateType;
    }

    public EsDictionaryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsDictionaryInfo(EsDictionaryInfo source) {
        if (source.MainDict != null) {
            this.MainDict = new DictInfo[source.MainDict.length];
            for (int i = 0; i < source.MainDict.length; i++) {
                this.MainDict[i] = new DictInfo(source.MainDict[i]);
            }
        }
        if (source.Stopwords != null) {
            this.Stopwords = new DictInfo[source.Stopwords.length];
            for (int i = 0; i < source.Stopwords.length; i++) {
                this.Stopwords[i] = new DictInfo(source.Stopwords[i]);
            }
        }
        if (source.QQDict != null) {
            this.QQDict = new DictInfo[source.QQDict.length];
            for (int i = 0; i < source.QQDict.length; i++) {
                this.QQDict[i] = new DictInfo(source.QQDict[i]);
            }
        }
        if (source.Synonym != null) {
            this.Synonym = new DictInfo[source.Synonym.length];
            for (int i = 0; i < source.Synonym.length; i++) {
                this.Synonym[i] = new DictInfo(source.Synonym[i]);
            }
        }
        if (source.UpdateType != null) {
            this.UpdateType = new String(source.UpdateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MainDict.", this.MainDict);
        this.setParamArrayObj(map, prefix + "Stopwords.", this.Stopwords);
        this.setParamArrayObj(map, prefix + "QQDict.", this.QQDict);
        this.setParamArrayObj(map, prefix + "Synonym.", this.Synonym);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);

    }
}

