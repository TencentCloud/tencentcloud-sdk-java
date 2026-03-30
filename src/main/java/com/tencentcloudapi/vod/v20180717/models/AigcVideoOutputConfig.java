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

public class AigcVideoOutputConfig extends AbstractModel {

    /**
    * <p>存储模式</p><p>枚举值：</p><ul><li>Temporary： 临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL，有效期 7 天</li><li>Permanent： 永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId</li></ul><p>默认值：Temporary</p>
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
    * <p>生成视频的时长，单位：秒。<li>当 ModelName 是 Kling，可选值为 5、10，默认为 5；</li><li>当 ModelName 是 Hailuo，可选值为 6、10，默认为 6；</li><li>当 ModelName 是 Vidu，可指定1-10；</li><li>当 ModelName 是 GV，可选值为 8，默认为 8；</li><li>当 ModelName 是 OS，可选值为 4、8、12，默认为 8；</li></p>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * <p>生成视频的分辨率。</p><li>当 ModelName 是 Kling，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 Hailuo，可选值为 768P、1080P，默认为 768P；</li><li>当 ModelName 是 Vidu，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 GV，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 OS，可选值为 720P；</li>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>指定所生成视频的宽高比。</p><li>当 ModelName 是 Kling，当文生视频时，则可选值为 16:9、9:16、 1:1，默认为16:9；</li><li>当 ModelName 是 Vidu，当文生视频时和使用参考图片生成时，则可选值为 16:9、9:16、4:3、3:4、1:1，其中仅版本q2支持4:3、3:4</li><li>当 ModelName 是 GV，则可选值为 16:9、9:16，默认为 16:9；</li><li>当 ModelName 是 OS，当文生视频时，则可选值为 16:9、9:16，默认为 16:9；</li><li>当 ModelName 是 Hailuo，则暂不支持。</li>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>是否生成音频。支持的模型包括 GV、OS、Vidu。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>默认值：Disabled</p>
    */
    @SerializedName("AudioGeneration")
    @Expose
    private String AudioGeneration;

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
    * <p>是否启用视频增强。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>说明：</p><ol><li>对于选择的分辨率超过模型可生成分辨率时，默认会启用增强。</li><li>对于模型可以直出的分辨率，也可以主动选择模型直出低分辨率，使用增强获得指定分辨率。</li></ol>
    */
    @SerializedName("EnhanceSwitch")
    @Expose
    private String EnhanceSwitch;

    /**
    * <p>是否开启错峰。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
    */
    @SerializedName("OffPeak")
    @Expose
    private String OffPeak;

    /**
    * <p>是否开启vidu智能插帧。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
    */
    @SerializedName("FrameInterpolate")
    @Expose
    private String FrameInterpolate;

