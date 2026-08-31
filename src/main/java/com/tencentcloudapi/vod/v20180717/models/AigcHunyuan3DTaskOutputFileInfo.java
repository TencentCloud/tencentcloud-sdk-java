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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcHunyuan3DTaskOutputFileInfo extends AbstractModel {

    /**
    * <p>存储模式。取值有： <li>Permanent：永久存储；</li> <li>Temporary：临时存储；</li> 默认值：Temporary</p>
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>文件类型，例如 OBJ、GLB、FBX 等。</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>输出文件地址。</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>输出文件预览地址。</p><p>无文件预览地址时为空。</p>
    */
    @SerializedName("PreviewFileUrl")
    @Expose
    private String PreviewFileUrl;

    /**
     * Get <p>存储模式。取值有： <li>Permanent：永久存储；</li> <li>Temporary：临时存储；</li> 默认值：Temporary</p> 
     * @return StorageMode <p>存储模式。取值有： <li>Permanent：永久存储；</li> <li>Temporary：临时存储；</li> 默认值：Temporary</p>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>存储模式。取值有： <li>Permanent：永久存储；</li> <li>Temporary：临时存储；</li> 默认值：Temporary</p>
     * @param StorageMode <p>存储模式。取值有： <li>Permanent：永久存储；</li> <li>Temporary：临时存储；</li> 默认值：Temporary</p>
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p> 
     * @return ExpireTime <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     * @param ExpireTime <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>文件类型，例如 OBJ、GLB、FBX 等。</p> 
     * @return FileType <p>文件类型，例如 OBJ、GLB、FBX 等。</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>文件类型，例如 OBJ、GLB、FBX 等。</p>
     * @param FileType <p>文件类型，例如 OBJ、GLB、FBX 等。</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>输出文件地址。</p> 
     * @return FileUrl <p>输出文件地址。</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>输出文件地址。</p>
     * @param FileUrl <p>输出文件地址。</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>输出文件预览地址。</p><p>无文件预览地址时为空。</p> 
     * @return PreviewFileUrl <p>输出文件预览地址。</p><p>无文件预览地址时为空。</p>
     */
    public String getPreviewFileUrl() {
        return this.PreviewFileUrl;
    }

    /**
     * Set <p>输出文件预览地址。</p><p>无文件预览地址时为空。</p>
     * @param PreviewFileUrl <p>输出文件预览地址。</p><p>无文件预览地址时为空。</p>
     */
    public void setPreviewFileUrl(String PreviewFileUrl) {
        this.PreviewFileUrl = PreviewFileUrl;
    }

    public AigcHunyuan3DTaskOutputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcHunyuan3DTaskOutputFileInfo(AigcHunyuan3DTaskOutputFileInfo source) {
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.PreviewFileUrl != null) {
            this.PreviewFileUrl = new String(source.PreviewFileUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "PreviewFileUrl", this.PreviewFileUrl);

    }
}

