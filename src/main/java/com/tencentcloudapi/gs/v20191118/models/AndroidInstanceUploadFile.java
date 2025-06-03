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

public class AndroidInstanceUploadFile extends AbstractModel {

    /**
    * 安卓实例 ID
    */
    @SerializedName("AndroidInstanceId")
    @Expose
    private String AndroidInstanceId;

    /**
    * 文件上传 URL
    */
    @SerializedName("FileURL")
    @Expose
    private String FileURL;

    /**
    * 上传目标目录，只能上传到 /sdcard/ 目录或其子目录下
    */
    @SerializedName("DestinationDirectory")
    @Expose
    private String DestinationDirectory;

    /**
     * Get 安卓实例 ID 
     * @return AndroidInstanceId 安卓实例 ID
     */
    public String getAndroidInstanceId() {
        return this.AndroidInstanceId;
    }

    /**
     * Set 安卓实例 ID
     * @param AndroidInstanceId 安卓实例 ID
     */
    public void setAndroidInstanceId(String AndroidInstanceId) {
        this.AndroidInstanceId = AndroidInstanceId;
    }

    /**
     * Get 文件上传 URL 
     * @return FileURL 文件上传 URL
     */
    public String getFileURL() {
        return this.FileURL;
    }

    /**
     * Set 文件上传 URL
     * @param FileURL 文件上传 URL
     */
    public void setFileURL(String FileURL) {
        this.FileURL = FileURL;
    }

    /**
     * Get 上传目标目录，只能上传到 /sdcard/ 目录或其子目录下 
     * @return DestinationDirectory 上传目标目录，只能上传到 /sdcard/ 目录或其子目录下
     */
    public String getDestinationDirectory() {
        return this.DestinationDirectory;
    }

    /**
     * Set 上传目标目录，只能上传到 /sdcard/ 目录或其子目录下
     * @param DestinationDirectory 上传目标目录，只能上传到 /sdcard/ 目录或其子目录下
     */
    public void setDestinationDirectory(String DestinationDirectory) {
        this.DestinationDirectory = DestinationDirectory;
    }

    public AndroidInstanceUploadFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidInstanceUploadFile(AndroidInstanceUploadFile source) {
        if (source.AndroidInstanceId != null) {
            this.AndroidInstanceId = new String(source.AndroidInstanceId);
        }
        if (source.FileURL != null) {
            this.FileURL = new String(source.FileURL);
        }
        if (source.DestinationDirectory != null) {
            this.DestinationDirectory = new String(source.DestinationDirectory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidInstanceId", this.AndroidInstanceId);
        this.setParamSimple(map, prefix + "FileURL", this.FileURL);
        this.setParamSimple(map, prefix + "DestinationDirectory", this.DestinationDirectory);

    }
}

