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

public class SceneAigcVideoOutputConfig extends AbstractModel {

    /**
    * <p>存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li><br>默认值：Temporary</p><p>当使用角色场景时，不支持指定为 Permanent。</p>
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * <p>输出文件名，最长 64 个字符。缺省由系统指定生成文件名。</p>
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/7812">创建分类</a> 接口，创建分类，获得分类 ID。</p><li>默认值：0，表示其他分类。</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>指定所生成视频的宽高比。输入格式为 W:H。</p><ul><li>当生商品图场景时，可选：16:9、9:16。</li><li>当角色场景时，可选：21:9、16:9、9:16、4:3、3:4、1:1。</li></ul>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>生成视频时长。</p><ul><li>当使用生商品图场景时，可选值4、6、8秒。</li><li>当使用角色场景时，可选值为4到15秒。</li></ul>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * <p>分辨率。仅当角色场景时有效。取值如下：</p><ul><li>当 Model 是 character_scene_standard 时，支持 480p、720p、1080p、4K；</li><li>当 Model 是 character_scene_mini 时，支持 480p、720p；</li><li>当 Model 是 character_scene_fast 时，支持 720p。</li></ul>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get <p>存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li><br>默认值：Temporary</p><p>当使用角色场景时，不支持指定为 Permanent。</p> 
     * @return StorageMode <p>存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li><br>默认值：Temporary</p><p>当使用角色场景时，不支持指定为 Permanent。</p>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li><br>默认值：Temporary</p><p>当使用角色场景时，不支持指定为 Permanent。</p>
     * @param StorageMode <p>存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li><br>默认值：Temporary</p><p>当使用角色场景时，不支持指定为 Permanent。</p>
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get <p>输出文件名，最长 64 个字符。缺省由系统指定生成文件名。</p> 
     * @return MediaName <p>输出文件名，最长 64 个字符。缺省由系统指定生成文件名。</p>
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set <p>输出文件名，最长 64 个字符。缺省由系统指定生成文件名。</p>
     * @param MediaName <p>输出文件名，最长 64 个字符。缺省由系统指定生成文件名。</p>
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/7812">创建分类</a> 接口，创建分类，获得分类 ID。</p><li>默认值：0，表示其他分类。</li> 
     * @return ClassId <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/7812">创建分类</a> 接口，创建分类，获得分类 ID。</p><li>默认值：0，表示其他分类。</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/7812">创建分类</a> 接口，创建分类，获得分类 ID。</p><li>默认值：0，表示其他分类。</li>
     * @param ClassId <p>分类ID，用于对媒体进行分类管理，可通过 <a href="/document/product/266/7812">创建分类</a> 接口，创建分类，获得分类 ID。</p><li>默认值：0，表示其他分类。</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
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
     * Get <p>指定所生成视频的宽高比。输入格式为 W:H。</p><ul><li>当生商品图场景时，可选：16:9、9:16。</li><li>当角色场景时，可选：21:9、16:9、9:16、4:3、3:4、1:1。</li></ul> 
     * @return AspectRatio <p>指定所生成视频的宽高比。输入格式为 W:H。</p><ul><li>当生商品图场景时，可选：16:9、9:16。</li><li>当角色场景时，可选：21:9、16:9、9:16、4:3、3:4、1:1。</li></ul>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>指定所生成视频的宽高比。输入格式为 W:H。</p><ul><li>当生商品图场景时，可选：16:9、9:16。</li><li>当角色场景时，可选：21:9、16:9、9:16、4:3、3:4、1:1。</li></ul>
     * @param AspectRatio <p>指定所生成视频的宽高比。输入格式为 W:H。</p><ul><li>当生商品图场景时，可选：16:9、9:16。</li><li>当角色场景时，可选：21:9、16:9、9:16、4:3、3:4、1:1。</li></ul>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>生成视频时长。</p><ul><li>当使用生商品图场景时，可选值4、6、8秒。</li><li>当使用角色场景时，可选值为4到15秒。</li></ul> 
     * @return Duration <p>生成视频时长。</p><ul><li>当使用生商品图场景时，可选值4、6、8秒。</li><li>当使用角色场景时，可选值为4到15秒。</li></ul>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>生成视频时长。</p><ul><li>当使用生商品图场景时，可选值4、6、8秒。</li><li>当使用角色场景时，可选值为4到15秒。</li></ul>
     * @param Duration <p>生成视频时长。</p><ul><li>当使用生商品图场景时，可选值4、6、8秒。</li><li>当使用角色场景时，可选值为4到15秒。</li></ul>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>分辨率。仅当角色场景时有效。取值如下：</p><ul><li>当 Model 是 character_scene_standard 时，支持 480p、720p、1080p、4K；</li><li>当 Model 是 character_scene_mini 时，支持 480p、720p；</li><li>当 Model 是 character_scene_fast 时，支持 720p。</li></ul> 
     * @return Resolution <p>分辨率。仅当角色场景时有效。取值如下：</p><ul><li>当 Model 是 character_scene_standard 时，支持 480p、720p、1080p、4K；</li><li>当 Model 是 character_scene_mini 时，支持 480p、720p；</li><li>当 Model 是 character_scene_fast 时，支持 720p。</li></ul>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>分辨率。仅当角色场景时有效。取值如下：</p><ul><li>当 Model 是 character_scene_standard 时，支持 480p、720p、1080p、4K；</li><li>当 Model 是 character_scene_mini 时，支持 480p、720p；</li><li>当 Model 是 character_scene_fast 时，支持 720p。</li></ul>
     * @param Resolution <p>分辨率。仅当角色场景时有效。取值如下：</p><ul><li>当 Model 是 character_scene_standard 时，支持 480p、720p、1080p、4K；</li><li>当 Model 是 character_scene_mini 时，支持 480p、720p；</li><li>当 Model 是 character_scene_fast 时，支持 720p。</li></ul>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public SceneAigcVideoOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcVideoOutputConfig(SceneAigcVideoOutputConfig source) {
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
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
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
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

