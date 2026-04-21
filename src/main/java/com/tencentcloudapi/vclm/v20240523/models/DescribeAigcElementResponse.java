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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAigcElementResponse extends AbstractModel {

    /**
    * <p>主体名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>主体id</p>
    */
    @SerializedName("ElementId")
    @Expose
    private String ElementId;

    /**
    * <p>主体描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>主体参考方式</p><p>枚举值：</p><ul><li>video_refer： 视频角色主体</li><li>image_refer： 多图主体</li></ul>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>pending： 执行中</li><li>failed： 任务失败</li><li>succeed： 任务成功</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>厂商列表</p>
    */
    @SerializedName("Provider")
    @Expose
    private String [] Provider;

    /**
    * <p>主体参考图，可通过多张图片设定主体及其细节</p>
    */
    @SerializedName("ElementImageList")
    @Expose
    private ElementImageList ElementImageList;

    /**
    * <p>主体参考视频，可通过视频设定主体及其细节</p>
    */
    @SerializedName("VideoList")
    @Expose
    private String [] VideoList;

    /**
    * <p>为主体配置标签，一个主体可以配置多个标签</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagList [] TagList;

    /**
    * <p>厂商聚合字段</p>
    */
    @SerializedName("ProviderDetails")
    @Expose
    private ProviderDetail [] ProviderDetails;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>音色Id</p>
    */
    @SerializedName("ElementVoiceId")
    @Expose
    private String ElementVoiceId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>主体名称</p> 
     * @return Name <p>主体名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>主体名称</p>
     * @param Name <p>主体名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>主体id</p> 
     * @return ElementId <p>主体id</p>
     */
    public String getElementId() {
        return this.ElementId;
    }

    /**
     * Set <p>主体id</p>
     * @param ElementId <p>主体id</p>
     */
    public void setElementId(String ElementId) {
        this.ElementId = ElementId;
    }

    /**
     * Get <p>主体描述</p> 
     * @return Description <p>主体描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>主体描述</p>
     * @param Description <p>主体描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>主体参考方式</p><p>枚举值：</p><ul><li>video_refer： 视频角色主体</li><li>image_refer： 多图主体</li></ul> 
     * @return ReferenceType <p>主体参考方式</p><p>枚举值：</p><ul><li>video_refer： 视频角色主体</li><li>image_refer： 多图主体</li></ul>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p>主体参考方式</p><p>枚举值：</p><ul><li>video_refer： 视频角色主体</li><li>image_refer： 多图主体</li></ul>
     * @param ReferenceType <p>主体参考方式</p><p>枚举值：</p><ul><li>video_refer： 视频角色主体</li><li>image_refer： 多图主体</li></ul>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>pending： 执行中</li><li>failed： 任务失败</li><li>succeed： 任务成功</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>pending： 执行中</li><li>failed： 任务失败</li><li>succeed： 任务成功</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>pending： 执行中</li><li>failed： 任务失败</li><li>succeed： 任务成功</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>pending： 执行中</li><li>failed： 任务失败</li><li>succeed： 任务成功</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>厂商列表</p> 
     * @return Provider <p>厂商列表</p>
     */
    public String [] getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>厂商列表</p>
     * @param Provider <p>厂商列表</p>
     */
    public void setProvider(String [] Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>主体参考图，可通过多张图片设定主体及其细节</p> 
     * @return ElementImageList <p>主体参考图，可通过多张图片设定主体及其细节</p>
     */
    public ElementImageList getElementImageList() {
        return this.ElementImageList;
    }

    /**
     * Set <p>主体参考图，可通过多张图片设定主体及其细节</p>
     * @param ElementImageList <p>主体参考图，可通过多张图片设定主体及其细节</p>
     */
    public void setElementImageList(ElementImageList ElementImageList) {
        this.ElementImageList = ElementImageList;
    }

    /**
     * Get <p>主体参考视频，可通过视频设定主体及其细节</p> 
     * @return VideoList <p>主体参考视频，可通过视频设定主体及其细节</p>
     */
    public String [] getVideoList() {
        return this.VideoList;
    }

    /**
     * Set <p>主体参考视频，可通过视频设定主体及其细节</p>
     * @param VideoList <p>主体参考视频，可通过视频设定主体及其细节</p>
     */
    public void setVideoList(String [] VideoList) {
        this.VideoList = VideoList;
    }

    /**
     * Get <p>为主体配置标签，一个主体可以配置多个标签</p> 
     * @return TagList <p>为主体配置标签，一个主体可以配置多个标签</p>
     */
    public TagList [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>为主体配置标签，一个主体可以配置多个标签</p>
     * @param TagList <p>为主体配置标签，一个主体可以配置多个标签</p>
     */
    public void setTagList(TagList [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>厂商聚合字段</p> 
     * @return ProviderDetails <p>厂商聚合字段</p>
     */
    public ProviderDetail [] getProviderDetails() {
        return this.ProviderDetails;
    }

    /**
     * Set <p>厂商聚合字段</p>
     * @param ProviderDetails <p>厂商聚合字段</p>
     */
    public void setProviderDetails(ProviderDetail [] ProviderDetails) {
        this.ProviderDetails = ProviderDetails;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedAt <p>创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedAt <p>创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdatedAt <p>更新时间</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdatedAt <p>更新时间</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>音色Id</p> 
     * @return ElementVoiceId <p>音色Id</p>
     */
    public String getElementVoiceId() {
        return this.ElementVoiceId;
    }

    /**
     * Set <p>音色Id</p>
     * @param ElementVoiceId <p>音色Id</p>
     */
    public void setElementVoiceId(String ElementVoiceId) {
        this.ElementVoiceId = ElementVoiceId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAigcElementResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcElementResponse(DescribeAigcElementResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ElementId != null) {
            this.ElementId = new String(source.ElementId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Provider != null) {
            this.Provider = new String[source.Provider.length];
            for (int i = 0; i < source.Provider.length; i++) {
                this.Provider[i] = new String(source.Provider[i]);
            }
        }
        if (source.ElementImageList != null) {
            this.ElementImageList = new ElementImageList(source.ElementImageList);
        }
        if (source.VideoList != null) {
            this.VideoList = new String[source.VideoList.length];
            for (int i = 0; i < source.VideoList.length; i++) {
                this.VideoList[i] = new String(source.VideoList[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new TagList[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagList(source.TagList[i]);
            }
        }
        if (source.ProviderDetails != null) {
            this.ProviderDetails = new ProviderDetail[source.ProviderDetails.length];
            for (int i = 0; i < source.ProviderDetails.length; i++) {
                this.ProviderDetails[i] = new ProviderDetail(source.ProviderDetails[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.ElementVoiceId != null) {
            this.ElementVoiceId = new String(source.ElementVoiceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ElementId", this.ElementId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Provider.", this.Provider);
        this.setParamObj(map, prefix + "ElementImageList.", this.ElementImageList);
        this.setParamArraySimple(map, prefix + "VideoList.", this.VideoList);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArrayObj(map, prefix + "ProviderDetails.", this.ProviderDetails);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "ElementVoiceId", this.ElementVoiceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

