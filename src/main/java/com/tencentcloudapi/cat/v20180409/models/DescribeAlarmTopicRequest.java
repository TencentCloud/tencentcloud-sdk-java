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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmTopicRequest extends AbstractModel{

    /**
    * 如果不存在拨测相关的主题，是否自动创建一个。取值可为0, 1，默认为0
    */
    @SerializedName("NeedAdd")
    @Expose
    private Long NeedAdd;

    /**
     * Get 如果不存在拨测相关的主题，是否自动创建一个。取值可为0, 1，默认为0 
     * @return NeedAdd 如果不存在拨测相关的主题，是否自动创建一个。取值可为0, 1，默认为0
     */
    public Long getNeedAdd() {
        return this.NeedAdd;
    }

    /**
     * Set 如果不存在拨测相关的主题，是否自动创建一个。取值可为0, 1，默认为0
     * @param NeedAdd 如果不存在拨测相关的主题，是否自动创建一个。取值可为0, 1，默认为0
     */
    public void setNeedAdd(Long NeedAdd) {
        this.NeedAdd = NeedAdd;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NeedAdd", this.NeedAdd);

    }
}

