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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyRules extends AbstractModel {

    /**
    * 进程
    */
    @SerializedName("Process")
    @Expose
    private CommandLine Process;

    /**
    * 父进程
    */
    @SerializedName("PProcess")
    @Expose
    private CommandLine PProcess;

    /**
    * 祖先进程
    */
    @SerializedName("AProcess")
    @Expose
    private CommandLine AProcess;

    /**
     * Get 进程 
     * @return Process 进程
     */
    public CommandLine getProcess() {
        return this.Process;
    }

    /**
     * Set 进程
     * @param Process 进程
     */
    public void setProcess(CommandLine Process) {
        this.Process = Process;
    }

    /**
     * Get 父进程 
     * @return PProcess 父进程
     */
    public CommandLine getPProcess() {
        return this.PProcess;
    }

    /**
     * Set 父进程
     * @param PProcess 父进程
     */
    public void setPProcess(CommandLine PProcess) {
        this.PProcess = PProcess;
    }

    /**
     * Get 祖先进程 
     * @return AProcess 祖先进程
     */
    public CommandLine getAProcess() {
        return this.AProcess;
    }

    /**
     * Set 祖先进程
     * @param AProcess 祖先进程
     */
    public void setAProcess(CommandLine AProcess) {
        this.AProcess = AProcess;
    }

    public PolicyRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyRules(PolicyRules source) {
        if (source.Process != null) {
            this.Process = new CommandLine(source.Process);
        }
        if (source.PProcess != null) {
            this.PProcess = new CommandLine(source.PProcess);
        }
        if (source.AProcess != null) {
            this.AProcess = new CommandLine(source.AProcess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Process.", this.Process);
        this.setParamObj(map, prefix + "PProcess.", this.PProcess);
        this.setParamObj(map, prefix + "AProcess.", this.AProcess);

    }
}

