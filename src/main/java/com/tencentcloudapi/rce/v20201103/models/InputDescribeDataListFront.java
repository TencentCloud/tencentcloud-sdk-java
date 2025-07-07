/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputDescribeDataListFront extends AbstractModel {

    /**
    * 名单ID
    */
    @SerializedName("NameListId")
    @Expose
    private Long NameListId;

    /**
    * 当前页数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页显示条数	
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 搜索关键字，按照名单数据名称或加密名单数据名称搜索
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * 黑白名单列表状态[1 启用 2 停用]
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 名单ID 
     * @return NameListId 名单ID
     */
    public Long getNameListId() {
        return this.NameListId;
    }

    /**
     * Set 名单ID
     * @param NameListId 名单ID
     */
    public void setNameListId(Long NameListId) {
        this.NameListId = NameListId;
    }

    /**
     * Get 当前页数 
     * @return PageNumber 当前页数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页数
     * @param PageNumber 当前页数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页显示条数	 
     * @return PageSize 每页显示条数	
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示条数	
     * @param PageSize 每页显示条数	
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 搜索关键字，按照名单数据名称或加密名单数据名称搜索 
     * @return KeyWord 搜索关键字，按照名单数据名称或加密名单数据名称搜索
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set 搜索关键字，按照名单数据名称或加密名单数据名称搜索
     * @param KeyWord 搜索关键字，按照名单数据名称或加密名单数据名称搜索
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get 黑白名单列表状态[1 启用 2 停用] 
     * @return Status 黑白名单列表状态[1 启用 2 停用]
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 黑白名单列表状态[1 启用 2 停用]
     * @param Status 黑白名单列表状态[1 启用 2 停用]
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public InputDescribeDataListFront() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputDescribeDataListFront(InputDescribeDataListFront source) {
        if (source.NameListId != null) {
            this.NameListId = new Long(source.NameListId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NameListId", this.NameListId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

