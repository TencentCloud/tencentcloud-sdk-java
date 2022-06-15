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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyJobRequest extends AbstractModel{

    /**
    * 作业Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 作业名称，支持长度小于50的中文/英文/数字/”-”/”_”/”.”，不能重名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 拖拽文件需传入此参数
    */
    @SerializedName("TargetFolderId")
    @Expose
    private String TargetFolderId;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 作业Id 
     * @return JobId 作业Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业Id
     * @param JobId 作业Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 作业名称，支持长度小于50的中文/英文/数字/”-”/”_”/”.”，不能重名 
     * @return Name 作业名称，支持长度小于50的中文/英文/数字/”-”/”_”/”.”，不能重名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 作业名称，支持长度小于50的中文/英文/数字/”-”/”_”/”.”，不能重名
     * @param Name 作业名称，支持长度小于50的中文/英文/数字/”-”/”_”/”.”，不能重名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Remark 描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 描述
     * @param Remark 描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 拖拽文件需传入此参数 
     * @return TargetFolderId 拖拽文件需传入此参数
     */
    public String getTargetFolderId() {
        return this.TargetFolderId;
    }

    /**
     * Set 拖拽文件需传入此参数
     * @param TargetFolderId 拖拽文件需传入此参数
     */
    public void setTargetFolderId(String TargetFolderId) {
        this.TargetFolderId = TargetFolderId;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public ModifyJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyJobRequest(ModifyJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TargetFolderId != null) {
            this.TargetFolderId = new String(source.TargetFolderId);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TargetFolderId", this.TargetFolderId);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

