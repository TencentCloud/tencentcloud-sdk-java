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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePermissionRanksRequest extends AbstractModel {

    /**
    * 页数
    */
    @SerializedName("TableId")
    @Expose
    private Long TableId;

    /**
    * 条数
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 角色类型
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * 所有页码
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * 规则信息
    */
    @SerializedName("RulerInfo")
    @Expose
    private String RulerInfo;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 状态
    */
    @SerializedName("OpenStatus")
    @Expose
    private String OpenStatus;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 行列权限配置
    */
    @SerializedName("RowColumnConfigList")
    @Expose
    private RowColumnConfig [] RowColumnConfigList;

    /**
     * Get 页数 
     * @return TableId 页数
     */
    public Long getTableId() {
        return this.TableId;
    }

    /**
     * Set 页数
     * @param TableId 页数
     */
    public void setTableId(Long TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 条数 
     * @return Mode 条数
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 条数
     * @param Mode 条数
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 角色类型 
     * @return RoleType 角色类型
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set 角色类型
     * @param RoleType 角色类型
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get 所有页码 
     * @return RoleId 所有页码
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 所有页码
     * @param RoleId 所有页码
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 规则信息 
     * @return RulerInfo 规则信息
     */
    public String getRulerInfo() {
        return this.RulerInfo;
    }

    /**
     * Set 规则信息
     * @param RulerInfo 规则信息
     */
    public void setRulerInfo(String RulerInfo) {
        this.RulerInfo = RulerInfo;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 状态 
     * @return OpenStatus 状态
     */
    public String getOpenStatus() {
        return this.OpenStatus;
    }

    /**
     * Set 状态
     * @param OpenStatus 状态
     */
    public void setOpenStatus(String OpenStatus) {
        this.OpenStatus = OpenStatus;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 行列权限配置 
     * @return RowColumnConfigList 行列权限配置
     */
    public RowColumnConfig [] getRowColumnConfigList() {
        return this.RowColumnConfigList;
    }

    /**
     * Set 行列权限配置
     * @param RowColumnConfigList 行列权限配置
     */
    public void setRowColumnConfigList(RowColumnConfig [] RowColumnConfigList) {
        this.RowColumnConfigList = RowColumnConfigList;
    }

    public CreatePermissionRanksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePermissionRanksRequest(CreatePermissionRanksRequest source) {
        if (source.TableId != null) {
            this.TableId = new Long(source.TableId);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.RulerInfo != null) {
            this.RulerInfo = new String(source.RulerInfo);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OpenStatus != null) {
            this.OpenStatus = new String(source.OpenStatus);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RowColumnConfigList != null) {
            this.RowColumnConfigList = new RowColumnConfig[source.RowColumnConfigList.length];
            for (int i = 0; i < source.RowColumnConfigList.length; i++) {
                this.RowColumnConfigList[i] = new RowColumnConfig(source.RowColumnConfigList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RulerInfo", this.RulerInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "OpenStatus", this.OpenStatus);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "RowColumnConfigList.", this.RowColumnConfigList);

    }
}