    /**
    * <p>是否开启图标水印。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>目前支持的模型有 Vidu，其他模型暂不支持。</p>
    */
    @SerializedName("LogoAdd")
    @Expose
    private String LogoAdd;

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
     * Get <p>生成视频的时长，单位：秒。<li>当 ModelName 是 Kling，可选值为 5、10，默认为 5；</li><li>当 ModelName 是 Hailuo，可选值为 6、10，默认为 6；</li><li>当 ModelName 是 Vidu，可指定1-10；</li><li>当 ModelName 是 GV，可选值为 8，默认为 8；</li><li>当 ModelName 是 OS，可选值为 4、8、12，默认为 8；</li></p> 
     * @return Duration <p>生成视频的时长，单位：秒。<li>当 ModelName 是 Kling，可选值为 5、10，默认为 5；</li><li>当 ModelName 是 Hailuo，可选值为 6、10，默认为 6；</li><li>当 ModelName 是 Vidu，可指定1-10；</li><li>当 ModelName 是 GV，可选值为 8，默认为 8；</li><li>当 ModelName 是 OS，可选值为 4、8、12，默认为 8；</li></p>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>生成视频的时长，单位：秒。<li>当 ModelName 是 Kling，可选值为 5、10，默认为 5；</li><li>当 ModelName 是 Hailuo，可选值为 6、10，默认为 6；</li><li>当 ModelName 是 Vidu，可指定1-10；</li><li>当 ModelName 是 GV，可选值为 8，默认为 8；</li><li>当 ModelName 是 OS，可选值为 4、8、12，默认为 8；</li></p>
     * @param Duration <p>生成视频的时长，单位：秒。<li>当 ModelName 是 Kling，可选值为 5、10，默认为 5；</li><li>当 ModelName 是 Hailuo，可选值为 6、10，默认为 6；</li><li>当 ModelName 是 Vidu，可指定1-10；</li><li>当 ModelName 是 GV，可选值为 8，默认为 8；</li><li>当 ModelName 是 OS，可选值为 4、8、12，默认为 8；</li></p>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>生成视频的分辨率。</p><li>当 ModelName 是 Kling，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 Hailuo，可选值为 768P、1080P，默认为 768P；</li><li>当 ModelName 是 Vidu，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 GV，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 OS，可选值为 720P；</li> 
     * @return Resolution <p>生成视频的分辨率。</p><li>当 ModelName 是 Kling，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 Hailuo，可选值为 768P、1080P，默认为 768P；</li><li>当 ModelName 是 Vidu，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 GV，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 OS，可选值为 720P；</li>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>生成视频的分辨率。</p><li>当 ModelName 是 Kling，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 Hailuo，可选值为 768P、1080P，默认为 768P；</li><li>当 ModelName 是 Vidu，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 GV，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 OS，可选值为 720P；</li>
     * @param Resolution <p>生成视频的分辨率。</p><li>当 ModelName 是 Kling，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 Hailuo，可选值为 768P、1080P，默认为 768P；</li><li>当 ModelName 是 Vidu，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 GV，可选值为 720P、1080P，默认为 720P；</li><li>当 ModelName 是 OS，可选值为 720P；</li>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>指定所生成视频的宽高比。</p><li>当 ModelName 是 Kling，当文生视频时，则可选值为 16:9、9:16、 1:1，默认为16:9；</li><li>当 ModelName 是 Vidu，当文生视频时和使用参考图片生成时，则可选值为 16:9、9:16、4:3、3:4、1:1，其中仅版本q2支持4:3、3:4</li><li>当 ModelName 是 GV，则可选值为 16:9、9:16，默认为 16:9；</li><li>当 ModelName 是 OS，当文生视频时，则可选值为 16:9、9:16，默认为 16:9；</li><li>当 ModelName 是 Hailuo，则暂不支持。</li> 
     * @return AspectRatio <p>指定所生成视频的宽高比。</p><li>当 ModelName 是 Kling，当文生视频时，则可选值为 16:9、9:16、 1:1，默认为16:9；</li><li>当 ModelName 是 Vidu，当文生视频时和使用参考图片生成时，则可选值为 16:9、9:16、4:3、3:4、1:1，其中仅版本q2支持4:3、3:4</li><li>当 ModelName 是 GV，则可选值为 16:9、9:16，默认为 16:9；</li><li>当 ModelName 是 OS，当文生视频时，则可选值为 16:9、9:16，默认为 16:9；</li><li>当 ModelName 是 Hailuo，则暂不支持。</li>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>指定所生成视频的宽高比。</p><li>当 ModelName 是 Kling，当文生视频时，则可选值为 16:9、9:16、 1:1，默认为16:9；</li><li>当 ModelName 是 Vidu，当文生视频时和使用参考图片生成时，则可选值为 16:9、9:16、4:3、3:4、1:1，其中仅版本q2支持4:3、3:4</li><li>当 ModelName 是 GV，则可选值为 16:9、9:16，默认为 16:9；</li><li>当 ModelName 是 OS，当文生视频时，则可选值为 16:9、9:16，默认为 16:9；</li><li>当 ModelName 是 Hailuo，则暂不支持。</li>
     * @param AspectRatio <p>指定所生成视频的宽高比。</p><li>当 ModelName 是 Kling，当文生视频时，则可选值为 16:9、9:16、 1:1，默认为16:9；</li><li>当 ModelName 是 Vidu，当文生视频时和使用参考图片生成时，则可选值为 16:9、9:16、4:3、3:4、1:1，其中仅版本q2支持4:3、3:4</li><li>当 ModelName 是 GV，则可选值为 16:9、9:16，默认为 16:9；</li><li>当 ModelName 是 OS，当文生视频时，则可选值为 16:9、9:16，默认为 16:9；</li><li>当 ModelName 是 Hailuo，则暂不支持。</li>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>是否生成音频。支持的模型包括 GV、OS、Vidu。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>默认值：Disabled</p> 
     * @return AudioGeneration <p>是否生成音频。支持的模型包括 GV、OS、Vidu。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>默认值：Disabled</p>
     */
    public String getAudioGeneration() {
        return this.AudioGeneration;
    }

