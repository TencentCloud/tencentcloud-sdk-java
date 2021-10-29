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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputSendTrafficSecuritySmsMsg extends AbstractModel{

    /**
    * 投放任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 手机号码列表（号码量<=200）
    */
    @SerializedName("Mobiles")
    @Expose
    private String [] Mobiles;

    /**
    * 是否授权，1：已授权
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * 加密方式，0：AES加密；1：DES加密
    */
    @SerializedName("EncryptMethod")
    @Expose
    private Long EncryptMethod;

    /**
    * 加密算法中的块处理模式，0：ECB模式；1：CBC模式；2：CTR模式；3：CFB模式；4：OFB模式；
    */
    @SerializedName("EncryptMode")
    @Expose
    private Long EncryptMode;

    /**
    * 填充模式，0：ZeroPadding；1：PKCS5Padding；2：PKCS7Padding；
    */
    @SerializedName("PaddingType")
    @Expose
    private Long PaddingType;

    /**
    * 加密数据
    */
    @SerializedName("EncryptData")
    @Expose
    private String EncryptData;

    /**
     * Get 投放任务ID 
     * @return TaskId 投放任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 投放任务ID
     * @param TaskId 投放任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 手机号码列表（号码量<=200） 
     * @return Mobiles 手机号码列表（号码量<=200）
     */
    public String [] getMobiles() {
        return this.Mobiles;
    }

    /**
     * Set 手机号码列表（号码量<=200）
     * @param Mobiles 手机号码列表（号码量<=200）
     */
    public void setMobiles(String [] Mobiles) {
        this.Mobiles = Mobiles;
    }

    /**
     * Get 是否授权，1：已授权 
     * @return IsAuthorized 是否授权，1：已授权
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set 是否授权，1：已授权
     * @param IsAuthorized 是否授权，1：已授权
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get 加密方式，0：AES加密；1：DES加密 
     * @return EncryptMethod 加密方式，0：AES加密；1：DES加密
     */
    public Long getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set 加密方式，0：AES加密；1：DES加密
     * @param EncryptMethod 加密方式，0：AES加密；1：DES加密
     */
    public void setEncryptMethod(Long EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    /**
     * Get 加密算法中的块处理模式，0：ECB模式；1：CBC模式；2：CTR模式；3：CFB模式；4：OFB模式； 
     * @return EncryptMode 加密算法中的块处理模式，0：ECB模式；1：CBC模式；2：CTR模式；3：CFB模式；4：OFB模式；
     */
    public Long getEncryptMode() {
        return this.EncryptMode;
    }

    /**
     * Set 加密算法中的块处理模式，0：ECB模式；1：CBC模式；2：CTR模式；3：CFB模式；4：OFB模式；
     * @param EncryptMode 加密算法中的块处理模式，0：ECB模式；1：CBC模式；2：CTR模式；3：CFB模式；4：OFB模式；
     */
    public void setEncryptMode(Long EncryptMode) {
        this.EncryptMode = EncryptMode;
    }

    /**
     * Get 填充模式，0：ZeroPadding；1：PKCS5Padding；2：PKCS7Padding； 
     * @return PaddingType 填充模式，0：ZeroPadding；1：PKCS5Padding；2：PKCS7Padding；
     */
    public Long getPaddingType() {
        return this.PaddingType;
    }

    /**
     * Set 填充模式，0：ZeroPadding；1：PKCS5Padding；2：PKCS7Padding；
     * @param PaddingType 填充模式，0：ZeroPadding；1：PKCS5Padding；2：PKCS7Padding；
     */
    public void setPaddingType(Long PaddingType) {
        this.PaddingType = PaddingType;
    }

    /**
     * Get 加密数据 
     * @return EncryptData 加密数据
     */
    public String getEncryptData() {
        return this.EncryptData;
    }

    /**
     * Set 加密数据
     * @param EncryptData 加密数据
     */
    public void setEncryptData(String EncryptData) {
        this.EncryptData = EncryptData;
    }

    public InputSendTrafficSecuritySmsMsg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputSendTrafficSecuritySmsMsg(InputSendTrafficSecuritySmsMsg source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Mobiles != null) {
            this.Mobiles = new String[source.Mobiles.length];
            for (int i = 0; i < source.Mobiles.length; i++) {
                this.Mobiles[i] = new String(source.Mobiles[i]);
            }
        }
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new Long(source.IsAuthorized);
        }
        if (source.EncryptMethod != null) {
            this.EncryptMethod = new Long(source.EncryptMethod);
        }
        if (source.EncryptMode != null) {
            this.EncryptMode = new Long(source.EncryptMode);
        }
        if (source.PaddingType != null) {
            this.PaddingType = new Long(source.PaddingType);
        }
        if (source.EncryptData != null) {
            this.EncryptData = new String(source.EncryptData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "Mobiles.", this.Mobiles);
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);
        this.setParamSimple(map, prefix + "EncryptMethod", this.EncryptMethod);
        this.setParamSimple(map, prefix + "EncryptMode", this.EncryptMode);
        this.setParamSimple(map, prefix + "PaddingType", this.PaddingType);
        this.setParamSimple(map, prefix + "EncryptData", this.EncryptData);

    }
}

