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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessImageRequest extends AbstractModel {

    /**
    * 媒体文件 ID，即该文件在云点播上的全局唯一标识符。本接口要求媒体文件必须是图片格式。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 操作类型。现在仅支持填 ContentReview，表示内容智能识别。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 图片内容智能识别参数，当 Operation 为 ContentReview 时该字段有效。
    */
    @SerializedName("ContentReviewInput")
    @Expose
    private ImageContentReviewInput ContentReviewInput;

    /**
     * Get 媒体文件 ID，即该文件在云点播上的全局唯一标识符。本接口要求媒体文件必须是图片格式。 
     * @return FileId 媒体文件 ID，即该文件在云点播上的全局唯一标识符。本接口要求媒体文件必须是图片格式。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 媒体文件 ID，即该文件在云点播上的全局唯一标识符。本接口要求媒体文件必须是图片格式。
     * @param FileId 媒体文件 ID，即该文件在云点播上的全局唯一标识符。本接口要求媒体文件必须是图片格式。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 操作类型。现在仅支持填 ContentReview，表示内容智能识别。 
     * @return Operation 操作类型。现在仅支持填 ContentReview，表示内容智能识别。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型。现在仅支持填 ContentReview，表示内容智能识别。
     * @param Operation 操作类型。现在仅支持填 ContentReview，表示内容智能识别。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
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
     * Get 图片内容智能识别参数，当 Operation 为 ContentReview 时该字段有效。 
     * @return ContentReviewInput 图片内容智能识别参数，当 Operation 为 ContentReview 时该字段有效。
     */
    public ImageContentReviewInput getContentReviewInput() {
        return this.ContentReviewInput;
    }

    /**
     * Set 图片内容智能识别参数，当 Operation 为 ContentReview 时该字段有效。
     * @param ContentReviewInput 图片内容智能识别参数，当 Operation 为 ContentReview 时该字段有效。
     */
    public void setContentReviewInput(ImageContentReviewInput ContentReviewInput) {
        this.ContentReviewInput = ContentReviewInput;
    }

    public ProcessImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageRequest(ProcessImageRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ContentReviewInput != null) {
            this.ContentReviewInput = new ImageContentReviewInput(source.ContentReviewInput);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "ContentReviewInput.", this.ContentReviewInput);

    }
}

