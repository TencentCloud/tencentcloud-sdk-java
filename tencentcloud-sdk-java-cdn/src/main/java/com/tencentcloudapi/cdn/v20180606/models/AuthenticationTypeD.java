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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthenticationTypeD extends AbstractModel{

    /**
    * 计算签名的密钥
仅允许大小写字母与数字，长度 6~32 位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 签名过期时间设置
单位为秒，最大可设置为 31536000
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 鉴权/不做鉴权的文件扩展名列表设置
如果包含字符 *  则表示所有文件
    */
    @SerializedName("FileExtensions")
    @Expose
    private String [] FileExtensions;

    /**
    * whitelist：白名单，表示对除了 FileExtensions 列表之外的所有类型进行鉴权
blacklist：黑名单，表示仅对 FileExtensions 中的类型进行鉴权
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * 签名参数名设置
仅允许大小写字母、数字或下划线，长度 1~100 位，不能以数字开头
    */
    @SerializedName("SignParam")
    @Expose
    private String SignParam;

    /**
    * 时间戳参数名设置
仅允许大小写字母、数字或下划线，长度 1~100 位，不能以数字开头
    */
    @SerializedName("TimeParam")
    @Expose
    private String TimeParam;

    /**
    * 时间戳进制设置
dec：十进制
hex：十六进制
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
     * Get 计算签名的密钥
仅允许大小写字母与数字，长度 6~32 位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey 计算签名的密钥
仅允许大小写字母与数字，长度 6~32 位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 计算签名的密钥
仅允许大小写字母与数字，长度 6~32 位
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey 计算签名的密钥
仅允许大小写字母与数字，长度 6~32 位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 签名过期时间设置
单位为秒，最大可设置为 31536000 
     * @return ExpireTime 签名过期时间设置
单位为秒，最大可设置为 31536000
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 签名过期时间设置
单位为秒，最大可设置为 31536000
     * @param ExpireTime 签名过期时间设置
单位为秒，最大可设置为 31536000
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 鉴权/不做鉴权的文件扩展名列表设置
如果包含字符 *  则表示所有文件 
     * @return FileExtensions 鉴权/不做鉴权的文件扩展名列表设置
如果包含字符 *  则表示所有文件
     */
    public String [] getFileExtensions() {
        return this.FileExtensions;
    }

    /**
     * Set 鉴权/不做鉴权的文件扩展名列表设置
如果包含字符 *  则表示所有文件
     * @param FileExtensions 鉴权/不做鉴权的文件扩展名列表设置
如果包含字符 *  则表示所有文件
     */
    public void setFileExtensions(String [] FileExtensions) {
        this.FileExtensions = FileExtensions;
    }

    /**
     * Get whitelist：白名单，表示对除了 FileExtensions 列表之外的所有类型进行鉴权
blacklist：黑名单，表示仅对 FileExtensions 中的类型进行鉴权 
     * @return FilterType whitelist：白名单，表示对除了 FileExtensions 列表之外的所有类型进行鉴权
blacklist：黑名单，表示仅对 FileExtensions 中的类型进行鉴权
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set whitelist：白名单，表示对除了 FileExtensions 列表之外的所有类型进行鉴权
blacklist：黑名单，表示仅对 FileExtensions 中的类型进行鉴权
     * @param FilterType whitelist：白名单，表示对除了 FileExtensions 列表之外的所有类型进行鉴权
blacklist：黑名单，表示仅对 FileExtensions 中的类型进行鉴权
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get 签名参数名设置
仅允许大小写字母、数字或下划线，长度 1~100 位，不能以数字开头 
     * @return SignParam 签名参数名设置
仅允许大小写字母、数字或下划线，长度 1~100 位，不能以数字开头
     */
    public String getSignParam() {
        return this.SignParam;
    }

    /**
     * Set 签名参数名设置
仅允许大小写字母、数字或下划线，长度 1~100 位，不能以数字开头
     * @param SignParam 签名参数名设置
仅允许大小写字母、数字或下划线，长度 1~100 位，不能以数字开头
     */
    public void setSignParam(String SignParam) {
        this.SignParam = SignParam;
    }

    /**
     * Get 时间戳参数名设置
仅允许大小写字母、数字或下划线，长度 1~100 位，不能以数字开头 
     * @return TimeParam 时间戳参数名设置
仅允许大小写字母、数字或下划线，长度 1~100 位，不能以数字开头
     */
    public String getTimeParam() {
        return this.TimeParam;
    }

    /**
     * Set 时间戳参数名设置
仅允许大小写字母、数字或下划线，长度 1~100 位，不能以数字开头
     * @param TimeParam 时间戳参数名设置
仅允许大小写字母、数字或下划线，长度 1~100 位，不能以数字开头
     */
    public void setTimeParam(String TimeParam) {
        this.TimeParam = TimeParam;
    }

    /**
     * Get 时间戳进制设置
dec：十进制
hex：十六进制 
     * @return TimeFormat 时间戳进制设置
dec：十进制
hex：十六进制
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set 时间戳进制设置
dec：十进制
hex：十六进制
     * @param TimeFormat 时间戳进制设置
dec：十进制
hex：十六进制
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArraySimple(map, prefix + "FileExtensions.", this.FileExtensions);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "SignParam", this.SignParam);
        this.setParamSimple(map, prefix + "TimeParam", this.TimeParam);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);

    }
}

