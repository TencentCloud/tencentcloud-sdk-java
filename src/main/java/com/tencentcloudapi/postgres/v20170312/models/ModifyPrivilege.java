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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPrivilege extends AbstractModel {

    /**
    * 要修改的数据库对象及权限列表
    */
    @SerializedName("DatabasePrivilege")
    @Expose
    private DatabasePrivilege DatabasePrivilege;

    /**
    * 修改的方式，当前仅支持grantObject、revokeObject、alterRole。grantObject代表授权、revokeObject代表收回权、alterRole代表修改账号类型。
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
    * 当ModifyType为revokeObject才需要此参数，参数为true时，撤销权限会级联撤销。默认为false。
    */
    @SerializedName("IsCascade")
    @Expose
    private Boolean IsCascade;

    /**
     * Get 要修改的数据库对象及权限列表 
     * @return DatabasePrivilege 要修改的数据库对象及权限列表
     */
    public DatabasePrivilege getDatabasePrivilege() {
        return this.DatabasePrivilege;
    }

    /**
     * Set 要修改的数据库对象及权限列表
     * @param DatabasePrivilege 要修改的数据库对象及权限列表
     */
    public void setDatabasePrivilege(DatabasePrivilege DatabasePrivilege) {
        this.DatabasePrivilege = DatabasePrivilege;
    }

    /**
     * Get 修改的方式，当前仅支持grantObject、revokeObject、alterRole。grantObject代表授权、revokeObject代表收回权、alterRole代表修改账号类型。 
     * @return ModifyType 修改的方式，当前仅支持grantObject、revokeObject、alterRole。grantObject代表授权、revokeObject代表收回权、alterRole代表修改账号类型。
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set 修改的方式，当前仅支持grantObject、revokeObject、alterRole。grantObject代表授权、revokeObject代表收回权、alterRole代表修改账号类型。
     * @param ModifyType 修改的方式，当前仅支持grantObject、revokeObject、alterRole。grantObject代表授权、revokeObject代表收回权、alterRole代表修改账号类型。
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get 当ModifyType为revokeObject才需要此参数，参数为true时，撤销权限会级联撤销。默认为false。 
     * @return IsCascade 当ModifyType为revokeObject才需要此参数，参数为true时，撤销权限会级联撤销。默认为false。
     */
    public Boolean getIsCascade() {
        return this.IsCascade;
    }

    /**
     * Set 当ModifyType为revokeObject才需要此参数，参数为true时，撤销权限会级联撤销。默认为false。
     * @param IsCascade 当ModifyType为revokeObject才需要此参数，参数为true时，撤销权限会级联撤销。默认为false。
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

