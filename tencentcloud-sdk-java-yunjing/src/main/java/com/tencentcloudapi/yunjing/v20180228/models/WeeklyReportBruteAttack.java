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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WeeklyReportBruteAttack extends AbstractModel{

    /**
    * 主机IP。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 被破解用户名。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 源IP。
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 尝试次数。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 攻击时间。
    */
    @SerializedName("AttackTime")
    @Expose
    private String AttackTime;

    /**
     * Get 主机IP。 
     * @return MachineIp 主机IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机IP。
     * @param MachineIp 主机IP。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 被破解用户名。 
     * @return Username 被破解用户名。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 被破解用户名。
     * @param Username 被破解用户名。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 源IP。 
     * @return SrcIp 源IP。
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 源IP。
     * @param SrcIp 源IP。
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 尝试次数。 
     * @return Count 尝试次数。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 尝试次数。
     * @param Count 尝试次数。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 攻击时间。 
     * @return AttackTime 攻击时间。
     */
    public String getAttackTime() {
        return this.AttackTime;
    }

    /**
     * Set 攻击时间。
     * @param AttackTime 攻击时间。
     */
    public void setAttackTime(String AttackTime) {
        this.AttackTime = AttackTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AttackTime", this.AttackTime);

    }
}

