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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUsersForGroupRequest  extends AbstractModel{

    /**
    * 用户组 ID。
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 页码。
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页数量。
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
     * 获取用户组 ID。
     * @return GroupId 用户组 ID。
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * 设置用户组 ID。
     * @param GroupId 用户组 ID。
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * 获取页码。
     * @return Page 页码。
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * 设置页码。
     * @param Page 页码。
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * 获取每页数量。
     * @return Rp 每页数量。
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * 设置每页数量。
     * @param Rp 每页数量。
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);

    }
}

