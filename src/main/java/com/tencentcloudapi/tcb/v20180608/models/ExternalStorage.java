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

public class ExternalStorage extends AbstractModel {

    /**
    * 桶名。
当 Provider=cos 时，表示腾讯云对象存储桶。
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Bucket所属地域。
当 Provider=cos 时，表示腾讯云对象存储桶的所属地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 基础路径。
绑定之后，用户访问云存储内的文件，后台会自动以BasePath作为前缀，拼接到所访问的文件中。
例如：
  BasePath=my-cloudbase-path ， 当用户访问云存储内的 /tencentcloud.png 时，实际访问的完整路径是：/my-cloudbase-path/tencentcloud.png
    */
    @SerializedName("BasePath")
    @Expose
    private String BasePath;

    /**
    * 是否启用外部存储
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get 桶名。
当 Provider=cos 时，表示腾讯云对象存储桶。 
     * @return BucketName 桶名。
当 Provider=cos 时，表示腾讯云对象存储桶。
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 桶名。
当 Provider=cos 时，表示腾讯云对象存储桶。
     * @param BucketName 桶名。
当 Provider=cos 时，表示腾讯云对象存储桶。
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Bucket所属地域。
当 Provider=cos 时，表示腾讯云对象存储桶的所属地域。 
     * @return Region Bucket所属地域。
当 Provider=cos 时，表示腾讯云对象存储桶的所属地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Bucket所属地域。
当 Provider=cos 时，表示腾讯云对象存储桶的所属地域。
     * @param Region Bucket所属地域。
当 Provider=cos 时，表示腾讯云对象存储桶的所属地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 基础路径。
绑定之后，用户访问云存储内的文件，后台会自动以BasePath作为前缀，拼接到所访问的文件中。
例如：
  BasePath=my-cloudbase-path ， 当用户访问云存储内的 /tencentcloud.png 时，实际访问的完整路径是：/my-cloudbase-path/tencentcloud.png 
     * @return BasePath 基础路径。
绑定之后，用户访问云存储内的文件，后台会自动以BasePath作为前缀，拼接到所访问的文件中。
例如：
  BasePath=my-cloudbase-path ， 当用户访问云存储内的 /tencentcloud.png 时，实际访问的完整路径是：/my-cloudbase-path/tencentcloud.png
     */
    public String getBasePath() {
        return this.BasePath;
    }

    /**
     * Set 基础路径。
绑定之后，用户访问云存储内的文件，后台会自动以BasePath作为前缀，拼接到所访问的文件中。
例如：
  BasePath=my-cloudbase-path ， 当用户访问云存储内的 /tencentcloud.png 时，实际访问的完整路径是：/my-cloudbase-path/tencentcloud.png
     * @param BasePath 基础路径。
绑定之后，用户访问云存储内的文件，后台会自动以BasePath作为前缀，拼接到所访问的文件中。
例如：
  BasePath=my-cloudbase-path ， 当用户访问云存储内的 /tencentcloud.png 时，实际访问的完整路径是：/my-cloudbase-path/tencentcloud.png
     */
    public void setBasePath(String BasePath) {
        this.BasePath = BasePath;
    }

    /**
     * Get 是否启用外部存储 
     * @return Enabled 是否启用外部存储
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用外部存储
     * @param Enabled 是否启用外部存储
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public ExternalStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalStorage(ExternalStorage source) {
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BasePath != null) {
            this.BasePath = new String(source.BasePath);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BasePath", this.BasePath);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

