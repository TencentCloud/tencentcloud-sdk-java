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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryLevelDetail extends AbstractModel {

    /**
    * 分级组名称，唯一性约束，最多60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
    */
    @SerializedName("LevelGroupName")
    @Expose
    private String LevelGroupName;

    /**
    * 分级组来源，0为内置，1为自定义
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 分级组描述，最多1024字符
    */
    @SerializedName("LevelGroupDesc")
    @Expose
    private String LevelGroupDesc;

    /**
    * 具体分级标识详情
    */
    @SerializedName("LevelDetail")
    @Expose
    private LevelItem [] LevelDetail;

    /**
    * 引用合规组次数
    */
    @SerializedName("RefComplianceCnt")
    @Expose
    private Long RefComplianceCnt;

    /**
    * 引用合规组
    */
    @SerializedName("RefCompliance")
    @Expose
    private DspaDiscoveryComplianceGroup [] RefCompliance;

    /**
    * 分级组ID
    */
    @SerializedName("LevelGroupId")
    @Expose
    private Long LevelGroupId;

    /**
     * Get 分级组名称，唯一性约束，最多60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复 
     * @return LevelGroupName 分级组名称，唯一性约束，最多60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     */
    public String getLevelGroupName() {
        return this.LevelGroupName;
    }

    /**
     * Set 分级组名称，唯一性约束，最多60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     * @param LevelGroupName 分级组名称，唯一性约束，最多60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     */
    public void setLevelGroupName(String LevelGroupName) {
        this.LevelGroupName = LevelGroupName;
    }

    /**
     * Get 分级组来源，0为内置，1为自定义 
     * @return Source 分级组来源，0为内置，1为自定义
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 分级组来源，0为内置，1为自定义
     * @param Source 分级组来源，0为内置，1为自定义
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 分级组描述，最多1024字符 
     * @return LevelGroupDesc 分级组描述，最多1024字符
     */
    public String getLevelGroupDesc() {
        return this.LevelGroupDesc;
    }

    /**
     * Set 分级组描述，最多1024字符
     * @param LevelGroupDesc 分级组描述，最多1024字符
     */
    public void setLevelGroupDesc(String LevelGroupDesc) {
        this.LevelGroupDesc = LevelGroupDesc;
    }

    /**
     * Get 具体分级标识详情 
     * @return LevelDetail 具体分级标识详情
     */
    public LevelItem [] getLevelDetail() {
        return this.LevelDetail;
    }

    /**
     * Set 具体分级标识详情
     * @param LevelDetail 具体分级标识详情
     */
    public void setLevelDetail(LevelItem [] LevelDetail) {
        this.LevelDetail = LevelDetail;
    }

    /**
     * Get 引用合规组次数 
     * @return RefComplianceCnt 引用合规组次数
     */
    public Long getRefComplianceCnt() {
        return this.RefComplianceCnt;
    }

    /**
     * Set 引用合规组次数
     * @param RefComplianceCnt 引用合规组次数
     */
    public void setRefComplianceCnt(Long RefComplianceCnt) {
        this.RefComplianceCnt = RefComplianceCnt;
    }

    /**
     * Get 引用合规组 
     * @return RefCompliance 引用合规组
     */
    public DspaDiscoveryComplianceGroup [] getRefCompliance() {
        return this.RefCompliance;
    }

    /**
     * Set 引用合规组
     * @param RefCompliance 引用合规组
     */
    public void setRefCompliance(DspaDiscoveryComplianceGroup [] RefCompliance) {
        this.RefCompliance = RefCompliance;
    }

    /**
     * Get 分级组ID 
     * @return LevelGroupId 分级组ID
     */
    public Long getLevelGroupId() {
        return this.LevelGroupId;
    }

    /**
     * Set 分级组ID
     * @param LevelGroupId 分级组ID
     */
    public void setLevelGroupId(Long LevelGroupId) {
        this.LevelGroupId = LevelGroupId;
    }

    public DspaDiscoveryLevelDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryLevelDetail(DspaDiscoveryLevelDetail source) {
        if (source.LevelGroupName != null) {
            this.LevelGroupName = new String(source.LevelGroupName);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.LevelGroupDesc != null) {
            this.LevelGroupDesc = new String(source.LevelGroupDesc);
        }
        if (source.LevelDetail != null) {
            this.LevelDetail = new LevelItem[source.LevelDetail.length];
            for (int i = 0; i < source.LevelDetail.length; i++) {
                this.LevelDetail[i] = new LevelItem(source.LevelDetail[i]);
            }
        }
        if (source.RefComplianceCnt != null) {
            this.RefComplianceCnt = new Long(source.RefComplianceCnt);
        }
        if (source.RefCompliance != null) {
            this.RefCompliance = new DspaDiscoveryComplianceGroup[source.RefCompliance.length];
            for (int i = 0; i < source.RefCompliance.length; i++) {
                this.RefCompliance[i] = new DspaDiscoveryComplianceGroup(source.RefCompliance[i]);
            }
        }
        if (source.LevelGroupId != null) {
            this.LevelGroupId = new Long(source.LevelGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LevelGroupName", this.LevelGroupName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "LevelGroupDesc", this.LevelGroupDesc);
        this.setParamArrayObj(map, prefix + "LevelDetail.", this.LevelDetail);
        this.setParamSimple(map, prefix + "RefComplianceCnt", this.RefComplianceCnt);
        this.setParamArrayObj(map, prefix + "RefCompliance.", this.RefCompliance);
        this.setParamSimple(map, prefix + "LevelGroupId", this.LevelGroupId);

    }
}

