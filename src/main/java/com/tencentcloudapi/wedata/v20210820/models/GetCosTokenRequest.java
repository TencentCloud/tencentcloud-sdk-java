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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCosTokenRequest extends AbstractModel {

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>请求域名</p>
    */
    @SerializedName("OriginDomain")
    @Expose
    private String OriginDomain;

    /**
    * <p>是否需要跨域</p>
    */
    @SerializedName("CrossFlag")
    @Expose
    private Boolean CrossFlag;

    /**
    * <p>桶名</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>远程地址</p>
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * <p>地域</p>
    */
    @SerializedName("RemoteRegion")
    @Expose
    private String RemoteRegion;

    /**
     * Get <p>项目id</p> 
     * @return ProjectId <p>项目id</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectId <p>项目id</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>请求域名</p> 
     * @return OriginDomain <p>请求域名</p>
     */
    public String getOriginDomain() {
        return this.OriginDomain;
    }

    /**
     * Set <p>请求域名</p>
     * @param OriginDomain <p>请求域名</p>
     */
    public void setOriginDomain(String OriginDomain) {
        this.OriginDomain = OriginDomain;
    }

    /**
     * Get <p>是否需要跨域</p> 
     * @return CrossFlag <p>是否需要跨域</p>
     */
    public Boolean getCrossFlag() {
        return this.CrossFlag;
    }

    /**
     * Set <p>是否需要跨域</p>
     * @param CrossFlag <p>是否需要跨域</p>
     */
    public void setCrossFlag(Boolean CrossFlag) {
        this.CrossFlag = CrossFlag;
    }

    /**
     * Get <p>桶名</p> 
     * @return BucketName <p>桶名</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>桶名</p>
     * @param BucketName <p>桶名</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>远程地址</p> 
     * @return RemotePath <p>远程地址</p>
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set <p>远程地址</p>
     * @param RemotePath <p>远程地址</p>
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get <p>地域</p> 
     * @return RemoteRegion <p>地域</p>
     */
    public String getRemoteRegion() {
        return this.RemoteRegion;
    }

    /**
     * Set <p>地域</p>
     * @param RemoteRegion <p>地域</p>
     */
    public void setRemoteRegion(String RemoteRegion) {
        this.RemoteRegion = RemoteRegion;
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
        if (source.RemoteRegion != null) {
            this.RemoteRegion = new String(source.RemoteRegion);
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
        this.setParamSimple(map, prefix + "RemoteRegion", this.RemoteRegion);

    }
}

