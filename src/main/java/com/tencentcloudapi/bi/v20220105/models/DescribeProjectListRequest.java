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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectListRequest extends AbstractModel {

    /**
    * 页容，初版默认20，将来可能根据屏幕宽度动态变化
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页标
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 检索模糊字段
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 是否全部展示，如果是ture，则忽略分页
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * 角色信息
    */
    @SerializedName("ModuleCollection")
    @Expose
    private String ModuleCollection;

    /**
    * moduleId集合
    */
    @SerializedName("ModuleIdList")
    @Expose
    private String [] ModuleIdList;

    /**
     * Get 页容，初版默认20，将来可能根据屏幕宽度动态变化 
     * @return PageSize 页容，初版默认20，将来可能根据屏幕宽度动态变化
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页容，初版默认20，将来可能根据屏幕宽度动态变化
     * @param PageSize 页容，初版默认20，将来可能根据屏幕宽度动态变化
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页标 
     * @return PageNo 页标
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页标
     * @param PageNo 页标
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 检索模糊字段 
     * @return Keyword 检索模糊字段
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 检索模糊字段
     * @param Keyword 检索模糊字段
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 是否全部展示，如果是ture，则忽略分页 
     * @return AllPage 是否全部展示，如果是ture，则忽略分页
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set 是否全部展示，如果是ture，则忽略分页
     * @param AllPage 是否全部展示，如果是ture，则忽略分页
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get 角色信息 
     * @return ModuleCollection 角色信息
     */
    public String getModuleCollection() {
        return this.ModuleCollection;
    }

    /**
     * Set 角色信息
     * @param ModuleCollection 角色信息
     */
    public void setModuleCollection(String ModuleCollection) {
        this.ModuleCollection = ModuleCollection;
    }

    /**
     * Get moduleId集合 
     * @return ModuleIdList moduleId集合
     */
    public String [] getModuleIdList() {
        return this.ModuleIdList;
    }

    /**
     * Set moduleId集合
     * @param ModuleIdList moduleId集合
     */
    public void setModuleIdList(String [] ModuleIdList) {
        this.ModuleIdList = ModuleIdList;
    }

    public DescribeProjectListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectListRequest(DescribeProjectListRequest source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.AllPage != null) {
            this.AllPage = new Boolean(source.AllPage);
        }
        if (source.ModuleCollection != null) {
            this.ModuleCollection = new String(source.ModuleCollection);
        }
        if (source.ModuleIdList != null) {
            this.ModuleIdList = new String[source.ModuleIdList.length];
            for (int i = 0; i < source.ModuleIdList.length; i++) {
                this.ModuleIdList[i] = new String(source.ModuleIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamSimple(map, prefix + "ModuleCollection", this.ModuleCollection);
        this.setParamArraySimple(map, prefix + "ModuleIdList.", this.ModuleIdList);

    }
}

