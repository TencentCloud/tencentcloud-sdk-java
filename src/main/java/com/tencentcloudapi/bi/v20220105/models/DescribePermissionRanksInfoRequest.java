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

public class DescribePermissionRanksInfoRequest extends AbstractModel {

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
    * <p>类型</p><p>枚举值：</p><ul><li>ROW： 行权限</li><li>COLUMN： 列权限</li></ul><p>默认值：ROW</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

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

    public DescribePermissionRanksInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePermissionRanksInfoRequest(DescribePermissionRanksInfoRequest source) {
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
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

