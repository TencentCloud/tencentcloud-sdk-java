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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Seal extends AbstractModel{

    /**
    * 电子印章ID
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 电子印章名称
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * 电子印章类型
    */
    @SerializedName("SealType")
    @Expose
    private String SealType;

    /**
    * 电子印章来源：
CREATE - 通过图片上传
GENERATE - 通过文字生成
    */
    @SerializedName("SealSource")
    @Expose
    private String SealSource;

    /**
    * 电子印章创建者
    */
    @SerializedName("Creator")
    @Expose
    private Caller Creator;

    /**
    * 电子印章创建时间戳
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 电子印章所有人
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 电子印章URL
    */
    @SerializedName("FileUrl")
    @Expose
    private FileUrl FileUrl;

    /**
    * 是否为默认印章，false-非默认，true-默认
    */
    @SerializedName("DefaultSeal")
    @Expose
    private Boolean DefaultSeal;

    /**
     * Get 电子印章ID 
     * @return SealId 电子印章ID
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 电子印章ID
     * @param SealId 电子印章ID
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 电子印章名称 
     * @return SealName 电子印章名称
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 电子印章名称
     * @param SealName 电子印章名称
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get 电子印章类型 
     * @return SealType 电子印章类型
     */
    public String getSealType() {
        return this.SealType;
    }

    /**
     * Set 电子印章类型
     * @param SealType 电子印章类型
     */
    public void setSealType(String SealType) {
        this.SealType = SealType;
    }

    /**
     * Get 电子印章来源：
CREATE - 通过图片上传
GENERATE - 通过文字生成 
     * @return SealSource 电子印章来源：
CREATE - 通过图片上传
GENERATE - 通过文字生成
     */
    public String getSealSource() {
        return this.SealSource;
    }

    /**
     * Set 电子印章来源：
CREATE - 通过图片上传
GENERATE - 通过文字生成
     * @param SealSource 电子印章来源：
CREATE - 通过图片上传
GENERATE - 通过文字生成
     */
    public void setSealSource(String SealSource) {
        this.SealSource = SealSource;
    }

    /**
     * Get 电子印章创建者 
     * @return Creator 电子印章创建者
     */
    public Caller getCreator() {
        return this.Creator;
    }

    /**
     * Set 电子印章创建者
     * @param Creator 电子印章创建者
     */
    public void setCreator(Caller Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 电子印章创建时间戳 
     * @return CreatedOn 电子印章创建时间戳
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 电子印章创建时间戳
     * @param CreatedOn 电子印章创建时间戳
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 电子印章所有人 
     * @return UserId 电子印章所有人
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 电子印章所有人
     * @param UserId 电子印章所有人
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 电子印章URL 
     * @return FileUrl 电子印章URL
     */
    public FileUrl getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 电子印章URL
     * @param FileUrl 电子印章URL
     */
    public void setFileUrl(FileUrl FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 是否为默认印章，false-非默认，true-默认 
     * @return DefaultSeal 是否为默认印章，false-非默认，true-默认
     */
    public Boolean getDefaultSeal() {
        return this.DefaultSeal;
    }

    /**
     * Set 是否为默认印章，false-非默认，true-默认
     * @param DefaultSeal 是否为默认印章，false-非默认，true-默认
     */
    public void setDefaultSeal(Boolean DefaultSeal) {
        this.DefaultSeal = DefaultSeal;
    }

    public Seal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Seal(Seal source) {
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.SealType != null) {
            this.SealType = new String(source.SealType);
        }
        if (source.SealSource != null) {
            this.SealSource = new String(source.SealSource);
        }
        if (source.Creator != null) {
            this.Creator = new Caller(source.Creator);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new FileUrl(source.FileUrl);
        }
        if (source.DefaultSeal != null) {
            this.DefaultSeal = new Boolean(source.DefaultSeal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamSimple(map, prefix + "SealType", this.SealType);
        this.setParamSimple(map, prefix + "SealSource", this.SealSource);
        this.setParamObj(map, prefix + "Creator.", this.Creator);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamObj(map, prefix + "FileUrl.", this.FileUrl);
        this.setParamSimple(map, prefix + "DefaultSeal", this.DefaultSeal);

    }
}

