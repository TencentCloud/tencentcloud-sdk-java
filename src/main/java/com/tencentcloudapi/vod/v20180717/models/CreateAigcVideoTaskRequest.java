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

public class CreateAigcVideoTaskRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>模型名称。取值：<br>Kling：可灵；<br>Vidu；<br>Hailuo：海螺；<br>Jimeng：即梦；<br>Hunyuan：混元；<br>Mingmou：明眸；<br>GV；<br>OS；<br>PixVerse;</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型版本。取值：<br>当 ModelName 是 Hailuo，可选值为 02、2.3、2.3-fast；<br>当 ModelName 是 Kling，可选值为 1.6、2.0、2.1、2.5、2.6、O1、3.0、3.0-Omni；<br>当 ModelName 是 Jimeng，可选值为 3.0pro；<br>当 ModelName 是 Vidu，可选值为 q2、q2-pro、q2-turbo、q3、q3-pro、q3-turbo；<br>当 ModelName 是 GV，可选值为 3.1、3.1-fast；<br>当 ModelName 是 OS，可选值为 2.0；<br>当 ModelName 是 Hunyuan，可选值为 1.5；<br>当 ModelName 是 Mingmou，可选值为 1.0；<br>当 ModelName 是 PixVerse，可选值为 v5.6、v6、c1；</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>用于描述模型在生成视频时要使用的资源文件，分为<strong>首尾帧模式、参考图、视频参考、视频编辑等模式</strong>。</p><p><strong>首尾帧视频生成</strong>：首帧图片只支持<strong>一张</strong>图片，<strong>图片的Usage字段为FirstFrame</strong>，LastFrameFileId 或者 LastFrameUrl 表示尾帧。可以单独传首帧，不能单独传尾帧。<strong>首尾帧生成会参考图片比例</strong>。<br><strong>参考图片生成</strong>：可传入单张图片或者多张，<strong>图片的Usage字段为Reference</strong>；参考图片，可以调整生成视频的宽高比例。<br><strong>视频编辑、视频参考</strong>：Vidu、Kling可输入视频作为参考或者进行编辑。传入视频的同时也可以传入图片，<strong>图片的Usage字段为Reference</strong>。</p><p>注意：</p><ol><li>图片大小不超过10M。</li><li>支持的图片格式：jpeg、jpg、png。x0b</li><li>关于模型某个版本是否支持参考图、首尾帧、视频编辑等功能，可向我们索取文档或者参考原厂文档信息。</li></ol>
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcVideoTaskInputFileInfo [] FileInfos;

    /**
    * <p>固定主体输入信息。</p>
    */
    @SerializedName("SubjectInfos")
    @Expose
    private AigcVideoTaskInputSubjectInfo [] SubjectInfos;

    /**
    * <p>用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。</p><ol><li>指定该参数时，须同时通过 FileInfos 指定首帧画面。</li><li>图片大小需小于10M。</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
    */
    @SerializedName("LastFrameFileId")
    @Expose
    private String LastFrameFileId;

    /**
    * <p>用于作为尾帧画面来生成视频的媒体文件 URL。说明：</p><ol><li>指定该参数时，须同时通过 FileInfos 指定首帧画面。</li><li>图片大小需小于5M。</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
    */
    @SerializedName("LastFrameUrl")
    @Expose
    private String LastFrameUrl;

    /**
    * <p>生成视频的提示词。<br>当未传入参考文件，没有使用场景类型，ExtInfo不为空，Prompt 为必填。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>要阻止模型生成视频的提示词。</p>
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * <p>是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private String EnhancePrompt;

    /**
    * <p>生视频任务的输出媒体文件配置。</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcVideoOutputConfig OutputConfig;

    /**
    * <p>输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。</p>
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

    /**
    * <p>场景类型。取值如下：</p><li>当 ModelName 为 Kling 时：    motion_control 表示动作控制；    avatar_i2v 表示数字人；    lip_sync 表示对口型；</li><li>当 ModelName 为 Vidu 时：    template_effect 表示特效模板；</li><li>其他 ModelName 暂不支持。</li>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>模型随机种子。</p>
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * <p>保留字段，特殊用途时使用。<br>可用于传入模型特殊参数、分镜prompt等</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>模型名称。取值：<br>Kling：可灵；<br>Vidu；<br>Hailuo：海螺；<br>Jimeng：即梦；<br>Hunyuan：混元；<br>Mingmou：明眸；<br>GV；<br>OS；<br>PixVerse;</p> 
     * @return ModelName <p>模型名称。取值：<br>Kling：可灵；<br>Vidu；<br>Hailuo：海螺；<br>Jimeng：即梦；<br>Hunyuan：混元；<br>Mingmou：明眸；<br>GV；<br>OS；<br>PixVerse;</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称。取值：<br>Kling：可灵；<br>Vidu；<br>Hailuo：海螺；<br>Jimeng：即梦；<br>Hunyuan：混元；<br>Mingmou：明眸；<br>GV；<br>OS；<br>PixVerse;</p>
     * @param ModelName <p>模型名称。取值：<br>Kling：可灵；<br>Vidu；<br>Hailuo：海螺；<br>Jimeng：即梦；<br>Hunyuan：混元；<br>Mingmou：明眸；<br>GV；<br>OS；<br>PixVerse;</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型版本。取值：<br>当 ModelName 是 Hailuo，可选值为 02、2.3、2.3-fast；<br>当 ModelName 是 Kling，可选值为 1.6、2.0、2.1、2.5、2.6、O1、3.0、3.0-Omni；<br>当 ModelName 是 Jimeng，可选值为 3.0pro；<br>当 ModelName 是 Vidu，可选值为 q2、q2-pro、q2-turbo、q3、q3-pro、q3-turbo；<br>当 ModelName 是 GV，可选值为 3.1、3.1-fast；<br>当 ModelName 是 OS，可选值为 2.0；<br>当 ModelName 是 Hunyuan，可选值为 1.5；<br>当 ModelName 是 Mingmou，可选值为 1.0；<br>当 ModelName 是 PixVerse，可选值为 v5.6、v6、c1；</p> 
     * @return ModelVersion <p>模型版本。取值：<br>当 ModelName 是 Hailuo，可选值为 02、2.3、2.3-fast；<br>当 ModelName 是 Kling，可选值为 1.6、2.0、2.1、2.5、2.6、O1、3.0、3.0-Omni；<br>当 ModelName 是 Jimeng，可选值为 3.0pro；<br>当 ModelName 是 Vidu，可选值为 q2、q2-pro、q2-turbo、q3、q3-pro、q3-turbo；<br>当 ModelName 是 GV，可选值为 3.1、3.1-fast；<br>当 ModelName 是 OS，可选值为 2.0；<br>当 ModelName 是 Hunyuan，可选值为 1.5；<br>当 ModelName 是 Mingmou，可选值为 1.0；<br>当 ModelName 是 PixVerse，可选值为 v5.6、v6、c1；</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>模型版本。取值：<br>当 ModelName 是 Hailuo，可选值为 02、2.3、2.3-fast；<br>当 ModelName 是 Kling，可选值为 1.6、2.0、2.1、2.5、2.6、O1、3.0、3.0-Omni；<br>当 ModelName 是 Jimeng，可选值为 3.0pro；<br>当 ModelName 是 Vidu，可选值为 q2、q2-pro、q2-turbo、q3、q3-pro、q3-turbo；<br>当 ModelName 是 GV，可选值为 3.1、3.1-fast；<br>当 ModelName 是 OS，可选值为 2.0；<br>当 ModelName 是 Hunyuan，可选值为 1.5；<br>当 ModelName 是 Mingmou，可选值为 1.0；<br>当 ModelName 是 PixVerse，可选值为 v5.6、v6、c1；</p>
     * @param ModelVersion <p>模型版本。取值：<br>当 ModelName 是 Hailuo，可选值为 02、2.3、2.3-fast；<br>当 ModelName 是 Kling，可选值为 1.6、2.0、2.1、2.5、2.6、O1、3.0、3.0-Omni；<br>当 ModelName 是 Jimeng，可选值为 3.0pro；<br>当 ModelName 是 Vidu，可选值为 q2、q2-pro、q2-turbo、q3、q3-pro、q3-turbo；<br>当 ModelName 是 GV，可选值为 3.1、3.1-fast；<br>当 ModelName 是 OS，可选值为 2.0；<br>当 ModelName 是 Hunyuan，可选值为 1.5；<br>当 ModelName 是 Mingmou，可选值为 1.0；<br>当 ModelName 是 PixVerse，可选值为 v5.6、v6、c1；</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>用于描述模型在生成视频时要使用的资源文件，分为<strong>首尾帧模式、参考图、视频参考、视频编辑等模式</strong>。</p><p><strong>首尾帧视频生成</strong>：首帧图片只支持<strong>一张</strong>图片，<strong>图片的Usage字段为FirstFrame</strong>，LastFrameFileId 或者 LastFrameUrl 表示尾帧。可以单独传首帧，不能单独传尾帧。<strong>首尾帧生成会参考图片比例</strong>。<br><strong>参考图片生成</strong>：可传入单张图片或者多张，<strong>图片的Usage字段为Reference</strong>；参考图片，可以调整生成视频的宽高比例。<br><strong>视频编辑、视频参考</strong>：Vidu、Kling可输入视频作为参考或者进行编辑。传入视频的同时也可以传入图片，<strong>图片的Usage字段为Reference</strong>。</p><p>注意：</p><ol><li>图片大小不超过10M。</li><li>支持的图片格式：jpeg、jpg、png。x0b</li><li>关于模型某个版本是否支持参考图、首尾帧、视频编辑等功能，可向我们索取文档或者参考原厂文档信息。</li></ol> 
     * @return FileInfos <p>用于描述模型在生成视频时要使用的资源文件，分为<strong>首尾帧模式、参考图、视频参考、视频编辑等模式</strong>。</p><p><strong>首尾帧视频生成</strong>：首帧图片只支持<strong>一张</strong>图片，<strong>图片的Usage字段为FirstFrame</strong>，LastFrameFileId 或者 LastFrameUrl 表示尾帧。可以单独传首帧，不能单独传尾帧。<strong>首尾帧生成会参考图片比例</strong>。<br><strong>参考图片生成</strong>：可传入单张图片或者多张，<strong>图片的Usage字段为Reference</strong>；参考图片，可以调整生成视频的宽高比例。<br><strong>视频编辑、视频参考</strong>：Vidu、Kling可输入视频作为参考或者进行编辑。传入视频的同时也可以传入图片，<strong>图片的Usage字段为Reference</strong>。</p><p>注意：</p><ol><li>图片大小不超过10M。</li><li>支持的图片格式：jpeg、jpg、png。x0b</li><li>关于模型某个版本是否支持参考图、首尾帧、视频编辑等功能，可向我们索取文档或者参考原厂文档信息。</li></ol>
     */
    public AigcVideoTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>用于描述模型在生成视频时要使用的资源文件，分为<strong>首尾帧模式、参考图、视频参考、视频编辑等模式</strong>。</p><p><strong>首尾帧视频生成</strong>：首帧图片只支持<strong>一张</strong>图片，<strong>图片的Usage字段为FirstFrame</strong>，LastFrameFileId 或者 LastFrameUrl 表示尾帧。可以单独传首帧，不能单独传尾帧。<strong>首尾帧生成会参考图片比例</strong>。<br><strong>参考图片生成</strong>：可传入单张图片或者多张，<strong>图片的Usage字段为Reference</strong>；参考图片，可以调整生成视频的宽高比例。<br><strong>视频编辑、视频参考</strong>：Vidu、Kling可输入视频作为参考或者进行编辑。传入视频的同时也可以传入图片，<strong>图片的Usage字段为Reference</strong>。</p><p>注意：</p><ol><li>图片大小不超过10M。</li><li>支持的图片格式：jpeg、jpg、png。x0b</li><li>关于模型某个版本是否支持参考图、首尾帧、视频编辑等功能，可向我们索取文档或者参考原厂文档信息。</li></ol>
     * @param FileInfos <p>用于描述模型在生成视频时要使用的资源文件，分为<strong>首尾帧模式、参考图、视频参考、视频编辑等模式</strong>。</p><p><strong>首尾帧视频生成</strong>：首帧图片只支持<strong>一张</strong>图片，<strong>图片的Usage字段为FirstFrame</strong>，LastFrameFileId 或者 LastFrameUrl 表示尾帧。可以单独传首帧，不能单独传尾帧。<strong>首尾帧生成会参考图片比例</strong>。<br><strong>参考图片生成</strong>：可传入单张图片或者多张，<strong>图片的Usage字段为Reference</strong>；参考图片，可以调整生成视频的宽高比例。<br><strong>视频编辑、视频参考</strong>：Vidu、Kling可输入视频作为参考或者进行编辑。传入视频的同时也可以传入图片，<strong>图片的Usage字段为Reference</strong>。</p><p>注意：</p><ol><li>图片大小不超过10M。</li><li>支持的图片格式：jpeg、jpg、png。x0b</li><li>关于模型某个版本是否支持参考图、首尾帧、视频编辑等功能，可向我们索取文档或者参考原厂文档信息。</li></ol>
     */
    public void setFileInfos(AigcVideoTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get <p>固定主体输入信息。</p> 
     * @return SubjectInfos <p>固定主体输入信息。</p>
     */
    public AigcVideoTaskInputSubjectInfo [] getSubjectInfos() {
        return this.SubjectInfos;
    }

    /**
     * Set <p>固定主体输入信息。</p>
     * @param SubjectInfos <p>固定主体输入信息。</p>
     */
    public void setSubjectInfos(AigcVideoTaskInputSubjectInfo [] SubjectInfos) {
        this.SubjectInfos = SubjectInfos;
    }

    /**
     * Get <p>用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。</p><ol><li>指定该参数时，须同时通过 FileInfos 指定首帧画面。</li><li>图片大小需小于10M。</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol> 
     * @return LastFrameFileId <p>用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。</p><ol><li>指定该参数时，须同时通过 FileInfos 指定首帧画面。</li><li>图片大小需小于10M。</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
     */
    public String getLastFrameFileId() {
        return this.LastFrameFileId;
    }

    /**
     * Set <p>用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。</p><ol><li>指定该参数时，须同时通过 FileInfos 指定首帧画面。</li><li>图片大小需小于10M。</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
     * @param LastFrameFileId <p>用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。</p><ol><li>指定该参数时，须同时通过 FileInfos 指定首帧画面。</li><li>图片大小需小于10M。</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
     */
    public void setLastFrameFileId(String LastFrameFileId) {
        this.LastFrameFileId = LastFrameFileId;
    }

    /**
     * Get <p>用于作为尾帧画面来生成视频的媒体文件 URL。说明：</p><ol><li>指定该参数时，须同时通过 FileInfos 指定首帧画面。</li><li>图片大小需小于5M。</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol> 
     * @return LastFrameUrl <p>用于作为尾帧画面来生成视频的媒体文件 URL。说明：</p><ol><li>指定该参数时，须同时通过 FileInfos 指定首帧画面。</li><li>图片大小需小于5M。</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
     */
    public String getLastFrameUrl() {
        return this.LastFrameUrl;
    }

    /**
     * Set <p>用于作为尾帧画面来生成视频的媒体文件 URL。说明：</p><ol><li>指定该参数时，须同时通过 FileInfos 指定首帧画面。</li><li>图片大小需小于5M。</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
     * @param LastFrameUrl <p>用于作为尾帧画面来生成视频的媒体文件 URL。说明：</p><ol><li>指定该参数时，须同时通过 FileInfos 指定首帧画面。</li><li>图片大小需小于5M。</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
     */
    public void setLastFrameUrl(String LastFrameUrl) {
        this.LastFrameUrl = LastFrameUrl;
    }

    /**
     * Get <p>生成视频的提示词。<br>当未传入参考文件，没有使用场景类型，ExtInfo不为空，Prompt 为必填。</p> 
     * @return Prompt <p>生成视频的提示词。<br>当未传入参考文件，没有使用场景类型，ExtInfo不为空，Prompt 为必填。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>生成视频的提示词。<br>当未传入参考文件，没有使用场景类型，ExtInfo不为空，Prompt 为必填。</p>
     * @param Prompt <p>生成视频的提示词。<br>当未传入参考文件，没有使用场景类型，ExtInfo不为空，Prompt 为必填。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>要阻止模型生成视频的提示词。</p> 
     * @return NegativePrompt <p>要阻止模型生成视频的提示词。</p>
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set <p>要阻止模型生成视频的提示词。</p>
     * @param NegativePrompt <p>要阻止模型生成视频的提示词。</p>
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get <p>是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p> 
     * @return EnhancePrompt <p>是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set <p>是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     * @param EnhancePrompt <p>是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     */
    public void setEnhancePrompt(String EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get <p>生视频任务的输出媒体文件配置。</p> 
     * @return OutputConfig <p>生视频任务的输出媒体文件配置。</p>
     */
    public AigcVideoOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>生视频任务的输出媒体文件配置。</p>
     * @param OutputConfig <p>生视频任务的输出媒体文件配置。</p>
     */
    public void setOutputConfig(AigcVideoOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get <p>输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。</p> 
     * @return InputRegion <p>输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。</p>
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set <p>输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。</p>
     * @param InputRegion <p>输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。</p>
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    /**
     * Get <p>场景类型。取值如下：</p><li>当 ModelName 为 Kling 时：    motion_control 表示动作控制；    avatar_i2v 表示数字人；    lip_sync 表示对口型；</li><li>当 ModelName 为 Vidu 时：    template_effect 表示特效模板；</li><li>其他 ModelName 暂不支持。</li> 
     * @return SceneType <p>场景类型。取值如下：</p><li>当 ModelName 为 Kling 时：    motion_control 表示动作控制；    avatar_i2v 表示数字人；    lip_sync 表示对口型；</li><li>当 ModelName 为 Vidu 时：    template_effect 表示特效模板；</li><li>其他 ModelName 暂不支持。</li>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>场景类型。取值如下：</p><li>当 ModelName 为 Kling 时：    motion_control 表示动作控制；    avatar_i2v 表示数字人；    lip_sync 表示对口型；</li><li>当 ModelName 为 Vidu 时：    template_effect 表示特效模板；</li><li>其他 ModelName 暂不支持。</li>
     * @param SceneType <p>场景类型。取值如下：</p><li>当 ModelName 为 Kling 时：    motion_control 表示动作控制；    avatar_i2v 表示数字人；    lip_sync 表示对口型；</li><li>当 ModelName 为 Vidu 时：    template_effect 表示特效模板；</li><li>其他 ModelName 暂不支持。</li>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>模型随机种子。</p> 
     * @return Seed <p>模型随机种子。</p>
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set <p>模型随机种子。</p>
     * @param Seed <p>模型随机种子。</p>
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p> 
     * @return SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     * @param SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p> 
     * @return TasksPriority <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     * @param TasksPriority <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get <p>保留字段，特殊用途时使用。<br>可用于传入模型特殊参数、分镜prompt等</p> 
     * @return ExtInfo <p>保留字段，特殊用途时使用。<br>可用于传入模型特殊参数、分镜prompt等</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>保留字段，特殊用途时使用。<br>可用于传入模型特殊参数、分镜prompt等</p>
     * @param ExtInfo <p>保留字段，特殊用途时使用。<br>可用于传入模型特殊参数、分镜prompt等</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public CreateAigcVideoTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcVideoTaskRequest(CreateAigcVideoTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new AigcVideoTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcVideoTaskInputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.SubjectInfos != null) {
            this.SubjectInfos = new AigcVideoTaskInputSubjectInfo[source.SubjectInfos.length];
            for (int i = 0; i < source.SubjectInfos.length; i++) {
                this.SubjectInfos[i] = new AigcVideoTaskInputSubjectInfo(source.SubjectInfos[i]);
            }
        }
        if (source.LastFrameFileId != null) {
            this.LastFrameFileId = new String(source.LastFrameFileId);
        }
        if (source.LastFrameUrl != null) {
            this.LastFrameUrl = new String(source.LastFrameUrl);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.EnhancePrompt != null) {
            this.EnhancePrompt = new String(source.EnhancePrompt);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcVideoOutputConfig(source.OutputConfig);
        }
        if (source.InputRegion != null) {
            this.InputRegion = new String(source.InputRegion);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.Seed != null) {
            this.Seed = new Long(source.Seed);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArrayObj(map, prefix + "SubjectInfos.", this.SubjectInfos);
        this.setParamSimple(map, prefix + "LastFrameFileId", this.LastFrameFileId);
        this.setParamSimple(map, prefix + "LastFrameUrl", this.LastFrameUrl);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "InputRegion", this.InputRegion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

