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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TraceCode extends AbstractModel {

    /**
    * 二维码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 码包ID
    */
    @SerializedName("PackId")
    @Expose
    private String PackId;

    /**
    * 批次ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 所属商户ID
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 码状态 0: 冻结 1: 激活
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 商户名称
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 渠道商ID
    */
    @SerializedName("AgentId")
    @Expose
    private Long AgentId;

    /**
    * 码层级 0: 最小级, 1: 一级, 2: 二级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 码层级详情
    */
    @SerializedName("PackSpec")
    @Expose
    private PackSpec [] PackSpec;

    /**
    * 场景码
    */
    @SerializedName("SceneCode")
    @Expose
    private Long SceneCode;

    /**
    * 流水码
    */
    @SerializedName("SerialCode")
    @Expose
    private Long SerialCode;

    /**
     * Get 二维码 
     * @return Code 二维码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 二维码
     * @param Code 二维码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 码包ID 
     * @return PackId 码包ID
     */
    public String getPackId() {
        return this.PackId;
    }

    /**
     * Set 码包ID
     * @param PackId 码包ID
     */
    public void setPackId(String PackId) {
        this.PackId = PackId;
    }

    /**
     * Get 批次ID 
     * @return BatchId 批次ID
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次ID
     * @param BatchId 批次ID
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 所属商户ID 
     * @return MerchantId 所属商户ID
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 所属商户ID
     * @param MerchantId 所属商户ID
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 码状态 0: 冻结 1: 激活 
     * @return Status 码状态 0: 冻结 1: 激活
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 码状态 0: 冻结 1: 激活
     * @param Status 码状态 0: 冻结 1: 激活
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return UpdateTime 修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 商户名称 
     * @return MerchantName 商户名称
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 商户名称
     * @param MerchantName 商户名称
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 渠道商ID 
     * @return AgentId 渠道商ID
     */
    public Long getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 渠道商ID
     * @param AgentId 渠道商ID
     */
    public void setAgentId(Long AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 码层级 0: 最小级, 1: 一级, 2: 二级 
     * @return Level 码层级 0: 最小级, 1: 一级, 2: 二级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 码层级 0: 最小级, 1: 一级, 2: 二级
     * @param Level 码层级 0: 最小级, 1: 一级, 2: 二级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 码层级详情 
     * @return PackSpec 码层级详情
     */
    public PackSpec [] getPackSpec() {
        return this.PackSpec;
    }

    /**
     * Set 码层级详情
     * @param PackSpec 码层级详情
     */
    public void setPackSpec(PackSpec [] PackSpec) {
        this.PackSpec = PackSpec;
    }

    /**
     * Get 场景码 
     * @return SceneCode 场景码
     */
    public Long getSceneCode() {
        return this.SceneCode;
    }

    /**
     * Set 场景码
     * @param SceneCode 场景码
     */
    public void setSceneCode(Long SceneCode) {
        this.SceneCode = SceneCode;
    }

    /**
     * Get 流水码 
     * @return SerialCode 流水码
     */
    public Long getSerialCode() {
        return this.SerialCode;
    }

    /**
     * Set 流水码
     * @param SerialCode 流水码
     */
    public void setSerialCode(Long SerialCode) {
        this.SerialCode = SerialCode;
    }

    public TraceCode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TraceCode(TraceCode source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.PackId != null) {
            this.PackId = new String(source.PackId);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.AgentId != null) {
            this.AgentId = new Long(source.AgentId);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.PackSpec != null) {
            this.PackSpec = new PackSpec[source.PackSpec.length];
            for (int i = 0; i < source.PackSpec.length; i++) {
                this.PackSpec[i] = new PackSpec(source.PackSpec[i]);
            }
        }
        if (source.SceneCode != null) {
            this.SceneCode = new Long(source.SceneCode);
        }
        if (source.SerialCode != null) {
            this.SerialCode = new Long(source.SerialCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "PackId", this.PackId);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArrayObj(map, prefix + "PackSpec.", this.PackSpec);
        this.setParamSimple(map, prefix + "SceneCode", this.SceneCode);
        this.setParamSimple(map, prefix + "SerialCode", this.SerialCode);

    }
}

