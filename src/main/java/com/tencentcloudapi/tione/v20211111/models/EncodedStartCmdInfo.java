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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EncodedStartCmdInfo extends AbstractModel {

    /**
    * 任务的启动命令，以base64格式输入，注意转换时需要完整输入{"StartCmd":"","PsStartCmd":"","WorkerStartCmd":""}
    */
    @SerializedName("StartCmdInfo")
    @Expose
    private String StartCmdInfo;

    /**
     * Get 任务的启动命令，以base64格式输入，注意转换时需要完整输入{"StartCmd":"","PsStartCmd":"","WorkerStartCmd":""} 
     * @return StartCmdInfo 任务的启动命令，以base64格式输入，注意转换时需要完整输入{"StartCmd":"","PsStartCmd":"","WorkerStartCmd":""}
     */
    public String getStartCmdInfo() {
        return this.StartCmdInfo;
    }

    /**
     * Set 任务的启动命令，以base64格式输入，注意转换时需要完整输入{"StartCmd":"","PsStartCmd":"","WorkerStartCmd":""}
     * @param StartCmdInfo 任务的启动命令，以base64格式输入，注意转换时需要完整输入{"StartCmd":"","PsStartCmd":"","WorkerStartCmd":""}
     */
    public void setStartCmdInfo(String StartCmdInfo) {
        this.StartCmdInfo = StartCmdInfo;
    }

    public EncodedStartCmdInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EncodedStartCmdInfo(EncodedStartCmdInfo source) {
        if (source.StartCmdInfo != null) {
            this.StartCmdInfo = new String(source.StartCmdInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartCmdInfo", this.StartCmdInfo);

    }
}

