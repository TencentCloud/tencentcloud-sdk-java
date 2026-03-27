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

public class AigcImageOutputConfig extends AbstractModel {

    /**
    * <p>存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li><br>默认值：Temporary</p>
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
    * <p>生成图片的分辨率。各模型可选值：</p><ul><li>GG 2.5：1K、2K、4K，默认1K；</li><li>GG 3.0：1K、2K、4K，默认1K；</li><li>GG 3.1：512、1K、2K、4K，默认1K；</li><li>Kling 2.1：1k、2k，默认1k；</li><li>Kling 3.0：1k、2k，默认1k；</li><li>Kling 3.0-Omni：1k、2k、4k，默认1k；</li><li>SI 4.0：1K、2K、4K，默认1K；</li><li>SI 4.5：2K、4K，默认2K；</li><li>SI 5.0-lite：2K、3K，默认2K；</li><li>Vidu q2：1080p、2K、4K，默认1080p；</li><li>Hunyuan 3.0：宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024:1024 像素。示例：1024:1024；</li><li>Qwen 2.0：支持自由设置宽高，输出图像总像素需在512 * 512 至 2048 * 2048之间。默认分辨率为1024*1024；</li><li>Qwen 0925：不支持；</li></ul>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>指定所生成图片的宽高比。</p><ul><li>GG 2.5：1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9；</li><li>GG 3.0：1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9；</li><li>GG 3.1：1:1, 1:4, 1:8, 2:3, 3:2, 3:4, 4:1, 4:3, 4:5, 5:4, 8:1, 9:16, 16:9, 21:9；</li><li>Kling 2.1：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Kling 3.0：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Kling 3.0-Omni：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Vidu q2：16:9、9:16、1:1、3:4、4:3、21:9、2:3、3:2；</li><li>SI 4.0：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>SI 4.5：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>SI 5.0-lite：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Hunyuan 3.0：不支持；</li><li>Qwen 2.0：不支持；</li><li>Qwen 0925：不支持；</li></ul>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>是否允许人物或人脸生成。取值有： <li>AllowAdult：允许生成成人；</li> <li>Disallowed：禁止在图片中包含人物或人脸；</li></p>
    */
    @SerializedName("PersonGeneration")
    @Expose
    private String PersonGeneration;

    /**
    * <p>是否开启输入内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
    */
    @SerializedName("InputComplianceCheck")
    @Expose
    private String InputComplianceCheck;

    /**
    * <p>是否开启输出内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
    */
    @SerializedName("OutputComplianceCheck")
    @Expose
    private String OutputComplianceCheck;

