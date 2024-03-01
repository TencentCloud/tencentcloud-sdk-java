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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotAllowReason extends AbstractModel {

    /**
    * 是否创建的成员。true-是、false-否；成员不是创建的成员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCreateMember")
    @Expose
    private Boolean IsCreateMember;

    /**
    * 成员删除许可。true-开启、false-关闭；成员删除许可关闭时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeletionPermission")
    @Expose
    private Boolean DeletionPermission;

    /**
    * 是否可信服务委派管理员。true-是、false-否；成员是可信服务委派管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAssignManager")
    @Expose
    private Boolean IsAssignManager;

    /**
    * 是否主体管理员。true-是、false-否；成员是主体管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAuthManager")
    @Expose
    private Boolean IsAuthManager;

    /**
    * 是否共享资源管理员。true-是、false-否；成员是共享资源管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsShareManager")
    @Expose
    private Boolean IsShareManager;

    /**
    * 成员是否设置了操作审批。true-是、false-否；成员设置了操作审批时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateProcess")
    @Expose
    private Boolean OperateProcess;

    /**
    * 是否允许解除成员财务权限。true-是、false-否；成员不能解除财务权限时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingPermission")
    @Expose
    private Boolean BillingPermission;

    /**
    * 存在的资源列表。账号存在资源时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExistResources")
    @Expose
    private String [] ExistResources;

    /**
    * 检测失败的资源列表。账号有资源检测失败时不允许删除。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectFailedResources")
    @Expose
    private String [] DetectFailedResources;

    /**
     * Get 是否创建的成员。true-是、false-否；成员不是创建的成员不允许删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCreateMember 是否创建的成员。true-是、false-否；成员不是创建的成员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsCreateMember() {
        return this.IsCreateMember;
    }

    /**
     * Set 是否创建的成员。true-是、false-否；成员不是创建的成员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCreateMember 是否创建的成员。true-是、false-否；成员不是创建的成员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCreateMember(Boolean IsCreateMember) {
        this.IsCreateMember = IsCreateMember;
    }

    /**
     * Get 成员删除许可。true-开启、false-关闭；成员删除许可关闭时不允许删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeletionPermission 成员删除许可。true-开启、false-关闭；成员删除许可关闭时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeletionPermission() {
        return this.DeletionPermission;
    }

    /**
     * Set 成员删除许可。true-开启、false-关闭；成员删除许可关闭时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeletionPermission 成员删除许可。true-开启、false-关闭；成员删除许可关闭时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeletionPermission(Boolean DeletionPermission) {
        this.DeletionPermission = DeletionPermission;
    }

    /**
     * Get 是否可信服务委派管理员。true-是、false-否；成员是可信服务委派管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAssignManager 是否可信服务委派管理员。true-是、false-否；成员是可信服务委派管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAssignManager() {
        return this.IsAssignManager;
    }

    /**
     * Set 是否可信服务委派管理员。true-是、false-否；成员是可信服务委派管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAssignManager 是否可信服务委派管理员。true-是、false-否；成员是可信服务委派管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAssignManager(Boolean IsAssignManager) {
        this.IsAssignManager = IsAssignManager;
    }

    /**
     * Get 是否主体管理员。true-是、false-否；成员是主体管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAuthManager 是否主体管理员。true-是、false-否；成员是主体管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAuthManager() {
        return this.IsAuthManager;
    }

    /**
     * Set 是否主体管理员。true-是、false-否；成员是主体管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAuthManager 是否主体管理员。true-是、false-否；成员是主体管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAuthManager(Boolean IsAuthManager) {
        this.IsAuthManager = IsAuthManager;
    }

    /**
     * Get 是否共享资源管理员。true-是、false-否；成员是共享资源管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsShareManager 是否共享资源管理员。true-是、false-否；成员是共享资源管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsShareManager() {
        return this.IsShareManager;
    }

    /**
     * Set 是否共享资源管理员。true-是、false-否；成员是共享资源管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsShareManager 是否共享资源管理员。true-是、false-否；成员是共享资源管理员不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsShareManager(Boolean IsShareManager) {
        this.IsShareManager = IsShareManager;
    }

    /**
     * Get 成员是否设置了操作审批。true-是、false-否；成员设置了操作审批时不允许删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateProcess 成员是否设置了操作审批。true-是、false-否；成员设置了操作审批时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOperateProcess() {
        return this.OperateProcess;
    }

    /**
     * Set 成员是否设置了操作审批。true-是、false-否；成员设置了操作审批时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateProcess 成员是否设置了操作审批。true-是、false-否；成员设置了操作审批时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateProcess(Boolean OperateProcess) {
        this.OperateProcess = OperateProcess;
    }

    /**
     * Get 是否允许解除成员财务权限。true-是、false-否；成员不能解除财务权限时不允许删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingPermission 是否允许解除成员财务权限。true-是、false-否；成员不能解除财务权限时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBillingPermission() {
        return this.BillingPermission;
    }

    /**
     * Set 是否允许解除成员财务权限。true-是、false-否；成员不能解除财务权限时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingPermission 是否允许解除成员财务权限。true-是、false-否；成员不能解除财务权限时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingPermission(Boolean BillingPermission) {
        this.BillingPermission = BillingPermission;
    }

    /**
     * Get 存在的资源列表。账号存在资源时不允许删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExistResources 存在的资源列表。账号存在资源时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExistResources() {
        return this.ExistResources;
    }

    /**
     * Set 存在的资源列表。账号存在资源时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExistResources 存在的资源列表。账号存在资源时不允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExistResources(String [] ExistResources) {
        this.ExistResources = ExistResources;
    }

    /**
     * Get 检测失败的资源列表。账号有资源检测失败时不允许删除。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectFailedResources 检测失败的资源列表。账号有资源检测失败时不允许删除。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDetectFailedResources() {
        return this.DetectFailedResources;
    }

    /**
     * Set 检测失败的资源列表。账号有资源检测失败时不允许删除。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectFailedResources 检测失败的资源列表。账号有资源检测失败时不允许删除。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectFailedResources(String [] DetectFailedResources) {
        this.DetectFailedResources = DetectFailedResources;
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

    }
}

