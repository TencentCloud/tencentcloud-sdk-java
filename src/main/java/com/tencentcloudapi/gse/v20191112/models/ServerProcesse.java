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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerProcesse extends AbstractModel{

    /**
    * 并发执行数量，所有进程并发执行总数最小值1，最大值50
    */
    @SerializedName("ConcurrentExecutions")
    @Expose
    private Long ConcurrentExecutions;

    /**
    * 启动路径：Linux路径/local/game/ 或WIndows路径C:\game\，最小长度1，最大长度1024
    */
    @SerializedName("LaunchPath")
    @Expose
    private String LaunchPath;

    /**
    * 启动参数，最小长度0，最大长度1024
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
     * Get 并发执行数量，所有进程并发执行总数最小值1，最大值50 
     * @return ConcurrentExecutions 并发执行数量，所有进程并发执行总数最小值1，最大值50
     */
    public Long getConcurrentExecutions() {
        return this.ConcurrentExecutions;
    }

    /**
     * Set 并发执行数量，所有进程并发执行总数最小值1，最大值50
     * @param ConcurrentExecutions 并发执行数量，所有进程并发执行总数最小值1，最大值50
     */
    public void setConcurrentExecutions(Long ConcurrentExecutions) {
        this.ConcurrentExecutions = ConcurrentExecutions;
    }

    /**
     * Get 启动路径：Linux路径/local/game/ 或WIndows路径C:\game\，最小长度1，最大长度1024 
     * @return LaunchPath 启动路径：Linux路径/local/game/ 或WIndows路径C:\game\，最小长度1，最大长度1024
     */
    public String getLaunchPath() {
        return this.LaunchPath;
    }

    /**
     * Set 启动路径：Linux路径/local/game/ 或WIndows路径C:\game\，最小长度1，最大长度1024
     * @param LaunchPath 启动路径：Linux路径/local/game/ 或WIndows路径C:\game\，最小长度1，最大长度1024
     */
    public void setLaunchPath(String LaunchPath) {
        this.LaunchPath = LaunchPath;
    }

    /**
     * Get 启动参数，最小长度0，最大长度1024 
     * @return Parameters 启动参数，最小长度0，最大长度1024
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 启动参数，最小长度0，最大长度1024
     * @param Parameters 启动参数，最小长度0，最大长度1024
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    public ServerProcesse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerProcesse(ServerProcesse source) {
        if (source.ConcurrentExecutions != null) {
            this.ConcurrentExecutions = new Long(source.ConcurrentExecutions);
        }
        if (source.LaunchPath != null) {
            this.LaunchPath = new String(source.LaunchPath);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConcurrentExecutions", this.ConcurrentExecutions);
        this.setParamSimple(map, prefix + "LaunchPath", this.LaunchPath);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);

    }
}

