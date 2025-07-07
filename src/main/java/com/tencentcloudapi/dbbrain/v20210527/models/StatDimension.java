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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatDimension extends AbstractModel {

    /**
    * 维度名称，目前仅支持：SqlTag。
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * SQL 标签过滤与统计信息
示例：

示例 1：[p=position] 统计包含 p=position 标签的 SQL 会话。
示例 2：[p] 统计包含 p 标签的 SQL 会话。
示例 3：[p=position, c=idCard] 统计同时包含 p=position 标签和 c=idCard 标签的 SQL 会话。
    */
    @SerializedName("Data")
    @Expose
    private String [] Data;

    /**
     * Get 维度名称，目前仅支持：SqlTag。 
     * @return Dimension 维度名称，目前仅支持：SqlTag。
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 维度名称，目前仅支持：SqlTag。
     * @param Dimension 维度名称，目前仅支持：SqlTag。
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get SQL 标签过滤与统计信息
示例：

示例 1：[p=position] 统计包含 p=position 标签的 SQL 会话。
示例 2：[p] 统计包含 p 标签的 SQL 会话。
示例 3：[p=position, c=idCard] 统计同时包含 p=position 标签和 c=idCard 标签的 SQL 会话。 
     * @return Data SQL 标签过滤与统计信息
示例：

示例 1：[p=position] 统计包含 p=position 标签的 SQL 会话。
示例 2：[p] 统计包含 p 标签的 SQL 会话。
示例 3：[p=position, c=idCard] 统计同时包含 p=position 标签和 c=idCard 标签的 SQL 会话。
     */
    public String [] getData() {
        return this.Data;
    }

    /**
     * Set SQL 标签过滤与统计信息
示例：

示例 1：[p=position] 统计包含 p=position 标签的 SQL 会话。
示例 2：[p] 统计包含 p 标签的 SQL 会话。
示例 3：[p=position, c=idCard] 统计同时包含 p=position 标签和 c=idCard 标签的 SQL 会话。
     * @param Data SQL 标签过滤与统计信息
示例：

示例 1：[p=position] 统计包含 p=position 标签的 SQL 会话。
示例 2：[p] 统计包含 p 标签的 SQL 会话。
示例 3：[p=position, c=idCard] 统计同时包含 p=position 标签和 c=idCard 标签的 SQL 会话。
     */
    public void setData(String [] Data) {
        this.Data = Data;
    }

    public StatDimension() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatDimension(StatDimension source) {
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.Data != null) {
            this.Data = new String[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new String(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamArraySimple(map, prefix + "Data.", this.Data);

    }
}

