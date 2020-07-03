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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInsurePacksRequest extends AbstractModel{

    /**
    * 可选字段，保险包套餐ID，当要获取指定ID（例如insure-000000xe）的保险包套餐时请填写此字段；
    */
    @SerializedName("IdList")
    @Expose
    private String [] IdList;

    /**
     * Get 可选字段，保险包套餐ID，当要获取指定ID（例如insure-000000xe）的保险包套餐时请填写此字段； 
     * @return IdList 可选字段，保险包套餐ID，当要获取指定ID（例如insure-000000xe）的保险包套餐时请填写此字段；
     */
    public String [] getIdList() {
        return this.IdList;
    }

    /**
     * Set 可选字段，保险包套餐ID，当要获取指定ID（例如insure-000000xe）的保险包套餐时请填写此字段；
     * @param IdList 可选字段，保险包套餐ID，当要获取指定ID（例如insure-000000xe）的保险包套餐时请填写此字段；
     */
    public void setIdList(String [] IdList) {
        this.IdList = IdList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);

    }
}

