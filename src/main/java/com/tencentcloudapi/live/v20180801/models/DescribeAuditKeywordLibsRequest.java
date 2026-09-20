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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditKeywordLibsRequest extends AbstractModel {

    /**
    * <p>获取偏移量。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>获取条数。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>根据关键词库名进行模糊查询。<br>传递空字符串时，忽略。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>获取偏移量。</p> 
     * @return Offset <p>获取偏移量。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>获取偏移量。</p>
     * @param Offset <p>获取偏移量。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>获取条数。</p> 
     * @return Limit <p>获取条数。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>获取条数。</p>
     * @param Limit <p>获取条数。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>根据关键词库名进行模糊查询。<br>传递空字符串时，忽略。</p> 
     * @return Name <p>根据关键词库名进行模糊查询。<br>传递空字符串时，忽略。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>根据关键词库名进行模糊查询。<br>传递空字符串时，忽略。</p>
     * @param Name <p>根据关键词库名进行模糊查询。<br>传递空字符串时，忽略。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeAuditKeywordLibsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditKeywordLibsRequest(DescribeAuditKeywordLibsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

