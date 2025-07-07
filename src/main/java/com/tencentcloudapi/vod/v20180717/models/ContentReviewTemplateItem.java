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

public class ContentReviewTemplateItem extends AbstractModel {

    /**
    * 音视频审核模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 音视频审核模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 音视频审核模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 鉴别涉及令人反感的信息的控制参数。
    */
    @SerializedName("PornConfigure")
    @Expose
    private PornConfigureInfo PornConfigure;

    /**
    * 鉴别涉及令人不安全的信息的控制参数。
    */
    @SerializedName("TerrorismConfigure")
    @Expose
    private TerrorismConfigureInfo TerrorismConfigure;

    /**
    * 鉴别涉及令人不适宜的信息的控制参数。
    */
    @SerializedName("PoliticalConfigure")
    @Expose
    private PoliticalConfigureInfo PoliticalConfigure;

    /**
    * 违禁控制参数。违禁内容包括：
<li>谩骂；</li>
<li>涉毒违法。</li>
    */
    @SerializedName("ProhibitedConfigure")
    @Expose
    private ProhibitedConfigureInfo ProhibitedConfigure;

    /**
    * 用户自定义音视频审核控制参数。
    */
    @SerializedName("UserDefineConfigure")
    @Expose
    private UserDefineConfigureInfo UserDefineConfigure;

    /**
    * 音视频审核结果是否进入音视频审核墙（对音视频审核结果进行人工复核）的开关。
<li>ON：是；</li>
<li>OFF：否。</li>
    */
    @SerializedName("ReviewWallSwitch")
    @Expose
    private String ReviewWallSwitch;

    /**
    * 截帧间隔，单位为秒。当不填时，默认截帧间隔为 1 秒，最小值为 0.5 秒。
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 音视频审核模板唯一标识。 
     * @return Definition 音视频审核模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 音视频审核模板唯一标识。
     * @param Definition 音视频审核模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 音视频审核模板名称，长度限制：64 个字符。 
     * @return Name 音视频审核模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 音视频审核模板名称，长度限制：64 个字符。
     * @param Name 音视频审核模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 音视频审核模板描述信息，长度限制：256 个字符。 
     * @return Comment 音视频审核模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 音视频审核模板描述信息，长度限制：256 个字符。
     * @param Comment 音视频审核模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 鉴别涉及令人反感的信息的控制参数。 
     * @return PornConfigure 鉴别涉及令人反感的信息的控制参数。
     */
    public PornConfigureInfo getPornConfigure() {
        return this.PornConfigure;
    }

    /**
     * Set 鉴别涉及令人反感的信息的控制参数。
     * @param PornConfigure 鉴别涉及令人反感的信息的控制参数。
     */
    public void setPornConfigure(PornConfigureInfo PornConfigure) {
        this.PornConfigure = PornConfigure;
    }

    /**
     * Get 鉴别涉及令人不安全的信息的控制参数。 
     * @return TerrorismConfigure 鉴别涉及令人不安全的信息的控制参数。
     */
    public TerrorismConfigureInfo getTerrorismConfigure() {
        return this.TerrorismConfigure;
    }

    /**
     * Set 鉴别涉及令人不安全的信息的控制参数。
     * @param TerrorismConfigure 鉴别涉及令人不安全的信息的控制参数。
     */
    public void setTerrorismConfigure(TerrorismConfigureInfo TerrorismConfigure) {
        this.TerrorismConfigure = TerrorismConfigure;
    }

    /**
     * Get 鉴别涉及令人不适宜的信息的控制参数。 
     * @return PoliticalConfigure 鉴别涉及令人不适宜的信息的控制参数。
     */
    public PoliticalConfigureInfo getPoliticalConfigure() {
        return this.PoliticalConfigure;
    }

    /**
     * Set 鉴别涉及令人不适宜的信息的控制参数。
     * @param PoliticalConfigure 鉴别涉及令人不适宜的信息的控制参数。
     */
    public void setPoliticalConfigure(PoliticalConfigureInfo PoliticalConfigure) {
        this.PoliticalConfigure = PoliticalConfigure;
    }

    /**
     * Get 违禁控制参数。违禁内容包括：
<li>谩骂；</li>
<li>涉毒违法。</li> 
     * @return ProhibitedConfigure 违禁控制参数。违禁内容包括：
<li>谩骂；</li>
<li>涉毒违法。</li>
     */
    public ProhibitedConfigureInfo getProhibitedConfigure() {
        return this.ProhibitedConfigure;
    }

