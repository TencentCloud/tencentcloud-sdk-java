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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchDocRsp extends AbstractModel {

    /**
    * 文档基本信息
    */
    @SerializedName("DocInfos")
    @Expose
    private SearchDocInfo [] DocInfos;

    /**
    * 文档总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 文档基本信息 
     * @return DocInfos 文档基本信息
     */
    public SearchDocInfo [] getDocInfos() {
        return this.DocInfos;
    }

    /**
     * Set 文档基本信息
     * @param DocInfos 文档基本信息
     */
    public void setDocInfos(SearchDocInfo [] DocInfos) {
        this.DocInfos = DocInfos;
    }

    /**
     * Get 文档总数 
     * @return Total 文档总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 文档总数
     * @param Total 文档总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public SearchDocRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchDocRsp(SearchDocRsp source) {
        if (source.DocInfos != null) {
            this.DocInfos = new SearchDocInfo[source.DocInfos.length];
            for (int i = 0; i < source.DocInfos.length; i++) {
                this.DocInfos[i] = new SearchDocInfo(source.DocInfos[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DocInfos.", this.DocInfos);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

