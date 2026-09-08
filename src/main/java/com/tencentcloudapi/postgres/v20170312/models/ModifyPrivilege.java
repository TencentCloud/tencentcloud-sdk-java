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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPrivilege extends AbstractModel {

    /**
    * <p>要修改的数据库对象及权限列表</p>
    */
    @SerializedName("DatabasePrivilege")
    @Expose
    private DatabasePrivilege DatabasePrivilege;

    /**
    * <p>修改的方式，当前仅支持grantObject、revokeObject、alterRole、grantRole、revoke，当前仅支持grantObject、revokeObject、alterRole、grantRole、revokeRole。gRole。grantObject代表授权、revokeObject代表收回权、alterRole代表修改账号类型、grantRole代表加入对应角色、revokeRole 代表移出对应角色。</p>
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
    * <p>当ModifyType为revokeObject才需要此参数，参数为true时，撤销权限会级联撤销。默认为false。</p>
    */
    @SerializedName("IsCascade")
    @Expose
    private Boolean IsCascade;

    /**
     * Get <p>要修改的数据库对象及权限列表</p> 
     * @return DatabasePrivilege <p>要修改的数据库对象及权限列表</p>
     */
    public DatabasePrivilege getDatabasePrivilege() {
        return this.DatabasePrivilege;
    }

    /**
     * Set <p>要修改的数据库对象及权限列表</p>
     * @param DatabasePrivilege <p>要修改的数据库对象及权限列表</p>
     */
    public void setDatabasePrivilege(DatabasePrivilege DatabasePrivilege) {
        this.DatabasePrivilege = DatabasePrivilege;
    }

    /**
     * Get <p>修改的方式，当前仅支持grantObject、revokeObject、alterRole、grantRole、revoke，当前仅支持grantObject、revokeObject、alterRole、grantRole、revokeRole。gRole。grantObject代表授权、revokeObject代表收回权、alterRole代表修改账号类型、grantRole代表加入对应角色、revokeRole 代表移出对应角色。</p> 
     * @return ModifyType <p>修改的方式，当前仅支持grantObject、revokeObject、alterRole、grantRole、revoke，当前仅支持grantObject、revokeObject、alterRole、grantRole、revokeRole。gRole。grantObject代表授权、revokeObject代表收回权、alterRole代表修改账号类型、grantRole代表加入对应角色、revokeRole 代表移出对应角色。</p>
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set <p>修改的方式，当前仅支持grantObject、revokeObject、alterRole、grantRole、revoke，当前仅支持grantObject、revokeObject、alterRole、grantRole、revokeRole。gRole。grantObject代表授权、revokeObject代表收回权、alterRole代表修改账号类型、grantRole代表加入对应角色、revokeRole 代表移出对应角色。</p>
     * @param ModifyType <p>修改的方式，当前仅支持grantObject、revokeObject、alterRole、grantRole、revoke，当前仅支持grantObject、revokeObject、alterRole、grantRole、revokeRole。gRole。grantObject代表授权、revokeObject代表收回权、alterRole代表修改账号类型、grantRole代表加入对应角色、revokeRole 代表移出对应角色。</p>
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get <p>当ModifyType为revokeObject才需要此参数，参数为true时，撤销权限会级联撤销。默认为false。</p> 
     * @return IsCascade <p>当ModifyType为revokeObject才需要此参数，参数为true时，撤销权限会级联撤销。默认为false。</p>
     */
    public Boolean getIsCascade() {
        return this.IsCascade;
    }

    /**
     * Set <p>当ModifyType为revokeObject才需要此参数，参数为true时，撤销权限会级联撤销。默认为false。</p>
     * @param IsCascade <p>当ModifyType为revokeObject才需要此参数，参数为true时，撤销权限会级联撤销。默认为false。</p>
     */
    public void setIsCascade(Boolean IsCascade) {
        this.IsCascade = IsCascade;
    }

    public ModifyPrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPrivilege(ModifyPrivilege source) {
        if (source.DatabasePrivilege != null) {
            this.DatabasePrivilege = new DatabasePrivilege(source.DatabasePrivilege);
        }
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
        if (source.IsCascade != null) {
            this.IsCascade = new Boolean(source.IsCascade);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DatabasePrivilege.", this.DatabasePrivilege);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "IsCascade", this.IsCascade);

    }
}

