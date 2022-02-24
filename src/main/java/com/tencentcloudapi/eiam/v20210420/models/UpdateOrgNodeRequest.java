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

public class UpdateOrgNodeRequest extends AbstractModel{

    /**
    * 机构节点ID，是机构节点的全局唯一标识。
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
    * 机构节点名称，长度限制：64个字符。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 机构节点描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 机构代码。如果非空则校验此ID的唯一性。
    */
    @SerializedName("CustomizedOrgNodeId")
    @Expose
    private String CustomizedOrgNodeId;

    /**
     * Get 机构节点ID，是机构节点的全局唯一标识。 
     * @return OrgNodeId 机构节点ID，是机构节点的全局唯一标识。
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set 机构节点ID，是机构节点的全局唯一标识。
     * @param OrgNodeId 机构节点ID，是机构节点的全局唯一标识。
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    /**
     * Get 机构节点名称，长度限制：64个字符。 
     * @return DisplayName 机构节点名称，长度限制：64个字符。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 机构节点名称，长度限制：64个字符。
     * @param DisplayName 机构节点名称，长度限制：64个字符。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 机构节点描述。 
     * @return Description 机构节点描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 机构节点描述。
     * @param Description 机构节点描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 机构代码。如果非空则校验此ID的唯一性。 
     * @return CustomizedOrgNodeId 机构代码。如果非空则校验此ID的唯一性。
     */
    public String getCustomizedOrgNodeId() {
        return this.CustomizedOrgNodeId;
    }

    /**
     * Set 机构代码。如果非空则校验此ID的唯一性。
     * @param CustomizedOrgNodeId 机构代码。如果非空则校验此ID的唯一性。
     */
    public void setCustomizedOrgNodeId(String CustomizedOrgNodeId) {
        this.CustomizedOrgNodeId = CustomizedOrgNodeId;
    }

    public UpdateOrgNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOrgNodeRequest(UpdateOrgNodeRequest source) {
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CustomizedOrgNodeId != null) {
            this.CustomizedOrgNodeId = new String(source.CustomizedOrgNodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CustomizedOrgNodeId", this.CustomizedOrgNodeId);

    }
}

