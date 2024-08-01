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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputModifyNameListDataFrontListData extends AbstractModel {

    /**
    * 名单数据集合
    */
    @SerializedName("DataList")
    @Expose
    private InputModifyNameListDataFront [] DataList;

    /**
     * Get 名单数据集合 
     * @return DataList 名单数据集合
     */
    public InputModifyNameListDataFront [] getDataList() {
        return this.DataList;
    }

    /**
     * Set 名单数据集合
     * @param DataList 名单数据集合
     */
    public void setDataList(InputModifyNameListDataFront [] DataList) {
        this.DataList = DataList;
    }

    public InputModifyNameListDataFrontListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputModifyNameListDataFrontListData(InputModifyNameListDataFrontListData source) {
        if (source.DataList != null) {
            this.DataList = new InputModifyNameListDataFront[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new InputModifyNameListDataFront(source.DataList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);

    }
}

