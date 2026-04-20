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

public class AigcVideoRedrawOutputConfig extends AbstractModel {

    /**
    * <p>存储模式。取值有： <li>Permanent：永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>默认值：Temporary</p>
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * <p>输出媒体文件名，最长 64 个字符。缺省由系统指定生成文件名。</p>
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/7812">创建分类</a> 接口，创建分类，获得分类 ID。<li>默认值：0，表示其他分类。</li></p>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p><p>参数格式：2025-12-28T00:35:00Z</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get <p>存储模式。取值有： <li>Permanent：永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>默认值：Temporary</p> 
     * @return StorageMode <p>存储模式。取值有： <li>Permanent：永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>默认值：Temporary</p>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>存储模式。取值有： <li>Permanent：永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>默认值：Temporary</p>
     * @param StorageMode <p>存储模式。取值有： <li>Permanent：永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>默认值：Temporary</p>
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get <p>输出媒体文件名，最长 64 个字符。缺省由系统指定生成文件名。</p> 
     * @return MediaName <p>输出媒体文件名，最长 64 个字符。缺省由系统指定生成文件名。</p>
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set <p>输出媒体文件名，最长 64 个字符。缺省由系统指定生成文件名。</p>
     * @param MediaName <p>输出媒体文件名，最长 64 个字符。缺省由系统指定生成文件名。</p>
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/7812">创建分类</a> 接口，创建分类，获得分类 ID。<li>默认值：0，表示其他分类。</li></p> 
     * @return ClassId <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/7812">创建分类</a> 接口，创建分类，获得分类 ID。<li>默认值：0，表示其他分类。</li></p>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/7812">创建分类</a> 接口，创建分类，获得分类 ID。<li>默认值：0，表示其他分类。</li></p>
     * @param ClassId <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/7812">创建分类</a> 接口，创建分类，获得分类 ID。<li>默认值：0，表示其他分类。</li></p>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p><p>参数格式：2025-12-28T00:35:00Z</p> 
     * @return ExpireTime <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p><p>参数格式：2025-12-28T00:35:00Z</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p><p>参数格式：2025-12-28T00:35:00Z</p>
     * @param ExpireTime <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p><p>参数格式：2025-12-28T00:35:00Z</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public AigcVideoRedrawOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoRedrawOutputConfig(AigcVideoRedrawOutputConfig source) {
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

