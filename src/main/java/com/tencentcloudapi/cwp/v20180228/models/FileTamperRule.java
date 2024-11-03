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

public class FileTamperRule extends AbstractModel {

    /**
    * 进程路径
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * 被访问文件路径
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 执行动作 跳过：skip，告警：alert
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 监控行为
<li>read 读取文件</li>
<li>write 修改文件</li>
<li>read-write 读取修改文件</li>
    */
    @SerializedName("FileAction")
    @Expose
    private String FileAction;

    /**
     * Get 进程路径 
     * @return ProcessPath 进程路径
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set 进程路径
     * @param ProcessPath 进程路径
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get 被访问文件路径 
     * @return Target 被访问文件路径
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 被访问文件路径
     * @param Target 被访问文件路径
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 执行动作 跳过：skip，告警：alert 
     * @return Action 执行动作 跳过：skip，告警：alert
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作 跳过：skip，告警：alert
     * @param Action 执行动作 跳过：skip，告警：alert
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 监控行为
<li>read 读取文件</li>
<li>write 修改文件</li>
<li>read-write 读取修改文件</li> 
     * @return FileAction 监控行为
<li>read 读取文件</li>
<li>write 修改文件</li>
<li>read-write 读取修改文件</li>
     */
    public String getFileAction() {
        return this.FileAction;
    }

    /**
     * Set 监控行为
<li>read 读取文件</li>
<li>write 修改文件</li>
<li>read-write 读取修改文件</li>
     * @param FileAction 监控行为
<li>read 读取文件</li>
<li>write 修改文件</li>
<li>read-write 读取修改文件</li>
     */
    public void setFileAction(String FileAction) {
        this.FileAction = FileAction;
    }

    public FileTamperRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileTamperRule(FileTamperRule source) {
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.FileAction != null) {
            this.FileAction = new String(source.FileAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "FileAction", this.FileAction);

    }
}

