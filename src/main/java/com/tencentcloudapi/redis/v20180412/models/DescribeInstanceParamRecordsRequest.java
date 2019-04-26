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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceParamRecordsRequest  extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分页大小
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 偏移量，取Limit整数倍
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
     * 获取实例Id
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取分页大小
     * @return Limit 分页大小
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页大小
     * @param Limit 分页大小
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取偏移量，取Limit整数倍
     * @return Offset 偏移量，取Limit整数倍
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，取Limit整数倍
     * @param Offset 偏移量，取Limit整数倍
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

