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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScriptRequestInfo extends AbstractModel{

    /**
    * 脚本路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 脚本版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 操作类型
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 额外信息
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * 桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 所属地区
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 文件扩展类型
    */
    @SerializedName("FileExtensionType")
    @Expose
    private String FileExtensionType;

    /**
     * Get 脚本路径 
     * @return FilePath 脚本路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 脚本路径
     * @param FilePath 脚本路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

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
     * Get 脚本版本 
     * @return Version 脚本版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 脚本版本
     * @param Version 脚本版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 操作类型 
     * @return Operation 操作类型
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型
     * @param Operation 操作类型
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 额外信息 
     * @return ExtraInfo 额外信息
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 额外信息
     * @param ExtraInfo 额外信息
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 桶名称 
     * @return BucketName 桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 桶名称
     * @param BucketName 桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 所属地区 
     * @return Region 所属地区
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所属地区
     * @param Region 所属地区
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 文件扩展类型 
     * @return FileExtensionType 文件扩展类型
     */
    public String getFileExtensionType() {
        return this.FileExtensionType;
    }

    /**
     * Set 文件扩展类型
     * @param FileExtensionType 文件扩展类型
     */
    public void setFileExtensionType(String FileExtensionType) {
        this.FileExtensionType = FileExtensionType;
    }

    public ScriptRequestInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScriptRequestInfo(ScriptRequestInfo source) {
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.FileExtensionType != null) {
            this.FileExtensionType = new String(source.FileExtensionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "FileExtensionType", this.FileExtensionType);

    }
}

