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

public class DescribeAigcUsageDataRequest extends AbstractModel {

    /**
    * <p>起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#52">ISO 日期格式</a>。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束日期，需大于等于起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#52">ISO 日期格式</a>。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>AIGC类型。</p><p>枚举值：</p><ul><li>Video： 视频</li><li>Image： 图片</li><li>Text： 文本</li><li>Audio： 音频</li><li>SceneAigcVideo： 场景化视频处理</li><li>SceneAigcImage： 场景化图片处理</li><li>SceneAigcTime： 场景化处理次数</li><li>TextDetail： 文本详细记录</li></ul>
    */
    @SerializedName("AigcType")
    @Expose
    private String AigcType;

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>API Key</p>
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * <p>API Key</p>
    */
    @SerializedName("APIKeys")
    @Expose
    private String [] APIKeys;

    /**
    * <p>查询游标</p>
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * <p>每页大小，最大 200，超出会被截断为 200</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>生文RequestId，当AigcType为TextDetail时有效。</p>
    */
    @SerializedName("ReqId")
    @Expose
    private String ReqId;

    /**
     * Get <p>起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#52">ISO 日期格式</a>。</p> 
     * @return StartTime <p>起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#52">ISO 日期格式</a>。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#52">ISO 日期格式</a>。</p>
     * @param StartTime <p>起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#52">ISO 日期格式</a>。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束日期，需大于等于起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#52">ISO 日期格式</a>。</p> 
     * @return EndTime <p>结束日期，需大于等于起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#52">ISO 日期格式</a>。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束日期，需大于等于起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#52">ISO 日期格式</a>。</p>
     * @param EndTime <p>结束日期，需大于等于起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#52">ISO 日期格式</a>。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>AIGC类型。</p><p>枚举值：</p><ul><li>Video： 视频</li><li>Image： 图片</li><li>Text： 文本</li><li>Audio： 音频</li><li>SceneAigcVideo： 场景化视频处理</li><li>SceneAigcImage： 场景化图片处理</li><li>SceneAigcTime： 场景化处理次数</li><li>TextDetail： 文本详细记录</li></ul> 
     * @return AigcType <p>AIGC类型。</p><p>枚举值：</p><ul><li>Video： 视频</li><li>Image： 图片</li><li>Text： 文本</li><li>Audio： 音频</li><li>SceneAigcVideo： 场景化视频处理</li><li>SceneAigcImage： 场景化图片处理</li><li>SceneAigcTime： 场景化处理次数</li><li>TextDetail： 文本详细记录</li></ul>
     */
    public String getAigcType() {
        return this.AigcType;
    }

    /**
     * Set <p>AIGC类型。</p><p>枚举值：</p><ul><li>Video： 视频</li><li>Image： 图片</li><li>Text： 文本</li><li>Audio： 音频</li><li>SceneAigcVideo： 场景化视频处理</li><li>SceneAigcImage： 场景化图片处理</li><li>SceneAigcTime： 场景化处理次数</li><li>TextDetail： 文本详细记录</li></ul>
     * @param AigcType <p>AIGC类型。</p><p>枚举值：</p><ul><li>Video： 视频</li><li>Image： 图片</li><li>Text： 文本</li><li>Audio： 音频</li><li>SceneAigcVideo： 场景化视频处理</li><li>SceneAigcImage： 场景化图片处理</li><li>SceneAigcTime： 场景化处理次数</li><li>TextDetail： 文本详细记录</li></ul>
     */
    public void setAigcType(String AigcType) {
        this.AigcType = AigcType;
    }

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
     * Get <p>API Key</p> 
     * @return APIKey <p>API Key</p>
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set <p>API Key</p>
     * @param APIKey <p>API Key</p>
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get <p>API Key</p> 
     * @return APIKeys <p>API Key</p>
     */
    public String [] getAPIKeys() {
        return this.APIKeys;
    }

    /**
     * Set <p>API Key</p>
     * @param APIKeys <p>API Key</p>
     */
    public void setAPIKeys(String [] APIKeys) {
        this.APIKeys = APIKeys;
    }

    /**
     * Get <p>查询游标</p> 
     * @return ScrollToken <p>查询游标</p>
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set <p>查询游标</p>
     * @param ScrollToken <p>查询游标</p>
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get <p>每页大小，最大 200，超出会被截断为 200</p> 
     * @return PageSize <p>每页大小，最大 200，超出会被截断为 200</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小，最大 200，超出会被截断为 200</p>
     * @param PageSize <p>每页大小，最大 200，超出会被截断为 200</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>生文RequestId，当AigcType为TextDetail时有效。</p> 
     * @return ReqId <p>生文RequestId，当AigcType为TextDetail时有效。</p>
     */
    public String getReqId() {
        return this.ReqId;
    }

    /**
     * Set <p>生文RequestId，当AigcType为TextDetail时有效。</p>
     * @param ReqId <p>生文RequestId，当AigcType为TextDetail时有效。</p>
     */
    public void setReqId(String ReqId) {
        this.ReqId = ReqId;
    }

    public DescribeAigcUsageDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcUsageDataRequest(DescribeAigcUsageDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AigcType != null) {
            this.AigcType = new String(source.AigcType);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.APIKeys != null) {
            this.APIKeys = new String[source.APIKeys.length];
            for (int i = 0; i < source.APIKeys.length; i++) {
                this.APIKeys[i] = new String(source.APIKeys[i]);
            }
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ReqId != null) {
            this.ReqId = new String(source.ReqId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AigcType", this.AigcType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamArraySimple(map, prefix + "APIKeys.", this.APIKeys);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ReqId", this.ReqId);

    }
}