    /**
     * Set 违禁控制参数。违禁内容包括：
<li>谩骂；</li>
<li>涉毒违法。</li>
     * @param ProhibitedConfigure 违禁控制参数。违禁内容包括：
<li>谩骂；</li>
<li>涉毒违法。</li>
     */
    public void setProhibitedConfigure(ProhibitedConfigureInfo ProhibitedConfigure) {
        this.ProhibitedConfigure = ProhibitedConfigure;
    }

    /**
     * Get 用户自定义音视频审核控制参数。 
     * @return UserDefineConfigure 用户自定义音视频审核控制参数。
     */
    public UserDefineConfigureInfo getUserDefineConfigure() {
        return this.UserDefineConfigure;
    }

    /**
     * Set 用户自定义音视频审核控制参数。
     * @param UserDefineConfigure 用户自定义音视频审核控制参数。
     */
    public void setUserDefineConfigure(UserDefineConfigureInfo UserDefineConfigure) {
        this.UserDefineConfigure = UserDefineConfigure;
    }

    /**
     * Get 音视频审核结果是否进入音视频审核墙（对音视频审核结果进行人工复核）的开关。
<li>ON：是；</li>
<li>OFF：否。</li> 
     * @return ReviewWallSwitch 音视频审核结果是否进入音视频审核墙（对音视频审核结果进行人工复核）的开关。
<li>ON：是；</li>
<li>OFF：否。</li>
     */
    public String getReviewWallSwitch() {
        return this.ReviewWallSwitch;
    }

    /**
     * Set 音视频审核结果是否进入音视频审核墙（对音视频审核结果进行人工复核）的开关。
<li>ON：是；</li>
<li>OFF：否。</li>
     * @param ReviewWallSwitch 音视频审核结果是否进入音视频审核墙（对音视频审核结果进行人工复核）的开关。
<li>ON：是；</li>
<li>OFF：否。</li>
     */
    public void setReviewWallSwitch(String ReviewWallSwitch) {
        this.ReviewWallSwitch = ReviewWallSwitch;
    }

    /**
     * Get 截帧间隔，单位为秒。当不填时，默认截帧间隔为 1 秒，最小值为 0.5 秒。 
     * @return ScreenshotInterval 截帧间隔，单位为秒。当不填时，默认截帧间隔为 1 秒，最小值为 0.5 秒。
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set 截帧间隔，单位为秒。当不填时，默认截帧间隔为 1 秒，最小值为 0.5 秒。
     * @param ScreenshotInterval 截帧间隔，单位为秒。当不填时，默认截帧间隔为 1 秒，最小值为 0.5 秒。
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ContentReviewTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentReviewTemplateItem(ContentReviewTemplateItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.PornConfigure != null) {
            this.PornConfigure = new PornConfigureInfo(source.PornConfigure);
        }
        if (source.TerrorismConfigure != null) {
            this.TerrorismConfigure = new TerrorismConfigureInfo(source.TerrorismConfigure);
        }
        if (source.PoliticalConfigure != null) {
            this.PoliticalConfigure = new PoliticalConfigureInfo(source.PoliticalConfigure);
        }
        if (source.ProhibitedConfigure != null) {
            this.ProhibitedConfigure = new ProhibitedConfigureInfo(source.ProhibitedConfigure);
        }
        if (source.UserDefineConfigure != null) {
            this.UserDefineConfigure = new UserDefineConfigureInfo(source.UserDefineConfigure);
        }
        if (source.ReviewWallSwitch != null) {
            this.ReviewWallSwitch = new String(source.ReviewWallSwitch);
        }
        if (source.ScreenshotInterval != null) {
            this.ScreenshotInterval = new Float(source.ScreenshotInterval);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "PornConfigure.", this.PornConfigure);
        this.setParamObj(map, prefix + "TerrorismConfigure.", this.TerrorismConfigure);
        this.setParamObj(map, prefix + "PoliticalConfigure.", this.PoliticalConfigure);
        this.setParamObj(map, prefix + "ProhibitedConfigure.", this.ProhibitedConfigure);
        this.setParamObj(map, prefix + "UserDefineConfigure.", this.UserDefineConfigure);
        this.setParamSimple(map, prefix + "ReviewWallSwitch", this.ReviewWallSwitch);
        this.setParamSimple(map, prefix + "ScreenshotInterval", this.ScreenshotInterval);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

