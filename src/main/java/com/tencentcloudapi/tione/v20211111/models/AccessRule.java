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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessRule extends AbstractModel {

    /**
    * <p>模块</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>功能权限点</p>
    */
    @SerializedName("ActionType")
    @Expose
    private String [] ActionType;

    /**
    * <p>数据权限点</p>
    */
    @SerializedName("DataActionType")
    @Expose
    private String [] DataActionType;

    /**
    * <p>功能权限点名称</p>
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String [] ActionTypeName;

    /**
     * Get <p>模块</p> 
     * @return Module <p>模块</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>模块</p>
     * @param Module <p>模块</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>功能权限点</p> 
     * @return ActionType <p>功能权限点</p>
     */
    public String [] getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>功能权限点</p>
     * @param ActionType <p>功能权限点</p>
     */
    public void setActionType(String [] ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>数据权限点</p> 
     * @return DataActionType <p>数据权限点</p>
     */
    public String [] getDataActionType() {
        return this.DataActionType;
    }

    /**
     * Set <p>数据权限点</p>
     * @param DataActionType <p>数据权限点</p>
     */
    public void setDataActionType(String [] DataActionType) {
        this.DataActionType = DataActionType;
    }

    /**
     * Get <p>功能权限点名称</p> 
     * @return ActionTypeName <p>功能权限点名称</p>
     */
    public String [] getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set <p>功能权限点名称</p>
     * @param ActionTypeName <p>功能权限点名称</p>
     */
    public void setActionTypeName(String [] ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    public AccessRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessRule(AccessRule source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ActionType != null) {
            this.ActionType = new String[source.ActionType.length];
            for (int i = 0; i < source.ActionType.length; i++) {
                this.ActionType[i] = new String(source.ActionType[i]);
            }
        }
        if (source.DataActionType != null) {
            this.DataActionType = new String[source.DataActionType.length];
            for (int i = 0; i < source.DataActionType.length; i++) {
                this.DataActionType[i] = new String(source.DataActionType[i]);
            }
        }
        if (source.ActionTypeName != null) {
            this.ActionTypeName = new String[source.ActionTypeName.length];
            for (int i = 0; i < source.ActionTypeName.length; i++) {
                this.ActionTypeName[i] = new String(source.ActionTypeName[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "ActionType.", this.ActionType);
        this.setParamArraySimple(map, prefix + "DataActionType.", this.DataActionType);
        this.setParamArraySimple(map, prefix + "ActionTypeName.", this.ActionTypeName);

    }
}

