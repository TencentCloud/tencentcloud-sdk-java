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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskInfo extends AbstractModel {

    /**
    * 云硬盘ID
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 云盘的镜像格式。QCOW2:  qcow2格式，这种格式的云盘不能用于容灾；RAW：raw格式，可以用于容灾。
    */
    @SerializedName("ImageFormat")
    @Expose
    private String ImageFormat;

    /**
     * Get 云硬盘ID 
     * @return DiskId 云硬盘ID
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 云硬盘ID
     * @param DiskId 云硬盘ID
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 云盘的镜像格式。QCOW2:  qcow2格式，这种格式的云盘不能用于容灾；RAW：raw格式，可以用于容灾。 
     * @return ImageFormat 云盘的镜像格式。QCOW2:  qcow2格式，这种格式的云盘不能用于容灾；RAW：raw格式，可以用于容灾。
     */
    public String getImageFormat() {
        return this.ImageFormat;
    }

    /**
     * Set 云盘的镜像格式。QCOW2:  qcow2格式，这种格式的云盘不能用于容灾；RAW：raw格式，可以用于容灾。
     * @param ImageFormat 云盘的镜像格式。QCOW2:  qcow2格式，这种格式的云盘不能用于容灾；RAW：raw格式，可以用于容灾。
     */
    public void setImageFormat(String ImageFormat) {
        this.ImageFormat = ImageFormat;
    }

    public DiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskInfo(DiskInfo source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.ImageFormat != null) {
            this.ImageFormat = new String(source.ImageFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "ImageFormat", this.ImageFormat);

    }
}

