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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAdministrationByTagRes extends AbstractModel {

    /**
    * 行政区划列表
    */
    @SerializedName("List")
    @Expose
    private AdministrationData [] List;

    /**
     * Get 行政区划列表 
     * @return List 行政区划列表
     */
    public AdministrationData [] getList() {
        return this.List;
    }

    /**
     * Set 行政区划列表
     * @param List 行政区划列表
     */
    public void setList(AdministrationData [] List) {
        this.List = List;
    }

    public DescribeAdministrationByTagRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAdministrationByTagRes(DescribeAdministrationByTagRes source) {
        if (source.List != null) {
            this.List = new AdministrationData[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new AdministrationData(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

