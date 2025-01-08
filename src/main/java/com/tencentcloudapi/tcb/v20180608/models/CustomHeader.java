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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomHeader extends AbstractModel {

    /**
    * 请求添加头部配置
    */
    @SerializedName("RequestToAddList")
    @Expose
    private CustomRequestToAdd [] RequestToAddList;

    /**
     * Get 请求添加头部配置 
     * @return RequestToAddList 请求添加头部配置
     */
    public CustomRequestToAdd [] getRequestToAddList() {
        return this.RequestToAddList;
    }

    /**
     * Set 请求添加头部配置
     * @param RequestToAddList 请求添加头部配置
     */
    public void setRequestToAddList(CustomRequestToAdd [] RequestToAddList) {
        this.RequestToAddList = RequestToAddList;
    }

    public CustomHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomHeader(CustomHeader source) {
        if (source.RequestToAddList != null) {
            this.RequestToAddList = new CustomRequestToAdd[source.RequestToAddList.length];
            for (int i = 0; i < source.RequestToAddList.length; i++) {
                this.RequestToAddList[i] = new CustomRequestToAdd(source.RequestToAddList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RequestToAddList.", this.RequestToAddList);

    }
}

