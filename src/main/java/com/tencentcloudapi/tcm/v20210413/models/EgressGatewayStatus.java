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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EgressGatewayStatus extends AbstractModel{

    /**
    * egress gateway的当前版本
    */
    @SerializedName("CurrentVersion")
    @Expose
    private String CurrentVersion;

    /**
    * egress gateway的目标版本
    */
    @SerializedName("DesiredVersion")
    @Expose
    private String DesiredVersion;

    /**
    * egress gateway的状态，取值：running，upgrading，rollbacking
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get egress gateway的当前版本 
     * @return CurrentVersion egress gateway的当前版本
     */
    public String getCurrentVersion() {
        return this.CurrentVersion;
    }

    /**
     * Set egress gateway的当前版本
     * @param CurrentVersion egress gateway的当前版本
     */
    public void setCurrentVersion(String CurrentVersion) {
        this.CurrentVersion = CurrentVersion;
    }

    /**
     * Get egress gateway的目标版本 
     * @return DesiredVersion egress gateway的目标版本
     */
    public String getDesiredVersion() {
        return this.DesiredVersion;
    }

    /**
     * Set egress gateway的目标版本
     * @param DesiredVersion egress gateway的目标版本
     */
    public void setDesiredVersion(String DesiredVersion) {
        this.DesiredVersion = DesiredVersion;
    }

    /**
     * Get egress gateway的状态，取值：running，upgrading，rollbacking 
     * @return State egress gateway的状态，取值：running，upgrading，rollbacking
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set egress gateway的状态，取值：running，upgrading，rollbacking
     * @param State egress gateway的状态，取值：running，upgrading，rollbacking
     */
    public void setState(String State) {
        this.State = State;
    }

    public EgressGatewayStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EgressGatewayStatus(EgressGatewayStatus source) {
        if (source.CurrentVersion != null) {
            this.CurrentVersion = new String(source.CurrentVersion);
        }
        if (source.DesiredVersion != null) {
            this.DesiredVersion = new String(source.DesiredVersion);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentVersion", this.CurrentVersion);
        this.setParamSimple(map, prefix + "DesiredVersion", this.DesiredVersion);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

