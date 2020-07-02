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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDownloadInfoRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 程序包ID
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 程序包仓库ID
    */
    @SerializedName("RepositoryId")
    @Expose
    private String RepositoryId;

    /**
    * 程序包仓库类型
    */
    @SerializedName("RepositoryType")
    @Expose
    private String RepositoryType;

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 程序包ID 
     * @return PkgId 程序包ID
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 程序包ID
     * @param PkgId 程序包ID
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 程序包仓库ID 
     * @return RepositoryId 程序包仓库ID
     */
    public String getRepositoryId() {
        return this.RepositoryId;
    }

    /**
     * Set 程序包仓库ID
     * @param RepositoryId 程序包仓库ID
     */
    public void setRepositoryId(String RepositoryId) {
        this.RepositoryId = RepositoryId;
    }

    /**
     * Get 程序包仓库类型 
     * @return RepositoryType 程序包仓库类型
     */
    public String getRepositoryType() {
        return this.RepositoryType;
    }

    /**
     * Set 程序包仓库类型
     * @param RepositoryType 程序包仓库类型
     */
    public void setRepositoryType(String RepositoryType) {
        this.RepositoryType = RepositoryType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "RepositoryId", this.RepositoryId);
        this.setParamSimple(map, prefix + "RepositoryType", this.RepositoryType);

    }
}

