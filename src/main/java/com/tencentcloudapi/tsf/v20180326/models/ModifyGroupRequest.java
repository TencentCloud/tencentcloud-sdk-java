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

public class ModifyGroupRequest extends AbstractModel{

    /**
    * 部署组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 部署组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 部署组描述
    */
    @SerializedName("GroupDesc")
    @Expose
    private String GroupDesc;

    /**
    * 部署组备注
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get 部署组ID 
     * @return GroupId 部署组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
     * @param GroupId 部署组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 部署组名称 
     * @return GroupName 部署组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 部署组名称
     * @param GroupName 部署组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 部署组描述 
     * @return GroupDesc 部署组描述
     */
    public String getGroupDesc() {
        return this.GroupDesc;
    }

    /**
     * Set 部署组描述
     * @param GroupDesc 部署组描述
     */
    public void setGroupDesc(String GroupDesc) {
        this.GroupDesc = GroupDesc;
    }

    /**
     * Get 部署组备注 
     * @return Alias 部署组备注
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 部署组备注
     * @param Alias 部署组备注
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public ModifyGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGroupRequest(ModifyGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupDesc != null) {
            this.GroupDesc = new String(source.GroupDesc);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupDesc", this.GroupDesc);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

