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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetGroupDetailRequest extends AbstractModel {

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备	
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备	
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 搜索关键字
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
     * Get 分组ID 
     * @return GroupId 分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID
     * @param GroupId 分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备	 
     * @return PageSize 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备	
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备	
     * @param PageSize 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备	
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备	 
     * @return PageNumber 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备	
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备	
     * @param PageNumber 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备	
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 搜索关键字 
     * @return KeyWord 搜索关键字
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set 搜索关键字
     * @param KeyWord 搜索关键字
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    public GetGroupDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetGroupDetailRequest(GetGroupDetailRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);

    }
}

