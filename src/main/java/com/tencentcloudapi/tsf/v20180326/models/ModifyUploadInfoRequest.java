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

public class ModifyUploadInfoRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 调用DescribeUploadInfo接口时返回的软件包ID
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * COS返回上传结果（默认为0：成功，其他值表示失败）
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 程序包MD5
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 程序包大小（单位字节）
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 程序包仓库类型
    */
    @SerializedName("RepositoryType")
    @Expose
    private String RepositoryType;

    /**
    * 程序包仓库id
    */
    @SerializedName("RepositoryId")
    @Expose
    private String RepositoryId;

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
     * Get 调用DescribeUploadInfo接口时返回的软件包ID 
     * @return PkgId 调用DescribeUploadInfo接口时返回的软件包ID
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 调用DescribeUploadInfo接口时返回的软件包ID
     * @param PkgId 调用DescribeUploadInfo接口时返回的软件包ID
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get COS返回上传结果（默认为0：成功，其他值表示失败） 
     * @return Result COS返回上传结果（默认为0：成功，其他值表示失败）
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set COS返回上传结果（默认为0：成功，其他值表示失败）
     * @param Result COS返回上传结果（默认为0：成功，其他值表示失败）
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 程序包MD5 
     * @return Md5 程序包MD5
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 程序包MD5
     * @param Md5 程序包MD5
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 程序包大小（单位字节） 
     * @return Size 程序包大小（单位字节）
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 程序包大小（单位字节）
     * @param Size 程序包大小（单位字节）
     */
    public void setSize(Long Size) {
        this.Size = Size;
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
     * Get 程序包仓库id 
     * @return RepositoryId 程序包仓库id
     */
    public String getRepositoryId() {
        return this.RepositoryId;
    }

    /**
     * Set 程序包仓库id
     * @param RepositoryId 程序包仓库id
     */
    public void setRepositoryId(String RepositoryId) {
        this.RepositoryId = RepositoryId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "RepositoryType", this.RepositoryType);
        this.setParamSimple(map, prefix + "RepositoryId", this.RepositoryId);

    }
}

