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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyRules extends AbstractModel {

    /**
    * <p>进程</p>
    */
    @SerializedName("Process")
    @Expose
    private CommandLine Process;

    /**
    * <p>父进程</p>
    */
    @SerializedName("PProcess")
    @Expose
    private CommandLine PProcess;

    /**
    * <p>祖先进程</p>
    */
    @SerializedName("AProcess")
    @Expose
    private CommandLine AProcess;

    /**
    * <p>目标文件路径（匹配类型=文件操作时有效）</p>
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * <p>动作列表（匹配类型=文件操作时有效，多选为或关系）：read-读 write-写 rename-重命名 delete-删除 truncate-清空内容</p>
    */
    @SerializedName("FileActions")
    @Expose
    private String [] FileActions;

    /**
     * Get <p>进程</p> 
     * @return Process <p>进程</p>
     */
    public CommandLine getProcess() {
        return this.Process;
    }

    /**
     * Set <p>进程</p>
     * @param Process <p>进程</p>
     */
    public void setProcess(CommandLine Process) {
        this.Process = Process;
    }

    /**
     * Get <p>父进程</p> 
     * @return PProcess <p>父进程</p>
     */
    public CommandLine getPProcess() {
        return this.PProcess;
    }

    /**
     * Set <p>父进程</p>
     * @param PProcess <p>父进程</p>
     */
    public void setPProcess(CommandLine PProcess) {
        this.PProcess = PProcess;
    }

    /**
     * Get <p>祖先进程</p> 
     * @return AProcess <p>祖先进程</p>
     */
    public CommandLine getAProcess() {
        return this.AProcess;
    }

    /**
     * Set <p>祖先进程</p>
     * @param AProcess <p>祖先进程</p>
     */
    public void setAProcess(CommandLine AProcess) {
        this.AProcess = AProcess;
    }

    /**
     * Get <p>目标文件路径（匹配类型=文件操作时有效）</p> 
     * @return FilePath <p>目标文件路径（匹配类型=文件操作时有效）</p>
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set <p>目标文件路径（匹配类型=文件操作时有效）</p>
     * @param FilePath <p>目标文件路径（匹配类型=文件操作时有效）</p>
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get <p>动作列表（匹配类型=文件操作时有效，多选为或关系）：read-读 write-写 rename-重命名 delete-删除 truncate-清空内容</p> 
     * @return FileActions <p>动作列表（匹配类型=文件操作时有效，多选为或关系）：read-读 write-写 rename-重命名 delete-删除 truncate-清空内容</p>
     */
    public String [] getFileActions() {
        return this.FileActions;
    }

    /**
     * Set <p>动作列表（匹配类型=文件操作时有效，多选为或关系）：read-读 write-写 rename-重命名 delete-删除 truncate-清空内容</p>
     * @param FileActions <p>动作列表（匹配类型=文件操作时有效，多选为或关系）：read-读 write-写 rename-重命名 delete-删除 truncate-清空内容</p>
     */
    public void setFileActions(String [] FileActions) {
        this.FileActions = FileActions;
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
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileActions != null) {
            this.FileActions = new String[source.FileActions.length];
            for (int i = 0; i < source.FileActions.length; i++) {
                this.FileActions[i] = new String(source.FileActions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Process.", this.Process);
        this.setParamObj(map, prefix + "PProcess.", this.PProcess);
        this.setParamObj(map, prefix + "AProcess.", this.AProcess);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamArraySimple(map, prefix + "FileActions.", this.FileActions);

    }
}

