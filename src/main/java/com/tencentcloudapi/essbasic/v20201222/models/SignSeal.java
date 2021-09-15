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

public class SignSeal extends AbstractModel{

    /**
    * 签署控件ID
    */
    @SerializedName("ComponentId")
    @Expose
    private String ComponentId;

    /**
    * 签署印章类型:
SIGN_SIGNATURE - 签名
SIGN_SEAL - 印章
SIGN_DATE - 日期
SIGN_IMAGE - 图片
    */
    @SerializedName("SignType")
    @Expose
    private String SignType;

    /**
    * 合同文件ID
    */
    @SerializedName("FileIndex")
    @Expose
    private Long FileIndex;

    /**
    * 印章ID，仅当 SignType 为 SIGN_SEAL 时必填
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 签名内容，仅当 SignType 为SIGN_SIGNATURE或SIGN_IMAGE 时必填，base64编码
    */
    @SerializedName("SealContent")
    @Expose
    private String SealContent;

    /**
     * Get 签署控件ID 
     * @return ComponentId 签署控件ID
     */
    public String getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set 签署控件ID
     * @param ComponentId 签署控件ID
     */
    public void setComponentId(String ComponentId) {
        this.ComponentId = ComponentId;
    }

    /**
     * Get 签署印章类型:
SIGN_SIGNATURE - 签名
SIGN_SEAL - 印章
SIGN_DATE - 日期
SIGN_IMAGE - 图片 
     * @return SignType 签署印章类型:
SIGN_SIGNATURE - 签名
SIGN_SEAL - 印章
SIGN_DATE - 日期
SIGN_IMAGE - 图片
     */
    public String getSignType() {
        return this.SignType;
    }

    /**
     * Set 签署印章类型:
SIGN_SIGNATURE - 签名
SIGN_SEAL - 印章
SIGN_DATE - 日期
SIGN_IMAGE - 图片
     * @param SignType 签署印章类型:
SIGN_SIGNATURE - 签名
SIGN_SEAL - 印章
SIGN_DATE - 日期
SIGN_IMAGE - 图片
     */
    public void setSignType(String SignType) {
        this.SignType = SignType;
    }

    /**
     * Get 合同文件ID 
     * @return FileIndex 合同文件ID
     */
    public Long getFileIndex() {
        return this.FileIndex;
    }

    /**
     * Set 合同文件ID
     * @param FileIndex 合同文件ID
     */
    public void setFileIndex(Long FileIndex) {
        this.FileIndex = FileIndex;
    }

    /**
     * Get 印章ID，仅当 SignType 为 SIGN_SEAL 时必填 
     * @return SealId 印章ID，仅当 SignType 为 SIGN_SEAL 时必填
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 印章ID，仅当 SignType 为 SIGN_SEAL 时必填
     * @param SealId 印章ID，仅当 SignType 为 SIGN_SEAL 时必填
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 签名内容，仅当 SignType 为SIGN_SIGNATURE或SIGN_IMAGE 时必填，base64编码 
     * @return SealContent 签名内容，仅当 SignType 为SIGN_SIGNATURE或SIGN_IMAGE 时必填，base64编码
     */
    public String getSealContent() {
        return this.SealContent;
    }

    /**
     * Set 签名内容，仅当 SignType 为SIGN_SIGNATURE或SIGN_IMAGE 时必填，base64编码
     * @param SealContent 签名内容，仅当 SignType 为SIGN_SIGNATURE或SIGN_IMAGE 时必填，base64编码
     */
    public void setSealContent(String SealContent) {
        this.SealContent = SealContent;
    }

    public SignSeal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignSeal(SignSeal source) {
        if (source.ComponentId != null) {
            this.ComponentId = new String(source.ComponentId);
        }
        if (source.SignType != null) {
            this.SignType = new String(source.SignType);
        }
        if (source.FileIndex != null) {
            this.FileIndex = new Long(source.FileIndex);
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.SealContent != null) {
            this.SealContent = new String(source.SealContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "SignType", this.SignType);
        this.setParamSimple(map, prefix + "FileIndex", this.FileIndex);
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamSimple(map, prefix + "SealContent", this.SealContent);

    }
}

