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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteUsersRequest extends AbstractModel {

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * tcb用户id列表, 一次最多支持删除100个
    */
    @SerializedName("Uids")
    @Expose
    private String [] Uids;

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get tcb用户id列表, 一次最多支持删除100个 
     * @return Uids tcb用户id列表, 一次最多支持删除100个
     */
    public String [] getUids() {
        return this.Uids;
    }

    /**
     * Set tcb用户id列表, 一次最多支持删除100个
     * @param Uids tcb用户id列表, 一次最多支持删除100个
     */
    public void setUids(String [] Uids) {
        this.Uids = Uids;
    }

    public DeleteUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUsersRequest(DeleteUsersRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Uids != null) {
            this.Uids = new String[source.Uids.length];
            for (int i = 0; i < source.Uids.length; i++) {
                this.Uids[i] = new String(source.Uids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArraySimple(map, prefix + "Uids.", this.Uids);

    }
}

