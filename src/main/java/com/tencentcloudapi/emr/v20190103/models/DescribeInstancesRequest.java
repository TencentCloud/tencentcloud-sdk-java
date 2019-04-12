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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest  extends AbstractModel{

    /**
    * 查询列表,  如果不填写，返回该AppId下所有实例列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 查询偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 查询结果限制，默认值10
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取查询列表,  如果不填写，返回该AppId下所有实例列表
     * @return InstanceIds 查询列表,  如果不填写，返回该AppId下所有实例列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置查询列表,  如果不填写，返回该AppId下所有实例列表
     * @param InstanceIds 查询列表,  如果不填写，返回该AppId下所有实例列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取查询偏移量，默认0
     * @return Offset 查询偏移量，默认0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置查询偏移量，默认0
     * @param Offset 查询偏移量，默认0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取查询结果限制，默认值10
     * @return Limit 查询结果限制，默认值10
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置查询结果限制，默认值10
     * @param Limit 查询结果限制，默认值10
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

