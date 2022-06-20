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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCCCSkillGroupRequest extends AbstractModel{

    /**
    * 应用 ID（必填）
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 技能组名称
    */
    @SerializedName("SkillGroupName")
    @Expose
    private String SkillGroupName;

    /**
    * 技能组类型0-电话，1-在线，3-音频，4-视频
    */
    @SerializedName("SkillGroupType")
    @Expose
    private Long SkillGroupType;

    /**
    * 技能组接待人数上限（该技能组中1个座席可接待的人数上限）默认为1。1、若技能组类型为在线，则接待上限可设置为1及以上
2、若技能组类型为电话、音频、视频，则接待上线必须只能为1
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
     * Get 应用 ID（必填） 
     * @return SdkAppId 应用 ID（必填）
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填）
     * @param SdkAppId 应用 ID（必填）
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 技能组名称 
     * @return SkillGroupName 技能组名称
     */
    public String getSkillGroupName() {
        return this.SkillGroupName;
    }

    /**
     * Set 技能组名称
     * @param SkillGroupName 技能组名称
     */
    public void setSkillGroupName(String SkillGroupName) {
        this.SkillGroupName = SkillGroupName;
    }

    /**
     * Get 技能组类型0-电话，1-在线，3-音频，4-视频 
     * @return SkillGroupType 技能组类型0-电话，1-在线，3-音频，4-视频
     */
    public Long getSkillGroupType() {
        return this.SkillGroupType;
    }

    /**
     * Set 技能组类型0-电话，1-在线，3-音频，4-视频
     * @param SkillGroupType 技能组类型0-电话，1-在线，3-音频，4-视频
     */
    public void setSkillGroupType(Long SkillGroupType) {
        this.SkillGroupType = SkillGroupType;
    }

    /**
     * Get 技能组接待人数上限（该技能组中1个座席可接待的人数上限）默认为1。1、若技能组类型为在线，则接待上限可设置为1及以上
2、若技能组类型为电话、音频、视频，则接待上线必须只能为1 
     * @return MaxConcurrency 技能组接待人数上限（该技能组中1个座席可接待的人数上限）默认为1。1、若技能组类型为在线，则接待上限可设置为1及以上
2、若技能组类型为电话、音频、视频，则接待上线必须只能为1
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 技能组接待人数上限（该技能组中1个座席可接待的人数上限）默认为1。1、若技能组类型为在线，则接待上限可设置为1及以上
2、若技能组类型为电话、音频、视频，则接待上线必须只能为1
     * @param MaxConcurrency 技能组接待人数上限（该技能组中1个座席可接待的人数上限）默认为1。1、若技能组类型为在线，则接待上限可设置为1及以上
2、若技能组类型为电话、音频、视频，则接待上线必须只能为1
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    public CreateCCCSkillGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCCCSkillGroupRequest(CreateCCCSkillGroupRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SkillGroupName != null) {
            this.SkillGroupName = new String(source.SkillGroupName);
        }
        if (source.SkillGroupType != null) {
            this.SkillGroupType = new Long(source.SkillGroupType);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SkillGroupName", this.SkillGroupName);
        this.setParamSimple(map, prefix + "SkillGroupType", this.SkillGroupType);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);

    }
}

