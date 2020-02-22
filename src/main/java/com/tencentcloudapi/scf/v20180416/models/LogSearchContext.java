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

public class LogSearchContext extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 日志条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 日志关键词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 日志类型，支持Application和Platform，默认为Application
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 日志条数 
     * @return Limit 日志条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 日志条数
     * @param Limit 日志条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 日志关键词 
     * @return Keyword 日志关键词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 日志关键词
     * @param Keyword 日志关键词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 日志类型，支持Application和Platform，默认为Application 
     * @return Type 日志类型，支持Application和Platform，默认为Application
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 日志类型，支持Application和Platform，默认为Application
     * @param Type 日志类型，支持Application和Platform，默认为Application
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

