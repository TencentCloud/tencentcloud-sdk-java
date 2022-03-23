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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessBaseInfo extends AbstractModel{

    /**
    * 进程启动用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessStartUser")
    @Expose
    private String ProcessStartUser;

    /**
    * 进程用户组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessUserGroup")
    @Expose
    private String ProcessUserGroup;

    /**
    * 进程路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * 进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessParam")
    @Expose
    private String ProcessParam;

    /**
     * Get 进程启动用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessStartUser 进程启动用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessStartUser() {
        return this.ProcessStartUser;
    }

    /**
     * Set 进程启动用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessStartUser 进程启动用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessStartUser(String ProcessStartUser) {
        this.ProcessStartUser = ProcessStartUser;
    }

    /**
     * Get 进程用户组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessUserGroup 进程用户组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessUserGroup() {
        return this.ProcessUserGroup;
    }

    /**
     * Set 进程用户组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessUserGroup 进程用户组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessUserGroup(String ProcessUserGroup) {
        this.ProcessUserGroup = ProcessUserGroup;
    }

    /**
     * Get 进程路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessPath 进程路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set 进程路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessPath 进程路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get 进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessParam 进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessParam() {
        return this.ProcessParam;
    }

    /**
     * Set 进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessParam 进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessParam(String ProcessParam) {
        this.ProcessParam = ProcessParam;
    }

    public ProcessBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessBaseInfo(ProcessBaseInfo source) {
        if (source.ProcessStartUser != null) {
            this.ProcessStartUser = new String(source.ProcessStartUser);
        }
        if (source.ProcessUserGroup != null) {
            this.ProcessUserGroup = new String(source.ProcessUserGroup);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.ProcessParam != null) {
            this.ProcessParam = new String(source.ProcessParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessStartUser", this.ProcessStartUser);
        this.setParamSimple(map, prefix + "ProcessUserGroup", this.ProcessUserGroup);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "ProcessParam", this.ProcessParam);

    }
}

