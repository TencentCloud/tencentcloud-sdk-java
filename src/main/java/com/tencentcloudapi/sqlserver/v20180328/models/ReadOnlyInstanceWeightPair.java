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

public class ReadOnlyInstanceWeightPair extends AbstractModel{

    /**
    * 只读实例ID，格式如：mssqlro-3l3fgqn7
    */
    @SerializedName("ReadOnlyInstanceId")
    @Expose
    private String ReadOnlyInstanceId;

    /**
    * 只读实例权重 ，范围是0-100
    */
    @SerializedName("ReadOnlyWeight")
    @Expose
    private Long ReadOnlyWeight;

    /**
     * Get 只读实例ID，格式如：mssqlro-3l3fgqn7 
     * @return ReadOnlyInstanceId 只读实例ID，格式如：mssqlro-3l3fgqn7
     */
    public String getReadOnlyInstanceId() {
        return this.ReadOnlyInstanceId;
    }

    /**
     * Set 只读实例ID，格式如：mssqlro-3l3fgqn7
     * @param ReadOnlyInstanceId 只读实例ID，格式如：mssqlro-3l3fgqn7
     */
    public void setReadOnlyInstanceId(String ReadOnlyInstanceId) {
        this.ReadOnlyInstanceId = ReadOnlyInstanceId;
    }

    /**
     * Get 只读实例权重 ，范围是0-100 
     * @return ReadOnlyWeight 只读实例权重 ，范围是0-100
     */
    public Long getReadOnlyWeight() {
        return this.ReadOnlyWeight;
    }

    /**
     * Set 只读实例权重 ，范围是0-100
     * @param ReadOnlyWeight 只读实例权重 ，范围是0-100
     */
    public void setReadOnlyWeight(Long ReadOnlyWeight) {
        this.ReadOnlyWeight = ReadOnlyWeight;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadOnlyInstanceId", this.ReadOnlyInstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyWeight", this.ReadOnlyWeight);

    }
}

