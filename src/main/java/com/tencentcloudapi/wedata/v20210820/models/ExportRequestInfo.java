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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportRequestInfo extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 需要导出的文件列表
    */
    @SerializedName("FileList")
    @Expose
    private String [] FileList;

    /**
    * cos桶名
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * cos地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 需要导出的文件列表 
     * @return FileList 需要导出的文件列表
     */
    public String [] getFileList() {
        return this.FileList;
    }

    /**
     * Set 需要导出的文件列表
     * @param FileList 需要导出的文件列表
     */
    public void setFileList(String [] FileList) {
        this.FileList = FileList;
    }

    /**
     * Get cos桶名 
     * @return BucketName cos桶名
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set cos桶名
     * @param BucketName cos桶名
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get cos地域 
     * @return Region cos地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cos地域
     * @param Region cos地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public ExportRequestInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportRequestInfo(ExportRequestInfo source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FileList != null) {
            this.FileList = new String[source.FileList.length];
            for (int i = 0; i < source.FileList.length; i++) {
                this.FileList[i] = new String(source.FileList[i]);
            }
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "FileList.", this.FileList);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

