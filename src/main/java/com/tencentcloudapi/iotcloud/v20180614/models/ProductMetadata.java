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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductMetadata  extends AbstractModel{

    /**
    * 产品创建时间
    */
    @SerializedName("CreationDate")
    @Expose
    private Integer CreationDate;

    /**
     * 获取产品创建时间
     * @return CreationDate 产品创建时间
     */
    public Integer getCreationDate() {
        return this.CreationDate;
    }

    /**
     * 设置产品创建时间
     * @param CreationDate 产品创建时间
     */
    public void setCreationDate(Integer CreationDate) {
        this.CreationDate = CreationDate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationDate", this.CreationDate);

    }
}