    /**
     * Set <p>是否生成音频。支持的模型包括 GV、OS、Vidu。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>默认值：Disabled</p>
     * @param AudioGeneration <p>是否生成音频。支持的模型包括 GV、OS、Vidu。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>默认值：Disabled</p>
     */
    public void setAudioGeneration(String AudioGeneration) {
        this.AudioGeneration = AudioGeneration;
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

    /**
     * Get <p>是否启用视频增强。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>说明：</p><ol><li>对于选择的分辨率超过模型可生成分辨率时，默认会启用增强。</li><li>对于模型可以直出的分辨率，也可以主动选择模型直出低分辨率，使用增强获得指定分辨率。</li></ol> 
     * @return EnhanceSwitch <p>是否启用视频增强。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>说明：</p><ol><li>对于选择的分辨率超过模型可生成分辨率时，默认会启用增强。</li><li>对于模型可以直出的分辨率，也可以主动选择模型直出低分辨率，使用增强获得指定分辨率。</li></ol>
     */
    public String getEnhanceSwitch() {
        return this.EnhanceSwitch;
    }

    /**
     * Set <p>是否启用视频增强。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>说明：</p><ol><li>对于选择的分辨率超过模型可生成分辨率时，默认会启用增强。</li><li>对于模型可以直出的分辨率，也可以主动选择模型直出低分辨率，使用增强获得指定分辨率。</li></ol>
     * @param EnhanceSwitch <p>是否启用视频增强。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>说明：</p><ol><li>对于选择的分辨率超过模型可生成分辨率时，默认会启用增强。</li><li>对于模型可以直出的分辨率，也可以主动选择模型直出低分辨率，使用增强获得指定分辨率。</li></ol>
     */
    public void setEnhanceSwitch(String EnhanceSwitch) {
        this.EnhanceSwitch = EnhanceSwitch;
    }

    /**
     * Get <p>是否开启错峰。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p> 
     * @return OffPeak <p>是否开启错峰。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     */
    public String getOffPeak() {
        return this.OffPeak;
    }

    /**
     * Set <p>是否开启错峰。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     * @param OffPeak <p>是否开启错峰。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     */
    public void setOffPeak(String OffPeak) {
        this.OffPeak = OffPeak;
    }

    /**
     * Get <p>是否开启vidu智能插帧。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p> 
     * @return FrameInterpolate <p>是否开启vidu智能插帧。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     */
    public String getFrameInterpolate() {
        return this.FrameInterpolate;
    }

    /**
     * Set <p>是否开启vidu智能插帧。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     * @param FrameInterpolate <p>是否开启vidu智能插帧。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     */
    public void setFrameInterpolate(String FrameInterpolate) {
        this.FrameInterpolate = FrameInterpolate;
    }

    /**
     * Get <p>是否开启图标水印。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>目前支持的模型有 Vidu，其他模型暂不支持。</p> 
     * @return LogoAdd <p>是否开启图标水印。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>目前支持的模型有 Vidu，其他模型暂不支持。</p>
     */
    public String getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>是否开启图标水印。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>目前支持的模型有 Vidu，其他模型暂不支持。</p>
     * @param LogoAdd <p>是否开启图标水印。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li><br>目前支持的模型有 Vidu，其他模型暂不支持。</p>
     */
    public void setLogoAdd(String LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    public AigcVideoOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoOutputConfig(AigcVideoOutputConfig source) {
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
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.AudioGeneration != null) {
            this.AudioGeneration = new String(source.AudioGeneration);
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
        if (source.EnhanceSwitch != null) {
            this.EnhanceSwitch = new String(source.EnhanceSwitch);
        }
        if (source.OffPeak != null) {
            this.OffPeak = new String(source.OffPeak);
        }
        if (source.FrameInterpolate != null) {
            this.FrameInterpolate = new String(source.FrameInterpolate);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new String(source.LogoAdd);
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
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "AudioGeneration", this.AudioGeneration);
        this.setParamSimple(map, prefix + "PersonGeneration", this.PersonGeneration);
        this.setParamSimple(map, prefix + "InputComplianceCheck", this.InputComplianceCheck);
        this.setParamSimple(map, prefix + "OutputComplianceCheck", this.OutputComplianceCheck);
        this.setParamSimple(map, prefix + "EnhanceSwitch", this.EnhanceSwitch);
        this.setParamSimple(map, prefix + "OffPeak", this.OffPeak);
        this.setParamSimple(map, prefix + "FrameInterpolate", this.FrameInterpolate);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);

    }
}

