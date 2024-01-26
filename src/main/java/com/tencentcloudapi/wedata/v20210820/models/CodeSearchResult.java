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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeSearchResult extends AbstractModel {

    /**
    * 代码搜索结果列表
    */
    @SerializedName("CodeSearchInfoList")
    @Expose
    private CodeSearchInfoPage CodeSearchInfoList;

    /**
    * 开发空间搜索结果数
    */
    @SerializedName("DevCount")
    @Expose
    private Long DevCount;

    /**
    * 调度空间搜索结果数
    */
    @SerializedName("ScheduleCount")
    @Expose
    private Long ScheduleCount;

    /**
    * 回收站搜索结果数
    */
    @SerializedName("RecycleCount")
    @Expose
    private Long RecycleCount;

    /**
     * Get 代码搜索结果列表 
     * @return CodeSearchInfoList 代码搜索结果列表
     */
    public CodeSearchInfoPage getCodeSearchInfoList() {
        return this.CodeSearchInfoList;
    }

    /**
     * Set 代码搜索结果列表
     * @param CodeSearchInfoList 代码搜索结果列表
     */
    public void setCodeSearchInfoList(CodeSearchInfoPage CodeSearchInfoList) {
        this.CodeSearchInfoList = CodeSearchInfoList;
    }

    /**
     * Get 开发空间搜索结果数 
     * @return DevCount 开发空间搜索结果数
     */
    public Long getDevCount() {
        return this.DevCount;
    }

    /**
     * Set 开发空间搜索结果数
     * @param DevCount 开发空间搜索结果数
     */
    public void setDevCount(Long DevCount) {
        this.DevCount = DevCount;
    }

    /**
     * Get 调度空间搜索结果数 
     * @return ScheduleCount 调度空间搜索结果数
     */
    public Long getScheduleCount() {
        return this.ScheduleCount;
    }

    /**
     * Set 调度空间搜索结果数
     * @param ScheduleCount 调度空间搜索结果数
     */
    public void setScheduleCount(Long ScheduleCount) {
        this.ScheduleCount = ScheduleCount;
    }

    /**
     * Get 回收站搜索结果数 
     * @return RecycleCount 回收站搜索结果数
     */
    public Long getRecycleCount() {
        return this.RecycleCount;
    }

    /**
     * Set 回收站搜索结果数
     * @param RecycleCount 回收站搜索结果数
     */
    public void setRecycleCount(Long RecycleCount) {
        this.RecycleCount = RecycleCount;
    }

    public CodeSearchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeSearchResult(CodeSearchResult source) {
        if (source.CodeSearchInfoList != null) {
            this.CodeSearchInfoList = new CodeSearchInfoPage(source.CodeSearchInfoList);
        }
        if (source.DevCount != null) {
            this.DevCount = new Long(source.DevCount);
        }
        if (source.ScheduleCount != null) {
            this.ScheduleCount = new Long(source.ScheduleCount);
        }
        if (source.RecycleCount != null) {
            this.RecycleCount = new Long(source.RecycleCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CodeSearchInfoList.", this.CodeSearchInfoList);
        this.setParamSimple(map, prefix + "DevCount", this.DevCount);
        this.setParamSimple(map, prefix + "ScheduleCount", this.ScheduleCount);
        this.setParamSimple(map, prefix + "RecycleCount", this.RecycleCount);

    }
}

