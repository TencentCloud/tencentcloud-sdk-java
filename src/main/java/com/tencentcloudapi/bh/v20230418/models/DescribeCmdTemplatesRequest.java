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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCmdTemplatesRequest extends AbstractModel {

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
    * 命令模板类型 1-内置模板 2-自定义模板
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 命令模板类型 1-内置模板 2-自定义模板
    */
    @SerializedName("TypeSet")
    @Expose
    private Long [] TypeSet;

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
     * Get 命令模板类型 1-内置模板 2-自定义模板 
     * @return Type 命令模板类型 1-内置模板 2-自定义模板
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 命令模板类型 1-内置模板 2-自定义模板
     * @param Type 命令模板类型 1-内置模板 2-自定义模板
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 命令模板类型 1-内置模板 2-自定义模板 
     * @return TypeSet 命令模板类型 1-内置模板 2-自定义模板
     */
    public Long [] getTypeSet() {
        return this.TypeSet;
    }

    /**
     * Set 命令模板类型 1-内置模板 2-自定义模板
     * @param TypeSet 命令模板类型 1-内置模板 2-自定义模板
     */
    public void setTypeSet(Long [] TypeSet) {
        this.TypeSet = TypeSet;
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
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TypeSet != null) {
            this.TypeSet = new Long[source.TypeSet.length];
            for (int i = 0; i < source.TypeSet.length; i++) {
                this.TypeSet[i] = new Long(source.TypeSet[i]);
            }
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "TypeSet.", this.TypeSet);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

