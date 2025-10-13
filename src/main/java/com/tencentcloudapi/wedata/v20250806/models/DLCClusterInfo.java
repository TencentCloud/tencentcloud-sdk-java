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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DLCClusterInfo extends AbstractModel {

    /**
    * dlc资源名称（需要添加角色Uin到dlc中，否则可能获取不到资源）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputeResources")
    @Expose
    private String [] ComputeResources;

    /**
    * dlc地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 指定DLC集群的默认数据库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultDatabase")
    @Expose
    private String DefaultDatabase;

    /**
    * 集群配置标记（ 仅对标准模式的项目生效并且标准模式必填），枚举值：
- Prod  (生产环境)
- Dev  (开发环境)
    */
    @SerializedName("StandardModeEnvTag")
    @Expose
    private String StandardModeEnvTag;

    /**
    * 访问账号（ 仅对标准模式的项目生效并且标准模式必填），用于提交dlc任务的账号
建议使用指定子账号，给子账号设置对应库表的权限；任务负责人模式在负责人离职后容易造成任务失败；主账号模式在多个项目权限不同的情况下不易做权限控制。

枚举值：
- TASK_RUNNER （任务负责人）
- OWNER （主账号模式）
- SUB （子账号模式）
    */
    @SerializedName("AccessAccount")
    @Expose
    private String AccessAccount;

    /**
    * 子账号id（ 仅对标准模式的项目生效），AccessAccount为子账号模式时，需要指定子账号的id信息，其他模式不需要指定
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
     * Get dlc资源名称（需要添加角色Uin到dlc中，否则可能获取不到资源）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputeResources dlc资源名称（需要添加角色Uin到dlc中，否则可能获取不到资源）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getComputeResources() {
        return this.ComputeResources;
    }

    /**
     * Set dlc资源名称（需要添加角色Uin到dlc中，否则可能获取不到资源）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputeResources dlc资源名称（需要添加角色Uin到dlc中，否则可能获取不到资源）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputeResources(String [] ComputeResources) {
        this.ComputeResources = ComputeResources;
    }

    /**
     * Get dlc地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region dlc地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set dlc地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region dlc地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 指定DLC集群的默认数据库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultDatabase 指定DLC集群的默认数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultDatabase() {
        return this.DefaultDatabase;
    }

    /**
     * Set 指定DLC集群的默认数据库
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultDatabase 指定DLC集群的默认数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultDatabase(String DefaultDatabase) {
        this.DefaultDatabase = DefaultDatabase;
    }

    /**
     * Get 集群配置标记（ 仅对标准模式的项目生效并且标准模式必填），枚举值：
- Prod  (生产环境)
- Dev  (开发环境) 
     * @return StandardModeEnvTag 集群配置标记（ 仅对标准模式的项目生效并且标准模式必填），枚举值：
- Prod  (生产环境)
- Dev  (开发环境)
     */
    public String getStandardModeEnvTag() {
        return this.StandardModeEnvTag;
    }

    /**
     * Set 集群配置标记（ 仅对标准模式的项目生效并且标准模式必填），枚举值：
- Prod  (生产环境)
- Dev  (开发环境)
     * @param StandardModeEnvTag 集群配置标记（ 仅对标准模式的项目生效并且标准模式必填），枚举值：
- Prod  (生产环境)
- Dev  (开发环境)
     */
    public void setStandardModeEnvTag(String StandardModeEnvTag) {
        this.StandardModeEnvTag = StandardModeEnvTag;
    }

    /**
     * Get 访问账号（ 仅对标准模式的项目生效并且标准模式必填），用于提交dlc任务的账号
建议使用指定子账号，给子账号设置对应库表的权限；任务负责人模式在负责人离职后容易造成任务失败；主账号模式在多个项目权限不同的情况下不易做权限控制。

枚举值：
- TASK_RUNNER （任务负责人）
- OWNER （主账号模式）
- SUB （子账号模式） 
     * @return AccessAccount 访问账号（ 仅对标准模式的项目生效并且标准模式必填），用于提交dlc任务的账号
建议使用指定子账号，给子账号设置对应库表的权限；任务负责人模式在负责人离职后容易造成任务失败；主账号模式在多个项目权限不同的情况下不易做权限控制。

枚举值：
- TASK_RUNNER （任务负责人）
- OWNER （主账号模式）
- SUB （子账号模式）
     */
    public String getAccessAccount() {
        return this.AccessAccount;
    }

    /**
     * Set 访问账号（ 仅对标准模式的项目生效并且标准模式必填），用于提交dlc任务的账号
建议使用指定子账号，给子账号设置对应库表的权限；任务负责人模式在负责人离职后容易造成任务失败；主账号模式在多个项目权限不同的情况下不易做权限控制。

枚举值：
- TASK_RUNNER （任务负责人）
- OWNER （主账号模式）
- SUB （子账号模式）
     * @param AccessAccount 访问账号（ 仅对标准模式的项目生效并且标准模式必填），用于提交dlc任务的账号
建议使用指定子账号，给子账号设置对应库表的权限；任务负责人模式在负责人离职后容易造成任务失败；主账号模式在多个项目权限不同的情况下不易做权限控制。

枚举值：
- TASK_RUNNER （任务负责人）
- OWNER （主账号模式）
- SUB （子账号模式）
     */
    public void setAccessAccount(String AccessAccount) {
        this.AccessAccount = AccessAccount;
    }

    /**
     * Get 子账号id（ 仅对标准模式的项目生效），AccessAccount为子账号模式时，需要指定子账号的id信息，其他模式不需要指定 
     * @return SubAccountUin 子账号id（ 仅对标准模式的项目生效），AccessAccount为子账号模式时，需要指定子账号的id信息，其他模式不需要指定
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 子账号id（ 仅对标准模式的项目生效），AccessAccount为子账号模式时，需要指定子账号的id信息，其他模式不需要指定
     * @param SubAccountUin 子账号id（ 仅对标准模式的项目生效），AccessAccount为子账号模式时，需要指定子账号的id信息，其他模式不需要指定
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    public DLCClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DLCClusterInfo(DLCClusterInfo source) {
        if (source.ComputeResources != null) {
            this.ComputeResources = new String[source.ComputeResources.length];
            for (int i = 0; i < source.ComputeResources.length; i++) {
                this.ComputeResources[i] = new String(source.ComputeResources[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.DefaultDatabase != null) {
            this.DefaultDatabase = new String(source.DefaultDatabase);
        }
        if (source.StandardModeEnvTag != null) {
            this.StandardModeEnvTag = new String(source.StandardModeEnvTag);
        }
        if (source.AccessAccount != null) {
            this.AccessAccount = new String(source.AccessAccount);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ComputeResources.", this.ComputeResources);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DefaultDatabase", this.DefaultDatabase);
        this.setParamSimple(map, prefix + "StandardModeEnvTag", this.StandardModeEnvTag);
        this.setParamSimple(map, prefix + "AccessAccount", this.AccessAccount);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);

    }
}

