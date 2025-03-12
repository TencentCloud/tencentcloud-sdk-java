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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSparkAppTaskRequest extends AbstractModel {

    /**
    * spark作业名
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * spark作业程序入参，以空格分隔；一般用于周期性调用使用
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * 任务来源信息
    */
    @SerializedName("SourceInfo")
    @Expose
    private KVPair [] SourceInfo;

    /**
     * Get spark作业名 
     * @return JobName spark作业名
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set spark作业名
     * @param JobName spark作业名
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get spark作业程序入参，以空格分隔；一般用于周期性调用使用 
     * @return CmdArgs spark作业程序入参，以空格分隔；一般用于周期性调用使用
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set spark作业程序入参，以空格分隔；一般用于周期性调用使用
     * @param CmdArgs spark作业程序入参，以空格分隔；一般用于周期性调用使用
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get 任务来源信息 
     * @return SourceInfo 任务来源信息
     */
    public KVPair [] getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set 任务来源信息
     * @param SourceInfo 任务来源信息
     */
    public void setSourceInfo(KVPair [] SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    public CreateSparkAppTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSparkAppTaskRequest(CreateSparkAppTaskRequest source) {
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.CmdArgs != null) {
            this.CmdArgs = new String(source.CmdArgs);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new KVPair[source.SourceInfo.length];
            for (int i = 0; i < source.SourceInfo.length; i++) {
                this.SourceInfo[i] = new KVPair(source.SourceInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "CmdArgs", this.CmdArgs);
        this.setParamArrayObj(map, prefix + "SourceInfo.", this.SourceInfo);

    }
}

