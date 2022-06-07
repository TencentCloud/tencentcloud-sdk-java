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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartCmdInfo extends AbstractModel{

    /**
    * 启动命令
    */
    @SerializedName("StartCmd")
    @Expose
    private String StartCmd;

    /**
    * ps启动命令
    */
    @SerializedName("PsStartCmd")
    @Expose
    private String PsStartCmd;

    /**
    * worker启动命令
    */
    @SerializedName("WorkerStartCmd")
    @Expose
    private String WorkerStartCmd;

    /**
     * Get 启动命令 
     * @return StartCmd 启动命令
     */
    public String getStartCmd() {
        return this.StartCmd;
    }

    /**
     * Set 启动命令
     * @param StartCmd 启动命令
     */
    public void setStartCmd(String StartCmd) {
        this.StartCmd = StartCmd;
    }

    /**
     * Get ps启动命令 
     * @return PsStartCmd ps启动命令
     */
    public String getPsStartCmd() {
        return this.PsStartCmd;
    }

    /**
     * Set ps启动命令
     * @param PsStartCmd ps启动命令
     */
    public void setPsStartCmd(String PsStartCmd) {
        this.PsStartCmd = PsStartCmd;
    }

    /**
     * Get worker启动命令 
     * @return WorkerStartCmd worker启动命令
     */
    public String getWorkerStartCmd() {
        return this.WorkerStartCmd;
    }

    /**
     * Set worker启动命令
     * @param WorkerStartCmd worker启动命令
     */
    public void setWorkerStartCmd(String WorkerStartCmd) {
        this.WorkerStartCmd = WorkerStartCmd;
    }

    public StartCmdInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartCmdInfo(StartCmdInfo source) {
        if (source.StartCmd != null) {
            this.StartCmd = new String(source.StartCmd);
        }
        if (source.PsStartCmd != null) {
            this.PsStartCmd = new String(source.PsStartCmd);
        }
        if (source.WorkerStartCmd != null) {
            this.WorkerStartCmd = new String(source.WorkerStartCmd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartCmd", this.StartCmd);
        this.setParamSimple(map, prefix + "PsStartCmd", this.PsStartCmd);
        this.setParamSimple(map, prefix + "WorkerStartCmd", this.WorkerStartCmd);

    }
}

