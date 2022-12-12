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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchImageRequest extends AbstractModel{

    /**
    * 图库名称。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 图片的 Url 。
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：对应图片 base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
建议：
• 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 图片 base64 数据。
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 返回结果的数量，默认值为10，最大值为100。
按照相似度分数由高到低排序。
**<font color=#1E90FF>服务类型为图案花纹搜索时Limit = 1，最多只能返回1个结果。</font>**
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 返回结果的起始序号，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 匹配阈值。
只有图片相似度分数超过匹配阈值的结果才会返回。
当MatchThreshold为0（默认值）时，各服务类型将按照以下默认的匹配阈值进行结果过滤：
• 通用图像搜索1.0版：50。
• 商品图像搜索2.0升级版：45。
• 商品图像搜索1.0版：28。
• 图案花纹搜索1.0版：56。
建议：
可以手动调整MatchThreshold值来控制输出结果的范围。如果发现无检索结果，可能是因为图片相似度较低导致检索结果被匹配阈值过滤，建议调整为较低的阈值后再次尝试检索。
    */
    @SerializedName("MatchThreshold")
    @Expose
    private Long MatchThreshold;

    /**
    * 标签过滤条件。
针对创建图片时提交的Tags信息进行条件过滤。支持>、>=、 <、 <=、=，!=，多个条件之间支持AND和OR进行连接。
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 图像主体区域。
若设置主体区域，提取指定的区域进行检索。
    */
    @SerializedName("ImageRect")
    @Expose
    private ImageRect ImageRect;

    /**
    * 是否需要启用主体识别，默认为**TRUE** 。
• 为**TRUE**时，启用主体识别，返回主体信息。若没有指定**ImageRect**，自动提取最大面积主体进行检索并进行主体识别。主体识别结果可在**Response中**获取。
• 为**FALSE**时，不启用主体识别，不返回主体信息。若没有指定**ImageRect**，以整张图检索图片。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
    */
    @SerializedName("EnableDetect")
    @Expose
    private Boolean EnableDetect;

    /**
    * 图像类目ID。
若设置类目ID，提取以下类目的主体进行检索。
类目取值说明：
0：上衣。
1：裙装。
2：下装。
3：包。
4：鞋。
5：配饰。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
     * Get 图库名称。 
     * @return GroupId 图库名称。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 图库名称。
     * @param GroupId 图库名称。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 图片的 Url 。
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：对应图片 base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
建议：
• 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。 
     * @return ImageUrl 图片的 Url 。
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：对应图片 base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
建议：
• 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的 Url 。
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：对应图片 base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
建议：
• 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
     * @param ImageUrl 图片的 Url 。
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：对应图片 base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
建议：
• 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 图片 base64 数据。
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。 
     * @return ImageBase64 图片 base64 数据。
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片 base64 数据。
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
     * @param ImageBase64 图片 base64 数据。
ImageUrl和ImageBase64必须提供一个，如果都提供，只使用ImageUrl。
图片限制：
• 图片格式：支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
• 图片大小：base64 编码后大小不可超过5M。图片分辨率不超过4096\*4096。
• 如果在商品图像搜索中开启主体识别，分辨率不超过2000\*2000，图片长宽比小于10。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 返回结果的数量，默认值为10，最大值为100。
按照相似度分数由高到低排序。
**<font color=#1E90FF>服务类型为图案花纹搜索时Limit = 1，最多只能返回1个结果。</font>** 
     * @return Limit 返回结果的数量，默认值为10，最大值为100。
按照相似度分数由高到低排序。
**<font color=#1E90FF>服务类型为图案花纹搜索时Limit = 1，最多只能返回1个结果。</font>**
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回结果的数量，默认值为10，最大值为100。
按照相似度分数由高到低排序。
**<font color=#1E90FF>服务类型为图案花纹搜索时Limit = 1，最多只能返回1个结果。</font>**
     * @param Limit 返回结果的数量，默认值为10，最大值为100。
按照相似度分数由高到低排序。
**<font color=#1E90FF>服务类型为图案花纹搜索时Limit = 1，最多只能返回1个结果。</font>**
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 返回结果的起始序号，默认值为0。 
     * @return Offset 返回结果的起始序号，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回结果的起始序号，默认值为0。
     * @param Offset 返回结果的起始序号，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 匹配阈值。
只有图片相似度分数超过匹配阈值的结果才会返回。
当MatchThreshold为0（默认值）时，各服务类型将按照以下默认的匹配阈值进行结果过滤：
• 通用图像搜索1.0版：50。
• 商品图像搜索2.0升级版：45。
• 商品图像搜索1.0版：28。
• 图案花纹搜索1.0版：56。
建议：
可以手动调整MatchThreshold值来控制输出结果的范围。如果发现无检索结果，可能是因为图片相似度较低导致检索结果被匹配阈值过滤，建议调整为较低的阈值后再次尝试检索。 
     * @return MatchThreshold 匹配阈值。
只有图片相似度分数超过匹配阈值的结果才会返回。
当MatchThreshold为0（默认值）时，各服务类型将按照以下默认的匹配阈值进行结果过滤：
• 通用图像搜索1.0版：50。
• 商品图像搜索2.0升级版：45。
• 商品图像搜索1.0版：28。
• 图案花纹搜索1.0版：56。
建议：
可以手动调整MatchThreshold值来控制输出结果的范围。如果发现无检索结果，可能是因为图片相似度较低导致检索结果被匹配阈值过滤，建议调整为较低的阈值后再次尝试检索。
     */
    public Long getMatchThreshold() {
        return this.MatchThreshold;
    }

    /**
     * Set 匹配阈值。
只有图片相似度分数超过匹配阈值的结果才会返回。
当MatchThreshold为0（默认值）时，各服务类型将按照以下默认的匹配阈值进行结果过滤：
• 通用图像搜索1.0版：50。
• 商品图像搜索2.0升级版：45。
• 商品图像搜索1.0版：28。
• 图案花纹搜索1.0版：56。
建议：
可以手动调整MatchThreshold值来控制输出结果的范围。如果发现无检索结果，可能是因为图片相似度较低导致检索结果被匹配阈值过滤，建议调整为较低的阈值后再次尝试检索。
     * @param MatchThreshold 匹配阈值。
只有图片相似度分数超过匹配阈值的结果才会返回。
当MatchThreshold为0（默认值）时，各服务类型将按照以下默认的匹配阈值进行结果过滤：
• 通用图像搜索1.0版：50。
• 商品图像搜索2.0升级版：45。
• 商品图像搜索1.0版：28。
• 图案花纹搜索1.0版：56。
建议：
可以手动调整MatchThreshold值来控制输出结果的范围。如果发现无检索结果，可能是因为图片相似度较低导致检索结果被匹配阈值过滤，建议调整为较低的阈值后再次尝试检索。
     */
    public void setMatchThreshold(Long MatchThreshold) {
        this.MatchThreshold = MatchThreshold;
    }

    /**
     * Get 标签过滤条件。
针对创建图片时提交的Tags信息进行条件过滤。支持>、>=、 <、 <=、=，!=，多个条件之间支持AND和OR进行连接。 
     * @return Filter 标签过滤条件。
针对创建图片时提交的Tags信息进行条件过滤。支持>、>=、 <、 <=、=，!=，多个条件之间支持AND和OR进行连接。
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 标签过滤条件。
针对创建图片时提交的Tags信息进行条件过滤。支持>、>=、 <、 <=、=，!=，多个条件之间支持AND和OR进行连接。
     * @param Filter 标签过滤条件。
针对创建图片时提交的Tags信息进行条件过滤。支持>、>=、 <、 <=、=，!=，多个条件之间支持AND和OR进行连接。
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 图像主体区域。
若设置主体区域，提取指定的区域进行检索。 
     * @return ImageRect 图像主体区域。
若设置主体区域，提取指定的区域进行检索。
     */
    public ImageRect getImageRect() {
        return this.ImageRect;
    }

    /**
     * Set 图像主体区域。
若设置主体区域，提取指定的区域进行检索。
     * @param ImageRect 图像主体区域。
若设置主体区域，提取指定的区域进行检索。
     */
    public void setImageRect(ImageRect ImageRect) {
        this.ImageRect = ImageRect;
    }

    /**
     * Get 是否需要启用主体识别，默认为**TRUE** 。
• 为**TRUE**时，启用主体识别，返回主体信息。若没有指定**ImageRect**，自动提取最大面积主体进行检索并进行主体识别。主体识别结果可在**Response中**获取。
• 为**FALSE**时，不启用主体识别，不返回主体信息。若没有指定**ImageRect**，以整张图检索图片。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>** 
     * @return EnableDetect 是否需要启用主体识别，默认为**TRUE** 。
• 为**TRUE**时，启用主体识别，返回主体信息。若没有指定**ImageRect**，自动提取最大面积主体进行检索并进行主体识别。主体识别结果可在**Response中**获取。
• 为**FALSE**时，不启用主体识别，不返回主体信息。若没有指定**ImageRect**，以整张图检索图片。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
     */
    public Boolean getEnableDetect() {
        return this.EnableDetect;
    }

    /**
     * Set 是否需要启用主体识别，默认为**TRUE** 。
• 为**TRUE**时，启用主体识别，返回主体信息。若没有指定**ImageRect**，自动提取最大面积主体进行检索并进行主体识别。主体识别结果可在**Response中**获取。
• 为**FALSE**时，不启用主体识别，不返回主体信息。若没有指定**ImageRect**，以整张图检索图片。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
     * @param EnableDetect 是否需要启用主体识别，默认为**TRUE** 。
• 为**TRUE**时，启用主体识别，返回主体信息。若没有指定**ImageRect**，自动提取最大面积主体进行检索并进行主体识别。主体识别结果可在**Response中**获取。
• 为**FALSE**时，不启用主体识别，不返回主体信息。若没有指定**ImageRect**，以整张图检索图片。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
     */
    public void setEnableDetect(Boolean EnableDetect) {
        this.EnableDetect = EnableDetect;
    }

    /**
     * Get 图像类目ID。
若设置类目ID，提取以下类目的主体进行检索。
类目取值说明：
0：上衣。
1：裙装。
2：下装。
3：包。
4：鞋。
5：配饰。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>** 
     * @return CategoryId 图像类目ID。
若设置类目ID，提取以下类目的主体进行检索。
类目取值说明：
0：上衣。
1：裙装。
2：下装。
3：包。
4：鞋。
5：配饰。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 图像类目ID。
若设置类目ID，提取以下类目的主体进行检索。
类目取值说明：
0：上衣。
1：裙装。
2：下装。
3：包。
4：鞋。
5：配饰。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
     * @param CategoryId 图像类目ID。
若设置类目ID，提取以下类目的主体进行检索。
类目取值说明：
0：上衣。
1：裙装。
2：下装。
3：包。
4：鞋。
5：配饰。
**<font color=#1E90FF>注意：仅服务类型为商品图像搜索时才生效。</font>**
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    public SearchImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchImageRequest(SearchImageRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.MatchThreshold != null) {
            this.MatchThreshold = new Long(source.MatchThreshold);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.ImageRect != null) {
            this.ImageRect = new ImageRect(source.ImageRect);
        }
        if (source.EnableDetect != null) {
            this.EnableDetect = new Boolean(source.EnableDetect);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "MatchThreshold", this.MatchThreshold);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamObj(map, prefix + "ImageRect.", this.ImageRect);
        this.setParamSimple(map, prefix + "EnableDetect", this.EnableDetect);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);

    }
}

