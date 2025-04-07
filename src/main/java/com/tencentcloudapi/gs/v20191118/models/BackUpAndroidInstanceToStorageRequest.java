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

public class BackUpAndroidInstanceToStorageRequest extends AbstractModel {

    /**
    * 安卓实例ID
    */
    @SerializedName("AndroidInstanceId")
    @Expose
    private String AndroidInstanceId;

    /**
    * 存储服务器类型，如 COS、S3。注意：使用 COS 和 S3 都将占用外网带宽。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 自定义对象Key
    */
    @SerializedName("ObjectKey")
    @Expose
    private String ObjectKey;

    /**
    * 包含的路径，支持仅含一个通配符*，通配符不能出现在路径开始
    */
    @SerializedName("Includes")
    @Expose
    private String [] Includes;

    /**
    * 需要排除路径，支持仅含一个通配符*，通配符不能出现在路径开始
    */
    @SerializedName("Excludes")
    @Expose
    private String [] Excludes;

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
     * Get 安卓实例ID 
     * @return AndroidInstanceId 安卓实例ID
     */
    public String getAndroidInstanceId() {
        return this.AndroidInstanceId;
    }

    /**
     * Set 安卓实例ID
     * @param AndroidInstanceId 安卓实例ID
     */
    public void setAndroidInstanceId(String AndroidInstanceId) {
        this.AndroidInstanceId = AndroidInstanceId;
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
     * Get 自定义对象Key 
     * @return ObjectKey 自定义对象Key
     */
    public String getObjectKey() {
        return this.ObjectKey;
    }

    /**
     * Set 自定义对象Key
     * @param ObjectKey 自定义对象Key
     */
    public void setObjectKey(String ObjectKey) {
        this.ObjectKey = ObjectKey;
    }

    /**
     * Get 包含的路径，支持仅含一个通配符*，通配符不能出现在路径开始 
     * @return Includes 包含的路径，支持仅含一个通配符*，通配符不能出现在路径开始
     */
    public String [] getIncludes() {
        return this.Includes;
    }

    /**
     * Set 包含的路径，支持仅含一个通配符*，通配符不能出现在路径开始
     * @param Includes 包含的路径，支持仅含一个通配符*，通配符不能出现在路径开始
     */
    public void setIncludes(String [] Includes) {
        this.Includes = Includes;
    }

    /**
     * Get 需要排除路径，支持仅含一个通配符*，通配符不能出现在路径开始 
     * @return Excludes 需要排除路径，支持仅含一个通配符*，通配符不能出现在路径开始
     */
    public String [] getExcludes() {
        return this.Excludes;
    }

    /**
     * Set 需要排除路径，支持仅含一个通配符*，通配符不能出现在路径开始
     * @param Excludes 需要排除路径，支持仅含一个通配符*，通配符不能出现在路径开始
     */
    public void setExcludes(String [] Excludes) {
        this.Excludes = Excludes;
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

    public BackUpAndroidInstanceToStorageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackUpAndroidInstanceToStorageRequest(BackUpAndroidInstanceToStorageRequest source) {
        if (source.AndroidInstanceId != null) {
            this.AndroidInstanceId = new String(source.AndroidInstanceId);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.ObjectKey != null) {
            this.ObjectKey = new String(source.ObjectKey);
        }
        if (source.Includes != null) {
            this.Includes = new String[source.Includes.length];
            for (int i = 0; i < source.Includes.length; i++) {
                this.Includes[i] = new String(source.Includes[i]);
            }
        }
        if (source.Excludes != null) {
            this.Excludes = new String[source.Excludes.length];
            for (int i = 0; i < source.Excludes.length; i++) {
                this.Excludes[i] = new String(source.Excludes[i]);
            }
        }
        if (source.COSOptions != null) {
            this.COSOptions = new COSOptions(source.COSOptions);
        }
        if (source.S3Options != null) {
            this.S3Options = new S3Options(source.S3Options);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidInstanceId", this.AndroidInstanceId);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "ObjectKey", this.ObjectKey);
        this.setParamArraySimple(map, prefix + "Includes.", this.Includes);
        this.setParamArraySimple(map, prefix + "Excludes.", this.Excludes);
        this.setParamObj(map, prefix + "COSOptions.", this.COSOptions);
        this.setParamObj(map, prefix + "S3Options.", this.S3Options);

    }
}

