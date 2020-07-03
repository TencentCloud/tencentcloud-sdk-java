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

public class SearchResult extends AbstractModel{

    /**
    * 检索耗时，单位ms
    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
    * 搜索最多可以展示的结果数，多页
    */
    @SerializedName("DisplayNum")
    @Expose
    private Long DisplayNum;

    /**
    * 和检索请求中的echo相对应
    */
    @SerializedName("Echo")
    @Expose
    private String Echo;

    /**
    * 检索结果的估算篇数，由索引平台估算
    */
    @SerializedName("EResultNum")
    @Expose
    private Long EResultNum;

    /**
    * 检索返回的当前页码结果数
    */
    @SerializedName("ResultNum")
    @Expose
    private Long ResultNum;

    /**
    * 检索结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultList")
    @Expose
    private SearchResultItem [] ResultList;

    /**
    * 检索的分词结果，array类型，可包含多个
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegList")
    @Expose
    private SearchResultSeg [] SegList;

    /**
     * Get 检索耗时，单位ms 
     * @return CostTime 检索耗时，单位ms
     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 检索耗时，单位ms
     * @param CostTime 检索耗时，单位ms
     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get 搜索最多可以展示的结果数，多页 
     * @return DisplayNum 搜索最多可以展示的结果数，多页
     */
    public Long getDisplayNum() {
        return this.DisplayNum;
    }

    /**
     * Set 搜索最多可以展示的结果数，多页
     * @param DisplayNum 搜索最多可以展示的结果数，多页
     */
    public void setDisplayNum(Long DisplayNum) {
        this.DisplayNum = DisplayNum;
    }

    /**
     * Get 和检索请求中的echo相对应 
     * @return Echo 和检索请求中的echo相对应
     */
    public String getEcho() {
        return this.Echo;
    }

    /**
     * Set 和检索请求中的echo相对应
     * @param Echo 和检索请求中的echo相对应
     */
    public void setEcho(String Echo) {
        this.Echo = Echo;
    }

    /**
     * Get 检索结果的估算篇数，由索引平台估算 
     * @return EResultNum 检索结果的估算篇数，由索引平台估算
     */
    public Long getEResultNum() {
        return this.EResultNum;
    }

    /**
     * Set 检索结果的估算篇数，由索引平台估算
     * @param EResultNum 检索结果的估算篇数，由索引平台估算
     */
    public void setEResultNum(Long EResultNum) {
        this.EResultNum = EResultNum;
    }

    /**
     * Get 检索返回的当前页码结果数 
     * @return ResultNum 检索返回的当前页码结果数
     */
    public Long getResultNum() {
        return this.ResultNum;
    }

    /**
     * Set 检索返回的当前页码结果数
     * @param ResultNum 检索返回的当前页码结果数
     */
    public void setResultNum(Long ResultNum) {
        this.ResultNum = ResultNum;
    }

    /**
     * Get 检索结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultList 检索结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchResultItem [] getResultList() {
        return this.ResultList;
    }

    /**
     * Set 检索结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultList 检索结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultList(SearchResultItem [] ResultList) {
        this.ResultList = ResultList;
    }

    /**
     * Get 检索的分词结果，array类型，可包含多个
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegList 检索的分词结果，array类型，可包含多个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchResultSeg [] getSegList() {
        return this.SegList;
    }

    /**
     * Set 检索的分词结果，array类型，可包含多个
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegList 检索的分词结果，array类型，可包含多个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegList(SearchResultSeg [] SegList) {
        this.SegList = SegList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "DisplayNum", this.DisplayNum);
        this.setParamSimple(map, prefix + "Echo", this.Echo);
        this.setParamSimple(map, prefix + "EResultNum", this.EResultNum);
        this.setParamSimple(map, prefix + "ResultNum", this.ResultNum);
        this.setParamArrayObj(map, prefix + "ResultList.", this.ResultList);
        this.setParamArrayObj(map, prefix + "SegList.", this.SegList);

    }
}

