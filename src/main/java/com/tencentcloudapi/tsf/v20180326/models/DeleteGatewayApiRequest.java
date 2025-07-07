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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGatewayApiRequest extends AbstractModel {

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Api ID 数组
    */
    @SerializedName("ApiList")
    @Expose
    private String [] ApiList;

    /**
     * Get 分组ID 
     * @return GroupId 分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID
     * @param GroupId 分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Api ID 数组 
     * @return ApiList Api ID 数组
     */
    public String [] getApiList() {
        return this.ApiList;
    }

    /**
     * Set Api ID 数组
     * @param ApiList Api ID 数组
     */
    public void setApiList(String [] ApiList) {
        this.ApiList = ApiList;
    }

    public DeleteGatewayApiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGatewayApiRequest(DeleteGatewayApiRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ApiList != null) {
            this.ApiList = new String[source.ApiList.length];
            for (int i = 0; i < source.ApiList.length; i++) {
                this.ApiList[i] = new String(source.ApiList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "ApiList.", this.ApiList);

    }
}

