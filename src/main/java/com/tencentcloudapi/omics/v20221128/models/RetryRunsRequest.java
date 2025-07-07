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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryRunsRequest extends AbstractModel {

    /**
    * 项目ID。（不填使用指定地域下的默认项目）
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 需要重试的任务批次ID。
    */
    @SerializedName("RunGroupId")
    @Expose
    private String RunGroupId;

    /**
    * 需要重试的任务UUID。
    */
    @SerializedName("RunUuids")
    @Expose
    private String [] RunUuids;

    /**
    * WDL运行选项，不填使用被重试的任务批次运行选项。
    */
    @SerializedName("WDLOption")
    @Expose
    private RunOption WDLOption;

    /**
    * Nextflow运行选项，不填使用被重试的任务批次运行选项。
    */
    @SerializedName("NFOption")
    @Expose
    private NFOption NFOption;

    /**
     * Get 项目ID。（不填使用指定地域下的默认项目） 
     * @return ProjectId 项目ID。（不填使用指定地域下的默认项目）
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。（不填使用指定地域下的默认项目）
     * @param ProjectId 项目ID。（不填使用指定地域下的默认项目）
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 需要重试的任务批次ID。 
     * @return RunGroupId 需要重试的任务批次ID。
     */
    public String getRunGroupId() {
        return this.RunGroupId;
    }

    /**
     * Set 需要重试的任务批次ID。
     * @param RunGroupId 需要重试的任务批次ID。
     */
    public void setRunGroupId(String RunGroupId) {
        this.RunGroupId = RunGroupId;
    }

    /**
     * Get 需要重试的任务UUID。 
     * @return RunUuids 需要重试的任务UUID。
     */
    public String [] getRunUuids() {
        return this.RunUuids;
    }

    /**
     * Set 需要重试的任务UUID。
     * @param RunUuids 需要重试的任务UUID。
     */
    public void setRunUuids(String [] RunUuids) {
        this.RunUuids = RunUuids;
    }

    /**
     * Get WDL运行选项，不填使用被重试的任务批次运行选项。 
     * @return WDLOption WDL运行选项，不填使用被重试的任务批次运行选项。
     */
    public RunOption getWDLOption() {
        return this.WDLOption;
    }

    /**
     * Set WDL运行选项，不填使用被重试的任务批次运行选项。
     * @param WDLOption WDL运行选项，不填使用被重试的任务批次运行选项。
     */
    public void setWDLOption(RunOption WDLOption) {
        this.WDLOption = WDLOption;
    }

    /**
     * Get Nextflow运行选项，不填使用被重试的任务批次运行选项。 
     * @return NFOption Nextflow运行选项，不填使用被重试的任务批次运行选项。
     */
    public NFOption getNFOption() {
        return this.NFOption;
    }

    /**
     * Set Nextflow运行选项，不填使用被重试的任务批次运行选项。
     * @param NFOption Nextflow运行选项，不填使用被重试的任务批次运行选项。
     */
    public void setNFOption(NFOption NFOption) {
        this.NFOption = NFOption;
    }

    public RetryRunsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryRunsRequest(RetryRunsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RunGroupId != null) {
            this.RunGroupId = new String(source.RunGroupId);
        }
        if (source.RunUuids != null) {
            this.RunUuids = new String[source.RunUuids.length];
            for (int i = 0; i < source.RunUuids.length; i++) {
                this.RunUuids[i] = new String(source.RunUuids[i]);
            }
        }
        if (source.WDLOption != null) {
            this.WDLOption = new RunOption(source.WDLOption);
        }
        if (source.NFOption != null) {
            this.NFOption = new NFOption(source.NFOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RunGroupId", this.RunGroupId);
        this.setParamArraySimple(map, prefix + "RunUuids.", this.RunUuids);
        this.setParamObj(map, prefix + "WDLOption.", this.WDLOption);
        this.setParamObj(map, prefix + "NFOption.", this.NFOption);

    }
}

