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
    * <p>页数</p>
    */
    @SerializedName("TableId")
    @Expose
    private Long TableId;

    /**
    * <p>模式</p><p>枚举值：</p><ul><li>ALL： 全部</li><li>Specify： 指定</li><li>TAG： 标签</li></ul><p>默认值：ALL</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>角色类型</p><p>枚举值：</p><ul><li>ROLES： 按角色</li><li>Others： 其它</li></ul><p>默认值：Others</p>
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * <p>所有页码</p>
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * <p>规则信息</p>
    */
    @SerializedName("RulerInfo")
    @Expose
    private String RulerInfo;

    /**
    * <p>类型</p><p>枚举值：</p><ul><li>ROW： 行权限</li><li>COLUMN： 列权限</li></ul><p>默认值：ROW</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>开启状态</p><p>枚举值：</p><ul><li>Open： 开启</li><li>Close： 关闭</li></ul><p>默认值：Close</p>
    */
    @SerializedName("OpenStatus")
    @Expose
    private String OpenStatus;

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>行列权限配置</p>
    */
    @SerializedName("RowColumnConfigList")
    @Expose
    private RowColumnConfig [] RowColumnConfigList;

    /**
     * Get <p>页数</p> 
     * @return TableId <p>页数</p>
     */
    public Long getTableId() {
        return this.TableId;
    }

    /**
     * Set <p>页数</p>
     * @param TableId <p>页数</p>
     */
    public void setTableId(Long TableId) {
        this.TableId = TableId;
    }

    /**
     * Get <p>模式</p><p>枚举值：</p><ul><li>ALL： 全部</li><li>Specify： 指定</li><li>TAG： 标签</li></ul><p>默认值：ALL</p> 
     * @return Mode <p>模式</p><p>枚举值：</p><ul><li>ALL： 全部</li><li>Specify： 指定</li><li>TAG： 标签</li></ul><p>默认值：ALL</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>模式</p><p>枚举值：</p><ul><li>ALL： 全部</li><li>Specify： 指定</li><li>TAG： 标签</li></ul><p>默认值：ALL</p>
     * @param Mode <p>模式</p><p>枚举值：</p><ul><li>ALL： 全部</li><li>Specify： 指定</li><li>TAG： 标签</li></ul><p>默认值：ALL</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>角色类型</p><p>枚举值：</p><ul><li>ROLES： 按角色</li><li>Others： 其它</li></ul><p>默认值：Others</p> 
     * @return RoleType <p>角色类型</p><p>枚举值：</p><ul><li>ROLES： 按角色</li><li>Others： 其它</li></ul><p>默认值：Others</p>
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set <p>角色类型</p><p>枚举值：</p><ul><li>ROLES： 按角色</li><li>Others： 其它</li></ul><p>默认值：Others</p>
     * @param RoleType <p>角色类型</p><p>枚举值：</p><ul><li>ROLES： 按角色</li><li>Others： 其它</li></ul><p>默认值：Others</p>
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get <p>所有页码</p> 
     * @return RoleId <p>所有页码</p>
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set <p>所有页码</p>
     * @param RoleId <p>所有页码</p>
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get <p>规则信息</p> 
     * @return RulerInfo <p>规则信息</p>
     */
    public String getRulerInfo() {
        return this.RulerInfo;
    }

    /**
     * Set <p>规则信息</p>
     * @param RulerInfo <p>规则信息</p>
     */
    public void setRulerInfo(String RulerInfo) {
        this.RulerInfo = RulerInfo;
    }

    /**
     * Get <p>类型</p><p>枚举值：</p><ul><li>ROW： 行权限</li><li>COLUMN： 列权限</li></ul><p>默认值：ROW</p> 
     * @return Type <p>类型</p><p>枚举值：</p><ul><li>ROW： 行权限</li><li>COLUMN： 列权限</li></ul><p>默认值：ROW</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p><p>枚举值：</p><ul><li>ROW： 行权限</li><li>COLUMN： 列权限</li></ul><p>默认值：ROW</p>
     * @param Type <p>类型</p><p>枚举值：</p><ul><li>ROW： 行权限</li><li>COLUMN： 列权限</li></ul><p>默认值：ROW</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>开启状态</p><p>枚举值：</p><ul><li>Open： 开启</li><li>Close： 关闭</li></ul><p>默认值：Close</p> 
     * @return OpenStatus <p>开启状态</p><p>枚举值：</p><ul><li>Open： 开启</li><li>Close： 关闭</li></ul><p>默认值：Close</p>
     */
    public String getOpenStatus() {
        return this.OpenStatus;
    }

    /**
     * Set <p>开启状态</p><p>枚举值：</p><ul><li>Open： 开启</li><li>Close： 关闭</li></ul><p>默认值：Close</p>
     * @param OpenStatus <p>开启状态</p><p>枚举值：</p><ul><li>Open： 开启</li><li>Close： 关闭</li></ul><p>默认值：Close</p>
     */
    public void setOpenStatus(String OpenStatus) {
        this.OpenStatus = OpenStatus;
    }

    /**
     * Get <p>项目id</p> 
     * @return ProjectId <p>项目id</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectId <p>项目id</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>行列权限配置</p> 
     * @return RowColumnConfigList <p>行列权限配置</p>
     */
    public RowColumnConfig [] getRowColumnConfigList() {
        return this.RowColumnConfigList;
    }

    /**
     * Set <p>行列权限配置</p>
     * @param RowColumnConfigList <p>行列权限配置</p>
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

