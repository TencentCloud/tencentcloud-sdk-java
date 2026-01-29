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

public class DescribeUserListResp extends AbstractModel {

    /**
    * 用户总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 用户列表
    */
    @SerializedName("UserList")
    @Expose
    private User [] UserList;

    /**
     * Get 用户总数 
     * @return Total 用户总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 用户总数
     * @param Total 用户总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 用户列表 
     * @return UserList 用户列表
     */
    public User [] getUserList() {
        return this.UserList;
    }

    /**
     * Set 用户列表
     * @param UserList 用户列表
     */
    public void setUserList(User [] UserList) {
        this.UserList = UserList;
    }

    public DescribeUserListResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserListResp(DescribeUserListResp source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.UserList != null) {
            this.UserList = new User[source.UserList.length];
            for (int i = 0; i < source.UserList.length; i++) {
                this.UserList[i] = new User(source.UserList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "UserList.", this.UserList);

    }
}

