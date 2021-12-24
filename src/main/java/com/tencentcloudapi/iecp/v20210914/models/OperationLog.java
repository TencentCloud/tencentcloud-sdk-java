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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationLog extends AbstractModel{

    /**
    * 操作时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateTime")
    @Expose
    private String OperateTime;

    /**
    * 模块名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 状态: 1:成功 2:失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 操作用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorUserID")
    @Expose
    private String OperatorUserID;

    /**
    * 操作动作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get 操作时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateTime 操作时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperateTime() {
        return this.OperateTime;
    }

    /**
     * Set 操作时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateTime 操作时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateTime(String OperateTime) {
        this.OperateTime = OperateTime;
    }

    /**
     * Get 模块名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Module 模块名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Module 模块名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作信息 
     * @return Description 操作信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 操作信息
     * @param Description 操作信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 状态: 1:成功 2:失败 
     * @return Status 状态: 1:成功 2:失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态: 1:成功 2:失败
     * @param Status 状态: 1:成功 2:失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 操作用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorUserID 操作用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorUserID() {
        return this.OperatorUserID;
    }

    /**
     * Set 操作用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorUserID 操作用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorUserID(String OperatorUserID) {
        this.OperatorUserID = OperatorUserID;
    }

    /**
     * Get 操作动作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 操作动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 操作动作
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 操作动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public OperationLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationLog(OperationLog source) {
        if (source.OperateTime != null) {
            this.OperateTime = new String(source.OperateTime);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OperatorUserID != null) {
            this.OperatorUserID = new String(source.OperatorUserID);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperateTime", this.OperateTime);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OperatorUserID", this.OperatorUserID);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

