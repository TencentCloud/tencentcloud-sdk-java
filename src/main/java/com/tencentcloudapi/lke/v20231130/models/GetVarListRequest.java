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
    * <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * <p>变量ID数组</p>
    */
    @SerializedName("VarIds")
    @Expose
    private String [] VarIds;

    /**
    * <p>按变量名称关键词搜索</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>起始偏移量（默认0），取值范围 &gt; 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>限定数量（默认15），取值范围 1-200</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>按变量类型过滤，默认查询所有类型(STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)</p>
    */
    @SerializedName("VarType")
    @Expose
    private String VarType;

    /**
    * <p>是否需要内部变量, 在结果中包含平台预置的“内置自定义变量” (默认false)。</p><ul><li>当&nbsp;<code>NeedInternalVar = true</code>&nbsp;且&nbsp;<code>VarModuleType</code>&nbsp;为&nbsp;<code>AllVar</code>&nbsp;或&nbsp;<code>ApiVar</code>&nbsp;时，返回列表会在用户变量之前拼入内置变量，并同样支持&nbsp;<code>Keyword</code>&nbsp;<code>VarType</code>&nbsp;<code>VarIds</code>&nbsp;过滤。</li><li>其他<code>VarModuleType</code>下，该开关不生效。</li></ul>
    */
    @SerializedName("NeedInternalVar")
    @Expose
    private Boolean NeedInternalVar;

    /**
    * <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul><p>默认值：0</p>
    */
    @SerializedName("VarModuleType")
    @Expose
    private Long VarModuleType;

    /**
     * Get <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p> 
     * @return AppBizId <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
     * @param AppBizId <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get <p>变量ID数组</p> 
     * @return VarIds <p>变量ID数组</p>
     */
    public String [] getVarIds() {
        return this.VarIds;
    }

    /**
     * Set <p>变量ID数组</p>
     * @param VarIds <p>变量ID数组</p>
     */
    public void setVarIds(String [] VarIds) {
        this.VarIds = VarIds;
    }

    /**
     * Get <p>按变量名称关键词搜索</p> 
     * @return Keyword <p>按变量名称关键词搜索</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>按变量名称关键词搜索</p>
     * @param Keyword <p>按变量名称关键词搜索</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>起始偏移量（默认0），取值范围 &gt; 0</p> 
     * @return Offset <p>起始偏移量（默认0），取值范围 &gt; 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>起始偏移量（默认0），取值范围 &gt; 0</p>
     * @param Offset <p>起始偏移量（默认0），取值范围 &gt; 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>限定数量（默认15），取值范围 1-200</p> 
     * @return Limit <p>限定数量（默认15），取值范围 1-200</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限定数量（默认15），取值范围 1-200</p>
     * @param Limit <p>限定数量（默认15），取值范围 1-200</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>按变量类型过滤，默认查询所有类型(STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)</p> 
     * @return VarType <p>按变量类型过滤，默认查询所有类型(STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)</p>
     */
    public String getVarType() {
        return this.VarType;
    }

    /**
     * Set <p>按变量类型过滤，默认查询所有类型(STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)</p>
     * @param VarType <p>按变量类型过滤，默认查询所有类型(STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)</p>
     */
    public void setVarType(String VarType) {
        this.VarType = VarType;
    }

    /**
     * Get <p>是否需要内部变量, 在结果中包含平台预置的“内置自定义变量” (默认false)。</p><ul><li>当&nbsp;<code>NeedInternalVar = true</code>&nbsp;且&nbsp;<code>VarModuleType</code>&nbsp;为&nbsp;<code>AllVar</code>&nbsp;或&nbsp;<code>ApiVar</code>&nbsp;时，返回列表会在用户变量之前拼入内置变量，并同样支持&nbsp;<code>Keyword</code>&nbsp;<code>VarType</code>&nbsp;<code>VarIds</code>&nbsp;过滤。</li><li>其他<code>VarModuleType</code>下，该开关不生效。</li></ul> 
     * @return NeedInternalVar <p>是否需要内部变量, 在结果中包含平台预置的“内置自定义变量” (默认false)。</p><ul><li>当&nbsp;<code>NeedInternalVar = true</code>&nbsp;且&nbsp;<code>VarModuleType</code>&nbsp;为&nbsp;<code>AllVar</code>&nbsp;或&nbsp;<code>ApiVar</code>&nbsp;时，返回列表会在用户变量之前拼入内置变量，并同样支持&nbsp;<code>Keyword</code>&nbsp;<code>VarType</code>&nbsp;<code>VarIds</code>&nbsp;过滤。</li><li>其他<code>VarModuleType</code>下，该开关不生效。</li></ul>
     */
    public Boolean getNeedInternalVar() {
        return this.NeedInternalVar;
    }

    /**
     * Set <p>是否需要内部变量, 在结果中包含平台预置的“内置自定义变量” (默认false)。</p><ul><li>当&nbsp;<code>NeedInternalVar = true</code>&nbsp;且&nbsp;<code>VarModuleType</code>&nbsp;为&nbsp;<code>AllVar</code>&nbsp;或&nbsp;<code>ApiVar</code>&nbsp;时，返回列表会在用户变量之前拼入内置变量，并同样支持&nbsp;<code>Keyword</code>&nbsp;<code>VarType</code>&nbsp;<code>VarIds</code>&nbsp;过滤。</li><li>其他<code>VarModuleType</code>下，该开关不生效。</li></ul>
     * @param NeedInternalVar <p>是否需要内部变量, 在结果中包含平台预置的“内置自定义变量” (默认false)。</p><ul><li>当&nbsp;<code>NeedInternalVar = true</code>&nbsp;且&nbsp;<code>VarModuleType</code>&nbsp;为&nbsp;<code>AllVar</code>&nbsp;或&nbsp;<code>ApiVar</code>&nbsp;时，返回列表会在用户变量之前拼入内置变量，并同样支持&nbsp;<code>Keyword</code>&nbsp;<code>VarType</code>&nbsp;<code>VarIds</code>&nbsp;过滤。</li><li>其他<code>VarModuleType</code>下，该开关不生效。</li></ul>
     */
    public void setNeedInternalVar(Boolean NeedInternalVar) {
        this.NeedInternalVar = NeedInternalVar;
    }

    /**
     * Get <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul><p>默认值：0</p> 
     * @return VarModuleType <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul><p>默认值：0</p>
     */
    public Long getVarModuleType() {
        return this.VarModuleType;
    }

    /**
     * Set <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul><p>默认值：0</p>
     * @param VarModuleType <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul><p>默认值：0</p>
     */
    public void setVarModuleType(Long VarModuleType) {
        this.VarModuleType = VarModuleType;
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
        if (source.NeedInternalVar != null) {
            this.NeedInternalVar = new Boolean(source.NeedInternalVar);
        }
        if (source.VarModuleType != null) {
            this.VarModuleType = new Long(source.VarModuleType);
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
        this.setParamSimple(map, prefix + "NeedInternalVar", this.NeedInternalVar);
        this.setParamSimple(map, prefix + "VarModuleType", this.VarModuleType);

    }
}

