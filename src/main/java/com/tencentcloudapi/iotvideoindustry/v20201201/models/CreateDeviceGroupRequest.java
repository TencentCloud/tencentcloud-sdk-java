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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeviceGroupRequest extends AbstractModel{

    /**
    * 分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 父分组ID
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 分组描述
    */
    @SerializedName("GroupDescribe")
    @Expose
    private String GroupDescribe;

    /**
     * Get 分组名称 
     * @return GroupName 分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称
     * @param GroupName 分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 父分组ID 
     * @return ParentId 父分组ID
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父分组ID
     * @param ParentId 父分组ID
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 分组描述 
     * @return GroupDescribe 分组描述
     */
    public String getGroupDescribe() {
        return this.GroupDescribe;
    }

    /**
     * Set 分组描述
     * @param GroupDescribe 分组描述
     */
    public void setGroupDescribe(String GroupDescribe) {
        this.GroupDescribe = GroupDescribe;
    }

    public CreateDeviceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeviceGroupRequest(CreateDeviceGroupRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.GroupDescribe != null) {
            this.GroupDescribe = new String(source.GroupDescribe);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "GroupDescribe", this.GroupDescribe);

    }
}

