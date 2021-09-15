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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowByFilesRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 流程创建信息
    */
    @SerializedName("FlowInfo")
    @Expose
    private FlowInfo FlowInfo;

    /**
    * 文件资源列表 (支持多文件)
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 自定义流程id
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 流程创建信息 
     * @return FlowInfo 流程创建信息
     */
    public FlowInfo getFlowInfo() {
        return this.FlowInfo;
    }

    /**
     * Set 流程创建信息
     * @param FlowInfo 流程创建信息
     */
    public void setFlowInfo(FlowInfo FlowInfo) {
        this.FlowInfo = FlowInfo;
    }

    /**
     * Get 文件资源列表 (支持多文件) 
     * @return FileIds 文件资源列表 (支持多文件)
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 文件资源列表 (支持多文件)
     * @param FileIds 文件资源列表 (支持多文件)
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get 自定义流程id 
     * @return CustomId 自定义流程id
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set 自定义流程id
     * @param CustomId 自定义流程id
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    public CreateFlowByFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowByFilesRequest(CreateFlowByFilesRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.FlowInfo != null) {
            this.FlowInfo = new FlowInfo(source.FlowInfo);
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.CustomId != null) {
            this.CustomId = new String(source.CustomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamObj(map, prefix + "FlowInfo.", this.FlowInfo);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "CustomId", this.CustomId);

    }
}

