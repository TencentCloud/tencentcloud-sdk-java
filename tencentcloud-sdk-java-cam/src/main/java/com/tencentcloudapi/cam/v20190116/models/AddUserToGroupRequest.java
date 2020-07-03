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

public class AddUserToGroupRequest extends AbstractModel{

    /**
    * 添加的子用户 UID 和用户组 ID 关联关系
    */
    @SerializedName("Info")
    @Expose
    private GroupIdOfUidInfo [] Info;

    /**
     * Get 添加的子用户 UID 和用户组 ID 关联关系 
     * @return Info 添加的子用户 UID 和用户组 ID 关联关系
     */
    public GroupIdOfUidInfo [] getInfo() {
        return this.Info;
    }

    /**
     * Set 添加的子用户 UID 和用户组 ID 关联关系
     * @param Info 添加的子用户 UID 和用户组 ID 关联关系
     */
    public void setInfo(GroupIdOfUidInfo [] Info) {
        this.Info = Info;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Info.", this.Info);

    }
}

