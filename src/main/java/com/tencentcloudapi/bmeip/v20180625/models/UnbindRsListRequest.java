/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindRsListRequest extends AbstractModel {

    /**
    * 物理机绑定的EIP列表
    */
    @SerializedName("EipRsList")
    @Expose
    private EipRsMap [] EipRsList;

    /**
     * Get 物理机绑定的EIP列表 
     * @return EipRsList 物理机绑定的EIP列表
     */
    public EipRsMap [] getEipRsList() {
        return this.EipRsList;
    }

    /**
     * Set 物理机绑定的EIP列表
     * @param EipRsList 物理机绑定的EIP列表
     */
    public void setEipRsList(EipRsMap [] EipRsList) {
        this.EipRsList = EipRsList;
    }

    public UnbindRsListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindRsListRequest(UnbindRsListRequest source) {
        if (source.EipRsList != null) {
            this.EipRsList = new EipRsMap[source.EipRsList.length];
            for (int i = 0; i < source.EipRsList.length; i++) {
                this.EipRsList[i] = new EipRsMap(source.EipRsList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EipRsList.", this.EipRsList);

    }
}

