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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLayerVersionResponse extends AbstractModel{

    /**
    * 适配的运行时
    */
    @SerializedName("CompatibleRuntimes")
    @Expose
    private String [] CompatibleRuntimes;

    /**
    * 层中版本文件的SHA256编码
    */
    @SerializedName("CodeSha256")
    @Expose
    private String CodeSha256;

    /**
    * 层中版本文件的下载地址
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 版本的创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 版本的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 许可证信息
    */
    @SerializedName("LicenseInfo")
    @Expose
    private String LicenseInfo;

    /**
    * 版本号
    */
    @SerializedName("LayerVersion")
    @Expose
    private Long LayerVersion;

    /**
    * 层名称
    */
    @SerializedName("LayerName")
    @Expose
    private String LayerName;

    /**
    * 层的具体版本当前状态，可能取值：
Active 正常
Publishing  发布中
PublishFailed  发布失败
Deleted 已删除
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 适配的运行时 
     * @return CompatibleRuntimes 适配的运行时
     */
    public String [] getCompatibleRuntimes() {
        return this.CompatibleRuntimes;
    }

    /**
     * Set 适配的运行时
     * @param CompatibleRuntimes 适配的运行时
     */
    public void setCompatibleRuntimes(String [] CompatibleRuntimes) {
        this.CompatibleRuntimes = CompatibleRuntimes;
    }

    /**
     * Get 层中版本文件的SHA256编码 
     * @return CodeSha256 层中版本文件的SHA256编码
     */
    public String getCodeSha256() {
        return this.CodeSha256;
    }

    /**
     * Set 层中版本文件的SHA256编码
     * @param CodeSha256 层中版本文件的SHA256编码
     */
    public void setCodeSha256(String CodeSha256) {
        this.CodeSha256 = CodeSha256;
    }

    /**
     * Get 层中版本文件的下载地址 
     * @return Location 层中版本文件的下载地址
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 层中版本文件的下载地址
     * @param Location 层中版本文件的下载地址
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 版本的创建时间 
     * @return AddTime 版本的创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 版本的创建时间
     * @param AddTime 版本的创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 版本的描述 
     * @return Description 版本的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本的描述
     * @param Description 版本的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 许可证信息 
     * @return LicenseInfo 许可证信息
     */
    public String getLicenseInfo() {
        return this.LicenseInfo;
    }

    /**
     * Set 许可证信息
     * @param LicenseInfo 许可证信息
     */
    public void setLicenseInfo(String LicenseInfo) {
        this.LicenseInfo = LicenseInfo;
    }

    /**
     * Get 版本号 
     * @return LayerVersion 版本号
     */
    public Long getLayerVersion() {
        return this.LayerVersion;
    }

    /**
     * Set 版本号
     * @param LayerVersion 版本号
     */
    public void setLayerVersion(Long LayerVersion) {
        this.LayerVersion = LayerVersion;
    }

    /**
     * Get 层名称 
     * @return LayerName 层名称
     */
    public String getLayerName() {
        return this.LayerName;
    }

    /**
     * Set 层名称
     * @param LayerName 层名称
     */
    public void setLayerName(String LayerName) {
        this.LayerName = LayerName;
    }

    /**
     * Get 层的具体版本当前状态，可能取值：
Active 正常
Publishing  发布中
PublishFailed  发布失败
Deleted 已删除 
     * @return Status 层的具体版本当前状态，可能取值：
Active 正常
Publishing  发布中
PublishFailed  发布失败
Deleted 已删除
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 层的具体版本当前状态，可能取值：
Active 正常
Publishing  发布中
PublishFailed  发布失败
Deleted 已删除
     * @param Status 层的具体版本当前状态，可能取值：
Active 正常
Publishing  发布中
PublishFailed  发布失败
Deleted 已删除
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CompatibleRuntimes.", this.CompatibleRuntimes);
        this.setParamSimple(map, prefix + "CodeSha256", this.CodeSha256);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "LicenseInfo", this.LicenseInfo);
        this.setParamSimple(map, prefix + "LayerVersion", this.LayerVersion);
        this.setParamSimple(map, prefix + "LayerName", this.LayerName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

