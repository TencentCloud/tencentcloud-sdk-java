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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindApiGroupRequest extends AbstractModel{

    /**
    * 分组绑定网关列表
    */
    @SerializedName("GroupGatewayList")
    @Expose
    private GatewayGroupIds [] GroupGatewayList;

    /**
     * Get 分组绑定网关列表 
     * @return GroupGatewayList 分组绑定网关列表
     */
    public GatewayGroupIds [] getGroupGatewayList() {
        return this.GroupGatewayList;
    }

    /**
     * Set 分组绑定网关列表
     * @param GroupGatewayList 分组绑定网关列表
     */
    public void setGroupGatewayList(GatewayGroupIds [] GroupGatewayList) {
        this.GroupGatewayList = GroupGatewayList;
    }

    public BindApiGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindApiGroupRequest(BindApiGroupRequest source) {
        if (source.GroupGatewayList != null) {
            this.GroupGatewayList = new GatewayGroupIds[source.GroupGatewayList.length];
            for (int i = 0; i < source.GroupGatewayList.length; i++) {
                this.GroupGatewayList[i] = new GatewayGroupIds(source.GroupGatewayList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "GroupGatewayList.", this.GroupGatewayList);

    }
}

