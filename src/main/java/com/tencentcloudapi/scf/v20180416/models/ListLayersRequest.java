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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListLayersRequest extends AbstractModel{

    /**
    * 适配的运行时
    */
    @SerializedName("CompatibleRuntime")
    @Expose
    private String CompatibleRuntime;

    /**
    * 偏移位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询数目限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询key，模糊匹配名称
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get 适配的运行时 
     * @return CompatibleRuntime 适配的运行时
     */
    public String getCompatibleRuntime() {
        return this.CompatibleRuntime;
    }

    /**
     * Set 适配的运行时
     * @param CompatibleRuntime 适配的运行时
     */
    public void setCompatibleRuntime(String CompatibleRuntime) {
        this.CompatibleRuntime = CompatibleRuntime;
    }

    /**
     * Get 偏移位置 
     * @return Offset 偏移位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移位置
     * @param Offset 偏移位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询数目限制 
     * @return Limit 查询数目限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询数目限制
     * @param Limit 查询数目限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询key，模糊匹配名称 
     * @return SearchKey 查询key，模糊匹配名称
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 查询key，模糊匹配名称
     * @param SearchKey 查询key，模糊匹配名称
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompatibleRuntime", this.CompatibleRuntime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

