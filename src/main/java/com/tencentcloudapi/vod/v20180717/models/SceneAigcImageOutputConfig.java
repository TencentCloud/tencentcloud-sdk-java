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
    * 存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>
默认值：Temporary
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 指定所生成图片的宽高比。输入格式为 W:H。
本字段在以下场景有效：
* 生商品图场景，可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、16:9、9:16、21:9
* AI扩图场景。可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9，可以配合 ImageWidth 和 ImageHeight 使用，规则如下： 
    1. 仅指定 AspectRatio 时，根据原图输入进行自适应调整。
    2. 指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。
    3. 当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 输出图片编码格式参数。**仅AI换衣场景有效。**
    */
    @SerializedName("EncodeConfig")
    @Expose
    private ImageSceneAigcEncodeConfig EncodeConfig;

    /**
    * 输出图像宽度，**仅AI扩图场景有效**。
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * 输出图像高度，**仅AI扩图场景有效**。
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
     * Get 存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>
默认值：Temporary 
     * @return StorageMode 存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>
默认值：Temporary
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set 存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>
默认值：Temporary
     * @param StorageMode 存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>
默认值：Temporary
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。 
     * @return MediaName 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。
     * @param MediaName 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li> 
     * @return ClassId 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
     * @param ClassId 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return ExpireTime 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param ExpireTime 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 指定所生成图片的宽高比。输入格式为 W:H。
本字段在以下场景有效：
* 生商品图场景，可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、16:9、9:16、21:9
* AI扩图场景。可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9，可以配合 ImageWidth 和 ImageHeight 使用，规则如下： 
    1. 仅指定 AspectRatio 时，根据原图输入进行自适应调整。
    2. 指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。
    3. 当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。 
     * @return AspectRatio 指定所生成图片的宽高比。输入格式为 W:H。
本字段在以下场景有效：
* 生商品图场景，可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、16:9、9:16、21:9
* AI扩图场景。可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9，可以配合 ImageWidth 和 ImageHeight 使用，规则如下： 
    1. 仅指定 AspectRatio 时，根据原图输入进行自适应调整。
    2. 指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。
    3. 当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 指定所生成图片的宽高比。输入格式为 W:H。
本字段在以下场景有效：
* 生商品图场景，可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、16:9、9:16、21:9
* AI扩图场景。可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9，可以配合 ImageWidth 和 ImageHeight 使用，规则如下： 
    1. 仅指定 AspectRatio 时，根据原图输入进行自适应调整。
    2. 指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。
    3. 当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。
     * @param AspectRatio 指定所生成图片的宽高比。输入格式为 W:H。
本字段在以下场景有效：
* 生商品图场景，可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、16:9、9:16、21:9
* AI扩图场景。可选值为：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9，可以配合 ImageWidth 和 ImageHeight 使用，规则如下： 
    1. 仅指定 AspectRatio 时，根据原图输入进行自适应调整。
    2. 指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。
    3. 当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get 输出图片编码格式参数。**仅AI换衣场景有效。** 
     * @return EncodeConfig 输出图片编码格式参数。**仅AI换衣场景有效。**
     */
    public ImageSceneAigcEncodeConfig getEncodeConfig() {
        return this.EncodeConfig;
    }

    /**
     * Set 输出图片编码格式参数。**仅AI换衣场景有效。**
     * @param EncodeConfig 输出图片编码格式参数。**仅AI换衣场景有效。**
     */
    public void setEncodeConfig(ImageSceneAigcEncodeConfig EncodeConfig) {
        this.EncodeConfig = EncodeConfig;
    }

    /**
     * Get 输出图像宽度，**仅AI扩图场景有效**。 
     * @return ImageWidth 输出图像宽度，**仅AI扩图场景有效**。
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set 输出图像宽度，**仅AI扩图场景有效**。
     * @param ImageWidth 输出图像宽度，**仅AI扩图场景有效**。
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get 输出图像高度，**仅AI扩图场景有效**。 
     * @return ImageHeight 输出图像高度，**仅AI扩图场景有效**。
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set 输出图像高度，**仅AI扩图场景有效**。
     * @param ImageHeight 输出图像高度，**仅AI扩图场景有效**。
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
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

    }
}

