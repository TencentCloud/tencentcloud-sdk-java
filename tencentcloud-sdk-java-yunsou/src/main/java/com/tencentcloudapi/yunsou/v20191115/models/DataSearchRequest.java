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

public class DataSearchRequest extends AbstractModel{

    /**
    * 云搜的业务ID，用以表明当前数据请求的业务
    */
    @SerializedName("ResourceId")
    @Expose
    private Long ResourceId;

    /**
    * 检索串
    */
    @SerializedName("SearchQuery")
    @Expose
    private String SearchQuery;

    /**
    * 当前页，从第0页开始计算
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * 每页结果数
    */
    @SerializedName("NumPerPage")
    @Expose
    private Long NumPerPage;

    /**
    * 当前检索号，用于定位问题，建议指定并且全局唯一
    */
    @SerializedName("SearchId")
    @Expose
    private String SearchId;

    /**
    * 请求编码，0表示utf8，1表示gbk，建议指定
    */
    @SerializedName("QueryEncode")
    @Expose
    private Long QueryEncode;

    /**
    * 排序类型
    */
    @SerializedName("RankType")
    @Expose
    private Long RankType;

    /**
    * 数值过滤，结果中按属性过滤
    */
    @SerializedName("NumFilter")
    @Expose
    private String NumFilter;

    /**
    * 分类过滤，导航类检索请求
    */
    @SerializedName("ClFilter")
    @Expose
    private String ClFilter;

    /**
    * 检索用户相关字段
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 检索来源
    */
    @SerializedName("SourceId")
    @Expose
    private Long SourceId;

    /**
    * 是否进行二次检索，0关闭，1打开
    */
    @SerializedName("SecondSearch")
    @Expose
    private Long SecondSearch;

    /**
    * 指定返回最大篇数，无特殊原因不建议指定
    */
    @SerializedName("MaxDocReturn")
    @Expose
    private Long MaxDocReturn;

    /**
    * 是否smartbox检索，0关闭，1打开
    */
    @SerializedName("IsSmartbox")
    @Expose
    private Long IsSmartbox;

    /**
    * 是否打开高红标亮，0关闭，1打开
    */
    @SerializedName("EnableAbsHighlight")
    @Expose
    private Long EnableAbsHighlight;

    /**
    * 指定访问QC纠错业务ID
    */
    @SerializedName("QcBid")
    @Expose
    private Long QcBid;

    /**
    * 按指定字段进行group by，只能对数值字段进行操作
    */
    @SerializedName("GroupBy")
    @Expose
    private String GroupBy;

    /**
    * 按指定字段进行distinct，只能对数值字段进行操作
    */
    @SerializedName("Distinct")
    @Expose
    private String Distinct;

    /**
    * 高级排序参数，具体参见高级排序说明
    */
    @SerializedName("L4RankExpression")
    @Expose
    private String L4RankExpression;

    /**
    * 高级排序参数，具体参见高级排序说明
    */
    @SerializedName("MatchValue")
    @Expose
    private String MatchValue;

    /**
    * 经度信息
    */
    @SerializedName("Longitude")
    @Expose
    private Float Longitude;

    /**
    * 纬度信息
    */
    @SerializedName("Latitude")
    @Expose
    private Float Latitude;

    /**
    * 分类过滤并集
    */
    @SerializedName("MultiFilter")
    @Expose
    private String [] MultiFilter;

