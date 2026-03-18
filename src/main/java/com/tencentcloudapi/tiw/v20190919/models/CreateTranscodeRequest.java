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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTranscodeRequest extends AbstractModel {

    /**
    * <p>客户的SdkAppId</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>经过URL编码后的转码文件地址。URL 编码会将字符转换为可通过因特网传输的格式，比如文档地址为http://example.com/测试.pdf，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pdf。为了提高URL解析的成功率，请对URL进行编码。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>是否为静态PPT，默认为False；<br>如果IsStaticPPT为False，后缀名为.ppt或.pptx的文档会动态转码成HTML5页面，其他格式的文档会静态转码成图片；如果IsStaticPPT为True，所有格式的文档会静态转码成图片；</p>
    */
    @SerializedName("IsStaticPPT")
    @Expose
    private Boolean IsStaticPPT;

    /**
    * <p>注意: 该参数已废弃, 请使用最新的 <a href="https://cloud.tencent.com/document/api/1137/40060#SDK">云API SDK</a> ，使用 MinScaleResolution字段传递分辨率</p><p>转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率</p><p>示例：1280x720，注意分辨率宽高中间为英文字母&quot;xyz&quot;的&quot;x&quot;</p>
    */
    @SerializedName("MinResolution")
    @Expose
    private String MinResolution;

    /**
    * <p>动态PPT转码可以为文件生成该分辨率的缩略图，不传、传空字符串或分辨率格式错误则不生成缩略图，分辨率格式同MinResolution</p>
    */
    @SerializedName("ThumbnailResolution")
    @Expose
    private String ThumbnailResolution;

    /**
    * <p>转码文件压缩格式，不传、传空字符串或不是指定的格式则不生成压缩文件，目前支持如下压缩格式：</p><p>zip： 生成<code>.zip</code>压缩包<br>tar.gz： 生成<code>.tar.gz</code>压缩包</p>
    */
    @SerializedName("CompressFileType")
    @Expose
    private String CompressFileType;

    /**
    * <p>内部参数</p>
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
    * <p>注意：该参数已废弃，文档转码优先级， 只有对于PPT动态转码生效，支持填入以下值：<br>- low: 低优先级转码，对于动态转码，能支持500MB（下载超时时间10分钟）以及2000页文档，但资源有限可能会有比较长时间的排队，请酌情使用该功能。<br>- 不填表示正常优先级转码，支持200MB文件（下载超时时间2分钟），500页以内的文档进行转码<br>注意：对于PDF等静态文件转码，无论是正常优先级或者低优先级，最大只能支持200MB</p>
    */
    @SerializedName("Priority")
    @Expose
    private String Priority;

    /**
    * <p>转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。<br>分辨率越高，效果越清晰，转出来的图片资源体积会越大，课件加载耗时会变长，请根据实际使用场景配置此参数。</p><p>示例：1280x720，注意分辨率宽高中间为英文字母&quot;xyz&quot;的&quot;x&quot;</p>
    */
    @SerializedName("MinScaleResolution")
    @Expose
    private String MinScaleResolution;

    /**
    * <p>此参数仅对动态转码生效。</p><p>是否对不支持元素开启自动处理的功能，默认不开启。<br>true -- 开启<br>false -- 不开启</p><p>当设置为<code>true</code>时，可配合<code>AutoHandleUnsupportedElementTypes</code>参数使用，具体有哪些不兼容元素类型，可参考<code>AutoHandleUnsupportedElementTypes</code>参数的说明。</p>
    */
    @SerializedName("AutoHandleUnsupportedElement")
    @Expose
    private Boolean AutoHandleUnsupportedElement;

    /**
    * <p>此参数仅在<code>AutoHandleUnsupportedElement</code>参数为<code>true</code>的情况下有效。</p><p>指定需要自动处理的不兼容元素类型，默认对所有不兼容的元素进行自动处理。</p><p>目前支持检测的不兼容元素类型及对应的自动处理方式如下：<br>0: 不支持的墨迹类型<br>-- 自动处理方式：移除墨迹</p><p>1: 自动翻页<br>-- 自动处理方式：移除自动翻页设置，并修改为单击切换</p><p>2: 已损坏音视频<br>-- 自动处理方式：移除对损坏音视频的引用</p><p>3: 不可访问资源<br>-- 自动处理方式：移除对不可访问的资源的引用</p><p>4: 只读文件<br>-- 自动处理方式：移除只读设置</p><p>5: 不支持的元素编辑锁定状态<br>-- 自动处理方式：移除锁定状态</p><p>6: 可能有兼容问题的字体<br>-- 自动处理方式： 不支持处理</p><p>7: 设置了柔化边缘的GIF图片<br>-- 自动处理方式：移除柔化边缘设置</p><p>8: 存在不兼容的空格下划线<br>-- 自动处理方式：通过调整空格下划线前后文本的字体语言体系，保证空格下划线表现正常</p><p>9: 存在设置了分段动画的数学公式和文本混合内容<br>-- 自动处理方式： 不支持处理</p><p>10: 存在设置了分段动画的渐变色文本<br>-- 自动处理方式： 不支持处理</p><p>11: 存在不兼容的分散对齐方式<br>-- 自动处理方式： 不支持处理</p><p>12: 存在不兼容的多倍行距设置<br>-- 自动处理方式： 不支持处理</p><p>13: 存在带有特殊符号内容的datetime类型的a:fld标签元素<br>-- 自动处理方式： a:fld标签替换为普通文本</p>
    */
    @SerializedName("AutoHandleUnsupportedElementTypes")
    @Expose
    private Long [] AutoHandleUnsupportedElementTypes;

    /**
    * <p>Excel表格转码参数，可设置转码时表格纸张大小及纸张方向等参数（仅对转码文件为Excel表格文件的静态转码任务生效）</p>
    */
    @SerializedName("ExcelParam")
    @Expose
    private ExcelParam ExcelParam;

    /**
     * Get <p>客户的SdkAppId</p> 
     * @return SdkAppId <p>客户的SdkAppId</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>客户的SdkAppId</p>
     * @param SdkAppId <p>客户的SdkAppId</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>经过URL编码后的转码文件地址。URL 编码会将字符转换为可通过因特网传输的格式，比如文档地址为http://example.com/测试.pdf，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pdf。为了提高URL解析的成功率，请对URL进行编码。</p> 
     * @return Url <p>经过URL编码后的转码文件地址。URL 编码会将字符转换为可通过因特网传输的格式，比如文档地址为http://example.com/测试.pdf，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pdf。为了提高URL解析的成功率，请对URL进行编码。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>经过URL编码后的转码文件地址。URL 编码会将字符转换为可通过因特网传输的格式，比如文档地址为http://example.com/测试.pdf，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pdf。为了提高URL解析的成功率，请对URL进行编码。</p>
     * @param Url <p>经过URL编码后的转码文件地址。URL 编码会将字符转换为可通过因特网传输的格式，比如文档地址为http://example.com/测试.pdf，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pdf。为了提高URL解析的成功率，请对URL进行编码。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>是否为静态PPT，默认为False；<br>如果IsStaticPPT为False，后缀名为.ppt或.pptx的文档会动态转码成HTML5页面，其他格式的文档会静态转码成图片；如果IsStaticPPT为True，所有格式的文档会静态转码成图片；</p> 
     * @return IsStaticPPT <p>是否为静态PPT，默认为False；<br>如果IsStaticPPT为False，后缀名为.ppt或.pptx的文档会动态转码成HTML5页面，其他格式的文档会静态转码成图片；如果IsStaticPPT为True，所有格式的文档会静态转码成图片；</p>
     */
    public Boolean getIsStaticPPT() {
        return this.IsStaticPPT;
    }

    /**
     * Set <p>是否为静态PPT，默认为False；<br>如果IsStaticPPT为False，后缀名为.ppt或.pptx的文档会动态转码成HTML5页面，其他格式的文档会静态转码成图片；如果IsStaticPPT为True，所有格式的文档会静态转码成图片；</p>
     * @param IsStaticPPT <p>是否为静态PPT，默认为False；<br>如果IsStaticPPT为False，后缀名为.ppt或.pptx的文档会动态转码成HTML5页面，其他格式的文档会静态转码成图片；如果IsStaticPPT为True，所有格式的文档会静态转码成图片；</p>
     */
    public void setIsStaticPPT(Boolean IsStaticPPT) {
        this.IsStaticPPT = IsStaticPPT;
    }

    /**
     * Get <p>注意: 该参数已废弃, 请使用最新的 <a href="https://cloud.tencent.com/document/api/1137/40060#SDK">云API SDK</a> ，使用 MinScaleResolution字段传递分辨率</p><p>转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率</p><p>示例：1280x720，注意分辨率宽高中间为英文字母&quot;xyz&quot;的&quot;x&quot;</p> 
     * @return MinResolution <p>注意: 该参数已废弃, 请使用最新的 <a href="https://cloud.tencent.com/document/api/1137/40060#SDK">云API SDK</a> ，使用 MinScaleResolution字段传递分辨率</p><p>转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率</p><p>示例：1280x720，注意分辨率宽高中间为英文字母&quot;xyz&quot;的&quot;x&quot;</p>
     */
    public String getMinResolution() {
        return this.MinResolution;
    }

    /**
     * Set <p>注意: 该参数已废弃, 请使用最新的 <a href="https://cloud.tencent.com/document/api/1137/40060#SDK">云API SDK</a> ，使用 MinScaleResolution字段传递分辨率</p><p>转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率</p><p>示例：1280x720，注意分辨率宽高中间为英文字母&quot;xyz&quot;的&quot;x&quot;</p>
     * @param MinResolution <p>注意: 该参数已废弃, 请使用最新的 <a href="https://cloud.tencent.com/document/api/1137/40060#SDK">云API SDK</a> ，使用 MinScaleResolution字段传递分辨率</p><p>转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率</p><p>示例：1280x720，注意分辨率宽高中间为英文字母&quot;xyz&quot;的&quot;x&quot;</p>
     */
    public void setMinResolution(String MinResolution) {
        this.MinResolution = MinResolution;
    }

    /**
     * Get <p>动态PPT转码可以为文件生成该分辨率的缩略图，不传、传空字符串或分辨率格式错误则不生成缩略图，分辨率格式同MinResolution</p> 
     * @return ThumbnailResolution <p>动态PPT转码可以为文件生成该分辨率的缩略图，不传、传空字符串或分辨率格式错误则不生成缩略图，分辨率格式同MinResolution</p>
     */
    public String getThumbnailResolution() {
        return this.ThumbnailResolution;
    }

    /**
     * Set <p>动态PPT转码可以为文件生成该分辨率的缩略图，不传、传空字符串或分辨率格式错误则不生成缩略图，分辨率格式同MinResolution</p>
     * @param ThumbnailResolution <p>动态PPT转码可以为文件生成该分辨率的缩略图，不传、传空字符串或分辨率格式错误则不生成缩略图，分辨率格式同MinResolution</p>
     */
    public void setThumbnailResolution(String ThumbnailResolution) {
        this.ThumbnailResolution = ThumbnailResolution;
    }

    /**
     * Get <p>转码文件压缩格式，不传、传空字符串或不是指定的格式则不生成压缩文件，目前支持如下压缩格式：</p><p>zip： 生成<code>.zip</code>压缩包<br>tar.gz： 生成<code>.tar.gz</code>压缩包</p> 
     * @return CompressFileType <p>转码文件压缩格式，不传、传空字符串或不是指定的格式则不生成压缩文件，目前支持如下压缩格式：</p><p>zip： 生成<code>.zip</code>压缩包<br>tar.gz： 生成<code>.tar.gz</code>压缩包</p>
     */
    public String getCompressFileType() {
        return this.CompressFileType;
    }

    /**
     * Set <p>转码文件压缩格式，不传、传空字符串或不是指定的格式则不生成压缩文件，目前支持如下压缩格式：</p><p>zip： 生成<code>.zip</code>压缩包<br>tar.gz： 生成<code>.tar.gz</code>压缩包</p>
     * @param CompressFileType <p>转码文件压缩格式，不传、传空字符串或不是指定的格式则不生成压缩文件，目前支持如下压缩格式：</p><p>zip： 生成<code>.zip</code>压缩包<br>tar.gz： 生成<code>.tar.gz</code>压缩包</p>
     */
    public void setCompressFileType(String CompressFileType) {
        this.CompressFileType = CompressFileType;
    }

    /**
     * Get <p>内部参数</p> 
     * @return ExtraData <p>内部参数</p>
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set <p>内部参数</p>
     * @param ExtraData <p>内部参数</p>
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    /**
     * Get <p>注意：该参数已废弃，文档转码优先级， 只有对于PPT动态转码生效，支持填入以下值：<br>- low: 低优先级转码，对于动态转码，能支持500MB（下载超时时间10分钟）以及2000页文档，但资源有限可能会有比较长时间的排队，请酌情使用该功能。<br>- 不填表示正常优先级转码，支持200MB文件（下载超时时间2分钟），500页以内的文档进行转码<br>注意：对于PDF等静态文件转码，无论是正常优先级或者低优先级，最大只能支持200MB</p> 
     * @return Priority <p>注意：该参数已废弃，文档转码优先级， 只有对于PPT动态转码生效，支持填入以下值：<br>- low: 低优先级转码，对于动态转码，能支持500MB（下载超时时间10分钟）以及2000页文档，但资源有限可能会有比较长时间的排队，请酌情使用该功能。<br>- 不填表示正常优先级转码，支持200MB文件（下载超时时间2分钟），500页以内的文档进行转码<br>注意：对于PDF等静态文件转码，无论是正常优先级或者低优先级，最大只能支持200MB</p>
     */
    public String getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>注意：该参数已废弃，文档转码优先级， 只有对于PPT动态转码生效，支持填入以下值：<br>- low: 低优先级转码，对于动态转码，能支持500MB（下载超时时间10分钟）以及2000页文档，但资源有限可能会有比较长时间的排队，请酌情使用该功能。<br>- 不填表示正常优先级转码，支持200MB文件（下载超时时间2分钟），500页以内的文档进行转码<br>注意：对于PDF等静态文件转码，无论是正常优先级或者低优先级，最大只能支持200MB</p>
     * @param Priority <p>注意：该参数已废弃，文档转码优先级， 只有对于PPT动态转码生效，支持填入以下值：<br>- low: 低优先级转码，对于动态转码，能支持500MB（下载超时时间10分钟）以及2000页文档，但资源有限可能会有比较长时间的排队，请酌情使用该功能。<br>- 不填表示正常优先级转码，支持200MB文件（下载超时时间2分钟），500页以内的文档进行转码<br>注意：对于PDF等静态文件转码，无论是正常优先级或者低优先级，最大只能支持200MB</p>
     */
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。<br>分辨率越高，效果越清晰，转出来的图片资源体积会越大，课件加载耗时会变长，请根据实际使用场景配置此参数。</p><p>示例：1280x720，注意分辨率宽高中间为英文字母&quot;xyz&quot;的&quot;x&quot;</p> 
     * @return MinScaleResolution <p>转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。<br>分辨率越高，效果越清晰，转出来的图片资源体积会越大，课件加载耗时会变长，请根据实际使用场景配置此参数。</p><p>示例：1280x720，注意分辨率宽高中间为英文字母&quot;xyz&quot;的&quot;x&quot;</p>
     */
    public String getMinScaleResolution() {
        return this.MinScaleResolution;
    }

    /**
     * Set <p>转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。<br>分辨率越高，效果越清晰，转出来的图片资源体积会越大，课件加载耗时会变长，请根据实际使用场景配置此参数。</p><p>示例：1280x720，注意分辨率宽高中间为英文字母&quot;xyz&quot;的&quot;x&quot;</p>
     * @param MinScaleResolution <p>转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。<br>分辨率越高，效果越清晰，转出来的图片资源体积会越大，课件加载耗时会变长，请根据实际使用场景配置此参数。</p><p>示例：1280x720，注意分辨率宽高中间为英文字母&quot;xyz&quot;的&quot;x&quot;</p>
     */
    public void setMinScaleResolution(String MinScaleResolution) {
        this.MinScaleResolution = MinScaleResolution;
    }

    /**
     * Get <p>此参数仅对动态转码生效。</p><p>是否对不支持元素开启自动处理的功能，默认不开启。<br>true -- 开启<br>false -- 不开启</p><p>当设置为<code>true</code>时，可配合<code>AutoHandleUnsupportedElementTypes</code>参数使用，具体有哪些不兼容元素类型，可参考<code>AutoHandleUnsupportedElementTypes</code>参数的说明。</p> 
     * @return AutoHandleUnsupportedElement <p>此参数仅对动态转码生效。</p><p>是否对不支持元素开启自动处理的功能，默认不开启。<br>true -- 开启<br>false -- 不开启</p><p>当设置为<code>true</code>时，可配合<code>AutoHandleUnsupportedElementTypes</code>参数使用，具体有哪些不兼容元素类型，可参考<code>AutoHandleUnsupportedElementTypes</code>参数的说明。</p>
     */
    public Boolean getAutoHandleUnsupportedElement() {
        return this.AutoHandleUnsupportedElement;
    }

    /**
     * Set <p>此参数仅对动态转码生效。</p><p>是否对不支持元素开启自动处理的功能，默认不开启。<br>true -- 开启<br>false -- 不开启</p><p>当设置为<code>true</code>时，可配合<code>AutoHandleUnsupportedElementTypes</code>参数使用，具体有哪些不兼容元素类型，可参考<code>AutoHandleUnsupportedElementTypes</code>参数的说明。</p>
     * @param AutoHandleUnsupportedElement <p>此参数仅对动态转码生效。</p><p>是否对不支持元素开启自动处理的功能，默认不开启。<br>true -- 开启<br>false -- 不开启</p><p>当设置为<code>true</code>时，可配合<code>AutoHandleUnsupportedElementTypes</code>参数使用，具体有哪些不兼容元素类型，可参考<code>AutoHandleUnsupportedElementTypes</code>参数的说明。</p>
     */
    public void setAutoHandleUnsupportedElement(Boolean AutoHandleUnsupportedElement) {
        this.AutoHandleUnsupportedElement = AutoHandleUnsupportedElement;
    }

    /**
     * Get <p>此参数仅在<code>AutoHandleUnsupportedElement</code>参数为<code>true</code>的情况下有效。</p><p>指定需要自动处理的不兼容元素类型，默认对所有不兼容的元素进行自动处理。</p><p>目前支持检测的不兼容元素类型及对应的自动处理方式如下：<br>0: 不支持的墨迹类型<br>-- 自动处理方式：移除墨迹</p><p>1: 自动翻页<br>-- 自动处理方式：移除自动翻页设置，并修改为单击切换</p><p>2: 已损坏音视频<br>-- 自动处理方式：移除对损坏音视频的引用</p><p>3: 不可访问资源<br>-- 自动处理方式：移除对不可访问的资源的引用</p><p>4: 只读文件<br>-- 自动处理方式：移除只读设置</p><p>5: 不支持的元素编辑锁定状态<br>-- 自动处理方式：移除锁定状态</p><p>6: 可能有兼容问题的字体<br>-- 自动处理方式： 不支持处理</p><p>7: 设置了柔化边缘的GIF图片<br>-- 自动处理方式：移除柔化边缘设置</p><p>8: 存在不兼容的空格下划线<br>-- 自动处理方式：通过调整空格下划线前后文本的字体语言体系，保证空格下划线表现正常</p><p>9: 存在设置了分段动画的数学公式和文本混合内容<br>-- 自动处理方式： 不支持处理</p><p>10: 存在设置了分段动画的渐变色文本<br>-- 自动处理方式： 不支持处理</p><p>11: 存在不兼容的分散对齐方式<br>-- 自动处理方式： 不支持处理</p><p>12: 存在不兼容的多倍行距设置<br>-- 自动处理方式： 不支持处理</p><p>13: 存在带有特殊符号内容的datetime类型的a:fld标签元素<br>-- 自动处理方式： a:fld标签替换为普通文本</p> 
     * @return AutoHandleUnsupportedElementTypes <p>此参数仅在<code>AutoHandleUnsupportedElement</code>参数为<code>true</code>的情况下有效。</p><p>指定需要自动处理的不兼容元素类型，默认对所有不兼容的元素进行自动处理。</p><p>目前支持检测的不兼容元素类型及对应的自动处理方式如下：<br>0: 不支持的墨迹类型<br>-- 自动处理方式：移除墨迹</p><p>1: 自动翻页<br>-- 自动处理方式：移除自动翻页设置，并修改为单击切换</p><p>2: 已损坏音视频<br>-- 自动处理方式：移除对损坏音视频的引用</p><p>3: 不可访问资源<br>-- 自动处理方式：移除对不可访问的资源的引用</p><p>4: 只读文件<br>-- 自动处理方式：移除只读设置</p><p>5: 不支持的元素编辑锁定状态<br>-- 自动处理方式：移除锁定状态</p><p>6: 可能有兼容问题的字体<br>-- 自动处理方式： 不支持处理</p><p>7: 设置了柔化边缘的GIF图片<br>-- 自动处理方式：移除柔化边缘设置</p><p>8: 存在不兼容的空格下划线<br>-- 自动处理方式：通过调整空格下划线前后文本的字体语言体系，保证空格下划线表现正常</p><p>9: 存在设置了分段动画的数学公式和文本混合内容<br>-- 自动处理方式： 不支持处理</p><p>10: 存在设置了分段动画的渐变色文本<br>-- 自动处理方式： 不支持处理</p><p>11: 存在不兼容的分散对齐方式<br>-- 自动处理方式： 不支持处理</p><p>12: 存在不兼容的多倍行距设置<br>-- 自动处理方式： 不支持处理</p><p>13: 存在带有特殊符号内容的datetime类型的a:fld标签元素<br>-- 自动处理方式： a:fld标签替换为普通文本</p>
     */
    public Long [] getAutoHandleUnsupportedElementTypes() {
        return this.AutoHandleUnsupportedElementTypes;
    }

    /**
     * Set <p>此参数仅在<code>AutoHandleUnsupportedElement</code>参数为<code>true</code>的情况下有效。</p><p>指定需要自动处理的不兼容元素类型，默认对所有不兼容的元素进行自动处理。</p><p>目前支持检测的不兼容元素类型及对应的自动处理方式如下：<br>0: 不支持的墨迹类型<br>-- 自动处理方式：移除墨迹</p><p>1: 自动翻页<br>-- 自动处理方式：移除自动翻页设置，并修改为单击切换</p><p>2: 已损坏音视频<br>-- 自动处理方式：移除对损坏音视频的引用</p><p>3: 不可访问资源<br>-- 自动处理方式：移除对不可访问的资源的引用</p><p>4: 只读文件<br>-- 自动处理方式：移除只读设置</p><p>5: 不支持的元素编辑锁定状态<br>-- 自动处理方式：移除锁定状态</p><p>6: 可能有兼容问题的字体<br>-- 自动处理方式： 不支持处理</p><p>7: 设置了柔化边缘的GIF图片<br>-- 自动处理方式：移除柔化边缘设置</p><p>8: 存在不兼容的空格下划线<br>-- 自动处理方式：通过调整空格下划线前后文本的字体语言体系，保证空格下划线表现正常</p><p>9: 存在设置了分段动画的数学公式和文本混合内容<br>-- 自动处理方式： 不支持处理</p><p>10: 存在设置了分段动画的渐变色文本<br>-- 自动处理方式： 不支持处理</p><p>11: 存在不兼容的分散对齐方式<br>-- 自动处理方式： 不支持处理</p><p>12: 存在不兼容的多倍行距设置<br>-- 自动处理方式： 不支持处理</p><p>13: 存在带有特殊符号内容的datetime类型的a:fld标签元素<br>-- 自动处理方式： a:fld标签替换为普通文本</p>
     * @param AutoHandleUnsupportedElementTypes <p>此参数仅在<code>AutoHandleUnsupportedElement</code>参数为<code>true</code>的情况下有效。</p><p>指定需要自动处理的不兼容元素类型，默认对所有不兼容的元素进行自动处理。</p><p>目前支持检测的不兼容元素类型及对应的自动处理方式如下：<br>0: 不支持的墨迹类型<br>-- 自动处理方式：移除墨迹</p><p>1: 自动翻页<br>-- 自动处理方式：移除自动翻页设置，并修改为单击切换</p><p>2: 已损坏音视频<br>-- 自动处理方式：移除对损坏音视频的引用</p><p>3: 不可访问资源<br>-- 自动处理方式：移除对不可访问的资源的引用</p><p>4: 只读文件<br>-- 自动处理方式：移除只读设置</p><p>5: 不支持的元素编辑锁定状态<br>-- 自动处理方式：移除锁定状态</p><p>6: 可能有兼容问题的字体<br>-- 自动处理方式： 不支持处理</p><p>7: 设置了柔化边缘的GIF图片<br>-- 自动处理方式：移除柔化边缘设置</p><p>8: 存在不兼容的空格下划线<br>-- 自动处理方式：通过调整空格下划线前后文本的字体语言体系，保证空格下划线表现正常</p><p>9: 存在设置了分段动画的数学公式和文本混合内容<br>-- 自动处理方式： 不支持处理</p><p>10: 存在设置了分段动画的渐变色文本<br>-- 自动处理方式： 不支持处理</p><p>11: 存在不兼容的分散对齐方式<br>-- 自动处理方式： 不支持处理</p><p>12: 存在不兼容的多倍行距设置<br>-- 自动处理方式： 不支持处理</p><p>13: 存在带有特殊符号内容的datetime类型的a:fld标签元素<br>-- 自动处理方式： a:fld标签替换为普通文本</p>
     */
    public void setAutoHandleUnsupportedElementTypes(Long [] AutoHandleUnsupportedElementTypes) {
        this.AutoHandleUnsupportedElementTypes = AutoHandleUnsupportedElementTypes;
    }

    /**
     * Get <p>Excel表格转码参数，可设置转码时表格纸张大小及纸张方向等参数（仅对转码文件为Excel表格文件的静态转码任务生效）</p> 
     * @return ExcelParam <p>Excel表格转码参数，可设置转码时表格纸张大小及纸张方向等参数（仅对转码文件为Excel表格文件的静态转码任务生效）</p>
     */
    public ExcelParam getExcelParam() {
        return this.ExcelParam;
    }

    /**
     * Set <p>Excel表格转码参数，可设置转码时表格纸张大小及纸张方向等参数（仅对转码文件为Excel表格文件的静态转码任务生效）</p>
     * @param ExcelParam <p>Excel表格转码参数，可设置转码时表格纸张大小及纸张方向等参数（仅对转码文件为Excel表格文件的静态转码任务生效）</p>
     */
    public void setExcelParam(ExcelParam ExcelParam) {
        this.ExcelParam = ExcelParam;
    }

    public CreateTranscodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTranscodeRequest(CreateTranscodeRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.IsStaticPPT != null) {
            this.IsStaticPPT = new Boolean(source.IsStaticPPT);
        }
        if (source.MinResolution != null) {
            this.MinResolution = new String(source.MinResolution);
        }
        if (source.ThumbnailResolution != null) {
            this.ThumbnailResolution = new String(source.ThumbnailResolution);
        }
        if (source.CompressFileType != null) {
            this.CompressFileType = new String(source.CompressFileType);
        }
        if (source.ExtraData != null) {
            this.ExtraData = new String(source.ExtraData);
        }
        if (source.Priority != null) {
            this.Priority = new String(source.Priority);
        }
        if (source.MinScaleResolution != null) {
            this.MinScaleResolution = new String(source.MinScaleResolution);
        }
        if (source.AutoHandleUnsupportedElement != null) {
            this.AutoHandleUnsupportedElement = new Boolean(source.AutoHandleUnsupportedElement);
        }
        if (source.AutoHandleUnsupportedElementTypes != null) {
            this.AutoHandleUnsupportedElementTypes = new Long[source.AutoHandleUnsupportedElementTypes.length];
            for (int i = 0; i < source.AutoHandleUnsupportedElementTypes.length; i++) {
                this.AutoHandleUnsupportedElementTypes[i] = new Long(source.AutoHandleUnsupportedElementTypes[i]);
            }
        }
        if (source.ExcelParam != null) {
            this.ExcelParam = new ExcelParam(source.ExcelParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "IsStaticPPT", this.IsStaticPPT);
        this.setParamSimple(map, prefix + "MinResolution", this.MinResolution);
        this.setParamSimple(map, prefix + "ThumbnailResolution", this.ThumbnailResolution);
        this.setParamSimple(map, prefix + "CompressFileType", this.CompressFileType);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "MinScaleResolution", this.MinScaleResolution);
        this.setParamSimple(map, prefix + "AutoHandleUnsupportedElement", this.AutoHandleUnsupportedElement);
        this.setParamArraySimple(map, prefix + "AutoHandleUnsupportedElementTypes.", this.AutoHandleUnsupportedElementTypes);
        this.setParamObj(map, prefix + "ExcelParam.", this.ExcelParam);

    }
}

