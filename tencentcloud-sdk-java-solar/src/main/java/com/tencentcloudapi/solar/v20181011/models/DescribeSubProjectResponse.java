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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubProjectResponse extends AbstractModel{

    /**
    * 作品信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductInfo")
    @Expose
    private ProductInfo ProductInfo;

    /**
    * 活动信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityInfo")
    @Expose
    private ActivityInfo ActivityInfo;

    /**
    * 分享标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShareTitle")
    @Expose
    private String ShareTitle;

    /**
    * 分享描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShareDesc")
    @Expose
    private String ShareDesc;

    /**
    * 分享图标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShareImg")
    @Expose
    private String ShareImg;

    /**
    * 是否已创建策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasStrategy")
    @Expose
    private Long HasStrategy;

    /**
    * 子项目状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubProjectStatus")
    @Expose
    private String SubProjectStatus;

    /**
    * 分享公众号的appId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShareAppId")
    @Expose
    private String ShareAppId;

    /**
    * 分享公众号的wsId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShareWsId")
    @Expose
    private String ShareWsId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 作品信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductInfo 作品信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProductInfo getProductInfo() {
        return this.ProductInfo;
    }

    /**
     * Set 作品信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductInfo 作品信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductInfo(ProductInfo ProductInfo) {
        this.ProductInfo = ProductInfo;
    }

    /**
     * Get 活动信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityInfo 活动信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ActivityInfo getActivityInfo() {
        return this.ActivityInfo;
    }

    /**
     * Set 活动信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityInfo 活动信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityInfo(ActivityInfo ActivityInfo) {
        this.ActivityInfo = ActivityInfo;
    }

    /**
     * Get 分享标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShareTitle 分享标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShareTitle() {
        return this.ShareTitle;
    }

    /**
     * Set 分享标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShareTitle 分享标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareTitle(String ShareTitle) {
        this.ShareTitle = ShareTitle;
    }

    /**
     * Get 分享描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShareDesc 分享描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShareDesc() {
        return this.ShareDesc;
    }

    /**
     * Set 分享描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShareDesc 分享描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareDesc(String ShareDesc) {
        this.ShareDesc = ShareDesc;
    }

    /**
     * Get 分享图标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShareImg 分享图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShareImg() {
        return this.ShareImg;
    }

    /**
     * Set 分享图标
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShareImg 分享图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareImg(String ShareImg) {
        this.ShareImg = ShareImg;
    }

    /**
     * Get 是否已创建策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasStrategy 是否已创建策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHasStrategy() {
        return this.HasStrategy;
    }

    /**
     * Set 是否已创建策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasStrategy 是否已创建策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasStrategy(Long HasStrategy) {
        this.HasStrategy = HasStrategy;
    }

    /**
     * Get 子项目状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubProjectStatus 子项目状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubProjectStatus() {
        return this.SubProjectStatus;
    }

    /**
     * Set 子项目状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubProjectStatus 子项目状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubProjectStatus(String SubProjectStatus) {
        this.SubProjectStatus = SubProjectStatus;
    }

    /**
     * Get 分享公众号的appId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShareAppId 分享公众号的appId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShareAppId() {
        return this.ShareAppId;
    }

    /**
     * Set 分享公众号的appId
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShareAppId 分享公众号的appId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareAppId(String ShareAppId) {
        this.ShareAppId = ShareAppId;
    }

    /**
     * Get 分享公众号的wsId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShareWsId 分享公众号的wsId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShareWsId() {
        return this.ShareWsId;
    }

    /**
     * Set 分享公众号的wsId
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShareWsId 分享公众号的wsId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareWsId(String ShareWsId) {
        this.ShareWsId = ShareWsId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ProductInfo.", this.ProductInfo);
        this.setParamObj(map, prefix + "ActivityInfo.", this.ActivityInfo);
        this.setParamSimple(map, prefix + "ShareTitle", this.ShareTitle);
        this.setParamSimple(map, prefix + "ShareDesc", this.ShareDesc);
        this.setParamSimple(map, prefix + "ShareImg", this.ShareImg);
        this.setParamSimple(map, prefix + "HasStrategy", this.HasStrategy);
        this.setParamSimple(map, prefix + "SubProjectStatus", this.SubProjectStatus);
        this.setParamSimple(map, prefix + "ShareAppId", this.ShareAppId);
        this.setParamSimple(map, prefix + "ShareWsId", this.ShareWsId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

