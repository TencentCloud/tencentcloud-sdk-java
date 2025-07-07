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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetVarListRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 变量ID数组
    */
    @SerializedName("VarIds")
    @Expose
    private String [] VarIds;

    /**
    * 按变量名称关键词搜索
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 起始偏移量（默认0）
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限定数量（默认15）
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 按变量类型过滤，默认查询所有类型(STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)
    */
    @SerializedName("VarType")
    @Expose
    private String VarType;

    /**
     * Get 应用ID 
     * @return AppBizId 应用ID
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用ID
     * @param AppBizId 应用ID
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 变量ID数组 
     * @return VarIds 变量ID数组
     */
    public String [] getVarIds() {
        return this.VarIds;
    }

    /**
     * Set 变量ID数组
     * @param VarIds 变量ID数组
     */
    public void setVarIds(String [] VarIds) {
        this.VarIds = VarIds;
    }

    /**
     * Get 按变量名称关键词搜索 
     * @return Keyword 按变量名称关键词搜索
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 按变量名称关键词搜索
     * @param Keyword 按变量名称关键词搜索
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 起始偏移量（默认0） 
     * @return Offset 起始偏移量（默认0）
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始偏移量（默认0）
     * @param Offset 起始偏移量（默认0）
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限定数量（默认15） 
     * @return Limit 限定数量（默认15）
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限定数量（默认15）
     * @param Limit 限定数量（默认15）
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 按变量类型过滤，默认查询所有类型(STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO) 
     * @return VarType 按变量类型过滤，默认查询所有类型(STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)
     */
    public String getVarType() {
        return this.VarType;
    }

    /**
     * Set 按变量类型过滤，默认查询所有类型(STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)
     * @param VarType 按变量类型过滤，默认查询所有类型(STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)
     */
    public void setVarType(String VarType) {
        this.VarType = VarType;
    }

    public GetVarListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetVarListRequest(GetVarListRequest source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.VarIds != null) {
            this.VarIds = new String[source.VarIds.length];
            for (int i = 0; i < source.VarIds.length; i++) {
                this.VarIds[i] = new String(source.VarIds[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.VarType != null) {
            this.VarType = new String(source.VarType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamArraySimple(map, prefix + "VarIds.", this.VarIds);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "VarType", this.VarType);

    }
}

