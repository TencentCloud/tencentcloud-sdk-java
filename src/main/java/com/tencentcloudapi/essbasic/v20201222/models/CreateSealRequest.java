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

public class CreateSealRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 印章类型：
1. PERSONAL - 个人私章
2. OFFICIAL - 公章
3. SPECIAL_FINANCIAL - 财务专用章
4. CONTRACT - 合同专用章
5. LEGAL_REPRESENTATIVE - 法定代表人章
6. SPECIAL_NATIONWIDE_INVOICE - 发票专用章
7. OTHER-其他
    */
    @SerializedName("SealType")
    @Expose
    private String SealType;

    /**
    * 印章名称
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * 请求创建印章的客户端IP
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 印章图片，base64编码（与FileId参数二选一，同时传入参数时优先使用Image参数）
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 印章文件图片ID（与Image参数二选一，同时传入参数时优先使用Image参数）
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 需要创建印章的用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 是否是默认印章 true：是，false：否
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 印章类型：
1. PERSONAL - 个人私章
2. OFFICIAL - 公章
3. SPECIAL_FINANCIAL - 财务专用章
4. CONTRACT - 合同专用章
5. LEGAL_REPRESENTATIVE - 法定代表人章
6. SPECIAL_NATIONWIDE_INVOICE - 发票专用章
7. OTHER-其他 
     * @return SealType 印章类型：
1. PERSONAL - 个人私章
2. OFFICIAL - 公章
3. SPECIAL_FINANCIAL - 财务专用章
4. CONTRACT - 合同专用章
5. LEGAL_REPRESENTATIVE - 法定代表人章
6. SPECIAL_NATIONWIDE_INVOICE - 发票专用章
7. OTHER-其他
     */
    public String getSealType() {
        return this.SealType;
    }

    /**
     * Set 印章类型：
1. PERSONAL - 个人私章
2. OFFICIAL - 公章
3. SPECIAL_FINANCIAL - 财务专用章
4. CONTRACT - 合同专用章
5. LEGAL_REPRESENTATIVE - 法定代表人章
6. SPECIAL_NATIONWIDE_INVOICE - 发票专用章
7. OTHER-其他
     * @param SealType 印章类型：
1. PERSONAL - 个人私章
2. OFFICIAL - 公章
3. SPECIAL_FINANCIAL - 财务专用章
4. CONTRACT - 合同专用章
5. LEGAL_REPRESENTATIVE - 法定代表人章
6. SPECIAL_NATIONWIDE_INVOICE - 发票专用章
7. OTHER-其他
     */
    public void setSealType(String SealType) {
        this.SealType = SealType;
    }

    /**
     * Get 印章名称 
     * @return SealName 印章名称
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 印章名称
     * @param SealName 印章名称
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get 请求创建印章的客户端IP 
     * @return SourceIp 请求创建印章的客户端IP
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 请求创建印章的客户端IP
     * @param SourceIp 请求创建印章的客户端IP
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 印章图片，base64编码（与FileId参数二选一，同时传入参数时优先使用Image参数） 
     * @return Image 印章图片，base64编码（与FileId参数二选一，同时传入参数时优先使用Image参数）
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 印章图片，base64编码（与FileId参数二选一，同时传入参数时优先使用Image参数）
     * @param Image 印章图片，base64编码（与FileId参数二选一，同时传入参数时优先使用Image参数）
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 印章文件图片ID（与Image参数二选一，同时传入参数时优先使用Image参数） 
     * @return FileId 印章文件图片ID（与Image参数二选一，同时传入参数时优先使用Image参数）
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 印章文件图片ID（与Image参数二选一，同时传入参数时优先使用Image参数）
     * @param FileId 印章文件图片ID（与Image参数二选一，同时传入参数时优先使用Image参数）
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 需要创建印章的用户ID 
     * @return UserId 需要创建印章的用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 需要创建印章的用户ID
     * @param UserId 需要创建印章的用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 是否是默认印章 true：是，false：否 
     * @return IsDefault 是否是默认印章 true：是，false：否
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否是默认印章 true：是，false：否
     * @param IsDefault 是否是默认印章 true：是，false：否
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    public CreateSealRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSealRequest(CreateSealRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.SealType != null) {
            this.SealType = new String(source.SealType);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "SealType", this.SealType);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

