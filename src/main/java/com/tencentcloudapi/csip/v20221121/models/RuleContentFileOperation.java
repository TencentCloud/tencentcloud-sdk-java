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

public class RuleContentFileOperation extends AbstractModel {

    /**
    * <p>当前进程命令行信息（可选，未配置时该维度不参与匹配）</p>
    */
    @SerializedName("Process")
    @Expose
    private RuleContentProcessInfo Process;

    /**
    * <p>父进程命令行信息（可选，未配置时该维度不参与匹配）</p>
    */
    @SerializedName("ParentProcess")
    @Expose
    private RuleContentProcessInfo ParentProcess;

    /**
    * <p>目标文件路径（正则）</p>
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * <p>动作列表（多选为或关系）：read-读 write-写 rename-重命名 delete-删除 truncate-清空内容</p>
    */
    @SerializedName("FileActions")
    @Expose
    private String [] FileActions;

    /**
     * Get <p>当前进程命令行信息（可选，未配置时该维度不参与匹配）</p> 
     * @return Process <p>当前进程命令行信息（可选，未配置时该维度不参与匹配）</p>
     */
    public RuleContentProcessInfo getProcess() {
        return this.Process;
    }

    /**
     * Set <p>当前进程命令行信息（可选，未配置时该维度不参与匹配）</p>
     * @param Process <p>当前进程命令行信息（可选，未配置时该维度不参与匹配）</p>
     */
    public void setProcess(RuleContentProcessInfo Process) {
        this.Process = Process;
    }

    /**
     * Get <p>父进程命令行信息（可选，未配置时该维度不参与匹配）</p> 
     * @return ParentProcess <p>父进程命令行信息（可选，未配置时该维度不参与匹配）</p>
     */
    public RuleContentProcessInfo getParentProcess() {
        return this.ParentProcess;
    }

    /**
     * Set <p>父进程命令行信息（可选，未配置时该维度不参与匹配）</p>
     * @param ParentProcess <p>父进程命令行信息（可选，未配置时该维度不参与匹配）</p>
     */
    public void setParentProcess(RuleContentProcessInfo ParentProcess) {
        this.ParentProcess = ParentProcess;
    }

    /**
     * Get <p>目标文件路径（正则）</p> 
     * @return FilePath <p>目标文件路径（正则）</p>
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set <p>目标文件路径（正则）</p>
     * @param FilePath <p>目标文件路径（正则）</p>
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get <p>动作列表（多选为或关系）：read-读 write-写 rename-重命名 delete-删除 truncate-清空内容</p> 
     * @return FileActions <p>动作列表（多选为或关系）：read-读 write-写 rename-重命名 delete-删除 truncate-清空内容</p>
     */
    public String [] getFileActions() {
        return this.FileActions;
    }

    /**
     * Set <p>动作列表（多选为或关系）：read-读 write-写 rename-重命名 delete-删除 truncate-清空内容</p>
     * @param FileActions <p>动作列表（多选为或关系）：read-读 write-写 rename-重命名 delete-删除 truncate-清空内容</p>
     */
    public void setFileActions(String [] FileActions) {
        this.FileActions = FileActions;
    }

    public RuleContentFileOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleContentFileOperation(RuleContentFileOperation source) {
        if (source.Process != null) {
            this.Process = new RuleContentProcessInfo(source.Process);
        }
        if (source.ParentProcess != null) {
            this.ParentProcess = new RuleContentProcessInfo(source.ParentProcess);
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
        this.setParamObj(map, prefix + "ParentProcess.", this.ParentProcess);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamArraySimple(map, prefix + "FileActions.", this.FileActions);

    }
}

