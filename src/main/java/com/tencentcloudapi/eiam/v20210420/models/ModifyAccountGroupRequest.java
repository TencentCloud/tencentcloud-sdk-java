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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountGroupRequest extends AbstractModel{

    /**
    * 账号组ID。
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * 账号组名。未传入该参数时，表示不进行修改。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 描述，未传入该参数时，表示不进行修改。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 账号组ID。 
     * @return AccountGroupId 账号组ID。
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账号组ID。
     * @param AccountGroupId 账号组ID。
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get 账号组名。未传入该参数时，表示不进行修改。 
     * @return GroupName 账号组名。未传入该参数时，表示不进行修改。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 账号组名。未传入该参数时，表示不进行修改。
     * @param GroupName 账号组名。未传入该参数时，表示不进行修改。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 描述，未传入该参数时，表示不进行修改。 
     * @return Description 描述，未传入该参数时，表示不进行修改。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述，未传入该参数时，表示不进行修改。
     * @param Description 描述，未传入该参数时，表示不进行修改。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyAccountGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountGroupRequest(ModifyAccountGroupRequest source) {
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

