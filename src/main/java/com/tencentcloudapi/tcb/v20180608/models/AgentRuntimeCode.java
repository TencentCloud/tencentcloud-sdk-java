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

public class AgentRuntimeCode extends AbstractModel {

    /**
    * 对象存储桶名称
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
    * 包含函数代码文件及其依赖项的 zip 格式文件，zip包大小上限为 50MB，使用该接口时要求将 zip 文件的内容转成 base64 编码
    */
    @SerializedName("ZipFile")
    @Expose
    private String ZipFile;

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
    * 镜像部署时配置TCR镜像信息
    */
    @SerializedName("ImageConfig")
    @Expose
    private AgentRuntimeCodeImageConfig ImageConfig;

    /**
    * 云函数DemoId
    */
    @SerializedName("DemoId")
    @Expose
    private String DemoId;

    /**
     * Get 对象存储桶名称 
     * @return CosBucketName 对象存储桶名称
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set 对象存储桶名称
     * @param CosBucketName 对象存储桶名称
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
     * Get 包含函数代码文件及其依赖项的 zip 格式文件，zip包大小上限为 50MB，使用该接口时要求将 zip 文件的内容转成 base64 编码 
     * @return ZipFile 包含函数代码文件及其依赖项的 zip 格式文件，zip包大小上限为 50MB，使用该接口时要求将 zip 文件的内容转成 base64 编码
     */
    public String getZipFile() {
        return this.ZipFile;
    }

    /**
     * Set 包含函数代码文件及其依赖项的 zip 格式文件，zip包大小上限为 50MB，使用该接口时要求将 zip 文件的内容转成 base64 编码
     * @param ZipFile 包含函数代码文件及其依赖项的 zip 格式文件，zip包大小上限为 50MB，使用该接口时要求将 zip 文件的内容转成 base64 编码
     */
    public void setZipFile(String ZipFile) {
        this.ZipFile = ZipFile;
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
     * Get 镜像部署时配置TCR镜像信息 
     * @return ImageConfig 镜像部署时配置TCR镜像信息
     */
    public AgentRuntimeCodeImageConfig getImageConfig() {
        return this.ImageConfig;
    }

    /**
     * Set 镜像部署时配置TCR镜像信息
     * @param ImageConfig 镜像部署时配置TCR镜像信息
     */
    public void setImageConfig(AgentRuntimeCodeImageConfig ImageConfig) {
        this.ImageConfig = ImageConfig;
    }

    /**
     * Get 云函数DemoId 
     * @return DemoId 云函数DemoId
     */
    public String getDemoId() {
        return this.DemoId;
    }

    /**
     * Set 云函数DemoId
     * @param DemoId 云函数DemoId
     */
    public void setDemoId(String DemoId) {
        this.DemoId = DemoId;
    }

    public AgentRuntimeCode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentRuntimeCode(AgentRuntimeCode source) {
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CosObjectName != null) {
            this.CosObjectName = new String(source.CosObjectName);
        }
        if (source.ZipFile != null) {
            this.ZipFile = new String(source.ZipFile);
        }
        if (source.CosBucketRegion != null) {
            this.CosBucketRegion = new String(source.CosBucketRegion);
        }
        if (source.TempCosObjectName != null) {
            this.TempCosObjectName = new String(source.TempCosObjectName);
        }
        if (source.ImageConfig != null) {
            this.ImageConfig = new AgentRuntimeCodeImageConfig(source.ImageConfig);
        }
        if (source.DemoId != null) {
            this.DemoId = new String(source.DemoId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosObjectName", this.CosObjectName);
        this.setParamSimple(map, prefix + "ZipFile", this.ZipFile);
        this.setParamSimple(map, prefix + "CosBucketRegion", this.CosBucketRegion);
        this.setParamSimple(map, prefix + "TempCosObjectName", this.TempCosObjectName);
        this.setParamObj(map, prefix + "ImageConfig.", this.ImageConfig);
        this.setParamSimple(map, prefix + "DemoId", this.DemoId);

    }
}

