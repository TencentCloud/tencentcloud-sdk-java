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
package com.tencentcloudapi.yunsou.v20191115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchResultItem extends AbstractModel{

    /**
    * 动态摘要信息
    */
    @SerializedName("DocAbs")
    @Expose
    private String DocAbs;

    /**
    * 检索文档id
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * 原始文档信息
    */
    @SerializedName("DocMeta")
    @Expose
    private String DocMeta;

    /**
    * 精计算得分
    */
    @SerializedName("L2Score")
    @Expose
    private Float L2Score;

    /**
    * 文档级回传信息
    */
    @SerializedName("SearchDebuginfo")
    @Expose
    private String SearchDebuginfo;

    /**
     * Get 动态摘要信息 
     * @return DocAbs 动态摘要信息
     */
    public String getDocAbs() {
        return this.DocAbs;
    }

    /**
     * Set 动态摘要信息
     * @param DocAbs 动态摘要信息
     */
    public void setDocAbs(String DocAbs) {
        this.DocAbs = DocAbs;
    }

    /**
     * Get 检索文档id 
     * @return DocId 检索文档id
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set 检索文档id
     * @param DocId 检索文档id
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get 原始文档信息 
     * @return DocMeta 原始文档信息
     */
    public String getDocMeta() {
        return this.DocMeta;
    }

    /**
     * Set 原始文档信息
     * @param DocMeta 原始文档信息
     */
    public void setDocMeta(String DocMeta) {
        this.DocMeta = DocMeta;
    }

    /**
     * Get 精计算得分 
     * @return L2Score 精计算得分
     */
    public Float getL2Score() {
        return this.L2Score;
    }

    /**
     * Set 精计算得分
     * @param L2Score 精计算得分
     */
    public void setL2Score(Float L2Score) {
        this.L2Score = L2Score;
    }

    /**
     * Get 文档级回传信息 
     * @return SearchDebuginfo 文档级回传信息
     */
    public String getSearchDebuginfo() {
        return this.SearchDebuginfo;
    }

    /**
     * Set 文档级回传信息
     * @param SearchDebuginfo 文档级回传信息
     */
    public void setSearchDebuginfo(String SearchDebuginfo) {
        this.SearchDebuginfo = SearchDebuginfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocAbs", this.DocAbs);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "DocMeta", this.DocMeta);
        this.setParamSimple(map, prefix + "L2Score", this.L2Score);
        this.setParamSimple(map, prefix + "SearchDebuginfo", this.SearchDebuginfo);

    }
}

