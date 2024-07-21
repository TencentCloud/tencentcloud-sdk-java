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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteL3ConnRequest extends AbstractModel {

    /**
    * 互通规则ID列表
    */
    @SerializedName("L3ConnIdList")
    @Expose
    private String [] L3ConnIdList;

    /**
     * Get 互通规则ID列表 
     * @return L3ConnIdList 互通规则ID列表
     */
    public String [] getL3ConnIdList() {
        return this.L3ConnIdList;
    }

    /**
     * Set 互通规则ID列表
     * @param L3ConnIdList 互通规则ID列表
     */
    public void setL3ConnIdList(String [] L3ConnIdList) {
        this.L3ConnIdList = L3ConnIdList;
    }

    public DeleteL3ConnRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteL3ConnRequest(DeleteL3ConnRequest source) {
        if (source.L3ConnIdList != null) {
            this.L3ConnIdList = new String[source.L3ConnIdList.length];
            for (int i = 0; i < source.L3ConnIdList.length; i++) {
                this.L3ConnIdList[i] = new String(source.L3ConnIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "L3ConnIdList.", this.L3ConnIdList);

    }
}

