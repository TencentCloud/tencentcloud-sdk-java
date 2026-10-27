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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceStatus extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例状态
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
STOPPED：表示关机
STARTING：表示开机中
STOPPING：表示关机中
REBOOTING：表示重启中
SHUTDOWN：表示停止待销毁
TERMINATING：表示销毁中
DELETED：表示资源已经销毁，这个状态是业务层面的状态，cvm如果销毁了，在cvm测资源已经不存在了
FAILED：表示资源创建失败.这个是业务层面的状态
ROLLBACKING：表示机器正在回滚中
RESETTING：表示机器正在重置中
USING：表示机器正在使用中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 只有在Status为RUNNING时候，当前值才有意义
取值范围：
0:Unknown
1:Connected 
2:Disconnected 
3:Terminated
4:PreparingSession
5:Active
6:Reconnecting
7:NonBrokeredSession
8:Other
9:Pending
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionState")
    @Expose
    private Long SessionState;

    /**
    * 此字段只有在Status为USING时，才有效。
字段意义：表示桌面当前session空闲时间（客户没有鼠标，键盘等操作），单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdleSeconds")
    @Expose
    private Float IdleSeconds;

    /**
    * 当前状态改变的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusChangeTime")
    @Expose
    private Long StatusChangeTime;

    /**
    * 实例最近一次操作类型
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * 实例最近一次操作状态
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例状态
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
STOPPED：表示关机
STARTING：表示开机中
STOPPING：表示关机中
REBOOTING：表示重启中
SHUTDOWN：表示停止待销毁
TERMINATING：表示销毁中
DELETED：表示资源已经销毁，这个状态是业务层面的状态，cvm如果销毁了，在cvm测资源已经不存在了
FAILED：表示资源创建失败.这个是业务层面的状态
ROLLBACKING：表示机器正在回滚中
RESETTING：表示机器正在重置中
USING：表示机器正在使用中 
     * @return Status 实例状态
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
STOPPED：表示关机
STARTING：表示开机中
STOPPING：表示关机中
REBOOTING：表示重启中
SHUTDOWN：表示停止待销毁
TERMINATING：表示销毁中
DELETED：表示资源已经销毁，这个状态是业务层面的状态，cvm如果销毁了，在cvm测资源已经不存在了
FAILED：表示资源创建失败.这个是业务层面的状态
ROLLBACKING：表示机器正在回滚中
RESETTING：表示机器正在重置中
USING：表示机器正在使用中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
STOPPED：表示关机
STARTING：表示开机中
STOPPING：表示关机中
REBOOTING：表示重启中
SHUTDOWN：表示停止待销毁
TERMINATING：表示销毁中
DELETED：表示资源已经销毁，这个状态是业务层面的状态，cvm如果销毁了，在cvm测资源已经不存在了
FAILED：表示资源创建失败.这个是业务层面的状态
ROLLBACKING：表示机器正在回滚中
RESETTING：表示机器正在重置中
USING：表示机器正在使用中
     * @param Status 实例状态
PENDING：表示创建中
LAUNCH_FAILED：表示创建失败
RUNNING：表示运行中
STOPPED：表示关机
STARTING：表示开机中
STOPPING：表示关机中
REBOOTING：表示重启中
SHUTDOWN：表示停止待销毁
TERMINATING：表示销毁中
DELETED：表示资源已经销毁，这个状态是业务层面的状态，cvm如果销毁了，在cvm测资源已经不存在了
FAILED：表示资源创建失败.这个是业务层面的状态
ROLLBACKING：表示机器正在回滚中
RESETTING：表示机器正在重置中
USING：表示机器正在使用中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 只有在Status为RUNNING时候，当前值才有意义
取值范围：
0:Unknown
1:Connected 
2:Disconnected 
3:Terminated
4:PreparingSession
5:Active
6:Reconnecting
7:NonBrokeredSession
8:Other
9:Pending
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionState 只有在Status为RUNNING时候，当前值才有意义
取值范围：
0:Unknown
1:Connected 
2:Disconnected 
3:Terminated
4:PreparingSession
5:Active
6:Reconnecting
7:NonBrokeredSession
8:Other
9:Pending
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSessionState() {
        return this.SessionState;
    }

    /**
     * Set 只有在Status为RUNNING时候，当前值才有意义
取值范围：
0:Unknown
1:Connected 
2:Disconnected 
3:Terminated
4:PreparingSession
5:Active
6:Reconnecting
7:NonBrokeredSession
8:Other
9:Pending
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionState 只有在Status为RUNNING时候，当前值才有意义
取值范围：
0:Unknown
1:Connected 
2:Disconnected 
3:Terminated
4:PreparingSession
5:Active
6:Reconnecting
7:NonBrokeredSession
8:Other
9:Pending
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionState(Long SessionState) {
        this.SessionState = SessionState;
    }

    /**
     * Get 此字段只有在Status为USING时，才有效。
字段意义：表示桌面当前session空闲时间（客户没有鼠标，键盘等操作），单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdleSeconds 此字段只有在Status为USING时，才有效。
字段意义：表示桌面当前session空闲时间（客户没有鼠标，键盘等操作），单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getIdleSeconds() {
        return this.IdleSeconds;
    }

    /**
     * Set 此字段只有在Status为USING时，才有效。
字段意义：表示桌面当前session空闲时间（客户没有鼠标，键盘等操作），单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdleSeconds 此字段只有在Status为USING时，才有效。
字段意义：表示桌面当前session空闲时间（客户没有鼠标，键盘等操作），单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdleSeconds(Float IdleSeconds) {
        this.IdleSeconds = IdleSeconds;
    }

    /**
     * Get 当前状态改变的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusChangeTime 当前状态改变的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatusChangeTime() {
        return this.StatusChangeTime;
    }

    /**
     * Set 当前状态改变的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusChangeTime 当前状态改变的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusChangeTime(Long StatusChangeTime) {
        this.StatusChangeTime = StatusChangeTime;
    }

    /**
     * Get 实例最近一次操作类型 
     * @return LatestOperation 实例最近一次操作类型
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set 实例最近一次操作类型
     * @param LatestOperation 实例最近一次操作类型
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get 实例最近一次操作状态 
     * @return LatestOperationState 实例最近一次操作状态
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set 实例最近一次操作状态
     * @param LatestOperationState 实例最近一次操作状态
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    public InstanceStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceStatus(InstanceStatus source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SessionState != null) {
            this.SessionState = new Long(source.SessionState);
        }
        if (source.IdleSeconds != null) {
            this.IdleSeconds = new Float(source.IdleSeconds);
        }
        if (source.StatusChangeTime != null) {
            this.StatusChangeTime = new Long(source.StatusChangeTime);
        }
        if (source.LatestOperation != null) {
            this.LatestOperation = new String(source.LatestOperation);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SessionState", this.SessionState);
        this.setParamSimple(map, prefix + "IdleSeconds", this.IdleSeconds);
        this.setParamSimple(map, prefix + "StatusChangeTime", this.StatusChangeTime);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);

    }
}

