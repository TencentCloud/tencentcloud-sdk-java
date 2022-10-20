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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteEscapeWhiteListRequest extends AbstractModel{

    /**
    * 白名单记录ID数组
    */
    @SerializedName("IDSet")
    @Expose
    private Long [] IDSet;

    /**
     * Get 白名单记录ID数组 
     * @return IDSet 白名单记录ID数组
     */
    public Long [] getIDSet() {
        return this.IDSet;
    }

    /**
     * Set 白名单记录ID数组
     * @param IDSet 白名单记录ID数组
     */
    public void setIDSet(Long [] IDSet) {
        this.IDSet = IDSet;
    }

    public DeleteEscapeWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteEscapeWhiteListRequest(DeleteEscapeWhiteListRequest source) {
        if (source.IDSet != null) {
            this.IDSet = new Long[source.IDSet.length];
            for (int i = 0; i < source.IDSet.length; i++) {
                this.IDSet[i] = new Long(source.IDSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IDSet.", this.IDSet);

    }
}

