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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosUploadInfo extends AbstractModel {

    /**
    * 程序包ID
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 桶
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 目标地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 存储路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 鉴权信息
    */
    @SerializedName("Credentials")
    @Expose
    private CosCredentials Credentials;

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
     * Get 桶 
     * @return Bucket 桶
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 桶
     * @param Bucket 桶
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 目标地域 
     * @return Region 目标地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 目标地域
     * @param Region 目标地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 存储路径 
     * @return Path 存储路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 存储路径
     * @param Path 存储路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 鉴权信息 
     * @return Credentials 鉴权信息
     */
    public CosCredentials getCredentials() {
        return this.Credentials;
    }

    /**
     * Set 鉴权信息
     * @param Credentials 鉴权信息
     */
    public void setCredentials(CosCredentials Credentials) {
        this.Credentials = Credentials;
    }

    public CosUploadInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosUploadInfo(CosUploadInfo source) {
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Credentials != null) {
            this.Credentials = new CosCredentials(source.Credentials);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "Credentials.", this.Credentials);

    }
}

