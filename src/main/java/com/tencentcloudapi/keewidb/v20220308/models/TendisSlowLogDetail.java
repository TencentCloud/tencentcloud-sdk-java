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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TendisSlowLogDetail extends AbstractModel {

    /**
    * 执行时间
    */
    @SerializedName("ExecuteTime")
    @Expose
    private String ExecuteTime;

    /**
    * 慢查询耗时（毫秒）
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 命令
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 详细命令行信息
    */
    @SerializedName("CommandLine")
    @Expose
    private String CommandLine;

    /**
    * 节点ID
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
     * Get 执行时间 
     * @return ExecuteTime 执行时间
     */
    public String getExecuteTime() {
        return this.ExecuteTime;
    }

    /**
     * Set 执行时间
     * @param ExecuteTime 执行时间
     */
    public void setExecuteTime(String ExecuteTime) {
        this.ExecuteTime = ExecuteTime;
    }

    /**
     * Get 慢查询耗时（毫秒） 
     * @return Duration 慢查询耗时（毫秒）
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 慢查询耗时（毫秒）
     * @param Duration 慢查询耗时（毫秒）
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 命令 
     * @return Command 命令
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 命令
     * @param Command 命令
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 详细命令行信息 
     * @return CommandLine 详细命令行信息
     */
    public String getCommandLine() {
        return this.CommandLine;
    }

    /**
     * Set 详细命令行信息
     * @param CommandLine 详细命令行信息
     */
    public void setCommandLine(String CommandLine) {
        this.CommandLine = CommandLine;
    }

    /**
     * Get 节点ID 
     * @return Node 节点ID
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set 节点ID
     * @param Node 节点ID
     */
    public void setNode(String Node) {
        this.Node = Node;
    }

    public TendisSlowLogDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TendisSlowLogDetail(TendisSlowLogDetail source) {
        if (source.ExecuteTime != null) {
            this.ExecuteTime = new String(source.ExecuteTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.CommandLine != null) {
            this.CommandLine = new String(source.CommandLine);
        }
        if (source.Node != null) {
            this.Node = new String(source.Node);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecuteTime", this.ExecuteTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "CommandLine", this.CommandLine);
        this.setParamSimple(map, prefix + "Node", this.Node);

    }
}

