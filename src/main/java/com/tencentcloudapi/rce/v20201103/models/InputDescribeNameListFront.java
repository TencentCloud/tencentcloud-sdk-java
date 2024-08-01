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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputDescribeNameListFront extends AbstractModel {

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
    * 名单类型 [1 黑名单 2 白名单]
    */
    @SerializedName("ListType")
    @Expose
    private Long ListType;

    /**
    * 数据类型[1 手机号 2 qqOpenId 3 wechatOpenId 4 ip 6 idfa 7 imei]
    */
    @SerializedName("DataType")
    @Expose
    private Long DataType;

    /**
    * 关键字，按照名单名称搜索
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * 记录状态[1 启用 2 停用]
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get 名单类型 [1 黑名单 2 白名单] 
     * @return ListType 名单类型 [1 黑名单 2 白名单]
     */
    public Long getListType() {
        return this.ListType;
    }

    /**
     * Set 名单类型 [1 黑名单 2 白名单]
     * @param ListType 名单类型 [1 黑名单 2 白名单]
     */
    public void setListType(Long ListType) {
        this.ListType = ListType;
    }

    /**
     * Get 数据类型[1 手机号 2 qqOpenId 3 wechatOpenId 4 ip 6 idfa 7 imei] 
     * @return DataType 数据类型[1 手机号 2 qqOpenId 3 wechatOpenId 4 ip 6 idfa 7 imei]
     */
    public Long getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据类型[1 手机号 2 qqOpenId 3 wechatOpenId 4 ip 6 idfa 7 imei]
     * @param DataType 数据类型[1 手机号 2 qqOpenId 3 wechatOpenId 4 ip 6 idfa 7 imei]
     */
    public void setDataType(Long DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 关键字，按照名单名称搜索 
     * @return KeyWord 关键字，按照名单名称搜索
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set 关键字，按照名单名称搜索
     * @param KeyWord 关键字，按照名单名称搜索
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get 记录状态[1 启用 2 停用] 
     * @return Status 记录状态[1 启用 2 停用]
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 记录状态[1 启用 2 停用]
     * @param Status 记录状态[1 启用 2 停用]
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public InputDescribeNameListFront() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputDescribeNameListFront(InputDescribeNameListFront source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ListType != null) {
            this.ListType = new Long(source.ListType);
        }
        if (source.DataType != null) {
            this.DataType = new Long(source.DataType);
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ListType", this.ListType);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