    /**
     * Get 云搜的业务ID，用以表明当前数据请求的业务 
     * @return ResourceId 云搜的业务ID，用以表明当前数据请求的业务
     */
    public Long getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 云搜的业务ID，用以表明当前数据请求的业务
     * @param ResourceId 云搜的业务ID，用以表明当前数据请求的业务
     */
    public void setResourceId(Long ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 检索串 
     * @return SearchQuery 检索串
     */
    public String getSearchQuery() {
        return this.SearchQuery;
    }

    /**
     * Set 检索串
     * @param SearchQuery 检索串
     */
    public void setSearchQuery(String SearchQuery) {
        this.SearchQuery = SearchQuery;
    }

    /**
     * Get 当前页，从第0页开始计算 
     * @return PageId 当前页，从第0页开始计算
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set 当前页，从第0页开始计算
     * @param PageId 当前页，从第0页开始计算
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 每页结果数 
     * @return NumPerPage 每页结果数
     */
    public Long getNumPerPage() {
        return this.NumPerPage;
    }

    /**
     * Set 每页结果数
     * @param NumPerPage 每页结果数
     */
    public void setNumPerPage(Long NumPerPage) {
        this.NumPerPage = NumPerPage;
    }

    /**
     * Get 当前检索号，用于定位问题，建议指定并且全局唯一 
     * @return SearchId 当前检索号，用于定位问题，建议指定并且全局唯一
     */
    public String getSearchId() {
        return this.SearchId;
    }

    /**
     * Set 当前检索号，用于定位问题，建议指定并且全局唯一
     * @param SearchId 当前检索号，用于定位问题，建议指定并且全局唯一
     */
    public void setSearchId(String SearchId) {
        this.SearchId = SearchId;
    }

    /**
     * Get 请求编码，0表示utf8，1表示gbk，建议指定 
     * @return QueryEncode 请求编码，0表示utf8，1表示gbk，建议指定
     */
    public Long getQueryEncode() {
        return this.QueryEncode;
    }

    /**
     * Set 请求编码，0表示utf8，1表示gbk，建议指定
     * @param QueryEncode 请求编码，0表示utf8，1表示gbk，建议指定
     */
    public void setQueryEncode(Long QueryEncode) {
        this.QueryEncode = QueryEncode;
    }

    /**
     * Get 排序类型 
     * @return RankType 排序类型
     */
    public Long getRankType() {
        return this.RankType;
    }

    /**
     * Set 排序类型
     * @param RankType 排序类型
     */
    public void setRankType(Long RankType) {
        this.RankType = RankType;
    }

    /**
     * Get 数值过滤，结果中按属性过滤 
     * @return NumFilter 数值过滤，结果中按属性过滤
     */
    public String getNumFilter() {
        return this.NumFilter;
    }

    /**
     * Set 数值过滤，结果中按属性过滤
     * @param NumFilter 数值过滤，结果中按属性过滤
     */
    public void setNumFilter(String NumFilter) {
        this.NumFilter = NumFilter;
    }

    /**
     * Get 分类过滤，导航类检索请求 
     * @return ClFilter 分类过滤，导航类检索请求
     */
    public String getClFilter() {
        return this.ClFilter;
    }

    /**
     * Set 分类过滤，导航类检索请求
     * @param ClFilter 分类过滤，导航类检索请求
     */
    public void setClFilter(String ClFilter) {
        this.ClFilter = ClFilter;
    }

    /**
     * Get 检索用户相关字段 
     * @return Extra 检索用户相关字段
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 检索用户相关字段
     * @param Extra 检索用户相关字段
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 检索来源 
     * @return SourceId 检索来源
     */
    public Long getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 检索来源
     * @param SourceId 检索来源
     */
    public void setSourceId(Long SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 是否进行二次检索，0关闭，1打开 
     * @return SecondSearch 是否进行二次检索，0关闭，1打开
     */
    public Long getSecondSearch() {
        return this.SecondSearch;
    }

    /**
     * Set 是否进行二次检索，0关闭，1打开
     * @param SecondSearch 是否进行二次检索，0关闭，1打开
     */
    public void setSecondSearch(Long SecondSearch) {
        this.SecondSearch = SecondSearch;
    }

    /**
     * Get 指定返回最大篇数，无特殊原因不建议指定 
     * @return MaxDocReturn 指定返回最大篇数，无特殊原因不建议指定
     */
    public Long getMaxDocReturn() {
        return this.MaxDocReturn;
    }

    /**
     * Set 指定返回最大篇数，无特殊原因不建议指定
     * @param MaxDocReturn 指定返回最大篇数，无特殊原因不建议指定
     */
    public void setMaxDocReturn(Long MaxDocReturn) {
        this.MaxDocReturn = MaxDocReturn;
    }

    /**
     * Get 是否smartbox检索，0关闭，1打开 
     * @return IsSmartbox 是否smartbox检索，0关闭，1打开
     */
    public Long getIsSmartbox() {
        return this.IsSmartbox;
    }

    /**
     * Set 是否smartbox检索，0关闭，1打开
     * @param IsSmartbox 是否smartbox检索，0关闭，1打开
     */
    public void setIsSmartbox(Long IsSmartbox) {
        this.IsSmartbox = IsSmartbox;
    }

    /**
     * Get 是否打开高红标亮，0关闭，1打开 
     * @return EnableAbsHighlight 是否打开高红标亮，0关闭，1打开
     */
    public Long getEnableAbsHighlight() {
        return this.EnableAbsHighlight;
    }

    /**
     * Set 是否打开高红标亮，0关闭，1打开
     * @param EnableAbsHighlight 是否打开高红标亮，0关闭，1打开
     */
    public void setEnableAbsHighlight(Long EnableAbsHighlight) {
        this.EnableAbsHighlight = EnableAbsHighlight;
    }

    /**
     * Get 指定访问QC纠错业务ID 
     * @return QcBid 指定访问QC纠错业务ID
     */
    public Long getQcBid() {
        return this.QcBid;
    }

    /**
     * Set 指定访问QC纠错业务ID
     * @param QcBid 指定访问QC纠错业务ID
     */
    public void setQcBid(Long QcBid) {
        this.QcBid = QcBid;
    }

    /**
     * Get 按指定字段进行group by，只能对数值字段进行操作 
     * @return GroupBy 按指定字段进行group by，只能对数值字段进行操作
     */
    public String getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set 按指定字段进行group by，只能对数值字段进行操作
     * @param GroupBy 按指定字段进行group by，只能对数值字段进行操作
     */
    public void setGroupBy(String GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get 按指定字段进行distinct，只能对数值字段进行操作 
     * @return Distinct 按指定字段进行distinct，只能对数值字段进行操作
     */
    public String getDistinct() {
        return this.Distinct;
    }

    /**
     * Set 按指定字段进行distinct，只能对数值字段进行操作
     * @param Distinct 按指定字段进行distinct，只能对数值字段进行操作
     */
    public void setDistinct(String Distinct) {
        this.Distinct = Distinct;
    }

    /**
     * Get 高级排序参数，具体参见高级排序说明 
     * @return L4RankExpression 高级排序参数，具体参见高级排序说明
     */
    public String getL4RankExpression() {
        return this.L4RankExpression;
    }

    /**
     * Set 高级排序参数，具体参见高级排序说明
     * @param L4RankExpression 高级排序参数，具体参见高级排序说明
     */
    public void setL4RankExpression(String L4RankExpression) {
        this.L4RankExpression = L4RankExpression;
    }

    /**
     * Get 高级排序参数，具体参见高级排序说明 
     * @return MatchValue 高级排序参数，具体参见高级排序说明
     */
    public String getMatchValue() {
        return this.MatchValue;
    }

    /**
     * Set 高级排序参数，具体参见高级排序说明
     * @param MatchValue 高级排序参数，具体参见高级排序说明
     */
    public void setMatchValue(String MatchValue) {
        this.MatchValue = MatchValue;
    }

    /**
     * Get 经度信息 
     * @return Longitude 经度信息
     */
    public Float getLongitude() {
        return this.Longitude;
    }

    /**
     * Set 经度信息
     * @param Longitude 经度信息
     */
    public void setLongitude(Float Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get 纬度信息 
     * @return Latitude 纬度信息
     */
    public Float getLatitude() {
        return this.Latitude;
    }

    /**
     * Set 纬度信息
     * @param Latitude 纬度信息
     */
    public void setLatitude(Float Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get 分类过滤并集 
     * @return MultiFilter 分类过滤并集
     */
    public String [] getMultiFilter() {
        return this.MultiFilter;
    }

    /**
     * Set 分类过滤并集
     * @param MultiFilter 分类过滤并集
     */
    public void setMultiFilter(String [] MultiFilter) {
        this.MultiFilter = MultiFilter;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "SearchQuery", this.SearchQuery);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "NumPerPage", this.NumPerPage);
        this.setParamSimple(map, prefix + "SearchId", this.SearchId);
        this.setParamSimple(map, prefix + "QueryEncode", this.QueryEncode);
        this.setParamSimple(map, prefix + "RankType", this.RankType);
        this.setParamSimple(map, prefix + "NumFilter", this.NumFilter);
        this.setParamSimple(map, prefix + "ClFilter", this.ClFilter);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SecondSearch", this.SecondSearch);
        this.setParamSimple(map, prefix + "MaxDocReturn", this.MaxDocReturn);
        this.setParamSimple(map, prefix + "IsSmartbox", this.IsSmartbox);
        this.setParamSimple(map, prefix + "EnableAbsHighlight", this.EnableAbsHighlight);
        this.setParamSimple(map, prefix + "QcBid", this.QcBid);
        this.setParamSimple(map, prefix + "GroupBy", this.GroupBy);
        this.setParamSimple(map, prefix + "Distinct", this.Distinct);
        this.setParamSimple(map, prefix + "L4RankExpression", this.L4RankExpression);
        this.setParamSimple(map, prefix + "MatchValue", this.MatchValue);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamArraySimple(map, prefix + "MultiFilter.", this.MultiFilter);

    }
}

