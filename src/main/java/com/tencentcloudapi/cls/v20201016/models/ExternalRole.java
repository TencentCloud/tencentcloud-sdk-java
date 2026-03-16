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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalRole extends AbstractModel {

    /**
    * <p>跨账户投递-用户角色RoleArn</p>
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * <p>跨账户投递-用户角色名称</p>
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
     * Get <p>跨账户投递-用户角色RoleArn</p> 
     * @return RoleArn <p>跨账户投递-用户角色RoleArn</p>
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>跨账户投递-用户角色RoleArn</p>
     * @param RoleArn <p>跨账户投递-用户角色RoleArn</p>
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>跨账户投递-用户角色名称</p> 
     * @return ExternalId <p>跨账户投递-用户角色名称</p>
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set <p>跨账户投递-用户角色名称</p>
     * @param ExternalId <p>跨账户投递-用户角色名称</p>
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    public ExternalRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalRole(ExternalRole source) {
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);

    }
}