    /**
     * Get <p>存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li><br>默认值：Temporary</p> 
     * @return StorageMode <p>存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li><br>默认值：Temporary</p>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li><br>默认值：Temporary</p>
     * @param StorageMode <p>存储模式。取值有： <li>Permanent：永久存储，生成的图片文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的图片文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li><br>默认值：Temporary</p>
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
     * Get <p>生成图片的分辨率。各模型可选值：</p><ul><li>GG 2.5：1K、2K、4K，默认1K；</li><li>GG 3.0：1K、2K、4K，默认1K；</li><li>GG 3.1：512、1K、2K、4K，默认1K；</li><li>Kling 2.1：1k、2k，默认1k；</li><li>Kling 3.0：1k、2k，默认1k；</li><li>Kling 3.0-Omni：1k、2k、4k，默认1k；</li><li>SI 4.0：1K、2K、4K，默认1K；</li><li>SI 4.5：2K、4K，默认2K；</li><li>SI 5.0-lite：2K、3K，默认2K；</li><li>Vidu q2：1080p、2K、4K，默认1080p；</li><li>Hunyuan 3.0：宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024:1024 像素。示例：1024:1024；</li><li>Qwen 2.0：支持自由设置宽高，输出图像总像素需在512 * 512 至 2048 * 2048之间。默认分辨率为1024*1024；</li><li>Qwen 0925：不支持；</li></ul> 
     * @return Resolution <p>生成图片的分辨率。各模型可选值：</p><ul><li>GG 2.5：1K、2K、4K，默认1K；</li><li>GG 3.0：1K、2K、4K，默认1K；</li><li>GG 3.1：512、1K、2K、4K，默认1K；</li><li>Kling 2.1：1k、2k，默认1k；</li><li>Kling 3.0：1k、2k，默认1k；</li><li>Kling 3.0-Omni：1k、2k、4k，默认1k；</li><li>SI 4.0：1K、2K、4K，默认1K；</li><li>SI 4.5：2K、4K，默认2K；</li><li>SI 5.0-lite：2K、3K，默认2K；</li><li>Vidu q2：1080p、2K、4K，默认1080p；</li><li>Hunyuan 3.0：宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024:1024 像素。示例：1024:1024；</li><li>Qwen 2.0：支持自由设置宽高，输出图像总像素需在512 * 512 至 2048 * 2048之间。默认分辨率为1024*1024；</li><li>Qwen 0925：不支持；</li></ul>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>生成图片的分辨率。各模型可选值：</p><ul><li>GG 2.5：1K、2K、4K，默认1K；</li><li>GG 3.0：1K、2K、4K，默认1K；</li><li>GG 3.1：512、1K、2K、4K，默认1K；</li><li>Kling 2.1：1k、2k，默认1k；</li><li>Kling 3.0：1k、2k，默认1k；</li><li>Kling 3.0-Omni：1k、2k、4k，默认1k；</li><li>SI 4.0：1K、2K、4K，默认1K；</li><li>SI 4.5：2K、4K，默认2K；</li><li>SI 5.0-lite：2K、3K，默认2K；</li><li>Vidu q2：1080p、2K、4K，默认1080p；</li><li>Hunyuan 3.0：宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024:1024 像素。示例：1024:1024；</li><li>Qwen 2.0：支持自由设置宽高，输出图像总像素需在512 * 512 至 2048 * 2048之间。默认分辨率为1024*1024；</li><li>Qwen 0925：不支持；</li></ul>
     * @param Resolution <p>生成图片的分辨率。各模型可选值：</p><ul><li>GG 2.5：1K、2K、4K，默认1K；</li><li>GG 3.0：1K、2K、4K，默认1K；</li><li>GG 3.1：512、1K、2K、4K，默认1K；</li><li>Kling 2.1：1k、2k，默认1k；</li><li>Kling 3.0：1k、2k，默认1k；</li><li>Kling 3.0-Omni：1k、2k、4k，默认1k；</li><li>SI 4.0：1K、2K、4K，默认1K；</li><li>SI 4.5：2K、4K，默认2K；</li><li>SI 5.0-lite：2K、3K，默认2K；</li><li>Vidu q2：1080p、2K、4K，默认1080p；</li><li>Hunyuan 3.0：宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024:1024 像素。示例：1024:1024；</li><li>Qwen 2.0：支持自由设置宽高，输出图像总像素需在512 * 512 至 2048 * 2048之间。默认分辨率为1024*1024；</li><li>Qwen 0925：不支持；</li></ul>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>指定所生成图片的宽高比。</p><ul><li>GG 2.5：1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9；</li><li>GG 3.0：1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9；</li><li>GG 3.1：1:1, 1:4, 1:8, 2:3, 3:2, 3:4, 4:1, 4:3, 4:5, 5:4, 8:1, 9:16, 16:9, 21:9；</li><li>Kling 2.1：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Kling 3.0：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Kling 3.0-Omni：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Vidu q2：16:9、9:16、1:1、3:4、4:3、21:9、2:3、3:2；</li><li>SI 4.0：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>SI 4.5：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>SI 5.0-lite：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Hunyuan 3.0：不支持；</li><li>Qwen 2.0：不支持；</li><li>Qwen 0925：不支持；</li></ul> 
     * @return AspectRatio <p>指定所生成图片的宽高比。</p><ul><li>GG 2.5：1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9；</li><li>GG 3.0：1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9；</li><li>GG 3.1：1:1, 1:4, 1:8, 2:3, 3:2, 3:4, 4:1, 4:3, 4:5, 5:4, 8:1, 9:16, 16:9, 21:9；</li><li>Kling 2.1：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Kling 3.0：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Kling 3.0-Omni：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Vidu q2：16:9、9:16、1:1、3:4、4:3、21:9、2:3、3:2；</li><li>SI 4.0：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>SI 4.5：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>SI 5.0-lite：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Hunyuan 3.0：不支持；</li><li>Qwen 2.0：不支持；</li><li>Qwen 0925：不支持；</li></ul>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>指定所生成图片的宽高比。</p><ul><li>GG 2.5：1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9；</li><li>GG 3.0：1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9；</li><li>GG 3.1：1:1, 1:4, 1:8, 2:3, 3:2, 3:4, 4:1, 4:3, 4:5, 5:4, 8:1, 9:16, 16:9, 21:9；</li><li>Kling 2.1：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Kling 3.0：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Kling 3.0-Omni：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Vidu q2：16:9、9:16、1:1、3:4、4:3、21:9、2:3、3:2；</li><li>SI 4.0：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>SI 4.5：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>SI 5.0-lite：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Hunyuan 3.0：不支持；</li><li>Qwen 2.0：不支持；</li><li>Qwen 0925：不支持；</li></ul>
     * @param AspectRatio <p>指定所生成图片的宽高比。</p><ul><li>GG 2.5：1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9；</li><li>GG 3.0：1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9；</li><li>GG 3.1：1:1, 1:4, 1:8, 2:3, 3:2, 3:4, 4:1, 4:3, 4:5, 5:4, 8:1, 9:16, 16:9, 21:9；</li><li>Kling 2.1：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Kling 3.0：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Kling 3.0-Omni：16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Vidu q2：16:9、9:16、1:1、3:4、4:3、21:9、2:3、3:2；</li><li>SI 4.0：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>SI 4.5：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>SI 5.0-lite：<strong>不支持</strong>此参数，可通过prompt指定16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9；</li><li>Hunyuan 3.0：不支持；</li><li>Qwen 2.0：不支持；</li><li>Qwen 0925：不支持；</li></ul>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>是否允许人物或人脸生成。取值有： <li>AllowAdult：允许生成成人；</li> <li>Disallowed：禁止在图片中包含人物或人脸；</li></p> 
     * @return PersonGeneration <p>是否允许人物或人脸生成。取值有： <li>AllowAdult：允许生成成人；</li> <li>Disallowed：禁止在图片中包含人物或人脸；</li></p>
     */
    public String getPersonGeneration() {
        return this.PersonGeneration;
    }

