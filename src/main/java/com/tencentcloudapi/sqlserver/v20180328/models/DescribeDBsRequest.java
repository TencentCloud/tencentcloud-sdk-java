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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBsRequest  extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 每页记录数，最大为100，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 页编号，从第0页开始
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
     * 获取实例ID
     * @return InstanceIdSet 实例ID
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * 设置实例ID
     * @param InstanceIdSet 实例ID
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * 获取每页记录数，最大为100，默认20
     * @return Limit 每页记录数，最大为100，默认20
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置每页记录数，最大为100，默认20
     * @param Limit 每页记录数，最大为100，默认20
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取页编号，从第0页开始
     * @return Offset 页编号，从第0页开始
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置页编号，从第0页开始
     * @param Offset 页编号，从第0页开始
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

