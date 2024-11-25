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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunReRankRequest extends AbstractModel {

    /**
    * 模型名称, 必填，默认: lke-reranker-base
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 文档列表，必填，最多20个
    */
    @SerializedName("Docs")
    @Expose
    private String [] Docs;

    /**
    * 模型名称, 非必填，默认: lke-reranker-base
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 需要计算关联性的2段内容
    */
    @SerializedName("DataList")
    @Expose
    private ReRankDataObject [] DataList;

    /**
    * 是否在线, 后台异步任务使用离线, 实时任务使用在线, 默认值: false
    */
    @SerializedName("Online")
    @Expose
    private Boolean Online;

    /**
     * Get 模型名称, 必填，默认: lke-reranker-base 
     * @return Query 模型名称, 必填，默认: lke-reranker-base
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 模型名称, 必填，默认: lke-reranker-base
     * @param Query 模型名称, 必填，默认: lke-reranker-base
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 文档列表，必填，最多20个 
     * @return Docs 文档列表，必填，最多20个
     */
    public String [] getDocs() {
        return this.Docs;
    }

    /**
     * Set 文档列表，必填，最多20个
     * @param Docs 文档列表，必填，最多20个
     */
    public void setDocs(String [] Docs) {
        this.Docs = Docs;
    }

    /**
     * Get 模型名称, 非必填，默认: lke-reranker-base 
     * @return Model 模型名称, 非必填，默认: lke-reranker-base
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名称, 非必填，默认: lke-reranker-base
     * @param Model 模型名称, 非必填，默认: lke-reranker-base
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 需要计算关联性的2段内容 
     * @return DataList 需要计算关联性的2段内容
     * @deprecated
     */
    @Deprecated
    public ReRankDataObject [] getDataList() {
        return this.DataList;
    }

    /**
     * Set 需要计算关联性的2段内容
     * @param DataList 需要计算关联性的2段内容
     * @deprecated
     */
    @Deprecated
    public void setDataList(ReRankDataObject [] DataList) {
        this.DataList = DataList;
    }

    /**
     * Get 是否在线, 后台异步任务使用离线, 实时任务使用在线, 默认值: false 
     * @return Online 是否在线, 后台异步任务使用离线, 实时任务使用在线, 默认值: false
     * @deprecated
     */
    @Deprecated
    public Boolean getOnline() {
        return this.Online;
    }

    /**
     * Set 是否在线, 后台异步任务使用离线, 实时任务使用在线, 默认值: false
     * @param Online 是否在线, 后台异步任务使用离线, 实时任务使用在线, 默认值: false
     * @deprecated
     */
    @Deprecated
    public void setOnline(Boolean Online) {
        this.Online = Online;
    }

    public RunReRankRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunReRankRequest(RunReRankRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Docs != null) {
            this.Docs = new String[source.Docs.length];
            for (int i = 0; i < source.Docs.length; i++) {
                this.Docs[i] = new String(source.Docs[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.DataList != null) {
            this.DataList = new ReRankDataObject[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new ReRankDataObject(source.DataList[i]);
            }
        }
        if (source.Online != null) {
            this.Online = new Boolean(source.Online);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Docs.", this.Docs);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);
        this.setParamSimple(map, prefix + "Online", this.Online);

    }
}

