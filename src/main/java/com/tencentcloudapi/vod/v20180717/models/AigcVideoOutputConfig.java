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
    * 存储模式。取值有： <li>Permanent：永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>
默认值：Temporary
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * 输出媒体文件名，最长 64 个字符。缺省由系统指定生成文件名。
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
    * 生成视频的时长，单位：秒。<li>当 ModelName 是 Kling，可选值为 5、10，默认为 5；</li><li>当 ModelName 是 Hailuo，可选值为 6、10，默认为 6；</li><li>当 ModelName 是 Vidu，可指定1-10；</li><li>当 ModelName 是 GV，可选值为 8，默认为 8；</li><li>当 ModelName 是 OS，可选值为 4、8、12，默认为 8；</li>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 生成视频的分辨率。
<li>当 ModelName 是 Kling，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 Hailuo，可选值为 768P、1080P，默认为 768P；</li>
<li>当 ModelName 是 Vidu，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 GV，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 OS，可选值为 720P；</li>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 指定所生成视频的宽高比。
<li>当 ModelName 是 Kling，当文生视频时，则可选值为 16:9、9:16、 1:1，默认为16:9；</li>
<li>当 ModelName 是 Vidu，当文生视频时和使用参考图片生成时，则可选值为 16:9、9:16、4:3、3:4、1:1，其中仅版本q2支持4:3、3:4</li>
<li>当 ModelName 是 GV，则可选值为 16:9、9:16，默认为 16:9；</li>
<li>当 ModelName 是 OS，当文生视频时，则可选值为 16:9、9:16，默认为 16:9；</li>
<li>当 ModelName 是 Hailuo，则暂不支持。</li>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 是否生成音频。支持的模型包括 GV、OS、Vidu。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li>
默认值：Disabled
    */
    @SerializedName("AudioGeneration")
    @Expose
    private String AudioGeneration;

    /**
    * 是否允许人物或人脸生成。取值有： <li>AllowAdult：允许生成成人；</li> <li>Disallowed：禁止在图片中包含人物或人脸；</li> 
    */
    @SerializedName("PersonGeneration")
    @Expose
    private String PersonGeneration;

    /**
    * 是否开启输入内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
    */
    @SerializedName("InputComplianceCheck")
    @Expose
    private String InputComplianceCheck;

    /**
    * 是否开启输出内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
    */
    @SerializedName("OutputComplianceCheck")
    @Expose
    private String OutputComplianceCheck;

    /**
    * 是否启用视频增强。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
说明：
1. 对于选择的分辨率超过模型可生成分辨率时，默认会启用增强。
2. 对于模型可以直出的分辨率，也可以主动选择模型直出低分辨率，使用增强获得指定分辨率。
    */
    @SerializedName("EnhanceSwitch")
    @Expose
    private String EnhanceSwitch;

    /**
    * 是否开启vidu智能插帧。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
    */
    @SerializedName("FrameInterpolate")
    @Expose
    private String FrameInterpolate;

    /**
     * Get 存储模式。取值有： <li>Permanent：永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>
默认值：Temporary 
     * @return StorageMode 存储模式。取值有： <li>Permanent：永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>
默认值：Temporary
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set 存储模式。取值有： <li>Permanent：永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>
默认值：Temporary
     * @param StorageMode 存储模式。取值有： <li>Permanent：永久存储，生成的视频文件将存储到云点播，可在事件通知中获取到 FileId；</li> <li>Temporary：临时存储，生成的视频文件不会存储到云点播，可在事件通知中获取到临时访问的 URL；</li>
默认值：Temporary
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get 输出媒体文件名，最长 64 个字符。缺省由系统指定生成文件名。 
     * @return MediaName 输出媒体文件名，最长 64 个字符。缺省由系统指定生成文件名。
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set 输出媒体文件名，最长 64 个字符。缺省由系统指定生成文件名。
     * @param MediaName 输出媒体文件名，最长 64 个字符。缺省由系统指定生成文件名。
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
     * Get 生成视频的时长，单位：秒。<li>当 ModelName 是 Kling，可选值为 5、10，默认为 5；</li><li>当 ModelName 是 Hailuo，可选值为 6、10，默认为 6；</li><li>当 ModelName 是 Vidu，可指定1-10；</li><li>当 ModelName 是 GV，可选值为 8，默认为 8；</li><li>当 ModelName 是 OS，可选值为 4、8、12，默认为 8；</li> 
     * @return Duration 生成视频的时长，单位：秒。<li>当 ModelName 是 Kling，可选值为 5、10，默认为 5；</li><li>当 ModelName 是 Hailuo，可选值为 6、10，默认为 6；</li><li>当 ModelName 是 Vidu，可指定1-10；</li><li>当 ModelName 是 GV，可选值为 8，默认为 8；</li><li>当 ModelName 是 OS，可选值为 4、8、12，默认为 8；</li>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 生成视频的时长，单位：秒。<li>当 ModelName 是 Kling，可选值为 5、10，默认为 5；</li><li>当 ModelName 是 Hailuo，可选值为 6、10，默认为 6；</li><li>当 ModelName 是 Vidu，可指定1-10；</li><li>当 ModelName 是 GV，可选值为 8，默认为 8；</li><li>当 ModelName 是 OS，可选值为 4、8、12，默认为 8；</li>
     * @param Duration 生成视频的时长，单位：秒。<li>当 ModelName 是 Kling，可选值为 5、10，默认为 5；</li><li>当 ModelName 是 Hailuo，可选值为 6、10，默认为 6；</li><li>当 ModelName 是 Vidu，可指定1-10；</li><li>当 ModelName 是 GV，可选值为 8，默认为 8；</li><li>当 ModelName 是 OS，可选值为 4、8、12，默认为 8；</li>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 生成视频的分辨率。
<li>当 ModelName 是 Kling，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 Hailuo，可选值为 768P、1080P，默认为 768P；</li>
<li>当 ModelName 是 Vidu，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 GV，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 OS，可选值为 720P；</li> 
     * @return Resolution 生成视频的分辨率。
<li>当 ModelName 是 Kling，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 Hailuo，可选值为 768P、1080P，默认为 768P；</li>
<li>当 ModelName 是 Vidu，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 GV，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 OS，可选值为 720P；</li>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 生成视频的分辨率。
<li>当 ModelName 是 Kling，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 Hailuo，可选值为 768P、1080P，默认为 768P；</li>
<li>当 ModelName 是 Vidu，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 GV，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 OS，可选值为 720P；</li>
     * @param Resolution 生成视频的分辨率。
<li>当 ModelName 是 Kling，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 Hailuo，可选值为 768P、1080P，默认为 768P；</li>
<li>当 ModelName 是 Vidu，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 GV，可选值为 720P、1080P，默认为 720P；</li>
<li>当 ModelName 是 OS，可选值为 720P；</li>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 指定所生成视频的宽高比。
<li>当 ModelName 是 Kling，当文生视频时，则可选值为 16:9、9:16、 1:1，默认为16:9；</li>
<li>当 ModelName 是 Vidu，当文生视频时和使用参考图片生成时，则可选值为 16:9、9:16、4:3、3:4、1:1，其中仅版本q2支持4:3、3:4</li>
<li>当 ModelName 是 GV，则可选值为 16:9、9:16，默认为 16:9；</li>
<li>当 ModelName 是 OS，当文生视频时，则可选值为 16:9、9:16，默认为 16:9；</li>
<li>当 ModelName 是 Hailuo，则暂不支持。</li> 
     * @return AspectRatio 指定所生成视频的宽高比。
<li>当 ModelName 是 Kling，当文生视频时，则可选值为 16:9、9:16、 1:1，默认为16:9；</li>
<li>当 ModelName 是 Vidu，当文生视频时和使用参考图片生成时，则可选值为 16:9、9:16、4:3、3:4、1:1，其中仅版本q2支持4:3、3:4</li>
<li>当 ModelName 是 GV，则可选值为 16:9、9:16，默认为 16:9；</li>
<li>当 ModelName 是 OS，当文生视频时，则可选值为 16:9、9:16，默认为 16:9；</li>
<li>当 ModelName 是 Hailuo，则暂不支持。</li>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 指定所生成视频的宽高比。
<li>当 ModelName 是 Kling，当文生视频时，则可选值为 16:9、9:16、 1:1，默认为16:9；</li>
<li>当 ModelName 是 Vidu，当文生视频时和使用参考图片生成时，则可选值为 16:9、9:16、4:3、3:4、1:1，其中仅版本q2支持4:3、3:4</li>
<li>当 ModelName 是 GV，则可选值为 16:9、9:16，默认为 16:9；</li>
<li>当 ModelName 是 OS，当文生视频时，则可选值为 16:9、9:16，默认为 16:9；</li>
<li>当 ModelName 是 Hailuo，则暂不支持。</li>
     * @param AspectRatio 指定所生成视频的宽高比。
<li>当 ModelName 是 Kling，当文生视频时，则可选值为 16:9、9:16、 1:1，默认为16:9；</li>
<li>当 ModelName 是 Vidu，当文生视频时和使用参考图片生成时，则可选值为 16:9、9:16、4:3、3:4、1:1，其中仅版本q2支持4:3、3:4</li>
<li>当 ModelName 是 GV，则可选值为 16:9、9:16，默认为 16:9；</li>
<li>当 ModelName 是 OS，当文生视频时，则可选值为 16:9、9:16，默认为 16:9；</li>
<li>当 ModelName 是 Hailuo，则暂不支持。</li>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get 是否生成音频。支持的模型包括 GV、OS、Vidu。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li>
默认值：Disabled 
     * @return AudioGeneration 是否生成音频。支持的模型包括 GV、OS、Vidu。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li>
默认值：Disabled
     */
    public String getAudioGeneration() {
        return this.AudioGeneration;
    }

    /**
     * Set 是否生成音频。支持的模型包括 GV、OS、Vidu。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li>
默认值：Disabled
     * @param AudioGeneration 是否生成音频。支持的模型包括 GV、OS、Vidu。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li>
默认值：Disabled
     */
    public void setAudioGeneration(String AudioGeneration) {
        this.AudioGeneration = AudioGeneration;
    }

    /**
     * Get 是否允许人物或人脸生成。取值有： <li>AllowAdult：允许生成成人；</li> <li>Disallowed：禁止在图片中包含人物或人脸；</li>  
     * @return PersonGeneration 是否允许人物或人脸生成。取值有： <li>AllowAdult：允许生成成人；</li> <li>Disallowed：禁止在图片中包含人物或人脸；</li> 
     */
    public String getPersonGeneration() {
        return this.PersonGeneration;
    }

    /**
     * Set 是否允许人物或人脸生成。取值有： <li>AllowAdult：允许生成成人；</li> <li>Disallowed：禁止在图片中包含人物或人脸；</li> 
     * @param PersonGeneration 是否允许人物或人脸生成。取值有： <li>AllowAdult：允许生成成人；</li> <li>Disallowed：禁止在图片中包含人物或人脸；</li> 
     */
    public void setPersonGeneration(String PersonGeneration) {
        this.PersonGeneration = PersonGeneration;
    }

    /**
     * Get 是否开启输入内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li>  
     * @return InputComplianceCheck 是否开启输入内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     */
    public String getInputComplianceCheck() {
        return this.InputComplianceCheck;
    }

    /**
     * Set 是否开启输入内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     * @param InputComplianceCheck 是否开启输入内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     */
    public void setInputComplianceCheck(String InputComplianceCheck) {
        this.InputComplianceCheck = InputComplianceCheck;
    }

    /**
     * Get 是否开启输出内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li>  
     * @return OutputComplianceCheck 是否开启输出内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     */
    public String getOutputComplianceCheck() {
        return this.OutputComplianceCheck;
    }

    /**
     * Set 是否开启输出内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     * @param OutputComplianceCheck 是否开启输出内容的合规性检查。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     */
    public void setOutputComplianceCheck(String OutputComplianceCheck) {
        this.OutputComplianceCheck = OutputComplianceCheck;
    }

    /**
     * Get 是否启用视频增强。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
说明：
1. 对于选择的分辨率超过模型可生成分辨率时，默认会启用增强。
2. 对于模型可以直出的分辨率，也可以主动选择模型直出低分辨率，使用增强获得指定分辨率。 
     * @return EnhanceSwitch 是否启用视频增强。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
说明：
1. 对于选择的分辨率超过模型可生成分辨率时，默认会启用增强。
2. 对于模型可以直出的分辨率，也可以主动选择模型直出低分辨率，使用增强获得指定分辨率。
     */
    public String getEnhanceSwitch() {
        return this.EnhanceSwitch;
    }

    /**
     * Set 是否启用视频增强。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
说明：
1. 对于选择的分辨率超过模型可生成分辨率时，默认会启用增强。
2. 对于模型可以直出的分辨率，也可以主动选择模型直出低分辨率，使用增强获得指定分辨率。
     * @param EnhanceSwitch 是否启用视频增强。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
说明：
1. 对于选择的分辨率超过模型可生成分辨率时，默认会启用增强。
2. 对于模型可以直出的分辨率，也可以主动选择模型直出低分辨率，使用增强获得指定分辨率。
     */
    public void setEnhanceSwitch(String EnhanceSwitch) {
        this.EnhanceSwitch = EnhanceSwitch;
    }

    /**
     * Get 是否开启vidu智能插帧。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li>  
     * @return FrameInterpolate 是否开启vidu智能插帧。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     */
    public String getFrameInterpolate() {
        return this.FrameInterpolate;
    }

    /**
     * Set 是否开启vidu智能插帧。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     * @param FrameInterpolate 是否开启vidu智能插帧。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     */
    public void setFrameInterpolate(String FrameInterpolate) {
        this.FrameInterpolate = FrameInterpolate;
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
        if (source.FrameInterpolate != null) {
            this.FrameInterpolate = new String(source.FrameInterpolate);
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
        this.setParamSimple(map, prefix + "FrameInterpolate", this.FrameInterpolate);

    }
}

