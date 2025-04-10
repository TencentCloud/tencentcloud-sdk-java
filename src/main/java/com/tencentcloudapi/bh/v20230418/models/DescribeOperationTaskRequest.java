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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOperationTaskRequest extends AbstractModel {

    /**
    * 运维任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 运维任务类型，1 - 手工执行任务， 2 - 周期性任务
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 分页偏移位置，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条目数，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 运维任务名称 
     * @return Name 运维任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 运维任务名称
     * @param Name 运维任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 运维任务类型，1 - 手工执行任务， 2 - 周期性任务 
     * @return Type 运维任务类型，1 - 手工执行任务， 2 - 周期性任务
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 运维任务类型，1 - 手工执行任务， 2 - 周期性任务
     * @param Type 运维任务类型，1 - 手工执行任务， 2 - 周期性任务
     */
    public void setType(Long Type) {
        this.Type = Type;
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
     * Get 每页条目数，默认20 
     * @return Limit 每页条目数，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条目数，默认20
     * @param Limit 每页条目数，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeOperationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOperationTaskRequest(DescribeOperationTaskRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

