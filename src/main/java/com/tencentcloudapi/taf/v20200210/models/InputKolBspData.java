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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputKolBspData extends AbstractModel{

    /**
    * BspData
    */
    @SerializedName("DataList")
    @Expose
    private InputKolDataList [] DataList;

    /**
     * Get BspData 
     * @return DataList BspData
     */
    public InputKolDataList [] getDataList() {
        return this.DataList;
    }

    /**
     * Set BspData
     * @param DataList BspData
     */
    public void setDataList(InputKolDataList [] DataList) {
        this.DataList = DataList;
    }

    public InputKolBspData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputKolBspData(InputKolBspData source) {
        if (source.DataList != null) {
            this.DataList = new InputKolDataList[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new InputKolDataList(source.DataList[i]);
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

