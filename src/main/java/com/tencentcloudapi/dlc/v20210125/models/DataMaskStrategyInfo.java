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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataMaskStrategyInfo extends AbstractModel {

    /**
    * 策略名称
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * MASK_SHOW_FIRST_4; MASK_SHOW_LAST_4;MASK_HASH; MASK_DATE_SHOW_YEAR; MASK_NULL; MASK_DEFAULT 等
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 策略描述
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
    */
    @SerializedName("Users")
    @Expose
    private String Users;

    /**
    * 策略Id
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
     * Get 策略名称 
     * @return StrategyName 策略名称
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称
     * @param StrategyName 策略名称
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get MASK_SHOW_FIRST_4; MASK_SHOW_LAST_4;MASK_HASH; MASK_DATE_SHOW_YEAR; MASK_NULL; MASK_DEFAULT 等 
     * @return StrategyType MASK_SHOW_FIRST_4; MASK_SHOW_LAST_4;MASK_HASH; MASK_DATE_SHOW_YEAR; MASK_NULL; MASK_DEFAULT 等
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set MASK_SHOW_FIRST_4; MASK_SHOW_LAST_4;MASK_HASH; MASK_DATE_SHOW_YEAR; MASK_NULL; MASK_DEFAULT 等
     * @param StrategyType MASK_SHOW_FIRST_4; MASK_SHOW_LAST_4;MASK_HASH; MASK_DATE_SHOW_YEAR; MASK_NULL; MASK_DEFAULT 等
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 策略描述 
     * @return StrategyDesc 策略描述
     */
    public String getStrategyDesc() {
        return this.StrategyDesc;
    }

    /**
     * Set 策略描述
     * @param StrategyDesc 策略描述
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
     * @return Users 用户子账号uin列表，按;拼接
     */
    public String getUsers() {
        return this.Users;
    }

    /**
     * Set 用户子账号uin列表，按;拼接
     * @param Users 用户子账号uin列表，按;拼接
     */
    public void setUsers(String Users) {
        this.Users = Users;
    }

    /**
     * Get 策略Id 
     * @return StrategyId 策略Id
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略Id
     * @param StrategyId 策略Id
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    public DataMaskStrategyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataMaskStrategyInfo(DataMaskStrategyInfo source) {
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
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyDesc", this.StrategyDesc);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "Users", this.Users);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);

    }
}

