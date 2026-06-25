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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotAllowReason extends AbstractModel {

    /**
    * <p>是否创建的成员。true-是、false-否；成员不是创建的成员不允许删除</p>
    */
    @SerializedName("IsCreateMember")
    @Expose
    private Boolean IsCreateMember;

    /**
    * <p>成员删除许可。true-开启、false-关闭；成员删除许可关闭时不允许删除</p>
    */
    @SerializedName("DeletionPermission")
    @Expose
    private Boolean DeletionPermission;

    /**
    * <p>是否可信服务委派管理员。true-是、false-否；成员是可信服务委派管理员不允许删除</p>
    */
    @SerializedName("IsAssignManager")
    @Expose
    private Boolean IsAssignManager;

    /**
    * <p>是否主体管理员。true-是、false-否；成员是主体管理员不允许删除</p>
    */
    @SerializedName("IsAuthManager")
    @Expose
    private Boolean IsAuthManager;

    /**
    * <p>是否共享资源管理员。true-是、false-否；成员是共享资源管理员不允许删除</p>
    */
    @SerializedName("IsShareManager")
    @Expose
    private Boolean IsShareManager;

    /**
    * <p>成员是否设置了操作审批。true-是、false-否；成员设置了操作审批时不允许删除</p>
    */
    @SerializedName("OperateProcess")
    @Expose
    private Boolean OperateProcess;

    /**
    * <p>是否允许解除成员财务权限。true-是、false-否；成员不能解除财务权限时不允许删除</p>
    */
    @SerializedName("BillingPermission")
    @Expose
    private Boolean BillingPermission;

    /**
    * <p>存在的资源列表。账号存在资源时不允许删除</p>
    */
    @SerializedName("ExistResources")
    @Expose
    private String [] ExistResources;

    /**
    * <p>检测失败的资源列表。账号有资源检测失败时不允许删除。</p>
    */
    @SerializedName("DetectFailedResources")
    @Expose
    private String [] DetectFailedResources;

    /**
    * <p>是否部署身份中心权限。部署权限不允许删除</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
    */
    @SerializedName("CICRoleConfig")
    @Expose
    private Boolean CICRoleConfig;

    /**
    * <p>是否同步身份中心用户。同步用户不允许删除</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
    */
    @SerializedName("CICUserConfig")
    @Expose
    private Boolean CICUserConfig;

    /**
     * Get <p>是否创建的成员。true-是、false-否；成员不是创建的成员不允许删除</p> 
     * @return IsCreateMember <p>是否创建的成员。true-是、false-否；成员不是创建的成员不允许删除</p>
     */
    public Boolean getIsCreateMember() {
        return this.IsCreateMember;
    }

    /**
     * Set <p>是否创建的成员。true-是、false-否；成员不是创建的成员不允许删除</p>
     * @param IsCreateMember <p>是否创建的成员。true-是、false-否；成员不是创建的成员不允许删除</p>
     */
    public void setIsCreateMember(Boolean IsCreateMember) {
        this.IsCreateMember = IsCreateMember;
    }

    /**
     * Get <p>成员删除许可。true-开启、false-关闭；成员删除许可关闭时不允许删除</p> 
     * @return DeletionPermission <p>成员删除许可。true-开启、false-关闭；成员删除许可关闭时不允许删除</p>
     */
    public Boolean getDeletionPermission() {
        return this.DeletionPermission;
    }

    /**
     * Set <p>成员删除许可。true-开启、false-关闭；成员删除许可关闭时不允许删除</p>
     * @param DeletionPermission <p>成员删除许可。true-开启、false-关闭；成员删除许可关闭时不允许删除</p>
     */
    public void setDeletionPermission(Boolean DeletionPermission) {
        this.DeletionPermission = DeletionPermission;
    }

    /**
     * Get <p>是否可信服务委派管理员。true-是、false-否；成员是可信服务委派管理员不允许删除</p> 
     * @return IsAssignManager <p>是否可信服务委派管理员。true-是、false-否；成员是可信服务委派管理员不允许删除</p>
     */
    public Boolean getIsAssignManager() {
        return this.IsAssignManager;
    }

    /**
     * Set <p>是否可信服务委派管理员。true-是、false-否；成员是可信服务委派管理员不允许删除</p>
     * @param IsAssignManager <p>是否可信服务委派管理员。true-是、false-否；成员是可信服务委派管理员不允许删除</p>
     */
    public void setIsAssignManager(Boolean IsAssignManager) {
        this.IsAssignManager = IsAssignManager;
    }

    /**
     * Get <p>是否主体管理员。true-是、false-否；成员是主体管理员不允许删除</p> 
     * @return IsAuthManager <p>是否主体管理员。true-是、false-否；成员是主体管理员不允许删除</p>
     */
    public Boolean getIsAuthManager() {
        return this.IsAuthManager;
    }

    /**
     * Set <p>是否主体管理员。true-是、false-否；成员是主体管理员不允许删除</p>
     * @param IsAuthManager <p>是否主体管理员。true-是、false-否；成员是主体管理员不允许删除</p>
     */
    public void setIsAuthManager(Boolean IsAuthManager) {
        this.IsAuthManager = IsAuthManager;
    }

    /**
     * Get <p>是否共享资源管理员。true-是、false-否；成员是共享资源管理员不允许删除</p> 
     * @return IsShareManager <p>是否共享资源管理员。true-是、false-否；成员是共享资源管理员不允许删除</p>
     */
    public Boolean getIsShareManager() {
        return this.IsShareManager;
    }

    /**
     * Set <p>是否共享资源管理员。true-是、false-否；成员是共享资源管理员不允许删除</p>
     * @param IsShareManager <p>是否共享资源管理员。true-是、false-否；成员是共享资源管理员不允许删除</p>
     */
    public void setIsShareManager(Boolean IsShareManager) {
        this.IsShareManager = IsShareManager;
    }

    /**
     * Get <p>成员是否设置了操作审批。true-是、false-否；成员设置了操作审批时不允许删除</p> 
     * @return OperateProcess <p>成员是否设置了操作审批。true-是、false-否；成员设置了操作审批时不允许删除</p>
     */
    public Boolean getOperateProcess() {
        return this.OperateProcess;
    }

    /**
     * Set <p>成员是否设置了操作审批。true-是、false-否；成员设置了操作审批时不允许删除</p>
     * @param OperateProcess <p>成员是否设置了操作审批。true-是、false-否；成员设置了操作审批时不允许删除</p>
     */
    public void setOperateProcess(Boolean OperateProcess) {
        this.OperateProcess = OperateProcess;
    }

    /**
     * Get <p>是否允许解除成员财务权限。true-是、false-否；成员不能解除财务权限时不允许删除</p> 
     * @return BillingPermission <p>是否允许解除成员财务权限。true-是、false-否；成员不能解除财务权限时不允许删除</p>
     */
    public Boolean getBillingPermission() {
        return this.BillingPermission;
    }

    /**
     * Set <p>是否允许解除成员财务权限。true-是、false-否；成员不能解除财务权限时不允许删除</p>
     * @param BillingPermission <p>是否允许解除成员财务权限。true-是、false-否；成员不能解除财务权限时不允许删除</p>
     */
    public void setBillingPermission(Boolean BillingPermission) {
        this.BillingPermission = BillingPermission;
    }

    /**
     * Get <p>存在的资源列表。账号存在资源时不允许删除</p> 
     * @return ExistResources <p>存在的资源列表。账号存在资源时不允许删除</p>
     */
    public String [] getExistResources() {
        return this.ExistResources;
    }

    /**
     * Set <p>存在的资源列表。账号存在资源时不允许删除</p>
     * @param ExistResources <p>存在的资源列表。账号存在资源时不允许删除</p>
     */
    public void setExistResources(String [] ExistResources) {
        this.ExistResources = ExistResources;
    }

    /**
     * Get <p>检测失败的资源列表。账号有资源检测失败时不允许删除。</p> 
     * @return DetectFailedResources <p>检测失败的资源列表。账号有资源检测失败时不允许删除。</p>
     */
    public String [] getDetectFailedResources() {
        return this.DetectFailedResources;
    }

    /**
     * Set <p>检测失败的资源列表。账号有资源检测失败时不允许删除。</p>
     * @param DetectFailedResources <p>检测失败的资源列表。账号有资源检测失败时不允许删除。</p>
     */
    public void setDetectFailedResources(String [] DetectFailedResources) {
        this.DetectFailedResources = DetectFailedResources;
    }

    /**
     * Get <p>是否部署身份中心权限。部署权限不允许删除</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul> 
     * @return CICRoleConfig <p>是否部署身份中心权限。部署权限不允许删除</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public Boolean getCICRoleConfig() {
        return this.CICRoleConfig;
    }

    /**
     * Set <p>是否部署身份中心权限。部署权限不允许删除</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     * @param CICRoleConfig <p>是否部署身份中心权限。部署权限不允许删除</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public void setCICRoleConfig(Boolean CICRoleConfig) {
        this.CICRoleConfig = CICRoleConfig;
    }

    /**
     * Get <p>是否同步身份中心用户。同步用户不允许删除</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul> 
     * @return CICUserConfig <p>是否同步身份中心用户。同步用户不允许删除</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public Boolean getCICUserConfig() {
        return this.CICUserConfig;
    }

    /**
     * Set <p>是否同步身份中心用户。同步用户不允许删除</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     * @param CICUserConfig <p>是否同步身份中心用户。同步用户不允许删除</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public void setCICUserConfig(Boolean CICUserConfig) {
        this.CICUserConfig = CICUserConfig;
    }

    public NotAllowReason() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotAllowReason(NotAllowReason source) {
        if (source.IsCreateMember != null) {
            this.IsCreateMember = new Boolean(source.IsCreateMember);
        }
        if (source.DeletionPermission != null) {
            this.DeletionPermission = new Boolean(source.DeletionPermission);
        }
        if (source.IsAssignManager != null) {
            this.IsAssignManager = new Boolean(source.IsAssignManager);
        }
        if (source.IsAuthManager != null) {
            this.IsAuthManager = new Boolean(source.IsAuthManager);
        }
        if (source.IsShareManager != null) {
            this.IsShareManager = new Boolean(source.IsShareManager);
        }
        if (source.OperateProcess != null) {
            this.OperateProcess = new Boolean(source.OperateProcess);
        }
        if (source.BillingPermission != null) {
            this.BillingPermission = new Boolean(source.BillingPermission);
        }
        if (source.ExistResources != null) {
            this.ExistResources = new String[source.ExistResources.length];
            for (int i = 0; i < source.ExistResources.length; i++) {
                this.ExistResources[i] = new String(source.ExistResources[i]);
            }
        }
        if (source.DetectFailedResources != null) {
            this.DetectFailedResources = new String[source.DetectFailedResources.length];
            for (int i = 0; i < source.DetectFailedResources.length; i++) {
                this.DetectFailedResources[i] = new String(source.DetectFailedResources[i]);
            }
        }
        if (source.CICRoleConfig != null) {
            this.CICRoleConfig = new Boolean(source.CICRoleConfig);
        }
        if (source.CICUserConfig != null) {
            this.CICUserConfig = new Boolean(source.CICUserConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsCreateMember", this.IsCreateMember);
        this.setParamSimple(map, prefix + "DeletionPermission", this.DeletionPermission);
        this.setParamSimple(map, prefix + "IsAssignManager", this.IsAssignManager);
        this.setParamSimple(map, prefix + "IsAuthManager", this.IsAuthManager);
        this.setParamSimple(map, prefix + "IsShareManager", this.IsShareManager);
        this.setParamSimple(map, prefix + "OperateProcess", this.OperateProcess);
        this.setParamSimple(map, prefix + "BillingPermission", this.BillingPermission);
        this.setParamArraySimple(map, prefix + "ExistResources.", this.ExistResources);
        this.setParamArraySimple(map, prefix + "DetectFailedResources.", this.DetectFailedResources);
        this.setParamSimple(map, prefix + "CICRoleConfig", this.CICRoleConfig);
        this.setParamSimple(map, prefix + "CICUserConfig", this.CICUserConfig);

    }
}

