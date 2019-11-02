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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainPriceListRequest  extends AbstractModel{

    /**
    * 查询价格的后缀列表。默认则为全部后缀
    */
    @SerializedName("TldList")
    @Expose
    private String [] TldList;

    /**
     * 获取查询价格的后缀列表。默认则为全部后缀
     * @return TldList 查询价格的后缀列表。默认则为全部后缀
     */
    public String [] getTldList() {
        return this.TldList;
    }

    /**
     * 设置查询价格的后缀列表。默认则为全部后缀
     * @param TldList 查询价格的后缀列表。默认则为全部后缀
     */
    public void setTldList(String [] TldList) {
        this.TldList = TldList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TldList.", this.TldList);

    }
}

