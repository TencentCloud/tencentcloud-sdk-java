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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsCampaignStatisticsCrowdData extends AbstractModel{

    /**
    * 人群包id
    */
    @SerializedName("CrowdId")
    @Expose
    private Long CrowdId;

    /**
    * 人群包名称
    */
    @SerializedName("CrowdName")
    @Expose
    private String CrowdName;

    /**
    * 人群包目标触达总数
    */
    @SerializedName("CrowdCount")
    @Expose
    private Long CrowdCount;

    /**
    * 模板列表
    */
    @SerializedName("TemplateList")
    @Expose
    private SmsCampaignStatisticsTemplateData [] TemplateList;

    /**
     * Get 人群包id 
     * @return CrowdId 人群包id
     */
    public Long getCrowdId() {
        return this.CrowdId;
    }

    /**
     * Set 人群包id
     * @param CrowdId 人群包id
     */
    public void setCrowdId(Long CrowdId) {
        this.CrowdId = CrowdId;
    }

    /**
     * Get 人群包名称 
     * @return CrowdName 人群包名称
     */
    public String getCrowdName() {
        return this.CrowdName;
    }

    /**
     * Set 人群包名称
     * @param CrowdName 人群包名称
     */
    public void setCrowdName(String CrowdName) {
        this.CrowdName = CrowdName;
    }

    /**
     * Get 人群包目标触达总数 
     * @return CrowdCount 人群包目标触达总数
     */
    public Long getCrowdCount() {
        return this.CrowdCount;
    }

    /**
     * Set 人群包目标触达总数
     * @param CrowdCount 人群包目标触达总数
     */
    public void setCrowdCount(Long CrowdCount) {
        this.CrowdCount = CrowdCount;
    }

    /**
     * Get 模板列表 
     * @return TemplateList 模板列表
     */
    public SmsCampaignStatisticsTemplateData [] getTemplateList() {
        return this.TemplateList;
    }

    /**
     * Set 模板列表
     * @param TemplateList 模板列表
     */
    public void setTemplateList(SmsCampaignStatisticsTemplateData [] TemplateList) {
        this.TemplateList = TemplateList;
    }

    public SmsCampaignStatisticsCrowdData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsCampaignStatisticsCrowdData(SmsCampaignStatisticsCrowdData source) {
        if (source.CrowdId != null) {
            this.CrowdId = new Long(source.CrowdId);
        }
        if (source.CrowdName != null) {
            this.CrowdName = new String(source.CrowdName);
        }
        if (source.CrowdCount != null) {
            this.CrowdCount = new Long(source.CrowdCount);
        }
        if (source.TemplateList != null) {
            this.TemplateList = new SmsCampaignStatisticsTemplateData[source.TemplateList.length];
            for (int i = 0; i < source.TemplateList.length; i++) {
                this.TemplateList[i] = new SmsCampaignStatisticsTemplateData(source.TemplateList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrowdId", this.CrowdId);
        this.setParamSimple(map, prefix + "CrowdName", this.CrowdName);
        this.setParamSimple(map, prefix + "CrowdCount", this.CrowdCount);
        this.setParamArrayObj(map, prefix + "TemplateList.", this.TemplateList);

    }
}

