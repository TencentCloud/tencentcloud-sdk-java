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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleContentCmdLine extends AbstractModel {

    /**
    * <p>进程命令行信息</p>
    */
    @SerializedName("Process")
    @Expose
    private RuleContentProcessInfo Process;

    /**
    * <p>父进程命令行信息</p>
    */
    @SerializedName("ParentProcess")
    @Expose
    private RuleContentProcessInfo ParentProcess;

    /**
    * <p>祖先进程命令行信息</p>
    */
    @SerializedName("AncestorProcess")
    @Expose
    private RuleContentProcessInfo AncestorProcess;

    /**
     * Get <p>进程命令行信息</p> 
     * @return Process <p>进程命令行信息</p>
     */
    public RuleContentProcessInfo getProcess() {
        return this.Process;
    }

    /**
     * Set <p>进程命令行信息</p>
     * @param Process <p>进程命令行信息</p>
     */
    public void setProcess(RuleContentProcessInfo Process) {
        this.Process = Process;
    }

    /**
     * Get <p>父进程命令行信息</p> 
     * @return ParentProcess <p>父进程命令行信息</p>
     */
    public RuleContentProcessInfo getParentProcess() {
        return this.ParentProcess;
    }

    /**
     * Set <p>父进程命令行信息</p>
     * @param ParentProcess <p>父进程命令行信息</p>
     */
    public void setParentProcess(RuleContentProcessInfo ParentProcess) {
        this.ParentProcess = ParentProcess;
    }

    /**
     * Get <p>祖先进程命令行信息</p> 
     * @return AncestorProcess <p>祖先进程命令行信息</p>
     */
    public RuleContentProcessInfo getAncestorProcess() {
        return this.AncestorProcess;
    }

    /**
     * Set <p>祖先进程命令行信息</p>
     * @param AncestorProcess <p>祖先进程命令行信息</p>
     */
    public void setAncestorProcess(RuleContentProcessInfo AncestorProcess) {
        this.AncestorProcess = AncestorProcess;
    }

    public RuleContentCmdLine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleContentCmdLine(RuleContentCmdLine source) {
        if (source.Process != null) {
            this.Process = new RuleContentProcessInfo(source.Process);
        }
        if (source.ParentProcess != null) {
            this.ParentProcess = new RuleContentProcessInfo(source.ParentProcess);
        }
        if (source.AncestorProcess != null) {
            this.AncestorProcess = new RuleContentProcessInfo(source.AncestorProcess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Process.", this.Process);
        this.setParamObj(map, prefix + "ParentProcess.", this.ParentProcess);
        this.setParamObj(map, prefix + "AncestorProcess.", this.AncestorProcess);

    }
}

