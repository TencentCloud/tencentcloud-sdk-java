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

public class PkgInfo extends AbstractModel {

    /**
    * 程序包ID
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 程序包名
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * 程序包类型
    */
    @SerializedName("PkgType")
    @Expose
    private String PkgType;

    /**
    * 程序包版本
    */
    @SerializedName("PkgVersion")
    @Expose
    private String PkgVersion;

    /**
    * 程序包描述
    */
    @SerializedName("PkgDesc")
    @Expose
    private String PkgDesc;

    /**
    * 上传时间
    */
    @SerializedName("UploadTime")
    @Expose
    private String UploadTime;

    /**
    * 程序包MD5
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 程序包状态
    */
    @SerializedName("PkgPubStatus")
    @Expose
    private Long PkgPubStatus;

    /**
    * 程序包关联关系
    */
    @SerializedName("PkgBindInfo")
    @Expose
    private PkgBind [] PkgBindInfo;

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
     * Get 程序包名 
     * @return PkgName 程序包名
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * Set 程序包名
     * @param PkgName 程序包名
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * Get 程序包类型 
     * @return PkgType 程序包类型
     */
    public String getPkgType() {
        return this.PkgType;
    }

    /**
     * Set 程序包类型
     * @param PkgType 程序包类型
     */
    public void setPkgType(String PkgType) {
        this.PkgType = PkgType;
    }

    /**
     * Get 程序包版本 
     * @return PkgVersion 程序包版本
     */
    public String getPkgVersion() {
        return this.PkgVersion;
    }

    /**
     * Set 程序包版本
     * @param PkgVersion 程序包版本
     */
    public void setPkgVersion(String PkgVersion) {
        this.PkgVersion = PkgVersion;
    }

    /**
     * Get 程序包描述 
     * @return PkgDesc 程序包描述
     */
    public String getPkgDesc() {
        return this.PkgDesc;
    }

    /**
     * Set 程序包描述
     * @param PkgDesc 程序包描述
     */
    public void setPkgDesc(String PkgDesc) {
        this.PkgDesc = PkgDesc;
    }

    /**
     * Get 上传时间 
     * @return UploadTime 上传时间
     */
    public String getUploadTime() {
        return this.UploadTime;
    }

    /**
     * Set 上传时间
     * @param UploadTime 上传时间
     */
    public void setUploadTime(String UploadTime) {
        this.UploadTime = UploadTime;
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
     * Get 程序包状态 
     * @return PkgPubStatus 程序包状态
     */
    public Long getPkgPubStatus() {
        return this.PkgPubStatus;
    }

    /**
     * Set 程序包状态
     * @param PkgPubStatus 程序包状态
     */
    public void setPkgPubStatus(Long PkgPubStatus) {
        this.PkgPubStatus = PkgPubStatus;
    }

    /**
     * Get 程序包关联关系 
     * @return PkgBindInfo 程序包关联关系
     */
    public PkgBind [] getPkgBindInfo() {
        return this.PkgBindInfo;
    }

    /**
     * Set 程序包关联关系
     * @param PkgBindInfo 程序包关联关系
     */
    public void setPkgBindInfo(PkgBind [] PkgBindInfo) {
        this.PkgBindInfo = PkgBindInfo;
    }

    public PkgInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PkgInfo(PkgInfo source) {
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgName != null) {
            this.PkgName = new String(source.PkgName);
        }
        if (source.PkgType != null) {
            this.PkgType = new String(source.PkgType);
        }
        if (source.PkgVersion != null) {
            this.PkgVersion = new String(source.PkgVersion);
        }
        if (source.PkgDesc != null) {
            this.PkgDesc = new String(source.PkgDesc);
        }
        if (source.UploadTime != null) {
            this.UploadTime = new String(source.UploadTime);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.PkgPubStatus != null) {
            this.PkgPubStatus = new Long(source.PkgPubStatus);
        }
        if (source.PkgBindInfo != null) {
            this.PkgBindInfo = new PkgBind[source.PkgBindInfo.length];
            for (int i = 0; i < source.PkgBindInfo.length; i++) {
                this.PkgBindInfo[i] = new PkgBind(source.PkgBindInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "PkgType", this.PkgType);
        this.setParamSimple(map, prefix + "PkgVersion", this.PkgVersion);
        this.setParamSimple(map, prefix + "PkgDesc", this.PkgDesc);
        this.setParamSimple(map, prefix + "UploadTime", this.UploadTime);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "PkgPubStatus", this.PkgPubStatus);
        this.setParamArrayObj(map, prefix + "PkgBindInfo.", this.PkgBindInfo);

    }
}

