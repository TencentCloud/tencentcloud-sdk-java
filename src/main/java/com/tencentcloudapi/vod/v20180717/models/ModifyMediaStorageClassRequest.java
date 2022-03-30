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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMediaStorageClassRequest extends AbstractModel{

    /**
    * 媒体文件唯一标识列表。
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 目标存储类型。可选值有：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li>
    */
    @SerializedName("StorageClass")
    @Expose
    private String StorageClass;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 取回模式。当文件的存储类型从归档或深度归档转换为标准存储时，需要指定取回（也称为解冻）操作的模式，具体说明请参考[数据取回及取回模式](https://cloud.tencent.com/document/product/266/56196#retake)。
当媒体文件目前的存储类型为归档存储时，有以下取值：
<li>Expedited：极速模式。</li>
<li>Standard：标准模式。</li>
<li>Bulk：批量模式。</li>
当媒体文件目前的存储类型为深度归档存储时，有以下取值：
<li>Standard：标准模式。</li>
<li>Bulk：批量模式。</li>
    */
    @SerializedName("RestoreTier")
    @Expose
    private String RestoreTier;

    /**
     * Get 媒体文件唯一标识列表。 
     * @return FileIds 媒体文件唯一标识列表。
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 媒体文件唯一标识列表。
     * @param FileIds 媒体文件唯一标识列表。
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get 目标存储类型。可选值有：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li> 
     * @return StorageClass 目标存储类型。可选值有：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li>
     */
    public String getStorageClass() {
        return this.StorageClass;
    }

    /**
     * Set 目标存储类型。可选值有：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li>
     * @param StorageClass 目标存储类型。可选值有：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li>
     */
    public void setStorageClass(String StorageClass) {
        this.StorageClass = StorageClass;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 取回模式。当文件的存储类型从归档或深度归档转换为标准存储时，需要指定取回（也称为解冻）操作的模式，具体说明请参考[数据取回及取回模式](https://cloud.tencent.com/document/product/266/56196#retake)。
当媒体文件目前的存储类型为归档存储时，有以下取值：
<li>Expedited：极速模式。</li>
<li>Standard：标准模式。</li>
<li>Bulk：批量模式。</li>
当媒体文件目前的存储类型为深度归档存储时，有以下取值：
<li>Standard：标准模式。</li>
<li>Bulk：批量模式。</li> 
     * @return RestoreTier 取回模式。当文件的存储类型从归档或深度归档转换为标准存储时，需要指定取回（也称为解冻）操作的模式，具体说明请参考[数据取回及取回模式](https://cloud.tencent.com/document/product/266/56196#retake)。
当媒体文件目前的存储类型为归档存储时，有以下取值：
<li>Expedited：极速模式。</li>
<li>Standard：标准模式。</li>
<li>Bulk：批量模式。</li>
当媒体文件目前的存储类型为深度归档存储时，有以下取值：
<li>Standard：标准模式。</li>
<li>Bulk：批量模式。</li>
     */
    public String getRestoreTier() {
        return this.RestoreTier;
    }

    /**
     * Set 取回模式。当文件的存储类型从归档或深度归档转换为标准存储时，需要指定取回（也称为解冻）操作的模式，具体说明请参考[数据取回及取回模式](https://cloud.tencent.com/document/product/266/56196#retake)。
当媒体文件目前的存储类型为归档存储时，有以下取值：
<li>Expedited：极速模式。</li>
<li>Standard：标准模式。</li>
<li>Bulk：批量模式。</li>
当媒体文件目前的存储类型为深度归档存储时，有以下取值：
<li>Standard：标准模式。</li>
<li>Bulk：批量模式。</li>
     * @param RestoreTier 取回模式。当文件的存储类型从归档或深度归档转换为标准存储时，需要指定取回（也称为解冻）操作的模式，具体说明请参考[数据取回及取回模式](https://cloud.tencent.com/document/product/266/56196#retake)。
当媒体文件目前的存储类型为归档存储时，有以下取值：
<li>Expedited：极速模式。</li>
<li>Standard：标准模式。</li>
<li>Bulk：批量模式。</li>
当媒体文件目前的存储类型为深度归档存储时，有以下取值：
<li>Standard：标准模式。</li>
<li>Bulk：批量模式。</li>
     */
    public void setRestoreTier(String RestoreTier) {
        this.RestoreTier = RestoreTier;
    }

    public ModifyMediaStorageClassRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMediaStorageClassRequest(ModifyMediaStorageClassRequest source) {
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.StorageClass != null) {
            this.StorageClass = new String(source.StorageClass);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RestoreTier != null) {
            this.RestoreTier = new String(source.RestoreTier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "StorageClass", this.StorageClass);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "RestoreTier", this.RestoreTier);

    }
}

