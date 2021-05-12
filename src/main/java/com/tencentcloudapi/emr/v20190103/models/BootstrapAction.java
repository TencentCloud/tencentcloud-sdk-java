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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BootstrapAction extends AbstractModel{

    /**
    * 脚本位置，支持cos上的文件，且只支持https协议。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 执行时间。
resourceAfter 表示在机器资源申请成功后执行。
clusterBefore 表示在集群初始化前执行。
clusterAfter 表示在集群初始化后执行。
    */
    @SerializedName("WhenRun")
    @Expose
    private String WhenRun;

    /**
    * 脚本参数
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
     * Get 脚本位置，支持cos上的文件，且只支持https协议。 
     * @return Path 脚本位置，支持cos上的文件，且只支持https协议。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 脚本位置，支持cos上的文件，且只支持https协议。
     * @param Path 脚本位置，支持cos上的文件，且只支持https协议。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 执行时间。
resourceAfter 表示在机器资源申请成功后执行。
clusterBefore 表示在集群初始化前执行。
clusterAfter 表示在集群初始化后执行。 
     * @return WhenRun 执行时间。
resourceAfter 表示在机器资源申请成功后执行。
clusterBefore 表示在集群初始化前执行。
clusterAfter 表示在集群初始化后执行。
     */
    public String getWhenRun() {
        return this.WhenRun;
    }

    /**
     * Set 执行时间。
resourceAfter 表示在机器资源申请成功后执行。
clusterBefore 表示在集群初始化前执行。
clusterAfter 表示在集群初始化后执行。
     * @param WhenRun 执行时间。
resourceAfter 表示在机器资源申请成功后执行。
clusterBefore 表示在集群初始化前执行。
clusterAfter 表示在集群初始化后执行。
     */
    public void setWhenRun(String WhenRun) {
        this.WhenRun = WhenRun;
    }

    /**
     * Get 脚本参数 
     * @return Args 脚本参数
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * Set 脚本参数
     * @param Args 脚本参数
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    public BootstrapAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BootstrapAction(BootstrapAction source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.WhenRun != null) {
            this.WhenRun = new String(source.WhenRun);
        }
        if (source.Args != null) {
            this.Args = new String[source.Args.length];
            for (int i = 0; i < source.Args.length; i++) {
                this.Args[i] = new String(source.Args[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "WhenRun", this.WhenRun);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);

    }
}

