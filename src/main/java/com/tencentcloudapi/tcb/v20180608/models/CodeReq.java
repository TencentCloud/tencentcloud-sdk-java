/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeReq extends AbstractModel {

    /**
    * 包含函数代码的zip格式文件
    */
    @SerializedName("ZipFile")
    @Expose
    private String ZipFile;

    /**
    * 对象存储桶名称（填写存储桶名称自定义部分，不包含-appid）

    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 对象存储中代码包文件路径，以/开头

    */
    @SerializedName("CosObjectName")
    @Expose
    private String CosObjectName;

    /**
    * 对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。

    */
    @SerializedName("CosBucketRegion")
    @Expose
    private String CosBucketRegion;

    /**
    * 如果是从TempCos创建的话，需要传入TempCosObjectName
    */
    @SerializedName("TempCosObjectName")
    @Expose
    private String TempCosObjectName;

    /**
    * 如果是通过Demo创建的话，需要传入DemoId

    */
    @SerializedName("DemoId")
    @Expose
    private String DemoId;

    /**
    * 上传云开发cos后返回的时间戳
    */
    @SerializedName("CosTimestamp")
    @Expose
    private String CosTimestamp;

    /**
     * Get 包含函数代码的zip格式文件 
     * @return ZipFile 包含函数代码的zip格式文件
     */
    public String getZipFile() {
        return this.ZipFile;
    }

    /**
     * Set 包含函数代码的zip格式文件
     * @param ZipFile 包含函数代码的zip格式文件
     */
    public void setZipFile(String ZipFile) {
        this.ZipFile = ZipFile;
    }

    /**
     * Get 对象存储桶名称（填写存储桶名称自定义部分，不包含-appid）
 
     * @return CosBucketName 对象存储桶名称（填写存储桶名称自定义部分，不包含-appid）

     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set 对象存储桶名称（填写存储桶名称自定义部分，不包含-appid）

     * @param CosBucketName 对象存储桶名称（填写存储桶名称自定义部分，不包含-appid）

     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get 对象存储中代码包文件路径，以/开头
 
     * @return CosObjectName 对象存储中代码包文件路径，以/开头

     */
    public String getCosObjectName() {
        return this.CosObjectName;
    }

    /**
     * Set 对象存储中代码包文件路径，以/开头

     * @param CosObjectName 对象存储中代码包文件路径，以/开头

     */
    public void setCosObjectName(String CosObjectName) {
        this.CosObjectName = CosObjectName;
    }

    /**
     * Get 对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。
 
     * @return CosBucketRegion 对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。

     */
    public String getCosBucketRegion() {
        return this.CosBucketRegion;
    }

    /**
     * Set 对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。

     * @param CosBucketRegion 对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。

     */
    public void setCosBucketRegion(String CosBucketRegion) {
        this.CosBucketRegion = CosBucketRegion;
    }

    /**
     * Get 如果是从TempCos创建的话，需要传入TempCosObjectName 
     * @return TempCosObjectName 如果是从TempCos创建的话，需要传入TempCosObjectName
     */
    public String getTempCosObjectName() {
        return this.TempCosObjectName;
    }

    /**
     * Set 如果是从TempCos创建的话，需要传入TempCosObjectName
     * @param TempCosObjectName 如果是从TempCos创建的话，需要传入TempCosObjectName
     */
    public void setTempCosObjectName(String TempCosObjectName) {
        this.TempCosObjectName = TempCosObjectName;
    }

    /**
     * Get 如果是通过Demo创建的话，需要传入DemoId
 
     * @return DemoId 如果是通过Demo创建的话，需要传入DemoId

     */
    public String getDemoId() {
        return this.DemoId;
    }

    /**
     * Set 如果是通过Demo创建的话，需要传入DemoId

     * @param DemoId 如果是通过Demo创建的话，需要传入DemoId

     */
    public void setDemoId(String DemoId) {
        this.DemoId = DemoId;
    }

    /**
     * Get 上传云开发cos后返回的时间戳 
     * @return CosTimestamp 上传云开发cos后返回的时间戳
     */
    public String getCosTimestamp() {
        return this.CosTimestamp;
    }

    /**
     * Set 上传云开发cos后返回的时间戳
     * @param CosTimestamp 上传云开发cos后返回的时间戳
     */
    public void setCosTimestamp(String CosTimestamp) {
        this.CosTimestamp = CosTimestamp;
    }

    public CodeReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeReq(CodeReq source) {
        if (source.ZipFile != null) {
            this.ZipFile = new String(source.ZipFile);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CosObjectName != null) {
            this.CosObjectName = new String(source.CosObjectName);
        }
        if (source.CosBucketRegion != null) {
            this.CosBucketRegion = new String(source.CosBucketRegion);
        }
        if (source.TempCosObjectName != null) {
            this.TempCosObjectName = new String(source.TempCosObjectName);
        }
        if (source.DemoId != null) {
            this.DemoId = new String(source.DemoId);
        }
        if (source.CosTimestamp != null) {
            this.CosTimestamp = new String(source.CosTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZipFile", this.ZipFile);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosObjectName", this.CosObjectName);
        this.setParamSimple(map, prefix + "CosBucketRegion", this.CosBucketRegion);
        this.setParamSimple(map, prefix + "TempCosObjectName", this.TempCosObjectName);
        this.setParamSimple(map, prefix + "DemoId", this.DemoId);
        this.setParamSimple(map, prefix + "CosTimestamp", this.CosTimestamp);

    }
}

