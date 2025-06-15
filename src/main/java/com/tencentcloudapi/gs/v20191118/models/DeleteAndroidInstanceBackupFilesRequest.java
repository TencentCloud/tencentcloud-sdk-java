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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAndroidInstanceBackupFilesRequest extends AbstractModel {

    /**
    * 文件对象键列表
    */
    @SerializedName("ObjectKeys")
    @Expose
    private String [] ObjectKeys;

    /**
    * 存储服务器类型，如 COS、S3。注意：使用 COS 和 S3 都将占用外网带宽。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * COS协议选项
    */
    @SerializedName("COSOptions")
    @Expose
    private COSOptions COSOptions;

    /**
    * S3存储协议选项
    */
    @SerializedName("S3Options")
    @Expose
    private S3Options S3Options;

    /**
    * 安卓实例可用区。StorageType 为 S3 时，需要填写该字段；StorageType 为 COS 时，不需要填写该字段
    */
    @SerializedName("AndroidInstanceZone")
    @Expose
    private String AndroidInstanceZone;

    /**
     * Get 文件对象键列表 
     * @return ObjectKeys 文件对象键列表
     */
    public String [] getObjectKeys() {
        return this.ObjectKeys;
    }

    /**
     * Set 文件对象键列表
     * @param ObjectKeys 文件对象键列表
     */
    public void setObjectKeys(String [] ObjectKeys) {
        this.ObjectKeys = ObjectKeys;
    }

    /**
     * Get 存储服务器类型，如 COS、S3。注意：使用 COS 和 S3 都将占用外网带宽。 
     * @return StorageType 存储服务器类型，如 COS、S3。注意：使用 COS 和 S3 都将占用外网带宽。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储服务器类型，如 COS、S3。注意：使用 COS 和 S3 都将占用外网带宽。
     * @param StorageType 存储服务器类型，如 COS、S3。注意：使用 COS 和 S3 都将占用外网带宽。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get COS协议选项 
     * @return COSOptions COS协议选项
     */
    public COSOptions getCOSOptions() {
        return this.COSOptions;
    }

    /**
     * Set COS协议选项
     * @param COSOptions COS协议选项
     */
    public void setCOSOptions(COSOptions COSOptions) {
        this.COSOptions = COSOptions;
    }

    /**
     * Get S3存储协议选项 
     * @return S3Options S3存储协议选项
     */
    public S3Options getS3Options() {
        return this.S3Options;
    }

    /**
     * Set S3存储协议选项
     * @param S3Options S3存储协议选项
     */
    public void setS3Options(S3Options S3Options) {
        this.S3Options = S3Options;
    }

    /**
     * Get 安卓实例可用区。StorageType 为 S3 时，需要填写该字段；StorageType 为 COS 时，不需要填写该字段 
     * @return AndroidInstanceZone 安卓实例可用区。StorageType 为 S3 时，需要填写该字段；StorageType 为 COS 时，不需要填写该字段
     */
    public String getAndroidInstanceZone() {
        return this.AndroidInstanceZone;
    }

    /**
     * Set 安卓实例可用区。StorageType 为 S3 时，需要填写该字段；StorageType 为 COS 时，不需要填写该字段
     * @param AndroidInstanceZone 安卓实例可用区。StorageType 为 S3 时，需要填写该字段；StorageType 为 COS 时，不需要填写该字段
     */
    public void setAndroidInstanceZone(String AndroidInstanceZone) {
        this.AndroidInstanceZone = AndroidInstanceZone;
    }

    public DeleteAndroidInstanceBackupFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAndroidInstanceBackupFilesRequest(DeleteAndroidInstanceBackupFilesRequest source) {
        if (source.ObjectKeys != null) {
            this.ObjectKeys = new String[source.ObjectKeys.length];
            for (int i = 0; i < source.ObjectKeys.length; i++) {
                this.ObjectKeys[i] = new String(source.ObjectKeys[i]);
            }
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.COSOptions != null) {
            this.COSOptions = new COSOptions(source.COSOptions);
        }
        if (source.S3Options != null) {
            this.S3Options = new S3Options(source.S3Options);
        }
        if (source.AndroidInstanceZone != null) {
            this.AndroidInstanceZone = new String(source.AndroidInstanceZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ObjectKeys.", this.ObjectKeys);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamObj(map, prefix + "COSOptions.", this.COSOptions);
        this.setParamObj(map, prefix + "S3Options.", this.S3Options);
        this.setParamSimple(map, prefix + "AndroidInstanceZone", this.AndroidInstanceZone);

    }
}

