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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SoftwareInformationData extends AbstractModel {

    /**
    * 软件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 安装时间
    */
    @SerializedName("InstallDate")
    @Expose
    private String InstallDate;

    /**
    * 软件列表id(只支持32位)
    */
    @SerializedName("SoftwareId")
    @Expose
    private Long SoftwareId;

    /**
    * 唯一标识Mid
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * 软件版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 公司名
    */
    @SerializedName("CorpName")
    @Expose
    private String CorpName;

    /**
    * 列表Id(只支持32位)
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 盗版风险（0:未支持，1:风险，2:未发现，3:未开启）
    */
    @SerializedName("PiracyRisk")
    @Expose
    private Long PiracyRisk;

    /**
     * Get 软件名称 
     * @return Name 软件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 软件名称
     * @param Name 软件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 安装时间 
     * @return InstallDate 安装时间
     */
    public String getInstallDate() {
        return this.InstallDate;
    }

    /**
     * Set 安装时间
     * @param InstallDate 安装时间
     */
    public void setInstallDate(String InstallDate) {
        this.InstallDate = InstallDate;
    }

    /**
     * Get 软件列表id(只支持32位) 
     * @return SoftwareId 软件列表id(只支持32位)
     */
    public Long getSoftwareId() {
        return this.SoftwareId;
    }

    /**
     * Set 软件列表id(只支持32位)
     * @param SoftwareId 软件列表id(只支持32位)
     */
    public void setSoftwareId(Long SoftwareId) {
        this.SoftwareId = SoftwareId;
    }

    /**
     * Get 唯一标识Mid 
     * @return Mid 唯一标识Mid
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set 唯一标识Mid
     * @param Mid 唯一标识Mid
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get 软件版本 
     * @return Version 软件版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 软件版本
     * @param Version 软件版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 公司名 
     * @return CorpName 公司名
     */
    public String getCorpName() {
        return this.CorpName;
    }

    /**
     * Set 公司名
     * @param CorpName 公司名
     */
    public void setCorpName(String CorpName) {
        this.CorpName = CorpName;
    }

    /**
     * Get 列表Id(只支持32位) 
     * @return Id 列表Id(只支持32位)
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 列表Id(只支持32位)
     * @param Id 列表Id(只支持32位)
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 盗版风险（0:未支持，1:风险，2:未发现，3:未开启） 
     * @return PiracyRisk 盗版风险（0:未支持，1:风险，2:未发现，3:未开启）
     */
    public Long getPiracyRisk() {
        return this.PiracyRisk;
    }

    /**
     * Set 盗版风险（0:未支持，1:风险，2:未发现，3:未开启）
     * @param PiracyRisk 盗版风险（0:未支持，1:风险，2:未发现，3:未开启）
     */
    public void setPiracyRisk(Long PiracyRisk) {
        this.PiracyRisk = PiracyRisk;
    }

    public SoftwareInformationData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SoftwareInformationData(SoftwareInformationData source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InstallDate != null) {
            this.InstallDate = new String(source.InstallDate);
        }
        if (source.SoftwareId != null) {
            this.SoftwareId = new Long(source.SoftwareId);
        }
        if (source.Mid != null) {
            this.Mid = new String(source.Mid);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.CorpName != null) {
            this.CorpName = new String(source.CorpName);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.PiracyRisk != null) {
            this.PiracyRisk = new Long(source.PiracyRisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InstallDate", this.InstallDate);
        this.setParamSimple(map, prefix + "SoftwareId", this.SoftwareId);
        this.setParamSimple(map, prefix + "Mid", this.Mid);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "CorpName", this.CorpName);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PiracyRisk", this.PiracyRisk);

    }
}

