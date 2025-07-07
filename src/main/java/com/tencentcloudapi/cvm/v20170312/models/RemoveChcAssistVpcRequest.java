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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveChcAssistVpcRequest extends AbstractModel {

    /**
    * CHC物理服务器Id。
    */
    @SerializedName("ChcIds")
    @Expose
    private String [] ChcIds;

    /**
     * Get CHC物理服务器Id。 
     * @return ChcIds CHC物理服务器Id。
     */
    public String [] getChcIds() {
        return this.ChcIds;
    }

    /**
     * Set CHC物理服务器Id。
     * @param ChcIds CHC物理服务器Id。
     */
    public void setChcIds(String [] ChcIds) {
        this.ChcIds = ChcIds;
    }

    public RemoveChcAssistVpcRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveChcAssistVpcRequest(RemoveChcAssistVpcRequest source) {
        if (source.ChcIds != null) {
            this.ChcIds = new String[source.ChcIds.length];
            for (int i = 0; i < source.ChcIds.length; i++) {
                this.ChcIds[i] = new String(source.ChcIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ChcIds.", this.ChcIds);

    }
}

