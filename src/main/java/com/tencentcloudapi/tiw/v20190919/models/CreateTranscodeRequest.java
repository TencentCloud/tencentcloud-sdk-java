/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTranscodeRequest extends AbstractModel{

    /**
    * 客户的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 经过URL编码后的转码文件地址。URL 编码会将字符转换为可通过因特网传输的格式，比如文档地址为http://example.com/测试.pdf，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pdf。为了提高URL解析的成功率，请对URL进行编码。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 是否为静态PPT，默认为False；
如果IsStaticPPT为False，后缀名为.ppt或.pptx的文档会动态转码成HTML5页面，其他格式的文档会静态转码成图片；如果IsStaticPPT为True，所有格式的文档会静态转码成图片；
    */
    @SerializedName("IsStaticPPT")
    @Expose
    private Boolean IsStaticPPT;

    /**
    * 注意: 该参数已废弃, 请使用最新的 [云API SDK](https://cloud.tencent.com/document/api/1137/40060#SDK) ，使用 MinScaleResolution字段传递分辨率

转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率

示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
    */
    @SerializedName("MinResolution")
    @Expose
    private String MinResolution;

    /**
    * 动态PPT转码可以为文件生成该分辨率的缩略图，不传、传空字符串或分辨率格式错误则不生成缩略图，分辨率格式同MinResolution
    */
    @SerializedName("ThumbnailResolution")
    @Expose
    private String ThumbnailResolution;

    /**
    * 转码文件压缩格式，不传、传空字符串或不是指定的格式则不生成压缩文件，目前支持如下压缩格式：

zip： 生成`.zip`压缩包
tar.gz： 生成`.tar.gz`压缩包
    */
    @SerializedName("CompressFileType")
    @Expose
    private String CompressFileType;

    /**
    * 内部参数
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
    * 文档转码优先级， 只有对于PPT动态转码生效，支持填入以下值：<br/>
- low: 低优先级转码，对于动态转码，能支持500MB（下载超时时间10分钟）以及2000页文档，但资源有限可能会有比较长时间的排队，请酌情使用该功能。<br/>
- 不填表示正常优先级转码，支持200MB文件（下载超时时间2分钟），500页以内的文档进行转码
<br/>
注意：对于PDF等静态文件转码，无论是正常优先级或者低优先级，最大只能支持200MB
    */
    @SerializedName("Priority")
    @Expose
    private String Priority;

    /**
    * 转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。
分辨率越高，效果越清晰，转出来的图片资源体积会越大，课件加载耗时会变长，请根据实际使用场景配置此参数。

示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
    */
    @SerializedName("MinScaleResolution")
    @Expose
    private String MinScaleResolution;

    /**
     * Get 客户的SdkAppId 
     * @return SdkAppId 客户的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 客户的SdkAppId
     * @param SdkAppId 客户的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 经过URL编码后的转码文件地址。URL 编码会将字符转换为可通过因特网传输的格式，比如文档地址为http://example.com/测试.pdf，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pdf。为了提高URL解析的成功率，请对URL进行编码。 
     * @return Url 经过URL编码后的转码文件地址。URL 编码会将字符转换为可通过因特网传输的格式，比如文档地址为http://example.com/测试.pdf，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pdf。为了提高URL解析的成功率，请对URL进行编码。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 经过URL编码后的转码文件地址。URL 编码会将字符转换为可通过因特网传输的格式，比如文档地址为http://example.com/测试.pdf，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pdf。为了提高URL解析的成功率，请对URL进行编码。
     * @param Url 经过URL编码后的转码文件地址。URL 编码会将字符转换为可通过因特网传输的格式，比如文档地址为http://example.com/测试.pdf，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pdf。为了提高URL解析的成功率，请对URL进行编码。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 是否为静态PPT，默认为False；
如果IsStaticPPT为False，后缀名为.ppt或.pptx的文档会动态转码成HTML5页面，其他格式的文档会静态转码成图片；如果IsStaticPPT为True，所有格式的文档会静态转码成图片； 
     * @return IsStaticPPT 是否为静态PPT，默认为False；
如果IsStaticPPT为False，后缀名为.ppt或.pptx的文档会动态转码成HTML5页面，其他格式的文档会静态转码成图片；如果IsStaticPPT为True，所有格式的文档会静态转码成图片；
     */
    public Boolean getIsStaticPPT() {
        return this.IsStaticPPT;
    }

    /**
     * Set 是否为静态PPT，默认为False；
如果IsStaticPPT为False，后缀名为.ppt或.pptx的文档会动态转码成HTML5页面，其他格式的文档会静态转码成图片；如果IsStaticPPT为True，所有格式的文档会静态转码成图片；
     * @param IsStaticPPT 是否为静态PPT，默认为False；
如果IsStaticPPT为False，后缀名为.ppt或.pptx的文档会动态转码成HTML5页面，其他格式的文档会静态转码成图片；如果IsStaticPPT为True，所有格式的文档会静态转码成图片；
     */
    public void setIsStaticPPT(Boolean IsStaticPPT) {
        this.IsStaticPPT = IsStaticPPT;
    }

    /**
     * Get 注意: 该参数已废弃, 请使用最新的 [云API SDK](https://cloud.tencent.com/document/api/1137/40060#SDK) ，使用 MinScaleResolution字段传递分辨率

转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率

示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x" 
     * @return MinResolution 注意: 该参数已废弃, 请使用最新的 [云API SDK](https://cloud.tencent.com/document/api/1137/40060#SDK) ，使用 MinScaleResolution字段传递分辨率

转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率

示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
     */
    public String getMinResolution() {
        return this.MinResolution;
    }

    /**
     * Set 注意: 该参数已废弃, 请使用最新的 [云API SDK](https://cloud.tencent.com/document/api/1137/40060#SDK) ，使用 MinScaleResolution字段传递分辨率

转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率

示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
     * @param MinResolution 注意: 该参数已废弃, 请使用最新的 [云API SDK](https://cloud.tencent.com/document/api/1137/40060#SDK) ，使用 MinScaleResolution字段传递分辨率

转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率

示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
     */
    public void setMinResolution(String MinResolution) {
        this.MinResolution = MinResolution;
    }

    /**
     * Get 动态PPT转码可以为文件生成该分辨率的缩略图，不传、传空字符串或分辨率格式错误则不生成缩略图，分辨率格式同MinResolution 
     * @return ThumbnailResolution 动态PPT转码可以为文件生成该分辨率的缩略图，不传、传空字符串或分辨率格式错误则不生成缩略图，分辨率格式同MinResolution
     */
    public String getThumbnailResolution() {
        return this.ThumbnailResolution;
    }

    /**
     * Set 动态PPT转码可以为文件生成该分辨率的缩略图，不传、传空字符串或分辨率格式错误则不生成缩略图，分辨率格式同MinResolution
     * @param ThumbnailResolution 动态PPT转码可以为文件生成该分辨率的缩略图，不传、传空字符串或分辨率格式错误则不生成缩略图，分辨率格式同MinResolution
     */
    public void setThumbnailResolution(String ThumbnailResolution) {
        this.ThumbnailResolution = ThumbnailResolution;
    }

    /**
     * Get 转码文件压缩格式，不传、传空字符串或不是指定的格式则不生成压缩文件，目前支持如下压缩格式：

zip： 生成`.zip`压缩包
tar.gz： 生成`.tar.gz`压缩包 
     * @return CompressFileType 转码文件压缩格式，不传、传空字符串或不是指定的格式则不生成压缩文件，目前支持如下压缩格式：

zip： 生成`.zip`压缩包
tar.gz： 生成`.tar.gz`压缩包
     */
    public String getCompressFileType() {
        return this.CompressFileType;
    }

    /**
     * Set 转码文件压缩格式，不传、传空字符串或不是指定的格式则不生成压缩文件，目前支持如下压缩格式：

zip： 生成`.zip`压缩包
tar.gz： 生成`.tar.gz`压缩包
     * @param CompressFileType 转码文件压缩格式，不传、传空字符串或不是指定的格式则不生成压缩文件，目前支持如下压缩格式：

zip： 生成`.zip`压缩包
tar.gz： 生成`.tar.gz`压缩包
     */
    public void setCompressFileType(String CompressFileType) {
        this.CompressFileType = CompressFileType;
    }

    /**
     * Get 内部参数 
     * @return ExtraData 内部参数
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set 内部参数
     * @param ExtraData 内部参数
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    /**
     * Get 文档转码优先级， 只有对于PPT动态转码生效，支持填入以下值：<br/>
- low: 低优先级转码，对于动态转码，能支持500MB（下载超时时间10分钟）以及2000页文档，但资源有限可能会有比较长时间的排队，请酌情使用该功能。<br/>
- 不填表示正常优先级转码，支持200MB文件（下载超时时间2分钟），500页以内的文档进行转码
<br/>
注意：对于PDF等静态文件转码，无论是正常优先级或者低优先级，最大只能支持200MB 
     * @return Priority 文档转码优先级， 只有对于PPT动态转码生效，支持填入以下值：<br/>
- low: 低优先级转码，对于动态转码，能支持500MB（下载超时时间10分钟）以及2000页文档，但资源有限可能会有比较长时间的排队，请酌情使用该功能。<br/>
- 不填表示正常优先级转码，支持200MB文件（下载超时时间2分钟），500页以内的文档进行转码
<br/>
注意：对于PDF等静态文件转码，无论是正常优先级或者低优先级，最大只能支持200MB
     */
    public String getPriority() {
        return this.Priority;
    }

    /**
     * Set 文档转码优先级， 只有对于PPT动态转码生效，支持填入以下值：<br/>
- low: 低优先级转码，对于动态转码，能支持500MB（下载超时时间10分钟）以及2000页文档，但资源有限可能会有比较长时间的排队，请酌情使用该功能。<br/>
- 不填表示正常优先级转码，支持200MB文件（下载超时时间2分钟），500页以内的文档进行转码
<br/>
注意：对于PDF等静态文件转码，无论是正常优先级或者低优先级，最大只能支持200MB
     * @param Priority 文档转码优先级， 只有对于PPT动态转码生效，支持填入以下值：<br/>
- low: 低优先级转码，对于动态转码，能支持500MB（下载超时时间10分钟）以及2000页文档，但资源有限可能会有比较长时间的排队，请酌情使用该功能。<br/>
- 不填表示正常优先级转码，支持200MB文件（下载超时时间2分钟），500页以内的文档进行转码
<br/>
注意：对于PDF等静态文件转码，无论是正常优先级或者低优先级，最大只能支持200MB
     */
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。
分辨率越高，效果越清晰，转出来的图片资源体积会越大，课件加载耗时会变长，请根据实际使用场景配置此参数。

示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x" 
     * @return MinScaleResolution 转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。
分辨率越高，效果越清晰，转出来的图片资源体积会越大，课件加载耗时会变长，请根据实际使用场景配置此参数。

示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
     */
    public String getMinScaleResolution() {
        return this.MinScaleResolution;
    }

    /**
     * Set 转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。
分辨率越高，效果越清晰，转出来的图片资源体积会越大，课件加载耗时会变长，请根据实际使用场景配置此参数。

示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
     * @param MinScaleResolution 转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。
分辨率越高，效果越清晰，转出来的图片资源体积会越大，课件加载耗时会变长，请根据实际使用场景配置此参数。

示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
     */
    public void setMinScaleResolution(String MinScaleResolution) {
        this.MinScaleResolution = MinScaleResolution;
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

    }
}

