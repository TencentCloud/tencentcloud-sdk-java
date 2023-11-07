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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Goods extends AbstractModel {

    /**
    * 付费类型，1:预付费，0:后付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 商品数量
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 商品明细
    */
    @SerializedName("GoodsDetail")
    @Expose
    private GoodsDetail GoodsDetail;

    /**
    * 默认为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 计费类目ID，对应cid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsCategoryId")
    @Expose
    private Long GoodsCategoryId;

    /**
    * 平台类型，默认1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * 购买waf实例区域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get 付费类型，1:预付费，0:后付费 
     * @return PayMode 付费类型，1:预付费，0:后付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费类型，1:预付费，0:后付费
     * @param PayMode 付费类型，1:预付费，0:后付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 商品数量 
     * @return GoodsNum 商品数量
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 商品数量
     * @param GoodsNum 商品数量
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 商品明细 
     * @return GoodsDetail 商品明细
     */
    public GoodsDetail getGoodsDetail() {
        return this.GoodsDetail;
    }

    /**
     * Set 商品明细
     * @param GoodsDetail 商品明细
     */
    public void setGoodsDetail(GoodsDetail GoodsDetail) {
        this.GoodsDetail = GoodsDetail;
    }

    /**
     * Get 默认为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 默认为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 计费类目ID，对应cid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GoodsCategoryId 计费类目ID，对应cid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGoodsCategoryId() {
        return this.GoodsCategoryId;
    }

    /**
     * Set 计费类目ID，对应cid
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsCategoryId 计费类目ID，对应cid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsCategoryId(Long GoodsCategoryId) {
        this.GoodsCategoryId = GoodsCategoryId;
    }

    /**
     * Get 平台类型，默认1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Platform 平台类型，默认1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台类型，默认1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Platform 平台类型，默认1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 购买waf实例区域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 购买waf实例区域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 购买waf实例区域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 购买waf实例区域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public Goods() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Goods(Goods source) {
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.GoodsDetail != null) {
            this.GoodsDetail = new GoodsDetail(source.GoodsDetail);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.GoodsCategoryId != null) {
            this.GoodsCategoryId = new Long(source.GoodsCategoryId);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamObj(map, prefix + "GoodsDetail.", this.GoodsDetail);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "GoodsCategoryId", this.GoodsCategoryId);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

