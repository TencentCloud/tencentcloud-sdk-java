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

public class SceneAigcImageOutputConfig extends AbstractModel {

    /**
    * <p>存储模式</p><p>枚举值：</p><ul><li>Temporary： 临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL，有效期 7 天</li><li>Permanent： 永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId</li></ul><p>默认值：Temporary</p>
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
    * <p>指定所生成图片的宽高比。输入格式为 W:H。<br>本字段在以下场景有效：</p><ul><li>生商品图场景，可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、16:9、9:16、21:9</li><li>AI扩图场景。可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9，可以配合 ImageWidth 和 ImageHeight 使用，规则如下： <ol><li>仅指定 AspectRatio 时，根据原图输入进行自适应调整。</li><li>指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。</li><li>当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。</li></ol></li></ul>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>输出图片编码格式参数。<strong>仅AI换衣场景有效。</strong></p>
    */
    @SerializedName("EncodeConfig")
    @Expose
    private ImageSceneAigcEncodeConfig EncodeConfig;

    /**
    * <p>输出图像宽度，<strong>仅AI扩图场景有效</strong>。</p>
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * <p>输出图像高度，<strong>仅AI扩图场景有效</strong>。</p>
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * <p>输出分辨率。仅change_clothes、change_clothes_under场景有效。可选值：1K、2K、4K。</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get <p>存储模式</p><p>枚举值：</p><ul><li>Temporary： 临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL，有效期 7 天</li><li>Permanent： 永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId</li></ul><p>默认值：Temporary</p> 
     * @return StorageMode <p>存储模式</p><p>枚举值：</p><ul><li>Temporary： 临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL，有效期 7 天</li><li>Permanent： 永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId</li></ul><p>默认值：Temporary</p>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>存储模式</p><p>枚举值：</p><ul><li>Temporary： 临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL，有效期 7 天</li><li>Permanent： 永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId</li></ul><p>默认值：Temporary</p>
     * @param StorageMode <p>存储模式</p><p>枚举值：</p><ul><li>Temporary： 临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL，有效期 7 天</li><li>Permanent： 永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId</li></ul><p>默认值：Temporary</p>
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
     * Get <p>指定所生成图片的宽高比。输入格式为 W:H。<br>本字段在以下场景有效：</p><ul><li>生商品图场景，可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、16:9、9:16、21:9</li><li>AI扩图场景。可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9，可以配合 ImageWidth 和 ImageHeight 使用，规则如下： <ol><li>仅指定 AspectRatio 时，根据原图输入进行自适应调整。</li><li>指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。</li><li>当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。</li></ol></li></ul> 
     * @return AspectRatio <p>指定所生成图片的宽高比。输入格式为 W:H。<br>本字段在以下场景有效：</p><ul><li>生商品图场景，可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、16:9、9:16、21:9</li><li>AI扩图场景。可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9，可以配合 ImageWidth 和 ImageHeight 使用，规则如下： <ol><li>仅指定 AspectRatio 时，根据原图输入进行自适应调整。</li><li>指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。</li><li>当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。</li></ol></li></ul>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>指定所生成图片的宽高比。输入格式为 W:H。<br>本字段在以下场景有效：</p><ul><li>生商品图场景，可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、16:9、9:16、21:9</li><li>AI扩图场景。可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9，可以配合 ImageWidth 和 ImageHeight 使用，规则如下： <ol><li>仅指定 AspectRatio 时，根据原图输入进行自适应调整。</li><li>指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。</li><li>当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。</li></ol></li></ul>
     * @param AspectRatio <p>指定所生成图片的宽高比。输入格式为 W:H。<br>本字段在以下场景有效：</p><ul><li>生商品图场景，可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、16:9、9:16、21:9</li><li>AI扩图场景。可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9，可以配合 ImageWidth 和 ImageHeight 使用，规则如下： <ol><li>仅指定 AspectRatio 时，根据原图输入进行自适应调整。</li><li>指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。</li><li>当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。</li></ol></li></ul>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>输出图片编码格式参数。<strong>仅AI换衣场景有效。</strong></p> 
     * @return EncodeConfig <p>输出图片编码格式参数。<strong>仅AI换衣场景有效。</strong></p>
     */
    public ImageSceneAigcEncodeConfig getEncodeConfig() {
        return this.EncodeConfig;
    }

    /**
     * Set <p>输出图片编码格式参数。<strong>仅AI换衣场景有效。</strong></p>
     * @param EncodeConfig <p>输出图片编码格式参数。<strong>仅AI换衣场景有效。</strong></p>
     */
    public void setEncodeConfig(ImageSceneAigcEncodeConfig EncodeConfig) {
        this.EncodeConfig = EncodeConfig;
    }

    /**
     * Get <p>输出图像宽度，<strong>仅AI扩图场景有效</strong>。</p> 
     * @return ImageWidth <p>输出图像宽度，<strong>仅AI扩图场景有效</strong>。</p>
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set <p>输出图像宽度，<strong>仅AI扩图场景有效</strong>。</p>
     * @param ImageWidth <p>输出图像宽度，<strong>仅AI扩图场景有效</strong>。</p>
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get <p>输出图像高度，<strong>仅AI扩图场景有效</strong>。</p> 
     * @return ImageHeight <p>输出图像高度，<strong>仅AI扩图场景有效</strong>。</p>
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set <p>输出图像高度，<strong>仅AI扩图场景有效</strong>。</p>
     * @param ImageHeight <p>输出图像高度，<strong>仅AI扩图场景有效</strong>。</p>
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get <p>输出分辨率。仅change_clothes、change_clothes_under场景有效。可选值：1K、2K、4K。</p> 
     * @return Resolution <p>输出分辨率。仅change_clothes、change_clothes_under场景有效。可选值：1K、2K、4K。</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>输出分辨率。仅change_clothes、change_clothes_under场景有效。可选值：1K、2K、4K。</p>
     * @param Resolution <p>输出分辨率。仅change_clothes、change_clothes_under场景有效。可选值：1K、2K、4K。</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public SceneAigcImageOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcImageOutputConfig(SceneAigcImageOutputConfig source) {
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
        if (source.EncodeConfig != null) {
            this.EncodeConfig = new ImageSceneAigcEncodeConfig(source.EncodeConfig);
        }
        if (source.ImageWidth != null) {
            this.ImageWidth = new Long(source.ImageWidth);
        }
        if (source.ImageHeight != null) {
            this.ImageHeight = new Long(source.ImageHeight);
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
        this.setParamObj(map, prefix + "EncodeConfig.", this.EncodeConfig);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

