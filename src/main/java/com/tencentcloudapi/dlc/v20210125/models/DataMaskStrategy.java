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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataMaskStrategy extends AbstractModel {

    /**
    * 策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAppId")
    @Expose
    private String UserAppId;

    /**
    * 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 操作用户子账号uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 策略名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * MASK_SHOW_FIRST_4; MASK_SHOW_LAST_4;MASK_HASH; MASK_DATE_SHOW_YEAR; MASK_NULL; MASK_DEFAULT 等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 策略描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyDesc")
    @Expose
    private String StrategyDesc;

    /**
    * 用户组策略列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Groups")
    @Expose
    private GroupInfo [] Groups;

    /**
    * 用户子账号uin列表，按;拼接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Users")
    @Expose
    private String Users;

    /**
    * 1: 生效中； 0：已删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 策略创建时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 策略更新时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyId 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyId 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 用户AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserAppId() {
        return this.UserAppId;
    }

    /**
     * Set 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAppId(String UserAppId) {
        this.UserAppId = UserAppId;
    }

    /**
     * Get 用户Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 操作用户子账号uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 操作用户子账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 操作用户子账号uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 操作用户子账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 策略名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyName 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyName 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get MASK_SHOW_FIRST_4; MASK_SHOW_LAST_4;MASK_HASH; MASK_DATE_SHOW_YEAR; MASK_NULL; MASK_DEFAULT 等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyType MASK_SHOW_FIRST_4; MASK_SHOW_LAST_4;MASK_HASH; MASK_DATE_SHOW_YEAR; MASK_NULL; MASK_DEFAULT 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set MASK_SHOW_FIRST_4; MASK_SHOW_LAST_4;MASK_HASH; MASK_DATE_SHOW_YEAR; MASK_NULL; MASK_DEFAULT 等
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyType MASK_SHOW_FIRST_4; MASK_SHOW_LAST_4;MASK_HASH; MASK_DATE_SHOW_YEAR; MASK_NULL; MASK_DEFAULT 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 策略描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyDesc 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyDesc() {
        return this.StrategyDesc;
    }

    /**
     * Set 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyDesc 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyDesc(String StrategyDesc) {
        this.StrategyDesc = StrategyDesc;
    }

    /**
     * Get 用户组策略列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Groups 用户组策略列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GroupInfo [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 用户组策略列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Groups 用户组策略列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroups(GroupInfo [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get 用户子账号uin列表，按;拼接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Users 用户子账号uin列表，按;拼接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsers() {
        return this.Users;
    }

    /**
     * Set 用户子账号uin列表，按;拼接
注意：此字段可能返回 null，表示取不到有效值。
     * @param Users 用户子账号uin列表，按;拼接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsers(String Users) {
        this.Users = Users;
    }

    /**
     * Get 1: 生效中； 0：已删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 1: 生效中； 0：已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 1: 生效中； 0：已删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 1: 生效中； 0：已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 策略创建时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 策略创建时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 策略创建时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 策略创建时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 策略更新时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 策略更新时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 策略更新时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 策略更新时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DataMaskStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataMaskStrategy(DataMaskStrategy source) {
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.UserAppId != null) {
            this.UserAppId = new String(source.UserAppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.StrategyDesc != null) {
            this.StrategyDesc = new String(source.StrategyDesc);
        }
        if (source.Groups != null) {
            this.Groups = new GroupInfo[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new GroupInfo(source.Groups[i]);
            }
        }
        if (source.Users != null) {
            this.Users = new String(source.Users);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "UserAppId", this.UserAppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyDesc", this.StrategyDesc);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "Users", this.Users);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

