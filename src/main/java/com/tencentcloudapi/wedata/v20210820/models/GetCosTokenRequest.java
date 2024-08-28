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

public class GetCosTokenRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 请求域名
    */
    @SerializedName("OriginDomain")
    @Expose
    private String OriginDomain;

    /**
    * 是否需要跨域
    */
    @SerializedName("CrossFlag")
    @Expose
    private Boolean CrossFlag;

    /**
    * 桶名
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 远程地址
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

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
     * Get 请求域名 
     * @return OriginDomain 请求域名
     */
    public String getOriginDomain() {
        return this.OriginDomain;
    }

    /**
     * Set 请求域名
     * @param OriginDomain 请求域名
     */
    public void setOriginDomain(String OriginDomain) {
        this.OriginDomain = OriginDomain;
    }

    /**
     * Get 是否需要跨域 
     * @return CrossFlag 是否需要跨域
     */
    public Boolean getCrossFlag() {
        return this.CrossFlag;
    }

    /**
     * Set 是否需要跨域
     * @param CrossFlag 是否需要跨域
     */
    public void setCrossFlag(Boolean CrossFlag) {
        this.CrossFlag = CrossFlag;
    }

    /**
     * Get 桶名 
     * @return BucketName 桶名
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 桶名
     * @param BucketName 桶名
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 远程地址 
     * @return RemotePath 远程地址
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set 远程地址
     * @param RemotePath 远程地址
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    public GetCosTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCosTokenRequest(GetCosTokenRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.OriginDomain != null) {
            this.OriginDomain = new String(source.OriginDomain);
        }
        if (source.CrossFlag != null) {
            this.CrossFlag = new Boolean(source.CrossFlag);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "OriginDomain", this.OriginDomain);
        this.setParamSimple(map, prefix + "CrossFlag", this.CrossFlag);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);

    }
}

