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

public class ModifyJustInTimeTranscodeTemplateRequest extends AbstractModel {

    /**
    * 模板名字。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 视频参数配置。
    */
    @SerializedName("VideoConfigure")
    @Expose
    private VideoConfigureInfoForUpdate VideoConfigure;

    /**
    * 水印参数配置。
    */
    @SerializedName("WatermarkConfigure")
    @Expose
    private WatermarkConfigureInfoForUpdate WatermarkConfigure;

    /**
    * 模板描述，长度限制256个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 模板名字。 
     * @return Name 模板名字。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名字。
     * @param Name 模板名字。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 视频参数配置。 
     * @return VideoConfigure 视频参数配置。
     */
    public VideoConfigureInfoForUpdate getVideoConfigure() {
        return this.VideoConfigure;
    }

    /**
     * Set 视频参数配置。
     * @param VideoConfigure 视频参数配置。
     */
    public void setVideoConfigure(VideoConfigureInfoForUpdate VideoConfigure) {
        this.VideoConfigure = VideoConfigure;
    }

    /**
     * Get 水印参数配置。 
     * @return WatermarkConfigure 水印参数配置。
     */
    public WatermarkConfigureInfoForUpdate getWatermarkConfigure() {
        return this.WatermarkConfigure;
    }

    /**
     * Set 水印参数配置。
     * @param WatermarkConfigure 水印参数配置。
     */
    public void setWatermarkConfigure(WatermarkConfigureInfoForUpdate WatermarkConfigure) {
        this.WatermarkConfigure = WatermarkConfigure;
    }

    /**
     * Get 模板描述，长度限制256个字符。 
     * @return Comment 模板描述，长度限制256个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述，长度限制256个字符。
     * @param Comment 模板描述，长度限制256个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public ModifyJustInTimeTranscodeTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyJustInTimeTranscodeTemplateRequest(ModifyJustInTimeTranscodeTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.VideoConfigure != null) {
            this.VideoConfigure = new VideoConfigureInfoForUpdate(source.VideoConfigure);
        }
        if (source.WatermarkConfigure != null) {
            this.WatermarkConfigure = new WatermarkConfigureInfoForUpdate(source.WatermarkConfigure);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "VideoConfigure.", this.VideoConfigure);
        this.setParamObj(map, prefix + "WatermarkConfigure.", this.WatermarkConfigure);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

