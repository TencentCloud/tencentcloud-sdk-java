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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Code  extends AbstractModel{

    /**
    * 对象存储桶名称
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 对象存储对象路径
    */
    @SerializedName("CosObjectName")
    @Expose
    private String CosObjectName;

    /**
    * 包含函数代码文件及其依赖项的 zip 格式文件，使用该接口时要求将 zip 文件的内容转成 base64 编码，最大支持20M
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
    * 如果是通过Demo创建的话，需要传入DemoId
    */
    @SerializedName("DemoId")
    @Expose
    private String DemoId;

    /**
    * 如果是从TempCos创建的话，需要传入TempCosObjectName
    */
    @SerializedName("TempCosObjectName")
    @Expose
    private String TempCosObjectName;

    /**
     * 获取对象存储桶名称
     * @return CosBucketName 对象存储桶名称
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * 设置对象存储桶名称
     * @param CosBucketName 对象存储桶名称
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * 获取对象存储对象路径
     * @return CosObjectName 对象存储对象路径
     */
    public String getCosObjectName() {
        return this.CosObjectName;
    }

    /**
     * 设置对象存储对象路径
     * @param CosObjectName 对象存储对象路径
     */
    public void setCosObjectName(String CosObjectName) {
        this.CosObjectName = CosObjectName;
    }

    /**
     * 获取包含函数代码文件及其依赖项的 zip 格式文件，使用该接口时要求将 zip 文件的内容转成 base64 编码，最大支持20M
     * @return ZipFile 包含函数代码文件及其依赖项的 zip 格式文件，使用该接口时要求将 zip 文件的内容转成 base64 编码，最大支持20M
     */
    public String getZipFile() {
        return this.ZipFile;
    }

    /**
     * 设置包含函数代码文件及其依赖项的 zip 格式文件，使用该接口时要求将 zip 文件的内容转成 base64 编码，最大支持20M
     * @param ZipFile 包含函数代码文件及其依赖项的 zip 格式文件，使用该接口时要求将 zip 文件的内容转成 base64 编码，最大支持20M
     */
    public void setZipFile(String ZipFile) {
        this.ZipFile = ZipFile;
    }

    /**
     * 获取对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。
     * @return CosBucketRegion 对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。
     */
    public String getCosBucketRegion() {
        return this.CosBucketRegion;
    }

    /**
     * 设置对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。
     * @param CosBucketRegion 对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。
     */
    public void setCosBucketRegion(String CosBucketRegion) {
        this.CosBucketRegion = CosBucketRegion;
    }

    /**
     * 获取如果是通过Demo创建的话，需要传入DemoId
     * @return DemoId 如果是通过Demo创建的话，需要传入DemoId
     */
    public String getDemoId() {
        return this.DemoId;
    }

    /**
     * 设置如果是通过Demo创建的话，需要传入DemoId
     * @param DemoId 如果是通过Demo创建的话，需要传入DemoId
     */
    public void setDemoId(String DemoId) {
        this.DemoId = DemoId;
    }

    /**
     * 获取如果是从TempCos创建的话，需要传入TempCosObjectName
     * @return TempCosObjectName 如果是从TempCos创建的话，需要传入TempCosObjectName
     */
    public String getTempCosObjectName() {
        return this.TempCosObjectName;
    }

    /**
     * 设置如果是从TempCos创建的话，需要传入TempCosObjectName
     * @param TempCosObjectName 如果是从TempCos创建的话，需要传入TempCosObjectName
     */
    public void setTempCosObjectName(String TempCosObjectName) {
        this.TempCosObjectName = TempCosObjectName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosObjectName", this.CosObjectName);
        this.setParamSimple(map, prefix + "ZipFile", this.ZipFile);
        this.setParamSimple(map, prefix + "CosBucketRegion", this.CosBucketRegion);
        this.setParamSimple(map, prefix + "DemoId", this.DemoId);
        this.setParamSimple(map, prefix + "TempCosObjectName", this.TempCosObjectName);

    }
}

