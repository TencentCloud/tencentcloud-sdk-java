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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filters extends AbstractModel{

    /**
    * 过滤类型, 0: 默认(可见部门+自创) 1: 自创 2: 指定部门(部门在可见范围内)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 指定部门Id, 类型2使用
    */
    @SerializedName("DeptIds")
    @Expose
    private String [] DeptIds;

    /**
    * 用户Id列表
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
     * Get 过滤类型, 0: 默认(可见部门+自创) 1: 自创 2: 指定部门(部门在可见范围内) 
     * @return Type 过滤类型, 0: 默认(可见部门+自创) 1: 自创 2: 指定部门(部门在可见范围内)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 过滤类型, 0: 默认(可见部门+自创) 1: 自创 2: 指定部门(部门在可见范围内)
     * @param Type 过滤类型, 0: 默认(可见部门+自创) 1: 自创 2: 指定部门(部门在可见范围内)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 指定部门Id, 类型2使用 
     * @return DeptIds 指定部门Id, 类型2使用
     */
    public String [] getDeptIds() {
        return this.DeptIds;
    }

    /**
     * Set 指定部门Id, 类型2使用
     * @param DeptIds 指定部门Id, 类型2使用
     */
    public void setDeptIds(String [] DeptIds) {
        this.DeptIds = DeptIds;
    }

    /**
     * Get 用户Id列表 
     * @return UserIds 用户Id列表
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 用户Id列表
     * @param UserIds 用户Id列表
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "DeptIds.", this.DeptIds);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);

    }
}

