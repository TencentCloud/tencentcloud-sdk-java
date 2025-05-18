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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCfsPGroupRequest extends AbstractModel {

    /**
    * 权限组 ID，通过创建权限组接口或者创建权限组规则接口获取
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
     * Get 权限组 ID，通过创建权限组接口或者创建权限组规则接口获取 
     * @return PGroupId 权限组 ID，通过创建权限组接口或者创建权限组规则接口获取
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set 权限组 ID，通过创建权限组接口或者创建权限组规则接口获取
     * @param PGroupId 权限组 ID，通过创建权限组接口或者创建权限组规则接口获取
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    public DeleteCfsPGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCfsPGroupRequest(DeleteCfsPGroupRequest source) {
        if (source.PGroupId != null) {
            this.PGroupId = new String(source.PGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);

    }
}

