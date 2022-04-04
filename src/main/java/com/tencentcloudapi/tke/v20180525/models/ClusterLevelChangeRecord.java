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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterLevelChangeRecord extends AbstractModel{

    /**
    * 记录ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 变配状态：trading 发货中,upgrading 变配中,success 变配成功,failed 变配失败。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态描述
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 变配前规模
    */
    @SerializedName("OldLevel")
    @Expose
    private String OldLevel;

    /**
    * 变配后规模
    */
    @SerializedName("NewLevel")
    @Expose
    private String NewLevel;

    /**
    * 变配触发类型：manual 手动,auto 自动
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * 开始时间
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * 结束时间
    */
    @SerializedName("EndedAt")
    @Expose
    private String EndedAt;

    /**
     * Get 记录ID 
     * @return ID 记录ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 记录ID
     * @param ID 记录ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 变配状态：trading 发货中,upgrading 变配中,success 变配成功,failed 变配失败。 
     * @return Status 变配状态：trading 发货中,upgrading 变配中,success 变配成功,failed 变配失败。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 变配状态：trading 发货中,upgrading 变配中,success 变配成功,failed 变配失败。
     * @param Status 变配状态：trading 发货中,upgrading 变配中,success 变配成功,failed 变配失败。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述 
     * @return Message 状态描述
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 状态描述
     * @param Message 状态描述
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 变配前规模 
     * @return OldLevel 变配前规模
     */
    public String getOldLevel() {
        return this.OldLevel;
    }

    /**
     * Set 变配前规模
     * @param OldLevel 变配前规模
     */
    public void setOldLevel(String OldLevel) {
        this.OldLevel = OldLevel;
    }

    /**
     * Get 变配后规模 
     * @return NewLevel 变配后规模
     */
    public String getNewLevel() {
        return this.NewLevel;
    }

    /**
     * Set 变配后规模
     * @param NewLevel 变配后规模
     */
    public void setNewLevel(String NewLevel) {
        this.NewLevel = NewLevel;
    }

    /**
     * Get 变配触发类型：manual 手动,auto 自动 
     * @return TriggerType 变配触发类型：manual 手动,auto 自动
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 变配触发类型：manual 手动,auto 自动
     * @param TriggerType 变配触发类型：manual 手动,auto 自动
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 开始时间 
     * @return StartedAt 开始时间
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set 开始时间
     * @param StartedAt 开始时间
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get 结束时间 
     * @return EndedAt 结束时间
     */
    public String getEndedAt() {
        return this.EndedAt;
    }

    /**
     * Set 结束时间
     * @param EndedAt 结束时间
     */
    public void setEndedAt(String EndedAt) {
        this.EndedAt = EndedAt;
    }

    public ClusterLevelChangeRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterLevelChangeRecord(ClusterLevelChangeRecord source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.OldLevel != null) {
            this.OldLevel = new String(source.OldLevel);
        }
        if (source.NewLevel != null) {
            this.NewLevel = new String(source.NewLevel);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.EndedAt != null) {
            this.EndedAt = new String(source.EndedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "OldLevel", this.OldLevel);
        this.setParamSimple(map, prefix + "NewLevel", this.NewLevel);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "EndedAt", this.EndedAt);

    }
}

