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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCertificateProjectRequest extends AbstractModel{

    /**
    * 需要修改所属项目的证书 ID 集合，最多100个证书。
    */
    @SerializedName("CertificateIdList")
    @Expose
    private String [] CertificateIdList;

    /**
    * 项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get 需要修改所属项目的证书 ID 集合，最多100个证书。 
     * @return CertificateIdList 需要修改所属项目的证书 ID 集合，最多100个证书。
     */
    public String [] getCertificateIdList() {
        return this.CertificateIdList;
    }

    /**
     * Set 需要修改所属项目的证书 ID 集合，最多100个证书。
     * @param CertificateIdList 需要修改所属项目的证书 ID 集合，最多100个证书。
     */
    public void setCertificateIdList(String [] CertificateIdList) {
        this.CertificateIdList = CertificateIdList;
    }

    /**
     * Get 项目 ID。 
     * @return ProjectId 项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
     * @param ProjectId 项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CertificateIdList.", this.CertificateIdList);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

