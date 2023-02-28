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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCmdTemplatesRequest extends AbstractModel{

    /**
    * 命令模板ID集合，非必需
    */
    @SerializedName("IdSet")
    @Expose
    private Long [] IdSet;

    /**
    * 命令模板名，模糊查询，最大长度64字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分页偏移位置，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条目数量，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 命令模板ID集合，非必需 
     * @return IdSet 命令模板ID集合，非必需
     */
    public Long [] getIdSet() {
        return this.IdSet;
    }

    /**
     * Set 命令模板ID集合，非必需
     * @param IdSet 命令模板ID集合，非必需
     */
    public void setIdSet(Long [] IdSet) {
        this.IdSet = IdSet;
    }

    /**
     * Get 命令模板名，模糊查询，最大长度64字符 
     * @return Name 命令模板名，模糊查询，最大长度64字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 命令模板名，模糊查询，最大长度64字符
     * @param Name 命令模板名，模糊查询，最大长度64字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分页偏移位置，默认值为0 
     * @return Offset 分页偏移位置，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移位置，默认值为0
     * @param Offset 分页偏移位置，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条目数量，默认20 
     * @return Limit 每页条目数量，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条目数量，默认20
     * @param Limit 每页条目数量，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCmdTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCmdTemplatesRequest(DescribeCmdTemplatesRequest source) {
        if (source.IdSet != null) {
            this.IdSet = new Long[source.IdSet.length];
            for (int i = 0; i < source.IdSet.length; i++) {
                this.IdSet[i] = new Long(source.IdSet[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IdSet.", this.IdSet);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

