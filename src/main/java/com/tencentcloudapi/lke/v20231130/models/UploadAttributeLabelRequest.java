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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadAttributeLabelRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * cos路径
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性
    */
    @SerializedName("CosHash")
    @Expose
    private String CosHash;

    /**
    * 文件大小
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * 登录用户主账号(集成商模式必填)
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * 登录用户子账号(集成商模式必填)
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
     * Get 应用ID 
     * @return BotBizId 应用ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
     * @param BotBizId 应用ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get cos路径 
     * @return CosUrl cos路径
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set cos路径
     * @param CosUrl cos路径
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性 
     * @return CosHash x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性
     */
    public String getCosHash() {
        return this.CosHash;
    }

    /**
     * Set x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性
     * @param CosHash x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性
     */
    public void setCosHash(String CosHash) {
        this.CosHash = CosHash;
    }

    /**
     * Get 文件大小 
     * @return Size 文件大小
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小
     * @param Size 文件大小
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get 登录用户主账号(集成商模式必填) 
     * @return LoginUin 登录用户主账号(集成商模式必填)
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set 登录用户主账号(集成商模式必填)
     * @param LoginUin 登录用户主账号(集成商模式必填)
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get 登录用户子账号(集成商模式必填) 
     * @return LoginSubAccountUin 登录用户子账号(集成商模式必填)
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set 登录用户子账号(集成商模式必填)
     * @param LoginSubAccountUin 登录用户子账号(集成商模式必填)
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    public UploadAttributeLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadAttributeLabelRequest(UploadAttributeLabelRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.CosHash != null) {
            this.CosHash = new String(source.CosHash);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "CosHash", this.CosHash);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

