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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangePwdTaskDetail extends AbstractModel {

    /**
    * 资产信息
    */
    @SerializedName("Device")
    @Expose
    private Device Device;

    /**
    * 资产账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 上次改密结果。0-未改密  1-改密成功 2-改密失败,3-改密中，4-改密超时
    */
    @SerializedName("LastChangeStatus")
    @Expose
    private Long LastChangeStatus;

    /**
    * 改密任务状态，0-待执行，1-执行完成，2-执行失败，3-执行中，4-执行超时
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
     * Get 资产信息 
     * @return Device 资产信息
     */
    public Device getDevice() {
        return this.Device;
    }

    /**
     * Set 资产信息
     * @param Device 资产信息
     */
    public void setDevice(Device Device) {
        this.Device = Device;
    }

    /**
     * Get 资产账号 
     * @return Account 资产账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 资产账号
     * @param Account 资产账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 上次改密结果。0-未改密  1-改密成功 2-改密失败,3-改密中，4-改密超时 
     * @return LastChangeStatus 上次改密结果。0-未改密  1-改密成功 2-改密失败,3-改密中，4-改密超时
     */
    public Long getLastChangeStatus() {
        return this.LastChangeStatus;
    }

    /**
     * Set 上次改密结果。0-未改密  1-改密成功 2-改密失败,3-改密中，4-改密超时
     * @param LastChangeStatus 上次改密结果。0-未改密  1-改密成功 2-改密失败,3-改密中，4-改密超时
     */
    public void setLastChangeStatus(Long LastChangeStatus) {
        this.LastChangeStatus = LastChangeStatus;
    }

    /**
     * Get 改密任务状态，0-待执行，1-执行完成，2-执行失败，3-执行中，4-执行超时 
     * @return TaskStatus 改密任务状态，0-待执行，1-执行完成，2-执行失败，3-执行中，4-执行超时
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 改密任务状态，0-待执行，1-执行完成，2-执行失败，3-执行中，4-执行超时
     * @param TaskStatus 改密任务状态，0-待执行，1-执行完成，2-执行失败，3-执行中，4-执行超时
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public ChangePwdTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangePwdTaskDetail(ChangePwdTaskDetail source) {
        if (source.Device != null) {
            this.Device = new Device(source.Device);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.LastChangeStatus != null) {
            this.LastChangeStatus = new Long(source.LastChangeStatus);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Device.", this.Device);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "LastChangeStatus", this.LastChangeStatus);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

