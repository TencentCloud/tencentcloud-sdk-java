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

public class Filters extends AbstractModel {

    /**
    * 检索，用户问题或答案
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 错误类型检索

    */
    @SerializedName("Reasons")
    @Expose
    private String [] Reasons;

    /**
    * 处理状态 0-待处理 1-已拒答 2-已忽略 3-已添加为新问答 4-已添加为相似问
    */
    @SerializedName("HandlingStatuses")
    @Expose
    private Long [] HandlingStatuses;

    /**
     * Get 检索，用户问题或答案 
     * @return Query 检索，用户问题或答案
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 检索，用户问题或答案
     * @param Query 检索，用户问题或答案
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 错误类型检索
 
     * @return Reasons 错误类型检索

     */
    public String [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set 错误类型检索

     * @param Reasons 错误类型检索

     */
    public void setReasons(String [] Reasons) {
        this.Reasons = Reasons;
    }

    /**
     * Get 处理状态 0-待处理 1-已拒答 2-已忽略 3-已添加为新问答 4-已添加为相似问 
     * @return HandlingStatuses 处理状态 0-待处理 1-已拒答 2-已忽略 3-已添加为新问答 4-已添加为相似问
     */
    public Long [] getHandlingStatuses() {
        return this.HandlingStatuses;
    }

    /**
     * Set 处理状态 0-待处理 1-已拒答 2-已忽略 3-已添加为新问答 4-已添加为相似问
     * @param HandlingStatuses 处理状态 0-待处理 1-已拒答 2-已忽略 3-已添加为新问答 4-已添加为相似问
     */
    public void setHandlingStatuses(Long [] HandlingStatuses) {
        this.HandlingStatuses = HandlingStatuses;
    }

    public Filters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filters(Filters source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Reasons != null) {
            this.Reasons = new String[source.Reasons.length];
            for (int i = 0; i < source.Reasons.length; i++) {
                this.Reasons[i] = new String(source.Reasons[i]);
            }
        }
        if (source.HandlingStatuses != null) {
            this.HandlingStatuses = new Long[source.HandlingStatuses.length];
            for (int i = 0; i < source.HandlingStatuses.length; i++) {
                this.HandlingStatuses[i] = new Long(source.HandlingStatuses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Reasons.", this.Reasons);
        this.setParamArraySimple(map, prefix + "HandlingStatuses.", this.HandlingStatuses);

    }
}