    /**
     * Set <p>是否允许人物或人脸生成。取值有： <li>AllowAdult：允许生成成人；</li> <li>Disallowed：禁止在图片中包含人物或人脸；</li></p>
     * @param PersonGeneration <p>是否允许人物或人脸生成。取值有： <li>AllowAdult：允许生成成人；</li> <li>Disallowed：禁止在图片中包含人物或人脸；</li></p>
     */
    public void setPersonGeneration(String PersonGeneration) {
        this.PersonGeneration = PersonGeneration;
    }

    /**
     * Get <p>是否开启输入内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p> 
     * @return InputComplianceCheck <p>是否开启输入内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     */
    public String getInputComplianceCheck() {
        return this.InputComplianceCheck;
    }

    /**
     * Set <p>是否开启输入内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     * @param InputComplianceCheck <p>是否开启输入内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     */
    public void setInputComplianceCheck(String InputComplianceCheck) {
        this.InputComplianceCheck = InputComplianceCheck;
    }

    /**
     * Get <p>是否开启输出内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p> 
     * @return OutputComplianceCheck <p>是否开启输出内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     */
    public String getOutputComplianceCheck() {
        return this.OutputComplianceCheck;
    }

    /**
     * Set <p>是否开启输出内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     * @param OutputComplianceCheck <p>是否开启输出内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     */
    public void setOutputComplianceCheck(String OutputComplianceCheck) {
        this.OutputComplianceCheck = OutputComplianceCheck;
    }

    public AigcImageOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageOutputConfig(AigcImageOutputConfig source) {
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
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.PersonGeneration != null) {
            this.PersonGeneration = new String(source.PersonGeneration);
        }
        if (source.InputComplianceCheck != null) {
            this.InputComplianceCheck = new String(source.InputComplianceCheck);
        }
        if (source.OutputComplianceCheck != null) {
            this.OutputComplianceCheck = new String(source.OutputComplianceCheck);
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
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "PersonGeneration", this.PersonGeneration);
        this.setParamSimple(map, prefix + "InputComplianceCheck", this.InputComplianceCheck);
        this.setParamSimple(map, prefix + "OutputComplianceCheck", this.OutputComplianceCheck);

    }
}

