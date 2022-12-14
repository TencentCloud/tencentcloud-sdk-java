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

public class ScriptBootstrapActionConfig extends AbstractModel{

    /**
    * 脚本的cos地址，参照格式：https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh查询cos存储桶列表：[存储桶列表](https://console.cloud.tencent.com/cos/bucket)
    */
    @SerializedName("CosFileURI")
    @Expose
    private String CosFileURI;

    /**
    * 引导脚步执行时机范围
<li>resourceAfter：节点初始化后</li>
<li>clusterAfter：集群启动后</li>
<li>clusterBefore：集群启动前</li>
    */
    @SerializedName("ExecutionMoment")
    @Expose
    private String ExecutionMoment;

    /**
    * 执行脚本参数，参数格式请遵循标准Shell规范
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * 脚本文件名
    */
    @SerializedName("CosFileName")
    @Expose
    private String CosFileName;

    /**
     * Get 脚本的cos地址，参照格式：https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh查询cos存储桶列表：[存储桶列表](https://console.cloud.tencent.com/cos/bucket) 
     * @return CosFileURI 脚本的cos地址，参照格式：https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh查询cos存储桶列表：[存储桶列表](https://console.cloud.tencent.com/cos/bucket)
     */
    public String getCosFileURI() {
        return this.CosFileURI;
    }

    /**
     * Set 脚本的cos地址，参照格式：https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh查询cos存储桶列表：[存储桶列表](https://console.cloud.tencent.com/cos/bucket)
     * @param CosFileURI 脚本的cos地址，参照格式：https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh查询cos存储桶列表：[存储桶列表](https://console.cloud.tencent.com/cos/bucket)
     */
    public void setCosFileURI(String CosFileURI) {
        this.CosFileURI = CosFileURI;
    }

    /**
     * Get 引导脚步执行时机范围
<li>resourceAfter：节点初始化后</li>
<li>clusterAfter：集群启动后</li>
<li>clusterBefore：集群启动前</li> 
     * @return ExecutionMoment 引导脚步执行时机范围
<li>resourceAfter：节点初始化后</li>
<li>clusterAfter：集群启动后</li>
<li>clusterBefore：集群启动前</li>
     */
    public String getExecutionMoment() {
        return this.ExecutionMoment;
    }

    /**
     * Set 引导脚步执行时机范围
<li>resourceAfter：节点初始化后</li>
<li>clusterAfter：集群启动后</li>
<li>clusterBefore：集群启动前</li>
     * @param ExecutionMoment 引导脚步执行时机范围
<li>resourceAfter：节点初始化后</li>
<li>clusterAfter：集群启动后</li>
<li>clusterBefore：集群启动前</li>
     */
    public void setExecutionMoment(String ExecutionMoment) {
        this.ExecutionMoment = ExecutionMoment;
    }

    /**
     * Get 执行脚本参数，参数格式请遵循标准Shell规范 
     * @return Args 执行脚本参数，参数格式请遵循标准Shell规范
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * Set 执行脚本参数，参数格式请遵循标准Shell规范
     * @param Args 执行脚本参数，参数格式请遵循标准Shell规范
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * Get 脚本文件名 
     * @return CosFileName 脚本文件名
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set 脚本文件名
     * @param CosFileName 脚本文件名
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    public ScriptBootstrapActionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScriptBootstrapActionConfig(ScriptBootstrapActionConfig source) {
        if (source.CosFileURI != null) {
            this.CosFileURI = new String(source.CosFileURI);
        }
        if (source.ExecutionMoment != null) {
            this.ExecutionMoment = new String(source.ExecutionMoment);
        }
        if (source.Args != null) {
            this.Args = new String[source.Args.length];
            for (int i = 0; i < source.Args.length; i++) {
                this.Args[i] = new String(source.Args[i]);
            }
        }
        if (source.CosFileName != null) {
            this.CosFileName = new String(source.CosFileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosFileURI", this.CosFileURI);
        this.setParamSimple(map, prefix + "ExecutionMoment", this.ExecutionMoment);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);

    }
}

