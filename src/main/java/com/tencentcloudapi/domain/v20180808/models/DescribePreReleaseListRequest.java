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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePreReleaseListRequest extends AbstractModel {

    /**
    * 关键词
    */
    @SerializedName("Keywords")
    @Expose
    private String Keywords;

    /**
    * 搜索关键字，开头
    */
    @SerializedName("DomainStart")
    @Expose
    private Boolean DomainStart;

    /**
    * 搜索关键字结尾
    */
    @SerializedName("DomainEnd")
    @Expose
    private Boolean DomainEnd;

    /**
    * 排序
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
    * 起始价格
    */
    @SerializedName("PriceStart")
    @Expose
    private Float PriceStart;

    /**
    * 结束价格
    */
    @SerializedName("PriceEnd")
    @Expose
    private Float PriceEnd;

    /**
    * 起始域名长度
    */
    @SerializedName("LengthStart")
    @Expose
    private Long LengthStart;

    /**
    * 结束域名长度
    */
    @SerializedName("LengthEnd")
    @Expose
    private Long LengthEnd;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 没页显示数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 后缀
    */
    @SerializedName("Suffix")
    @Expose
    private Long [] Suffix;

    /**
    * 一级分类
    */
    @SerializedName("ClassOne")
    @Expose
    private Long ClassOne;

    /**
    * 二级分类
    */
    @SerializedName("ClassTwo")
    @Expose
    private Long [] ClassTwo;

    /**
    * 三级分类
    */
    @SerializedName("ClassThree")
    @Expose
    private Long [] ClassThree;

    /**
    * 四级分类
    */
    @SerializedName("ClassFour")
    @Expose
    private Long [] ClassFour;

    /**
    * 排除关键字，开头
    */
    @SerializedName("FilterStart")
    @Expose
    private Boolean FilterStart;

    /**
    * 排除关键字，结尾
    */
    @SerializedName("FilterEnd")
    @Expose
    private Boolean FilterEnd;

    /**
    * 排除关键字
    */
    @SerializedName("FilterWords")
    @Expose
    private String FilterWords;

    /**
    * 交易类型
    */
    @SerializedName("TransType")
    @Expose
    private Long TransType;

    /**
    * 搜索白金域名
    */
    @SerializedName("IsTop")
    @Expose
    private Boolean IsTop;

    /**
    * 结束时间排序啊 desc:倒序 asc:正序
    */
    @SerializedName("EndTimeSort")
    @Expose
    private String EndTimeSort;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 关键词 
     * @return Keywords 关键词
     */
    public String getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 关键词
     * @param Keywords 关键词
     */
    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 搜索关键字，开头 
     * @return DomainStart 搜索关键字，开头
     */
    public Boolean getDomainStart() {
        return this.DomainStart;
    }

    /**
     * Set 搜索关键字，开头
     * @param DomainStart 搜索关键字，开头
     */
    public void setDomainStart(Boolean DomainStart) {
        this.DomainStart = DomainStart;
    }

    /**
     * Get 搜索关键字结尾 
     * @return DomainEnd 搜索关键字结尾
     */
    public Boolean getDomainEnd() {
        return this.DomainEnd;
    }

    /**
     * Set 搜索关键字结尾
     * @param DomainEnd 搜索关键字结尾
     */
    public void setDomainEnd(Boolean DomainEnd) {
        this.DomainEnd = DomainEnd;
    }

    /**
     * Get 排序 
     * @return Sort 排序
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set 排序
     * @param Sort 排序
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 起始价格 
     * @return PriceStart 起始价格
     */
    public Float getPriceStart() {
        return this.PriceStart;
    }

    /**
     * Set 起始价格
     * @param PriceStart 起始价格
     */
    public void setPriceStart(Float PriceStart) {
        this.PriceStart = PriceStart;
    }

    /**
     * Get 结束价格 
     * @return PriceEnd 结束价格
     */
    public Float getPriceEnd() {
        return this.PriceEnd;
    }

    /**
     * Set 结束价格
     * @param PriceEnd 结束价格
     */
    public void setPriceEnd(Float PriceEnd) {
        this.PriceEnd = PriceEnd;
    }

    /**
     * Get 起始域名长度 
     * @return LengthStart 起始域名长度
     */
    public Long getLengthStart() {
        return this.LengthStart;
    }

    /**
     * Set 起始域名长度
     * @param LengthStart 起始域名长度
     */
    public void setLengthStart(Long LengthStart) {
        this.LengthStart = LengthStart;
    }

    /**
     * Get 结束域名长度 
     * @return LengthEnd 结束域名长度
     */
    public Long getLengthEnd() {
        return this.LengthEnd;
    }

    /**
     * Set 结束域名长度
     * @param LengthEnd 结束域名长度
     */
    public void setLengthEnd(Long LengthEnd) {
        this.LengthEnd = LengthEnd;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 没页显示数 
     * @return PageSize 没页显示数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 没页显示数
     * @param PageSize 没页显示数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 后缀 
     * @return Suffix 后缀
     */
    public Long [] getSuffix() {
        return this.Suffix;
    }

    /**
     * Set 后缀
     * @param Suffix 后缀
     */
    public void setSuffix(Long [] Suffix) {
        this.Suffix = Suffix;
    }

    /**
     * Get 一级分类 
     * @return ClassOne 一级分类
     */
    public Long getClassOne() {
        return this.ClassOne;
    }

    /**
     * Set 一级分类
     * @param ClassOne 一级分类
     */
    public void setClassOne(Long ClassOne) {
        this.ClassOne = ClassOne;
    }

    /**
     * Get 二级分类 
     * @return ClassTwo 二级分类
     */
    public Long [] getClassTwo() {
        return this.ClassTwo;
    }

    /**
     * Set 二级分类
     * @param ClassTwo 二级分类
     */
    public void setClassTwo(Long [] ClassTwo) {
        this.ClassTwo = ClassTwo;
    }

    /**
     * Get 三级分类 
     * @return ClassThree 三级分类
     */
    public Long [] getClassThree() {
        return this.ClassThree;
    }

    /**
     * Set 三级分类
     * @param ClassThree 三级分类
     */
    public void setClassThree(Long [] ClassThree) {
        this.ClassThree = ClassThree;
    }

    /**
     * Get 四级分类 
     * @return ClassFour 四级分类
     */
    public Long [] getClassFour() {
        return this.ClassFour;
    }

    /**
     * Set 四级分类
     * @param ClassFour 四级分类
     */
    public void setClassFour(Long [] ClassFour) {
        this.ClassFour = ClassFour;
    }

    /**
     * Get 排除关键字，开头 
     * @return FilterStart 排除关键字，开头
     */
    public Boolean getFilterStart() {
        return this.FilterStart;
    }

    /**
     * Set 排除关键字，开头
     * @param FilterStart 排除关键字，开头
     */
    public void setFilterStart(Boolean FilterStart) {
        this.FilterStart = FilterStart;
    }

    /**
     * Get 排除关键字，结尾 
     * @return FilterEnd 排除关键字，结尾
     */
    public Boolean getFilterEnd() {
        return this.FilterEnd;
    }

    /**
     * Set 排除关键字，结尾
     * @param FilterEnd 排除关键字，结尾
     */
    public void setFilterEnd(Boolean FilterEnd) {
        this.FilterEnd = FilterEnd;
    }

    /**
     * Get 排除关键字 
     * @return FilterWords 排除关键字
     */
    public String getFilterWords() {
        return this.FilterWords;
    }

    /**
     * Set 排除关键字
     * @param FilterWords 排除关键字
     */
    public void setFilterWords(String FilterWords) {
        this.FilterWords = FilterWords;
    }

    /**
     * Get 交易类型 
     * @return TransType 交易类型
     */
    public Long getTransType() {
        return this.TransType;
    }

    /**
     * Set 交易类型
     * @param TransType 交易类型
     */
    public void setTransType(Long TransType) {
        this.TransType = TransType;
    }

    /**
     * Get 搜索白金域名 
     * @return IsTop 搜索白金域名
     */
    public Boolean getIsTop() {
        return this.IsTop;
    }

    /**
     * Set 搜索白金域名
     * @param IsTop 搜索白金域名
     */
    public void setIsTop(Boolean IsTop) {
        this.IsTop = IsTop;
    }

    /**
     * Get 结束时间排序啊 desc:倒序 asc:正序 
     * @return EndTimeSort 结束时间排序啊 desc:倒序 asc:正序
     */
    public String getEndTimeSort() {
        return this.EndTimeSort;
    }

    /**
     * Set 结束时间排序啊 desc:倒序 asc:正序
     * @param EndTimeSort 结束时间排序啊 desc:倒序 asc:正序
     */
    public void setEndTimeSort(String EndTimeSort) {
        this.EndTimeSort = EndTimeSort;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribePreReleaseListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePreReleaseListRequest(DescribePreReleaseListRequest source) {
        if (source.Keywords != null) {
            this.Keywords = new String(source.Keywords);
        }
        if (source.DomainStart != null) {
            this.DomainStart = new Boolean(source.DomainStart);
        }
        if (source.DomainEnd != null) {
            this.DomainEnd = new Boolean(source.DomainEnd);
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
        if (source.PriceStart != null) {
            this.PriceStart = new Float(source.PriceStart);
        }
        if (source.PriceEnd != null) {
            this.PriceEnd = new Float(source.PriceEnd);
        }
        if (source.LengthStart != null) {
            this.LengthStart = new Long(source.LengthStart);
        }
        if (source.LengthEnd != null) {
            this.LengthEnd = new Long(source.LengthEnd);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Suffix != null) {
            this.Suffix = new Long[source.Suffix.length];
            for (int i = 0; i < source.Suffix.length; i++) {
                this.Suffix[i] = new Long(source.Suffix[i]);
            }
        }
        if (source.ClassOne != null) {
            this.ClassOne = new Long(source.ClassOne);
        }
        if (source.ClassTwo != null) {
            this.ClassTwo = new Long[source.ClassTwo.length];
            for (int i = 0; i < source.ClassTwo.length; i++) {
                this.ClassTwo[i] = new Long(source.ClassTwo[i]);
            }
        }
        if (source.ClassThree != null) {
            this.ClassThree = new Long[source.ClassThree.length];
            for (int i = 0; i < source.ClassThree.length; i++) {
                this.ClassThree[i] = new Long(source.ClassThree[i]);
            }
        }
        if (source.ClassFour != null) {
            this.ClassFour = new Long[source.ClassFour.length];
            for (int i = 0; i < source.ClassFour.length; i++) {
                this.ClassFour[i] = new Long(source.ClassFour[i]);
            }
        }
        if (source.FilterStart != null) {
            this.FilterStart = new Boolean(source.FilterStart);
        }
        if (source.FilterEnd != null) {
            this.FilterEnd = new Boolean(source.FilterEnd);
        }
        if (source.FilterWords != null) {
            this.FilterWords = new String(source.FilterWords);
        }
        if (source.TransType != null) {
            this.TransType = new Long(source.TransType);
        }
        if (source.IsTop != null) {
            this.IsTop = new Boolean(source.IsTop);
        }
        if (source.EndTimeSort != null) {
            this.EndTimeSort = new String(source.EndTimeSort);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keywords", this.Keywords);
        this.setParamSimple(map, prefix + "DomainStart", this.DomainStart);
        this.setParamSimple(map, prefix + "DomainEnd", this.DomainEnd);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "PriceStart", this.PriceStart);
        this.setParamSimple(map, prefix + "PriceEnd", this.PriceEnd);
        this.setParamSimple(map, prefix + "LengthStart", this.LengthStart);
        this.setParamSimple(map, prefix + "LengthEnd", this.LengthEnd);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "Suffix.", this.Suffix);
        this.setParamSimple(map, prefix + "ClassOne", this.ClassOne);
        this.setParamArraySimple(map, prefix + "ClassTwo.", this.ClassTwo);
        this.setParamArraySimple(map, prefix + "ClassThree.", this.ClassThree);
        this.setParamArraySimple(map, prefix + "ClassFour.", this.ClassFour);
        this.setParamSimple(map, prefix + "FilterStart", this.FilterStart);
        this.setParamSimple(map, prefix + "FilterEnd", this.FilterEnd);
        this.setParamSimple(map, prefix + "FilterWords", this.FilterWords);
        this.setParamSimple(map, prefix + "TransType", this.TransType);
        this.setParamSimple(map, prefix + "IsTop", this.IsTop);
        this.setParamSimple(map, prefix + "EndTimeSort", this.EndTimeSort);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

