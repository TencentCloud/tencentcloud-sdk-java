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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountQuota extends AbstractModel{

    /**
    * 后付费配额列表
    */
    @SerializedName("PostPaidQuotaSet")
    @Expose
    private PostPaidQuota [] PostPaidQuotaSet;

    /**
    * 预付费配额列表
    */
    @SerializedName("PrePaidQuotaSet")
    @Expose
    private PrePaidQuota [] PrePaidQuotaSet;

    /**
    * spot配额列表
    */
    @SerializedName("SpotPaidQuotaSet")
    @Expose
    private SpotPaidQuota [] SpotPaidQuotaSet;

    /**
    * 镜像配额列表
    */
    @SerializedName("ImageQuotaSet")
    @Expose
    private ImageQuota [] ImageQuotaSet;

    /**
    * 置放群组配额列表
    */
    @SerializedName("DisasterRecoverGroupQuotaSet")
    @Expose
    private DisasterRecoverGroupQuota [] DisasterRecoverGroupQuotaSet;

    /**
     * Get 后付费配额列表 
     * @return PostPaidQuotaSet 后付费配额列表
     */
    public PostPaidQuota [] getPostPaidQuotaSet() {
        return this.PostPaidQuotaSet;
    }

    /**
     * Set 后付费配额列表
     * @param PostPaidQuotaSet 后付费配额列表
     */
    public void setPostPaidQuotaSet(PostPaidQuota [] PostPaidQuotaSet) {
        this.PostPaidQuotaSet = PostPaidQuotaSet;
    }

    /**
     * Get 预付费配额列表 
     * @return PrePaidQuotaSet 预付费配额列表
     */
    public PrePaidQuota [] getPrePaidQuotaSet() {
        return this.PrePaidQuotaSet;
    }

    /**
     * Set 预付费配额列表
     * @param PrePaidQuotaSet 预付费配额列表
     */
    public void setPrePaidQuotaSet(PrePaidQuota [] PrePaidQuotaSet) {
        this.PrePaidQuotaSet = PrePaidQuotaSet;
    }

    /**
     * Get spot配额列表 
     * @return SpotPaidQuotaSet spot配额列表
     */
    public SpotPaidQuota [] getSpotPaidQuotaSet() {
        return this.SpotPaidQuotaSet;
    }

    /**
     * Set spot配额列表
     * @param SpotPaidQuotaSet spot配额列表
     */
    public void setSpotPaidQuotaSet(SpotPaidQuota [] SpotPaidQuotaSet) {
        this.SpotPaidQuotaSet = SpotPaidQuotaSet;
    }

    /**
     * Get 镜像配额列表 
     * @return ImageQuotaSet 镜像配额列表
     */
    public ImageQuota [] getImageQuotaSet() {
        return this.ImageQuotaSet;
    }

    /**
     * Set 镜像配额列表
     * @param ImageQuotaSet 镜像配额列表
     */
    public void setImageQuotaSet(ImageQuota [] ImageQuotaSet) {
        this.ImageQuotaSet = ImageQuotaSet;
    }

    /**
     * Get 置放群组配额列表 
     * @return DisasterRecoverGroupQuotaSet 置放群组配额列表
     */
    public DisasterRecoverGroupQuota [] getDisasterRecoverGroupQuotaSet() {
        return this.DisasterRecoverGroupQuotaSet;
    }

    /**
     * Set 置放群组配额列表
     * @param DisasterRecoverGroupQuotaSet 置放群组配额列表
     */
    public void setDisasterRecoverGroupQuotaSet(DisasterRecoverGroupQuota [] DisasterRecoverGroupQuotaSet) {
        this.DisasterRecoverGroupQuotaSet = DisasterRecoverGroupQuotaSet;
    }

    public AccountQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountQuota(AccountQuota source) {
        if (source.PostPaidQuotaSet != null) {
            this.PostPaidQuotaSet = new PostPaidQuota[source.PostPaidQuotaSet.length];
            for (int i = 0; i < source.PostPaidQuotaSet.length; i++) {
                this.PostPaidQuotaSet[i] = new PostPaidQuota(source.PostPaidQuotaSet[i]);
            }
        }
        if (source.PrePaidQuotaSet != null) {
            this.PrePaidQuotaSet = new PrePaidQuota[source.PrePaidQuotaSet.length];
            for (int i = 0; i < source.PrePaidQuotaSet.length; i++) {
                this.PrePaidQuotaSet[i] = new PrePaidQuota(source.PrePaidQuotaSet[i]);
            }
        }
        if (source.SpotPaidQuotaSet != null) {
            this.SpotPaidQuotaSet = new SpotPaidQuota[source.SpotPaidQuotaSet.length];
            for (int i = 0; i < source.SpotPaidQuotaSet.length; i++) {
                this.SpotPaidQuotaSet[i] = new SpotPaidQuota(source.SpotPaidQuotaSet[i]);
            }
        }
        if (source.ImageQuotaSet != null) {
            this.ImageQuotaSet = new ImageQuota[source.ImageQuotaSet.length];
            for (int i = 0; i < source.ImageQuotaSet.length; i++) {
                this.ImageQuotaSet[i] = new ImageQuota(source.ImageQuotaSet[i]);
            }
        }
        if (source.DisasterRecoverGroupQuotaSet != null) {
            this.DisasterRecoverGroupQuotaSet = new DisasterRecoverGroupQuota[source.DisasterRecoverGroupQuotaSet.length];
            for (int i = 0; i < source.DisasterRecoverGroupQuotaSet.length; i++) {
                this.DisasterRecoverGroupQuotaSet[i] = new DisasterRecoverGroupQuota(source.DisasterRecoverGroupQuotaSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PostPaidQuotaSet.", this.PostPaidQuotaSet);
        this.setParamArrayObj(map, prefix + "PrePaidQuotaSet.", this.PrePaidQuotaSet);
        this.setParamArrayObj(map, prefix + "SpotPaidQuotaSet.", this.SpotPaidQuotaSet);
        this.setParamArrayObj(map, prefix + "ImageQuotaSet.", this.ImageQuotaSet);
        this.setParamArrayObj(map, prefix + "DisasterRecoverGroupQuotaSet.", this.DisasterRecoverGroupQuotaSet);

    }
}

