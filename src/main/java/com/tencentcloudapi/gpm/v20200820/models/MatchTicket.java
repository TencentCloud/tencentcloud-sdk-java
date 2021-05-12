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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MatchTicket extends AbstractModel{

    /**
    * 匹配票据 ID长度 128 [a-zA-Z0-9-\.]*
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 匹配 Code
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
    * 根据 MatchType 取不同的结构序列化结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchResult")
    @Expose
    private String MatchResult;

    /**
    * 表示不同的匹配类型,NORMAL | GSE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * 玩家信息列表
    */
    @SerializedName("Players")
    @Expose
    private Player [] Players;

    /**
    * 匹配状态: SEARCHING 匹配中; PLACING 匹配放置中; COMPLETED 匹配完成; CANCELLED 匹配取消; TIMEDOUT 匹配超时; FAILED 匹配失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 匹配状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
    * 匹配状态原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusReason")
    @Expose
    private String StatusReason;

    /**
    * 收到发起匹配请求的时间 eg: "2020-08-17T08:14:38.077Z"
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 匹配请求因完成、失败、超时、被取消而停止执行的时间 eg: "2020-08-17T08:14:38.077Z"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 匹配票据 ID长度 128 [a-zA-Z0-9-\.]* 
     * @return Id 匹配票据 ID长度 128 [a-zA-Z0-9-\.]*
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 匹配票据 ID长度 128 [a-zA-Z0-9-\.]*
     * @param Id 匹配票据 ID长度 128 [a-zA-Z0-9-\.]*
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 匹配 Code 
     * @return MatchCode 匹配 Code
     */
    public String getMatchCode() {
        return this.MatchCode;
    }

    /**
     * Set 匹配 Code
     * @param MatchCode 匹配 Code
     */
    public void setMatchCode(String MatchCode) {
        this.MatchCode = MatchCode;
    }

    /**
     * Get 根据 MatchType 取不同的结构序列化结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchResult 根据 MatchType 取不同的结构序列化结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMatchResult() {
        return this.MatchResult;
    }

    /**
     * Set 根据 MatchType 取不同的结构序列化结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchResult 根据 MatchType 取不同的结构序列化结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchResult(String MatchResult) {
        this.MatchResult = MatchResult;
    }

    /**
     * Get 表示不同的匹配类型,NORMAL | GSE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchType 表示不同的匹配类型,NORMAL | GSE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set 表示不同的匹配类型,NORMAL | GSE
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchType 表示不同的匹配类型,NORMAL | GSE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get 玩家信息列表 
     * @return Players 玩家信息列表
     */
    public Player [] getPlayers() {
        return this.Players;
    }

    /**
     * Set 玩家信息列表
     * @param Players 玩家信息列表
     */
    public void setPlayers(Player [] Players) {
        this.Players = Players;
    }

    /**
     * Get 匹配状态: SEARCHING 匹配中; PLACING 匹配放置中; COMPLETED 匹配完成; CANCELLED 匹配取消; TIMEDOUT 匹配超时; FAILED 匹配失败 
     * @return Status 匹配状态: SEARCHING 匹配中; PLACING 匹配放置中; COMPLETED 匹配完成; CANCELLED 匹配取消; TIMEDOUT 匹配超时; FAILED 匹配失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 匹配状态: SEARCHING 匹配中; PLACING 匹配放置中; COMPLETED 匹配完成; CANCELLED 匹配取消; TIMEDOUT 匹配超时; FAILED 匹配失败
     * @param Status 匹配状态: SEARCHING 匹配中; PLACING 匹配放置中; COMPLETED 匹配完成; CANCELLED 匹配取消; TIMEDOUT 匹配超时; FAILED 匹配失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 匹配状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusMessage 匹配状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set 匹配状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusMessage 匹配状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    /**
     * Get 匹配状态原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusReason 匹配状态原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set 匹配状态原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusReason 匹配状态原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusReason(String StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get 收到发起匹配请求的时间 eg: "2020-08-17T08:14:38.077Z" 
     * @return StartTime 收到发起匹配请求的时间 eg: "2020-08-17T08:14:38.077Z"
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 收到发起匹配请求的时间 eg: "2020-08-17T08:14:38.077Z"
     * @param StartTime 收到发起匹配请求的时间 eg: "2020-08-17T08:14:38.077Z"
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 匹配请求因完成、失败、超时、被取消而停止执行的时间 eg: "2020-08-17T08:14:38.077Z"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 匹配请求因完成、失败、超时、被取消而停止执行的时间 eg: "2020-08-17T08:14:38.077Z"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 匹配请求因完成、失败、超时、被取消而停止执行的时间 eg: "2020-08-17T08:14:38.077Z"
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 匹配请求因完成、失败、超时、被取消而停止执行的时间 eg: "2020-08-17T08:14:38.077Z"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public MatchTicket() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MatchTicket(MatchTicket source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.MatchCode != null) {
            this.MatchCode = new String(source.MatchCode);
        }
        if (source.MatchResult != null) {
            this.MatchResult = new String(source.MatchResult);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.Players != null) {
            this.Players = new Player[source.Players.length];
            for (int i = 0; i < source.Players.length; i++) {
                this.Players[i] = new Player(source.Players[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusMessage != null) {
            this.StatusMessage = new String(source.StatusMessage);
        }
        if (source.StatusReason != null) {
            this.StatusReason = new String(source.StatusReason);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);
        this.setParamSimple(map, prefix + "MatchResult", this.MatchResult);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamArrayObj(map, prefix + "Players.", this.Players);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

