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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckItem extends AbstractModel {

    /**
    * 检查项目名称，CK_CPU-变配后CPU风险检查；CK_MASTER_STORAGE-只读副本变配下，只读副本磁盘空间不小于主实例空间检查；CK_MEMORY-变配后内存风险检查；CK_STORAGE-变配后磁盘空间风险检查；CK_UPGRATE-变配是否需要迁移检查；
    */
    @SerializedName("CheckName")
    @Expose
    private String CheckName;

    /**
    * 检查项目返回值，CK_CPU-当前CPU近7天最大的使用率(%) ；CK_MASTER_STORAGE-主实例的磁盘空间(GB)；CK_MEMORY-当前内存近7天最大的使用值（GB)；
CK_STORAGE-当前磁盘近7天最大的使用值（GB)；CK_UPGRATE- 当前变配检查是否需要迁移，MIGRATE需要迁移变配，LOCAL本地变配；
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * 检查条目是否通过 0-不通过，不能变配； 1-通过，可以变配
    */
    @SerializedName("Passed")
    @Expose
    private Long Passed;

    /**
    * 本条目变配是否对实例有影响 0-没有影响 1-有影响
    */
    @SerializedName("IsAffect")
    @Expose
    private Long IsAffect;

    /**
    * 有影响或者不通过的情况下的必要描述
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 描述对应的代码
    */
    @SerializedName("MsgCode")
    @Expose
    private Long MsgCode;

    /**
     * Get 检查项目名称，CK_CPU-变配后CPU风险检查；CK_MASTER_STORAGE-只读副本变配下，只读副本磁盘空间不小于主实例空间检查；CK_MEMORY-变配后内存风险检查；CK_STORAGE-变配后磁盘空间风险检查；CK_UPGRATE-变配是否需要迁移检查； 
     * @return CheckName 检查项目名称，CK_CPU-变配后CPU风险检查；CK_MASTER_STORAGE-只读副本变配下，只读副本磁盘空间不小于主实例空间检查；CK_MEMORY-变配后内存风险检查；CK_STORAGE-变配后磁盘空间风险检查；CK_UPGRATE-变配是否需要迁移检查；
     */
    public String getCheckName() {
        return this.CheckName;
    }

    /**
     * Set 检查项目名称，CK_CPU-变配后CPU风险检查；CK_MASTER_STORAGE-只读副本变配下，只读副本磁盘空间不小于主实例空间检查；CK_MEMORY-变配后内存风险检查；CK_STORAGE-变配后磁盘空间风险检查；CK_UPGRATE-变配是否需要迁移检查；
     * @param CheckName 检查项目名称，CK_CPU-变配后CPU风险检查；CK_MASTER_STORAGE-只读副本变配下，只读副本磁盘空间不小于主实例空间检查；CK_MEMORY-变配后内存风险检查；CK_STORAGE-变配后磁盘空间风险检查；CK_UPGRATE-变配是否需要迁移检查；
     */
    public void setCheckName(String CheckName) {
        this.CheckName = CheckName;
    }

    /**
     * Get 检查项目返回值，CK_CPU-当前CPU近7天最大的使用率(%) ；CK_MASTER_STORAGE-主实例的磁盘空间(GB)；CK_MEMORY-当前内存近7天最大的使用值（GB)；
CK_STORAGE-当前磁盘近7天最大的使用值（GB)；CK_UPGRATE- 当前变配检查是否需要迁移，MIGRATE需要迁移变配，LOCAL本地变配； 
     * @return CurrentValue 检查项目返回值，CK_CPU-当前CPU近7天最大的使用率(%) ；CK_MASTER_STORAGE-主实例的磁盘空间(GB)；CK_MEMORY-当前内存近7天最大的使用值（GB)；
CK_STORAGE-当前磁盘近7天最大的使用值（GB)；CK_UPGRATE- 当前变配检查是否需要迁移，MIGRATE需要迁移变配，LOCAL本地变配；
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set 检查项目返回值，CK_CPU-当前CPU近7天最大的使用率(%) ；CK_MASTER_STORAGE-主实例的磁盘空间(GB)；CK_MEMORY-当前内存近7天最大的使用值（GB)；
CK_STORAGE-当前磁盘近7天最大的使用值（GB)；CK_UPGRATE- 当前变配检查是否需要迁移，MIGRATE需要迁移变配，LOCAL本地变配；
     * @param CurrentValue 检查项目返回值，CK_CPU-当前CPU近7天最大的使用率(%) ；CK_MASTER_STORAGE-主实例的磁盘空间(GB)；CK_MEMORY-当前内存近7天最大的使用值（GB)；
CK_STORAGE-当前磁盘近7天最大的使用值（GB)；CK_UPGRATE- 当前变配检查是否需要迁移，MIGRATE需要迁移变配，LOCAL本地变配；
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get 检查条目是否通过 0-不通过，不能变配； 1-通过，可以变配 
     * @return Passed 检查条目是否通过 0-不通过，不能变配； 1-通过，可以变配
     */
    public Long getPassed() {
        return this.Passed;
    }

    /**
     * Set 检查条目是否通过 0-不通过，不能变配； 1-通过，可以变配
     * @param Passed 检查条目是否通过 0-不通过，不能变配； 1-通过，可以变配
     */
    public void setPassed(Long Passed) {
        this.Passed = Passed;
    }

    /**
     * Get 本条目变配是否对实例有影响 0-没有影响 1-有影响 
     * @return IsAffect 本条目变配是否对实例有影响 0-没有影响 1-有影响
     */
    public Long getIsAffect() {
        return this.IsAffect;
    }

    /**
     * Set 本条目变配是否对实例有影响 0-没有影响 1-有影响
     * @param IsAffect 本条目变配是否对实例有影响 0-没有影响 1-有影响
     */
    public void setIsAffect(Long IsAffect) {
        this.IsAffect = IsAffect;
    }

    /**
     * Get 有影响或者不通过的情况下的必要描述 
     * @return Msg 有影响或者不通过的情况下的必要描述
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 有影响或者不通过的情况下的必要描述
     * @param Msg 有影响或者不通过的情况下的必要描述
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 描述对应的代码 
     * @return MsgCode 描述对应的代码
     */
    public Long getMsgCode() {
        return this.MsgCode;
    }

    /**
     * Set 描述对应的代码
     * @param MsgCode 描述对应的代码
     */
    public void setMsgCode(Long MsgCode) {
        this.MsgCode = MsgCode;
    }

    public CheckItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckItem(CheckItem source) {
        if (source.CheckName != null) {
            this.CheckName = new String(source.CheckName);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.Passed != null) {
            this.Passed = new Long(source.Passed);
        }
        if (source.IsAffect != null) {
            this.IsAffect = new Long(source.IsAffect);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.MsgCode != null) {
            this.MsgCode = new Long(source.MsgCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckName", this.CheckName);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "Passed", this.Passed);
        this.setParamSimple(map, prefix + "IsAffect", this.IsAffect);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "MsgCode", this.MsgCode);

    }
}

