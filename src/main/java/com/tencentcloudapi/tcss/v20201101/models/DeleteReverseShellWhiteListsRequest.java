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

public class DeleteReverseShellWhiteListsRequest extends AbstractModel{

    /**
    * 白名单ids
    */
    @SerializedName("WhiteListIdSet")
    @Expose
    private String [] WhiteListIdSet;

    /**
     * Get 白名单ids 
     * @return WhiteListIdSet 白名单ids
     */
    public String [] getWhiteListIdSet() {
        return this.WhiteListIdSet;
    }

    /**
     * Set 白名单ids
     * @param WhiteListIdSet 白名单ids
     */
    public void setWhiteListIdSet(String [] WhiteListIdSet) {
        this.WhiteListIdSet = WhiteListIdSet;
    }

    public DeleteReverseShellWhiteListsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteReverseShellWhiteListsRequest(DeleteReverseShellWhiteListsRequest source) {
        if (source.WhiteListIdSet != null) {
            this.WhiteListIdSet = new String[source.WhiteListIdSet.length];
            for (int i = 0; i < source.WhiteListIdSet.length; i++) {
                this.WhiteListIdSet[i] = new String(source.WhiteListIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WhiteListIdSet.", this.WhiteListIdSet);

    }
}

