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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GoodNews extends AbstractModel{

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
    private GoodsDetailNew GoodsDetail;

    /**
    * 订单类型ID，用来唯一标识一个业务的一种场景（总共三种场景：新购、配置变更、续费）
高级版: 102375(新购),102376(续费),102377(变配)
企业版 : 102378(新购),102379(续费),102380(变配)
旗舰版 : 102369(新购),102370(续费),102371(变配)
高级版-CLB: 新购 101198  续费 101199 变配 101200
企业版-CLB 101204(新购),101205(续费),101206(变配)
旗舰版-CLB : 101201(新购),101202(续费),101203(变配)

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsCategoryId")
    @Expose
    private Long GoodsCategoryId;

    /**
    * 购买waf实例区域ID
1 表示购买大陆资源
2表示购买非中国大陆资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

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
    public GoodsDetailNew getGoodsDetail() {
        return this.GoodsDetail;
    }

    /**
     * Set 商品明细
     * @param GoodsDetail 商品明细
     */
    public void setGoodsDetail(GoodsDetailNew GoodsDetail) {
        this.GoodsDetail = GoodsDetail;
    }

    /**
     * Get 订单类型ID，用来唯一标识一个业务的一种场景（总共三种场景：新购、配置变更、续费）
高级版: 102375(新购),102376(续费),102377(变配)
企业版 : 102378(新购),102379(续费),102380(变配)
旗舰版 : 102369(新购),102370(续费),102371(变配)
高级版-CLB: 新购 101198  续费 101199 变配 101200
企业版-CLB 101204(新购),101205(续费),101206(变配)
旗舰版-CLB : 101201(新购),101202(续费),101203(变配)

注意：此字段可能返回 null，表示取不到有效值。 
     * @return GoodsCategoryId 订单类型ID，用来唯一标识一个业务的一种场景（总共三种场景：新购、配置变更、续费）
高级版: 102375(新购),102376(续费),102377(变配)
企业版 : 102378(新购),102379(续费),102380(变配)
旗舰版 : 102369(新购),102370(续费),102371(变配)
高级版-CLB: 新购 101198  续费 101199 变配 101200
企业版-CLB 101204(新购),101205(续费),101206(变配)
旗舰版-CLB : 101201(新购),101202(续费),101203(变配)

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGoodsCategoryId() {
        return this.GoodsCategoryId;
    }

    /**
     * Set 订单类型ID，用来唯一标识一个业务的一种场景（总共三种场景：新购、配置变更、续费）
高级版: 102375(新购),102376(续费),102377(变配)
企业版 : 102378(新购),102379(续费),102380(变配)
旗舰版 : 102369(新购),102370(续费),102371(变配)
高级版-CLB: 新购 101198  续费 101199 变配 101200
企业版-CLB 101204(新购),101205(续费),101206(变配)
旗舰版-CLB : 101201(新购),101202(续费),101203(变配)

注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsCategoryId 订单类型ID，用来唯一标识一个业务的一种场景（总共三种场景：新购、配置变更、续费）
高级版: 102375(新购),102376(续费),102377(变配)
企业版 : 102378(新购),102379(续费),102380(变配)
旗舰版 : 102369(新购),102370(续费),102371(变配)
高级版-CLB: 新购 101198  续费 101199 变配 101200
企业版-CLB 101204(新购),101205(续费),101206(变配)
旗舰版-CLB : 101201(新购),101202(续费),101203(变配)

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsCategoryId(Long GoodsCategoryId) {
        this.GoodsCategoryId = GoodsCategoryId;
    }

    /**
     * Get 购买waf实例区域ID
1 表示购买大陆资源
2表示购买非中国大陆资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 购买waf实例区域ID
1 表示购买大陆资源
2表示购买非中国大陆资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 购买waf实例区域ID
1 表示购买大陆资源
2表示购买非中国大陆资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 购买waf实例区域ID
1 表示购买大陆资源
2表示购买非中国大陆资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public GoodNews() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GoodNews(GoodNews source) {
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.GoodsDetail != null) {
            this.GoodsDetail = new GoodsDetailNew(source.GoodsDetail);
        }
        if (source.GoodsCategoryId != null) {
            this.GoodsCategoryId = new Long(source.GoodsCategoryId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamObj(map, prefix + "GoodsDetail.", this.GoodsDetail);
        this.setParamSimple(map, prefix + "GoodsCategoryId", this.GoodsCategoryId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

