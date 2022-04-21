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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteUpstreamRequest extends AbstractModel{

    /**
    * 待删除的后端通道ID
    */
    @SerializedName("UpstreamId")
    @Expose
    private String UpstreamId;

    /**
     * Get 待删除的后端通道ID 
     * @return UpstreamId 待删除的后端通道ID
     */
    public String getUpstreamId() {
        return this.UpstreamId;
    }

    /**
     * Set 待删除的后端通道ID
     * @param UpstreamId 待删除的后端通道ID
     */
    public void setUpstreamId(String UpstreamId) {
        this.UpstreamId = UpstreamId;
    }

    public DeleteUpstreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUpstreamRequest(DeleteUpstreamRequest source) {
        if (source.UpstreamId != null) {
            this.UpstreamId = new String(source.UpstreamId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UpstreamId", this.UpstreamId);

    }
}

