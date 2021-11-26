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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchMaterialRequest extends AbstractModel{

    /**
    * 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 指定搜索空间，数组长度不得超过5。
    */
    @SerializedName("SearchScopes")
    @Expose
    private SearchScope [] SearchScopes;

    /**
    * 媒体类型，可取值有：
<li>AUDIO：音频；</li>
<li>VIDEO：视频 ；</li>
<li>IMAGE：图片；</li>
<li>VIDEO_EDIT_TEMPLATE：剪辑模板。</li>
    */
    @SerializedName("MaterialTypes")
    @Expose
    private String [] MaterialTypes;

    /**
    * 搜索文本，模糊匹配媒体名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：15个字符。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 按画质检索，取值为：LD/SD/HD/FHD/2K/4K。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 按媒体时长检索，单位s。
    */
    @SerializedName("DurationRange")
    @Expose
    private IntegerRange DurationRange;

    /**
    * 按照媒体创建时间检索。
    */
    @SerializedName("CreateTimeRange")
    @Expose
    private TimeRange CreateTimeRange;

    /**
    * 按标签检索，填入检索的标签名。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 排序方式。Sort.Field 可选值：CreateTime。指定 Text 搜索时，将根据匹配度排序，该字段无效。
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * 偏移量。默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以搜索任意媒体的信息。如果指定操作者，则操作者必须对媒体有读权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。 
     * @return Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     * @param Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 指定搜索空间，数组长度不得超过5。 
     * @return SearchScopes 指定搜索空间，数组长度不得超过5。
     */
    public SearchScope [] getSearchScopes() {
        return this.SearchScopes;
    }

    /**
     * Set 指定搜索空间，数组长度不得超过5。
     * @param SearchScopes 指定搜索空间，数组长度不得超过5。
     */
    public void setSearchScopes(SearchScope [] SearchScopes) {
        this.SearchScopes = SearchScopes;
    }

    /**
     * Get 媒体类型，可取值有：
<li>AUDIO：音频；</li>
<li>VIDEO：视频 ；</li>
<li>IMAGE：图片；</li>
<li>VIDEO_EDIT_TEMPLATE：剪辑模板。</li> 
     * @return MaterialTypes 媒体类型，可取值有：
<li>AUDIO：音频；</li>
<li>VIDEO：视频 ；</li>
<li>IMAGE：图片；</li>
<li>VIDEO_EDIT_TEMPLATE：剪辑模板。</li>
     */
    public String [] getMaterialTypes() {
        return this.MaterialTypes;
    }

    /**
     * Set 媒体类型，可取值有：
<li>AUDIO：音频；</li>
<li>VIDEO：视频 ；</li>
<li>IMAGE：图片；</li>
<li>VIDEO_EDIT_TEMPLATE：剪辑模板。</li>
     * @param MaterialTypes 媒体类型，可取值有：
<li>AUDIO：音频；</li>
<li>VIDEO：视频 ；</li>
<li>IMAGE：图片；</li>
<li>VIDEO_EDIT_TEMPLATE：剪辑模板。</li>
     */
    public void setMaterialTypes(String [] MaterialTypes) {
        this.MaterialTypes = MaterialTypes;
    }

    /**
     * Get 搜索文本，模糊匹配媒体名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：15个字符。 
     * @return Text 搜索文本，模糊匹配媒体名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：15个字符。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 搜索文本，模糊匹配媒体名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：15个字符。
     * @param Text 搜索文本，模糊匹配媒体名称或描述信息，匹配项越多，匹配度越高，排序越优先。长度限制：15个字符。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 按画质检索，取值为：LD/SD/HD/FHD/2K/4K。 
     * @return Resolution 按画质检索，取值为：LD/SD/HD/FHD/2K/4K。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 按画质检索，取值为：LD/SD/HD/FHD/2K/4K。
     * @param Resolution 按画质检索，取值为：LD/SD/HD/FHD/2K/4K。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 按媒体时长检索，单位s。 
     * @return DurationRange 按媒体时长检索，单位s。
     */
    public IntegerRange getDurationRange() {
        return this.DurationRange;
    }

    /**
     * Set 按媒体时长检索，单位s。
     * @param DurationRange 按媒体时长检索，单位s。
     */
    public void setDurationRange(IntegerRange DurationRange) {
        this.DurationRange = DurationRange;
    }

    /**
     * Get 按照媒体创建时间检索。 
     * @return CreateTimeRange 按照媒体创建时间检索。
     */
    public TimeRange getCreateTimeRange() {
        return this.CreateTimeRange;
    }

    /**
     * Set 按照媒体创建时间检索。
     * @param CreateTimeRange 按照媒体创建时间检索。
     */
    public void setCreateTimeRange(TimeRange CreateTimeRange) {
        this.CreateTimeRange = CreateTimeRange;
    }

    /**
     * Get 按标签检索，填入检索的标签名。 
     * @return Tags 按标签检索，填入检索的标签名。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 按标签检索，填入检索的标签名。
     * @param Tags 按标签检索，填入检索的标签名。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 排序方式。Sort.Field 可选值：CreateTime。指定 Text 搜索时，将根据匹配度排序，该字段无效。 
     * @return Sort 排序方式。Sort.Field 可选值：CreateTime。指定 Text 搜索时，将根据匹配度排序，该字段无效。
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方式。Sort.Field 可选值：CreateTime。指定 Text 搜索时，将根据匹配度排序，该字段无效。
     * @param Sort 排序方式。Sort.Field 可选值：CreateTime。指定 Text 搜索时，将根据匹配度排序，该字段无效。
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 偏移量。默认值：0。 
     * @return Offset 偏移量。默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。默认值：0。
     * @param Offset 偏移量。默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数，默认值：50。 
     * @return Limit 返回记录条数，默认值：50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：50。
     * @param Limit 返回记录条数，默认值：50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以搜索任意媒体的信息。如果指定操作者，则操作者必须对媒体有读权限。 
     * @return Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以搜索任意媒体的信息。如果指定操作者，则操作者必须对媒体有读权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以搜索任意媒体的信息。如果指定操作者，则操作者必须对媒体有读权限。
     * @param Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以搜索任意媒体的信息。如果指定操作者，则操作者必须对媒体有读权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public SearchMaterialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchMaterialRequest(SearchMaterialRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.SearchScopes != null) {
            this.SearchScopes = new SearchScope[source.SearchScopes.length];
            for (int i = 0; i < source.SearchScopes.length; i++) {
                this.SearchScopes[i] = new SearchScope(source.SearchScopes[i]);
            }
        }
        if (source.MaterialTypes != null) {
            this.MaterialTypes = new String[source.MaterialTypes.length];
            for (int i = 0; i < source.MaterialTypes.length; i++) {
                this.MaterialTypes[i] = new String(source.MaterialTypes[i]);
            }
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.DurationRange != null) {
            this.DurationRange = new IntegerRange(source.DurationRange);
        }
        if (source.CreateTimeRange != null) {
            this.CreateTimeRange = new TimeRange(source.CreateTimeRange);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new SortBy(source.Sort);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamArrayObj(map, prefix + "SearchScopes.", this.SearchScopes);
        this.setParamArraySimple(map, prefix + "MaterialTypes.", this.MaterialTypes);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamObj(map, prefix + "DurationRange.", this.DurationRange);
        this.setParamObj(map, prefix + "CreateTimeRange.", this.CreateTimeRange);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

