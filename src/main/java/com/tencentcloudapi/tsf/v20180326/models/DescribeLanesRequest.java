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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLanesRequest extends AbstractModel{

    /**
    * 每页展示的条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 翻页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 搜索关键字
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 无
    */
    @SerializedName("LaneIdList")
    @Expose
    private String [] LaneIdList;

    /**
    * 无
    */
    @SerializedName("DisableProgramAuthCheck")
    @Expose
    private Boolean DisableProgramAuthCheck;

    /**
     * Get 每页展示的条数 
     * @return Limit 每页展示的条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页展示的条数
     * @param Limit 每页展示的条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 翻页偏移量 
     * @return Offset 翻页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页偏移量
     * @param Offset 翻页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 搜索关键字 
     * @return SearchWord 搜索关键字
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键字
     * @param SearchWord 搜索关键字
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 无 
     * @return LaneIdList 无
     */
    public String [] getLaneIdList() {
        return this.LaneIdList;
    }

    /**
     * Set 无
     * @param LaneIdList 无
     */
    public void setLaneIdList(String [] LaneIdList) {
        this.LaneIdList = LaneIdList;
    }

    /**
     * Get 无 
     * @return DisableProgramAuthCheck 无
     */
    public Boolean getDisableProgramAuthCheck() {
        return this.DisableProgramAuthCheck;
    }

    /**
     * Set 无
     * @param DisableProgramAuthCheck 无
     */
    public void setDisableProgramAuthCheck(Boolean DisableProgramAuthCheck) {
        this.DisableProgramAuthCheck = DisableProgramAuthCheck;
    }

    public DescribeLanesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLanesRequest(DescribeLanesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.LaneIdList != null) {
            this.LaneIdList = new String[source.LaneIdList.length];
            for (int i = 0; i < source.LaneIdList.length; i++) {
                this.LaneIdList[i] = new String(source.LaneIdList[i]);
            }
        }
        if (source.DisableProgramAuthCheck != null) {
            this.DisableProgramAuthCheck = new Boolean(source.DisableProgramAuthCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamArraySimple(map, prefix + "LaneIdList.", this.LaneIdList);
        this.setParamSimple(map, prefix + "DisableProgramAuthCheck", this.DisableProgramAuthCheck);

    }
}

