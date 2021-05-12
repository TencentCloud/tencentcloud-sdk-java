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
package com.tencentcloudapi.ims.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageStatRequest extends AbstractModel{

    /**
    * 审核类型 1: 机器审核; 2: 人工审核
    */
    @SerializedName("AuditType")
    @Expose
    private Long AuditType;

    /**
    * 查询条件
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get 审核类型 1: 机器审核; 2: 人工审核 
     * @return AuditType 审核类型 1: 机器审核; 2: 人工审核
     */
    public Long getAuditType() {
        return this.AuditType;
    }

    /**
     * Set 审核类型 1: 机器审核; 2: 人工审核
     * @param AuditType 审核类型 1: 机器审核; 2: 人工审核
     */
    public void setAuditType(Long AuditType) {
        this.AuditType = AuditType;
    }

    /**
     * Get 查询条件 
     * @return Filters 查询条件
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询条件
     * @param Filters 查询条件
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeImageStatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageStatRequest(DescribeImageStatRequest source) {
        if (source.AuditType != null) {
            this.AuditType = new Long(source.AuditType);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditType", this.AuditType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

