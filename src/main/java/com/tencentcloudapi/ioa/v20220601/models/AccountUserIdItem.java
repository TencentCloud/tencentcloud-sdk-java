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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountUserIdItem extends AbstractModel {

    /**
    * <p>Comment: 账号所在目录ID(MenuId)，与accounts表menu_id一致，用于同一登录账号在不同目录下去重;Required:true</p>
    */
    @SerializedName("MenuId")
    @Expose
    private Long MenuId;

    /**
    * <p>Comment: 登录账号(UserId)，对应DescribeLocalAccount -&gt; UserId;Required:true</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>Comment: 账号所在目录ID(MenuId)，与accounts表menu_id一致，用于同一登录账号在不同目录下去重;Required:true</p> 
     * @return MenuId <p>Comment: 账号所在目录ID(MenuId)，与accounts表menu_id一致，用于同一登录账号在不同目录下去重;Required:true</p>
     */
    public Long getMenuId() {
        return this.MenuId;
    }

    /**
     * Set <p>Comment: 账号所在目录ID(MenuId)，与accounts表menu_id一致，用于同一登录账号在不同目录下去重;Required:true</p>
     * @param MenuId <p>Comment: 账号所在目录ID(MenuId)，与accounts表menu_id一致，用于同一登录账号在不同目录下去重;Required:true</p>
     */
    public void setMenuId(Long MenuId) {
        this.MenuId = MenuId;
    }

    /**
     * Get <p>Comment: 登录账号(UserId)，对应DescribeLocalAccount -&gt; UserId;Required:true</p> 
     * @return UserId <p>Comment: 登录账号(UserId)，对应DescribeLocalAccount -&gt; UserId;Required:true</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>Comment: 登录账号(UserId)，对应DescribeLocalAccount -&gt; UserId;Required:true</p>
     * @param UserId <p>Comment: 登录账号(UserId)，对应DescribeLocalAccount -&gt; UserId;Required:true</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public AccountUserIdItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountUserIdItem(AccountUserIdItem source) {
        if (source.MenuId != null) {
            this.MenuId = new Long(source.MenuId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MenuId", this.MenuId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

